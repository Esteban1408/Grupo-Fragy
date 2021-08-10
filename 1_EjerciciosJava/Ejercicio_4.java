import javax.swing.JOptionPane;

public class Ejercicio_4 {

	public static void main(String[] args) {
		//Lee el numero a ingresar
		int n;
		int a=1;
		n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		
		//Con esta operacion se determina el residuo de la division del numero
		int PI=n%2;
		
		//Si en la operacion da 0 es par pero si da otro resultado (1.2) es impar
		if(PI==0) {
			JOptionPane.showMessageDialog(null, "Es PAR", "Par o Impar",a);
		}
			else {
			JOptionPane.showMessageDialog(null, "Es IMPAR", "Par o Impar",a);
		}
		
	}

}
