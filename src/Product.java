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

class Product {
    private int id;
    private String name;
    private String description;
    private double price;
    private String createDate;
    private String type;
    private int productCount;

    public Product(int id, String name, String description, double price, String createDate, String type, int productCount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createDate = createDate;
        this.type = type;
        this.productCount = productCount;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product [ID: " + id + ", Name: " + name + ", Description: " + description +
                ", Price: " + price + ", Date: " + createDate + ", Type: " + type +
                ", Product Count: " + productCount + "]";
    }


}