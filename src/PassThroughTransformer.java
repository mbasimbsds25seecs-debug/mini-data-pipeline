public class PassThroughTransformer implements Transformer {

    @Override
    public DataRecord transform(DataRecord record) {
        return record;
    }
}