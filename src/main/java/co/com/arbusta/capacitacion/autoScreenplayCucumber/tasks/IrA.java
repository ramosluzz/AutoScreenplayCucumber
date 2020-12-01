package co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class IrA implements Task{

	private PageObject pageWiki;/**Creamos una variable pageWiki mediante la cual se pasara el pageObject*/

	public IrA(PageObject page) { /**Se crea método que permita pasar el parametro PageObject */
		this.pageWiki = page;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(pageWiki)); /**se llama al método browserOn para pasarle el valor del pageObject*/
		/**Se implementa el metodo performas, el cual recibe un actor como parametro*/
	}
	/**Creacion de método instrumented:
	 * Permite instanciar la clase en este caso la tarea, 
	 * para obtener los valores de entrada y los procedimientos.
	 * */
	public static IrA wikipedia(PageObject page) {
		return Tasks.instrumented(IrA.class, page);
	}
}
