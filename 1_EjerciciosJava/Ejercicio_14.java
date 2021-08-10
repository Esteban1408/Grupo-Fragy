import javax.swing.JOptionPane;

public class Ejercicio_14 {

	public static void main(String[] args) {
		//Datos iniciales del menu
		int sel,a=1;
		boolean salir=false;
		
		
		//Este es un bucle el cual no termina hasta que de la opcion de Salir
			while(!salir) {
				sel=Integer.parseInt(JOptionPane.showInputDialog("Eliga una opcion \n1-Sumar \n2-Restar \n3-Multiplicar \n4-Dividir \n5-Salir"));
				int n1,n2,res;
				double n1_1,n2_1,res_1;
				switch(sel) {
				
				case 1:	n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
						n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
						res=n1+n2;
						JOptionPane.showMessageDialog(null, "Resultado: "+res,"SUMA",a);
						break;
				case 2: n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
						n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
						res=n1-n2;
						JOptionPane.showMessageDialog(null, "Resultado: "+res,"RESTA",a);
						
						//Esta parte es por si el usuario desea que se le solo resultados positivos
						/*if(res<0) {
							res*=(-1);
							JOptionPane.showMessageDialog(null, "Resultado: "+res,"RESTA",a);
						}
						else {
							JOptionPane.showMessageDialog(null, "Resultado: "+res,"RESTA",a);
						}*/
						break;
				case 3: n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
						n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
						res=n1*n2;
						JOptionPane.showMessageDialog(null, "Resultado: "+res,"Multiplicación",a);
						break;
				case 4: n1_1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
						n2_1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese otro numero"));
						res_1=n1_1/n2_1;
						JOptionPane.showMessageDialog(null, "Resultado: "+res_1,"División",a);
						break;
				case 5: salir=true;
						break;
				}
			}
	}
}
