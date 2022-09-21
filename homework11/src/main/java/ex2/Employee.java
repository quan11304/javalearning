package ex2;

import lombok.*;

import java.util.Arrays;

@RequiredArgsConstructor
@Setter @Getter
public class Employee {
    protected int id;
    protected String name;
    protected boolean permanent;
    protected Address address;
    protected int[] phoneNumbers;
    protected String role;
    protected String[] cities;
    protected PropertiesClass properties;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", permanent=" + permanent +
                ", address=" + address +
                ", phoneNumbers=" + Arrays.toString(phoneNumbers) +
                ", role='" + role + '\'' +
                ", cities=" + Arrays.toString(cities) +
                ", properties=" + properties +
                '}';
    }
}
