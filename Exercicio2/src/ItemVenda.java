public class ItemVenda extends Produto{
    //objeto
    private int quantidade;
    
    //construtor
    public ItemVenda(){}
    public ItemVenda (int quantidade) {
        this.quantidade = quantidade;
        }
    

    //get e set
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //metodo
    public double calcularTotal1() {
        double total = 0.0;
        total = getQuantidade() * getPreco();
        return total;
    } 
}
