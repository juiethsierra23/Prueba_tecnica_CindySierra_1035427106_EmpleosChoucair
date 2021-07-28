package co.com.choucair.certification.EmpleosChoucair.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.targets.Target;

public class JobsPage {
    public static final Target COOKIE_ACCEPT_BUTTON = Target.the("").located(By.id("cookie_action_close_header"));

    public static final Target JOB_BUTTON = Target.the("").located(By.xpath("//li[@id='menu-item-550']//a[contains(text(),'Empleos')]"));
    public static final Target SERVICES_BUTTON = Target.the("").located(By.id("menu-item-6142"));
    public static final Target INDUSTRIES_BUTTON = Target.the("").located(By.id("menu-item-870"));
    public static final Target TRAINING_BUTTON = Target.the("").located(By.id("menu-item-1876"));
    public static final Target COMMUNITY_BUTTON = Target.the("").located(By.id("menu-item-7979"));
    public static final Target WE_BUTTON = Target.the("").located(By.id("menu-item-7313"));
    public static final Target CONTACT_US_BUTTON = Target.the("").located(By.id("menu-item-282"));
    public static final Target CONTINUE_SCROLL = Target.the("").located(By.xpath("//a[@href='#prepararse']"));
    public static final Target MODELO_CALIDAD_SW = Target.the("Scroll").located(By.xpath("//a[contains(text(),'Modelo de calidad de software')]"));
    public static final Target DIFERENCIA = Target.the("Scroll").located(By.xpath("//a[contains(text(),'Diferencia entre calidad de software y pruebas')]"));
 //   public static final Target PAPEL_ING = Target.the("Scroll").located(By.xpath("//a[contains(text(),'Papel de los ingenieros')]"));
    public static final Target ECONOMIA_SW = Target.the("Scroll").located(By.xpath("//a[contains(text(),'El software en la economía actual')]"));
  //  public static final Target ERRORES_SW = Target.the("Scroll").located(By.xpath("//a[contains(text(),'Calidad de software')]"));
    public static final Target CALIDAD = Target.the("Scroll").located(By.xpath("//a[contains(text(),'')]"));

    //public static final Target BUTTON_GO_TO_JOB_PORTAL = Target.the("").located(By.xpath("//span[@class='elementor-button-text']"));
   // public static final Target CONTINUE_BUTTON = Target.the("").located(By.xpath("//a[@href='https://www.magneto365.com/choucair']"));
    //public static final Target REGISTER_BUTTON = Target.the("").located(By.className("ml-1"));

   // public static final Target CONTINUE_FORM_BUTTON = Target.the("").located(By.xpath("//span[contains(text(),'Continuar')]"));

   // public static final Target FILL_IN_MY_DATA_MANUALLY = Target.the("").located(By.xpath("//label[@class='ant-radio-wrapper']//span[contains(text(),'Llenar manualmente')]"));
   // public static final Target ACCEPT_TREATMENT_OF_MY_DATA = Target.the("").located(By.xpath("//input[@class='ant-checkbox-input']"));

   // public static final Target INPUT_EMAIL = Target.the("").located(By.id("email-info_email"));
  //  public static final Target INPUT_EMAIL_CONFIRMATION = Target.the("").located(By.id("email-info_emailConfirmation"));
   // public static final Target NEXT_FORM_BUTTON = Target.the("").located(By.xpath("//span[contains(text(),'Siguiente')]"));

  //  public static final Target INPUT_FIRST_NAME = Target.the("").located(By.id("personal-info_firstName"));
   // public static final Target INPUT_LAST_NAME = Target.the("").located(By.id("personal-info_lastName"));

  //  public static final Target CLICK_COUNTRY_BIRTH = Target.the("").located(By.className("ant-select-selection-search"));
   // public static final Target INPUT_COUNTRY_BIRTH = Target.the("").located(By.id("birth-info_countryBirth"));
   // public static final Target SELECT_COUNTRY_BIRTH = Target.the("").located(By.xpath("//div[@class='ant-select-item-option-content']"));

   // public static final Target CLICK_BIRTHDATE = Target.the("").located(By.className("ant-picker"));
  //  public static final Target INPUT_COUNTRY_BIRTHDATE = Target.the("").located(By.id("birth-info_birthdate"));
   // public static final Target SELECT_COUNTRY_BIRTHDATE = Target.the("").located(By.xpath("//td[@title='2000-03-17']"));



}
