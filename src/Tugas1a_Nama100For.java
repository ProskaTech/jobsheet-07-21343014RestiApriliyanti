/*
 * Created by 21343014_Resti Apriliyanti
 */

import java.util.Scanner;

public class Tugas1a_Nama100For {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        
        System.out.print("Masukkan Nama Lengkap : ");
        String nama = in.nextLine();

        for (i = 0; i < 10; i++)
        System.out.println(" " +nama);
    }
    
}