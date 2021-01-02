package contoller;

import service.PersonMethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    static ArrayList<String> person = new ArrayList<>();
    public static void main(String args[]) throws IOException
    {
        String name = null, name1 = null;
        String fname;
        int flag = 0;
        PersonMethods personMethod = new PersonMethods();
        int choice = 1;
        while (choice != 0)
        {
            System.out.println("1.Create \n 2.Add new person \n 3.Edit contact \n"
                    + "4.Delete Contact \n 5.Add multiple contacts \n 6.Display \n 7.Search person by name" +
                    "\n 8.View By City \n 9.Get count by City \n 10.Sort by Name");
            System.out.println("Enter your choice:");
            Scanner s1 = new Scanner(System.in);
            choice = s1.nextInt();
            switch (choice)
            {
                case 1:
                    personMethod.CreatePerson();
                    break;
                case 2:
                    personMethod.AddPerson();
                    break;
                case 3:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter name");
                    name = sc.nextLine();
                    System.out.println("Enter name to Edit");
                    name1 = sc.nextLine();
                    personMethod.Edit(name,name1);
                    break;
                case 4:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Enter name");
                    String n = sc1.next();
                    personMethod.Delete(n);
                    break;
                case 5:
                    personMethod.AddMultipleContacts();
                    break;
                case 6:
                    personMethod.Display();
                    break;
                case 7:
                    personMethod.SearchByName();
                    break;
                case 8:
                    personMethod.ViewByCity();
                    break;
                case 9:
                    personMethod.GetCountByCity();
                    break;
                case 10:
                    personMethod.SortByName();
                    break;
            }
        }
    }
}
