import java.time.LocalDate;


public class Main {
    public static void main(String[] args) throws Exception {
        ItemVenda p1 = new ItemVenda();
        p1.setNome("produto 01");
        p1.setPreco(12.00);
        p1.setQuantidade(6);
        ItemVenda p2 = new ItemVenda();
        p2.setNome("produto 02");
        p2.setPreco(75.00);
        p2.setQuantidade(5);
        ItemVenda p3 = new ItemVenda();
        p3.setNome("produto 03");
        p3.setPreco(20.00);
        p3.setQuantidade(6);
        ItemVenda p4 = new ItemVenda();
        p4.setNome("produto 04");
        p4.setPreco(35.00);
        p4.setQuantidade(2);

        Cliente cliente = new Cliente("Thiago Medeiros", "122.345.678-90", LocalDate.of(2003, 11, 6));
        cliente.getDataNascimento();

        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.adicionarItem(p1);
        venda.adicionarItem(p2);
        venda.adicionarItem(p3);
        venda.adicionarItem(p4);
        venda.setAtendente("Marcos Nascimento");

        

        System.out.println("Data da Venda: " + LocalDate.now());
        System.out.println("Cliente: " + cliente.getNome() + " | CPF: " + cliente.getCpf() + " | Idade: " + cliente.calcularIdade());
        System.out.println("Atendente: " + venda.getAtendente());
        
        venda.listarItensVenda();

    }
}