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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class EmprestimoTest {
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
  public void emprestimo() {
    driver.get("https://ts-scel.herokuapp.com/");
    driver.manage().window().setSize(new Dimension(974, 968));
    driver.findElement(By.linkText("Empréstimo")).click();
    driver.findElement(By.id("isbn")).click();
    driver.findElement(By.id("isbn")).sendKeys("1234");
    driver.findElement(By.id("ra")).click();
    driver.findElement(By.id("ra")).sendKeys("123");
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    driver.findElement(By.id("ra")).click();
    driver.findElement(By.id("ra")).sendKeys("1234");
    driver.findElement(By.cssSelector("body")).click();
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    driver.findElement(By.id("isbn")).click();
    driver.findElement(By.id("isbn")).click();
    driver.findElement(By.id("isbn")).sendKeys("12345");
    driver.findElement(By.id("ra")).click();
    driver.findElement(By.id("ra")).sendKeys("12345");
    driver.findElement(By.cssSelector(".btn:nth-child(1)")).click();
    driver.findElement(By.id("isbn")).click();
    driver.findElement(By.id("isbn")).sendKeys("1234");
    driver.findElement(By.id("ra")).click();
    driver.findElement(By.id("ra")).sendKeys("1234");
    driver.findElement(By.id("ra")).sendKeys(Keys.ENTER);
    driver.findElement(By.id("ra")).click();
    driver.findElement(By.id("ra")).sendKeys("1235");
    driver.findElement(By.id("ra")).sendKeys(Keys.ENTER);
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
    vars.put("win2379", waitForWindow(2000));
    driver.switchTo().window(vars.get("win2379").toString());
    driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(6)")).click();
    driver.findElement(By.linkText("Devolver")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) .btn")).click();
  }
}
