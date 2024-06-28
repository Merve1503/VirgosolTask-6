public class Task6MathOperations {

    /*
    6.Bir sınıf oluşturun ve bu sınıfta iki farklı metot tanımlayın.
    Bu metotlar aynı isme sahip olsun ama farklı parametreler alsın (overloading).
     */

    // İlk metot: iki int parametre alır ve toplamını ekrana yazdırır
    public void toplamaYap(int a, int b) {
        int toplam = a + b;
        System.out.println("Toplam (int): " + toplam);
    }

    // İkinci metot: iki double parametre alır ve toplamını ekrana yazdırır
    public void toplamaYap(double a, double b) {
        double toplam = a + b;
        System.out.println("Toplam (double): " + toplam);
    }
}
