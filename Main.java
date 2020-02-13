public class Main {
    public static void main(String[] args) {
        Nodo raiz = new Nodo(25);
        raiz.agregar(7);
        raiz.agregar(37);
        raiz.agregar(5);
        raiz.agregar(10);
        raiz.agregar(30);
        raiz.agregar(40);
        raiz.agregar(2);
        raiz.agregar(60);
        
        
        System.out.println("Imprimir en orden");
        raiz.imprimirInOrden();
    }
    
}
