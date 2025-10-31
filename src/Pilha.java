public class Pilha extends ED {
    public Pilha(int tamanho) {
        super(tamanho);
    }

    public void adicionar(int valor) {
        if (topo < dados.length) dados[topo++] = valor;
    }

    public int remover() {
        if (topo > 0) return dados[--topo];
        return -1;
    }
}
