public class Task13SubClass extends Task13SuperClass {

    /*
    13.Bir üst sınıf ve bir alt sınıf oluşturun. Alt sınıf, üst sınıftan bir özelliği miras alsın ve bu özelliği ekrana yazdırsın.
    */

    // Alt sınıfın constructor'ı
    public Task13SubClass() {
        // Üst sınıftan miras alınan özelliği ekrana yazdırın
        System.out.println(message);
    }
}