import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Exibir as mensagens para o usuário
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Por favor digite o número da Conta");
        int numeroConta = scan.nextInt();
        System.out.println("Agência:");
        String agencia = scan.next();
        System.out.println("Nome Completo:");
        scan.next();
        String nome = scan.nextLine();
        System.out.println("Saldo:");
        float saldo = scan.nextFloat();

        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numeroConta +" e seu saldo "+ saldo +" já está disponível para saque");
        scan.close();
    }
}
