import java.time.LocalDateTime;
import java.util.ArrayList;

public class Venda {
    //objetos
    private LocalDateTime data;
    private String atendente;
    private Cliente cliente;
    private ArrayList<ItemVenda> itens = new ArrayList<>();
    
    //construtor
    public Venda() {}
    public Venda(String atendente, LocalDateTime data, Cliente cliente) {
        this.atendente = atendente;
        this.data = data;
        this.cliente = cliente;
    }

    //get e set
     public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public ArrayList<ItemVenda> getItens() {
        return itens;
    }
    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }
    public LocalDateTime getData() {
        return data;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }
    public String getAtendente() {
        return atendente;
    }
    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }

    //metodos
    public void adicionarItem(ItemVenda item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemVenda item : itens) {
            total = total + item.calcularTotal1();
        }
        return total;
    }

    public void listarItensVenda() {
        System.out.println("---------------------------------------------------");
        System.out.printf("%-15s | %-10s | %-9s | %-10s \n", "Nome do Produto", "Preço", "Quantidade", "Total");
        for (ItemVenda item : itens) {
            System.out.println(item.getNome() + "      | R$ " + item.getPreco() + "    | " + item.getQuantidade() + "          | R$" + item.calcularTotal1());
        }
       
        System.out.println("---------------------------------------------------");
        System.out.println("Total da Venda:                             R$" + calcularTotal());

    }
}
