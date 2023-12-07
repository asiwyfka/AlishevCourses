package lesson13;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private List<User> subscriptions;

    public User(String userName) {
        this.userName = userName;
        this.subscriptions = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return this.subscriptions.contains(user);

    }

    public boolean isFriend(User user) {
       return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.sendMessage(this,user,text);
    }

    @Override
    public String toString() {
        return userName;
    }
}
