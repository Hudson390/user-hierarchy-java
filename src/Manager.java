import java.util.Scanner;

public non-sealed class Manager extends User {
    
    public Manager(){
        this.administrator = true;
    }

    @Override 
    public void MenuUser() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n======= MENU =======");
        System.out.println("1 - GERAR RELATORIO");
        System.out.println("2 - CONSULTAR VENDAS");
        System.out.println("3 - ALTERAR NOME");
        System.out.println("4 - ALTERAR SENHA");
        System.out.println("0 - SAIR");

        System.out.print("\nDigite sua opção: ");
        int option = scanner.nextInt();  

        switch (option) {
            case 4 -> {
                System.out.println("Digite a nova senha: ");
                String newPassword = scanner.next();

                this.setPassword(newPassword);

                System.out.println("Alteração realizada com sucesso!");

                MenuUser();

            }
            case 0 -> System.exit(0);
        
        }
    }
    
}