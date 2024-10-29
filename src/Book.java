import java.time.LocalDate;
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

class Book extends Product {

    private String authorFullName;


    public Book(int id, String name, String description, double price, String createDate, int productCount, String authorFullName) {
        super(id, name, description, price, createDate, "Book", productCount);
        this.authorFullName = authorFullName;
    }


    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    @Override
    public String toString() {
        return super.toString() + ", Author: " + authorFullName;
    }
}
