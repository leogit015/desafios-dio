import java.util.Scanner;

public class ContaTerminal {


   private int numero;
   private String agencia;
   private double saldo;
   private String nomeCliente;


   public ContaTerminal() {
   }


   public ContaTerminal(int numero, String agencia, double saldo, String nomeCliente) {
      this.numero = numero;
      this.agencia = agencia;
      this.saldo = saldo;
      this.nomeCliente = nomeCliente;
   }


   public int getNumero() {
      return numero;
   }

   public void setNumero(int numero) {
      this.numero = numero;
   }

   public String getAgencia() {
      return agencia;
   }

   public void setAgencia(String agencia) {
      this.agencia = agencia;
   }

   public double getSaldo() {
      return saldo;
   }

   public void setSaldo(double saldo) {
      this.saldo = saldo;
   }

   public String getNomeCliente() {
      return nomeCliente;
   }

   public void setNomeCliente(String nomeCliente) {
      this.nomeCliente = nomeCliente;
   }


   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ContaTerminal conta = new ContaTerminal();


      System.out.print("Digite o nome do cliente: ");
      conta.setNomeCliente(sc.nextLine());

      System.out.print("Digite o número da conta: ");
      conta.setNumero(sc.nextInt());

      sc.nextLine(); // Consome o newline

      System.out.print("Digite a agência: ");
      conta.setAgencia(sc.nextLine());

      System.out.print("Digite o saldo: ");
      conta.setSaldo(sc.nextDouble());


      System.out.println("Olá " + conta.getNomeCliente() +
              ", obrigado por criar uma conta em nosso banco. Sua agência é " + conta.getAgencia() +
              ", conta " + conta.getNumero() +
              " e seu saldo R$ " + conta.getSaldo() + " já está disponível para saque.");



      sc.close();
   }
}
