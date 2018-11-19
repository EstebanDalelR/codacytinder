package com.tinder.settingsemail.email.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.tinder.model.analytics.AnalyticsConstants;
import com.tinder.settingsemail.C14921a.C14917c;
import com.tinder.settingsemail.email.viewmodel.C16712d;
import com.tinder.settingsemail.email.viewmodel.EmailSettingsRowViewModel;
import kotlin.C15810e;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/settingsemail/email/view/EmailSettingsUnsubscribeView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "button", "Landroid/widget/Button;", "getButton", "()Landroid/widget/Button;", "button$delegate", "Lkotlin/Lazy;", "bind", "", "viewModel", "Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsRowViewModel;", "setButtonClickListener", "onClickListener", "Landroid/view/View$OnClickListener;", "settings-email_release"}, k = 1, mv = {1, 1, 10})
public final class EmailSettingsUnsubscribeView extends FrameLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f46643a = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(EmailSettingsUnsubscribeView.class), AnalyticsConstants.VALUE_SHARE_METHOD_BUTTON, "getButton()Landroid/widget/Button;"))};
    /* renamed from: b */
    private final Lazy f46644b = C15810e.m59832a(LazyThreadSafetyMode.NONE, new EmailSettingsUnsubscribeView$$special$$inlined$bindView$1(this, C14917c.email_settings_unsubscribe_button));

    private final Button getButton() {
        Lazy lazy = this.f46644b;
        KProperty kProperty = f46643a[0];
        return (Button) lazy.getValue();
    }

    public EmailSettingsUnsubscribeView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "context");
        C2668g.b(attributeSet, "attributeSet");
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void m56411a(@NotNull EmailSettingsRowViewModel emailSettingsRowViewModel) {
        C2668g.b(emailSettingsRowViewModel, "viewModel");
        C16712d c16712d = (C16712d) emailSettingsRowViewModel;
        getButton().setText(c16712d.m62223a());
        getButton().setEnabled(c16712d.m62224b());
    }

    public final void setButtonClickListener(@NotNull OnClickListener onClickListener) {
        C2668g.b(onClickListener, "onClickListener");
        getButton().setOnClickListener(onClickListener);
    }
}
