public class MainED {
    public static void main(String[] args) {
        ED estrutura = new Pilha(10);
        // estrutura = new Fila(10);
        // estrutura = new FilaPrioridade(10);

        estrutura.adicionar(10);
        estrutura.adicionar(5);
        estrutura.adicionar(7);
        estrutura.adicionar(2);
        estrutura.adicionar(4);

        System.out.println(estrutura.remover());
        System.out.println(estrutura.remover());
        System.out.println(estrutura.remover());
        System.out.println(estrutura.remover());
        System.out.println(estrutura.remover());
    }
}
