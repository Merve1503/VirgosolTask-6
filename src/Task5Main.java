public class Task5Main {

    /*
    5.Bir sınıf oluşturun ve bu sınıf içinde bir metot tanımlayın.
    Metot iki parametre alsın ve bu parametrelerin toplamını ekrana yazdırsın.
     */

    public static void main(String[] args) {
        // Calculator sınıfından bir nesne oluştur
        Task5Calculator calculator = new Task5Calculator();

        // toplamaYap metodunu çağırarak iki sayının toplamını ekrana yazdırın
        calculator.toplamaYap(10, 20);
    }
}
