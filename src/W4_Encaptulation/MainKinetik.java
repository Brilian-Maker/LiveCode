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
public class MainKinetik {
    public double kecepatan, massa;

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }
    
    public double hitung(){
        return 0.5*massa*Math.pow(kecepatan, 2);
    }
    
    public static void main(String[] args) {
    
        MainKinetik kinetik = new MainKinetik();
        
        System.out.println("Masukkan Kecepatan: ");
        Scanner varKecepatan = new Scanner (System.in);
        System.out.println("Masukkan Massa: ");
        Scanner varMassa = new Scanner(System.in);
        
        kinetik.setKecepatan(varKecepatan.nextDouble());
        kinetik.setMassa(varMassa.nextDouble());
        
        System.out.println(kinetik.hitung());
    }
    
}
