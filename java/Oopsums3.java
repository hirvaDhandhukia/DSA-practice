class Account {
    public String name;
    protected String email;
    private String password;

    public String getPassword() {
        return this.password;
    }
    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Oopsums3 {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name="Hirva";
        a1.email="hsdcodes@gmail.com";
        a1.setPassword("abcd");

        System.out.println(a1.name);
        System.out.println(a1.email);
        System.out.println(a1.getPassword());

    }
}
