/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.prytesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Aprendiz
 */
public class ClassTestTest {
    
    public ClassTestTest() {
    }

   
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 7;
        int b = 9;
        ClassTest instance = new ClassTest();
        int expResult = 16;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEsPositivo() {
        System.out.println("esPositivo");
        int n = 3;
        ClassTest instance = new ClassTest();
        boolean result = instance.esPositivo(n);
        assertTrue(result);
        //fail("The test case is a prototype.");
    }
/*
    @Test
    public void testCompararArrays() {
        System.out.println("Compara Arreglos");
        ClassTest instance = new ClassTest();
        int[] expResult = instance.array2();
        int[] result = instance.array1();
        assertArrayEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
*/
    /*@Test
    public void testArray2() {
        System.out.println("array2");
        ClassTest instance = new ClassTest();
        int[] expResult = null;
        int[] result = instance.array2();
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }*/

    
    @Test
    public void testExcDivision() {
        System.out.println("Excepcion de division");
        int a = 9;
        int b = 0;
        ClassTest instance = new ClassTest();
        assertThrows(IllegalArgumentException.class,()->{instance.excDivision(a, b);});
        //fail("The test case is a prototype.");
    }
}
