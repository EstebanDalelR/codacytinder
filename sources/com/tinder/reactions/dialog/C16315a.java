package com.tinder.reactions.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.ConstraintLayout;
import android.view.MotionEvent;
import com.jakewharton.rxbinding.view.C5707b;
import com.tinder.C6250b.C6248a;
import com.tinder.R;
import com.tinder.deadshot.Deadshot;
import com.tinder.managers.ManagerApp;
import com.tinder.reactions.dialog.p390a.C14621a;
import com.tinder.reactions.dialog.view.TinderReactionsIntroAnimationView;
import com.tinder.reactions.target.TinderReactionsIntroTarget;
import com.tinder.views.CustomTextView;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import rx.Observable;
import rx.functions.Action1;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/tinder/reactions/dialog/TinderReactionsIntroDialog;", "Landroid/app/Dialog;", "Lcom/tinder/reactions/target/TinderReactionsIntroTarget;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "presenter", "Lcom/tinder/reactions/dialog/presenter/TinderReactionsIntroPresenter;", "getPresenter", "()Lcom/tinder/reactions/dialog/presenter/TinderReactionsIntroPresenter;", "setPresenter", "(Lcom/tinder/reactions/dialog/presenter/TinderReactionsIntroPresenter;)V", "dismiss", "", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "playAnimation", "show", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.reactions.dialog.a */
public final class C16315a extends Dialog implements TinderReactionsIntroTarget {
    @Inject
    @NotNull
    /* renamed from: a */
    public C14621a f50754a;

    public C16315a(@NotNull Context context) {
        C2668g.b(context, "context");
        super(context, R.style.DialogTheme);
        context = context.getApplicationContext();
        if (context == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tinder.managers.ManagerApp");
        }
        ((ManagerApp) context).h().inject(this);
        requestWindowFeature(1);
        setContentView(R.layout.view_tinder_reactions_dialog);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        context = this.f50754a;
        if (context == null) {
            C2668g.b("presenter");
        }
        Deadshot.take(this, context);
        C5707b.b((CustomTextView) findViewById(C6248a.tinderReactionsCtaTextView)).d(new Action1<Void>() {
            public /* synthetic */ void call(Object obj) {
                m67129a((Void) obj);
            }

            /* renamed from: a */
            public final void m67129a(Void voidR) {
                this.m61521a().m55782b();
            }
        });
        Observable.b(C5707b.b((ConstraintLayout) findViewById(C6248a.viewTinderReactionsIntro)), C5707b.b((ConstraintLayout) findViewById(C6248a.viewTinderReactionsDemo))).d(new Action1<Void>() {
            public /* synthetic */ void call(Object obj) {
                m67130a((Void) obj);
            }

            /* renamed from: a */
            public final void m67130a(Void voidR) {
                this.m61521a().m55783c();
            }
        });
    }

    @NotNull
    /* renamed from: a */
    public final C14621a m61521a() {
        C14621a c14621a = this.f50754a;
        if (c14621a == null) {
            C2668g.b("presenter");
        }
        return c14621a;
    }

    public boolean onTouchEvent(@NotNull MotionEvent motionEvent) {
        C2668g.b(motionEvent, "event");
        if (motionEvent.getAction() == 4) {
            C14621a c14621a = this.f50754a;
            if (c14621a == null) {
                C2668g.b("presenter");
            }
            c14621a.m55784d();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void show() {
        super.show();
        C14621a c14621a = this.f50754a;
        if (c14621a == null) {
            C2668g.b("presenter");
        }
        c14621a.m55781a();
    }

    public void playAnimation() {
        ((TinderReactionsIntroAnimationView) findViewById(C6248a.tinderReactionsAnnouncementAnimationView)).c();
    }

    public void dismiss() {
        super.dismiss();
        C14621a c14621a = this.f50754a;
        if (c14621a == null) {
            C2668g.b("presenter");
        }
        c14621a.m55785e();
        Deadshot.drop(this);
    }
}
