package ui.Login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {
    public static Target USER_NAME_FIELD = Target.the("Username field").located(By.id("username"));
    public static Target PASSWORD_FIELD = Target.the("Username field").located(By.id("password"));
    public static Target LOGIN_BUTTON = Target.the("Username field").located(By.id("log-in"));
}
