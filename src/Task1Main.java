public class Task1Main {

    /*
    1.Bir sınıf oluşturun ve bu sınıfa ait bir nesne oluşturun. Nesnenin bir özelliğini ekrana yazdırın.
    */

    public static void main(String[] args) {
        // Araba sınıfından bir nesne oluşturun
        Task1Araba benimArabam = new Task1Araba("Toyota", "Corolla", 2020);

        // Nesnenin bir özelliğini ekrana yazdırın
        System.out.println("Arabanın Markası: " + benimArabam.marka);

        // Tüm özellikleri ekrana yazdırmak için bilgiYazdir metodunu çağırın
        benimArabam.bilgiYazdir();
    }
}
