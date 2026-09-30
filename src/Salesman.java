
public non-sealed class Salesman extends User {

    @Override
    public void MenuUser() {

        System.out.println("\n======= MENU =======");
        System.out.println("1 - REALIZAR VENDA");
        System.out.println("2 - CONSULTAR VENDAS");
        System.out.println("3 - ALTERAR NOME");
        System.out.println("4 - ALTERAR SENHA");
        System.out.println("0 - SAIR");

        System.out.print("\nDigite sua opção: ");
        int option = App.SCANNER.nextInt();

        switch (option) {
            case 1 -> this.makeASale();
            case 2 -> this.checkSale();
            case 3 -> this.changeName();
            case 4 -> this.changePassword();
            case 0 -> {
                break;
            }

        }
    }

    public void makeASale() {
        var result =  User.amountSales + 1;
        this.setAmountSales(result);
        MenuUser();
    }

    public void checkSale() {
        System.out.println(User.amountSales + " Vendas realizadas.");
        MenuUser();

    }

}
