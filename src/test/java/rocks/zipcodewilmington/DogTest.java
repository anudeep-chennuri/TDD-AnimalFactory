package rocks.zipcodewilmington;

import jdk.jfr.Unsigned;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void newDog(String name, Date birthDate, Integer id) {
        // Given
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When
        dog.setName(givenName);

        // Then
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void speak(){
        // Given
        Dog dog = new Dog(null, null, null);

        // When
        String retrievedspeak = dog.speak();

        // Then
        Assert.assertEquals("bark!", retrievedspeak);
    }

    @Test
    public void setBirthDate(Date birthDate){
        // Given
        Dog dog = new Dog(null, null, null);

        // When
        dog.setBirthDate(birthDate);

        // Then
        Date retrievedBirthDate = dog.getBirthDate();
        Assert.assertEquals(retrievedBirthDate, birthDate);
    }

    @Test
    public void eat(Food food){
        // Given
        Dog dog = new Dog(null, null, null);

        // When
        dog.eat(food);

        // Then
        Food retrievedFood = dog.eat();
        Assert.assertEquals(retrievedFood, food);
    }

    @Test
    public void Integerid(){
        // Given
        Dog dog = new Dog(null, null, null);

        // When
        Integer retrievedId = dog.getId();

        // Then
        Integer retrievedId2 = dog.getId();
        Assert.assertEquals(retrievedId, retrievedId2);
    }

    @Test
    public void AnimalInheritance(){
        // Given
        Dog dog = new Dog(null, null, null);

        // When
        Animal animal = dog;

        // Then
        Assert.assertTrue(animal instanceof Animal);
    }

    @Test
    public void MammalInheritance(){
        // Given
        Dog dog = new Dog(null, null, null);

        // When
        Mammal mammal = dog;

        // Then
        Assert.assertTrue(mammal instanceof Mammal);
    }


}
