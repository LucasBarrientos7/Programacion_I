# Programacion-I---Practica-1
Ejercicios del 1-5 y del 7-8

Ejercicio 1 F
Teniendo en cuenta la siguiente clase en Java
public class Fraccion
{
int numerador;
int denominador;
};
a) Escribir el constructor Fraccion(int numerador, int denominador)
b) Escribir el m´etodo de instancia void imprimir() que imprime en pantalla la fracci´on en alg´un
formato c´omodo. Crear en un main una Fraccion e imprimirla con este m´etodo.
c) Escribir el m´etodo de instancia void invertirSigno() que invierte el signo del n´umero: si era
negativo pasa a ser positivo y viceversa.
d) Escribir el m´etodo de instancia void invertir() que invierte el numerador y el denominador de
la fracci´on. Ej. invertir(1/2) = 2/1.
e) Escribir el m´etodo de instancia double aDouble() que convierte el n´umero racional en un double
(n´umero de punto flotante) y devuelve el resultado.
f) Escribir el m´etodo de instancia void reducir() que reduce el n´umero racional a sus t´erminos m´as
chicos. Para esto buscar el MCD del numerador y el denominador y luego dividir numerador y
denominador por su MCD. Usar la funci´on ya programada de la pr´actica anterior.
g) Escribir el m´etodo de clase static Fraccion producto(Fraccion q1, Fraccion q2) que calcula el
producto entre dos fracciones en nuevo objeto Fraccion. Este debe estar reducido a su m´ınima ´
expresi´on, de modo que el numerador y el denominador no tengan un divisor com´un mayor a 1.
¿Por qu´e en este caso hace falta la palabra clave static?
h) Escribir el m´etodo de clase static Fraccion suma(Fraccion q1, Fraccion q2) que calcula la suma
de dos fracciones en un nuevo objeto Fraccion. Este debe debe estar reducido a su m´ınima ´
expresi´on.


Ejercicio 2 F
Teniendo en cuenta la siguiente clase en Java
public class Punto
{
double x;
double y;
};
a) Escribir el constructor Punto() que inicializa las dos coordenadas a 0.
b) Escribir el constructor Punto(double x, double y)
c) Escribir el m´etodo void imprimir() que muestra por consola los valores del punto.
d) Escribir el m´etodo de instancia void desplazar(double desp_x, double desp_y) que desplace el
punto tanto como lo indiquen los par´ametros recibidos.
e) Escribir el m´etodo de clase static double distancia(Punto p1, Punto p2) que devuelve la distancia
entre los dos puntos.


Ejercicio 3 F
La siguiente clase en Java describe a un c´ırculo en un plano (representado mediante su radio y
las coordenadas de su centro):
public class Circulo
{
double radio;
Punto centro;
};
Adem´as de la clase Circulo, pueden encontrar dentro del proyecto que se encuentra en la p´agina
de la materia la clase Dibujador. Los objetos de esta ´ultima permiten dibujar c´ırculos en la pantalla
mediante el m´etodo dibujar(Circulo c). Para ello es necesario construir un Dibujador e invocar
sobre ´este el m´etodo mencionado. Por ejemplo:
Dibujador dib = new Dibujador();
Circulo circ1 = new Circulo(100, 200, 80); // Ver constructor m´as abajo
Circulo circ2 = new Circulo(500, 400, 120); // Ver constructor m´as abajo
dibujador.dib(circ1);
dibujador.dib(circ2);
a) Escribir el constructor Circulo(double centro_x, double centro_y, double radio).
b) Escribir el m´etodo void imprimir() que muestra por consola los valores del c´ırculo.
c) Escribir los m´etodos de instancia double perimetro() y double superficie() que devuelven el
per´ımetro y la superficie del c´ırculo, respectivamente.
d) Escribir el m´etodo de instancia void escalar(double factor) que modifique el radio del c´ırculo
en un factor de escala pasado como par´ametro.
e) Escribir el m´etodo de instancia void desplazar(double desp_x, double desp_y) que desplace el
centro del c´ırculo tanto como lo indiquen los par´ametros recibidos.
f) Escribir el m´etodo de clase static double distancia(Circulo c1, Circulo c2) que calcula y devuelve la distancia entre los puntos m´as cercanos de los c´ırculos. Por ejemplo, un c´ırculo con centro
(0, 0) y radio 1 tiene distancia 1 de otro de centro (3, 0) y radio 1. Observaci´on: notar que la
distancia no puede ser un valor negativo, es decir, si los c´ırculos se solapan, entonces la distancia
entre ellos es cero.
g) Escribir el m´etodo de clase static boolean seTocan(Circulo c1, Circulo c2) que devuelva verdadero si las ´areas de los c´ırculos pasados como par´ametro se solapan y falso si no.
h) Escribir el m´etodo de instancia boolean loContiene(Circulo otro) que devuelva verdadero si toda
la superficie del c´ırculo pasado como par´ametro est´a contenida en la superficie del argumento
impl´ıcito y falso en caso contrario.


