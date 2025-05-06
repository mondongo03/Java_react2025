1. SELECT * FROM almacenes;
2. SELECT * FROM cajas WHERE valor > 150;
3. SELECT contenido FROM cajas;
4. SELECT AVG(valor) FROM cajas;
5.
6.
7.
8.
9.
10.
11. INSERT INTO almacenes (codigo, lugar, capacidad) VALUES
(22, 'Barcelona', 3);
12. INSERT INTO cajas (numReferencia, contenido, valor, codigoAlmacen) VALUES
('H5RT', 'papel', 200, 22);
13. SELECT valor*0.85 AS VALOR_REDUCIDO FROM cajas;
14. UPDATE cajas SET valor = valor * 0.80 WHERE valor > (SELECT AVG(valor) FROM cajas);
15. DELETE FROM cajas WHERE valor < 100;
16.

--SELECT valor*0.80 AS PRECIO_REDUCIDO FROM cajas WHERE valor > AVG(valor);