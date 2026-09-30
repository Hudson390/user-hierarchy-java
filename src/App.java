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
        attendant.setEmail("Igor@gmail.com");
        attendant.setPassword("146832");
        attendant.setCashOnHand(0);

        do {

            Scanner scanner = new Scanner(System.in);

            System.out.println("\n======= MENU =======");
            System.out.println("1 - GERENTE");
            System.out.println("2 - VENDENDOR");
            System.out.println("3 - ATENDENTE");
            System.out.println("0 - SAIR");

            System.out.print("\nDigite sua opção: ");
            int option = SCANNER.nextInt();

            switch (option) {
                case 1 -> Manager.loginUser(manager);
                case 2 -> User.loginUser(salesman);
                case 3 -> User.loginUser(attendant);
                case 0 -> {
                    System.exit(0);
                    scanner.close();
                }

            }
        } while (true);

    }

    public static final Scanner SCANNER = new Scanner(System.in);

}
