package examples.creational.factorymethod;

import examples.creational.factorymethod.creator.Creator;
import examples.creational.factorymethod.creator.SubProduct2Creator;
import examples.creational.factorymethod.creator.SubProudct1Creator;

public class Solution {
    public static void main(String[] args) {
        Creator creator1 = new SubProudct1Creator();
        creator1.doStuff();

        Creator creator2 = new SubProduct2Creator();
        creator2.doStuff();
    }
}
