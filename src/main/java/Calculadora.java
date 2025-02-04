import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //scan.useLocale(Locale.US);

        System.out.println("Escolha qual operação você deseja executar");
        System.out.println("Digite 1 para Adição");
        System.out.println("Digite 2 para Subtração");
        System.out.println("Digite 3 para Multiplicação");
        System.out.println("Digite 4 para Divisão");

        int operacao;

        while (true){
            operacao = scan.nextInt();
            if (operacao >= 1 && operacao <= 4){
                break;
            }else {
                System.out.println("Por favor escolha uma opção válida: 1,2,3 ou 4");
            }
        }

        System.out.println("Digite o primeiro número");
        double num1 = scan.nextDouble();

        System.out.println("Digite o segundo número");
        double num2 = scan.nextDouble();

        double resultado;

        switch (operacao){
            case 1:
                resultado = num1 + num2;
                System.out.println("O valor de "+ num1 +" + "+num2+" é: "+ resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("O valor de "+ num1 +" - "+num2+" é: "+ resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("O valor de "+ num1 +" * "+num2+" é: "+ resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println("O valor de "+ num1 +" / "+num2+" é: "+ resultado);
                break;
            default:
                System.out.println("Por favor, escolha uma opção válida");
                break;
        }
        scan.close();
    }

}
