package atividade4.exercicio01;

import java.util.Date;

import javax.swing.JOptionPane;

import atividade3.Fila;
import atividade3.Pilha;

public class PessoaView {
	
	public static void main(String args[]) {
		PessoaModel pessoas[] = new PessoaModel[10];
		PessoaModel pessoa;
		
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do metodo que deseja executar:"
				+ "1 - Verificar se a fila esta vazia"
				+ "2 - Adicionar uma pessoa"
				+ "3 - Remover uma pessoa"
				+ "4 - Pesquisar a ordem de espera de uma pessoa na fila"
				+ "5 - Percorrer e apresentar cada um dos elementos da fila"));
		
		switch (escolha) {
		
		case 1:
			PessoaController.isEmpty(pessoas);
			break;
			
		case 2:
			Integer id = Integer.parseInt(JOptionPane.showInputDialog("Entre com o id:"));
			String nome = JOptionPane.showInputDialog("Entre com o nome:");
			Long rg = Long.parseLong(JOptionPane.showInputDialog("Entre o rg:"));
			Long telefone = Long.parseLong(JOptionPane.showInputDialog("Entre com o telefone:"));
			Long dataNascimento = Long.parseLong(JOptionPane.showInputDialog("Entre com a data de nascimento:"));
			pessoa = new PessoaModel();
			pessoa.setId(id);
			pessoa.setNome(nome);
			pessoa.setRg(rg);
			pessoa.setTelefone(telefone);
			pessoa.setDataNascimento(dataNascimento);
			PessoaController.adicionaElemento(pessoa, pessoas);
			break;
			
		case 3:
			PessoaController.removeElemento(pessoas);
			break;
		
		case 4:
			pessoa = new PessoaModel();
			Long rg2 = Long.parseLong(JOptionPane.showInputDialog("Entre o rg:"));
			pessoa.setRg(rg2);
			PessoaController.pesquisarOrdem(pessoas, rg2);
		
		case 5:
			PessoaController.apresentarElementos(pessoas);
		}
	}

}
