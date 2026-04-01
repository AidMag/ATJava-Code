package Work;

public class Executive extends Manager {
    private double stock;

    public Executive(String name, double salary, double bonus, double stock) {
        super(name, salary, bonus);
        this.stock = stock;

    }
    
    public void setStock(double stock) {
        this.stock = stock;
    }

    public double getStock() {
        return stock;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.printf("  Stock  = $%,12.2f%n", stock);
    }
}