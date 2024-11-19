package com.driver;

public class Main {
   public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
        // rwOnly.name = "John";
        // System.out.println(RwOnly.name); 
        //name has private accessin in 'com drive.RWOnly'y'
        rwOnly.setName("John");

        System.out.println(rwOnly.getName());
    }
}
