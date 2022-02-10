package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage {
    public static final Target BUTTON_CC = Target
            .the("select the cursos y certificaciones")
            .located(By.xpath("//div[@id='certificaciones']//strong"));
    public static  final Target INPUT_SEARCH_COURSE = Target
            .the("write we name of course Foundation level")
            .located(By.id("coursesearchbox"));
    public static  final Target BUTTON_SEARCH_COURSE = Target
            .the("Click the search button")
            .located(By.xpath("//button[contains(@class,'btn btn-secondary')]"));
    public static final Target SELECT_COURSE = Target
            .the("Select course Foundation level")
            .located(By.xpath("//a[contains(text(),'Foundation Level')]"));
    public static final Target NAME_COURSE = Target
            .the("Extract course name")
            .located(By.xpath("//a[contains(text(),'Foundation Level')]"));
}
