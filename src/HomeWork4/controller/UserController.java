package HomeWork4.controller;

import HomeWork4.data.User;

public interface UserController <T extends User> {
    void create (String firstName, String secondName, String lastName);
}