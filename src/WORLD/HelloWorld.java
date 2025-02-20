package WORLD;

//import ASSIGNMENT.A7;
//import ASSIGNMENT.A8;
//import CONCEPTS.Constructor;
//import CONCEPTS.Singleton;
//import CONCEPTS.Initialization_Static_Block;
//import ASSIGNMENT.A9_WRAPPER CLASS;
//import ASSIGNMENT.A10_CLA;
//import CONCEPTS.Inheritance;
//import ASSIGNMENT.A11_javaPackages;
//import CONCEPTS.This_Super;
//import ASSIGNMENT.A13_UserInput2;
//import ASSIGNMENT.A15_Constructor;
//import ASSIGNMENT.A16_Inheritance;

import CONCEPTS.JDBC;

import java.sql.SQLException;


public class HelloWorld {
    public static void main(String[] args) {
//        CONCEPTS.JDBC Q1 = new  CONCEPTS.JDBC();
        try {
            JDBC.getConnection();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
//        Q1.driver();
//        Q1.FileRead();

    }
}
