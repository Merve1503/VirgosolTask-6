public class Task1Araba {

    /*
    1.Bir sınıf oluşturun ve bu sınıfa ait bir nesne oluşturun. Nesnenin bir özelliğini ekrana yazdırın.
    */

    // Araba sınıfının özellikleri
    String marka;
    String model;
    int yil;

    // Yapıcı (constructor) metodu
    public Task1Araba(String marka, String model, int yil) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    // Araba'nın özelliklerini ekrana yazdıran bir metod
    public void bilgiYazdir() {
        System.out.println("Marka: " + this.marka);
        System.out.println("Model: " + this.model);
        System.out.println("Yıl: " + this.yil);
    }
}
