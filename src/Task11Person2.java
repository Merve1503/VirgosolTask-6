public class Task11Person2 {

    /*
    11.Bir sınıf oluşturun ve bu sınıfta iki farklı constructor tanımlayın.
    Constructor'lar farklı parametreler alsın (overloading).
     */

    // Değişkenler tanımlayın
    private String name;
    private int age;

    // İlk constructor: sadece isim parametresi alır
    public Task11Person2(String name) {
        this.name = name;
        this.age = 0; // varsayılan yaş değeri
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    // İkinci constructor: isim ve yaş parametreleri alır
    public Task11Person2(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
