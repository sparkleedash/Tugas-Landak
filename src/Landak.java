class Landak {
        String nama;
        String jenisKelamin;
        int umur;
        String suara;

        public Landak(String nama, String jenisKelamin, int umur, String suara) {
                this.nama = nama;
                this.jenisKelamin = jenisKelamin;
                this.umur = umur;
                this.suara = suara;
        }

        void identitas() {
                System.out.println("Nama peliharaan: " + nama);
                System.out.println("Jenis Kelamin peliharaan: " + jenisKelamin);
                System.out.println("Umur peliharaan: " + umur + " bulan");
                System.out.println("Suara peliharaan: " + suara);
        }

        boolean statusKehidupan() {

                return false;
        }
}
