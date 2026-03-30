import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DataRecord {
    private Map<String, Object> fields;

    public DataRecord() {
        this.fields = new HashMap<>();
    }

    public DataRecord(DataRecord other) {
        this.fields = new HashMap<>(other.fields);
    }

    public void set(String key, Object value) {
        fields.put(key, value);
    }

    public Object get(String key) {
        return fields.get(key);
    }

    public boolean has(String key) {
        return fields.containsKey(key);
    }

    public Set<String> keys() {
        return fields.keySet();
    }

    @Override
    public String toString() {
        return fields.toString();
    }
}