Ejercicio 4
Los fractales son dibujos que pueden crearse de forma recursiva. Mediante una funci´on recursiva
que dibuja figuras b´asicas y se llama recursivamente para dibujar figuras m´as peque˜nas es posible
lograr figuras muy complejas, muy dif´ıciles de lograr sin recursividad.
a) Escribir un m´etodo static void dibujarCirculos(Dibujador dib, int x, int y, int r) que dibuje un
c´ırculo de radio r en el punto (x,y) del dibujador pasado como par´ametro y luego se llame
recursivamente para dibujar dos c´ırculos de la mitad del radio a izquierda y a derecha del punto
(x,y), a una distancia de r. Cuando r sea m´as chico que 10, el m´etodo debe retornar sin dibujar
nada, este ser´ıa su caso base.
b) Modificar el m´etodo anterior para que cada llamado dibuje adem´as dos c´ırculos en los extremos
superior e inferior del c´ırculo original.


Ejercicio 5 F
Teniendo en cuenta la siguiente clase de Java
public class Persona
{
String nombre;
int edad;
};
a) Escribir el constructor Persona(String nombre, int edad).
b) Escribir el m´etodo de instancia boolean masJovenQue(Persona otro) que indica si la instancia es
una persona m´as joven que la persona pasada como par´ametro.
c) Escribir el m´etodo de instancia boolean tocayo(Persona otro) que indica si la instancia y la
persona pasada como par´ametro tienen el mismo nombre.
d) Escribir el m´etodo de instancia boolean mismaPersona(Persona otro) que compare el nombre y
la edad de ambas personas para determinar si son la misma persona.
e) Pensar qu´e ocurre si se agrega la variable de instancia int DNI con el m´etodo del punto anterior
para tener en cuenta este nuevo dato. ¿Ser´ıa correcto que el m´etodo s´olo compare los DNI de
las personas sin importar el nombre y la edad? ¿En qu´e contexto podr´ıa ser v´alido tal m´etodo?


Ejercicio 6
Escribir en la clase Arreglos, los siguientes m´etodos de clase:
a) static boolean esSinRepetidos(int[] arr) que toma un arreglo de 0 o m´as elementos y devuelve
true si el arreglo no contiene elementos repetidos.
b) static int[] pegar(int[] arr, int[] arr2) que toma dos arreglos de 0 o m´as elementos y devuelve un nuevo arreglo que es el resultado de concatenar los dos arreglos. Por ejemplo,
(pegar([1,2,3],[4,5,6])) devuelve el arreglo [1,2,3,4,5,6].
c) static int[] agregarAlFinal(int[] arr, int elem) que toma un arreglo de 0 o m´as elementos y un
elemento y devuelve un nuevo arreglo que es igual al pasado por par´ametro, salvo que al final,
se le agreg´o elem.
d) static int[] sinRepetidos(int[] arr) que devuelve un nuevo arreglo con los mismos elementos que
ten´ıa el par´ametro, pero sin repeticiones de elementos.
e) static void invertir(int[] arr) que modifica los elementos del arreglo pasado por par´ametro de
modo que queden al rev´es de como estaban originalmente.


Ejercicio 7
Expandir la clase Persona del ejercicio 5, con los siguientes m´etodos:
a) Escribir el m´etodo de clase static Persona masJoven(Persona[] grupo) que devuelve la persona m´as
joven de un arreglo de Personas.
b) Escribir el m´etodo de clase static Persona buscar(Persona[] grupo, String nombre) que devuelve la
persona cuyo nombre coincide con el par´ametro. Si hay m´as de una, se puede devolver cualquiera
de ellas.


