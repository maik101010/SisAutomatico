/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.util.List;
import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/**
 *
 * @author Michael García A
 */
public class Test {
    
     private static final int get(){
            int n = 1;
            return n;
        }
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        try{
        WebDriver driver = new ChromeDriver(options);
        
        //driver.get("https://www.shoes.com/prana-printed-double-headband/634345/1827327");
        driver.get("https://www.shoes.com/johnston-murphy-performance-loafer/614421/1262220");
        
        try{
          //ACCEDER A LOS ELEMENTOS DEL DOM POR MEDIO DE SU ID O CLASE O NOMBRE         
          WebElement button = driver.findElement(By.id("add-cart"));
          //DESPUÉS PUEDO USAR METODOS COMO EL CLICK
          button.click();
          
          Thread.sleep(2000);
          WebElement buttonCheckout = driver.findElement(By.className("crt-proceed-btn"));
                                                                    
          buttonCheckout.click();
          
          //WebElement username = driver.findElement(By.name("guestEmail"));
          WebElement username = driver.findElement(By.className("sb-text-input--full"));
          
          username.sendKeys("holamundo@gmail.com");
//        WebElement password = driver.findElement(By.name("pass"));
        
//        WebElement button = driver.findElement(By.id("quick_shop_btn_35"));
//        
//        button.click();
//        WebElement botonAgregar = driver.findElement(By.className("qv-add-to-cart"));
//        botonAgregar.click();
//        
//        driver.get("https://www.shoes.com/cart/cart");
////        WebElement text = driver.findElement(By.name("Search"));
////        text.sendKeys("Suck me my dick!");
//        
//        /**
//         * Chequeamos la compra
//         */
//        WebElement botonChequear = driver.findElement(By.className("crt-proceed-btn"));
//        botonChequear.click();
//        
//        driver.get("https://www.shoes.com/cart/checkout");
//        //WebElement txtEmail = driver.findElement(By.className("sb-text-input"));
//        WebElement txtEmail = driver.findElement(By.name("guestEmail"));
//        //WebElement txtEmail = driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[8]/div[1]/section/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/form/div/div/input"));
//        
//        txtEmail.sendKeys("luisalgonsa1x123@gmail.com");
//        
//        
//        WebElement botonEnviarEmail = driver.findElement(By.className("sb-vert-inner"));
//        botonEnviarEmail.click();
//        
        
        /**
        * ----------- Para una chancla
        */ 
//        WebElement eleccionTipo = driver.findElement(By.className("crt-edit-attrib-thumb-inner-size"));
//        eleccionTipo.click();
//        WebElement eleccionTipo2 = driver.findElement(By.className("crt-edit-attrib-thumb-color"));
//        eleccionTipo2.click();
//        
//        WebElement botonAgregar = driver.findElement(By.className("qv-add-to-cart"));
//        botonAgregar.click();
        
        
        
        }catch(WebDriverException e){
            System.out.println("Excepcion dentro de los parametros");
            System.out.println(e.getMessage());
            System.out.println(e.getSystemInformation());
        }
    }catch(Exception e){
            System.out.println("Excepcion dentro del driver");
    }
       
}
}