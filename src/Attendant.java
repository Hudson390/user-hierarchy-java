
public non-sealed class Attendant extends User{

    @Override 
    public void MenuUser() {
        
        System.out.println("\n======= MENU =======");
        System.out.println("1 - RECEBER PAGAMENTO");
        System.out.println("2 - FECHAR CAIXA");
        System.out.println("3 - ALTERAR NOME");
        System.out.println("4 - ALTERAR SENHA");
        System.out.println("0 - SAIR");

        System.out.print("\nDigite sua opção: ");
        int option = App.SCANNER.nextInt(); 

        switch (option) {
            case 1 -> this.receivePayment();
            case 2 -> this.closeTheRegister();
            case 3 -> this.changeName();
            case 4 -> this.changePassword();
            case 0 -> {break;}
        
        }
    }

    public void receivePayment(){
        System.out.println("Digite o valor do recebimento: ");
        User.cashOnHand = cashOnHand + App.SCANNER.nextDouble();
        System.out.println("Recebimento realizado com sucesso!!");
        MenuUser();
    }

    public void closeTheRegister(){
        System.out.println("CAIXA FECHADO");
        System.out.println("Total: R$ " + User.cashOnHand);
        MenuUser();
    }


}
