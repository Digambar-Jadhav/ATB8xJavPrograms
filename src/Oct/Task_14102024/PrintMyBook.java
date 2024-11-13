package Oct.Task_14102024;

public class PrintMyBook extends Book{
    public PrintMyBook(String name, String Author, int price ){
      super(name, Author, price);
    }
    // Implementation of the abstract method to print book details
    @Override
    void getDetails() {
        System.out.println("Book Name = " +name+ ", Author Name = " +Author+ ", Price = " + price);
    }
}
