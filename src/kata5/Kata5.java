package kata5;

public class Kata5 {
    
    public static void main(String[] args) {
        PersonLoader loader = new MockPersonLoader();
        HistogramBuilder<Person> builder = new HistogramBuilder<>(loader.load());
        HistogramViewer<Person> viewer = new HistogramViewer<>();
        viewer.show(builder.build());
    }
}
