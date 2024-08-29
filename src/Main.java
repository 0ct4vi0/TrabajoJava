import javax.swing.*;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//--------------------{iNGRESO DE dATOS}-------------------
//     1)   System.out.print("ingrese su nombre ");
//          nombre = sc.nextLine();
//          System.out.println("Bienvenido " + nombre);
//     2)   String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
//          JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);

//-----------------{OPERADORES RELACIONALES}----------------------------
//  3)    int num1;
//        int num2;
//        int suma;
//        int resta;
//        float div;
//        float mul;
//        System.out.print(" Ingrese el primer numero ");
//        num1 = sc.nextInt();
//        System.out.print(" Ingrese el segundo numero ");
//        num2 = sc.nextInt();
//        suma = num1+num2;
//        resta= num1-num2;
//        div= num2%num1;
//        mul= num1*num2;
//        System.out.println("la suma de los numeros es " + suma);
//        System.out.println("la resta de los numeros es " + resta);
//        System.out.println("la divicion de los numeros es " + div);
//        System.out.println("la multiplicacion de los numeros es " + mul);
//-----------------------------------------
//  4)      int num1;
//          int num2;
//          System.out.print(" Ingrese el primer numero ");
//          num1 = sc.nextInt();
//          System.out.print(" Ingrese el segundo numero ");
//          num2 = sc.nextInt();
//          if (num1<num2){
//              System.out.print(" el numero "+num2+" es mayor");
//          }else if (num1==num2){
//              System.out.print(" los numeros ingresados son iguales");
//          }else {
//              System.out.print(" el numero "+num1+" es mayor");
//          }
//-------------------------------------------------------------
//  5)  int num;
//      System.out.print(" ingrese un numero que quiera saber si es divisible por 2: ");
//      num = sc.nextInt();
//      if (num % 2 == 0){
//          System.out.println(" el numero ingresado es divisible por 2");
//      }else{
//          System.out.println(" el numero ingresado no es divisible por 2");
//      }
// ----------------------------------------------
//  6)
//      int precio;
//      System.out.print("Ingrese el precio del producto: ");
//      precio = sc.nextInt();
//      double precioFinal = precio + (precio * 1.21);
//      System.out.println("El precio final con IVA es: " + precioFinal);
//---------------------------------------------------------
//  7)
//          int i = 1;
//          while (i <= 100) {
//          System.out.println(i);
//          i++;
//          }
//  ------------------------------------------------
//  8)
//          for (int i = 1; i <= 100; i++) {
//              System.out.println(i);
//          }
//
// -------------------------------------------------
// 9)
//        int i = 1;
//        while (i <= 100) {
//            if (i % 3 == 0){
//                if (i % 2 ==0) {
//                    System.out.println(i);
//                }
//            }
//            i++;
//        }
//------------------------------------------------
//  10)
//            int numero;
//            do {
//                System.out.print("Ingrese un número mayor o igual a cero: ");
//                numero = sc.nextInt();
//                if (numero < 0){
//                    System.out.println("El número ingresado es negativo. Inténtelo de nuevo.");
//                }else if (numero>=0) {
//                    System.out.println("El número ingresado: " + numero + " es mayor o igual a 0 ");
//                    break;
//                }
//            } while (numero < 0);
//--------------------------------------------------------
//  11)
//        String contrasenaIngresada;
//        String CONTRASENA_CORRECTA = "mariaines09";
//        int intentos=0;
////        inicio el bucle
//        while(true) {
//                System.out.print("Ingrese la contraseña: ");
//                contrasenaIngresada = sc.nextLine();
//                intentos++;
//                if (contrasenaIngresada.equals(CONTRASENA_CORRECTA)) {
//                    System.out.println("Acceso Correcto");
//                    System.out.println("Bienvenido Usuario");
//                    break;
//                }else {
//                    if (intentos==3) {
//                        System.out.println("Número máximo de intentos alcanzado. Acceso denegado.");
//                        break;
//                    }
//                    System.out.println("La contraseña es incorrecta.Acceso denegado");
//                }
//        }
//-----------------------------------------------------------------------------------------
//  12)
//        int dia;
//        do {
//            System.out.print("Ingrese el número del día de la semana (1 para lunes, 7 para domingo): ");
//            dia = sc.nextInt();
//            // Validar que el número esté en el rango de 1 a 7
//            if (dia < 1 || dia > 7) {
//                System.out.println("Número inválido. Por favor, ingrese un número entre 1 y 7.");
//            }
//            // Continuar pidiendo el número mientras sea inválido
//        } while (dia < 1 || dia > 7);
//        switch (dia) {
//            case 1: // Lunes
//            case 2: // Martes
//            case 3: // Miércoles
//            case 4: // Jueves
//            case 5: // Viernes
//                System.out.println("Es un día laboral.");
//                break;
//            case 6: // Sábado
//            case 7: // Domingo
//                System.out.println("No es un día laboral.");
//        }
// ---------------------------------------------------------------------------------------
//  13)
//        int numero;
//        int i;
//        int contador=0;
//        System.out.print("Ingrese un número para verificar si es primo: ");
//        numero = sc.nextInt();
//        // Verificar si el número es menor o igual que 1
//        for (i=1;i<=numero;i++){
//            int aux= numero%i;
//            if (aux == 0) {
//                contador = contador + 1;
//            }
//        }
//        if (contador<=2){
//            System.out.println("tu numero es primo");
//        }else {
//            System.out.println("tu numero no es primo");
//        }
// -----------------------------------------------------------------------------------------
//  14)
//        int numAleeatorio = (int)(Math.random() * 100);
//        int intentoUsuario;
//        int intentos = 0;
//        System.out.println("¡Bienvenido a las adivinanzas!");
//        System.out.println("En que numero abre pensado? ");
//        do {
//            System.out.print("Ingresa tu intento: ");
//            intentoUsuario = sc.nextInt();
//            intentos++;
//            if (intentoUsuario < numAleeatorio) {
//                System.out.println("El número es mayor.");
//            } else if (intentoUsuario > numAleeatorio) {
//                System.out.println("El número es menor.");
//            } else {
//                System.out.println("¡Felicidades! Has adivinado el número.");
//                System.out.println("Número de intentos: " + intentos);
//            }
//        } while (intentoUsuario != numAleeatorio);

    }
}