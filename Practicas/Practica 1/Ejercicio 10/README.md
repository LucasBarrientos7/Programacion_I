# Practica-1-Ejercicio-de-Objetos--Universidad-Prog-I

Los arreglos inscriptos y calificaciones de una Comision tienen el mismo tama˜no y el valor de
calificaciones[i] indica la calificaci´on obteinda por el estudiante inscriptos[i]. Para la clase UNGS:

a) Escribir un m´etodo boolean cursaCon(Estudiante e, Docente d) que indica si el estudiante e cursa
en alguna comisi´on con el docente d.

b) Escribir un m´etodo boolean suficientesDocentes() que indica si todas las comisiones tienen al
menos un docente por cada 20 inscriptos.

c) Escribir un m´etodo LinkedList<Estudiante> losMejores() que devuelve una lista con los estudiantes 
que obtuvieron la mejor nota en cada comisi´on. Si en alg´un curso hay m´as de un estudiante 
con la mejor nota, se deben incluir en la lista a todos ellos.
  
d) Escribir un m´etodo LinkedList<Estudiante> alumnosDe(Docente d) que devuelve una lista con
todos los alumnos del docente dado, es decir, con todos los estudiantes que cursen una comisi´on
que dicte el docente. La lista devuelta no debe tener estudiantes repetidos.
  
e) Escribir un m´etodo LinkedList<String> unicaComision() que devuelve una lista con los nombres
de todas las materias que tienen una ´unica comisi´on. La lista devuelta no debe tener materias
repetidas.
  
f) Escribir un m´etodo Estudiante elMasEstudioso() que devuelve el estudiante que haya aprobado
la mayor cantidad de cursos (consideramos que para aprobar un curso se requiere una calificaci´on
de al menos 4). En caso de haber m´as de un estudiante con la mayor cantidad de cursos aprobados
se puede devolver cualquiera de ellos.
