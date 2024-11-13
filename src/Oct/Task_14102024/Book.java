package Oct.Task_14102024;
/*Book class which has an abstract method getDetails(),name, author, price.
PrintMyBook class that inherits from the Book class.
abstract Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", "120");
Output "Harry Potter, J.k. Rowling, 100"*/
abstract class Book {
    String name ;
    String Author;
    int price;

    public Book(String name, String Author, int price) {
        this.name = name;
        this.Author = Author;
        this.price = price;
    }
        abstract void getDetails();

}

