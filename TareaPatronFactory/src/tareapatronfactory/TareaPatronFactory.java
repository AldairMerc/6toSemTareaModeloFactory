/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapatronfactory;
import fes.tarea.factory.Dispos;
import fes.tarea.factory.DisposFactory;
import java.util.Scanner;

/**
 *
 * @author aldam
 */
public class TareaPatronFactory {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
        
        System.out.println("¿Qué modelo de nuestro catálogo busca?");
        System.out.println( Dispos.SAMSUNG_GALAXY_A30 + ") Samsung - Galaxy A30");
        System.out.println( Dispos.SAMSUNG_GALAXY_A70 + ") Samsung - Galaxy A70");
        System.out.println( Dispos.APPLE_IPHONE_XS + ") Apple - IPhoneXS");
        System.out.println( Dispos.SAMSUNG_GALAXY_TAB_S8_ULTRA + ") Samsung - Galaxy TAB S8 Ultra");
        System.out.println( Dispos.APPLE_IPAD_PRO + ") Apple - IPad Pro");
        System.out.println( Dispos.HUAWEI_MATEPAD_PRO + ") Huawei - MatePad Pro");
        System.out.println( Dispos.HP_21B0013lA + ") HP - 21B0013lA");
        System.out.println( Dispos.APPLE_MACBOOK_13 + ") Apple - MacBook 13");
        System.out.println( Dispos.HUAWEI_MATEBOOK_D14 + ") Huawei - MateBook D 14");
        
     
        try {
            System.out.print("Elige el numero: ");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No se capturo un numero.");
        }
        
        Dispos dispositivo = DisposFactory.createDispos(eleccion);
        System.out.println(dispositivo.toString());
    }
    
}
