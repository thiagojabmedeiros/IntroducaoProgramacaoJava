public class Produto {
    //variaveis
    private int codigo;
    private String name;
    private String descricao;
    private double preco;

    //construtores
    public Produto(){}
    public Produto(int codigo, String name, String descricao, double preco) {
        this.codigo = codigo;
        this.name = name;
        this.descricao = descricao;
        this.preco = preco;
    }

    //métodos get e set
    public void setcodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getcodigo() {
        return codigo;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getname() {
        return name;
    }
    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getdescricao() {
        return descricao;
    }
    public void setpreco(double preco) {
        this.preco = preco;
    }
    public double getpreco() {
        return preco;
    }
}
