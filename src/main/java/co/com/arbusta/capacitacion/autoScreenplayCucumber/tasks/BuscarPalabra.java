package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import org.openqa.selenium.Keys;
//import static co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.HomeWikiPage.INPUT_TEXT_BUSCAR;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.HomeWikiPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class BuscarPalabra implements Task{
	
	
	/**lA TAREA HACE REFRENCIA CONJUNTO DE ACCIONES
	 * 
	 * 
	 * */
	public BuscarPalabra() {
		
	}
	@Step("{0} Buscar Palabra para Conocer Significado")
	public <T extends Actor> void performAs(T actor) {
		
		/**
		 * Actor hace la accion-- llama a las user interfaces.
		 * actor escribe y hace clicks
		 * */
		actor.attemptsTo(Enter.theValue("Automatizacion de pruebas").into(HomeWikiPage.INPUT_TEXT_BUSCAR).thenHit(Keys.ENTER),
				Click.on(HomeWikiPage.INPUT_TEXT_BUSCAR));  
				
	}
	/**Creacion de método instrumented:
	 * Permite instanciar la clase en este caso la tarea, 
	 * para obtener los valores de entrada y los procedimientos.
	 * 
	 * */
	
	public static BuscarPalabra paraConocerSignificado() {
		return Tasks.instrumented(BuscarPalabra.class);
	}
}
