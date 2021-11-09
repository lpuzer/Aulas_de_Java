
public class TestaPessoa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.setNome("Luciano");
		p1.setEmail("lpr@yahoo.com.br");
		p1.setCpf(02272232760);
		
		
		p2.setNome("Luc");
		p2.setEmail("lpuzer@yahoo.com.br");
		p2.setCpf(02272232760);
		
		if (p1.getCpf() == p2.getCpf()) {
			System.out.println("igual");
		}
		else {
		
		System.out.println("diferente");
		}
	}
	
	

}
