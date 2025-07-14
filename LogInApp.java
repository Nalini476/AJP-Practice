public class LogInApp {
class PassWordMissMatchException extends Exception {
    public PassWordMissMatchException(String message) {
        super(message);
    }
}


    String password;

    String login(String pwd) throws PassWordMissMatchException {
        if (password.equals(pwd)) {
            return "Log in successfully";
        } else {
            throw new PassWordMissMatchException("Invalid Password");
        }
    }

    public static void main(String[] args) {
        LogInApp loginapp = new LogInApp();
        loginapp.password = "anudip";

        try {
            System.out.println(loginapp.login("anudip123"));
        } catch (PassWordMissMatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
    

