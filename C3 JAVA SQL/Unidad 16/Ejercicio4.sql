1. SELECT nombre FROM peliculas;
2. SELECT calificacionEdad FROM peliculas;
3. SELECT calificacionEdad FROM peliculas WHERE NULL;
4. SELECT * FROM salas WHERE NULL;
5. SELECT id_sala, s.nombre, pelicula, p.nombre, calificacion_edad FROM salas s INNER JOIN peliculas p ON id_pelicula=pelicula;
6. SELECT p.nombre, calificacion_edad, id_sala, s.nombre 
FROM peliculas p 
INNER JOIN salas s 
ON id_pelicula=pelicula;
7. SELECT p.nombre FROM peliculas p LEFT JOIN salas s ON p.id_pelicula=s.pelicula WHERE s.pelicula IS NULL;
8. INSERT INTO peliculas (codigo, nombre, calificacionEdad) VALUES
(50, 'Uno, dos, tres', 7);
9. UPDATE peliculas SET calificacion_edad=13 WHERE calificacion_edad IS NULL;
10. DELETE FROM salas WHERE pelicula IN (SELECT id_pelicula FROM peliculas WHERE calificacion_edad=3);