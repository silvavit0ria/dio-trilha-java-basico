import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
          
        //criando uma conta bancaria basica com java.//
        Scanner scanner = new Scanner(System.in); // variavel que solicita o usuario a digitar 

        System.out.println("Digite o número da Agência:"); //solicite o user a colocar suas informações
        String agencia = scanner.nextLine(); //variavel scanner + nextLine para a proxima solicitação 

        System.out.println("Digite o número da Conta:");
        int numero = scanner.nextInt(); //atenção no tipo da variavel!!
        scanner.nextLine(); 

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();

        scanner.close(); //fechando o campo de solicitação 
        
        System.out.println("Olá " + nome + ", obrigado por criar sua conta conosco ");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}



    

