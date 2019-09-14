package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       System.out.println("Enter xml file name : ");
       Scanner sc1 = new Scanner(System.in);
       String filename = sc1.nextLine();
       XMLtoJSON xtoj = new XMLtoJSON();
       String xml_data = xtoj.getXML_data(filename);
       xtoj.Convert_data(xml_data);
       System.out.println("here is your json data :)");
       xtoj.displayJSON_data();

    }
}
