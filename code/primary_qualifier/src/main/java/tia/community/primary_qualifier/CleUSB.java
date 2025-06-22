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
@Primary
=======
@Qualifier("stockage")
>>>>>>> code/DI_qualifier_annotation
public class CleUSB implements PeripheriqueUSB{

    @Override
    public void work() {
        System.out.println("Cle USB est utiliser!");
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> code/DI_qualifier_annotation
