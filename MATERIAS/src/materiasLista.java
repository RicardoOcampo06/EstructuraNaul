import java.util.ArrayList;
import java.util.List;

public class materiasLista {
    private List<String> materias;

    public materiasLista(){
        materias = new ArrayList<>();
    }

    public void agregarMateria(String materia){

        materias.add(materia);
    }
    public boolean contiene(String materia){
        for(String mate : materias){
            if (mate.equals(materia)) {
                return true;
                
            }
        }
         return false;
    }
    public void imprimir(){
        System.out.println("Materias " + materias);
    }
    
}
