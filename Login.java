package Action;

import java.util.Scanner;
public class Login {

    public static Scanner sc = new Scanner(System.in);
    private String userName, password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void signIn() {
        String username = sc.nextLine();
        setUserName(username);
        if (username.equals("admin")) {
            System.out.print("Nhập mật khẩu: ");
            enterPassword();
        }
    }

    public void enterPassword() {
        String s = sc.nextLine();
        if (s.equals("admin")) setPassword(s);
        else System.out.println("Sai mật khẩu");
    }

}
