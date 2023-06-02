import java.util.ArrayList;
import java.util.List;

public class SistemaGestaoFuncionarios {
    private List<Funcionario> funcionarios;

    public SistemaGestaoFuncionarios() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void listarFuncionarios() {
        StringBuilder listaFuncionarios = new StringBuilder("Lista de Funcionários:\n");
        for (Funcionario funcionario : funcionarios) {
            listaFuncionarios.append(funcionario).append("\n");
        }
        System.out.println(listaFuncionarios);
    }

    public double calcularSalarioMedio() {
        if (funcionarios.isEmpty()) {
            return 0.0;
        }

        double somaSalarios = 0.0;
        for (Funcionario funcionario : funcionarios) {
            somaSalarios += funcionario.calcularSalario();
        }

        return somaSalarios / funcionarios.size();
    }
}

