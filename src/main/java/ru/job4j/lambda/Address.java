package ru.job4j.lambda;

public class Address {
    private String city;
    private String street;

    private int home;

    private int apartment;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Address address = (Address) obj;

        return address.city.equals(city)
                && address.street.equals(street)
                && address.apartment == apartment
                && address.home == home;
    }

    @Override
    public int hashCode() {
        return (city + street + apartment + home).hashCode();
    }
}