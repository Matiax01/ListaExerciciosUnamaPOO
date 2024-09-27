package lojaDSuprimentos;

public class FaturaTeste{
    public static void main(String[] args) {
        Fatura f = new Fatura("Banana", "Fruta Saborosa", 2, 1.5);

        System.out.println("Você comprou uma " + f.getCodigoProduto());
        System.out.println("Que é uma " + f.getDescricaoProduto());
        System.out.println("Que possui o valor de: " + f.getPrecoPorItem());
        System.out.println("Você comrpou a quantidade: " + f.getQuantidadeComprada());
        System.out.println("Logo o total é: " + f.getTotalFatura());
    }
}
