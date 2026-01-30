package Streams;

import Streams.domain.Contact;
import Streams.domain.Sex;
import Streams.domain.User;

import java.util.ArrayList;
import java.util.List;

import static Streams.domain.ContactType.EMAIL;
import static Streams.domain.ContactType.PHONE;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>(generateUsers());

        var values = users.stream()
                .filter(u-> u.contacts().size() >= 2).toList();

        values.forEach(System.out::println);
    }

    private static List<User> generateUsers(){
        var contact1 = List.of(
                new Contact("(83)99112-0343", PHONE),
                new Contact("joao@gmail.com", EMAIL)
        );
        var contact2 = List.of(
                new Contact("(83)99830-9743", PHONE)
        );
        var contact3 = List.of(
                new Contact("lucas@outlook.com", EMAIL)
        );
        var contact4 = List.of(
                new Contact("andreia@gmai.com", EMAIL),
                new Contact("andreia@outlook.com", EMAIL)
        );
        var contact5 = List.of(
                new Contact("(83)99112-0090", PHONE),
                new Contact("(83)91232-0090", PHONE)
        );

        var user1 = new User("Joaõ",26, Sex.MALE, new ArrayList<>(contact1));
        var user2 = new User("Maria",28, Sex.FEMALE, new ArrayList<>(contact2));
        var user3 = new User("Lucas",19, Sex.MALE, new ArrayList<>(contact3));
        var user4 = new User("Andreia",40, Sex.FEMALE, new ArrayList<>(contact4));
        var user5 = new User("Victor",30, Sex.MALE, new ArrayList<>(contact5));
        var user6 = new User("Bruna",36, Sex.FEMALE, new ArrayList<>());


        return  List.of(user1,user2,user3,user4,user5,user6);
    }
}
