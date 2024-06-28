public class Task9Calculator {

    /*
    9.Bir sınıf oluşturun ve bu sınıfta iki değişken tanımlayın.
    Bu değişkenlerin toplamını bir metod içinde hesaplayın ve ekrana yazdırın.
     */

    // İki değişken tanımlayın
    private int num1;
    private int num2;

    // Constructor metodu
    public Task9Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Toplama metodu
    public void toplamaYap() {
        int toplam = num1 + num2;
        System.out.println("Toplam: " + toplam);
    }
}
