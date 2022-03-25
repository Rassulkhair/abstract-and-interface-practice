package Library;

public class Reader extends User implements IReader, IAdministrator{
    public Reader(String name) {
        super(name);
    }

    @Override
    public void takeBook() {
        System.out.println("Читатель взял книгу ");
    }

    @Override
    public void returnBook() {
        System.out.println("Читатель сделал возврат книги");
    }

    @Override
    public void findBook() {
        System.out.println("Читатель нашел книгу");
    }

    @Override
    public void overdueNotification(User user) {

    }
}
