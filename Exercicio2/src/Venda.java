import java.time.LocalDateTime;

public class Venda {
    //variáveis
    private LocalDateTime data;
    private String atendente;
    
    //métodos get e set
    public void setdata(LocalDateTime data) {
        this.data = data;
    }
    public LocalDateTime getdata() {
        return data;
    }
    public void setatendente(String atendente) {
        this.atendente = atendente;
    }
    public String getatendente() {
        return atendente;
    }

    //método adicionar item
    public void adicionarItem(ItemVenda item) {

    }

    //método calcular total
    public double calcularTotal() {
        double total = 0.0;

        return total;
    }

    //método lista de itens
    public void listarItensVenda() {

    }

}
