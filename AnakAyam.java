/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspertemuan6;

/**
 *
 * @author HP
 */
public class AnakAyam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=10; i>=0; i--){
            if(i==0){
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal induknya");
            }else{
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1));
            }
        }
    }
    
}
