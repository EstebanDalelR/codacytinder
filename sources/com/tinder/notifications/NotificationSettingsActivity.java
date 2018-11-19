package com.tinder.notifications;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.tinder.notifications.C9953h.C9947a;
import com.tinder.notifications.C9953h.C9950d;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\t"}, d2 = {"Lcom/tinder/notifications/NotificationSettingsActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "finish", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "settings-notifications_release"}, k = 1, mv = {1, 1, 10})
public final class NotificationSettingsActivity extends AppCompatActivity {
    /* renamed from: a */
    public static final C9941a f45395a = new C9941a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/tinder/notifications/NotificationSettingsActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "settings-notifications_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.notifications.NotificationSettingsActivity$a */
    public static final class C9941a {
        private C9941a() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final Intent m40903a(@NotNull Context context) {
            C2668g.b(context, "context");
            return new Intent(context, NotificationSettingsActivity.class);
        }
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C9950d.activity_notification_settings);
        overridePendingTransition(C9947a.enter_right_to_left, C9947a.enter_left_to_right);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(C9947a.exit_left_to_right, C9947a.exit_right_to_left);
    }
}
