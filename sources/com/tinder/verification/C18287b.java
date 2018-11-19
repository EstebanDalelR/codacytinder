package com.tinder.verification;

import android.content.Context;
import android.support.v7.app.AppCompatDialog;
import android.view.View;
import com.tinder.verification.C15386a.C15385e;
import com.tinder.verification.VerificationView.Listener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/tinder/verification/VerificationDialog;", "Landroid/support/v7/app/AppCompatDialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "verificationView", "Lcom/tinder/verification/VerificationView;", "bind", "", "verificationDialogViewModel", "Lcom/tinder/verification/VerificationDialogViewModel;", "listener", "Lcom/tinder/verification/VerificationView$Listener;", "hideProgressBar", "isProgressBarShowing", "", "showProgressBar", "verification_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.verification.b */
public final class C18287b extends AppCompatDialog {
    /* renamed from: a */
    private final VerificationView f56627a;

    public C18287b(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context, C15385e.Full_Screen_Dialog);
        this.f56627a = new VerificationView(context, null, 2, null);
        supportRequestWindowFeature(1);
        getWindow().setBackgroundDrawableResource(17170445);
        getWindow().setLayout(-1, -1);
        setContentView((View) this.f56627a);
        setCancelable(null);
    }

    /* renamed from: a */
    public final void m66230a(@NotNull C15388c c15388c, @NotNull Listener listener) {
        C2668g.b(c15388c, "verificationDialogViewModel");
        C2668g.b(listener, "listener");
        this.f56627a.m63135a(c15388c, listener);
    }

    /* renamed from: a */
    public final void m66229a() {
        this.f56627a.m63134a();
    }

    /* renamed from: b */
    public final void m66231b() {
        this.f56627a.m63136b();
    }

    /* renamed from: c */
    public final boolean m66232c() {
        return this.f56627a.m63137c();
    }
}
