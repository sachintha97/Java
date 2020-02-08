package iit.tutorial1.myapplication;

public class Person {
    private String name;
    private String sureName;
    private int age;

    //Constructor of the person class
    public Person(String n){
        name = n;
    }

    //constructor of the person class with three parameters
    public Person(String n , String s, int num){
        name = n;
        sureName = s;
        age = num;
    }

    // display name
    public void displayName(){
        System.out.println(name);
    }

    public void setSureName(String s){
        sureName = s;
    }

    public void setAge(int num){
        age = num;

    }
     public String getSureName(){
        return sureName;
     }

     public int getAge(){
        return age;
     }

    // display details
     public void printDetails(){
        System.out.println("Name: " + name);
        System.out.println("Sure Name: " + sureName);
        System.out.println("Age: " + age);
    }
}
