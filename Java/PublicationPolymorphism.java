class Publication{
private String title;
public int qty;
private double price;
private int copies;

public String gettitle() {   //getter for title
    return this.title;
}

public void settitle(String title) {    //setter for title
    this.title = title;
}

public int getcopies() {    //getter for copies
    return this.copies;
}

public void setcopies(int copies) { //setter for copies
    this.copies = copies;
}

public double getprice() {  //getter for price
    return this.price;
}

public void setprice(double price){ //setter for price
    this.price = price;
}

public void sellcopy(int qty) {
    System.out.println("Total Publication sell: $" + (qty * price));
}
}

class Book extends Publication {
    private String author;
    public void ordercopies(int pcopies) {
        System.out.println("Total Book sell: $" + (qty * getcopies()));
    }
}

class Magazine extends Publication {
    private int orderQty;
    private String currentIssue;
    public void RecvNewIssue(String pNewIssue) {
        setcopies(orderQty);
        currentIssue = pNewIssue;
    }
    public void sellcopy(int qty) {
        System.out.println("Total Magazine sell: $" + (qty * getprice()));
    }
}

class PublicationPolymorphism{     //main class
    public static void main(java.lang.String[] args) {
        Book book1 = new Book();
        book1.ordercopies(3);
        Publication book2 = new Book();
        book2.setprice(10);
        book2.sellcopy(3);
        Publication publication = new Publication();
        publication.setcopies(3);
        publication.getcopies();
        publication.setprice(20.3);
        publication.getprice();
        publication.sellcopy(2);
        Publication magazine = new Magazine();
        magazine.setprice(20.3);
        magazine.sellcopy(6);
    }
}

/*
Output:

Total Book sell: $0
Total Publication sell: $30.0
Total Publication sell: $40.6
Total Magazine sell: $121.80000000000001
*/