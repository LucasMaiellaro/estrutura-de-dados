package atividade6.exercicio03;

public class Aluno {
	
	private Aluno proximo;
	private int RA;
	private String nome;
	private String turma;
	private String semestre;
	
	public Aluno getProximo() {
		return proximo;
	}
	public void setProximo(Aluno proximo) {
		this.proximo = proximo;
	}
	public int getRA() {
		return RA;
	}
	public void setRA(int rA) {
		RA = rA;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	
}
