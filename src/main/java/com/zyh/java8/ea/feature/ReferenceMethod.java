/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zyh.java8.ea.feature;

/**
 *
 * @author zhyhang
 */
public class ReferenceMethod {

    public static void main(String... argv) {
        // function interface to lambda test
        Converter<String, Integer> converterSI = (from) -> Integer.valueOf(from);
        System.out.println(converterSI.convert("100"));

        // reference method
        Converter<String, Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("123");
        System.out.println(converted);   // 123

        // reference method
        Something something = new Something();
        Converter<String, String> converterss = something::startsWith;
        String convertedss = converterss.convert("Java");
        System.out.println(convertedss);   // J

        // reference constructor
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");
        
    }

}

//function interface (eg. has and only has one abstract method)
interface Converter<F, T> {

    T convert(F from);

}

class Something {

    String startsWith(String s) {
        return String.valueOf(s.charAt(0));
    }
}

class Person {

    String firstName;
    String lastName;

    Person() {
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

interface PersonFactory<P extends Person> {

    P create(String firstName, String lastName);
}
