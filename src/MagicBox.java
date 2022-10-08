import java.util.Random;

public class MagicBox<T> {
    protected T [] items;
    protected int number;

    public MagicBox(int number) {
        this.items = (T[]) new Object[number];
        this.number = number;
    }

    public int isFullBox() {
        int sum = 0;
        for (T item : items) {
            if (item == null) {
                sum++;
            }
        }
        return sum;
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() throws MagicBoxException {
        int emptyItems = isFullBox();
        int randomInt = 0;
        if (emptyItems > 0) {
            throw new MagicBoxException("Коробка не полна. Осталось " + emptyItems + " яч.");
        } else {
            Random random = new Random();
            randomInt = random.nextInt(this.number);
        }
        return items[randomInt];
    }
}
