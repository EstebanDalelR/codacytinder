package com.facebook.accountkit;

import com.facebook.accountkit.ui.NotificationChannel;

public interface PhoneLoginModel extends LoginModel {
    String getConfirmationCode();

    NotificationChannel getNotificationChannel();

    PhoneNumber getPhoneNumber();

    long getResendTime();
}
