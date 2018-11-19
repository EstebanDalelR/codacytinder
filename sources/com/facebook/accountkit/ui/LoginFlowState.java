package com.facebook.accountkit.ui;

public enum LoginFlowState {
    NONE,
    PHONE_NUMBER_INPUT,
    EMAIL_INPUT,
    SENDING_CODE,
    SENT_CODE,
    CODE_INPUT,
    ACCOUNT_VERIFIED,
    CONFIRM_INSTANT_VERIFICATION_LOGIN,
    CONFIRM_ACCOUNT_VERIFIED,
    EMAIL_VERIFY,
    VERIFYING_CODE,
    VERIFIED,
    RESEND,
    ERROR;

    static LoginFlowState getBackState(LoginFlowState loginFlowState) {
        switch (loginFlowState) {
            case SENDING_CODE:
            case SENT_CODE:
            case CODE_INPUT:
            case ACCOUNT_VERIFIED:
            case CONFIRM_ACCOUNT_VERIFIED:
            case CONFIRM_INSTANT_VERIFICATION_LOGIN:
                return PHONE_NUMBER_INPUT;
            case EMAIL_VERIFY:
                return EMAIL_INPUT;
            case RESEND:
                return CODE_INPUT;
            default:
                return NONE;
        }
    }
}
