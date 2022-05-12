package co.simplon.p25.handiaccess.dtos;

public class LoginDto {

    private String username;
    private String password;

    public LoginDto() {
	// UserSignIn

    }

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

    @Override
    public String toString() {
	return String.format("{username=%s,password=%s}", username, "[PROTECTED]");
    }

}
