package app;


import bean.PeripheriqueUSB;
import ord.Ordinateur;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Ezzaim Mohammed
 **/
public class GestionOrdinateurV2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(new File("config.txt"));

        String peripheriqueClassName = scanner.nextLine();
        Class peripheriqueClass = Class.forName(peripheriqueClassName);
        PeripheriqueUSB peripheriqueObject = (PeripheriqueUSB) peripheriqueClass.newInstance();

        String ordinateurClassName = scanner.nextLine();
        Class ordinateurClass = Class.forName(ordinateurClassName);
        Ordinateur ordinateur = (Ordinateur) ordinateurClass.newInstance();
        ordinateur.setPeripheriqueUSB(peripheriqueObject);

        ordinateur.utiliserPortUSB();
    }
}
