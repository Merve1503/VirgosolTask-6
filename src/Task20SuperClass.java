public class Task20SuperClass {

    /*
    20.Bir üst sınıf ve bir alt sınıf oluşturun.
    Alt sınıf, üst sınıftan bir constructor miras alsın ve bu constructor'u kullanarak nesne oluşturun.
     */

    private String message;

    // Parametreli constructor
    public Task20SuperClass(String message) {
        this.message = message;
    }

    // Getter metodu
    public String getMessage() {
        return message;
    }
}
