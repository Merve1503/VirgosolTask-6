public class Task19MyClass {

    /*
    19.Bir sınıf oluşturun ve bu sınıfta private bir dizi tanımlayın.
    Bu dizi elemanlarını getter ve setter metodları ile güncelleyin ve ekrana yazdırın.
    */

    // Özel bir dizi tanımlayın
    private int[] numbers;

    // Constructor ile diziyi başlatın
    public Task19MyClass(int size) {
        numbers = new int[size];
    }

    // Getter metodu ile diziye erişin
    public int[] getNumbers() {
        return numbers;
    }

    // Setter metodu ile diziye yeni değerler atayın
    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    // Diziyi ekrana yazdıran bir metot tanımlayın
    public void printArray() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        // MyClass sınıfından bir nesne oluşturun ve constructor ile diziyi başlatın
        Task19MyClass myClass = new Task19MyClass(5);

        // Diziye yeni değerler atayın
        int[] newNumbers = {10, 20, 30, 40, 50};
        myClass.setNumbers(newNumbers);

        // Diziyi ekrana yazdırın
        myClass.printArray();
    }
}
