import javax.swing.JOptionPane;

public class UtilsMain {
	static double number1, number2;
	static int hora, minuto, segundo, amPm;

	public static void leerDatos(int select) {
		if (select >= 0 && select <= 3 || select == 10) {
			number1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
			number2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
		} else if (select == 4) {
			do {
				number1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
				number2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
				if (number2 == 0) {
					JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");
				}
			} while (number2 == 0);
		} else if (select == 5) {
			number1 = Double.parseDouble(JOptionPane.showInputDialog("Digite grados: (Celsius)"));
		} else if (select == 6) {
			number1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del triangulo "));
			number2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura del triangulo "));
		} else if (select == 7) {
			hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora "));
			minuto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el minuto "));
			segundo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo "));
			amPm = Integer.parseInt(JOptionPane.showInputDialog("¿AM o PM? " + "\n  0       1"));
		} else if (select == 8 || select == 9) {
			number1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
		}
	}

	public static void main(String[] args) {
		int select;
		boolean salir = false, otraOperacion = false;
		String mensaje;
		try {
			while (!salir && !otraOperacion) {
				select = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Eliga una opcion \n1-Sumar \n2-Restar \n3-Multiplicar \n4-Dividir \n5-Celsius a Fahrenheit \n6-Area de un Triangulo \n7-Validar una hora exacta \n8-Numero par o impar \n9-Determinar si un numero es de 0 a 9 \n10-Organizar numeros de menor a mayor \n11-Salir",
						"Calculadora ", JOptionPane.INFORMATION_MESSAGE));
				Utils entrada = new Utils();

				switch (select) {
				case 1:
					leerDatos(select);
					mensaje = entrada.sumar(number1, number2);
					imprimirResultado(mensaje);
					otraOperacion = entrada.hacerOtraOperacion();

					break;
				case 2:
					leerDatos(select);
					mensaje = entrada.restar(number1, number2);
					imprimirResultado(mensaje);
					otraOperacion = entrada.hacerOtraOperacion();
					break;
				case 3:
					leerDatos(select);
					mensaje = entrada.multiplicar(number1, number2);
					imprimirResultado(mensaje);
					otraOperacion = entrada.hacerOtraOperacion();
					break;
				case 4:
					leerDatos(select);
					mensaje = entrada.division(number1, number2);
					imprimirResultado(mensaje);
					otraOperacion = entrada.hacerOtraOperacion();
					break;
				case 5:
					leerDatos(select);
					mensaje = entrada.celsiusFahrenheit(number1);
					imprimirResultado(mensaje);
					otraOperacion = entrada.hacerOtraOperacion();
					break;
				case 6:
					leerDatos(select);
					mensaje = entrada.areaTriangulo(number1, number2);
					imprimirResultado(mensaje);
					otraOperacion = entrada.hacerOtraOperacion();
					break;
				case 7:
					leerDatos(select);
					mensaje = entrada.horaExacta(hora, minuto, segundo, amPm);
					imprimirResultado(mensaje);
					otraOperacion = entrada.hacerOtraOperacion();
					break;
				case 8:
					leerDatos(select);
					mensaje = entrada.validarNumeroParImpar(number1);
					imprimirResultado(mensaje);
					otraOperacion = entrada.hacerOtraOperacion();
					break;
				case 9:
					leerDatos(select);
					mensaje = entrada.validarNumeroDe0a9(number1);
					imprimirResultado(mensaje);
					otraOperacion = entrada.hacerOtraOperacion();
					break;
				case 10:
					leerDatos(select);
					mensaje = entrada.validarNumerosMenorMayor(number1, number2);
					imprimirResultado(mensaje);
					otraOperacion = entrada.hacerOtraOperacion();
					break;
				case 11:
					salir = true;
					otraOperacion = true;
					break;
				default:
					JOptionPane.showMessageDialog(null, "ELIGA UNA OPCION DEL 1 AL 11 PORFAVOR", "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
					break;
				}
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "SOLO ESTAN PERMITIDOS NUMEROS", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void imprimirResultado(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}
}