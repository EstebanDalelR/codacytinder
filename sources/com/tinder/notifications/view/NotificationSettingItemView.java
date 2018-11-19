package com.tinder.notifications.view;

import android.content.Context;
import android.util.AttributeSet;
import com.tinder.base.view.SwitchRowView;
import com.tinder.base.view.SwitchRowView.CheckStatusListener;
import com.tinder.domain.pushnotifications.model.SimplePushNotificationSetting;
import com.tinder.notifications.C9945f;
import com.tinder.notifications.C9953h.C9952f;
import com.tinder.notifications.di.SettingsNotificationComponentProvider;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/tinder/notifications/view/NotificationSettingItemView;", "Lcom/tinder/base/view/SwitchRowView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "pushCopyFactory", "Lcom/tinder/notifications/PushCopyFactory;", "getPushCopyFactory", "()Lcom/tinder/notifications/PushCopyFactory;", "setPushCopyFactory", "(Lcom/tinder/notifications/PushCopyFactory;)V", "bind", "", "simplePushNotificationSetting", "Lcom/tinder/domain/pushnotifications/model/SimplePushNotificationSetting;", "checkStatusListener", "Lcom/tinder/base/view/SwitchRowView$CheckStatusListener;", "settings-notifications_release"}, k = 1, mv = {1, 1, 10})
public final class NotificationSettingItemView extends SwitchRowView {
    @Inject
    @NotNull
    /* renamed from: b */
    public C9945f f43096b;

    public NotificationSettingItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        if (isInEditMode() == null) {
            context = context.getApplicationContext();
            if (context == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.notifications.di.SettingsNotificationComponentProvider");
            }
            ((SettingsNotificationComponentProvider) context).provideSettingsNotificationComponent().inject(this);
        }
    }

    @NotNull
    public final C9945f getPushCopyFactory() {
        C9945f c9945f = this.f43096b;
        if (c9945f == null) {
            C2668g.b("pushCopyFactory");
        }
        return c9945f;
    }

    public final void setPushCopyFactory(@NotNull C9945f c9945f) {
        C2668g.b(c9945f, "<set-?>");
        this.f43096b = c9945f;
    }

    /* renamed from: a */
    public final void m52612a(@NotNull SimplePushNotificationSetting simplePushNotificationSetting, @NotNull CheckStatusListener checkStatusListener) {
        C2668g.b(simplePushNotificationSetting, "simplePushNotificationSetting");
        C2668g.b(checkStatusListener, "checkStatusListener");
        boolean z = simplePushNotificationSetting.getEnabled() && simplePushNotificationSetting.getChannelEnabled();
        m42194a(z, false);
        C9945f c9945f = this.f43096b;
        if (c9945f == null) {
            C2668g.b("pushCopyFactory");
        }
        simplePushNotificationSetting = c9945f.m40918a(simplePushNotificationSetting.getPushNotificationType());
        setText(simplePushNotificationSetting.m40916a());
        setTextStyle(C9952f.SettingsTitle);
        setSecondaryText(simplePushNotificationSetting.m40917b());
        setSecondaryTextStyle(C9952f.NotificationSettingsBody);
        setCheckStatusListener(checkStatusListener);
    }
}
