/*
 * Created by 21343014_Resti Apriliyanti
 */

import java.util.Scanner;

public class Tugas1c_Nama100DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;

        System.out.print("Masukkan Nama Lengkap : ");
        String nama = in.nextLine();

        do {
            System.out.println(" " +nama);
            i++;
        }
        while (i < 10);
    } 
}
