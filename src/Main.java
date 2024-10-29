import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static User[] users = new User[10];
    private static int userCount = 0;
    private static User loggedInUser = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите операцию: 1. Register 2. Login 3. Exit");
            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) {
                case 1:
                    register(scanner);
                    break;
                case 2:
                    login(scanner);
                    if (loggedInUser != null) {
                        manageUserAccount(scanner);
                    }
                    break;
                case 3:
                    System.out.println("Выход...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверная операция!");
            }
        }
    }

    private static void register(Scanner scanner) {
        System.out.println("Введите имя:");
        String firstName = scanner.nextLine();
        System.out.println("Введите фамилию:");
        String lastName = scanner.nextLine();
        System.out.println("Введите email:");
        String email = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();

        if (userCount < users.length) {
            User user = new User(userCount + 1, firstName, lastName, email, password);
            users[userCount++] = user;
            System.out.println("Регистрация успешна!");
        } else {
            System.out.println("Превышен лимит пользователей!");
        }
    }

    private static void login(Scanner scanner) {
        System.out.println("Введите email:");
        String email = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();

        for (int i = 0; i < userCount; i++) {
            if (users[i].login(email, password)) {
                loggedInUser = users[i];
                System.out.println("Вход выполнен!");
                return;
            }
        }
        System.out.println("Неверный email или пароль!");
    }

    private static void manageUserAccount(Scanner scanner) {
        while (true) {
            System.out.println("Выберите операцию: 1. Add new Product 2. Get All Products 3. Get All Books 4. Get All Electronics 5. Logout");
            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) {
                case 1:
                    addProduct(scanner);
                    break;
                case 2:
                    loggedInUser.getAllProducts();
                    break;
                case 3:
                    loggedInUser.getAllBooks();
                    break;
                case 4:
                    loggedInUser.getAllElectronics();
                    break;
                case 5:
                    System.out.println("Выход из аккаунта...");
                    loggedInUser = null;
                    return;
                default:
                    System.out.println("Неверная операция!");
            }
        }
    }

    private static void addProduct(Scanner scanner) {
        System.out.println("Выберите тип продукта: 1. Book 2. Electronics");
        int productType = scanner.nextInt();
        scanner.nextLine(); // очищаем буфер

        System.out.println("Введите название продукта:");
        String name = scanner.nextLine();
        System.out.println("Введите описание:");
        String description = scanner.nextLine();
        System.out.println("Введите цену:");
        double price = scanner.nextDouble();
        System.out.println("Введите количество:");
        int productCount = scanner.nextInt();
        scanner.nextLine(); // очищаем буфер

        if (productType == 1) {
            System.out.println("Введите полное имя автора:");
            String authorFullName = scanner.nextLine();
            Product book = new Book(loggedInUser.hashCode(), name, description, price, "2024-10-24", productCount, authorFullName);
            loggedInUser.addProduct(book);
        } else if (productType == 2) {
            System.out.println("Введите бренд:");
            String brand = scanner.nextLine();
            System.out.println("Введите цвет:");
            String color = scanner.nextLine();
            System.out.println("Продукт новый? (true/false):");
            boolean isNew = scanner.nextBoolean();
            System.out.println("Введите объем памяти:");
            int memory = scanner.nextInt();
            scanner.nextLine(); // очищаем буфер

            Product electronics = new Electronics(loggedInUser.hashCode(), name, description, price, "2024-10-24", productCount, brand, color, isNew, memory);
            loggedInUser.addProduct(electronics);
        } else {
            System.out.println("Неверный тип продукта!");
        }
    }
}





