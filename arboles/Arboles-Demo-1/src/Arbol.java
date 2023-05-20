public class Arbol {
    private Nodo raiz;

    // Constructor de la clase Arbol que inicializa la raíz como null
    public Arbol() {
        this.raiz = null;
    }

    // Método público que verifica si un dato dado existe en el árbol
    public boolean existe(int busqueda) {
        return existe(this.raiz, busqueda);
    }

    // Método privado que realiza la búsqueda de un dato en el árbol
    private boolean existe(Nodo n, int busqueda) {
        if (n == null) {
            return false; // Si el nodo actual es null, se llegó
        }                 //a una hoja y no se encontró el dato
        if (n.getDato() == busqueda) {
            return true; // Si el dato del nodo actual es igual // al dato buscado, se encontró
        } else if (busqueda < n.getDato()) {
            return existe(n.getIzquierda(), busqueda); // Si el dato buscado es menor,
            //se busca en el subárbol izquierdo
        } else {
            return existe(n.getDerecha(), busqueda); // Si el dato buscado es mayor,
            //se busca en el subárbol derecho
        }
    }
    // Método público para insertar un nuevo dato en el árbol
    public void insertar(int dato) {
        if (this.raiz == null) {
            this.raiz = new Nodo(dato); // Si la raíz es null, se crea un nuevo
        } else {
            this.insertar(this.raiz, dato); // Si la raíz ya existe, se llama al
        }
    }
    // Método privado para insertar un nuevo dato en el árbol (recursivo)
    private void insertar (Nodo padre, int dato) {
        if (dato > padre.getDato()) {
            if (padre.getDerecha() == null) {
                padre.setDerecha(new Nodo(dato)); // Si el dato es mayor que el
            } else {
                this.insertar(padre.getDerecha(), dato); // Si el subárbol derec
            }
        } else {
            if (padre.getIzquierda() == null) {
                padre.setIzquierda(new Nodo(dato)); // Si el dato es menor o igu
            } else {
                this.insertar(padre.getIzquierda(), dato); // Si el subárbol izq
            }
        }
    }
    private void preorden (Nodo n) {
        if (n != null) {
            n.imprimirDato(); // Se imprime e
            preorden(n.getIzquierda()); // Se
            preorden(n.getDerecha()); // Se re
        }
    }

    // Método privado para recorrer el ár
    private void inorden (Nodo n) {
        if (n!= null) {
            inorden(n.getIzquierda ()) ;
            n.imprimirDato ();
                // Se impri
            inorden (n.getDerecha()); //
        }
    }
    // Método privado para recorrer el árbc
    private void postorden (Nodo n){
        if (n != null) {
            postorden(n.getIzquierda());
            postorden(n.getDerecha());
            n.imprimirDato();
        }
    }

    // Método público para iniciar el
    public void preorden () {
        this.preorden(this.raiz);
    }
    // Método público para iniciar el
    public void inorden() {
        this.inorden(this.raiz);
    }
    // Método público para iniciar el
    public void postorden () {
        this.postorden (this.raiz);
    }


}