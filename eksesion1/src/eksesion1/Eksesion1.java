/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eksesion1;

/**
 *
 * @author febritecno
 */
public class Eksesion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int bil = 12;
    int pem = 0;
    
    try {
        int hasil = bil / pem;
    System.out.println("hasil : "+ hasil);
    }catch (ArithmeticException ae) {
        System.out.println("tidak pernah dieksekusi");
    }catch (Exception a){
        System.out.println("eksepsi generik");       
    }
    }
}