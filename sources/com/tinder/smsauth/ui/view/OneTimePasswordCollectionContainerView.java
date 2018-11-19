package com.tinder.smsauth.ui.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tinder.smsauth.ui.C15008k.C15005d;
import com.tinder.smsauth.ui.C15008k.C15006e;
import com.tinder.smsauth.ui.view.OneTimePasswordCodeInputView.C15013a;
import com.tinder.smsauth.ui.view.OneTimePasswordCodeInputView.C15013a.C16799a;
import com.tinder.smsauth.ui.view.OneTimePasswordCodeInputView.C15013a.C16800b;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001dB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u000eH\u0014J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/tinder/smsauth/ui/view/OneTimePasswordCollectionContainerView;", "Landroid/support/constraint/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "listener", "Lcom/tinder/smsauth/ui/view/OneTimePasswordCollectionContainerView$Listener;", "getListener", "()Lcom/tinder/smsauth/ui/view/OneTimePasswordCollectionContainerView$Listener;", "setListener", "(Lcom/tinder/smsauth/ui/view/OneTimePasswordCollectionContainerView$Listener;)V", "onAttachedToWindow", "", "onDetachedFromWindow", "setContinueButtonEnabled", "isEnabled", "", "setErrorMessage", "errorMsg", "", "setOneTimePasswordCode", "code", "setOneTimePasswordCodeLength", "length", "", "setPhoneNumber", "phoneNumber", "Listener", "ui_release"}, k = 1, mv = {1, 1, 10})
public final class OneTimePasswordCollectionContainerView extends ConstraintLayout {
    @Nullable
    /* renamed from: a */
    private Listener f51833a;
    /* renamed from: b */
    private HashMap f51834b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/tinder/smsauth/ui/view/OneTimePasswordCollectionContainerView$Listener;", "", "onContinueButtonClicked", "", "onOneTimePasswordTextChanged", "newValue", "", "onResendButtonClicked", "ui_release"}, k = 1, mv = {1, 1, 10})
    public interface Listener {
        void onContinueButtonClicked();

        void onOneTimePasswordTextChanged(@NotNull String str);

        void onResendButtonClicked();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.OneTimePasswordCollectionContainerView$a */
    static final class C15019a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ OneTimePasswordCollectionContainerView f46790a;

        C15019a(OneTimePasswordCollectionContainerView oneTimePasswordCollectionContainerView) {
            this.f46790a = oneTimePasswordCollectionContainerView;
        }

        public final void onClick(View view) {
            view = this.f46790a.getListener();
            if (view != null) {
                view.onContinueButtonClicked();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.OneTimePasswordCollectionContainerView$b */
    static final class C15020b implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ OneTimePasswordCollectionContainerView f46791a;

        C15020b(OneTimePasswordCollectionContainerView oneTimePasswordCollectionContainerView) {
            this.f46791a = oneTimePasswordCollectionContainerView;
        }

        public final void onClick(View view) {
            view = this.f46791a.getListener();
            if (view != null) {
                view.onResendButtonClicked();
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.OneTimePasswordCollectionContainerView$c */
    static final class C15021c implements Runnable {
        /* renamed from: a */
        final /* synthetic */ OneTimePasswordCollectionContainerView f46792a;

        C15021c(OneTimePasswordCollectionContainerView oneTimePasswordCollectionContainerView) {
            this.f46792a = oneTimePasswordCollectionContainerView;
        }

        public final void run() {
            ((OneTimePasswordCodeInputView) this.f46792a.m62328a(C15005d.oneTimePasswordInputView)).m56623a();
        }
    }

    /* renamed from: a */
    public View m62328a(int i) {
        if (this.f51834b == null) {
            this.f51834b = new HashMap();
        }
        View view = (View) this.f51834b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f51834b.put(Integer.valueOf(i), view);
        return view;
    }

    public /* synthetic */ OneTimePasswordCollectionContainerView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public OneTimePasswordCollectionContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        ConstraintLayout.inflate(context, C15006e.one_time_password_collection_container_view, this);
    }

    @Nullable
    public final Listener getListener() {
        return this.f51833a;
    }

    public final void setListener(@Nullable Listener listener) {
        this.f51833a = listener;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((OneTimePasswordCodeInputView) m62328a(C15005d.oneTimePasswordInputView)).setOnCodeChangedListener(new OneTimePasswordCollectionContainerView$onAttachedToWindow$1(this));
        ((Button) m62328a(C15005d.continueButton)).setOnClickListener(new C15019a(this));
        ((TextView) m62328a(C15005d.resendButton)).setOnClickListener(new C15020b(this));
    }

    protected void onDetachedFromWindow() {
        ((OneTimePasswordCodeInputView) m62328a(C15005d.oneTimePasswordInputView)).m56624b();
        super.onDetachedFromWindow();
    }

    public final void setPhoneNumber(@NotNull String str) {
        C2668g.b(str, "phoneNumber");
        TextView textView = (TextView) m62328a(C15005d.phoneNumberLabel);
        C2668g.a(textView, "phoneNumberLabel");
        textView.setText(str);
    }

    public final void setOneTimePasswordCodeLength(int i) {
        ((OneTimePasswordCodeInputView) m62328a(C15005d.oneTimePasswordInputView)).setLength(i);
        postDelayed((Runnable) new C15021c(this), 450);
    }

    public final void setOneTimePasswordCode(@NotNull String str) {
        C2668g.b(str, "code");
        ((OneTimePasswordCodeInputView) m62328a(C15005d.oneTimePasswordInputView)).setCode(str);
    }

    public final void setContinueButtonEnabled(boolean z) {
        Button button = (Button) m62328a(C15005d.continueButton);
        C2668g.a(button, "continueButton");
        button.setEnabled(z);
    }

    public final void setErrorMessage(@NotNull String str) {
        C2668g.b(str, "errorMsg");
        TextView textView = (TextView) m62328a(C15005d.errorMessageLabel);
        C2668g.a(textView, "errorMessageLabel");
        CharSequence charSequence = str;
        textView.setText(charSequence);
        OneTimePasswordCodeInputView oneTimePasswordCodeInputView = (OneTimePasswordCodeInputView) m62328a(C15005d.oneTimePasswordInputView);
        if ((charSequence.length() > null ? true : null) != null) {
            str = (C15013a) C16800b.f51832a;
        } else {
            str = (C15013a) C16799a.f51831a;
        }
        oneTimePasswordCodeInputView.setColorMode(str);
    }
}