Ejercicio 8 F
Las imagenes se codifican en la computadora como una matriz de p´ıxeles, donde cada p´ıxel es
un punto de un determinado color y est´a representado por 3 n´umeros: un entero para el color rojo,
un entero para el color verde, y un entero para el color azul. Esos 3 n´umeros van del 0 al 255 y
es an´alogo a lo que hace el pintor en su paleta cuando mezcla colores: decide cu´anto de cada color
va a poner para formar un nuevo color. Este sistema se conoce como RGB, de las siglas en ingl´es
para los 3 colores (Red, Green, Blue). Es as´ı como, por ejemplo, el color negro se codifica con el
valor (0, 0, 0), el blanco con (255, 255, 255), el rojo con (255, 0, 0), el amarillo con (255, 255, 0), etc.
La clase Imagen provee tambi´en un constructor que toma un String donde se especifica un
nombre de archivo. Este puede ser simplemente el nombre de un archivo ubicado en el mismo
directorio del proyecto (ej. ‘‘lena.bmp’’), o bien, uno guardado en otra ubicaci´on del disco r´ıgido.
Sin embargo, para ello, debe escribirse en forma de una ruta absoluta. Para escribir rutas absolutas
se deben utilizar los caracteres ‘/’ para separar directorios, en lugar de los cl´asicos ‘\’ de Windows
(ej. ‘‘C:/Documents And Settings/Usuario/Documentos/imagen.jpg’’). Por ´ultimo se provee
el m´etodo void Dibujador.dibujar(Imagen img) que dada una Imagen la muestra por pantalla.
a) Probar en un main cargar una imagen y mostrarla por pantalla. S´olo hace faltan dos pasos para
ello: construir una Imagen a partir de un nombre de archivo y llamar a Dibujador.dibujar(...)
para mostrarla.
b) Escribir en la clase Imagen, el m´etodo de instancia void enrojecer(int cant) que incrementa el
valor de rojo de cada pixel en cant. ATENCION: ¡el valor de rojo no se puede pasar de 255!
c) Escribir en la clase Imagen, el m´etodo de instancia void aumentarBrillo(int cant) que incrementa
el valor de los 3 colores de cada pixel en cant. ¡Atenci´on a no pasarse de 255!
d) Los grises en RGB son todos aquellos valores que tienen las tres componentes (rojo, verde y
azul) iguales. Para pasar una imagen color a escala de grises, se deben establecer los tres colores
al valor 0,3 × r + 0,6 × v + 0,1 × a, donde r es la cantidad de rojo, v la cantidad de verde y
a la cantidad de azul. Escribir el m´etodo de instancia void aGrises() que convierte la imagen a
escala de grises.
e) Escribir el m´etodo de instancia void invertir() que, a cada color, le pone el valor 255 −c, donde
c es el valor que ten´ıa antes.
f) Escribir el m´etodo de instancia void espejar() que pone los p´ıxeles que estaban a la derecha a
la izquierda, y viceversa, los que estaban a la izquierda ahora pasan a la derecha.
g) Escribir el m´etodo de instancia void girarDerecha() que rota la imagen 90◦ a la derecha. Notar
que el alto es ahora el ancho y el ancho es ahora el alto. Pista: crear una nueva matriz.


Ejercicio 9
Teniendo en cuenta la siguiente clase de Java
public class Agenda
{
Persona[] contactos;
String[] telefonos;
};
a) Escribir el constuctor Agenda(int tamanio) que inicializa contactos y telefonos con arreglos
del tama˜no dado.
b) Escribir el m´etodo de instancia void guardar(Persona contacto, String telefono) que guarda los
datos del contacto en la primera posici´on libre2 que encuentre en los arreglos. Se supone que si
una posici´on est´a libre en un arreglo, tambi´en lo estar´a en el otro. Si no hay una posici´on libre,
se deber´an redimensionar los arreglos.
c) Escribir el m´etodo de instancia void eliminar(Persona contacto) que elimina de la agenda los
datos del contacto. Debe eliminar tanto a la persona como a su n´umero de tel´efono. Usar el
m´etodo mismaPersona del ejercicio 5. Si el contacto no aparece en la agenda, el m´etodo no hace
nada.


