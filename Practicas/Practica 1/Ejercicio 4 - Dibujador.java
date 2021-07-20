/** Realiza un patrón de circulos */

public static void dibujarCirculos(Dibujador dib, int x, int y, int r) {
  if (r <= 10) {
    return;
  }
  Circulo c = new Circulo(x, y, r);
  dib.dibujar(c);
  dibujarCirculos(dib, x + r, y, r / 2);
  dibujarCirculos(dib, x + r, y, r / 2);
  dibujarCirculos(dib, x, y - r, r / 2);
  dibujarCirculos(dib, x, y - r, r / 2);
}
