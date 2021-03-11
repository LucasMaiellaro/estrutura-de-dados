package atividade4.exercicio01;

import java.util.Date;

public class PessoaModel {
	
	private static Integer id;
	
	private static String nome;
	private static Long rg;
	private static Long telefone;
	private static Long dataNascimento;
	
	public static Integer getId() {
		return id;
	}
	public static void setId(Integer id) {
		PessoaModel.id = id;
	}
	public static String getNome() {
		return nome;
	}
	public static void setNome(String nome) {
		PessoaModel.nome = nome;
	}
	public static Long getRg() {
		return rg;
	}
	public static void setRg(Long rg) {
		PessoaModel.rg = rg;
	}
	public static Long getTelefone() {
		return telefone;
	}
	public static void setTelefone(Long telefone) {
		PessoaModel.telefone = telefone;
	}
	public static Long getDataNascimento() {
		return dataNascimento;
	}
	public static void setDataNascimento(Long dataNascimento) {
		PessoaModel.dataNascimento = dataNascimento;
	}
		
}
