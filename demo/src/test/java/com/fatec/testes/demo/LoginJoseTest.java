package com.fatec.testes.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginJoseTest {
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
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void loginJose() {
    int milisegundos = 500;
    driver.get("https://ts-scel.herokuapp.com/logout");
    driver.manage().window().setSize(new Dimension(974, 968));
    esperePor(milisegundos);
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("jose");
    driver.findElement(By.name("password")).sendKeys("123");
    esperePor(milisegundos);
    driver.findElement(By.cssSelector("button")).click();
    esperePor(milisegundos);
    driver.findElement(By.linkText("Alunos")).click();
    esperePor(milisegundos);
    driver.findElement(By.id("ra")).click();
    driver.findElement(By.id("ra")).sendKeys("1235");
    esperePor(milisegundos);
    driver.findElement(By.id("nome")).click();
    driver.findElement(By.id("nome")).sendKeys("cristiano");
    driver.findElement(By.id("email")).sendKeys("cris@exemplo.com");
    driver.findElement(By.id("cep")).sendKeys("03694000");
    esperePor(milisegundos);
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    esperePor(milisegundos);
    driver.findElement(By.linkText("Voltar")).click();
    esperePor(milisegundos);
    driver.findElement(By.linkText("Livros")).click();
    esperePor(milisegundos);
    driver.findElement(By.id("isbn")).click();
    driver.findElement(By.id("isbn")).sendKeys("1235");
    driver.findElement(By.id("autor")).sendKeys("mauricio");
    esperePor(milisegundos);
    driver.findElement(By.id("titulo")).click();
    driver.findElement(By.id("titulo")).sendKeys("turma da monica jovem");
    esperePor(milisegundos);
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    driver.get("https://ts-scel.herokuapp.com/sig/emprestimo");
    esperePor(milisegundos);
    driver.findElement(By.id("isbn")).click();
    driver.findElement(By.id("isbn")).sendKeys("1235");
    esperePor(milisegundos);
    driver.findElement(By.id("ra")).click();
    driver.findElement(By.id("ra")).sendKeys("1235");
    esperePor(milisegundos);
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    vars.put("window_handles", driver.getWindowHandles());
    esperePor(milisegundos);
    driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
    vars.put("win2095", waitForWindow(2000));
    driver.switchTo().window(vars.get("win2095").toString());
    esperePor(milisegundos);
    driver.findElement(By.cssSelector("tr:nth-child(2) .btn")).click();
  }
  public void esperePor(int milisegundos) {
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
