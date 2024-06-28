public class Task7Main {

    /*
    7.Bir sınıf oluşturun ve bu sınıfta private bir değişken tanımlayın.
    Bu değişkeni getter ve setter metodları ile güncelleyin ve ekrana yazdırın.
     */

    public static void main(String[] args) {
        // Person sınıfından bir nesne oluştur
        Task7PersonName person = new Task7PersonName();

        // Setter metodunu kullanarak ismi ayarlayın
        person.setName("Mert Çetiner");

        // Getter metodunu kullanarak ismi alıp ekrana yazdırın
        System.out.println("Oluşturulan kişinin ismi: " + person.getName());

        // printName metodu ile ekrana ismi yazdırın
        person.printName();
    }
}
