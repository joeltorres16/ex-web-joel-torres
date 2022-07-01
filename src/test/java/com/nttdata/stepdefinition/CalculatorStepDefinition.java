package com.nttdata.stepdefinition;

import com.nttdata.page.HomePage;
import com.nttdata.steps.HomeStep;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorStepDefinition {
    private WebDriver driver;
    private Scenario scenario;

    @Before(order = 0)
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\joel torres\\Documents\\UNAC\\cursos adicionales\\QA2\\CLASE 10 - AUTOMATIZACION WEB\\ex-web-joel-torres\\drivers\\chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario=scenario;
    }

    @After
    public void quitDriver(){

        driver.quit();
    }

    @Given("ingreso a la pagina calculator")
    public void ingreso_a_la_pagina_calculator() {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        screenShot();

    }
    @When("ingreso firstnumer {string} y secondnumer {string}")
    public void ingreso_firstnumer_y_secondnumer(String numer1, String numer2) {
        HomeStep homeStep= new HomeStep(driver);
        homeStep.insertNumer1(numer1);
        homeStep.insertNumer2(numer2);

    }
    @And("Selecciono suma")
    public void seleccionoSuma() {
        HomeStep homeStep= new HomeStep(driver);
        homeStep.SelectAdd();
        homeStep.clickBoton();
        screenShot();
    }
    @Then("obtengo el resultado de la operacion")
    public void obtengo_el_resultado_de_la_operacion() {
        HomeStep homeStep= new HomeStep(driver);
        String result= homeStep.CapturaDato();
        System.out.println("El resultado es: "+result);
    }



    public void screenShot(){
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }


    @And("selecciono resta")
    public void seleccionoResta() {
        HomeStep homeStep= new HomeStep(driver);
        homeStep.selectSubstract();
        homeStep.clickBoton();
        screenShot();
    }

    @And("selecciono multiplicacion")
    public void seleccionoMultiplicacion() {
        HomeStep homeStep= new HomeStep(driver);
        homeStep.selectMulti();
        homeStep.clickBoton();
        screenShot();
    }

    @And("selecciono division")
    public void seleccionoDivision() {
        HomeStep homeStep= new HomeStep(driver);
        homeStep.selectDiv();
        homeStep.clickBoton();
        screenShot();
    }

    @And("selecciono concateno")
    public void seleccionoConcateno() {
        HomeStep homeStep= new HomeStep(driver);
        homeStep.selectConcact();
        homeStep.clickBoton();
        screenShot();
    }

    @Then("obtengo el resultado de la operacion fallida")
    public void obtengoElResultadoDeLaOperacionFallida() {
        HomeStep homeStep= new HomeStep(driver);
        homeStep.SelectAdd();
        homeStep.clickBoton();
        String error= homeStep.capturoError();
        System.out.println("El mensaje de error es: "+error);
        screenShot();
    }

    @When("limpio los campos")
    public void limpioLosCampos() {
        HomeStep homeStep= new HomeStep(driver);
        homeStep.limpCamp();
        screenShot();
    }

    @When("doy click en check Integers only")
    public void doyClickEnCheckIntegersOnly() {
        HomeStep homeStep= new HomeStep(driver);
        homeStep.clickOnly();
        screenShot();
    }
}
