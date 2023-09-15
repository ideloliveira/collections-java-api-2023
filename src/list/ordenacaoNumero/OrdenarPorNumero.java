package list.ordenacaoNumero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.management.RuntimeErrorException;

public class OrdenarPorNumero {
	private List<Numero> numeroList;

	public OrdenarPorNumero() {
		this.numeroList = new ArrayList<Numero>();
	}
	public void adicionarNumero(int numero) {
		numeroList.add(new Numero(numero));
	}
	
	public List<Numero> ordenarAscendente(){
		List<Numero> numeroAscendente = new ArrayList<>(numeroList);
		if(!numeroList.isEmpty()) {
			Collections.sort(numeroAscendente);
			return numeroAscendente;
		}else {
			throw new RuntimeException("A Lista está vazia");
		}
	}
	
	public List<Numero> ordenarDescendente(){
		List<Numero> numeroDescendente = new ArrayList<>(numeroList);
		if(!numeroList.isEmpty()) {
			numeroDescendente.sort(Collections.reverseOrder());
			return numeroDescendente;
		}else {
			throw new RuntimeException("A Lista está vazia");
		}
		
	}
	
}
