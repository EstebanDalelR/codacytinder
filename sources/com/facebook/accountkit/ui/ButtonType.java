package com.facebook.accountkit.ui;

import com.facebook.accountkit.C1196d.C1194g;

public enum ButtonType {
    BEGIN(C1194g.com_accountkit_button_begin),
    CONFIRM(C1194g.com_accountkit_button_confirm),
    CONTINUE(C1194g.com_accountkit_button_continue),
    LOG_IN(C1194g.com_accountkit_button_log_in),
    NEXT(C1194g.com_accountkit_button_next),
    OK(C1194g.com_accountkit_button_ok),
    SEND(C1194g.com_accountkit_button_send),
    START(C1194g.com_accountkit_button_start),
    SUBMIT(C1194g.com_accountkit_button_submit);
    
    private final int value;

    private ButtonType(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
