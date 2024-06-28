public class Task3Person {

    /*
    3.Bir sınıf oluşturun ve bu sınıfa ait bir constructor tanımlayın.
    Constructor içinde bir değeri başlatın ve bu değeri ekrana yazdırın.
    */

    // Sınıfın bir özelliği
    String name;

    // Constructor (yapıcı metod)
    public Task3Person(String name) {
        // Özelliği başlat
        this.name = name;
        // Başlatılan değeri ekrana yazdır
        System.out.println("İsim: " + this.name);
    }
}
