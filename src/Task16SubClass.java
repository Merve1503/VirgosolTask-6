public class Task16SubClass extends Task16SuperClass {

    /*
    16.Bir üst sınıf ve bir alt sınıf oluşturun.
    Alt sınıf, üst sınıftan bir constructor miras alsın ve bu constructor'u kullanarak nesne oluşturun.
     */

    // Alt sınıfın constructor'ı
    public Task16SubClass(String message) {
        // Üst sınıfın constructor'unu çağırın
        super(message);
    }
}
