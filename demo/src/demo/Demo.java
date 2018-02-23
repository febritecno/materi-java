/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author febritecno
 */
    /**
     * @param args the command line arguments
     */

    class Demo{
    private static final int MAX =100;
    public static void test (int n){
        try {
            double hasil = MAX / n;
            System.out.println("hasil "+ hasil);
        try {
            int [] Arr = {1,2,3,4,5};
            System.out.println("Arr["+n+ "] :" + Arr[n]);
            
        }catch (NullPointerException npe) {
            System.out.println("Pointer null");
            System.out.println(npe);
        }
        }catch(ArithmeticException ae){
            System.out.println("terjadi pembagi 0");
            System.out.println(ae);
            
        }catch(Exception e){
            System.out.println("Exception generik");
            System.out.println(e);
        
        }
    }
       public static void main(String[] args) {
        // TODO code application logic here
            test(0);
            System.out.println();
            test(20);
        }
    
    }