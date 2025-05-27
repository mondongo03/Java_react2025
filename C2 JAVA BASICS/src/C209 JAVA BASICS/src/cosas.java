CREATE TABLE clientes(
    dni VARCHAR(20) PRIMARY KEY,
    correo VARCHAR(40),
    nombre VARCHAR(10)
);

CREATE TABLE facturas_venta(
	    nfactura INT PRIMARY KEY,
	    dni VARCHAR(20),
	    fecha DATE,
	    FOREIGN KEY(dni) REFERENCES clientes(dni)
);

