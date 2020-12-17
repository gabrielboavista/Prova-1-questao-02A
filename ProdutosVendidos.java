package prova01questao2a;

public class ProdutosVendidos {
    private float valor;
    private int quantidade;
    private int vendidos;
    private String nome;
    private String marca;
    private String modelo;    
    private boolean recarga;
    private float lucro;
    
    public ProdutosVendidos (String no, float va, String ma, String mo){
        this.nome = no;
        this.valor = va;
        this.marca = ma;
        this.modelo = mo;
        this.quantidade = 50;
        this.recarga = false;
    }
    
    public void status(){
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ja foram vendidos: " + vendidos);
        System.out.println("Quantidade disponível: " + quantidade);
        System.out.println("Preço: " + valor);
        System.out.println("Abastecer loja? " + recarga);
        System.out.println("Montante: " + lucro);
    }
    
    public void vender(){
        if(this.getVendidos() <= 0){
        this.setVendidos(this.getVendidos() + 1);
        } else {
            System.out.println("Produto indisponível para venda");
        }
    }
    
    public void montante(){
        this.setLucro(this.getVendidos()*this.getValor());
    }
    
    public void disponivelpvenda(){
        this.setQuantidade(this.getQuantidade() - this.getVendidos());
    }
    
    public void recarregarestoque(){
        if (this.getVendidos()== 0){
            this.setRecarga(true);
        } else {
            this.setRecarga(false);
        }
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getRecarga() {
        return recarga;
    }

    public void setRecarga(boolean recarga) {
        this.recarga = recarga;
    }

    public float getLucro() {
        return lucro;
    }

    public void setLucro(float lucro) {
        this.lucro = lucro;
    }

    public int getVendidos() {
        return vendidos;
    }

    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }
    
    
}
