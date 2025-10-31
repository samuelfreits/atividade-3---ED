public class FilaPrioridade extends Fila {
    public FilaPrioridade(int tamanho) {
        super(tamanho);
    }

    public void adicionar(int valor) {
        if (topo < dados.length) {
            int i = topo - 1;
            while (i >= 0 && dados[i] > valor) {
                dados[i + 1] = dados[i];
                i--;
            }
            dados[i + 1] = valor;
            topo++;
        }
    }
}
