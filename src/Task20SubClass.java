public class Task20SubClass extends Task20SuperClass {
    // Alt sınıf constructor'u
    public Task20SubClass(String message) {
        // Üst sınıfın constructor'ını çağırma super() ile
        super(message);
    }

    public static void main(String[] args) {
        // Alt sınıftan bir nesne oluşturun
        Task20SubClass subClass = new Task20SubClass("Merhaba, alt sınıf!");

        // Üst sınıftan miras alınan getMessage metoduyla mesajı yazdırın
        System.out.println(subClass.getMessage());
    }
}