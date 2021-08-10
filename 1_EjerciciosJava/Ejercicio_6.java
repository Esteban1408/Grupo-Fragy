import javax.swing.JOptionPane;

public class Ejercicio_6 {

	public static void main(String[] args) {
		//Lee los numeros
		int n1,n2,n3;
		n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero (1)"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero (2)"));
		n3=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero (3)"));
		
		//Determina que valor de los 3 es mayor
		if(n1==n2 && n2==n3) {
			JOptionPane.showMessageDialog(null, "TODOS LOS NUMEROS SON IGUALES");
		}
			else if(n1>n2 && n1>n3) {
				JOptionPane.showMessageDialog(null, "El numero mayor es: "+n1);
			}
			else if(n2>n1 && n2>n3) {
				JOptionPane.showMessageDialog(null, "El numero mayor es: "+n2);
			}
			else {
				JOptionPane.showMessageDialog(null, "El numero mayor es: "+n3);
			}
	}

}
