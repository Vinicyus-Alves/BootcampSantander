import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner Scanner = new Scanner(System.in);

        int conta;
        String agencia;
        String nomeDoCliente;
        float saldo =  237.48f;

        System.out.println("Digite seu nome completo: ");
        nomeDoCliente = Scanner.nextLine();
        System.out.println("Digite sua agencia: ");
        agencia = Scanner.nextLine();
        System.out.println("Digite o numero de sua conta: ");
        conta = Scanner.nextInt();

        Scanner.close();

        System.out.print("Olá ".concat(nomeDoCliente) + " Obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agencia é ".concat(agencia) + " Sua conta " + conta);
        System.out.println("Seu saldo " + saldo + " Já está disponivel para saque!");
    }
}
