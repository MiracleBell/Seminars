package seminar.half2.sem2.task1;

import java.util.Objects;

public class Data {
    private String name;
    private double value;

    public Data(String name, double value) {
        if (name == null || name.equals("")) {
            throw new NullPointerException("Field name can't be empty");
        }
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {
            throw new NullPointerException("Field 'name' direction to null or empty");
        }
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return Double.compare(data.value, value) == 0 && Objects.equals(name, data.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }
}
