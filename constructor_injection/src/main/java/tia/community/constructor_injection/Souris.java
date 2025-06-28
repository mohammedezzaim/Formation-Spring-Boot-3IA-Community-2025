package tia.community.constructor_injection;

import org.springframework.context.annotation.Primary;
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
