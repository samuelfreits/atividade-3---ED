public class Fila extends ED {
    protected int inicio;

    public Fila(int tamanho) {
        super(tamanho);
        inicio = 0;
    }

    public void adicionar(int valor) {
        if (topo < dados.length) dados[topo++] = valor;
    }

    public int remover() {
        if (inicio < topo) return dados[inicio++];
        return -1;
    }
}
