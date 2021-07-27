import java.awt.Rectangle;
import java.awt.Point;
import java.lang.Math;

public class Funciones_RectanglePoint {

	/** Extender hasta... */

	public static void extenderHasta(Rectangle r, Point p) {
		Rectangle nueva = new Rectangle(0, 0, 0, 0);
		if (estaDentro(p, r)) {
			return;
		}
		Rectangle nuevo = new Rectangle(p.x, p.y, 0, 0);
		nueva = encuadrar(r, nuevo);
		r.x = nueva.x;
		r.y = nueva.y;
		r.height = nueva.height;
		r.width = nueva.width;
		return;
	}

	/** Encuadrar dos rectángulos */

	public static Rectangle encuadrar(Rectangle caja1, Rectangle caja2) {
		Rectangle rec = new Rectangle();
		rec.x = Math.min(caja1.x, caja2.x);
		rec.y = Math.min(caja1.y, caja2.y);
		rec.width = Math.max(caja1.x + caja1.width, caja2.x + caja2.width) - rec.x;
		rec.height = Math.max(caja1.y + caja1.height, caja2.y + caja2.height) - rec.y;
		return rec;
	}

	/** Calcula el centro de un rectángulo */

	public static Point calcularCentro(Rectangle caja) {
		int x = caja.x + caja.width / 2;
		int y = caja.y + caja.height / 2;
		Point centro = new Point(x, y);
		return centro;
	}

	/** Calcula la distancia entre 2 puntos */

	public static double distancia(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + (Math.pow(p1.y - p2.y, 2)));
	}

	/** Calcula la diagonal de un rectángulo */

	public static double diagonal(Rectangle caja) {
		Point p1 = new Point(caja.x, caja.y);
		Point p2 = new Point(caja.x + caja.width, caja.y + caja.height);
		return distancia(p1, p2);
	}

	/** Verifica si un punto esta dentro de un rectángulo */

	public static boolean estaDentro(Point punto, Rectangle caja) {
		return (punto.x <= caja.x + caja.width && punto.x >= caja.x && punto.y >= caja.y
				&& punto.y <= caja.y + caja.height);
	}

	/** Calcula el punto medio entre 2 puntos */

	public static Point puntoMedio(Point p1, Point p2) {
		return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
	}

	/** Calcula el rectangulo que intercepta los rectángulos */

	public static Rectangle interseccion(Rectangle caja1, Rectangle caja2) {
		Rectangle rec = new Rectangle();
		rec.x = Math.max(caja1.x, caja2.x);
		rec.y = Math.max(caja1.y, caja2.y);
		rec.width = Math.min(caja1.x + caja1.width, caja2.x + caja2.width) - rec.x;
		rec.height = Math.min(caja1.y + caja1.height, caja2.y + caja2.height) - rec.y;

		if (rec.width <= 0 || rec.height <= 0) {
			rec = null;
		}
		return rec;
	}

/////////////////////////////////////// M A I N ///////////////////////////////////////

	public static void main(String[] args) {

		System.out.println();
	}

} // Cierre del Programa
