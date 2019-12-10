package com.company;

public class Person {

    private String name;
    private  int age;
    private String gender;
    private String[] interests;

    public Person(String name, int age, String gender, String[] interests) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interests=interests;
    }


    public String hello(){
    String results = "";
    for (int i=0; i<interests.length;i++){
        results += interests[i];
        if (i <interests.length-2){
            results += ", ";
        }
        else if (i== interests.length-2){
            results += " and ";
        }
    }
        System.out.print("Hello, my name is " + name + " I am " + age + " years old. " + " My interests are ");


        return results;
    }
}
