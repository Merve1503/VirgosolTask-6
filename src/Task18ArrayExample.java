public class Task18ArrayExample {

    /*
    18.Bir sınıf oluşturun ve bu sınıfta bir dizi tanımlayın.
    Dizi elemanlarını bir metod içinde güncelleyin ve ekrana yazdırın.
     */

    // Bir dizi tanımlayın
    private int[] numbers;

    // Constructor ile diziyi başlatın
    public Task18ArrayExample(int size) {
        numbers = new int[size];
    }

    // Diziyi güncelleyen bir metot tanımlayın
    public void updateArray(int index, int value) {
        if (index >= 0 && index < numbers.length) {
            numbers[index] = value;
        }
    }

    // Diziyi ekrana yazdıran bir metot tanımlayın
    public void printArray() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
