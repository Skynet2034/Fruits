package fruits;

class Box <T extends Fruit> {

    int count = 0;

    T item;

    void add(T item) {
       if (count==0) this.item =item;
        count++;

    }

    float getWeight() {
        return  item.getWeight() * count;

    }

    boolean compare(Fruit fruit) {

        return (this.getWeight() == fruit.getWeight());

    }

    boolean compare(Box<? extends Fruit> box) {

        return (this.getWeight() == box.getWeight());

    }

    void move(Box<T> box) {

        box.count += this.count;
        this.count = 0;
    }
}