import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        var manager = new Manager();

        manager.setName("Hudson Costa");
        manager.setEmail("Hudson@gmail.com");
        manager.setPassword("1234");

        var salesman = new Salesman();

        salesman.setName("Carlos Daniel");
        salesman.setEmail("Carlos@gmail.com");
        salesman.setPassword("56789");
        salesman.setAmountSales(5);

        var attendant = new Attendant();

        attendant.setName("Igor Lopes");
        attendant.setEmail("Igorlp@gmail.com");
        attendant.setPassword("146832");


        do{

            Scanner scanner = new Scanner(System.in);
        
            System.out.println("\n======= MENU =======");
            System.out.println("1 - GERENTE");
            System.out.println("2 - VENDENDOR");
            System.out.println("3 - ATENDENTE");
            System.out.println("0 - SAIR");

            System.out.print("\nDigite sua opção: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> Manager.loginUser(manager);
                case 2 -> User.loginUser(salesman);
                case 3 -> User.loginUser(attendant);
                case 0 -> System.exit(0);
        
            }
        }while(true);

        
    }

        
       

    public static  void displayUsers(Manager manager, Salesman salesman, Attendant attendant){

        System.out.println("\n======= GERENTE =======");
        System.out.println("Nome: " + manager.getName());
        System.out.println("Email: " + manager.getEmail());
        System.out.println("Senha: " + manager.getPassword());
        System.out.println("Administrador: " + manager.administrator);

        System.out.println("\n======= VENDENDOR =======");
        System.out.println("Nome: " + salesman.getName());
        System.out.println("Email: " + salesman.getEmail());
        System.out.println("Senha: " + salesman.getPassword());
        System.out.println("Administrador: " + salesman.administrator);
        System.out.println("Total de vendas: " + salesman.getAmountSales());

        System.out.println("\n======= ATENDENTE =======");
        System.out.println("Nome: " + attendant.getName());
        System.out.println("Email: " + attendant.getEmail());
        System.out.println("Senha: " + attendant.getPassword());
        System.out.println("Administrador: " + attendant.administrator);

        System.out.println("=======================");
    }
}
