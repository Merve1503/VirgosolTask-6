public class Task4Main {

    /*
    4.Bir sınıf oluşturun ve bu sınıf içinde bir metot tanımlayın.
    Metot bir parametre alsın ve bu parametreyi ekrana yazdırsın.
    */

    public static void main(String[] args) {
        // Printer sınıfından bir nesne oluştur
        Task4Printer printer = new Task4Printer();

        // yazdir metodunu çağırarak ekrana mesaj yazdırın
        printer.yazdir("Hello, World!");
    }
}
