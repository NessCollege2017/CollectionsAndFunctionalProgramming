package edu.tomer;

/**
 //Properties:
 //firstName
 //lastName
 //phone
 //constructor
 //getters and setters
 //hashcode
 //equals
 //toString()
 //finally, implement Comparable<Contact>
 */
public class Contact implements Comparable<Contact>{
    private String firstName;
    private String lastName;
    private String phone;

    //constructor
    public Contact(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (!firstName.equals(contact.firstName)) return false;
        if (lastName != null ? !lastName.equals(contact.lastName) : contact.lastName != null) return false;
        return phone.equals(contact.phone);

    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + phone.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public int compareTo(Contact o) {

        int firstNameDiff = firstName.compareTo(o.firstName);
        if (firstNameDiff!=0)return firstNameDiff;

        if(lastName != null && o.lastName != null) {
            int lastNameDiff = lastName.compareTo(o.lastName);
            if (lastNameDiff != 0) return lastNameDiff;
        }

        return phone.compareTo(o.phone);
    }
}
