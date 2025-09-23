import java.util.ArrayDeque;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
      
        Queue<Cliente> queue = new ArrayDeque<>();

        Cliente c1 = new Cliente(1, "Pedro");
        c1.agregarDocumento("Doc 1");
        c1.agregarDocumento("Doc 2");

        Cliente c2 = new Cliente(1, "David");
        c2.agregarDocumento("Doc 1");
        c2.agregarDocumento("Doc 2");

        Cliente c3 = new Cliente(1, "Marlen");
        c3.agregarDocumento("Doc 1");
        c3.agregarDocumento("Doc 2");
        queue.offer(c1);
        queue.offer(c2);
        queue.offer(c3);
        while (!queue.isEmpty()) {
            Cliente clienteActual = queue.peek();
            System.out.println("El cliente esta en atencion " + clienteActual);
            clienteActual = queue.poll();
            clienteActual.next();
            if (!queue.isEmpty()) {
                System.out.println("Cola restante: " + queue);
                
            }
        }

    }
}
