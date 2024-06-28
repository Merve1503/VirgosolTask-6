public class Task15Main {

    /*
    15.Bir sınıf oluşturun ve bu sınıfta bir constructor tanımlayın.
    Constructor içinde bir değeri başlatın ve bu değeri getter metodu ile ekrana yazdırın.
     */

    public static void main(String[] args) {
        // Person sınıfından bir nesne oluştur ve constructor'a bir değer ver
        Task15Person person = new Task15Person("Merve");

        // Getter metodunu çağırarak değeri ekrana yazdırın
        System.out.println(person.getName());
    }
}
