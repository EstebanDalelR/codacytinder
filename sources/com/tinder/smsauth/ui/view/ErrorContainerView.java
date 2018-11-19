package com.tinder.smsauth.ui.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tinder.smsauth.ui.C15008k.C15005d;
import com.tinder.smsauth.ui.C15008k.C15007f;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0002R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/tinder/smsauth/ui/view/ErrorContainerView;", "Landroid/support/constraint/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "newValue", "", "errorCode", "getErrorCode", "()Ljava/lang/String;", "setErrorCode", "(Ljava/lang/String;)V", "listener", "Lcom/tinder/smsauth/ui/view/ErrorContainerView$Listener;", "getListener", "()Lcom/tinder/smsauth/ui/view/ErrorContainerView$Listener;", "setListener", "(Lcom/tinder/smsauth/ui/view/ErrorContainerView$Listener;)V", "onAttachedToWindow", "", "showErrorCode", "Listener", "ui_release"}, k = 1, mv = {1, 1, 10})
public final class ErrorContainerView extends ConstraintLayout {
    @Nullable
    /* renamed from: a */
    private Listener f51821a;
    @NotNull
    /* renamed from: b */
    private String f51822b;
    /* renamed from: c */
    private HashMap f51823c;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/tinder/smsauth/ui/view/ErrorContainerView$Listener;", "", "onTryAgainButtonClicked", "", "ui_release"}, k = 1, mv = {1, 1, 10})
    public interface Listener {
        void onTryAgainButtonClicked();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.ui.view.ErrorContainerView$a */
    static final class C15010a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ ErrorContainerView f46773a;

        C15010a(ErrorContainerView errorContainerView) {
            this.f46773a = errorContainerView;
        }

        public final void onClick(View view) {
            view = this.f46773a.getListener();
            if (view != null) {
                view.onTryAgainButtonClicked();
            }
        }
    }

    /* renamed from: a */
    public View m62322a(int i) {
        if (this.f51823c == null) {
            this.f51823c = new HashMap();
        }
        View view = (View) this.f51823c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f51823c.put(Integer.valueOf(i), view);
        return view;
    }

    public /* synthetic */ ErrorContainerView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public ErrorContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f51822b = "";
    }

    @Nullable
    public final Listener getListener() {
        return this.f51821a;
    }

    public final void setListener(@Nullable Listener listener) {
        this.f51821a = listener;
    }

    @NotNull
    public final String getErrorCode() {
        return this.f51822b;
    }

    public final void setErrorCode(@NotNull String str) {
        C2668g.b(str, "newValue");
        this.f51822b = str;
        m62321a();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((Button) m62322a(C15005d.tryAgainButton)).setOnClickListener(new C15010a(this));
    }

    /* renamed from: a */
    private final void m62321a() {
        String string;
        if ((((CharSequence) this.f51822b).length() == 0 ? 1 : null) != null) {
            string = getResources().getString(C15007f.sms_auth_error_subtitle);
        } else {
            string = getResources().getString(C15007f.sms_auth_error_subtitle_with_error_code, new Object[]{this.f51822b});
        }
        TextView textView = (TextView) m62322a(C15005d.subtitleText);
        C2668g.a(textView, "subtitleText");
        textView.setText(string);
    }
}
