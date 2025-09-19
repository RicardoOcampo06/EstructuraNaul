public class App {

        public static String invertirCadena(String cadena){
        if(cadena.isEmpty())return cadena;
        return invertirCadena(cadena.substring(1))+ cadena.charAt(0);
    }
    public static void main(String[] args) throws Exception {
        
        String cadenaOriginal = "Me gusta Goku";
        System.out.println("cadena sin invertir:" + cadenaOriginal);
        System.out.println("cadena invertida:"+ invertirCadena(cadenaOriginal));
    }
}