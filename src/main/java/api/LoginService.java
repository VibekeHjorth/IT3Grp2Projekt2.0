package api;
import data.LoginData;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("login")
public class LoginService {
    LoginData logindata = new LoginData();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String doLogin(LoginData logindata){

        this.logindata = logindata;
        System.out.println(logindata.getUsername() + " " + logindata.getPassword());
        System.out.println("Login service aktiveret!");

        return "Jeg er en lille bitte hund!";
    }
}
