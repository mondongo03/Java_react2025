1. SELECT apellidos FROM empleados;
2. SELECT DISTINCT Apellidos FROM Empleados;
3. SELECT apellidos FROM empleados WHERE apellidos = 'lopez';
4. SELECT apellidos FROM empleados WHERE apellidos = 'lopez' AND 'Perez';
5. SELECT nombre, apellidos, dni FROM empleados WHERE codigoDepartamento = 14;
6. SELECT nombre, apellidos, dni FROM empleados WHERE codigoDepartamento = 37 AND 77;
7. SELECT apellidos FROM empleados WHERE apellidos LIKE 'P';
8. SELECT SUM(presupuesto) AS TOTAL FROM departamentos;
9. SELECT COUNT(nombre) FROM empleados;
10. SELECT nombre, apellidos, dni, codigoDepartamento FROM empleados;
11.
12.
13. SELECT MAX(presupuesto) FROM departamentos;
14.
15.
16. SELECT presupuesto*0.90 AS RECORTE FROM departamentos;
17.
18.
19.
20. DELETE FROM empleados;