CREATE TABLE estacion (
    identificador INT(11),
    latitud VARCHAR(11),
    longitud VARCHAR(11),
    altitud INT(11),
    PRIMARY KEY (identificador)
);

CREATE TABLE muestra (
    identificadorMuestra INT(11),
    fecha DATE,
    temperatura_min INT(11),
    temperatura_max INT(11),
    precipitaciones INT(11),
    humedad_min INT(11),
    humedad_max INT(11),
    velocidad_viento_min INT(11),
    velocidad_viento_max INT(11),
    FOREIGN KEY (identificadorMuestra) REFERENCES estacion(identificador)
);