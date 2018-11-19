package com.facebook.accountkit.ui;

public enum UpdateFlowState {
    NONE,
    PHONE_NUMBER_INPUT,
    SENDING_CODE,
    SENT_CODE,
    CODE_INPUT,
    VERIFYING_CODE,
    VERIFIED,
    CODE_INPUT_ERROR,
    PHONE_NUMBER_INPUT_ERROR;

    static UpdateFlowState getBackState(UpdateFlowState updateFlowState) {
        switch (updateFlowState) {
            case SENDING_CODE:
            case SENT_CODE:
            case CODE_INPUT:
            case PHONE_NUMBER_INPUT_ERROR:
                return PHONE_NUMBER_INPUT;
            default:
                return NONE;
        }
    }
}
