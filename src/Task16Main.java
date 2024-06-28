public class Task16Main {

    public static void main(String[] args) {
        // SubClass sınıfından bir nesne oluştur ve constructor'a bir değer ver
        Task16SubClass subClass = new Task16SubClass("Merhaba Dünya");

        // Üst sınıftan miras alınan getter metodunu çağırarak değeri ekrana yazdırın
        System.out.println(subClass.getMessage());
    }
}
