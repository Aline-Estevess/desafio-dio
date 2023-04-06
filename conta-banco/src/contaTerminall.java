import java.util.Locale;
import java.util.Scanner;

public class contaTerminall {
    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o seu nome: ");
        String cliente = scanner.next();

        double saldo = 237.48; 

        System.out.println();

        System.out.println(" Olá " + cliente + "," +  " obrigado por criar uma conta em nosso banco,"); 
        System.out.println(" sua agencia é "  +  agencia + ","  +  " conta "  +  numeroConta); 
        System.out.println(" e seu saldo de " + saldo + " já está disponível para saque. ");

        System.out.println();

        scanner.close();
    }
}
