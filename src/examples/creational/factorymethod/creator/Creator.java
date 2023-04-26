package examples.creational.factorymethod.creator;

import examples.creational.factorymethod.product.Product;

public abstract class Creator {
    abstract Product createProduct();
    public void doStuff() {
        createProduct().whoAmI();
    }
}
