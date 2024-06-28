public class Task15Person {

    /*
    15.Bir sınıf oluşturun ve bu sınıfta bir constructor tanımlayın.
    Constructor içinde bir değeri başlatın ve bu değeri getter metodu ile ekrana yazdırın.
     */

    // Bir değişken tanımlayın
    private String name;

    // Constructor tanımlayın
    public Task15Person(String name) {
        this.name = name;
    }

    // Getter metodu tanımlayın
    public String getName() {
        return name;
    }
}
