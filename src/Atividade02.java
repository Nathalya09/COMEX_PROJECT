public class Atividade02 {
    String nomeProduto;
    double precoProduto;

    public Atividade02(String nome,double preco){
        this.nomeProduto = nome;
        this.precoProduto = preco;
    }
    public static void main(String[] args) {
        Atividade02 novoProduto = new Atividade02("Lápis",2.5);
        Atividade02 novoProduto2 = new Atividade02("Caneta",5.0);

        if (novoProduto == novoProduto2){
            System.out.println("Os produtos são iguais!");
        } else {
            System.out.println("Os produtos são diferentes!");
        }
    }
}
