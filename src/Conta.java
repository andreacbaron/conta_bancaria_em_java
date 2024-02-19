import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String tipoConta = "corrente";
        int opção = 0;

        System.out.println("Qual e seu nome? ");
        String nome = leitura.nextLine();

        System.out.println("Qual e seu valor em conta");
        double saldo = leitura.nextDouble();


        System.out.println("*****************************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*****************************************");


        String menu = "\n** Digite uma opção **\n" +
                "\n 1-Consultar saldo" +
                "\n 2-Trasferir valor" +
                "\n 3-Receber Valor" +
                "\n 4-sair";


        while (opção != 4) {
            System.out.println(menu);
            opção = leitura.nextInt();

            if (opção == 1) {
                System.out.println("O saldo atualizado " + saldo);
            } else if (opção == 2) {
                System.out.println(" Qual o valor que seseja trasferir ");
                double valor = leitura.nextDouble();

                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a trasferênçia ");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo " + saldo);
                }
            } else if (opção == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo " + saldo);


            } else if (opção == 4) {

                System.out.println("sair");


            } else if (opção != 4) {
                System.out.println("Opção inválida");


            }

        }


    }

}


