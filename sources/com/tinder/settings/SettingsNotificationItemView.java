package com.tinder.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.notifications.NotificationSettingsActivity;
import com.tinder.settings.C14844a.C14841a;
import com.tinder.settings.C14844a.C14842b;
import com.tinder.settingsemail.email.activity.EmailSettingsActivity;
import kotlin.C15810e;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/tinder/settings/SettingsNotificationItemView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "emailTextView", "Landroid/widget/TextView;", "getEmailTextView", "()Landroid/widget/TextView;", "emailTextView$delegate", "Lkotlin/Lazy;", "pushNotificationsTextView", "getPushNotificationsTextView", "pushNotificationsTextView$delegate", "hideEmailSettings", "", "showEmailSettings", "settings_release"}, k = 1, mv = {1, 1, 10})
public final class SettingsNotificationItemView extends LinearLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f46473a = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(SettingsNotificationItemView.class), "emailTextView", "getEmailTextView()Landroid/widget/TextView;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(SettingsNotificationItemView.class), "pushNotificationsTextView", "getPushNotificationsTextView()Landroid/widget/TextView;"))};
    /* renamed from: b */
    private final Lazy f46474b = C15810e.m59832a(LazyThreadSafetyMode.NONE, new SettingsNotificationItemView$$special$$inlined$bindView$1(this, C14841a.notification_settings_email_text));
    /* renamed from: c */
    private final Lazy f46475c = C15810e.m59832a(LazyThreadSafetyMode.NONE, new SettingsNotificationItemView$$special$$inlined$bindView$2(this, C14841a.notification_settings_push_notifications_text));

    private final TextView getEmailTextView() {
        Lazy lazy = this.f46474b;
        KProperty kProperty = f46473a[0];
        return (TextView) lazy.getValue();
    }

    private final TextView getPushNotificationsTextView() {
        Lazy lazy = this.f46475c;
        KProperty kProperty = f46473a[1];
        return (TextView) lazy.getValue();
    }

    public SettingsNotificationItemView(@NotNull final Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        setOrientation(1);
        LinearLayout.inflate(context, C14842b.view_settings_notification_item, this);
        getEmailTextView().setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                context.startActivity(EmailSettingsActivity.f59934a.m56387a(context));
            }
        });
        getPushNotificationsTextView().setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                context.startActivity(NotificationSettingsActivity.f45395a.a(context));
            }
        });
    }

    /* renamed from: a */
    public final void m56221a() {
        getEmailTextView().setVisibility(0);
    }
}
