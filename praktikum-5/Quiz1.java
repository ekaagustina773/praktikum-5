import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Quiz1{

    public static void main( String[] args){

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String ID_User="", Password="";
        boolean status = true;

        System.out.println("Masukkan ID_User : ");

        try{
            ID_User = dataIn.readLine();
        }catch( IOException e ){
            System.out.println("Error!");
        }

        System.out.println("Password : ");

        
        try{
            Password = dataIn.readLine();
        }catch( IOException e ){
            System.out.println("Password salah");
        }

        System.out.println("");
        System.out.println("Selamat datang ... ID. User");
     }

}