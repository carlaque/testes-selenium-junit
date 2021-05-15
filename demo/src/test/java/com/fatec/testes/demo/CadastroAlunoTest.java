package com.fatec.testes.demo;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroAlunoTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "browserDriver/chromeDriver.exe");
driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }

  @After
  public void tearDown() {
    driver.quit();
  }

  @Test
  public void cadastroAluno() {
    driver.get("https://ts-scel.herokuapp.com/");
    driver.manage().window().setSize(new Dimension(974, 968));
    driver.findElement(By.linkText("Alunos")).click();
    driver.findElement(By.id("ra")).click();
    driver.findElement(By.id("ra")).sendKeys("123");
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).sendKeys("cristiano");
    driver.findElement(By.id("email")).sendKeys("cristiano@exemplo.com");
    driver.findElement(By.id("cep")).sendKeys("03694-000");
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    driver.findElement(By.id("cep")).click();
    driver.findElement(By.id("cep")).sendKeys("03694000");
    driver.findElement(By.id("ra")).click();
    driver.findElement(By.id("ra")).sendKeys("1235");
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    driver.findElement(By.id("ra")).click();
    driver.findElement(By.id("ra")).sendKeys("1234");
    driver.findElement(By.id("ra")).click();
    driver.findElement(By.id("ra")).sendKeys("12345");
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).sendKeys("cristiano");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("cristiano@exemplo.com");
    driver.findElement(By.id("cep")).click();
    driver.findElement(By.id("cep")).sendKeys("03694-000");
    driver.findElement(By.id("cep")).click();
    driver.findElement(By.id("cep")).sendKeys("03694000");
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    driver.findElement(By.id("ra")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys(
        "cristiano@exemplo.comkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("     ");
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    driver.findElement(By.id("ra")).click();
  }
}
