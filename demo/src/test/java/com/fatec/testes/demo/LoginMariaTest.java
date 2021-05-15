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
import org.springframework.beans.factory.annotation.Value;
public class LoginMariaTest {
  private int milisegundos = 2000;
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
  public void loginMaria() {
    driver.get("https://ts-scel.herokuapp.com/logout");
    driver.manage().window().setSize(new Dimension(974, 968));
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("maria");
    driver.findElement(By.name("password")).sendKeys("456");
    driver.findElement(By.cssSelector("button")).click();
    esperePor(milisegundos);
    driver.findElement(By.linkText("Alunos")).click();
    driver.findElement(By.id("ra")).click();
    driver.findElement(By.id("ra")).sendKeys("1234");
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).sendKeys("marina");
    driver.findElement(By.id("email")).sendKeys("marina@exemplo.com");
    driver.findElement(By.id("cep")).sendKeys("03694000");
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    // esperePor(milisegundos);
    // driver.findElement(By.linkText("Voltar")).click();
    // esperePor(milisegundos);
    driver.findElement(By.linkText("Livros")).click();
    driver.findElement(By.id("isbn")).click();
    driver.findElement(By.id("isbn")).sendKeys("1234");
    driver.findElement(By.id("autor")).sendKeys("mauricio");
    driver.findElement(By.id("titulo")).click();
    driver.findElement(By.id("titulo")).sendKeys("turma da monica - laços");
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    driver.get("https://ts-scel.herokuapp.com/sig/emprestimos");
    esperePor(milisegundos);
    driver.findElement(By.linkText("Devolver")).click();
  }

  public void esperePor(int milisegundos) {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
