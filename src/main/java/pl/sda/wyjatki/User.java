package pl.sda.wyjatki;

public class User {
    private String email;
    private String login;

    public User(){

    };

    public User(String email, String login) {
        try {
            setEmail(email);
        } catch (EmailException e) {
            e.printStackTrace();
        }
        this.login = login;
    }


    public String getEmail() {
        return email;
    }

    public boolean checkEmail(String email){
        return email.contains("@");
    }

    public void setEmail(String email) throws EmailException {
        if(!this.checkEmail(email)) throw new EmailException("niepoprawny email!");
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
