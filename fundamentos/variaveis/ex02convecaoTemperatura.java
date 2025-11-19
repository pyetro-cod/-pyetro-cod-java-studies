package fundamentos.variaveis;

public class ex02convecaoTemperatura {
	public static void main (String[] args) {
		double tempCelcius = 20.0;
		
		double form = tempCelcius * 9/5 + 32;
		System.out.println("A conversão de " + tempCelcius + "C para Fahrenheit é "+ form + "F" );
	}
}
