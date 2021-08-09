import javax.swing.JOptionPane;

public class Ejercicio_11 {

	public static void main(String[] args) {
		//Lectura de datos
		int mes,a=1;
		mes=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de mes: "));
		
		//Dependiendo de la respuesta el switch determinar que numero es e imprime el resultado
		switch(mes) {
		case 1: JOptionPane.showMessageDialog(null, "Mes: Enero \nDias: 31","MES Y DIAS",a);
				break;
		case 2: JOptionPane.showMessageDialog(null, "Mes: Febrero \nDias: 28","MES Y DIAS",a);
				break;
		case 3: JOptionPane.showMessageDialog(null, "Mes: Marzo \nDias: 31","MES Y DIAS",a);
				break;
		case 4: JOptionPane.showMessageDialog(null, "Mes: Abril \nDias: 30","MES Y DIAS",a);
				break;
		case 5: JOptionPane.showMessageDialog(null, "Mes: Mayo \nDias: 31","MES Y DIAS",a);
				break;
		case 6: JOptionPane.showMessageDialog(null, "Mes: Junio \nDias: 30","MES Y DIAS",a);
				break;
		case 7: JOptionPane.showMessageDialog(null, "Mes: Julio \nDias: 31","MES Y DIAS",a);
				break;
		case 8: JOptionPane.showMessageDialog(null, "Mes: Agosto \nDias: 31","MES Y DIAS",a);
				break;
		case 9: JOptionPane.showMessageDialog(null, "Mes: Septiembre \nDias: 30","MES Y DIAS",a);
				break;
		case 10: JOptionPane.showMessageDialog(null, "Mes: Octubre \nDias: 31","MES Y DIAS",a);
				break;
		case 11: JOptionPane.showMessageDialog(null, "Mes: Noviembre \nDias: 30","MES Y DIAS",a);
				break;
		case 12: JOptionPane.showMessageDialog(null, "Mes: Diciembre \nDias: 31","MES Y DIAS",a);
				break;
		default: System.out.println("EL NUMERO NO CONCUERDA CON ALGUN MES");
		}

	}

}
