package Work;

public class Executive extends Manager {

    private double stock;

    public Executive(String name, double salary, double bonus, double stock) {
        super(name, salary, bonus);
        this.stock = stock;
       
    }
}

/*
Modify the Executive class so that it has public methods to get and set the number of shares that an executive currently owns (as a double)
Also override the displayInfo() method for the Executive class to include the number of shares that the Executive currently owns
*/