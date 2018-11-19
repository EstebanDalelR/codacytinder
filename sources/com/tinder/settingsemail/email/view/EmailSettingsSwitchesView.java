package com.tinder.settingsemail.email.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.FrameLayout;
import android.widget.Switch;
import com.tinder.base.view.SwitchRowView;
import com.tinder.domain.settings.email.model.EmailSettingOption;
import com.tinder.domain.settings.email.model.EmailSettingType;
import com.tinder.settingsemail.C14921a.C14917c;
import com.tinder.settingsemail.C14921a.C14918d;
import com.tinder.settingsemail.C14921a.C14919e;
import com.tinder.settingsemail.C14921a.C14920f;
import com.tinder.settingsemail.email.viewmodel.C16711b;
import com.tinder.settingsemail.email.viewmodel.EmailSettingsRowViewModel;
import java.util.Map;
import kotlin.C15810e;
import kotlin.C15811g;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002!\"B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000bR\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X\u0004¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\nX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00180\nX\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/tinder/settingsemail/email/view/EmailSettingsSwitchesView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "adapter", "Lcom/tinder/settingsemail/email/view/EmailSettingsSwitchesView$Adapter;", "emailSettingsStringMap", "", "Lcom/tinder/domain/settings/email/model/EmailSettingType;", "", "kotlin.jvm.PlatformType", "promotionsSecondaryText", "switch", "Landroid/widget/Switch;", "switchesContainer", "Landroid/view/ViewGroup;", "getSwitchesContainer", "()Landroid/view/ViewGroup;", "switchesContainer$delegate", "Lkotlin/Lazy;", "typeToIdMap", "", "bind", "", "viewModel", "Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsRowViewModel;", "setOnCheckedListener", "onCheckedListener", "Lcom/tinder/settingsemail/email/view/EmailSettingsSwitchesView$OnCheckedListener;", "emailSettingType", "Adapter", "OnCheckedListener", "settings-email_release"}, k = 1, mv = {1, 1, 10})
public final class EmailSettingsSwitchesView extends FrameLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f46636a = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(EmailSettingsSwitchesView.class), "switchesContainer", "getSwitchesContainer()Landroid/view/ViewGroup;"))};
    /* renamed from: b */
    private Switch f46637b;
    /* renamed from: c */
    private final Lazy f46638c = C15810e.m59832a(LazyThreadSafetyMode.NONE, new EmailSettingsSwitchesView$$special$$inlined$bindView$1(this, C14917c.email_settings_switches_parent));
    /* renamed from: d */
    private final C14931a f46639d = new C14931a(this);
    /* renamed from: e */
    private final Map<EmailSettingType, Integer> f46640e = ah.m66889a((Pair[]) new Pair[]{C15811g.m59834a(EmailSettingType.NEW_MATCHES, Integer.valueOf(C14917c.email_settings_new_matches_switch_row_view)), C15811g.m59834a(EmailSettingType.NEW_MESSAGES, Integer.valueOf(C14917c.email_settings_new_messages_switch_row_view)), C15811g.m59834a(EmailSettingType.PROMOTIONS, Integer.valueOf(C14917c.email_settings_promotions_switch_row_view))});
    /* renamed from: f */
    private final Map<EmailSettingType, String> f46641f = ah.m66889a((Pair[]) new Pair[]{C15811g.m59834a(EmailSettingType.NEW_MATCHES, getResources().getString(C14919e.settings_new_matches)), C15811g.m59834a(EmailSettingType.NEW_MESSAGES, getResources().getString(C14919e.settings_new_messages)), C15811g.m59834a(EmailSettingType.PROMOTIONS, getResources().getString(C14919e.settings_email_updates))});
    /* renamed from: g */
    private final String f46642g = getResources().getString(C14919e.settings_email_updates_details);

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/settingsemail/email/view/EmailSettingsSwitchesView$OnCheckedListener;", "", "onChecked", "", "emailSettingType", "Lcom/tinder/domain/settings/email/model/EmailSettingType;", "onUnChecked", "settings-email_release"}, k = 1, mv = {1, 1, 10})
    public interface OnCheckedListener {
        void onChecked(@NotNull EmailSettingType emailSettingType);

        void onUnChecked(@NotNull EmailSettingType emailSettingType);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/tinder/settingsemail/email/view/EmailSettingsSwitchesView$Adapter;", "", "(Lcom/tinder/settingsemail/email/view/EmailSettingsSwitchesView;)V", "createView", "Lcom/tinder/base/view/SwitchRowView;", "container", "Landroid/view/ViewGroup;", "position", "", "emailSettingType", "Lcom/tinder/domain/settings/email/model/EmailSettingType;", "settings-email_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.settingsemail.email.view.EmailSettingsSwitchesView$a */
    public final class C14931a {
        /* renamed from: a */
        final /* synthetic */ EmailSettingsSwitchesView f46633a;

        public C14931a(EmailSettingsSwitchesView emailSettingsSwitchesView) {
            this.f46633a = emailSettingsSwitchesView;
        }

        @NotNull
        /* renamed from: a */
        public final SwitchRowView m56407a(@NotNull ViewGroup viewGroup, int i, @NotNull EmailSettingType emailSettingType) {
            C2668g.b(viewGroup, "container");
            C2668g.b(emailSettingType, "emailSettingType");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C14918d.view_email_settings_switch_row, viewGroup, false);
            if (inflate == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.tinder.base.view.SwitchRowView");
            }
            SwitchRowView switchRowView = (SwitchRowView) inflate;
            emailSettingType = this.f46633a.f46640e.get(emailSettingType);
            if (emailSettingType == null) {
                throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
            }
            switchRowView.setId(((Number) emailSettingType).intValue());
            viewGroup.addView(switchRowView, i);
            return switchRowView;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "isChecked", "", "onCheckedChanged"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.settingsemail.email.view.EmailSettingsSwitchesView$b */
    static final class C14932b implements OnCheckedChangeListener {
        /* renamed from: a */
        final /* synthetic */ OnCheckedListener f46634a;
        /* renamed from: b */
        final /* synthetic */ EmailSettingType f46635b;

        C14932b(OnCheckedListener onCheckedListener, EmailSettingType emailSettingType) {
            this.f46634a = onCheckedListener;
            this.f46635b = emailSettingType;
        }

        public final void onCheckedChanged(@NotNull CompoundButton compoundButton, boolean z) {
            C2668g.b(compoundButton, "<anonymous parameter 0>");
            if (z) {
                this.f46634a.onChecked(this.f46635b);
            } else {
                this.f46634a.onUnChecked(this.f46635b);
            }
        }
    }

    private final ViewGroup getSwitchesContainer() {
        Lazy lazy = this.f46638c;
        KProperty kProperty = f46636a[0];
        return (ViewGroup) lazy.getValue();
    }

    public EmailSettingsSwitchesView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attributeSet");
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void m56410a(@NotNull EmailSettingsRowViewModel emailSettingsRowViewModel) {
        C2668g.b(emailSettingsRowViewModel, "viewModel");
        getSwitchesContainer().removeAllViews();
        C16711b c16711b = (C16711b) emailSettingsRowViewModel;
        int i = 0;
        for (EmailSettingOption emailSettingOption : c16711b.m62221a()) {
            int i2 = i + 1;
            SwitchRowView a = this.f46639d.m56407a(getSwitchesContainer(), i, emailSettingOption.getType());
            Object obj = this.f46641f.get(emailSettingOption.getType());
            if (obj == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            a.setText((String) obj);
            if (emailSettingOption.getType() == EmailSettingType.PROMOTIONS) {
                String str = this.f46642g;
                C2668g.a(str, "promotionsSecondaryText");
                a.setSecondaryText(str);
            }
            a.setTextStyle(C14920f.SettingsHeading);
            a.setChecked(emailSettingOption.getEnabled());
            a.setSwitchEnabled(c16711b.m62222b());
            i = i2;
        }
    }

    /* renamed from: a */
    public final void m56409a(@NotNull OnCheckedListener onCheckedListener, @NotNull EmailSettingType emailSettingType) {
        C2668g.b(onCheckedListener, "onCheckedListener");
        C2668g.b(emailSettingType, "emailSettingType");
        Object obj = this.f46640e.get(emailSettingType);
        if (obj == null) {
            throw ((Throwable) new IllegalStateException("Required value was null.".toString()));
        }
        View findViewById = ((SwitchRowView) findViewById(((Number) obj).intValue())).findViewById(C14917c.new_switch_row_toggle);
        C2668g.a(findViewById, "view.findViewById(R.id.new_switch_row_toggle)");
        this.f46637b = (Switch) findViewById;
        Switch switchR = this.f46637b;
        if (switchR == null) {
            C2668g.b("switch");
        }
        switchR.setOnCheckedChangeListener(new C14932b(onCheckedListener, emailSettingType));
    }
}
