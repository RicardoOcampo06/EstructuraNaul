public class App {
    public static void main(String[] args) throws Exception {
      materiasLista lista = new materiasLista();
      lista.agregarMateria("Matematicas");
      lista.agregarMateria("Historia");
      lista.agregarMateria("Geografia");
      lista.agregarMateria("Español");
      lista.agregarMateria("Ingles");

      lista.imprimir();
       
      String buscarMateria = "Ingles";
      System.out.println("Busqueda " + buscarMateria);

      if (lista.contiene(buscarMateria)) {
        System.out.println("La materia ha sido encontrada");
        }
        else{
            System.out.println("La materia no ha sido encontrada");
        }
    }
}
