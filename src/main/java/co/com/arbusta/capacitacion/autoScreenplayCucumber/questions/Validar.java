package co.com.arbusta.capacitacion.autoScreenplayCucumber.questions;

import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.DocumentacionWikipedia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class Validar implements Question<Boolean>{
	
	public Validar() {
		
	}
	@Override
	public Boolean answeredBy(Actor actor) {
		
		/**el actor realiza las preguntas
		 * las preguntas me pueden devolver un Boolean, String, list
		 * 
		 * */
		return Text.of(DocumentacionWikipedia.TITULO).viewedBy(actor).asBoolean();
	}
	public static Validar significadoPalabra() {
		return new Validar();
	}
}
