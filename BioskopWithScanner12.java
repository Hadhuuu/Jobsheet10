import java.util.Scanner;

public class BioskopWithScanner12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String nama, next;
        //Perulangan While 1
        while (true) {
            //Ketersediaan menu
            System.out.println("====== Silahkan pilih Menu ======");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            //Pemilihan menu
            System.out.print("Silahkan Pilih menu (1/2/3): ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    do {
                        //Input dalam data penonton perulangan
                        System.out.print("Masukkan nama  : ");
                        nama = sc.nextLine();
                        System.out.print("Masukkan baris : ");
                        int baris = sc.nextInt();
                        System.out.print("Masukkan kolom : ");
                        int kolom = sc.nextInt();
                        sc.nextLine();
                        //Kondisi untuk pengecekan ketersediaan kursi penonton
                        if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length
                                && penonton[baris - 1][kolom - 1] == null) //Logika pengecekan
                                 {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Selamat.. Data penonton berhasil dimasukkan!");
                        } else {
                            System.out.println("Mohon maaf, Kursi sudah terisi Silakan coba lagi..");
                        }

                        System.out.print("Input penonton lain? (y/n)");
                        next = sc.nextLine();

                    } while (next.equalsIgnoreCase("y"));
                    break;

                case 2:
                    //Menampilkan Daftar Penonton
                    System.out.println("Daftar Penonton :");
                    for (String[] row : penonton) {
                        for (String seat : row) {
                            System.out.print((seat == null) ? "*** " : seat + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih!");
                    System.exit(0);//saya mencari google untuk Syntax ini

                default:
                //Inputan Pemilihan menu tidak sesui
                    System.out.println("Pilihlah menu yang sesuai !!");
            }
        }
    }
}
