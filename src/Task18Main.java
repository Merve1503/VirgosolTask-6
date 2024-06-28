public class Task18Main {

    public static void main(String[] args) {
        // ArrayExample sınıfından bir nesne oluştur ve dizinin boyutunu belirle
        Task18ArrayExample arrayExample = new Task18ArrayExample(5);

        // Diziyi güncelle
        arrayExample.updateArray(0, 10);
        arrayExample.updateArray(1, 20);
        arrayExample.updateArray(2, 30);
        arrayExample.updateArray(3, 40);
        arrayExample.updateArray(4, 50);

        // Diziyi ekrana yazdır
        arrayExample.printArray();
    }

}
