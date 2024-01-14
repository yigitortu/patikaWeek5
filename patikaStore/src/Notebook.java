import java.util.ArrayList;
import java.util.Scanner;

public class Notebook extends Product implements Operation{

    Scanner scanner = new Scanner(System.in);

    private boolean isRun = true;

    private static int id = 1;


    public Notebook(int id, String name, double price, double discountRate, int stock, String brandName, String screenSize, int ram, String memory) {
        super(id, name, price, discountRate, stock, brandName, screenSize, ram, memory);
    }



    public Notebook() {

    }

    static ArrayList<Notebook> notebookList = new ArrayList<>();
    static {
        notebookList.add(new Notebook(1,"HUAWEI Matebook 14", 7000,10,20,"Huawei","14.0",16,"1TB"));
        notebookList.add(new Notebook(2,"Lenovo", 7000,10,20,"Huawei","14.0",16,"1TB"));
        notebookList.add(new Notebook(3,"Asus tuf", 7000,10,20,"Huawei","14.0",16,"1TB"));
    }



    @Override
    public void runMenu() {
        while (isRun){
            System.out.println("-----Notebook Yönetim Paneli-----");
            System.out.println("1- Notebook Listele. \n" +
                    "2- Notebook Ekleme. \n" +
                    "3- Notebook Silme. \n" +
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
        System.out.printf("%-6s %-22s %-10s %-10s %-12s %-10s %-10s %-10s %-10s%n",
                "| ID", "| Ürün Adı", "| Fiyat", "| Marka", "| Depolama", "| Ekran", "| RAM", "| Stok", "| İndirim    |");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        for (Notebook notebooks: notebookList){
            System.out.printf("%-6s %-22s %-10s %-10s %-12s %-10s %-10s %-10s %-10s%n",
                    notebooks.getId(), notebooks.getName(), notebooks.getPrice(), notebooks.getBrandName(), notebooks.getMemory(),
                    notebooks.getScreenSize(),notebooks.getRam(),notebooks.getStock(),notebooks.getDiscountRate());
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
        // Yukarıdaki parametreler gelcek
        notebookList.add(new Notebook(id,productName,productPrice,productDiscountRate,productStock,productBrand,productScreen,productRam,productMemory));
        System.out.println("Ürün eklendi.");

        // int id, String name, double price, double discountRate, int stock, String brandName, String screenSize, int ram, String memory




    }

    @Override
    public void deleteProduct() {
        System.out.print("Silmek istediğiniz ürünün ID'sini giriniz : ");
        int deleteSelect = scanner.nextInt();

        Notebook deleteProduct = findNotebookByID(deleteSelect);
        notebookList.remove(deleteProduct);



    }

    public Notebook findNotebookByID(int id){
        for (Notebook notebooks: notebookList){
            if (notebooks.getId() == id){
                return notebooks;
            }
        }
        return null;
    }
    public Notebook findNotebookByName(String name){
        for (Notebook notebooks: notebookList){
            if (notebooks.getBrandName().equals(name)){
                return notebooks;
            }
        }
        return null;
    }

    @Override
    public void filterByProductID() {
        System.out.print("Filtrelemek istediğinz ID'yi seçiniz:");
        int selectID = scanner.nextInt();
        // yukarıdan buldugumuz idyi burada sorguluyoruz
        if (notebookList.contains(findNotebookByID(selectID))) {
            showProduct(findNotebookByID(selectID));
        }else {
            System.out.println("Ürün yok amk");
        }
    }

    public void showProduct(Notebook notebook) {
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-6s %-22s %-10s %-10s %-12s %-10s %-10s %-10s %-10s%n",
                "| ID", "| Ürün Adı", "| Fiyat", "| Marka", "| Depolama", "| Ekran", "| RAM", "| Stok", "| İndirim    |");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        for (Notebook notebooks: notebookList){
            if (notebooks == notebook) {
                System.out.printf("%-6s %-22s %-10s %-10s %-12s %-10s %-10s %-10s %-10s%n",
                        notebooks.getId(), notebooks.getName(), notebooks.getPrice(), notebooks.getBrandName(), notebooks.getMemory(),
                        notebooks.getScreenSize(),notebooks.getRam(),notebooks.getStock(),notebooks.getDiscountRate());
                System.out.println("----------------------------------------------------------------------------------------------------------------");
            }
        }
    }



    @Override
    public void filterByProductBrand() {
        System.out.print("Filtrelemek istediğinz markayı giriniz :");
        String selectBrand = scanner.next();
        if (notebookList.contains(findNotebookByName(selectBrand))) {
            showProduct(findNotebookByName(selectBrand));
        }else {
            System.out.println("Ürün yok amk");
        }

    }
}
