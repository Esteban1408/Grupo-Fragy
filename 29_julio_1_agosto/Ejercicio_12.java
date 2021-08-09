import javax.swing.JOptionPane;

public class Ejercicio_12 {

	public static void main(String[] args) {
		int n1,n2,a=1;
		n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
		
		if(n1>n2) {
			JOptionPane.showMessageDialog(null, n2+" --> "+n1 ,"Menor a Mayor",a);
		}
		else {
			JOptionPane.showMessageDialog(null, n1+" --> "+n2 ,"Menor a Mayor",a);
		}
	}

}
