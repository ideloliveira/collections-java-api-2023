package list.carrinhoCompas;

public class Main {
	
	public static void main(String[] args) {
		
		CarrinhoDeCompras itemNoCarrinho = new CarrinhoDeCompras();
		
		System.out.println("total de Itens no carrinho: "+itemNoCarrinho.obterNumeroTotalItens());		
		itemNoCarrinho.adicionarItem("Mouse", 23d, 4);
		itemNoCarrinho.adicionarItem("Teclado", 35.5d, 3);
		itemNoCarrinho.adicionarItem("SSD", 105.7d, 2);
		System.out.println("Total de itens no carrinho: "+itemNoCarrinho.obterNumeroTotalItens());
		itemNoCarrinho.exibirItem();
		System.out.println("Valor:"+itemNoCarrinho.totalCompra());
		itemNoCarrinho.removerItem("Mouse");
		System.out.println("Total de itens no carrinho: "+itemNoCarrinho.obterNumeroTotalItens());
		System.out.println("Valor:"+itemNoCarrinho.totalCompra());
		
	}


}
