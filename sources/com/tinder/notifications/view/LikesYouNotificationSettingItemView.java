package com.tinder.notifications.view;

import android.content.Context;
import android.util.AttributeSet;
import com.tinder.domain.pushnotifications.model.LikesYouPushNotificationSetting;
import com.tinder.gold.DropdownOptionsView;
import com.tinder.gold.DropdownOptionsView.C9679a;
import com.tinder.gold.DropdownOptionsView.C9681c;
import com.tinder.gold.DropdownOptionsView.SettingsDropdownListener;
import com.tinder.notifications.C9953h.C9952f;
import com.tinder.notifications.di.SettingsNotificationComponentProvider;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/tinder/notifications/view/LikesYouNotificationSettingItemView;", "Lcom/tinder/gold/DropdownOptionsView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "factory", "Lcom/tinder/gold/DropdownOptionsView$Factory;", "getFactory", "()Lcom/tinder/gold/DropdownOptionsView$Factory;", "setFactory", "(Lcom/tinder/gold/DropdownOptionsView$Factory;)V", "bind", "", "likesYouPushNotificationSetting", "Lcom/tinder/domain/pushnotifications/model/LikesYouPushNotificationSetting;", "settingsDropdownListener", "Lcom/tinder/gold/DropdownOptionsView$SettingsDropdownListener;", "settings-notifications_release"}, k = 1, mv = {1, 1, 10})
public final class LikesYouNotificationSettingItemView extends DropdownOptionsView {
    @Inject
    @NotNull
    /* renamed from: b */
    public C9679a f39390b;

    public LikesYouNotificationSettingItemView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        if (isInEditMode() == null) {
            context = context.getApplicationContext();
            if (context == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.notifications.di.SettingsNotificationComponentProvider");
            }
            ((SettingsNotificationComponentProvider) context).provideSettingsNotificationComponent().inject(this);
        }
        setTextStyle(C9952f.SettingsTitle);
        setSecondaryTextStyle(C9952f.NotificationSettingsBody);
    }

    @NotNull
    public final C9679a getFactory() {
        C9679a c9679a = this.f39390b;
        if (c9679a == null) {
            C2668g.b("factory");
        }
        return c9679a;
    }

    public final void setFactory(@NotNull C9679a c9679a) {
        C2668g.b(c9679a, "<set-?>");
        this.f39390b = c9679a;
    }

    /* renamed from: a */
    public final void m48292a(@NotNull LikesYouPushNotificationSetting likesYouPushNotificationSetting, @NotNull SettingsDropdownListener settingsDropdownListener) {
        C2668g.b(likesYouPushNotificationSetting, "likesYouPushNotificationSetting");
        C2668g.b(settingsDropdownListener, "settingsDropdownListener");
        C9679a c9679a = this.f39390b;
        if (c9679a == null) {
            C2668g.b("factory");
        }
        m40143a((C9681c) c9679a.m40127a(likesYouPushNotificationSetting.getLikesYouNotificationSettingConfig().getFrequencyOptions(), likesYouPushNotificationSetting.getFrequency(), likesYouPushNotificationSetting.getLikesYouNotificationSettingConfig().getFrequencyDefault()));
        setSettingsDropdownListener(settingsDropdownListener);
    }
}
