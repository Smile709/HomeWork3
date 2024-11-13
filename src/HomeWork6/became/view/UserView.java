package HomeWork6.became.view;

import HomeWork6.became.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}