
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Imagen {
	Pixel[][] pixels;
	int alto;
	int ancho;

	Imagen(String archivo) {
		File file = new File(archivo);
		try {
			BufferedImage image = ImageIO.read(file);
			ancho = image.getWidth(); // Alto
			alto = image.getHeight(); // Ancho
			pixels = new Pixel[alto][ancho]; // Constructor de una matriz de pixels (un array)
			for (int i = 0; i < alto; i++) {
				for (int j = 0; j < ancho; j++) {
					pixels[i][j] = new Pixel(image.getRGB(j, i)); // Terna de valores (un pixel = un color)
				}
			}
		} catch (IOException e) {
			System.err.println("No se encontró el archivo " + archivo);
			System.exit(0);
		}
	}

	/**
	 * Guarda la imagen en un archivo según el formato indicado
	 *
	 * @param archivo El nombre de archivo, e.g., "lena.bmp"
	 * @param formato El formato de imagen: "bmp", "png", "jpg", etc.
	 */
	void guardar(String archivo, String formato) {
		BufferedImage image = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++)
				image.setRGB(j, i, pixels[i][j].aInt());
		}

		try {
			ImageIO.write(image, formato, new File(archivo));
		} catch (IOException e) {
			System.err.println("Error al guardar en el archivo " + archivo);
			e.printStackTrace();
		}
	}

	// METODOS DE INSTANCIA

	/** Enrojece la imagen */

	public void enrojecer(int cant) {
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				pixels[i][j].rojo += cant;
				if (this.pixels[i][j].rojo > 255) {
					pixels[i][j].rojo = 255;
				}
			}
		}
	}

	/** Aumenta el brillo de la imagen */

	public void aumentarBrillo(int cant) {
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				pixels[i][j].rojo += cant;
				pixels[i][j].azul += cant;
				pixels[i][j].verde += cant;

				if (this.pixels[i][j].rojo > 255) {
					pixels[i][j].rojo = 255;
				}
				if (this.pixels[i][j].azul > 255) {
					pixels[i][j].azul = 255;
				}
				if (this.pixels[i][j].verde > 255) {
					pixels[i][j].verde = 255;
				}
				if (this.pixels[i][j].rojo < 0) {
					pixels[i][j].rojo = 0;
				}
				if (this.pixels[i][j].azul < 0) {
					pixels[i][j].azul = 0;
				}
				if (this.pixels[i][j].verde < 0) {
					pixels[i][j].verde = 0;
				}
			}
		}
	}

	/** Transforma la imagen en blanco y negro */

	public void aGrises() {
		double aux = 0;
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				aux = 0.3 * pixels[i][j].rojo + 0.6 * pixels[i][j].verde + 0.1 * pixels[i][j].azul;
				pixels[i][j].rojo = (int) aux;
				pixels[i][j].azul = (int) aux;
				pixels[i][j].verde = (int) aux;
			}
		}
	}

	/** Invierte a negativo una imagen */

	public void invertir() {
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				pixels[i][j].rojo = pixels[i][j].rojo * (-1);
				pixels[i][j].azul = pixels[i][j].azul * (-1);
				pixels[i][j].verde = pixels[i][j].verde * (-1);
			}
		}
	}

	/** Transforma la imagen y la espeja */

	void espejar() {
		Pixel[][] pixel2 = new Pixel[alto][ancho];
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				pixel2[i][j] = pixels[i][alto - 1 - j];
			}
		}
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				pixels[i][j] = pixel2[i][j];
			}
		}
	}

	/** Gira la imagen hacia la derecha */

	void girarDerecha() {
		Pixel[][] pixel2 = new Pixel[ancho][alto];
		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				pixel2[i][j] = pixels[j][i];
			}
		}
		int aux = this.alto;
		this.alto=this.ancho;
		this.ancho=aux;

		this.pixels= new Pixel[alto][ancho];

		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				pixels[i][j] = pixel2[i][j];
			}
		}
	}

} // Cierre total del programa
