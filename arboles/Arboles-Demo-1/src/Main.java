// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.insertar(5);
        arbol.insertar(4);
        arbol.insertar(6);
        arbol.insertar(20);
        System.out.print ("Recorrido inorden:");
        arbol.inorden ();
        System.out.println();
        System.out.println("**************************");
        System.out.print("Recorrido postorden:");
        arbol.postorden ();
        System.out.println();
        System.out.println("///////////////////");
        System.out.print ("Recorrido preorden:");
        arbol.preorden();
////        arbol.eliminar(6);
        System.out.println();
        System.out.print ("Recorrido inorden después de eliminar el nodo con dato 6: ");
        System.out.println("");
        arbol.inorden ();
        System.out.println();
    }
}