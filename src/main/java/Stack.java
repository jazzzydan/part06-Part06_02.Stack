import java.util.ArrayList;

public class Stack {
private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (this.stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        this.stack.add(value);
    }

    public ArrayList<String> values() {
        return this.stack;
    }

    public String take() {
        if (stack.isEmpty()) {
            return null;
        }
        int lastIndex = stack.size() - 1;
        String item = stack.get(lastIndex);
        stack.remove(lastIndex);
        return item;
    }
}
