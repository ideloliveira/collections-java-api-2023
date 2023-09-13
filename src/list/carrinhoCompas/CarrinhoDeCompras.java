package list.carrinhoCompas;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class CarrinhoDeCompras {
	public List<Item> itemLista;
	
	public CarrinhoDeCompras() {
		this.itemLista = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		Item item = new Item(nome, preco, quantidade);
		this.itemLista.add(item);
	}
	
	public void removerItem(String nome) {
		List<Item>itemRemover = new ArrayList<>();
		if(!itemLista.isEmpty()) {
			for(Item i: itemLista){
				if(i.getNome().equalsIgnoreCase(nome)) {
					itemRemover.add(i);
				}
			}
			itemLista.removeAll(itemRemover);
		}else {
			System.out.println("A lista está vazia");
		}		
	}
	
	public int obterNumeroTotalItens() {
		return this.itemLista.size();
	}
	
	public double totalCompra() {
		double valorTotal = 0d;
		if(!itemLista.isEmpty()) {
			for(Item item : itemLista) {
				double valorItem = item.getQuantidade() * item.getPreco();
				valorTotal += valorItem;
			}
			return valorTotal;
		}else {
			throw new RuntimeErrorException(null, "A lista está vazia!");
		}
	}
	public void exibirItem() {
		if(!itemLista.isEmpty()){
			System.out.println(this.itemLista);
		}else {
			System.out.println("A Lista está vazia");
		}
		
	}
	public String toString() {
		return "CarrinhoDeCompras{" +
										"itens=" + itemLista +
										'}';
	}
}
