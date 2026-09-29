import java.util.Scanner;

public abstract sealed class User permits Manager, Salesman, Attendant {
    protected String name;

    protected String email;

    protected String password;

    protected boolean administrator = false;

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

    public static void loginUser(User user){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo " + user.name);
        System.out.println("Digite seu email: ");
        String email = scanner.next();
        System.out.println("Digite sua senha: ");
        String password = scanner.next();

        if (email.equalsIgnoreCase(user.getEmail()) && password.equals(user.getPassword())) {
            System.out.println("Login realizado com sucesso!");
            user.MenuUser();
        } else{
            System.out.println("Email ou Senha incorreta");
        }

    }

    public abstract void MenuUser();

}
