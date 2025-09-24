import java.time.LocalDate;
import java.time.Period;

public class Cliente {
    //variáveis
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;

    //construtores
    public Cliente() {}
    public Cliente(String cpf, String nome, LocalDate dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    //métodos get e set
    public void setcpf(String cpf) {
        this.cpf = cpf;
    }
    public String getcpf() {
        return cpf;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public String getnome() {
        return nome;
    }
    public void setdataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public LocalDate getdataNascimento() {
        return dataNascimento;
    }

    //método calcular idade
    public int calcularidade() {
        Period p = Period.between(LocalDate.now(), dataNascimento);
        
        int idade = p.getYears();
        return idade;
    }
}
