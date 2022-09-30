/*
 * Created by 21343014_Resti Apriliyanti
 */

public class Tugas3_AngkaNestedLoop {
    public static void main(String[] args) {
        int c, y;
        int MAKS = 6;

        for(c = 1; c <= MAKS; c++) {
            for(y = 1; y <= c; y++) {
                System.out.print(" " +c);
            }

            System.out.println(" ");
        }
    }    
}
