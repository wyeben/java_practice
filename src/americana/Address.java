package americana;

import java.util.Objects;

public class Address {
    private String addressName;
    private int addressNumber;


    public Address(String addressName, int addressNumber){
        this.addressName = addressName;
        this.addressNumber = addressNumber;
    }

    public Address(){

    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public int getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(int addressNumber) {
        this.addressNumber = addressNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return addressNumber == address.addressNumber && Objects.equals(addressName, address.addressName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressName, addressNumber);
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressName='" + addressName + '\'' +
                ", addressNumber=" + addressNumber +
                '}';
    }
}
