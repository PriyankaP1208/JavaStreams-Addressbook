package module;

import java.util.Comparator;

public class Person {
    public String fname, lname, address, city, state, zip, phno;
    public String getFirstName()
    {
        return fname;
    }
    public void setFirstName(String fname)
    {
        this.fname=fname;
    }
    public String getLastName()
    {
        return lname;
    }
    public void setLastName(String lname)
    {
        this.fname=lname;
    }
    public String getAddress()
    {
        return address;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city=city;
    }
    public String getState()
    {
        return state;
    }
    public void setState(String state)
    {
        this.state=state;
    }
    public String getZip()
    {
        return zip;
    }
    public void setZip(String zip)
    {
        this.zip=zip;
    }
    public String getPhoneNo()
    {
        return phno;
    }
    public void setPhoneNo(String phno)
    {
        this.phno=phno;
    }
    public static Comparator<Person> PerCityComparator = new Comparator<Person>() {

        public int compare(Person s1, Person s2) {
            String CityName1 = s1.getCity().toUpperCase();
            String CityName2 = s2.getCity().toUpperCase();
            return CityName1.compareTo(CityName2);
        }};
    public String toString() {
        return "FirstName=" +fname + "\n"+
                "LastName=" + lname+ "\n"+
                "City=" + city + "\n" +
                "State=" + state + "\n" +
                "Zip=" + zip + "\n" +
                "PhNo=" + phno + "\n"
                ;
    }
}
