import java.util.Scanner;

public abstract sealed class User permits Manager, Salesman, Attendant {
    protected String name;

    protected String email;

    protected String password;

    protected boolean administrator = false;
    
    protected static int amountSales;

    protected static  double cashOnHand;

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setCashOnHand(double cashOnHand) {
        User.cashOnHand = cashOnHand;
    }


    public int getAmountSales() {
        return amountSales;
    }

    public void setAmountSales(int amountSales) {
        User.amountSales += amountSales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdministrator() {
        return administrator;
    }

    public void setAdministrator(boolean administrator) {
        this.administrator = administrator;
    }

    public static void loginUser(User user) {

        System.out.println("Bem vindo " + user.name);
        System.out.println("Digite seu email: ");
        String email = App.SCANNER.next();
        System.out.println("Digite sua senha: ");
        String password = App.SCANNER.next();

        if (email.equalsIgnoreCase(user.getEmail()) && password.equals(user.getPassword())) {
            System.out.println("Login realizado com sucesso!");
            user.MenuUser();
        } else {
            System.out.println("Email ou Senha incorreta");
        }

    }

    public abstract void MenuUser();

    Scanner scanner = new Scanner(System.in);

    public void changePassword() {
        System.out.println("Digite a nova senha: ");
        String newPassword = scanner.next();

        this.setPassword(newPassword);

        System.out.println("Alteração realizada com sucesso!");

        MenuUser();
    }

    public void changeName() {
        System.out.println("Digite o novo nome: ");
        String newName = scanner.next();

        this.setName(newName);

        System.out.println("Alteração realizada com sucesso!");

        MenuUser();
    }

}
