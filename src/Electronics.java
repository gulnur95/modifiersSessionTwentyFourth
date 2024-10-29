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

class Electronics extends Product {
    private String brand;
    private String color;
    private boolean isNew;
    private int memory;

    public Electronics(int id, String name, String description, double price, String createDate, int productCount,
                       String brand, String color, boolean isNew, int memory) {
        super(id, name, description, price, createDate, "Electronics", productCount);
        this.brand = brand;
        this.color = color;
        this.isNew = isNew;
        this.memory = memory;
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return super.toString() + ", Brand: " + brand + ", Color: " + color +
                ", Is New: " + isNew + ", Memory: " + memory + " GB";
    }
}
