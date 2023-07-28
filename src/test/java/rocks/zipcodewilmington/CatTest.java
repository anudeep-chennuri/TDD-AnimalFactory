package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setName() {
        // Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        cat.setName(givenName);
        String retrievedName = cat.getName();

        // Then
        Assert.assertEquals(givenName, retrievedName);
    }

    @Test
    public void speak() {
        // Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        String retrievedSpeak = cat.speak();

        // Then
        Assert.assertEquals("Meow", retrievedSpeak);
    }

    @Test
    public void setBirthDate(Date birthDate) {
        // Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        cat.setBirthDate(givenBirthDate);
        Date retrievedBirthDate = cat.getBirthDate();

        // Then
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }

    @Test
    public void eat() {
        // Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Food food = new Food();
        cat.eat(food);

        // Then
        Assert.assertTrue(true);
    }

    @Test
    public void getId() {
        // Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Integer retrievedId = cat.getId();

        // Then
        Assert.assertEquals(givenId, retrievedId);

    }

    @Test
    public void checkAnimalInheritance() {
        // Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);


        // Then
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void checkMammalInheritance() {
        // Given
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);


        // Then
        Assert.assertTrue(cat instanceof Mammal);
    }

}










