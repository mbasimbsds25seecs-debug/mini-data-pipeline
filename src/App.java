public class App {
    public static void main(String[] args) {
        DataRecord record = new DataRecord();
        record.set("name", "Ali");
        record.set("score", 85);
        record.set("department", "CS");

        System.out.println(record.get("name"));      // Ali
        System.out.println(record.has("score"));     // true
        System.out.println(record.has("gpa"));       // false
        System.out.println(record);                  // full map
    }
}