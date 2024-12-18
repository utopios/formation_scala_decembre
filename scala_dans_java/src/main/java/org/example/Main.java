package org.example;

import scala.Tuple2;
import scala.jdk.javaapi.CollectionConverters;
import scala.jdk.javaapi.OptionConverters;

import java.util.Arrays;
import java.util.Optional;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(10,20));
        SingletonObject$.MODULE$.greet();
        SingletonObject$.MODULE$.greetUser(OptionConverters.toScala(Optional.of("Ihab")));
        List<String> data = Arrays.asList("e1", "e2", "e3");
        SingletonObject$.MODULE$.printList(CollectionConverters.asScala(data).toList());
        SingletonObject$.MODULE$.printTuple(new Tuple2<>("data1", "data2"));
    }
}