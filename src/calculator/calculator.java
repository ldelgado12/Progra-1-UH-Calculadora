package calculator;

import java.io.IOException;
import java.util.Scanner;

public class calculator {

    float firstOperator = 0.0F;
    float secondOperator = 0.0F;
    float result = 0.0F;
    Scanner scanner;
    int answer;

    public calculator() {
        this.scanner = new Scanner(System.in);
    }

    public void askValuesToUser() {
        System.out.println("Por favor ingrese el valor numérico para el primer operador.");
        this.firstOperator = this.scanner.nextFloat();
        System.out.println("Por favor ingrese el valor numérico para el segundo operador.");
        this.secondOperator = this.scanner.nextFloat();
    }

    public void ShowMenu() {

        System.out.println("Por favor seleccione alguna de las siguientes opciones:");
        System.out.println("1. Desea efectuar una suma");
        System.out.println("2. Desea efectuar una resta");
        System.out.println("3. Desea efectuar una divicion");
        System.out.println("4. Desea efectuar una multiplicacion");
        System.out.println("5. Salir");
        System.out.println("Ingrese el numero de la operacion que desea");
        this.answer = this.scanner.nextInt();

    }

    public void start() throws IOException {
        int opcion;
        do {
            ShowMenu();
            opcion = answer;
            procesarOpcion(opcion);
        } while (opcion != 5);

    }

    public void procesarOpcion(int pOpcion) {
        switch (pOpcion)
        {
            case 1:
                add();
                break;
            case 2:
                subtract();
                break;
            case 3:
                divide();
                break;
            case 4:
                multiply();
                break;
            case 5:
                System.out.println("Gracias");
                break;
            default:
                System.out.println("Opcion Invalida");
        }
    }

    public float add() {
        askValuesToUser();
        result= this.firstOperator + this.secondOperator;
        System.out.println("El valor de la suma es: " + result);
        return result;
    }

    //Todo Doing subtract operation
    public float subtract() {
        askValuesToUser();
        result = this.firstOperator - this.secondOperator;
        System.out.println("El valor de la resta es: " + result);
        return result;
    }

    //Todo Doing divide operation
    public float divide() {
        askValuesToUser();
        result =this.firstOperator / this.secondOperator;
        if (secondOperator == 0){
            System.out.println("El digito no se puede dividir en 0");
            return 0;
        }
        System.out.println("El valor de la divicion es: " + result);
        return result;
    }

    //Todo Doing multiply operation
    public float multiply() {
        askValuesToUser();
        result=this.firstOperator * this.secondOperator;
        System.out.println("El valor de la multiplicacion es: " + result);
        return result;
    }



}
