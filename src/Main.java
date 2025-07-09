

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


        BudgetManager budgetManager = new BudgetManager();
        double income;
        double expense;
        double limit;
        double balance;

        Scanner sc = new Scanner(System.in);

        System.out.println(" === Bem-vindo ao Controlador Financeiro === ");
        System.out.print("Qual será o limite de gastos mensal que você tem em mente? R$ ");
        limit = sc.nextDouble();
        budgetManager.setOriginalMonthlyLimit(limit);
        //melhoria futura: opção do usuario inserir se ja possui algum montante acumulado

        while (true) {
            System.out.println(" === Controlador Financeiro === ");
            System.out.printf(" Montante acumulado: R$ %.2f\n", budgetManager.getBalance());
            System.out.printf(" Limite restante para o mês: R$ %.2f\n", budgetManager.getMonthlyLimit());
            System.out.println(" === Menu de opções === ");
            System.out.println("1- Inserir entrada.");
            System.out.println("2- Inserir saída.");
            System.out.println("3- Redefinir limite.");
            System.out.println("4- Alterar montante."); //opção de redefinir ou subtrair
            System.out.println("5- Resetar mês.");


            int chosen_option = sc.nextInt();
            sc.nextLine();
            switch (chosen_option) {
                case 1:
                    System.out.print("Qual o valor da entrada? R$ ");
                    income = sc.nextDouble();
                    budgetManager.setBalance(budgetManager.getBalance() + income);
                    break;

                case 2:
                    System.out.print("Qual o valor da saída? R$ "); //pensar alguma forma para caso o gasto ultrapasse o limite, em vez dele ficar negativo, ele subtrair do montante
                    expense = sc.nextDouble();
                    budgetManager.setMonthlyLimit(budgetManager.getMonthlyLimit() - expense);
                    break;

                case 3:
                    System.out.print("Qual o valor do limite mensal desejado? R$ ");
                    limit = sc.nextDouble();
                    budgetManager.setOriginalMonthlyLimit(limit);
                    break;

                case 4:
                    System.out.print("Como deseja definir o montante acumulado? R$ ");
                    balance = sc.nextDouble();
                    budgetManager.setBalance(balance);
                    break;

                case 5:
                    budgetManager.resetLimit();
                    System.out.println("Mês reiniciado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }

    }
}
