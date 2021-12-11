package GenericBox;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> elements;

    public Box() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }

    public void swap(int firstIndex, int secondIndex){
        T firstElement = this.elements.get(firstIndex);
        T secondElement = this.elements.get(secondIndex);
        this.elements.set(firstIndex, secondElement);
        this.elements.set(secondIndex, firstElement);
    }

    public int countOfGreaterElements(T element){
        return (int) this.elements.stream().filter(e -> e.compareTo(element) > 0).count();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (T element : this.elements) {
            sb.append(String.format("%s: %s", element.getClass().getName(), element));
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }
}