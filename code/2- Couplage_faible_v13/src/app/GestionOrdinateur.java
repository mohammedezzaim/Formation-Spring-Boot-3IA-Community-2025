package app;

import bean.Clavier;
import bean.CleUSB;
import bean.PeripheriqueUSB;
import bean.Souris;
import ord.Ordinateur;


/**
 * @author Ezzaim Mohammed
 **/
public class GestionOrdinateur {
    public static void main(String[] args) {

        // version 1 bean.CleUSB
        PeripheriqueUSB cle = new CleUSB();

        // version 2 bean.Clavier
        PeripheriqueUSB clavier = new Clavier();

        // version 3 bean.Souris
        PeripheriqueUSB souris = new Souris();


//        Ordinateur ordinateur = new Ordinateur(souris);
//        ordinateur.utiliserPortUSB();
    }
}
