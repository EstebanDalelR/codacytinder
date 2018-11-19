package com.tinder.settingsemail.email.view;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.C0432b;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.settings.email.model.EmailSettingOption;
import com.tinder.domain.settings.email.model.EmailSettingType;
import com.tinder.settingsemail.C14921a.C14916b;
import com.tinder.settingsemail.C14921a.C14917c;
import com.tinder.settingsemail.C14921a.C14918d;
import com.tinder.settingsemail.email.adapter.EmailSettingsAdapter;
import com.tinder.settingsemail.email.adapter.EmailSettingsAdapter.UnsubscribeListener;
import com.tinder.settingsemail.email.adapter.EmailSettingsAdapter.UnsubscribeListener.C14924a;
import com.tinder.settingsemail.email.component.EmailSettingsComponent;
import com.tinder.settingsemail.email.p410c.C14927a;
import com.tinder.settingsemail.email.target.EmailSettingsTarget;
import com.tinder.settingsemail.email.view.EmailSettingsSwitchesView.OnCheckedListener;
import com.tinder.settingsemail.email.viewmodel.C14936e;
import javax.inject.Inject;
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

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020 H\u0014J\b\u0010$\u001a\u00020 H\u0014J\b\u0010%\u001a\u00020 H\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001c\u0010\u001d¨\u0006&"}, d2 = {"Lcom/tinder/settingsemail/email/view/EmailSettingsView;", "Landroid/widget/LinearLayout;", "Lcom/tinder/settingsemail/email/target/EmailSettingsTarget;", "context", "Landroid/content/Context;", "component", "Lcom/tinder/settingsemail/email/component/EmailSettingsComponent;", "(Landroid/content/Context;Lcom/tinder/settingsemail/email/component/EmailSettingsComponent;)V", "presenter", "Lcom/tinder/settingsemail/email/presenter/EmailSettingsPresenter;", "getPresenter", "()Lcom/tinder/settingsemail/email/presenter/EmailSettingsPresenter;", "setPresenter", "(Lcom/tinder/settingsemail/email/presenter/EmailSettingsPresenter;)V", "recyclerView", "Lcom/tinder/settingsemail/email/view/EmailSettingsRecyclerView;", "getRecyclerView", "()Lcom/tinder/settingsemail/email/view/EmailSettingsRecyclerView;", "recyclerView$delegate", "Lkotlin/Lazy;", "recyclerViewAdapter", "Lcom/tinder/settingsemail/email/adapter/EmailSettingsAdapter;", "getRecyclerViewAdapter", "()Lcom/tinder/settingsemail/email/adapter/EmailSettingsAdapter;", "setRecyclerViewAdapter", "(Lcom/tinder/settingsemail/email/adapter/EmailSettingsAdapter;)V", "toolbar", "Landroid/support/v7/widget/Toolbar;", "getToolbar", "()Landroid/support/v7/widget/Toolbar;", "toolbar$delegate", "bind", "", "emailSettingsViewModel", "Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsViewModel;", "onAttachedToWindow", "onDetachedFromWindow", "toggleAllEmailOptions", "settings-email_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.settingsemail.email.view.a */
public final class C16708a extends LinearLayout implements EmailSettingsTarget {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f51687a = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(C16708a.class), "toolbar", "getToolbar()Landroid/support/v7/widget/Toolbar;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(C16708a.class), "recyclerView", "getRecyclerView()Lcom/tinder/settingsemail/email/view/EmailSettingsRecyclerView;"))};
    @Inject
    @NotNull
    /* renamed from: b */
    public C14927a f51688b;
    @Inject
    @NotNull
    /* renamed from: c */
    public EmailSettingsAdapter f51689c;
    /* renamed from: d */
    private final Lazy f51690d = C15810e.m59832a(LazyThreadSafetyMode.NONE, new EmailSettingsView$$special$$inlined$bindView$1(this, C14917c.toolbar));
    /* renamed from: e */
    private final Lazy f51691e = C15810e.m59832a(LazyThreadSafetyMode.NONE, new EmailSettingsView$$special$$inlined$bindView$2(this, C14917c.email_settings_recycler_view));

