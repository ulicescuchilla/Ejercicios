import java.util.Scanner;

public class Bisiesto {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        // Ingresar
        System.out.println("/nIntroduce un año: ");
        int year = sn.nextInt();

        //Si es divisible entre 4 y no es divisible entre 100 o es divisible entre 100 y 400.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println("/nEl año " + year + " es bisiesto/n");
        } else {
            System.out.println("/nEl año " + year + " no es bisiesto/n");
        }

    }

}
