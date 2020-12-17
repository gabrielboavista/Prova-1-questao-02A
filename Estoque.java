package prova01questao2a;

public class Estoque {
    private String nome;
    private float valor;
    private int quantidade;
    private String modelo;
    private String marca;
    private boolean recarregar;
    private boolean recargaloja;
    
    public Estoque(String no, float va, String mo, String ma){
        this.modelo = mo;
        this.marca = ma;
        this.valor = va;
        this.nome = no;
        this.quantidade = 100;
        this.recarregar = false;
        this.recargaloja = false;
    }
    
    public void status(){
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: " + valor);
        System.out.println("Abastecer estoque? " + recarregar);
    }
    
    public void recarregarEstoque(){
        
        if (this.getQuantidade() == 0){
            this.setRecarregar(true);
        } else {
            System.out.println("Produto ainda disponível em estoque!");
        }
        
    }
    
    public void recarregarloja(){
        //Método verificaria se a loja precisa de produtos do estoque e caso precise, mandara para ela.
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

    public boolean isRecarregar() {
        return recarregar;
    }

    public void setRecarregar(boolean recarregar) {
        this.recarregar = recarregar;
    }

    public boolean isRecargaloja() {
        return recargaloja;
    }

    public void setRecargaloja(boolean recargaloja) {
        this.recargaloja = recargaloja;
    }
    
    
}
