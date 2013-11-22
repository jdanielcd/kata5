package kata5;

public class HistogramBuilder<T> {
    private T[] collection;

    public HistogramBuilder(T[] collection) {
        this.collection = collection;
    }
    
    public Histogram<T> build(){
        Histogram<T> histogram = new Histogram<>();
        for (T item : collection) {
            histogram.put(item, histogram.get(item)+1);
        }
        return histogram;
    }
}
