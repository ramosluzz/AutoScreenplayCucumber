package co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class DocumentacionWikipedia {

	//identifcar el elemento
	//Creamos una variabe llamada Titulo
	/**
	 * Nombramiento en mayuscula porque es constante(no cambia)
	 * 
	 * */
	public static final Target TITULO = Target.the("Titulo").locatedBy("(//h1[@id='firstHeading'])[1]");
	//public static final Target EJEMPLO = Target.the("Titulo").located(By.id("id"));
}
