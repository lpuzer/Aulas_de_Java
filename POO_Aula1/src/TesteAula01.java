import java.util.Scanner;

public class TesteAula01 {

	public static void main(String[] args) {

		Boletim b1 = new Boletim();
		Boletim b2 = new Boletim();
		b1.nota = 10.0f;
		b2.frequencia = 5; 
		
		
		if (b1 == b2) {
			System.out.println(b1);
			System.out.println("b1");
		}
		else {
		
		System.out.println(b2);
		System.out.println("b2");
		} 

	}

}
