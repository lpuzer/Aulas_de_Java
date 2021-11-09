
public class Boletim {
	
	private float nota;
	private int frequencia;
	private char status;
	
	
	
	public float getNota() {
		return nota;
	}
	

	public void setNota(float nota) {
		this.nota = nota;
	}
	

	public int getFrequencia() {
		return frequencia;
	}
	

	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}
	

	public char getStatus() {
		return status;
	}
	

	public void setStatus(char status) {
		this.status = status;
	}
	

	public void inserir_nota(float nota) {
		
	}
	
	
	public void excluir_nota() {
		
	}
	
	
	public void alterar_nota(float nota) {
		
	}
	
	//exemplo de polimorfismo estático
	public double calcularMedia(double AM, double AC, double AS) {
		double MS = (AM * 0.3) + (AC * 0.2) + (AS * 0.5);
		return MS;
	}
	
	//exemplo de polimorfismo estático
	public double calcularMedia(double PM, double AS) {
		double MS = (PM * 0.4) + (AS * 0.6);
		return MS;
	}
	
	

}
