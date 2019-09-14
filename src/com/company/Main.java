package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       System.out.println("1. wanna your data with JSON format? press 1 :)");
       System.out.println("2. wanna your data with XML format? press 2 :)");
       Scanner sc = new Scanner(System.in);
       int choice = sc.nextInt();
       switch (choice)
       {
          case 1:
              System.out.println("Enter xml file name : ");
              Scanner sc1 = new Scanner(System.in);
              String xml_filename = sc1.nextLine();
              XMLtoJSON xtoj = new XMLtoJSON();
              String xml_data = xtoj.get_data(xml_filename);
              xtoj.Convert_data(xml_data);
              System.out.println("here is your json data :)");
              xtoj.display_data();
              break;
          case 2:
             System.out.println("Enter json file name : ");
             Scanner sc2 = new Scanner(System.in);
             String json_filename = sc2.nextLine();
             JSONtoXML jtox = new JSONtoXML();
             String json_data=jtox.get_data(json_filename);
             jtox.Convert_data(json_data);
             System.out.println("here is your xml data :)");
             jtox.display_data();
             break;

       }

       }


    }

