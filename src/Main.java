import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Esad\\Desktop\\dosyaIslemleri.txt");
        try {
            if(file.createNewFile()){
                System.out.println("Dosya olusturuldu!");
            }else System.out.println("Dosya zaten mevcut!");
        } catch (Exception e) {
            System.out.println("Dosya islemleri yapilirken hata olustu!!!");
        }


    }
}