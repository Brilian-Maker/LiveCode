/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package W4_Encaptulation;

import java.util.Scanner;

/**
 *
 * @author Mochamad Brilian Bani Adam
 * 22104410048
 */
public class Warung {

    public String makanan, minuman;

    public String getMakanan() {
        return makanan;
    }
    
    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getMinuman() {
        return minuman;
    }

    public void setMinuman(String minuman) {
        this.minuman = minuman;
    }
    
    public static void main(String[] args) {
        Warung warung = new Warung();
        System.out.println("Masukkan Makanan: ");
        Scanner varMakanan = new Scanner(System.in);
        warung.setMakanan(varMakanan.nextLine());

        
        System.out.println("Menu Makanan: "+warung.getMakanan());
    }
}
