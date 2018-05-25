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
        int result = calc.suma(a, b);
        assertEquals(esperado, result);

    }
    
     @Test
    public void testResta() {
        System.out.println("resta");
        int result = calc.resta(a, b);
        assertEquals(esperado, result);
    }
    
    @Test  (timeout=2000)
    public void testOptimo() {
        System.out.println("Optimo");
        calc.optimo();
    }
    
   
    @Test
    public  void testdiv(){
        int res =calc.divi(a, b);
        assertEquals(esperado, res);
        
    }
    
    @Test(expected = ArithmeticException.class)
    public  void divexep(){
        int res =calc.divi(a, b);
    }

     @Test
    public void testDouble() {
        System.out.println("Double");
        float a= (float) Math.random();
        float b= (float) Math.random();
        float c= (float) 0.11;
        float expResult =a+b+c;
        float result = calc.dou(a, b);
        double delta= 0.30;
        assertEquals(esperado, result,delta);
        
        
        
    }
    
    @Test      
    public void testObj() {
        System.out.println("Double");
        Calculadora1 a= new Calculadora1();
        Calculadora1 b= new Calculadora1();
        assertEquals(a,b);
        
        
    }

   
}
