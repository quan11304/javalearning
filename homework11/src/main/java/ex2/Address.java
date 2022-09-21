package ex2;

public class Address {
    protected String street;
    protected String city;
    protected int zipcode;

    public Address(String street, String city, int zipcode) {
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
    }

//    @Override
//    public String toString() {
//        return "street: " + street +
//                ", city: " + city +
//                ", zipcode: " + zipcode;
//    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
