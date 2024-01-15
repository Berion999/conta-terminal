import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        Scanner contaTerminal = new Scanner(System.in);

        
        int numero;
        String agencia, nomeCliente;
        double saldo;

        
        System.out.print("Por favor, digite o número da agência: ");
        agencia = contaTerminal.nextLine();

        System.out.print("Agora, digite o número da conta: ");
        numero = contaTerminal.nextInt();
        contaTerminal.nextLine(); 

        System.out.print("Digite o nome do cliente: ");
        nomeCliente = contaTerminal.nextLine();

        System.out.print("Por fim, digite o saldo da conta: ");
        saldo = contaTerminal.nextDouble();

        
      System.out.println("Olá " + contaTerminal.nomeCliente  + ", obrigado por criar uma conta em nosso banco. Sua agência é" + contaTerminal.agencia + ", conta " + contaTerminal.numero + " e seu saldo" + contaTerminal.saldo + "já está disponível para saque.");

        
        contaTerminal.close();
    }
}

