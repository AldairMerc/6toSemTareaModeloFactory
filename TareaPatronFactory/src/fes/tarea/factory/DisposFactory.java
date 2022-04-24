/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.tarea.factory;

import fes.tarea.dispos.Computadora;
import fes.tarea.dispos.Smartphone;
import fes.tarea.dispos.Tablet;

/**
 *
 * @author aldam
 */
public class DisposFactory implements Dispos{
    public static Dispos createDispos(int tipo){
        switch (tipo) {
            case Dispos.SAMSUNG_GALAXY_A30:
                return new Smartphone("Samsung - Galaxy A30", "Android", false, 10, 8, 32, 16);    
            case Dispos.SAMSUNG_GALAXY_A70:
                return new Smartphone("Samsung - Galaxy A70", "Android", false, 12, 16, 32, 32); 
            case Dispos.APPLE_IPHONE_XS:
                return new Smartphone("Apple - IPhoneXS", "IOs", false, 12, 16, 64, 64);
            case Dispos.SAMSUNG_GALAXY_TAB_S8_ULTRA:
                return new Tablet("Samsung - Galaxy TAB S8 Ultra", "Android", false, false, 16, 128);
            case Dispos.APPLE_IPAD_PRO:
                return new Tablet("Apple - IPad Pro", "IOs", true, false, 16, 256);
            case Dispos.HUAWEI_MATEPAD_PRO:
                return new Tablet("Huawei - MatePad Pro", "HarmonyOS", true, false, 16, 128);
            case Dispos.HP_21B0013lA:
                return new Computadora("HP - 21B0013lA", "Windows10", 8, 1024, false);
            case Dispos.APPLE_MACBOOK_13:
                return new Computadora("Apple - MacBook 13", "IOs", 16, 1024, false);
            case Dispos.HUAWEI_MATEBOOK_D14:
                return new Computadora("Huawei - MateBook D 14", "HarmonyOS", 16, 1024, true);
            default:
                throw new AssertionError();
        }
    }
}   
//    public static final int SAMSUNG_GALAXY_A30 = 1;
//    public static final int SAMSUNG_GALAXY_A70 = 2;
//    public static final int APPLE_IPHONE_XS = 3;
//    public static final int SAMSUNG_GALAXY_TAB_S8_ULTRA = 4;
//    public static final int APPLE_IPAD_PRO = 5;
//    public static final int HUAWEI_MATEPAD_PRO = 6;
//    public static final int HP_21B0013lA = 7;
//    public static final int APPLE_MACBOOK_13 = 8;
//    public static final int HUAWEI_MATEBOOK_D14 = 9;