package examples.creational.factorymethod.creator;

import examples.creational.factorymethod.product.Product;
import examples.creational.factorymethod.product.SubProduct1;

public class SubProudct1Creator extends Creator{
    @Override
    Product createProduct() {
        return new SubProduct1();
    }
}
