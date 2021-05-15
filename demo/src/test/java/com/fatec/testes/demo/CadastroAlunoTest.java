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
    int milisegundos = 500;
    driver.get("https://ts-scel.herokuapp.com/");
    driver.manage().window().setSize(new Dimension(974, 968));
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("maria");
    driver.findElement(By.name("password")).sendKeys("456");
    esperePor(milisegundos);
    driver.findElement(By.cssSelector("button")).click();
    esperePor(milisegundos);
    driver.findElement(By.linkText("Alunos")).click();
    esperePor(milisegundos);
    driver.findElement(By.id("ra")).click();
    driver.findElement(By.id("ra")).sendKeys("123");
    esperePor(milisegundos);
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).sendKeys("cristiano");
    driver.findElement(By.id("email")).sendKeys("cristiano@exemplo.com");
    driver.findElement(By.id("cep")).sendKeys("03694-000");
    esperePor(milisegundos);
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    esperePor(milisegundos);
    driver.findElement(By.id("cep")).click();
    driver.findElement(By.id("cep")).sendKeys("03694000");
    esperePor(milisegundos);
    driver.findElement(By.id("ra")).click();
    driver.findElement(By.id("ra")).sendKeys("1235");
    esperePor(milisegundos);
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    esperePor(milisegundos);
    driver.findElement(By.id("ra")).click();
    driver.findElement(By.id("ra")).sendKeys("1234");
    esperePor(milisegundos);
    driver.findElement(By.id("ra")).click();
    driver.findElement(By.id("ra")).sendKeys("12345");
    esperePor(milisegundos);
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).sendKeys("cristiano");
    esperePor(milisegundos);
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("cristiano@exemplo.com");
    esperePor(milisegundos);
    driver.findElement(By.id("cep")).click();
    driver.findElement(By.id("cep")).sendKeys("03694-000");
    esperePor(milisegundos);
    driver.findElement(By.id("cep")).click();
    driver.findElement(By.id("cep")).sendKeys("03694000");
    esperePor(milisegundos);
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    esperePor(milisegundos);
    driver.findElement(By.id("ra")).click();
    esperePor(milisegundos);
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys(
        "cristiano@exemplo.comkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
    esperePor(milisegundos);
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    esperePor(milisegundos);
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).sendKeys("     ");
    esperePor(milisegundos);
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    esperePor(milisegundos);
    driver.findElement(By.id("ra")).click();
  }
  public void esperePor(int milisegundos) {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
