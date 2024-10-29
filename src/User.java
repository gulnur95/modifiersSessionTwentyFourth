import java.util.ArrayList;


    /*
 Создайте клаcc Product. Поля (id,name, description, price, createDate,type,productCount)
 Создайте два дочерних класса  Electronics поля(id,brand, color, isNew, memory) и Book (id,authorFullName)
 User (id,firstName, lastName, email, password, products) Для старта сайта выбираем 3 операции
-Register
-Login
-Exit
После входа в аккаунт пользователю должны быть доступны следующие методы:
-Add new Product
-Get All Products
-Get All Books
-Get All Electronics
 */

    class User {
        private int id;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private Product[] products;
        private int productIndex;

        public User(int id, String firstName, String lastName, String email, String password) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.password = password;
            this.products = new Product[10];
            this.productIndex = 0;
        }

        public boolean login(String email, String password) {
            return this.email.equals(email) && this.password.equals(password);
        }

        public void addProduct(Product product) {
            if (productIndex < products.length) {
                products[productIndex++] = product;
            } else {
                System.out.println("Превышен лимит продуктов!");
            }
        }

        public void getAllProducts() {
            for (int i = 0; i < productIndex; i++) {
                System.out.println(products[i]);
            }
        }

        public void getAllBooks() {
            for (int i = 0; i < productIndex; i++) {
                if (products[i] instanceof Book) {
                    System.out.println(products[i]);
                }
            }
        }

        public void getAllElectronics() {
            for (int i = 0; i < productIndex; i++) {
                if (products[i] instanceof Electronics) {
                    System.out.println(products[i]);
                }
            }
        }
    }