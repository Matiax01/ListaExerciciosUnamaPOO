package empregabilidade;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado ob1 = new Empregado("José", "Karlos", 15.0);
    Empregado ob2 = new Empregado("Marcelo", "Roberto", 10.0);

    System.out.println(ob1.getSalarioAnual());
    System.out.println(ob2.getSalarioAnual());

    System.out.println("Com Aumento");
    System.out.println(ob1.getSalarioAnual() * 1.1);
    System.out.println(ob2.getSalarioAnual() * 1.1);
    }
}
