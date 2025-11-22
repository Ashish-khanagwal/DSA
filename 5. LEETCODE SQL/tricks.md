# Universal 3-Step SQL Framework

This framework helps you solve 70–80% of SQL problems involving:  
_first/last_, _earliest/latest_, _minimum/maximum_, _top 1 per group_, and all  
"find the first sale", "highest salary per department",  
"most recent transaction", "earliest login", etc.

---

# 🔶 Step 1 — Identify the Grouping Column

This is the column that appears **once per output row**.  
Examples:

- Per product → `product_id`
- Per employee → `employee_id`
- Per department → `department_id`
- Per user → `user_id`

For LeetCode 1070:  
We are finding the first sale **per product**, so the group column is:

```
product_id

```

---

# 🔶 Step 2 — Compute the Aggregate (MIN, MAX, etc.) per Group

If the question asks for:

- _earliest year_ → `MIN(year)`
- _latest year_ → `MAX(year)`
- _highest salary_ → `MAX(salary)`
- _first login_ → `MIN(timestamp)`
- _lowest price_ → `MIN(price)`

Then write:

```sql
SELECT product_id, MIN(year) AS first_year
FROM Sales
GROUP BY product_id;
```

- This gives one row per product with its

# 🔶 Step 3 — JOIN the Aggregated Result Back to the Main Table

The aggregate query does not contain columns like quantity, price, employee name, etc.
So we must join it back to the main table to return the full rows.

The pattern is always:

```sql
SELECT full.*
FROM full_table full
JOIN agg_table agg
  ON full.group_col = agg.group_col
 AND full.value_col = agg.agg_value;
```

### For LeetCode 1070:

```sql
SELECT
    s.product_id,
    t.first_year,
    s.quantity,
    s.price
FROM Sales s
JOIN (
    SELECT product_id, MIN(year) AS first_year
    FROM Sales
    GROUP BY product_id
) t
  ON s.product_id = t.product_id
 AND s.year = t.first_year;
```

### The JOIN conditions always follow two rules:

- Match the grouping column
- Match the MIN/MAX value

# 🎯 Why This Framework Always Works

A `GROUP BY` query removes all non-aggregated columns.
So you:

- Compute the MIN/MAX/first/last per group
- JOIN to the main table
- Retrieve the matching full rows

This pattern solves most medium SQL problems.

# 🎁 Quick Example

“Find employees with the highest salary in each department.”

```sql
SELECT e.*
FROM Employee e
JOIN (
    SELECT department_id, MAX(salary) AS max_salary
    FROM Employee
    GROUP BY department_id
) t
  ON e.department_id = t.department_id
 AND e.salary = t.max_salary;
```

- Same steps: Group → Aggregate → Join.
