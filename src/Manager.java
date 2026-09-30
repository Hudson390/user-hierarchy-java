
public non-sealed class Manager extends User {

    public Manager() {
        this.administrator = true;
    }

    @Override
    public void MenuUser() {

        System.out.println("\n======= MENU =======");
        System.out.println("1 - GERAR RELATORIO");
        System.out.println("2 - CONSULTAR VENDAS");
        System.out.println("3 - ALTERAR NOME");
        System.out.println("4 - ALTERAR SENHA");
        System.out.println("0 - SAIR");

        System.out.print("\nDigite sua opção: ");
        int option = App.SCANNER.nextInt();

        switch (option) {
            case 1 -> this.generateFinancialReport();
            case 2 -> this.checkSale();
            case 3 -> this.changeName();
            case 4 -> this.changePassword();
            case 0 -> {
                break;
            }

        }
    }

    public void generateFinancialReport() {
        System.out.println("Valor total em caixa: R$ " + User.cashOnHand);
        MenuUser();
    }

    public void checkSale() {
        System.out.println(User.amountSales + " Vendas realizadas.");
        MenuUser();
    }

}