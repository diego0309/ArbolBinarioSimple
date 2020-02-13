public class Nodo 
{
    private Nodo left;
    private Nodo right;
    private int valor;

    public Nodo(){}
    public Nodo(int valor)
    {
        this.valor = valor;
    }

    
    public int getValor(){
        return this.valor;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }

    public Nodo getLeft() {
        return left;
    }

    public void setLeft(Nodo left) {
        this.left = left;
    }

    public Nodo getRight() {
        return right;
    }

    public void setRight(Nodo right) {
        this.right = right;
    }
    
    public void agregar(Integer valor) {
        if (valor < this.valor) {
            if (left != null) {
                left.agregar(valor);
            } else {
                left = new Nodo(valor);
            }
        } else {
            if (right != null) {
                right.agregar(valor);
            } else {
                right = new Nodo(valor);
            }
        }
    }
 
 
    public void imprimirInOrden() {
        if (left != null) {
            left.imprimirInOrden();
        }
        System.out.println(valor);
        if (right != null) {
            right.imprimirInOrden();
        }
    }
    
}
