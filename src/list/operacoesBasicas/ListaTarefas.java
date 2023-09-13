package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	private List<Tarefas> tarefaList;

	public ListaTarefas() {
		this.tarefaList = new ArrayList<Tarefas>();
	}
	
	public void adicionarTarefas(String descricao) {
		tarefaList.add(new Tarefas(descricao));
	}
	public void removerTarefas(String descricao) {
		List<Tarefas>tarefasParaRemover = new ArrayList<Tarefas>();
		for(Tarefas t: tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
public static void main(String[] args) {
	
	ListaTarefas listaTarefas = new ListaTarefas();
	System.out.println("O número total de elementos na lista é: "+ listaTarefas.obterNumeroTotalTarefas());
	listaTarefas.adicionarTarefas("Tarefas 1");
	listaTarefas.adicionarTarefas("Tarefas 1");
	listaTarefas.adicionarTarefas("Tarefas 2");
	System.out.println("O número total de elementos na lista é: "+ listaTarefas.obterNumeroTotalTarefas());
	
	listaTarefas.removerTarefas("Tarefas 2");
	System.out.println("O número total de elementos na lista é: "+ listaTarefas.obterNumeroTotalTarefas());
	
	listaTarefas.obterDescricoesTarefas();
	
}

}
