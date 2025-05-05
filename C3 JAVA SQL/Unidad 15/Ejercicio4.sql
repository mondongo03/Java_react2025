INSERT INTO cajero (codigo, nomApels) VALUES
(1, 'Ana Torres'),
(2, 'Luis Martínez'),
(3, 'Clara Gómez'),
(4, 'Jorge Ramírez'),
(5, 'Lucía Fernández'),
(6, 'Pedro Ruiz'),
(7, 'Marta Díaz'),
(8, 'Sofía Navarro'),
(9, 'Daniel Morales'),
(10, 'Raúl Sánchez');

INSERT INTO productos (codigo, nombre, precio) VALUES
(101, 'Pan', 1),
(102, 'Leche', 2),
(103, 'Huevos', 3),
(104, 'Café', 5),
(105, 'Azúcar', 2),
(106, 'Arroz', 4),
(107, 'Aceite', 6),
(108, 'Galletas', 3),
(109, 'Jugo', 2),
(110, 'Chocolate', 4);

INSERT INTO maquinas_registradoras (codigo, piso) VALUES
(201, 1),
(202, 1),
(203, 2),
(204, 2),
(205, 3),
(206, 3),
(207, 1),
(208, 2),
(209, 3),
(210, 1);

INSERT INTO venta (cajero, maquina, producto) VALUES
(1, 201, 101),
(2, 202, 102),
(3, 203, 103),
(4, 204, 104),
(5, 205, 105),
(6, 206, 106),
(7, 207, 107),
(8, 208, 108),
(9, 209, 109),
(10, 210, 110),
(1, 201, 102),
(2, 202, 103),
(3, 203, 104),
(4, 204, 105),
(5, 205, 106);
