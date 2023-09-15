package set.operacoesBasicas;

public class Main {

	public static void main(String[] args) {

		ConjuntoConvidados convidadoConjunto = new ConjuntoConvidados();
		
		System.out.println("Existem "+ convidadoConjunto.contarConvidados() +" convidados dentro do Set de Convidados");
		
		convidadoConjunto.adicionarConvidado("Convidado 1", 1234);
		convidadoConjunto.adicionarConvidado("Convidado 1", 1235);
		convidadoConjunto.adicionarConvidado("Convidado 1", 1235);
		convidadoConjunto.adicionarConvidado("Convidado 1", 1236);
		
		System.out.println("Existem "+ convidadoConjunto.contarConvidados() +" dentro do Set de Convidados");
//		
//		convidadoConjunto.removerConvidadoPorCodigoConvite(1234);
//		
//		System.out.println("Existem "+ convidadoConjunto.contarConvidados() +" dentro do Set de Convidados");
//		
//		convidadoConjunto.exibirConvidados();
		
		

	}

}
