package Library;

public class Supplier implements ISupplier, IReader{
    @Override
    public void takeBook() {
        System.out.println("Поставщик взял книгу");
    }

    @Override
    public void returnBook() {
        System.out.println("Поставщик сделал возврат книги");
    }

    @Override
    public void bringBook() {
        System.out.println("Поставщик попросил книги в библиотеку");
    }
}
