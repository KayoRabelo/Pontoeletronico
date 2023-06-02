import java.time.LocalDate;

public abstract class Funcionario {
    protected String nome;
    protected LocalDate dataContratacao;

    public Funcionario(String nome, LocalDate dataContratacao) {
        this.nome = nome;
        this.dataContratacao = dataContratacao;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Nome: " + nome + ", Data de Contratação: " + dataContratacao;
    }
}
