public class Atividade03 {
    String nomeProduto;
    double precoProduto;

    public Atividade03(String nome, double preco){
        this.nomeProduto = nome;
        this.precoProduto = preco;
    }
    public static void main(String[] args) {
        Atividade03 novoProduto = new Atividade03("Lápis",2.5);
        Atividade03 novoProduto2 = new Atividade03("Caneta",5.0);

        if (novoProduto == novoProduto2){
            System.out.println("Os produtos são iguais!");
        } else {
            System.out.println("Os produtos são diferentes!");
        }
    }
}
