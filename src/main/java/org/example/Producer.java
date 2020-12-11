package org.example;

// класс Производитель
class Producer implements Runnable {
    Store store;
    final int NUMBER_PRODUCED_GOODS = 11;//максимальное число производимых товаров (минус один)

    Producer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i < NUMBER_PRODUCED_GOODS; i++) {
            store.put();
        }
    }
}
