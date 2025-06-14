package tia.community.dependency_injection;

import org.springframework.stereotype.Component;

/**
 * @author Ezzaim Mohammed
 **/


public class Souris implements PeripheriqueUSB{
    @Override
    public void work() {
        System.out.println("\uD83D\uDDB1\uFE0F Souris : Détection des mouvements et clics...");
    }
}
