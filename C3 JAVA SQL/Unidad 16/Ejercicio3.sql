1. SELECT * FROM almacenes;
2. SELECT * FROM cajas WHERE valor > 150;
3. SELECT contenido FROM cajas;
4. SELECT AVG(valor) FROM cajas;
5. SELECT almacen, AVG(valor) AS 'Valor medio' FROM cajas GROUP BY almacen;
6. SELECT almacen, AVG(valor) FROM cajas GROUP BY almacen HAVING AVG(valor) > 150;
7. SELECT num_referencia, a.lugar FROM cajas 
INNER JOIN almacenes a ON num_referencia = id_almacenes;
8. SELECT almacen, COUNT(almacen) AS 'Numero de cajas' FROM cajas GROUP BY almacen;
9. SELECT id_almacenes, capacidad, COUNT(almacen) 
FROM almacenes 
INNER JOIN cajas ON id_almacenes=almacen 
GROUP BY id_almacenes, capacidad 
HAVING COUNT(almacen)>capacidad;
10. SELECT num_referencia FROM cajas WHERE almacen = 
(SELECT id_almacenes FROM almacenes WHERE lugar = 'Cadiz');
11. INSERT INTO almacenes (codigo, lugar, capacidad) VALUES
(22, 'Barcelona', 3);
12. INSERT INTO cajas (numReferencia, contenido, valor, codigoAlmacen) VALUES
('H5RT', 'papel', 200, 22);
13. SELECT valor*0.85 AS VALOR_REDUCIDO FROM cajas;
14. UPDATE cajas SET valor = valor * 0.80 WHERE valor > (SELECT AVG(valor) FROM cajas);
15. DELETE FROM cajas WHERE valor < 100;
16. DELETE FROM cajas
WHERE almacen IN (SELECT id_almacenes FROM almacenes
INNER JOIN cajas ON id_almacenes = almacen
GROUP BY id_almacenes, capacidad
HAVING COUNT(almacen) > capacidad);

DELETE FROM cajas WHERE almacen IN 
(SELECT id_almacenes FROM almacenes WHERE capacidad < 
(SELECT COUNT(*) FROM cajas WHERE almacen=id_almacenes));

--SELECT valor*0.80 AS PRECIO_REDUCIDO FROM cajas WHERE valor > AVG(valor);