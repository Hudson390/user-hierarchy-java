public class App {
    public static void main(String[] args) {
        
        var manager = new Manager();

        manager.setName("Hudson Costa");
        manager.setEmail("Hudson@gmail.com");
        manager.setPassword("1234");


        System.out.println("\n======= GERENTE =======");
        System.out.println("Nome: " + manager.getName());
        System.out.println("Email: " + manager.getEmail());
        System.out.println("Senha: " + manager.getPassword());
        System.out.println("Administrador: " + manager.administrator);
        
        var salesman = new Salesman();

        salesman.setName("Carlos Daniel");
        salesman.setEmail("Carlos@gmail.com");
        salesman.setPassword("56789");


        System.out.println("\n======= VENDENDOR =======");
        System.out.println("Nome: " + salesman.getName());
        System.out.println("Email: " + salesman.getEmail());
        System.out.println("Senha: " + salesman.getPassword());
        System.out.println("Administrador: " + salesman.administrator);
        
        var attendant = new Attendant();

        attendant.setName("Igor Lopes");
        attendant.setEmail("Igorlp@gmail.com");
        attendant.setPassword("146832");


        System.out.println("\n======= ATENDENTE =======");
        System.out.println("Nome: " + attendant.getName());
        System.out.println("Email: " + attendant.getEmail());
        System.out.println("Senha: " + attendant.getPassword());
        System.out.println("Administrador: " + attendant.administrator);
        System.out.println("=======================");
    }
}
