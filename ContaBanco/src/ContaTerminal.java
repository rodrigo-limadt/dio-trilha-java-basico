import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por Favor, digite o número da sua agência!");
        String agencia = scanner.next();

        System.out.println("Por Favor, digite o número da sua conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por Favor, digite seu nome!");
        String nome = scanner.next();

        System.out.println("Por Favor, digite seu sobrenome!");
        String sobreNome = scanner.next();

        System.out.println("Por Favor, digite seu saldo!");
        double saldo = scanner.nextDouble();


        System.out.println(" Olá " +  nome  +" "+ sobreNome +  ", obrigado por criar uma conta em nosso banco, sua agência é "  +  agencia +
        ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque. ");


    }
}
