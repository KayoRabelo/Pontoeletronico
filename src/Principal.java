import javax.swing.JOptionPane;
import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        SistemaGestaoFuncionarios sistema = new SistemaGestaoFuncionarios();

        String[] opcoes = { "Funcion�rio por Hora", "Funcion�rio Assalariado" };
        int tipoFuncionario = JOptionPane.showOptionDialog(
            null,
            "Selecione o tipo de funcion�rio:",
            "Gest�o de Funcion�rios",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );

        String nome = JOptionPane.showInputDialog("Digite o nome do funcion�rio:");
        LocalDate dataContratacao = LocalDate.now();

        if (tipoFuncionario == 0) {
            double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora de trabalho:"));
            double horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas:"));
            FuncionarioPorHora funcionario = new FuncionarioPorHora(nome, dataContratacao, valorHora, horasTrabalhadas);
            sistema.adicionarFuncionario(funcionario);
        } else {
            double salarioMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite o sal�rio mensal:"));
            FuncionarioAssalariado funcionario = new FuncionarioAssalariado(nome, dataContratacao, salarioMensal);
            sistema.adicionarFuncionario(funcionario);

            double fatorBonus = Double.parseDouble(JOptionPane.showInputDialog("Digite o fator de b�nus:"));
            double bonus = funcionario.calcularBonus(fatorBonus);
            JOptionPane.showMessageDialog(null, "B�nus: R$" + bonus);
        }

        sistema.listarFuncionarios();

        double salarioMedio = sistema.calcularSalarioMedio();
        JOptionPane.showMessageDialog(null, "Sal�rio M�dio: R$" + salarioMedio);
    }
}

