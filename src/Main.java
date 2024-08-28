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

//  5)  int num;
//      System.out.print(" ingrese un numero que quiera saber si es divisible por 2: ");
//      num = sc.nextInt();
//      if (num % 2 == 0){
//          System.out.println(" el numero ingresado es divisible por 2");
//      }else{
//          System.out.println(" el numero ingresado no es divisible por 2");
//      }
//  6)  int precio;
//      System.out.print("Ingrese el precio del producto: ");
//      precio = sc.nextInt();
//      double precioFinal = precio + (precio * 1.21);
//      System.out.println("El precio final con IVA es: " + precioFinal);

//  7)      int i = 1;
//          while (i <= 100) {
//          System.out.println(i);
//          i++;
//          }
//  8)      for (int i = 1; i <= 100; i++) {
//              System.out.println(i);
//          }
//  9)    int i = 1;
//        while (i <= 100) {
//            if (i % 3 == 0){
//                if (i % 2 ==0) {
//                    System.out.println(i);
//                }
//            }
//            i++;
//        }
//    10)     int numero;
//            System.out.print("Ingrese un número mayor o igual a cero: ");
//            numero = sc.nextInt();
//            if (numero < 0){
//                do {
//                    System.out.println("El número ingresado es negativo. Inténtelo de nuevo.");
//                    System.out.print("Ingrese un número mayor o igual a cero: ");
//                    numero = sc.nextInt();
//                    if (numero>=0){
//                        System.out.println("El número ingresado: "+numero+" es mayor o igual a 0 ");
//                    }
//                } while (numero <0);
//            }else if (numero>=0){
//            System.out.println("El número ingresado: "+numero+" es mayor o igual a 0 ");
    //        }

//  11)   String contrasenaIngresada;
//        String CONTRASENA_CORRECTA;
//        int intentosMaximos = 3;
//        int intentosRestantes = intentosMaximos;
////        creo la primera contraseña
//        System.out.print("Cree la contraseña: ");
//        contrasenaIngresada = sc.nextLine();
////        ingreso de seguridad
//        System.out.print("Ingrese la contraseña: ");
//        CONTRASENA_CORRECTA= sc.nextLine();
//        if (contrasenaIngresada.equals(CONTRASENA_CORRECTA)) {
//            System.out.println("Acceso Correcto");
//            System.out.println("Bienvenido Usuario");
//        } else if (contrasenaIngresada != CONTRASENA_CORRECTA) {
//            do {
//                if (intentosRestantes > 0) {
//                    System.out.println("Contraseña incorrecta. Intentos restantes: " + intentosRestantes);
//                    System.out.println("Escriba nuevamente la contraseña: ");
//                    CONTRASENA_CORRECTA = sc.nextLine();
//                        if (contrasenaIngresada.equals(CONTRASENA_CORRECTA)) {
//                            System.out.println("Acceso Correcto");
////                         break;
//                        }
//                }else {
//                    System.out.println("Número máximo de intentos alcanzado. Acceso denegado.");
//                    break;
//                }
//                intentosRestantes--;
//            }while (contrasenaIngresada != CONTRASENA_CORRECTA);
//        }
//-----------------------------------------------------------------------------------------
//  12)   int dia;
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
//  13)   int numero;
//        System.out.print("Ingrese un número para verificar si es primo: ");
//        numero = sc.nextInt();
//        // Verificar si el número es menor o igual que 1
//        if (numero <= 1) {
//            System.out.println(numero + " no es un número primo.");
//        } else {
//            if (numero % 2 == 0) {
//                System.out.println(numero + " es un número primo.");
//            } else {
//                System.out.println(numero + " no es un número primo.");
//            }
//        }
// -----------------------------------------------------------------------------------------
        int numAleeatorio = (int)(Math.random() * 100);
        int intentoUsuario;
        int intentos = 0;
        System.out.println("¡Bienvenido a las adivinanzas!");
        System.out.println("En que numero abre pensado? ");
        do {
            System.out.print("Ingresa tu intento: ");
            intentoUsuario = sc.nextInt();
            intentos++;
            if (intentoUsuario < numAleeatorio) {
                System.out.println("El número es mayor.");
            } else if (intentoUsuario > numAleeatorio) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
                System.out.println("Número de intentos: " + intentos);
            }
        } while (intentoUsuario != numAleeatorio);

    }
}