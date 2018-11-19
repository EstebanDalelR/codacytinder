package com.tinder.notifications.view;

import android.app.Activity;
import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.tinder.domain.pushnotifications.model.PushNotificationSetting;
import com.tinder.notifications.C9942a;
import com.tinder.notifications.C9953h.C9949c;
import com.tinder.notifications.C9953h.C9950d;
import com.tinder.notifications.NotificationSettingsTarget;
import com.tinder.notifications.di.SettingsNotificationComponentProvider;
import com.tinder.notifications.view.NotificationSettingsRecyclerView.NotificationSettingsAdapter.OnPushNotificationSettingChangedListener;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C18451c;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000*\u0001\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u0016\u0010\u001f\u001a\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016R\u0010\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0004\n\u0002\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Lcom/tinder/notifications/view/NotificationSettingsView;", "Landroid/support/design/widget/CoordinatorLayout;", "Lcom/tinder/notifications/NotificationSettingsTarget;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onPushNotificationSettingChangedListener", "com/tinder/notifications/view/NotificationSettingsView$onPushNotificationSettingChangedListener$1", "Lcom/tinder/notifications/view/NotificationSettingsView$onPushNotificationSettingChangedListener$1;", "presenter", "Lcom/tinder/notifications/NotificationSettingsPresenter;", "getPresenter", "()Lcom/tinder/notifications/NotificationSettingsPresenter;", "setPresenter", "(Lcom/tinder/notifications/NotificationSettingsPresenter;)V", "recyclerView", "Lcom/tinder/notifications/view/NotificationSettingsRecyclerView;", "getRecyclerView", "()Lcom/tinder/notifications/view/NotificationSettingsRecyclerView;", "recyclerView$delegate", "Lkotlin/Lazy;", "toolbar", "Landroid/support/v7/widget/Toolbar;", "getToolbar", "()Landroid/support/v7/widget/Toolbar;", "toolbar$delegate", "onAttachedToWindow", "", "onDetachedFromWindow", "showPushNotificationSettings", "pushNotificationSettings", "", "Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;", "settings-notifications_release"}, k = 1, mv = {1, 1, 10})
public final class NotificationSettingsView extends CoordinatorLayout implements NotificationSettingsTarget {
    /* renamed from: f */
    static final /* synthetic */ KProperty[] f44621f = new KProperty[]{C15825i.a(new PropertyReference1Impl(C15825i.a(NotificationSettingsView.class), "toolbar", "getToolbar()Landroid/support/v7/widget/Toolbar;")), C15825i.a(new PropertyReference1Impl(C15825i.a(NotificationSettingsView.class), "recyclerView", "getRecyclerView()Lcom/tinder/notifications/view/NotificationSettingsRecyclerView;"))};
    @Inject
    @NotNull
    /* renamed from: g */
    public C9942a f44622g;
    /* renamed from: h */
    private final Lazy f44623h = C18451c.a(LazyThreadSafetyMode.NONE, new NotificationSettingsView$$special$$inlined$bindView$1(this, C9949c.toolbar));
    /* renamed from: i */
    private final Lazy f44624i = C18451c.a(LazyThreadSafetyMode.NONE, new NotificationSettingsView$$special$$inlined$bindView$2(this, C9949c.recycler_view));
    /* renamed from: j */
    private final C12150a f44625j = new C12150a(this);

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/tinder/notifications/view/NotificationSettingsView$onPushNotificationSettingChangedListener$1", "Lcom/tinder/notifications/view/NotificationSettingsRecyclerView$NotificationSettingsAdapter$OnPushNotificationSettingChangedListener;", "(Lcom/tinder/notifications/view/NotificationSettingsView;)V", "onPushNotificationSettingChangedListener", "", "pushNotificationSetting", "Lcom/tinder/domain/pushnotifications/model/PushNotificationSetting;", "settings-notifications_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.notifications.view.NotificationSettingsView$a */
    public static final class C12150a implements OnPushNotificationSettingChangedListener {
        /* renamed from: a */
        final /* synthetic */ NotificationSettingsView f39397a;

        C12150a(NotificationSettingsView notificationSettingsView) {
            this.f39397a = notificationSettingsView;
        }

        public void onPushNotificationSettingChangedListener(@NotNull PushNotificationSetting pushNotificationSetting) {
            C2668g.b(pushNotificationSetting, "pushNotificationSetting");
            this.f39397a.getPresenter().m40907a(pushNotificationSetting);
        }
    }

    private final NotificationSettingsRecyclerView getRecyclerView() {
        Lazy lazy = this.f44624i;
        KProperty kProperty = f44621f[1];
        return (NotificationSettingsRecyclerView) lazy.getValue();
    }

    private final Toolbar getToolbar() {
        Lazy lazy = this.f44623h;
        KProperty kProperty = f44621f[0];
        return (Toolbar) lazy.getValue();
    }

    public NotificationSettingsView(@NotNull final Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        if (isInEditMode() == null) {
            attributeSet = context.getApplicationContext();
            if (attributeSet == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.notifications.di.SettingsNotificationComponentProvider");
            }
            ((SettingsNotificationComponentProvider) attributeSet).provideSettingsNotificationComponent().inject(this);
        }
        CoordinatorLayout.inflate(context, C9950d.view_notification_settings, this);
        getToolbar().setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                view = context;
                if (!(view instanceof Activity)) {
                    view = null;
                }
                Activity activity = (Activity) view;
                if (activity != null) {
                    activity.finish();
                }
            }
        });
        getRecyclerView().setOnPushNotificationSettingChangedListener((OnPushNotificationSettingChangedListener) this.f44625j);
    }

    @NotNull
    public final C9942a getPresenter() {
        C9942a c9942a = this.f44622g;
        if (c9942a == null) {
            C2668g.b("presenter");
        }
        return c9942a;
    }

    public final void setPresenter(@NotNull C9942a c9942a) {
        C2668g.b(c9942a, "<set-?>");
        this.f44622g = c9942a;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9942a c9942a = this.f44622g;
        if (c9942a == null) {
            C2668g.b("presenter");
        }
        c9942a.m40908a((NotificationSettingsTarget) this);
        c9942a = this.f44622g;
        if (c9942a == null) {
            C2668g.b("presenter");
        }
        c9942a.m40906a();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C9942a c9942a = this.f44622g;
        if (c9942a == null) {
            C2668g.b("presenter");
        }
        c9942a.m40909b();
        c9942a = this.f44622g;
        if (c9942a == null) {
            C2668g.b("presenter");
        }
        c9942a.m40910c();
    }

    public void showPushNotificationSettings(@NotNull Set<? extends PushNotificationSetting> set) {
        C2668g.b(set, "pushNotificationSettings");
        getRecyclerView().setPushNotificationSettings(set);
    }
}
