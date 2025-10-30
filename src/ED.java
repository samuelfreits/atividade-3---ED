public abstract class ED {
    protected int[] dados;
    protected int topo;

    public ED(int tamanho) {
        dados = new int[tamanho];
        topo = 0;
    }

    public abstract void adicionar(int valor);
    public abstract int remover();
}
