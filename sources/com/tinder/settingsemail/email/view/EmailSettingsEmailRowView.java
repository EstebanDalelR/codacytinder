package com.tinder.settingsemail.email.view;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tinder.settingsemail.C14921a.C14917c;
import com.tinder.settingsemail.email.viewmodel.C16710a;
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
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/tinder/settingsemail/email/view/EmailSettingsEmailRowView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "editText", "Landroid/widget/EditText;", "getEditText", "()Landroid/widget/EditText;", "editText$delegate", "Lkotlin/Lazy;", "errorText", "Landroid/widget/TextView;", "getErrorText", "()Landroid/widget/TextView;", "errorText$delegate", "bind", "", "viewModel", "Lcom/tinder/settingsemail/email/viewmodel/EmailSettingsRowViewModel;", "setTextChangedListener", "onEmailInputChangedListener", "Lcom/tinder/settingsemail/email/view/OnEmailInputChangedListener;", "settings-email_release"}, k = 1, mv = {1, 1, 10})
public final class EmailSettingsEmailRowView extends LinearLayout {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f46630a = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(EmailSettingsEmailRowView.class), "editText", "getEditText()Landroid/widget/EditText;")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(EmailSettingsEmailRowView.class), "errorText", "getErrorText()Landroid/widget/TextView;"))};
    /* renamed from: b */
    private final Lazy f46631b = C15810e.m59832a(LazyThreadSafetyMode.NONE, new EmailSettingsEmailRowView$$special$$inlined$bindView$1(this, C14917c.email_settings_email_edit_text));
    /* renamed from: c */
    private final Lazy f46632c = C15810e.m59832a(LazyThreadSafetyMode.NONE, new EmailSettingsEmailRowView$$special$$inlined$bindView$2(this, C14917c.email_settings_email_error_text));

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J*\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"com/tinder/settingsemail/email/view/EmailSettingsEmailRowView$setTextChangedListener$1", "Landroid/text/TextWatcher;", "(Lcom/tinder/settingsemail/email/view/OnEmailInputChangedListener;)V", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "settings-email_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.settingsemail.email.view.EmailSettingsEmailRowView$a */
    public static final class C14930a implements TextWatcher {
        /* renamed from: a */
        final /* synthetic */ OnEmailInputChangedListener f46629a;

        public void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        C14930a(OnEmailInputChangedListener onEmailInputChangedListener) {
            this.f46629a = onEmailInputChangedListener;
        }

        public void afterTextChanged(@Nullable Editable editable) {
            this.f46629a.onEmailChanged(String.valueOf(editable));
        }
    }

    private final EditText getEditText() {
        Lazy lazy = this.f46631b;
        KProperty kProperty = f46630a[0];
        return (EditText) lazy.getValue();
    }

    private final TextView getErrorText() {
        Lazy lazy = this.f46632c;
        KProperty kProperty = f46630a[1];
        return (TextView) lazy.getValue();
    }

    public EmailSettingsEmailRowView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void m56406a(@NotNull EmailSettingsRowViewModel emailSettingsRowViewModel) {
        C2668g.b(emailSettingsRowViewModel, "viewModel");
        C16710a c16710a = (C16710a) emailSettingsRowViewModel;
        String a = c16710a.m62218a();
        getEditText().setFocusable(c16710a.m62220c());
        getEditText().setEnabled(c16710a.m62220c());
        if ((C2668g.a(getEditText().getText().toString(), a) ^ 1) != 0) {
            getEditText().setText(a);
        }
        getErrorText().setVisibility(c16710a.m62219b() != null ? null : 8);
    }

    public final void setTextChangedListener(@NotNull OnEmailInputChangedListener onEmailInputChangedListener) {
        C2668g.b(onEmailInputChangedListener, "onEmailInputChangedListener");
        getEditText().addTextChangedListener(new C14930a(onEmailInputChangedListener));
    }
}
