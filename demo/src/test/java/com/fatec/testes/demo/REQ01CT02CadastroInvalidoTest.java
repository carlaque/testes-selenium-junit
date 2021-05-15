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
public class REQ01CT02CadastroInvalidoTest {
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
  public void rEQ01CT02CadastroInvalido() {
    driver.get("https://ts-scel.herokuapp.com/login");
    driver.manage().window().setSize(new Dimension(974, 1087));
    driver.findElement(By.name("username")).sendKeys("maria");
    driver.findElement(By.name("password")).sendKeys("456");
    driver.findElement(By.cssSelector("button")).click();
    driver.findElement(By.linkText("Livros")).click();
    driver.findElement(By.id("isbn")).click();
    driver.findElement(By.id("isbn")).sendKeys("1234");
    driver.findElement(By.id("autor")).click();
    driver.findElement(By.id("autor")).sendKeys("mauricio");
    driver.findElement(By.id("titulo")).click();
    driver.findElement(By.id("titulo")).sendKeys("turma da monica 1");
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
  }
}
