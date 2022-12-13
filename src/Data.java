public class Data {
    public String login;
    private String password;
    private String confirmPassword;

    public Data() {
    }


    public static boolean che(String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if ((login == null | password == null | confirmPassword == null)) {
            throw new WrongLoginException("The rows: login, password and confirm password mustn't empty");
        }
        if (!val(login)) {
            throw new WrongLoginException("Login is not correct");
        }
        if (!val(password)) {
            throw new WrongPasswordException("Password is not correct");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("The row Confirm password is not the same with the Password row");
        }
    }

    private static boolean val(String s) {
        if ((s.length() > 20) && (s.isBlank() | s.isEmpty())) {
            return false;
        }
        if (!s.matches("[a-zA-z0-9_]+")) {
            return false;
        }
        return true;
    }

    public static void loginSystem(String login, String password, String confirmPassword) {

    }

    public void loginMessage() throws WrongLoginException {
        System.out.println("Логин не должен быть пустым, а также состоять из латинских букв, цифр и символа '_', но не более 20 символов.");
    }

    public void passwordMessage() throws WrongPasswordException {
        System.out.println("Пароль не совпадает.");
    }

}
