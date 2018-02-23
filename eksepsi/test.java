/**
 * 
 * @author Yudi Setiawan
 * 
 * Contoh 2 : Menggunakan teknik short hand If Else
 *
 */
 
public class test
{
    public static void main(String[] args)
    {
        
        int [] A = new int[5];
        try {
        for(int i=0;i<5;i++){
         
        A[i] = i * 10 ;   
        
        }
        
        System.out.println("Nilai pada indexs array 9"+ A[9]);
        
        
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("tidak ada index ke"+ e.getMessage());
        }
        for (int i=0;i<5;i++){
            System.out.println("elemen"+ i + ": " + A[i] );
        }
        
    }
}