package examples.creational.factorymethod.creator;

import examples.creational.factorymethod.product.Product;
import examples.creational.factorymethod.product.SubProduct2;

public class SubProduct2Creator extends Creator{
    @Override
    Product createProduct() {
        return new SubProduct2();
    }
}
