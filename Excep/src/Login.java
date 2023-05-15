public class Login {

    private String user, password;

    Login (String user, String password) {
        this.user = user;
        this.password = password;
    }

    public void changePassword(String newPassword) throws Exception {
        if(this.password.equals(newPassword)) {
            throw new Exception("Error: same password");
        } else {
            this.password = newPassword;
        }
    }

    public void LoginIn(String user, String password) {
        try{
            if(!user.equals(this.user)) {
                throw new Exception("Invalid user");
            } else if (!password.equals(this.password)) {
                throw new Exception("Invalid password");
            } else {
                System.out.println("Success");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
