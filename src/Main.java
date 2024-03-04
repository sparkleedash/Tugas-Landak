
public class Main {
    public static void main(String[] args) {
        System.out.println("Jenis peliharaan: Landak");

        System.out.println();

        identitas();

        if(!statusKehidupan()){
            System.out.println("Hewan peliharaan telah berpulang");
        } else{
            System.out.println("Hewan peliharaan ada dan hidup");
        }


    }

    static void identitas(){
        String nama = "Sonic";
        System.out.println("Nama peliharaan: " + nama);

        String JenisKelamin = "Jantan";
        System.out.println("Jenis Kelamin peliharaan: " + JenisKelamin);

        int umur = 3;
        System.out.println("Umur peliharaan: " + umur + " bulan");

        String suara = "Ciit";
        System.out.println("Suara peliharaan: " + suara);
    }

    static boolean statusKehidupan(){
        return false;
    }
}