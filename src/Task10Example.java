public class Task10Example {

    /*
    10.Bir sınıf oluşturun ve bu sınıfta bir constructor tanımlayın.
    Constructor içinde iki değişkeni başlatın ve bu değişkenlerin değerlerini ekrana yazdırın.
     */

    // İki değişken tanımlayın
    private int num1;
    private int num2;

    // Constructor metodu
    public Task10Example(int num1, int num2) {
        // Değişkenleri başlatın
        this.num1 = num1;
        this.num2 = num2;

        // Değişkenlerin değerlerini ekrana yazdırın
        System.out.println("num1: " + this.num1);
        System.out.println("num2: " + this.num2);
    }
}
