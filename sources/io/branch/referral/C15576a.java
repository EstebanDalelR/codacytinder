package io.branch.referral;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;

/* renamed from: io.branch.referral.a */
public class C15576a extends Dialog {
    /* renamed from: a */
    private boolean f48178a;
    /* renamed from: b */
    private final boolean f48179b;

    /* renamed from: io.branch.referral.a$1 */
    class C155741 implements OnKeyListener {
        /* renamed from: a */
        final /* synthetic */ C15576a f48176a;

        C155741(C15576a c15576a) {
            this.f48176a = c15576a;
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4) {
                this.f48176a.m58282c();
            }
            return true;
        }
    }

    /* renamed from: io.branch.referral.a$2 */
    class C155752 implements AnimationListener {
        /* renamed from: a */
        final /* synthetic */ C15576a f48177a;

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        C155752(C15576a c15576a) {
            this.f48177a = c15576a;
        }

        public void onAnimationEnd(Animation animation) {
            this.f48177a.dismiss();
        }
    }

    public C15576a(Context context, boolean z) {
        super(context);
        this.f48178a = false;
        this.f48179b = z;
        m58279a(context);
    }

    public C15576a(Context context, int i) {
        super(context, i);
        this.f48178a = false;
        this.f48179b = false;
        m58279a(context);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f48179b != null) {
            bundle = getWindow().getAttributes();
            bundle.width = -1;
            getWindow().setAttributes(bundle);
        }
    }

    public void show() {
        m58281b();
    }

    public void cancel() {
        m58282c();
    }

    public void setContentView(int i) {
        m58283a();
        super.setContentView(i);
    }

    /* renamed from: a */
    private void m58279a(Context context) {
        m58283a();
        setOnKeyListener(new C155741(this));
    }

    /* renamed from: a */
    public void m58283a() {
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().addFlags(2);
        getWindow().addFlags(1024);
        LayoutParams layoutParams = new LayoutParams();
        layoutParams.copyFrom(getWindow().getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = 80;
        layoutParams.dimAmount = 0.8f;
        getWindow().setAttributes(layoutParams);
        getWindow().setWindowAnimations(17432578);
        setCanceledOnTouchOutside(true);
    }

    /* renamed from: b */
    private void m58281b() {
        Animation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(500);
        translateAnimation.setInterpolator(new AccelerateInterpolator());
        ((ViewGroup) getWindow().getDecorView()).getChildAt(0).startAnimation(translateAnimation);
        super.show();
    }

    /* renamed from: c */
    private void m58282c() {
        if (!this.f48178a) {
            this.f48178a = true;
            Animation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            translateAnimation.setDuration(500);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            ((ViewGroup) getWindow().getDecorView()).getChildAt(0).startAnimation(translateAnimation);
            translateAnimation.setAnimationListener(new C155752(this));
        }
    }
}
