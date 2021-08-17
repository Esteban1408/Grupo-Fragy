import javax.swing.JOptionPane;

public class UtilsMain {

	public static void main(String[] args) {
		Utils entrada = new Utils();
		int select;
		boolean salir = false, otraOperacion = false;
		while (!salir && !otraOperacion) {// Este es un bucle el cual no termina hasta que de la opcion de Salir y opcion de operacion
			try {
				select = Integer.parseInt(JOptionPane.showInputDialog(null,"Eliga una opcion \n1-Sumar \n2-Restar \n3-Multiplicar \n4-Dividir \n5-Celsius a Fahrenheit \n6-Area de un Triangulo \n7-Validar una hora exacta \n8-Salir","Calculadora",JOptionPane.INFORMATION_MESSAGE));
				switch (select) {
				case 1:
					entrada.leer();
					entrada.sumar();
					otraOperacion = entrada.hacerOtraOperacion();
					break;
				case 2:
					entrada.leer();
					entrada.restar();
					otraOperacion = entrada.hacerOtraOperacion();
					break;
				case 3:
					entrada.leer();
					entrada.multiplicar();
					otraOperacion = entrada.hacerOtraOperacion();
					break;
				case 4:
					entrada.leerBoolean();
					entrada.division();
					otraOperacion = entrada.hacerOtraOperacion();
					break;
				case 5:
					entrada.celsiusFahrenheit();
					otraOperacion = entrada.hacerOtraOperacion();
					break;
				case 6:
					entrada.areaTriangulo();
					otraOperacion = entrada.hacerOtraOperacion();
					break;
				case 7:
					entrada.horaExacta();
					otraOperacion = entrada.hacerOtraOperacion();
					break;
				case 8:
					salir = true;
					otraOperacion = true;
					break;
				default:
					JOptionPane.showMessageDialog(null, "ELIGA UNA OPCION DEL 1 AL 8 PORFAVOR","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "SOLO ESTAN PERMITIDOS NUMEROS","ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
	
