package list.ordenacao;

public class Main {

	public static void main(String[] args) {
		OrdenacaoPessoa pessoa = new OrdenacaoPessoa();
		pessoa.adicionarPessoa("Evani", 68, 1.50);
		pessoa.adicionarPessoa("Lindomar", 46, 1.71);
		pessoa.adicionarPessoa("Idelmar", 48, 1.70);
		pessoa.adicionarPessoa("Rubens", 53, 1.68);
		
		
		
		//System.out.println(pessoa.ordenarPorIdade()+"\n");
		System.out.println(pessoa.ordenarPorAltura()+"\n");

	}

}
