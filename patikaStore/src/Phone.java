import java.util.ArrayList;
import java.util.Scanner;

public class Phone extends Product implements Operation {

    Scanner scanner = new Scanner(System.in);

    private int camera;
    private int batteryCapacity;
    private String color;

    private static int id = 1;

    public boolean isRun = true;

    public Phone(int id, String name, double price, double discountRate, int stock, String brandName, String screenSize, int ram, String memory, int camera, int batteryCapacity, String color) {
        super(id, name, price, discountRate, stock, brandName, screenSize, ram, memory);
        this.camera = camera;
        this.batteryCapacity = batteryCapacity;
        this.color = color;
    }

    public Phone() {

    }

    static ArrayList<Phone> phoneList = new ArrayList<>();

    static {
        phoneList.add(new Phone(1,"Samsung Galaxy A51",3200.0,10,10,"Samsung","6.5",6,"128",48,6500,"Yellow"));
        phoneList.add(new Phone(2,"iPhone 11",8000.0,5,10,"iPhone","5.7",8,"256",120,4800,"Gray"));
        phoneList.add(new Phone(3,"Redmi Note 9",2900,15,10,"Xiaomi","6.1",5,"64",32,6000,"Dark"));
    }



    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void runMenu() {
        while (isRun){
            System.out.println("-----Notebook Yönetim Paneli-----");
            System.out.println("1- Telefon Listele. \n" +
                    "2- Telefon Ekleme. \n" +
                    "3- Telefon Silme. \n" +
                    "4- ID'ye göre filtreleme. \n" +
                    "5- Markaya göre filtreleme. \n" +
                    "0- Çıkış yap." );
            System.out.println("---------------------------------");
            System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
            int selection = scanner.nextInt();
            switch (selection){
                case 1:
                    showProductList();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    filterByProductID();
                    break;
                case 5:
                    filterByProductBrand();
                    break;
                case 0:
                    System.out.println("Çıkış yapıldı.");
                    isRun = false;
                    break;
                default:
                    System.out.println("Hatalı numara girdiniz. tekrar deneyiniz.");
            }
        }

    }

    @Override
    public void showProductList() {
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-6s %-22s %-10s %-10s %-12s %-10s %-10s %-10s %-10s%n %-10s",
                "| ID", "| Ürün Adı", "| Fiyat", "| Marka", "| Depolama", "| Ekran", "| RAM", "| Stok", "| İndirim    | Batarya Kapasitesi    | Kamera    | Renk    |");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        for (Phone phones: phoneList){
            System.out.printf("%-6s %-22s %-10s %-10s %-12s %-10s %-10s %-10s %-10s%n",
                    phones.getId(), phones.getName(), phones.getPrice(), phones.getBrandName(), phones.getMemory(),
                    phones.getScreenSize(),phones.getRam(),phones.getStock(),phones.getDiscountRate(),phones.getBatteryCapacity(),phones.getCamera(),phones.getColor());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------");

    }

    @Override
    public void addProduct() {
        System.out.println("Ürün özellikleri giriniz..");
        System.out.println("Ürün adı : ");
        String productName = scanner.nextLine();
        System.out.println("Ürün fiyatı : ");
        double productPrice = scanner.nextInt();
        System.out.println("Ürün marka : ");
        String productBrand = scanner.nextLine();
        System.out.println("Ürün depolama : ");
        String  productMemory = scanner.nextLine();
        System.out.println("Ürün ekran : ");
        String productScreen = scanner.nextLine();
        System.out.println("Ürün ram : ");
        int productRam = scanner.nextInt();
        System.out.println("Ürün stok : ");
        int productStock = scanner.nextInt();
        System.out.println("Ürün indirim oranı : ");
        double productDiscountRate = scanner.nextInt();
        System.out.println("Ürün Batarya kapasitesi : ");
        int productBatteryCapacity = scanner.nextInt();
        System.out.println("Ürün Kamera piksel : ");
        int productCamera = scanner.nextInt();
        System.out.println("Ürün renk : ");
        String productColor = scanner.nextLine();
        // Yukarıdaki parametreler gelcek
        phoneList.add(new Phone(id,productName,productPrice,productDiscountRate,productStock,productBrand,productScreen,productRam,productMemory,productCamera,productBatteryCapacity,productColor));
        System.out.println("Ürün eklendi.");

        // int id, String name, double price, double discountRate, int stock, String brandName, String screenSize, int ram, String memory, int camera, int batteryCapacity, String color

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void filterByProductID() {

    }

    @Override
    public void filterByProductBrand() {

    }
}
