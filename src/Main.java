import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Insira o número da sua conta: ");
                if (!scanner.hasNextInt()) {
                    System.out.println("Número da conta inválido. Por favor, reinicie e insira um número inteiro.");
                    return;
                }
                int numeroConta = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Insira o número da agencia com digito: ");
                String numeroAgencia = scanner.next();

                System.out.print("Insira o nome do cliente: ");
                scanner.nextLine();
                String nomeCliente = scanner.nextLine();

                System.out.print("Insira o saldo da conta: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Saldo inválido. Por favor, insira um valor numérico.");
                    scanner.next();
                    System.out.print("Insira o saldo da conta: ");
                }
                double saldoConta = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Olá, " + nomeCliente + "! Aqui estão os detalhes da sua conta:");
                System.out.println("Número da conta: " + numeroConta);
                System.out.println("Número da agência: " + numeroAgencia);
                System.out.println("Você possui: R$" + saldoConta + " disponivel para saque em sua conta.");
            }
        }