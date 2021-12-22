package Aula11;

public class Bolsista extends Aluno {
	
	private int valorBolsa;
	
	public Bolsista(int valorBolsa, String nome) {
		setNome(nome);
		setCurso("Ciências da computação");
		setMatricula();
		setValorBolsa(valorBolsa);
	}
	@Override
	public void pagarMensalidade() {
		System.out.println("\n\nMensalidade: " + this.getValorBolsa() + "R$");

	}
	@Override
	public String toString() {
		
		pagarMensalidade();
		return "Bolsista: "  + this.getNome() + "\nMatricula: " + this.getMatricula() + "\nCurso: " + this.getCurso();
	}
	
	public int getValorBolsa() {
		return valorBolsa;
	}

	private void setValorBolsa(int valorBolsa) {
		if(valorBolsa >= 80 && valorBolsa < 90) { //se a nota da prova foi maior ou igual a 80
			this.valorBolsa = 200; // valor a pagar
		}else {
			this.valorBolsa = 0; // valor a pagar
		}
		
	}
	
	
}
