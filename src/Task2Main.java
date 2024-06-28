public class Task2Main {

    /*
    2.Bir sınıf oluşturun ve bu sınıf içinde bir metot tanımlayın. Metodu çağırarak ekrana "Hello, World!" yazdırın.
    */

    // "Hello, World!" yazdıran bir metod
    public void yazdir() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        // Task2MainHelloWorld sınıfından bir nesne oluşturun
        Task2Main merhaba = new Task2Main();

        // yazdir metodunu çağırarak ekrana "Hello, World!" yazdırın
        merhaba.yazdir();
    }
}
