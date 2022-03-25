package Library;

public class Administrator extends User implements IAdministrator{
    public Administrator(String name) {
        super(name);
    }

    @Override
    public void findBook() {
        System.out.println("Администратор нашел книгу");
    }

    @Override
    public void overdueNotification(User user) {
        System.out.println("Администратор уведомил пользователя - " + getName());
    }
}
