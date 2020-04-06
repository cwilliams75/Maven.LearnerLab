package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        Person person = new Person(1l,"Corey");
        Assert.assertTrue(person.getId() == 1l);
        Assert.assertTrue(person.getName().equals("Corey"));
    }

    @Test
    public void testName(){
        Person person = new Person(1l,"Corey");
        person.setName("Ray");
        Assert.assertTrue(person.getName().equals("Ray"));
    }
}
