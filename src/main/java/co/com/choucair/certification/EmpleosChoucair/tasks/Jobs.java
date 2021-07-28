package co.com.choucair.certification.EmpleosChoucair.tasks;

import co.com.choucair.certification.EmpleosChoucair.userinterface.JobsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.rest.interactions.Ensure;


public class Jobs implements Task {
    public static Jobs onThePage() {
        return Tasks.instrumented(Jobs.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(JobsPage.COOKIE_ACCEPT_BUTTON),
                Click.on(JobsPage.JOB_BUTTON),

                Click.on(JobsPage.SERVICES_BUTTON),
                Click.on(JobsPage.JOB_BUTTON),
                Click.on(JobsPage.INDUSTRIES_BUTTON),
                Click.on(JobsPage.JOB_BUTTON),
                Click.on(JobsPage.TRAINING_BUTTON),
                Click.on(JobsPage.JOB_BUTTON),
                Click.on(JobsPage.COMMUNITY_BUTTON),
                Click.on(JobsPage.JOB_BUTTON),
                Click.on(JobsPage.WE_BUTTON),
                Click.on(JobsPage.JOB_BUTTON),
                Click.on(JobsPage.CONTACT_US_BUTTON),
                Click.on(JobsPage.JOB_BUTTON),
                Click.on(JobsPage.CONTINUE_SCROLL),
               //Scroll.to(JobsPage.MODELO_CALIDAD_SW).andAlignToBottom()
               // Ensure.that(JobsPage.MODELO_CALIDAD_SW, isVisible()),
              //  Ensure.that(JobsPage.MODELO_CALIDAD_SW ),

                Click.on(JobsPage.MODELO_CALIDAD_SW),
                Click.on(JobsPage.DIFERENCIA),
              //  Click.on(JobsPage.PAPEL_ING),
                Click.on(JobsPage.ECONOMIA_SW),
             //   Click.on(JobsPage.ERRORES_SW),
                Click.on(JobsPage.CALIDAD)


                //Click.on(JobsPage.BUTTON_GO_TO_JOB_PORTAL),
              //  Click.on(JobsPage.CONTINUE_BUTTON),
              //  Click.on(JobsPage.REGISTER_BUTTON),

                // Step 1
                //Click.on(JobsPage.SELECT_LOCATION),
               // Click.on(JobsPage.CONTINUE_FORM_BUTTON),

                // Step 2
              //  Click.on(JobsPage.FILL_IN_MY_DATA_MANUALLY),
              //  Click.on(JobsPage.ACCEPT_TREATMENT_OF_MY_DATA),
            //    Click.on(JobsPage.CONTINUE_FORM_BUTTON),

                // Step 3
                //Enter.theValue("balexis41@gmail.com").into(JobsPage.INPUT_EMAIL),
              //  Enter.theValue("balexis41@gmail.com").into(JobsPage.INPUT_EMAIL_CONFIRMATION),
               // Click.on(JobsPage.NEXT_FORM_BUTTON),

                // Step 4
               // Enter.theValue("Brayan Alexis").into(JobsPage.INPUT_FIRST_NAME),
              //  Enter.theValue("Valdes Gallego").into(JobsPage.INPUT_LAST_NAME),
               // Click.on(JobsPage.NEXT_FORM_BUTTON),

                // Step 5
               // Click.on(JobsPage.CLICK_COUNTRY_BIRTH),
               // Enter.theValue("Colomb").into(JobsPage.INPUT_COUNTRY_BIRTH),
               // Click.on(JobsPage.SELECT_COUNTRY_BIRTH),
               // Click.on(JobsPage.CLICK_BIRTHDATE),
               // Enter.theValue("17/03/2000").into(JobsPage.INPUT_COUNTRY_BIRTHDATE),
               // Click.on(JobsPage.SELECT_COUNTRY_BIRTHDATE),
               // Click.on(JobsPage.NEXT_FORM_BUTTON)




        );
    }
}
