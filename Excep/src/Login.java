public class Login {

    private String user, password;

    Login (String user, String password) {
        this.user = user;
        this.password = password;
    }

    public void changePassword(String newPassword) {
        try {
            if(this.password.equals(newPassword)) {
                throw new Exception("Error: same password");
            } else {
                this.password = newPassword;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void LoginIn(String user, String password) {
        try{
            if(!user.equals(this.user)) {
                throw new Exception("Error: Invalid user");
            } else if (!password.equals(this.password)) {
                throw new Exception("Error: Invalid password");
            } else {
                System.out.println("Success");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void changeUser(String newUser) {
        try {
            treatchangeUser(newUser);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // throws sends the exception to another method to be treated (changeUser)
    public void treatchangeUser(String newUser) throws Exception{
        if(newUser.equals(this.user)) {
            throw new Exception("Error: same user");
        } else {
            this.user = newUser;
        }
    }



}
