package Atividade05;

public class Produto {
	String nome;
	double preco;
	int estoque;
	
	public Produto(String nome, double preco, int estoque) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}
	
	public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            estoque += quantidade;
            System.out.println(quantidade + " unidade(s) adicionada(s) ao estoque de: " + nome);
        } else {
            System.out.println("A quantidade para adicionar deve ser maior que zero.");
        }
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade para remover deve ser maior que zero.");
        } else if (quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println(quantidade + " unidade(s) removida(s) do estoque de: " + nome);
        } else {
            System.out.println("Erro: Estoque insuficiente para realizar a saída de " + quantidade + " unidade(s).");
        }
    }

    public double calcularValorTotalEstoque() {
        return preco * estoque;
    }

    public void exibirInformacoes() {
        System.out.println("\n--- DADOS DO PRODUTO ---");
        System.out.println("Nome: " + nome);
        System.out.printf("Preço: R$ %.2f", preco);
        System.out.println("\nQuantidade em Estoque: " + estoque);
        System.out.printf("Valor Total em Estoque: R$ %.2f", calcularValorTotalEstoque());
        System.out.println("\n------------------------");
    }
}
