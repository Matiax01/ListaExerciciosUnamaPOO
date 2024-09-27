package lojaDSuprimentos;

public class Fatura{
    private String codigoProduto;
    private String descricaoProduto;
    private int quantidadeComprada;
    private double precoPorItem;

    public Fatura(String codigoProduto, String descricaoProduto, int quantidadeComprada, double precoPorItem){
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeComprada = quantidadeComprada;
        this.precoPorItem = precoPorItem;
    }

    public String getCodigoProduto(){
        return this.codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto){
        this.codigoProduto = codigoProduto;
    }
    
    public String getDescricaoProduto(){
        return this.descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto){
        this.descricaoProduto = descricaoProduto;
    }

    public int getQuantidadeComprada(){
        return this.quantidadeComprada
    }

    public void setQuantidadeComprada(int quantidadeComprada){
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPrecoPorItem(){
        return this.precoPorItem
    }

    public void setPrecoPorItem(double precoPorItem){
        this.precoPorItem = precoPorItem;
    }
}