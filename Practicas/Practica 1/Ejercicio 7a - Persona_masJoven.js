/** Determina la persona más joven dentro de un arreglo de objetos tipo Persona */

public static Persona masJovenGrupo(Persona[] arreglo) {
  Persona masjoven= arreglo[0];
  for (int i=1; i<arreglo.length;i++) {
    if (arreglo[i].getEdad()> masjoven.getEdad()) {
      masjoven =arreglo[i];
    }
  }
  return masjoven;
}
