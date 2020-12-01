package co.com.arbusta.capacitacion.autoScreenplayCucumber.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.questions.Validar;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.BuscarPalabra;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.tasks.IrA;
import co.com.arbusta.capacitacion.autoScreenplayCucumber.userinterfaces.HomeWikiPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
public class BusquedaPalabra {

	/**-----------------------Instanciar el Driver---------------------------------------------------------*/
	/**Instanciamos el driver que queremos abrir, en este caso es chome*/
	@Managed(driver = "chrome")
	public WebDriver driver;
	
	/**-----------------------Declaración Objeto Page----------------------------------------------------------*/
	/**1.Crearemos un objeto de la clase HomeWikiPage
	 * 2.usaremos un pageobject mediante page para acceder a la url de la aplicacion
	 *  con el objecto page obtenemos los métodos de la clase HomeWikiPage. * */
	private HomeWikiPage page;
	Actor carito = Actor.named("caro");
	
	/**-----------------------NOMBRE ACTOR----------------------------------------------------------*/
	/**1.Crearemos un objeto llamado Carolina
	 * 2. se llama al metodo named de la clase Actor,
	 * para pasarle el nombre.
	 * */
	
//	
	@Before
	public void SetUp() {
		
		System.out.println("por fin!!");
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//esta linea es un poco de tiempo antes de abrir la aplicacion
	}
	
	@Given("^usuario ingresa a la pagina de Wikipedia$")
	public void usuario_ingresa_a_la_pagina_de_wikipedia() {
		carito.can(BrowseTheWeb.with(driver));
		carito.attemptsTo(IrA.wikipedia(page));
		//en el Given se encuentran las precondiciones en este caso abrir pagina
	}

	@When("^usuario busca la palabra$")
	public void usuario_busca_la_palabra()  {
		//llama las tareas
		carito.attemptsTo((BuscarPalabra.paraConocerSignificado()));
	
	}

	@Then("^usuario visualiza la definicion$")
	public void usuario_visualiza_la_definicion()  {
		//se llaman las question que tienen las preguntas.
		carito.should(seeThat(Validar.significadoPalabra()));
	}
}
