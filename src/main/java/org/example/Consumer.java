package org.example;

// Класс Потребитель
class Consumer implements Runnable {

    Store store;
    final int PURCHASED_GOODS = 11;//количество покупаемых товаров (минус один)

    Consumer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i < PURCHASED_GOODS; i++) {
            store.get();
        }
    }
}