    private final EmailSettingsRecyclerView getRecyclerView() {
        Lazy lazy = this.f51691e;
        KProperty kProperty = f51687a[1];
        return (EmailSettingsRecyclerView) lazy.getValue();
    }

    private final Toolbar getToolbar() {
        Lazy lazy = this.f51690d;
        KProperty kProperty = f51687a[0];
        return (Toolbar) lazy.getValue();
    }

    public C16708a(@NotNull final Context context, @NotNull EmailSettingsComponent emailSettingsComponent) {
        C2668g.b(context, "context");
        C2668g.b(emailSettingsComponent, "component");
        super(context);
        emailSettingsComponent.inject(this);
        setOrientation(1);
        setBackgroundColor(C0432b.c(context, C14916b.gray_background_light));
        View.inflate(context, C14918d.view_email_settings, this);
        emailSettingsComponent = this.f51689c;
        if (emailSettingsComponent == null) {
            C2668g.b("recyclerViewAdapter");
        }
        emailSettingsComponent.m62191a((UnsubscribeListener) new UnsubscribeListener() {
            public void onClick(@Nullable View view) {
                C14924a.m56388a(this, view);
            }

            public void onUnsubscribeClick() {
                this.m62213a();
            }
        });
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
        context = this.f51689c;
        if (context == null) {
            C2668g.b("recyclerViewAdapter");
        }
        context.m62193a((OnCheckedListener) new OnCheckedListener() {
            public void onChecked(@NotNull EmailSettingType emailSettingType) {
                C2668g.b(emailSettingType, "emailSettingType");
                this.getPresenter().m56399a(new EmailSettingOption(emailSettingType, true));
            }

            public void onUnChecked(@NotNull EmailSettingType emailSettingType) {
                C2668g.b(emailSettingType, "emailSettingType");
                this.getPresenter().m56399a(new EmailSettingOption(emailSettingType, false));
            }
        });
        context = this.f51689c;
        if (context == null) {
            C2668g.b("recyclerViewAdapter");
        }
        context.m62194a((OnEmailInputChangedListener) new OnEmailInputChangedListener() {
            public void onEmailChanged(@NotNull String str) {
                C2668g.b(str, ManagerWebServices.PARAM_TEXT);
                this.getPresenter().m56401a(str);
            }
        });
        context = getRecyclerView();
        emailSettingsComponent = this.f51689c;
        if (emailSettingsComponent == null) {
            C2668g.b("recyclerViewAdapter");
        }
        context.setAdapter((Adapter) emailSettingsComponent);
    }

    @NotNull
    public final C14927a getPresenter() {
        C14927a c14927a = this.f51688b;
        if (c14927a == null) {
            C2668g.b("presenter");
        }
        return c14927a;
    }

    public final void setPresenter(@NotNull C14927a c14927a) {
        C2668g.b(c14927a, "<set-?>");
        this.f51688b = c14927a;
    }

    @NotNull
    public final EmailSettingsAdapter getRecyclerViewAdapter() {
        EmailSettingsAdapter emailSettingsAdapter = this.f51689c;
        if (emailSettingsAdapter == null) {
            C2668g.b("recyclerViewAdapter");
        }
        return emailSettingsAdapter;
    }

    public final void setRecyclerViewAdapter(@NotNull EmailSettingsAdapter emailSettingsAdapter) {
        C2668g.b(emailSettingsAdapter, "<set-?>");
        this.f51689c = emailSettingsAdapter;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C14927a c14927a = this.f51688b;
        if (c14927a == null) {
            C2668g.b("presenter");
        }
        c14927a.m56400a((EmailSettingsTarget) this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C14927a c14927a = this.f51688b;
        if (c14927a == null) {
            C2668g.b("presenter");
        }
        c14927a.m56398a();
    }

    public void bind(@NotNull C14936e c14936e) {
        C2668g.b(c14936e, "emailSettingsViewModel");
        getRecyclerView().setEmailSettings(c14936e.m56414a());
    }

    /* renamed from: a */
    private final void m62213a() {
        C14927a c14927a = this.f51688b;
        if (c14927a == null) {
            C2668g.b("presenter");
        }
        c14927a.m56402b();
    }
}
