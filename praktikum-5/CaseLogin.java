import java.io.*;

public class CaseLogin {

    public static void main(String[] args) throws IOException{

        BufferedReader dataInput = new BufferedReader(
            new InputStreamReader(System.input));

        String id_user, password;
        boolean status = true;

        do{

            System.out.println("Masukkan ID. User : ");
            id_user = dataInput.readLine();

            System.out.println("Masukkan Password : ");
            Password = dataInput.readLine();

            if(!id_user.equals("171530010")){
                System.out.println("ID. User yang Anda masukkan salah!");
            }else{
                if(!password.equals("mahasiswa123")){
                System.out.println("Password yang Anda masukkan salah!");
            }else{
                status = false;
            }
      }

        }while(status);

        System.out.println("Selamat datang : " + id_user);
        
    }
}