import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList listTugas = new ToDoList();
        Scanner s = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("1. Input tugas");
            System.out.println("2. Delete tugas");
            System.out.println("3. Lihat list tugas");
            System.out.println("4. Keluar");

            pilihan = s.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Input Data Tugas");
                    System.out.print("Mata Kuliah: ");
                    String mataKuliah = s.next();
                    System.out.print("Tugas: ");
                    String tugas = s.next();
                    System.out.print("Deadline: ");
                    String deadline = s.next();

                    listTugas.inputTugas(new Tugas(mataKuliah, tugas, deadline));
                    break;
                case 2:
                    System.out.println("1. Hapus tugas di awal list");
                    System.out.println("2. Hapus tugas di akhir list");
                    System.out.println("3. Hapus tugas berdasarkan mata kuliah");
                    System.out.println("4. Hapus tugas berdasarkan nama tugas");

                    System.out.print("Masukkan pilihan: ");
                    int pilihanHapus = s.nextInt();

                    switch (pilihanHapus) {
                        case 1:
                            listTugas.hapusTugasPertama();
                            break;
                        case 2:
                            listTugas.hapusTugasTerakhir();
                            break;
                        case 3:
                            System.out.println("Masukkan mata kuliah yang dihapus: ");
                            String mataKuliahDihapus = s.next();
                            listTugas.hapusTugasMatkul(mataKuliahDihapus);
                            break;
                        case 4:
                            System.out.println("Masukkan nama tugas yang dihapus: ");
                            String tugasDihapus = s.next();
                            listTugas.hapusTugasNama(tugasDihapus);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1. Cetak list dari awal");
                    System.out.println("2. Cetak list dari akhir");

                    System.out.print("Pilihan menu: ");
                    int pilihanCetak = s.nextInt();

                    if (pilihanCetak == 1) {
                        listTugas.cetakDariAwal();
                    } else if (pilihanCetak == 2) {
                        listTugas.cetakDariAkhir();
                    }
                    break;
            }
        } while (pilihan != 4);
    }
}
