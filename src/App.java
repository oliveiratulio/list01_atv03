import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int numero1;
        int numero2;
        int soma;
       
        System.out.println("Informe o primeiro numero :");
       numero1 = ler.nextInt();

      System.out.println("Informe o segundo numero :");
      numero2 = ler.nextInt(); 

      soma = numero1 + numero2;
       ler.close();
       
      System.out.println("Resultado:" +soma);

    }
}
