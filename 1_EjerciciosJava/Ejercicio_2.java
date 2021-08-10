import javax.swing.JOptionPane;
public class Ejercicio_2 {

	public static void main(String[] args) {
		//Variables para ingresar los numeros
		int n1,n2;
		n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
		
		//Operacion
		int suma=n1+n2;
		
		//Imprime resultado
		JOptionPane.showMessageDialog(null, "La suma es "+suma, "Suma de 2 numeros",suma);
	}

}
