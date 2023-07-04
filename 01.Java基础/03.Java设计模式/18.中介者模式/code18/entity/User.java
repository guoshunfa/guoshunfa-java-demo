package code18.entity;

import code18.room.ChatRoom;

/**
 * @className: User
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
