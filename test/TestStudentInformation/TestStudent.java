/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestStudentInformation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author MY PC
 */
public class TestStudent {
    
    public TestStudent() {
        Student s = new Student();
        String expectedName= "Abesinia";
        String name=s.toString();
       assertEquals(expectedName,name, "Expect the name match Abesinia");
    }
    
}
