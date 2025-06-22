package tia.community.primary_qualifier;

<<<<<<< HEAD
=======
import org.springframework.beans.factory.annotation.Qualifier;
>>>>>>> code/DI_qualifier_annotation
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author Ezzaim Mohammed
 **/

@Component
<<<<<<< HEAD
=======
@Qualifier
>>>>>>> code/DI_qualifier_annotation
public class Souris implements PeripheriqueUSB{

    @Override
    public void work() {
        System.out.println("The Souris fonctionne!");
    }
}
