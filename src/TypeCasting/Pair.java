package TypeCasting;

class Pair {
    public final Object key;
    public final Object value;

    public Pair(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public void print() {
        System.out.printf("(%s, %s)", key, value);
    }

    public Object getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}