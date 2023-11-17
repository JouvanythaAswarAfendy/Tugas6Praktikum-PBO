/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspertemuan6;

/**
 *
 * @author HP
 */
public class GanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Deret bilangan ganjil dan genap dari 0 - 20 :");
        for(int i=0;i<=20;i++) {
            if(i%2==0){
                System.out.println(i + " bilangan genap");
            }else{
                System.out.println(i + " bilangan ganjil");
            }
        }
    }
}