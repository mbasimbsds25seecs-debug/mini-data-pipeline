public class App {
    public static void main(String[] args) {
        DataRecord record = new DataRecord();
        record.set("name", "Ali");
        record.set("score", 85);

        Transformer t = new PassThroughTransformer();
        DataRecord result = t.transform(record);

        System.out.println(result);
    }
}