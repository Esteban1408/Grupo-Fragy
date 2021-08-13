import javax.swing.JOptionPane;

public class UtilsMain {

	public static void main(String[] args) {
		Utils Entrada = new Utils ();
		int sel,a=1;
		boolean salir=false,operacion=false;
		
		//Este es un bucle el cual no termina hasta que de la opcion de Salir
			while(!salir) {
				while(!operacion) {//Este es otro bucle para cada operacion de si desea regresar o salir
				sel=Integer.parseInt(JOptionPane.showInputDialog("Eliga una opcion \n1-Sumar \n2-Restar \n3-Multiplicar \n4-Dividir \n5-Salir"));
				int n1,n2,res,conti;
				double n1_1,n2_1,res_1;
				switch(sel) {
				case 1:	try {
						n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
						n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
						res=Entrada.sumar(n1,n2);
						JOptionPane.showMessageDialog(null, "Resultado: "+res,"SUMA",a);
						conti=Integer.parseInt(JOptionPane.showInputDialog("Desea hacer otra operacion? \n Si=1        No=0"));
							if(conti==0) {
								operacion=true;
							}
							
						}catch(Exception e) {
							JOptionPane.showMessageDialog(null, "SOLO ESTAN PERMITIDOS NUMEROS");
						}
						
						break;
				case 2: try{
						n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
						n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
						res=Entrada.restar(n1,n2);
						JOptionPane.showMessageDialog(null, "Resultado: "+res,"RESTA",a);
						
						//Esta parte es por si el usuario desea que se le solo resultados positivos
							/*if(res<0) {
								res*=(-1);
								JOptionPane.showMessageDialog(null, "Resultado: "+res,"RESTA",a);
							}
							else {
								JOptionPane.showMessageDialog(null, "Resultado: "+res,"RESTA",a);
							}*/
						
						conti=Integer.parseInt(JOptionPane.showInputDialog("Desea hacer otra operacion? \n Si=1        No=0"));
							if(conti==0) {
								operacion=true;
							}
						}catch(Exception e) {
							JOptionPane.showMessageDialog(null, "SOLO ESTAN PERMITIDOS NUMEROS");
						}	
						break;
				case 3: try{
							n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
							n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
							res=Entrada.multiplicar(n1,n2);
							JOptionPane.showMessageDialog(null, "Resultado: "+res,"Multiplicación",a);
							conti=Integer.parseInt(JOptionPane.showInputDialog("Desea hacer otra operacion? \n Si=1        No=0"));
							if(conti==0) {
								operacion=true;
							}
						}catch(Exception e) {
							JOptionPane.showMessageDialog(null, "SOLO ESTAN PERMITIDOS NUMEROS");
						}
						break;
				case 4: try{
							n1_1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
							n2_1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese otro numero"));
							res_1=Entrada.division(n1_1,n2_1);
							JOptionPane.showMessageDialog(null, "Resultado: "+res_1,"División",a);
							conti=Integer.parseInt(JOptionPane.showInputDialog("Desea hacer otra operacion? \n Si=1        No=0"));
							if(conti==0) {
								operacion=true;
							}
						}catch(Exception e) {
							JOptionPane.showMessageDialog(null, "SOLO ESTAN PERMITIDOS NUMEROS");
						}
						break;
				case 5: salir=true;operacion=true;
						break;
				default:JOptionPane.showMessageDialog(null, "ELIGA UNA OPCION DEL 1 AL 5 PORFAVOR");
					}
				}
			}
	}

}
