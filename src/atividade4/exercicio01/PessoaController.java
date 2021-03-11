package atividade4.exercicio01;

public class PessoaController {

	public static Boolean isEmpty(PessoaModel[] array) {
		if (array.length == 0)
			return true;
		else
			return false;	
	}
	
	//associacao entre classes
	public static PessoaModel adicionaElemento(PessoaModel pessoa, PessoaModel[] array) {
		//criacao de endereco de memoria		
		for (int i = 0; i <= array.length; i++) {
			if (array[i] == null) {
				array[i] = pessoa;
				break;
			} else {
				System.out.println("A fila esta cheia!");
			}	
		}
		
		return pessoa;
	}
	
	//associacao entre classes
	public static PessoaModel removeElemento(PessoaModel array[]) {
		//associacao entre classes		
		PessoaModel pessoaRemovida;
		
		pessoaRemovida = array[0];
		array[0] = null;
		
		for (int j = 1; j <= array.length; j++) {
			array[j] = array[j - 1];
		}
		
		return pessoaRemovida;	
	}
	
	//associacao entre classes
	public static Integer pesquisarOrdem(PessoaModel array[], Long rg) {
		//criacao de endereco de memoria
		Long rgProcurado = PessoaModel.getRg();
		//criacao de endereco de memoria	
		for (int i = 0; i <= array.length; i++) {
			if (rg == rgProcurado) {
				return i;
			}
		}
		
		System.out.println("Pessoa nao encontrada!");
		return null;
	}
	
	//associacao entre classes
	public static void apresentarElementos(PessoaModel array[]) {
		//criacao de endereco de memoria
		for (int i = 0; i <= array.length; i++) {
			System.out.println(array[i]);
		}				
	}
	
}

