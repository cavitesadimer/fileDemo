import java.io.File;

public class Main {
    public static void main(String[] args) {
    createFile();
    getFileInfo();

    }
    public static void createFile(){
        File file = new File("C:\\Users\\Esad\\Desktop\\dosyaIslemleri.txt");
        try {
            if(file.createNewFile()){
                System.out.println("Dosya olusturuldu!");
            }else System.out.println("Dosya zaten mevcut!");
        } catch (Exception e) {
            System.out.println("Dosya islemleri yapilirken hata olustu!!!");
        }
    }
    public static void getFileInfo(){
        File file = new File("C:\\Users\\Esad\\Desktop\\dosyaIslemleri.txt");
        if(file.exists()){
            System.out.println("Dosya adi: "+file.getName());
            System.out.println("Dosya yolu: "+file.getPath());
            System.out.println("Dosya okunabiliyor mu?: "+file.canRead());
            System.out.println("Dosya yazilabiliyor mu?: "+file.canWrite());
            System.out.println("Dosya boyutu(byte): "+file.length());

        }else System.out.println("ERROR!!! Dosya mevcut degil");
    }
}
