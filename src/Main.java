import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Vücut Kitle İndeksi Hesaplama
        Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
        Formül
        Kilo (kg) / Boy(m) * Boy(m)
         */

        double boy, kilo, indeks;

        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu Giriniz(Metre) : ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu Giriniz(Kg) : ");
        kilo = input.nextDouble();

        indeks = kilo / (boy*boy);

        System.out.println("Vücut Kitle İndeksi : " + indeks);
    }
}