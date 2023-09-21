package set.operacoesBasicas;

public class Main {

	public static void main(String[] args) {

		/*ConjuntoConvidados convidadoConjunto = new ConjuntoConvidados();
		
		System.out.println("Existem "+ convidadoConjunto.contarConvidados() +" convidado(s) dentro do Set de Convidados");
		
		convidadoConjunto.adicionarConvidado("Convidado 1", 1234);
		convidadoConjunto.adicionarConvidado("Convidado 2", 1235);
		convidadoConjunto.adicionarConvidado("Convidado 3", 1235);
		convidadoConjunto.adicionarConvidado("Convidado 4", 1236);
		
		convidadoConjunto.exibirConvidados();
		
		System.out.println("Existem "+ convidadoConjunto.contarConvidados() +" convidado(s) dentro do Set de Convidados");
		
		convidadoConjunto.removerConvidadoPorCodigoConvite(1234);
		
		System.out.println("Existem "+ convidadoConjunto.contarConvidados() +" dentro do Set de Convidados");
		
		convidadoConjunto.exibirConvidados();
		*/
		
		ConjuntoPalavrasUnicas conjuntoLinguagem = new ConjuntoPalavrasUnicas();
		
		conjuntoLinguagem.adicionarPalavra("Java");
		conjuntoLinguagem.adicionarPalavra("Python");
		conjuntoLinguagem.adicionarPalavra("JavaScript");
		conjuntoLinguagem.adicionarPalavra("Python");
		conjuntoLinguagem.adicionarPalavra("C++");
		conjuntoLinguagem.adicionarPalavra("Ruby");
		
		conjuntoLinguagem.exibirPalavraUnica();
		
		conjuntoLinguagem.removerPalavra("Python");
		conjuntoLinguagem.exibirPalavraUnica();
		
		conjuntoLinguagem.removerPalavra("PHP");
		
		System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagem.verificarPalavra("Java"));
		System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagem.verificarPalavra("Python"));
		
		conjuntoLinguagem.exibirPalavraUnica();
		

	}

}
