import javax.swing.JOptionPane;
public class Ejercicio_13 {

	public static void main(String[] args) {
		// Programa Java que lea dos números y muestre los números pares entre ellos
		int n1,n2;
		n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
		n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
		
		if(n1<n2) {//Esta parte determina si el primer numero es menor al segundo numero ingresado
			System.out.println("LOS NUMEROS PARES ENTRE "+n1+" y "+n2+" SON: ");
			for(;n1<=n2;n1++) {//Este ciclo for es para poner el limite de los numeros y a su vez que vaya aumentando el numero menor
				if(n1%2==0) {
					System.out.println(n1);
				}
			}
		}else {//Esta parte determina si el segundo numero es menor al primer numero ingresado
			System.out.println("LOS NUMEROS PARES ENTRE "+n2+" y "+n1+" SON: ");
			for(;n2<=n1;n2++) {//Este ciclo for es para poner el limite de los numeros y a su vez que vaya aumentando el numero menor
				if(n2%2==0) {
					System.out.println(n2);
				}
			}
		}
	}
}
