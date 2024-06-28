public class Task14SubClass extends Task14SuperClass {

    /*
    14.Bir sınıf oluşturun ve bu sınıfta protected bir değişken tanımlayın. Bu değişkene bir alt sınıf içinden erişin ve ekrana yazdırın.
    */

    // Alt sınıfın constructor'ı
    public Task14SubClass() {
        // Üst sınıftan miras alınan protected değişkene erişin ve ekrana yazdırın
        System.out.println(message);
    }
}
