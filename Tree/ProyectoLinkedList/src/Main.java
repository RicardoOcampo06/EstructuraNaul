public class Main {

    public static int[] toArray(SinglyLinkedList list) {
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Crear lista
        SinglyLinkedList list = new SinglyLinkedList();
        
        // Agregar temperaturas
        list.addLast(28);
        list.addLast(31);
        list.addLast(26);
        list.addLast(30);
        list.addLast(29);

        // Imprimir lista original
        System.out.println("Lista original:");
        list.printList();

        // Convertir a arreglo
        int[] arr = toArray(list);

        // Ordenar con Bubble Sort
        bubbleSort(arr);

        // Imprimir arreglo ordenado
        System.out.println("Arreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
