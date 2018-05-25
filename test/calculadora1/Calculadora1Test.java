/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author a
 */
@RunWith(value = Parameterized.class)
public class Calculadora1Test {
    
     
    private static Calculadora1 calc;
    private int a,b,esperado;
    
    @Parameterized.Parameters
    public static Iterable<Object[]>getData(){
        List<Object[]> obj= new ArrayList<>();
        obj.add(new Object[] {3,1,4} );
        obj.add(new Object[] {3,6,9} );
        return  obj;
    }
    
     public Calculadora1Test(int a , int b, int esperado) {
        this.a=a;
        this.b=b;
        this.esperado=esperado;
    }
    
   @BeforeClass
    public static void setUpClass() {
         System.out.println("Antes clase()");  // se  ejecuta solo una vez   es   mejor  para inicializar 
        calc = new Calculadora1();
    }
    
    @AfterClass
    public static void tearDownClass() {
         System.out.println("Despues clase()");
    }
      @Before
    public void setUp() {
        System.out.println("Antes()");
         calc.clear(); 
    }
  
    @After
    public void tearDown() {
       System.out.println("Despues()");
      
    }

    /**
     * Test of suma method, of class Calculadora1.
     */
   @Test
    public void testSuma() {
        System.out.println("suma");
        //int a = 2;
        //int b = 3;
        //int expResult = 5;
        int result = calc.suma(a, b);
        assertEquals(esperado, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   
}
