import javax.swing.JOptionPane;

public class Ejercicio_7 {

	public static void main(String[] args) {
		//Lee los grados ingresados
		int a=1;
		double GC;
		GC=Double.parseDouble(JOptionPane.showInputDialog("Digite grados: (Celsius)"));
		
		//Formula para convertir celsius a Fahrenheit
		double GF=32 + ( (9 * GC) / 5);
		
		//Imprime el resultado
		JOptionPane.showMessageDialog(null, "Grados Celsius: "+ GC+"\nGrados Fahrenheit: "+GF,"Celsius a Fahrenheit",a);
	}

}
