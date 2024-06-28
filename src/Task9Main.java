public class Task9Main {

    /*
    9.Bir sınıf oluşturun ve bu sınıfta iki değişken tanımlayın.
    Bu değişkenlerin toplamını bir metod içinde hesaplayın ve ekrana yazdırın.
     */

    public static void main(String[] args) {
        // Calculator sınıfından bir nesne oluştur ve constructor'ı çağırarak değerleri ata
        Task9Calculator calculator = new Task9Calculator(10,20);

        // toplamaYap metodu ile değişkenlerin toplamını ekrana yazdır
        calculator.toplamaYap();
    }
}
