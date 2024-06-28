public class Task17Main {

    public static void main(String[] args) {
        // Person sınıfından bir nesne oluştur
        Task17Person person = new Task17Person();

        // Setter metodunu kullanarak değeri güncelle
        person.setName("Merve Çetiner");

        // Getter metodunu kullanarak değeri ekrana yazdır
        System.out.println(person.getName());
    }
}
