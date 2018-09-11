package app;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Michael García A
 */
public class Test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        try {
            WebDriver driver = new ChromeDriver(options);

            //driver.get("https://www.shoes.com/prana-printed-double-headband/634345/1827327");
            driver.get("https://www.shoes.com/johnston-murphy-performance-loafer/614421/1262220");

            try {
                //ACCEDER A LOS ELEMENTOS DEL DOM POR MEDIO DE SU ID O CLASE O NOMBRE         
                /*
                    Botón agregar compra
                */
                WebElement button = driver.findElement(By.id("add-cart"));
                //DESPUÉS PUEDO USAR METODOS COMO EL CLICK
                button.click();

                /*
                    Botón checkout
                */
                Thread.sleep(2000);
                WebElement buttonCheckout = driver.findElement(By.className("crt-proceed-btn"));

                buttonCheckout.click();

                /*
                    Formulario de email
                */
                Thread.sleep(3000);
                WebElement email = driver.findElement(By.xpath("(//INPUT[@type='email'])[2]"));

                email.sendKeys("anonimo123@gmail.com");
                Thread.sleep(3000);
                email.sendKeys(Keys.ENTER);
                
                /*
                    Formulario de registro de datos
                */
                Thread.sleep(3000);
                WebElement firsName = driver.findElement(By.name("firstName"));
                firsName.sendKeys("Pepito");
                
                WebElement lastName = driver.findElement(By.name("lastName"));
                lastName.sendKeys("Perez");
                
                WebElement address1 = driver.findElement(By.name("address1"));
                address1.sendKeys("Ninguna");
                
                WebElement address2 = driver.findElement(By.name("address2"));
                address2.sendKeys("Ninguna");
                
                WebElement city = driver.findElement(By.name("city"));
                city.sendKeys("San diego");
                
                WebElement stateProvince = driver.findElement(By.name("stateProvince"));
                Select selectState = new Select(stateProvince);
                selectState.selectByValue("CA");
                
                WebElement postalCode = driver.findElement(By.name("postalCode"));
                postalCode.sendKeys("90001");
                
                WebElement phoneNumber = driver.findElement(By.name("phoneNumber"));
                phoneNumber.sendKeys("1234679381");
                
                phoneNumber.sendKeys(Keys.ENTER);
                
                
//                WebElement buttonCheckoutAfterEmail = driver.findElement(By.xpath("//SPAN[@class='sb-vert-inner'][text()='Checkout as a guest']/self::SPAN"));
//                
//                buttonCheckoutAfterEmail.sendKeys(Keys.ENTER);
                //WebElement buttonCheckoutAfterEmail = driver.findElement(By.className("chk-login-btn--guest"));
                //buttonCheckoutAfterEmail.click();

               /* Thread.sleep(3000);
                WebElement name = driver.findElement(By.name("firstName"));
                name.sendKeys("Pepito");

                WebElement lastName = driver.findElement(By.name("lastName"));
                lastName.sendKeys("Perez");*/

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
            } catch (WebDriverException e) {
                System.out.println("Excepcion dentro de los parametros");
                System.out.println(e.getMessage());
                System.out.println(e.getSystemInformation());
            }
        } catch (Exception e) {
            System.out.println("Excepcion dentro del driver");
        }

    }
}
