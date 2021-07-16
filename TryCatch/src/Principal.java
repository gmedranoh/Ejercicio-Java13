
public class Principal {
	
	static int numerador = 10;
	static Integer denominador = null;
	static float division;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Antes de la division");
		try {
			division = numerador / denominador;	
		//ArithmeticException atrapamos todos los errores
		}catch(ArithmeticException error) {
			division = 0;
			System.out.println("Error: " + error.getMessage());
		}catch(NullPointerException ex) {
			division = 0;
			System.out.println("Error: " + ex.getMessage());
			System.out.println("Segundo catch");
		}finally {
			System.out.println("Despues de la division");
		}
		
		
		/*
		
		String frutas [] = {"Mango", "Pera", "Manzana", "Uva"};
		
		for(String fruta:frutas) {
			System.out.println(fruta);
		} 
		
		*/
		

	}

}
