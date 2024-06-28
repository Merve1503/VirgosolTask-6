public class Task11Main {

    /*
    11.Bir sınıf oluşturun ve bu sınıfta iki farklı constructor tanımlayın.
    Constructor'lar farklı parametreler alsın (overloading).
     */

    public static void main(String[] args) {
        // Person sınıfından bir nesne oluştur ve sadece isim parametresi ver
        Task11Person2 person1 = new Task11Person2("Merve");

        // Person sınıfından bir nesne oluştur ve isim ile yaş parametreleri ver
        Task11Person2 person2 = new Task11Person2("Mert", 30);
    }

}
