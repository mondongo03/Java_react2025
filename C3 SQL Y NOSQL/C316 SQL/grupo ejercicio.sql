UPDATE clientes
SET correo = 'nuevo_ana@mail.com'
WHERE dni = '12345678A';

UPDATE productos
SET inventario = '18 unidades'
WHERE num_serie = 2001;

UPDATE facturas_venta
SET fecha = '2024-03-10'
WHERE nfactura = 3001;
-
SELECT * FROM facturas_venta
WHERE dni = '12345678A'
; 
SELECT * FROM productos
WHERE inventario LIKE '1% unidades';

SELECT 
    vc.num_pedido AS Pedido,
    c.nombre AS Cliente,
    p.nombre AS Producto,
    sc.cantidad AS Cantidad
FROM ventas_compras vc
JOIN clientes c ON vc.dni = c.dni
JOIN se_compone sc ON vc.num_pedido = sc.num_pedido
JOIN productos p ON sc.num_serie = p.num_serie
ORDER BY vc.num_pedido;


DELETE FROM facturas_compra
WHERE num_factura = 4005;

DELETE FROM productos
WHERE num_serie = 2005;

DELETE FROM se_compone
WHERE num_serie = 2005;

ON DELETE CASCADE?

DELETE FROM proveedores
WHERE dni = '54321098V';