package Turing;

public class Produto {

    private String sku;
    private String nome;
    private int quantidade;
    private boolean perecivel;
    private double preco;

    public Produto() {
    }

    public Produto(String sku, String nome, int quantidade, boolean perecivel, double preco) {
        this.sku = sku;
        this.nome = nome;
        setQuantidade(quantidade);
        this.perecivel = perecivel;
        setPreco(preco);
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
    }

    public boolean isPerecivel() {
        return perecivel;
    }

    public void setPerecivel(boolean perecivel) {
        this.perecivel = perecivel;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            this.preco = 0.0;
        } else {
            this.preco = preco;
        }
    }

    @Override
    public String toString() {
        return "SKU: " + sku +
               " | Nome: " + nome +
               " | Quantidade: " + quantidade +
               " | Perecível: " + perecivel +
               " | Preço: " + preco;
    }
}
