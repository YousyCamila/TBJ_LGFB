package utils.hooks;

import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class PreparacionEscenario {

    @Before

    public void sepUp(){
        setTheStage(new OnlineCast());
        theActorCalled("usuario");
    }
}
