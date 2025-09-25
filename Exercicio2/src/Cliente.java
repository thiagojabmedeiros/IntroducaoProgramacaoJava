import java.time.LocalDate;
import java.time.Period;

public class Cliente {
    //objetos
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;

    //construtor
    public Cliente() {}
    public Cliente (String nome, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    //get e set
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //metodo
    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();

        int idade = Period.between(dataNascimento, hoje).getYears();

        return idade;
    }
}