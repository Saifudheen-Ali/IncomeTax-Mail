
package com.tbs.mailer.controller;

import com.tbs.mailer.mail.Message;

public interface MessageRetrievalListener {
    public void messageStarted(String uid, int number, int ofTotal);

    public void messageFinished(Message message, int number, int ofTotal);

    /**
     * FIXME <strong>this method is almost never invoked by various Stores! Don't rely on it unless fixed!!</strong>
     *
     * @param total
     */
    public void messagesFinished(int total);
}
