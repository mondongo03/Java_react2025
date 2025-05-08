1. SELECT Nombre FROM fabricantes;
2. SELECT Nombre, precio FROM articulos;
3. SELECT precio FROM articulos WHERE precio <= 200;
4. SELECT precio FROM articulos WHERE precio BETWEEN 60 AND 120;
5. SELECT precio * 166 FROM articulos;
6. SELECT AVG(precio) AS promedio_precio FROM articulos;
7. SELECT AVG(precio) AS promedio_precio FROM articulos WHERE codigoFabricante = 2;
8. SELECT precio FROM articulos WHERE precio >= 180;
9. SELECT precio FROM articulos WHERE precio >= 180 ORDER BY precio ASC, nombre ASC;
10. SELECT * FROM articulos;
11. SELECT articulos.nombre, articulos.precio, fabricantes.nombre FROM articulos
JOIN fabricantes ON articulos.codigoFabricante = fabricantes.codigo;
12. SELECT AVG(precio), codigoFabricante FROM articulos;
13.
14.
15. SELECT MIN(precio) FROM articulos;
16.
17. INSERT INTO articulos (codigo, nombre, precio, codigoFabricante)
VALUES (111, 'Altavoces', 70, 2);
18. UPDATE articulos
SET nombre = 'Impresora'
WHERE codigo = 108;
19. SELECT precio*0.90 AS precioReducido FROM articulos;
20. SELECT precio*0.90 FROM articulos WHERE precio >= 120;