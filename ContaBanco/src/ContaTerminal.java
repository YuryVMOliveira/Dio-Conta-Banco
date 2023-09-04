import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //objetivo:ler todos os dados do cliente depois os imprimir
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //obtendo os dados
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();
    
        System.out.println("Digite o numero da conta");
        int conta = scanner.nextInt();      

        System.out.println("Digite sua agencia");
        int agencia = scanner.nextInt();  

        System.out.println("Digite o seu saldo");
        double saldo = scanner.nextDouble();

        //imprimindo os dados
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta "+ conta +" e seu saldo "+ saldo +" já está disponível para saque.");
         
        //fechar o scanner
        scanner.close();
    }
}
