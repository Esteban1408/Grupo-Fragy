import javax.swing.JOptionPane;

public class Ejercicio_5 {

	public static void main(String[] args) {
		try {
		int n;
		n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
		
		if( n<=9 && n>=0) {
			JOptionPane.showMessageDialog(null, n+" si es un numero :)");
		}
		else {
			System.out.println("Debe ser entre 0 a 9");
		}
		
		
		}catch(Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "SOLO PUEDE INGRESAR NUMEROS");
		}
	}

}
