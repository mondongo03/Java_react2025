SELECT Nombre FROM fabricantes;
SELECT Nombre, precio FROM articulos;
SELECT precio FROM articulos WHERE precio <= 200;
SELECT precio FROM articulos WHERE precio BETWEEN 60 AND 120;
SELECT precio * 166 FROM articulos;
SELECT AVG(precio) AS promedio_precio FROM articulos;
