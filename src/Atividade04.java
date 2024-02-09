public class Atividade04 {
    //Criando atributo livro para utilizar na função de criação
    String livro;
    //Criando atributo paginas para utilizar na função de criação
    int paginas;

    //Criando função que atribui valor das variáveis livro e páginas, puxando o valor dos parâmetros nomeLivro e quantidadePaginas
    public Atividade04(String nomeLivro, int quantidadePaginas){
        this.livro = nomeLivro;
        this.paginas = quantidadePaginas;

        System.out.println("Nome do livro: " + livro);
        System.out.println("Quantidade de páginas: " + paginas);
    }
    public static void main(String[] args) {
        //Criando array/lista para receber as características de cada livro
        Atividade04[] livros = new Atividade04[2];

        //Criando características dos livros e adicionando na lista/array (Lembrando que o array começa do zero)
        livros[0] = new Atividade04("Rainha Vermelha", 330);
        livros[1] = new Atividade04("A Seleção", 347);

        //Percorrendo a lista de livros e mostrando os dados dos livros à partir do índice([i])
        for(int i = 0; i < livros.length; i++){
            System.out.println(livros[i]);
        }
    }
}
