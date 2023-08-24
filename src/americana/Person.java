package americana;

import java.util.Objects;

public class Person {

    private String firstName;
    private String secondName;
    private int age;
    private Vehicle[] vehicles;
    private House house;
    private Address address;

    public Person() {
    }

    public Person(String firstName, String secondName, int age, Vehicle[] vehicles, House house, Address address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.vehicles = vehicles;
        this.house = house;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}