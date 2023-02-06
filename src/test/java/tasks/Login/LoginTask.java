package tasks.Login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.Login.Login;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {
    private final String username;
    private final String password;

    public LoginTask(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Performable withCredentials(String username, String password) {
        return instrumented(LoginTask.class, username, password);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(this.username).into(Login.USER_NAME_FIELD),
                Enter.theValue(this.password).into(Login.PASSWORD_FIELD),
                Click.on(Login.LOGIN_BUTTON)
        );
    }
}
