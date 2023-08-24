package americana;

import java.util.Objects;

public class House {

    private String type;
    private int size;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



    public House(String type, int size) {
        this.type = type;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return size == house.size && Objects.equals(type, house.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, size);
    }

    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", size=" + size +
                '}';
    }
}
