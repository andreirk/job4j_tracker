package ru.job4j.pojo;

public class Shop {
    public static void main(String[] args) {
        Product products[] = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);


        Shop.delete(products, 1);


    }

    public static Product[] delete(Product[] products, int index){

        for(int i = index; i < products.length; i++){
            if(i < products.length - 1){
                products[i] = products[i + 1];
            }

        }
        products[products.length - 1] = null;
        return products;
    }
}