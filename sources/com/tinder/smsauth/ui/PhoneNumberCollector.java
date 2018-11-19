package com.tinder.smsauth.ui;

import android.app.PendingIntent;
import android.arch.lifecycle.LifecycleObserver;
import android.content.Intent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/smsauth/ui/PhoneNumberCollector;", "Landroid/arch/lifecycle/LifecycleObserver;", "createIntent", "Landroid/app/PendingIntent;", "phoneNumberFromResult", "", "data", "Landroid/content/Intent;", "ui_release"}, k = 1, mv = {1, 1, 10})
public interface PhoneNumberCollector extends LifecycleObserver {
    @NotNull
    PendingIntent createIntent();

    @Nullable
    String phoneNumberFromResult(@Nullable Intent intent);
}
