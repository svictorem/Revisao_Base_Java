package Atividade05;

public class Main {

	public static void main(String[] args) {
        Produto p1 = new Produto("Teclado Mecânico", 150.00, 10);

        p1.exibirInformacoes();

        p1.adicionarEstoque(5);
        
        p1.exibirInformacoes();
        
        p1.removerEstoque(3);

        p1.exibirInformacoes();

        p1.removerEstoque(20);

	}

}
