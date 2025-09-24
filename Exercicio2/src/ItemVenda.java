public class ItemVenda {
    //variaveis
    private int quantidade;

    // contrutores
    public ItemVenda() {}
    public ItemVenda(int quantidade) {
        this.quantidade = quantidade;
    }

    //métodos get e set
    public void setquantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getquantidade() {
        return quantidade;
    }

    //método calcular total
    public double calcularTotal() {
        Produto produto = new Produto();
        double total = quantidade * produto.getpreco();
        return total;
    }
}
