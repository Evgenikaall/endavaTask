package com.Lessons;


import java.time.LocalDate;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        fillArrayList(users);

        System.out.println("\n\t\tList of users (not updated): \n");
        for (User user : users)
            System.out.println(user);

        updateNewUsersStatus(users);
        updateOldUsersStatus(users);

        System.out.println("-------------------------------------");
        System.out.println("\n\t\tUpdated List :\n");
        for (User user : users)
            System.out.println(user);
    }

    public static void updateNewUsersStatus(ArrayList<User> userArrayList) {
        for (User currentUser : userArrayList) {
            if (currentUser.getStatus() == userStatus.NEW &&
                    LocalDate.now().compareTo(currentUser.timeStamp) > 1) {
                currentUser.setStatus(userStatus.ACTIVE);
            }
        }
    }

    public static void updateOldUsersStatus(ArrayList<User> userArrayList) {
        for (User currentUser : userArrayList) {
            if (currentUser.getStatus() == userStatus.INACTIVE) {
                if (LocalDate.now().minusMonths(1).compareTo(currentUser.timeStamp) > 0) {
                    currentUser.setStatus(userStatus.BLOCKED);
                }
            }
        }
    }

    public static void fillArrayList(ArrayList<User> usersArrayList) {
        usersArrayList.add(
                new User(
                        "Random",
                        "Name",
                        18,
                        "trin@mail.ru",
                        userStatus.NEW,
                        LocalDate.of(2020, 10, 3)
                )
        );
        usersArrayList.add(
                new User(
                        "FirstName",
                        "LastName",
                        31,
                        "ennter@gmail.com",
                        userStatus.NEW,
                        LocalDate.now()
                )
        );
        usersArrayList.add(
                new User(
                        "Odin",
                        "Belli",
                        11,
                        "vsus@yandex.ru",
                        userStatus.NEW,
                        LocalDate.of(2020, 10, 4)
                )
        );
        usersArrayList.add(
                new User(
                        "SomeUser",
                        "noLast",
                        24,
                        "some33@mail.ru",
                        userStatus.INACTIVE,
                        LocalDate.now().minusMonths(1).minusDays(1)
                )
        );
        usersArrayList.add(
                new User(
                        "Fedor",
                        "Petrovich",
                        43,
                        "petrovich_1337@mail.ru",
                        userStatus.INACTIVE,
                        LocalDate.now().minusMonths(1)
                )
        );


    }
}
