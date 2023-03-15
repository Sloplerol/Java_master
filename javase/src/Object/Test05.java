package Object;

public class Test05 {
    public static void main(String[] args) {
        Person p1 = new Person("zjj",new Address("Beijing","shenzhen","123"));
        Person p2 = new Person("zjj",new Address("Beijing","shenzhen","123"));
        System.out.println(p1.equals(p2));
    }
}


class Person{
    String name;
    Address address;

    public Person() {
    }

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Person)) return false;
        if(this == obj) return true;
        Person p = (Person)obj;
        return name.equals(p.name) && address.equals(p.address);
    }

}

class Address{
    String city;
    String street;
    String zipcode;

    public Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Address)) return false;
        if(this == obj) return true;
        Address a = (Address) obj;
        return city.equals(a.city) && street.equals(a.street) && zipcode.equals(a.zipcode);
    }

}

