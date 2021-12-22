package Aula11;

import java.util.Random;

public class Aluno extends Pessoa {

	private String matricula;
	private String curso;
	private float valorMensalidade;
	
	public Aluno() {
		setValorMensalidade(1000f);
		setMatricula();
		setCurso("Ciencias da computação");
	}
	
	@Override
	public String toString() {
		
		pagarMensalidade();
		return "Matricula: " + matricula + "\nCurso: " + curso + "\nNome: " + getNome();
	}
	
	public void pagarMensalidade() {
		System.out.println("\nMensalidade: " + this.getValorMensalidade() + "R$");
	}
	
	public float getValorMensalidade() {
		return valorMensalidade;
	}

	private void setValorMensalidade(float valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}

	public String getMatricula() {
		return matricula;
	}
	
	protected void setMatricula() {
		
		Random random = new Random();
		int matriculaAleatoriaInteira = random.nextInt(100000); 
		String matriculaAleatoria = String.valueOf(matriculaAleatoriaInteira);
		matricula = matriculaAleatoria;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
