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
11. SELECT e.nombre AS 'Nombre', apellidos AS 'Apellidos', 
d.nombre AS 'Departamento', d.presupuesto AS 'Presupuesto' FROM empleados e
INNER JOIN departamentos d ON departamento=id_departamento;
12. SELECT e.nombre AS 'Nombre', apellidos AS 'Apellidos', presupuesto AS 'Presupuesto'FROM empleados e 
INNER JOIN departamentos ON departamento=id_departamento
WHERE presupuesto > 60000;
13. SELECT MAX(presupuesto) FROM departamentos;
14. SELECT d.nombre AS 'Departamentos con mas de dos empleados' FROM departamentos d
INNER JOIN empleados ON departamento=id_departamento
WHERE (SELECT COUNT(departamento) FROM empleados)
GROUP BY d.nombre HAVING COUNT(departamento) > 2;
15. INSERT INTO departamentos(id_departamento, nombre, presupuesto) VALUES
(11, 'Calidad', 33333);
INSERT INTO empleados(dni, nombre, apellidos, departamento) VALUES
('72728421', 'Juan', 'Rodriguez', 11);
16. SELECT presupuesto*0.90 AS RECORTE FROM departamentos;
17. UPDATE empleados SET departamento=14
WHERE departamento = 77;
18. DELETE * FROM empleados WHERE departamento = 14;
19. DELETE FROM empleados WHERE departamento IN 
(SELECT id_departamento FROM departamentos WHERE presupuesto > 60000);
20. DELETE FROM empleados;