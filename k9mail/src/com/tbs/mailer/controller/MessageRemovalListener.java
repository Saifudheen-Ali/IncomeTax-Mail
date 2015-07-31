package com.tbs.mailer.controller;

import com.tbs.mailer.mail.Message;

public interface MessageRemovalListener {
    public void messageRemoved(Message message);
}
