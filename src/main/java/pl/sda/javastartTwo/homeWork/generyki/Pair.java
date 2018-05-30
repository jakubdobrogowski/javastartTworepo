package pl.sda.javastartTwo.HomeWork.generyki;

public class Pair <T, S> {

    private T first;
    private S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public boolean equalsFirstSecond( S second) {

        return this.getFirst().equals(second);
    }

    public boolean equalsFS(Pair obj) {
        return this.getFirst().equals(obj.getFirst())
                && this.getSecond().equals(obj.getSecond());
    }
}
