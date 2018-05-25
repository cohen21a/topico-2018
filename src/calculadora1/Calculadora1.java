/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;

/**
 *
 * @author Usuario
 */
public class Calculadora1 {
    private int ans;
    private float ans1;
    public Calculadora1(){
        ans=0;
    }
    public int suma(int a, int b){
        ans=a+b;
        return ans;
    }
    public int divi(int a , int b){
        if(b==0){
            throw new ArithmeticException("no  se puede dividir por cero ");
        }else{
            
            ans=a/b;
        }
        return ans ;
    }
    public int resta(int a, int b){
        ans=a-b;
        return ans;
    }
    
    public int add(int a){
        ans+=a;
        return ans;
    }
    public void clear(){
        ans=0;
    }
    
    public float dou(float a, float  b ){
       
       ans1= (a+b);
       return ans1;
    }
    public void optimo(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            
        }
    }
}
