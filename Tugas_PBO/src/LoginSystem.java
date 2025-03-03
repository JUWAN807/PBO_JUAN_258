import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args) throws Exception {
        Scanner objInput = new Scanner(System.in);

        //data admin
        String username = "Admin258";
        String password = "Password258";
        
        //data mahasiswa
        String nama="M JUAN YAFI ZAIM WIBISONO";
        String nim="202410370110258";

        System.out.println("pilihan login: ");
        System.out.println("1.admin");
        System.out.println("2.mahasiswa: ");
        System.out.print("masukkan pilihan: ");
        int pilihan;
        if (objInput.hasNextInt()) {
            pilihan=objInput.nextInt();
            objInput.nextLine();
        }else{
            System.out.println("inputan tidak valid");
            objInput.close();
            return;
        }

        if (pilihan==1) {
            while (true) {
                System.out.print("masukkan username: ");
                String inputUserName=objInput.nextLine();
                System.out.print("masukkan password: ");   
                String inputPassword=objInput.nextLine();
                if (inputUserName.equals(username)&&inputPassword.equals(password)) {
                   System.out.println("login berhasil sebagai admin"); 
                   break;
                }else{
                    System.out.println("username atau password salah");
                }
            }
        }else if (pilihan==2) {
            while (true) {
                System.out.print("masukkan nama: ");
                String inputNama=objInput.nextLine();
                System.out.print("masukkan Nim: ");   
                String inputNim=objInput.nextLine();
                if (inputNama.equals(nama)&&inputNim.equals(nim)) {
                   System.out.println("login mahasiswa berhasil");
                   System.out.println("Nama: " + inputNama);
                   System.out.println("NIM: " +inputNim); 
                   break;
                }else{
                    System.out.println("username atau password salah");
                }
            }   
        }else{
            System.out.println("input tidak valid");
        }
        objInput.close();

    }
}
