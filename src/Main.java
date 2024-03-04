import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("=== Identitas Landak ===");
        System.out.println("[1.] Sonic");
        System.out.println("[2.] Amy");

        int pilihLandak;

        System.out.print("Pilih nomor landak:");
        Scanner scanner = new Scanner(System.in);

        pilihLandak = scanner.nextInt();

        if (pilihLandak == 1) {
            System.out.println("=== Identitas Landak Sonic ===");
            Landak sonic = new Landak("Sonic", "Jantan", 3, "Ciit");;
            sonic.identitas();

            if (!sonic.statusKehidupan()) {
                System.out.println("Sonic telah berpulang ke rahmatullah.");
            } else {
                System.out.println("Sonic ada dan hidup");
            }

        } else if (pilihLandak == 2) {
            System.out.println("=== Identitas Landak Amy ===");
            Landak amy = new Landak("Amy", "Betina", 2, "Cuiit");;
            amy.identitas();

            if (!amy.statusKehidupan()) {
                System.out.println("Amy telah berpulang ke rahmatullah.");
            } else {
                System.out.println("Amy ada dan hidup.");
            }

        } else {
            System.out.println("Pilihan tidak valid");
        }
    }
}
