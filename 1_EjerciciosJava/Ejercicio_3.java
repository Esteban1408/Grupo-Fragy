import javax.swing.JOptionPane;

public class Ejercicio_3 {

	public static void main(String[] args) {
		//Lee las letras ingresadas
		char l1,l2;
		int a=1;
		l1=JOptionPane.showInputDialog("Ingrese caracter: ").charAt(0);
		l2=JOptionPane.showInputDialog("Ingrese otro caracter: ").charAt(0);
		
		//Determina si las letras son iguales o no
		if(l1==l2) {
			JOptionPane.showMessageDialog(null, "Las letras ("+ l1 + ") y ("+ l2 + ") son IGUALES", "Comparacion de letras",a);
		}
			else {
			JOptionPane.showMessageDialog(null, "Las letras ("+ l1 + ") y ("+ l2 + ") NO son IGUALES", "Comparacion de letras",a);
		}
		
	}

}
