package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog() {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.createDog("Doggo", Date);
        Assert.assertEquals("Doggo",Date);
    }

    @Test
    public void testCreateCat() {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.createDog("Kitty", Date);
        Assert.assertEquals("Kitty",Date);
    }

}
