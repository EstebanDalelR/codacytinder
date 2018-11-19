package com.tinder.messageads.p295b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import com.tinder.domain.match.model.MessageAdMatch.Type;
import com.tinder.messageads.C9905b.C9900a;
import com.tinder.messageads.C9905b.C9901b;
import com.tinder.messageads.C9905b.C9903d;
import com.tinder.messageads.injector.MessageAdSettingsInjector;
import com.tinder.messageads.model.C9912b;
import com.tinder.messageads.model.C9912b.C9911a;
import com.tinder.messageads.p294a.C9898a;
import com.tinder.messageads.p298e.C9910c;
import com.tinder.messageads.target.MessageAdSettingsTarget;
import com.tinder.messageads.view.MessageAdSettingsRowItemView.OnCheckedListener;
import com.tinder.messageads.view.MessageAdSettingsView;
import com.tinder.messageads.view.MessageAdSettingsView.ConfirmListener;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\u0012\u0010\u001b\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lcom/tinder/messageads/dialog/MessageAdSettingsDialog;", "Landroid/support/v7/app/AppCompatDialog;", "Lcom/tinder/messageads/target/MessageAdSettingsTarget;", "context", "Landroid/content/Context;", "injector", "Lcom/tinder/messageads/injector/MessageAdSettingsInjector;", "(Landroid/content/Context;Lcom/tinder/messageads/injector/MessageAdSettingsInjector;)V", "controller", "Lcom/tinder/messageads/controller/MessageAdSettingsController;", "getController", "()Lcom/tinder/messageads/controller/MessageAdSettingsController;", "setController", "(Lcom/tinder/messageads/controller/MessageAdSettingsController;)V", "messageAdSettingsView", "Lcom/tinder/messageads/view/MessageAdSettingsView;", "presenter", "Lcom/tinder/messageads/presenter/MessageAdSettingsPresenter;", "getPresenter", "()Lcom/tinder/messageads/presenter/MessageAdSettingsPresenter;", "setPresenter", "(Lcom/tinder/messageads/presenter/MessageAdSettingsPresenter;)V", "disableAllSettings", "", "enableAllSettings", "exitMessageAdSettings", "onAttachedToWindow", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDetachedFromWindow", "showMessageAdMatchSettings", "messageAdMatchSettings", "Lcom/tinder/messageads/model/MessageAdMatchSettings;", "message-ads_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.messageads.b.a */
public final class C13471a extends AppCompatDialog implements MessageAdSettingsTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C9910c f42731a;
    @Inject
    @NotNull
    /* renamed from: b */
    public C9898a f42732b;
    /* renamed from: c */
    private MessageAdSettingsView f42733c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.b.a$a */
    static final class C9904a implements OnDismissListener {
        /* renamed from: a */
        final /* synthetic */ C13471a f32745a;

        C9904a(C13471a c13471a) {
            this.f32745a = c13471a;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f32745a.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"com/tinder/messageads/dialog/MessageAdSettingsDialog$onCreate$2", "Lcom/tinder/messageads/view/MessageAdSettingsRowItemView$OnCheckedListener;", "(Lcom/tinder/messageads/dialog/MessageAdSettingsDialog;)V", "onChecked", "", "messageAdMatchType", "Lcom/tinder/domain/match/model/MessageAdMatch$Type;", "onUnChecked", "message-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.b.a$b */
    public static final class C12119b implements OnCheckedListener {
        /* renamed from: a */
        final /* synthetic */ C13471a f39340a;

        C12119b(C13471a c13471a) {
            this.f39340a = c13471a;
        }

        public void onChecked(@NotNull Type type) {
            C2668g.b(type, "messageAdMatchType");
            this.f39340a.m52032b().m40712a(new C9911a(type, true));
        }

        public void onUnChecked(@NotNull Type type) {
            C2668g.b(type, "messageAdMatchType");
            this.f39340a.m52032b().m40712a(new C9911a(type, false));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"com/tinder/messageads/dialog/MessageAdSettingsDialog$showMessageAdMatchSettings$1", "Lcom/tinder/messageads/view/MessageAdSettingsView$ConfirmListener;", "(Lcom/tinder/messageads/dialog/MessageAdSettingsDialog;)V", "onConfirmClicked", "", "message-ads_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.messageads.b.a$c */
    public static final class C12120c implements ConfirmListener {
        /* renamed from: a */
        final /* synthetic */ C13471a f39341a;

        C12120c(C13471a c13471a) {
            this.f39341a = c13471a;
        }

        public void onConfirmClicked() {
            this.f39341a.m52032b().m40714c();
            this.f39341a.m52031a().m40749b();
        }
    }

    public C13471a(@NotNull Context context, @NotNull MessageAdSettingsInjector messageAdSettingsInjector) {
        C2668g.b(context, "context");
        C2668g.b(messageAdSettingsInjector, "injector");
        super(context, C9903d.Theme_AppCompat_Light_Dialog_NoTitle_RedAccent);
        messageAdSettingsInjector.inject(this);
    }

    @NotNull
    /* renamed from: a */
    public final C9910c m52031a() {
        C9910c c9910c = this.f42731a;
        if (c9910c == null) {
            C2668g.b("presenter");
        }
        return c9910c;
    }

    @NotNull
    /* renamed from: b */
    public final C9898a m52032b() {
        C9898a c9898a = this.f42732b;
        if (c9898a == null) {
            C2668g.b("controller");
        }
        return c9898a;
    }

    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C9901b.message_ad_settings_dialog_view);
        getWindow().setLayout(-1, -1);
        getWindow().setBackgroundDrawableResource(17170445);
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        setOnDismissListener((OnDismissListener) new C9904a(this));
        MessageAdSettingsView messageAdSettingsView = (MessageAdSettingsView) findViewById(C9900a.message_ad_settings_view);
        if (messageAdSettingsView != null) {
            this.f42733c = messageAdSettingsView;
            bundle = this.f42733c;
            if (bundle == null) {
                C2668g.b("messageAdSettingsView");
            }
            bundle.setItemCheckChangeListener(new C12119b(this));
            bundle = this.f42731a;
            if (bundle == null) {
                C2668g.b("presenter");
            }
            bundle.m40748a((MessageAdSettingsTarget) this);
            return;
        }
        throw ((Throwable) new IllegalStateException("message_ad_settings_view is required"));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C9910c c9910c = this.f42731a;
        if (c9910c == null) {
            C2668g.b("presenter");
        }
        c9910c.m40748a((MessageAdSettingsTarget) this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C9910c c9910c = this.f42731a;
        if (c9910c == null) {
            C2668g.b("presenter");
        }
        c9910c.m40747a();
    }

    public void enableAllSettings() {
        C9898a c9898a = this.f42732b;
        if (c9898a == null) {
            C2668g.b("controller");
        }
        c9898a.m40711a();
    }

    public void disableAllSettings() {
        C9898a c9898a = this.f42732b;
        if (c9898a == null) {
            C2668g.b("controller");
        }
        c9898a.m40713b();
    }

    public void showMessageAdMatchSettings(@NotNull C9912b c9912b) {
        C2668g.b(c9912b, "messageAdMatchSettings");
        MessageAdSettingsView messageAdSettingsView = this.f42733c;
        if (messageAdSettingsView == null) {
            C2668g.b("messageAdSettingsView");
        }
        messageAdSettingsView.m48287a(C19301m.l(c9912b.m40754b()));
        c9912b = this.f42733c;
        if (c9912b == null) {
            C2668g.b("messageAdSettingsView");
        }
        c9912b.setConfirmListener(new C12120c(this));
    }

    public void exitMessageAdSettings() {
        dismiss();
    }
}
