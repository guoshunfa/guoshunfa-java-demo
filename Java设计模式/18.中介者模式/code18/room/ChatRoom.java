package code18.room;

import code18.entity.User;

import java.util.Date;

/**
 * @className: ChatRoom
 * @author: GuoShunFa
 * @date: 2022/12/7
 * @description:
 **/
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}

