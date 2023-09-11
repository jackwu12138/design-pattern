package com.example.mediator;

import java.time.LocalDateTime;

/**
 * @author jackwu
 */
public class Chatroom {

    public static void sendMsg(User user, String msg) {
        System.out.println(LocalDateTime.now() + " [" + user.getName() + "] : " + msg);
    }
}
