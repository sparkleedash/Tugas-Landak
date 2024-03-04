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
                System.out.println("Nama Landak: " + nama);
                System.out.println("Jenis Kelamin Landak: " + jenisKelamin);
                System.out.println("Umur Landak: " + umur + " bulan");
                System.out.println("Suara Landak: " + suara);
        }

        boolean statusKehidupan() {

                return false;
        }
}
