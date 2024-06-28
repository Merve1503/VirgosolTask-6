public class Task6Main {

    /*
    6.Bir sınıf oluşturun ve bu sınıfta iki farklı metot tanımlayın.
    Bu metotlar aynı isme sahip olsun ama farklı parametreler alsın (overloading).
     */

    public static void main(String[] args) {
        // MathOperations sınıfından bir nesne oluştur
        Task6MathOperations mathOperations = new Task6MathOperations();

        // toplamaYap metodunu çağırarak iki int sayının toplamını ekrana yazdırın
        mathOperations.toplamaYap(10, 20);

        // toplamaYap metodunu çağırarak iki double sayının toplamını ekrana yazdırın
        mathOperations.toplamaYap(10.5, 20.5);
    }
}
