package com.tinder.bitmoji.p177a;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tinder.bitmoji.C8328l.C8325b;
import com.tinder.bitmoji.C8328l.C8326c;
import com.tinder.bitmoji.C8328l.C8327d;
import com.tinder.bitmoji.di.BitmojiComponentProvider;
import com.tinder.bitmoji.presenter.C8330c;
import com.tinder.bitmoji.target.BitmojiIntroTarget;
import com.tinder.bitmoji.view.BitmojiIntroModalAnimationView;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/tinder/bitmoji/dialog/BitmojiIntroDialog;", "Landroid/app/Dialog;", "Lcom/tinder/bitmoji/target/BitmojiIntroTarget;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "animationView", "Lcom/tinder/bitmoji/view/BitmojiIntroModalAnimationView;", "presenter", "Lcom/tinder/bitmoji/presenter/BitmojiIntroPresenter;", "getPresenter$bitmoji_release", "()Lcom/tinder/bitmoji/presenter/BitmojiIntroPresenter;", "setPresenter$bitmoji_release", "(Lcom/tinder/bitmoji/presenter/BitmojiIntroPresenter;)V", "cancel", "", "onAttachedToWindow", "onDetachedFromWindow", "show", "showFemaleIcons", "showMaleIcons", "startAnimations", "bitmoji_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.bitmoji.a.a */
public final class C10366a extends Dialog implements BitmojiIntroTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C8330c f33841a;
    /* renamed from: b */
    private BitmojiIntroModalAnimationView f33842b;

    public C10366a(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context, C8327d.BitmojiDialog);
        context = context.getApplicationContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.bitmoji.di.BitmojiComponentProvider");
        }
        ((BitmojiComponentProvider) context).provideBitmojiComponent().inject(this);
        requestWindowFeature(1);
        setContentView(C8326c.bitmoji_intro_dialog);
        context = findViewById(C8325b.animation_view);
        C2668g.a(context, "findViewById(R.id.animation_view)");
        this.f33842b = (BitmojiIntroModalAnimationView) context;
        Button button = (Button) findViewById(C8325b.bitmoji_later_button);
        ((Button) findViewById(C8325b.bitmoji_add_button)).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                this.m42197a().m35452b();
                this.m42197a().m35454d();
                this.dismiss();
            }
        });
        button.setOnClickListener((OnClickListener) new OnClickListener() {
            public final void onClick(View view) {
                this.cancel();
            }
        });
    }

    @NotNull
    /* renamed from: a */
    public final C8330c m42197a() {
        C8330c c8330c = this.f33841a;
        if (c8330c == null) {
            C2668g.b("presenter");
        }
        return c8330c;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C8330c c8330c = this.f33841a;
        if (c8330c == null) {
            C2668g.b("presenter");
        }
        c8330c.m35451a((BitmojiIntroTarget) this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C8330c c8330c = this.f33841a;
        if (c8330c == null) {
            C2668g.b("presenter");
        }
        c8330c.m35450a();
    }

    public void showFemaleIcons() {
        this.f33842b.m42224a();
    }

    public void showMaleIcons() {
        this.f33842b.m42225b();
    }

    public void startAnimations() {
        this.f33842b.m42226c();
    }

    public void show() {
        super.show();
        C8330c c8330c = this.f33841a;
        if (c8330c == null) {
            C2668g.b("presenter");
        }
        c8330c.m35453c();
    }

    public void cancel() {
        super.cancel();
        C8330c c8330c = this.f33841a;
        if (c8330c == null) {
            C2668g.b("presenter");
        }
        c8330c.m35455e();
    }
}
