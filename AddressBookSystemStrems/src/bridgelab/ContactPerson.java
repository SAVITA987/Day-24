package bridgelab;
import java.util.*;
import java.util.stream.Collectors;

import java.util.*;

class ContactPerson {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String phoneNumber;
    private String email;

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nAddress: " + address + "\nCity: " + city
                + "\nState: " + state + "\nZIP: " + zip + "\nPhone Number: " + phoneNumber + "\nEmail: " + email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ContactPerson that = (ContactPerson) obj;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName);
    }

}
