import java.time.LocalDate;
import java.util.Scanner;
public class DataDiriSederhana {
    public static void main(String[] args) throws Exception {
        Scanner objInput = new Scanner(System.in);

        int tahunLahir = 0;

        System.out.print("masukkan nama: ");
        String nama=objInput.nextLine();
        System.out.print("masukkan jenis kelamin: ");
        String  gender=objInput.next().trim().toLowerCase();
        System.out.print("masukkan tahun lahir: ");
        tahunLahir=objInput.nextInt();

        int tahunSekarang=LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        System.out.println("data diri: ");
        System.out.println("nama: "+nama);
        System.out.println("jenis kelamin: "+(gender=="p"?"perempuan":"laki-laki"));
        System.out.println("tahun lahir: "+umur+" tahun");
        objInput.close();
    }
}
