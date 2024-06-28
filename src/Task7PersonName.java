public class Task7PersonName {

    /*
    7.Bir sınıf oluşturun ve bu sınıfta private bir değişken tanımlayın.
    Bu değişkeni getter ve setter metodları ile güncelleyin ve ekrana yazdırın.
     */

    // Private bir değişken tanımlayın
    private String name;

    // Getter metodu
    public String getName() {
        return name;
    }

    // Setter metodu
    public void setName(String name) {
        this.name = name;
    }

    // Ekrana yazdırma metodu
    public void printName() {
        System.out.println("İsim: " + name);
    }
}
