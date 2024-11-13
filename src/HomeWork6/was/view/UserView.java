package HomeWork6.was.view;

import HomeWork6.was.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}