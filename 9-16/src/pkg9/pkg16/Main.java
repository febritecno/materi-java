/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.pkg16;

/**
 *
 * @author febritecno
 */
public class Main {

    /**
     * @param n
     */
    public static void test(int n)
            throws NullPointerException, ArithmeticException {
        
        if (n < 0 ){
            throw new NullPointerException(
            "KESALAHAN : null pointer");
            
        }else {
            throw new ArithmeticException(
            "KESALAHAN : arithmetic exception");
            
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    
    try {
        //test(-12); //menimbulkan eksepsi Null Pointer
        
        test(0); //menimbulkan eksepsi ArithmeticException
        
    }catch (Exception e) {
        System.out.println("Eksepsi ditangkap disini.....");
        System.out.println(e.getMessage());
        
    }
    System.out.println("Statemen setelah blok try catch");
        
    }
    
}
