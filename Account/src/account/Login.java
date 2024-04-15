//JOption
package account;
class Login {
    private String username;
    private String password;
    private String firstName;
    private String lastName;

//Constructor
    public Login(String username, String password, String firstName, String lastName) 
    {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

//Getters & Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {    
        this.lastName = lastName;
    }

    //Method to check if username is correctly formatted
    public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }

    
// Method to check password complexity
public boolean checkPasswordComplexity()        
{
String regex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
return password.matches(regex);
        }
/*
Title:Java regex validate password examples
Author:Mkyong
Date:10 April 2024
Code version:1 
Availability:https://mkyong.com/regular-expressions/how-to-validate-password-with-regular-expression/
 */

        
// Method to register a user
    public String registerUser() {
        if (checkUserName() && checkPasswordComplexity()) 
        {
            return "Registration successful";
        } else {
            StringBuilder message = new StringBuilder("Registration failed:\n");
            if (!checkUserName()) 
            {
                message.append("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.\n");
            }
            if (!checkPasswordComplexity()) 
            {
                message.append("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.\n");
            }
            return message.toString();
        }
    }
    
    
//Method to verify login
    public boolean loginUser(String enteredUsername, String enteredPassword) 
    {
        return enteredUsername.equals(username) && enteredPassword.equals(password);
    }

    
//Method to return login status message
    public String returnLoginStatus(boolean loginStatus) 
    {
        if (loginStatus) {
            return "Welcome " + firstName + ", " + lastName + "! It's great to see you again.";
        } else {
            return "Username or password incorrect. Please try again.";
        }
    }



   }