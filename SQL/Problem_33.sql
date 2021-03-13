SELECT salary * months AS earnings, COUNT(months*salary)
FROM Employee
GROUP BY earnings
ORDER BY earnings DESC
LIMIT 1;
