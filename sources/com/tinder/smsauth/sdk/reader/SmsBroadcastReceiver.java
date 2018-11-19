package com.tinder.smsauth.sdk.reader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/smsauth/sdk/reader/SmsBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "listener", "Lcom/tinder/smsauth/sdk/reader/SmsBroadcastReceiver$Listener;", "(Lcom/tinder/smsauth/sdk/reader/SmsBroadcastReceiver$Listener;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Listener", "sdk_release"}, k = 1, mv = {1, 1, 10})
public final class SmsBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    private final Listener f46771a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/tinder/smsauth/sdk/reader/SmsBroadcastReceiver$Listener;", "", "onError", "", "error", "", "onSuccess", "message", "", "sdk_release"}, k = 1, mv = {1, 1, 10})
    public interface Listener {
        void onError(@NotNull Throwable th);

        void onSuccess(@NotNull String str);
    }

    public SmsBroadcastReceiver(@NotNull Listener listener) {
        C2668g.b(listener, "listener");
        this.f46771a = listener;
    }

    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        C2668g.b(context, "context");
        C2668g.b(intent, "intent");
        context = intent.getAction();
        if (context != null) {
            if (context.hashCode() == -1845060944) {
                if (context.equals("com.google.android.gms.auth.api.phone.SMS_RETRIEVED") != null) {
                    context = intent.getExtras();
                    if (context != null) {
                        Status status = (Status) context.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                        C2668g.a(status, "status");
                        int statusCode = status.getStatusCode();
                        if (statusCode == 0) {
                            context = context.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                            if (context != null) {
                                this.f46771a.onSuccess(context);
                            } else {
                                this.f46771a.onError((Throwable) new Error("Could not read message from intent"));
                            }
                        } else if (statusCode == 15) {
                            context = this.f46771a;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Timeout waiting for SMS code=");
                            stringBuilder.append(status.getStatusCode());
                            stringBuilder.append(" statusMessage=");
                            stringBuilder.append(status.getStatusMessage());
                            context.onError(new Error(stringBuilder.toString()));
                        }
                    }
                }
            }
        }
    }
}
