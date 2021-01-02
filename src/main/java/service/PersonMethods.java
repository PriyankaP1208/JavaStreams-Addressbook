package service;

import module.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonMethods {
    static Scanner s=new Scanner(System.in);
    static ArrayList<Person> person=new ArrayList<>();
    public static void CreatePerson() throws IOException
    {
        Scanner scanner=new Scanner(System.in);
        Person person1=new Person();
        System.out.println("Enter First Name");
        person1.fname=scanner.nextLine();
        NoDuplicateContacts(person1.fname);
        System.out.println("Enter Last Name");
        person1.lname=scanner.nextLine();
        System.out.println("Enter City Name");
        person1.city=scanner.nextLine();
        System.out.println("Enter State Name");
        person1.state=scanner.nextLine();
        System.out.println("Enter Phone Number");
        person1.phno=scanner.nextLine();
        System.out.println("Enter Zip");
        person1.zip=scanner.nextLine();
        person.add(person1);
        Display();
    }
    public static void AddPerson() throws IOException
    {
        CreatePerson();
        for(Person p:person)
        {
            System.out.println(p);
        }
    }
    public static String Edit(String name,String name1) throws IOException
    {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        for(Person p:person)
        {
            if(p.fname.equals(name))
            {
                flag=1;
                switch (name1)
                {
                    case "city":
                        System.out.println("Enter Your city Name");
                        p.city=sc.nextLine();
                        break;
                    case "state":
                        System.out.println("Enter Your state Name");
                        p.state=sc.nextLine();
                        break;
                    case "phone":
                        System.out.println("Enter Your phone Number");
                        p.phno=sc.nextLine();
                        break;
                    case "zip":
                        System.out.println("Enter Your zip");
                        p.zip=sc.nextLine();
                        break;
                }
            }
            System.out.println(p);
        }
        return name1;
    }
    public static String Delete(String name) throws IOException
    {
        int flag=0;
        Iterator<Person> itr=person.iterator();
        while(itr.hasNext())
        {
            Person a=itr.next();
            if(a.fname.equals(name))
            {
                flag=1;
                itr.remove();
            }
        }
        return name;
    }
    public static void AddMultipleContacts() throws IOException
    {
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter Number of persons to add:");
        int count=sc2.nextInt();
        for(int i=0;i<count;i++)
        {
            CreatePerson();
        }

    }

    public static void Display() throws IOException
    {
        for(Person p:person)
        {
            System.out.println(p);
        }
    }
    public static String NoDuplicateContacts(String name) throws IOException {
        ArrayList<Person> list = new ArrayList<>();
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getFirstName().equals(name)) {
                System.out.println("Already Exists");
                CreatePerson();
            }
        }
        return name;
    }
    public static void SearchByName() throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.nextLine();
        for(Person per : person)
        {
            if(name.equals(per.fname))
            {
                System.out.println(per.toString());
            }
        }
    }
    public static void ViewByCity() throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String city1=sc.nextLine();
        for(Person per : person)
        {
            if(city1.equals(per.city))
            {
                System.out.println(per.toString());
            }
        }
    }
    public static void GetCountByCity() throws IOException
    {
        String city;
        System.out.println("Enter city name:");
        city=s.nextLine();
        int count=(int)person.stream().filter(person1->city.equals(person1.getCity())).count();
    }
}
