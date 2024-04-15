//JOption
package account;

import javax.swing.JOptionPane;
public class Account {
    public static void main(String[] args) 
    {
        String firstName = JOptionPane.showInputDialog("Enter first name:");
        String lastName = JOptionPane.showInputDialog("Enter last name:");
        String username = JOptionPane.showInputDialog("Enter username:");
        String password = JOptionPane.showInputDialog("Enter password:");


        Login login = new Login(username, password, firstName, lastName);

        //Register user
        String registerMessage = login.registerUser();
        JOptionPane.showMessageDialog(null, registerMessage);

        //Login
        String enteredUsername = JOptionPane.showInputDialog("Enter username to login:");
        String enteredPassword = JOptionPane.showInputDialog("Enter password to login:");

        boolean loginStatus = login.loginUser(enteredUsername, enteredPassword);
        String loginStatusMessage = login.returnLoginStatus(loginStatus);
        JOptionPane.showMessageDialog(null, loginStatusMessage);
    }
}
     
    
    