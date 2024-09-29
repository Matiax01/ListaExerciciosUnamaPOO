package Funcionários;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana", 5000.0, 2000.0);
        System.out.println("Gerente: " + gerente.getNome());
        System.out.println("Salário: " + gerente.calcularSalario());
        System.out.println();

        Assistente assistente = new Assistente("Carlos", 3000.0);
        System.out.println("Assistente: " + assistente.getNome());
        System.out.println("Salário: " + assistente.calcularSalario());
    }
}
