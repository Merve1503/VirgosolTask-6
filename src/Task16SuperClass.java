public class Task16SuperClass {

    /*
    16.Bir üst sınıf ve bir alt sınıf oluşturun.
    Alt sınıf, üst sınıftan bir constructor miras alsın ve bu constructor'u kullanarak nesne oluşturun.
     */

    // Bir değişken tanımlayın
    protected String message;

    // Constructor tanımlayın
    public Task16SuperClass(String message) {
        this.message = message;
    }

    // Getter metodu tanımlayın
    public String getMessage() {
        return message;
    }
}
