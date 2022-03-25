package Library;

public class Test {
    public static void main(String[] args) {
        Librarian librarian = new Librarian("Rassulkhair");
        librarian.overdueNotification(librarian);
        Supplier supplier = new Supplier();
        supplier.returnBook();

        Administrator administrator = new Administrator("Alex");
        administrator.overdueNotification(administrator);

        Reader reader = new Reader("Abl");
        reader.findBook();
    }
}
