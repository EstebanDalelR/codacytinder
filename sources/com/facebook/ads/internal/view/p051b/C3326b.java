package com.facebook.ads.internal.view.p051b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v4.graphics.C0443a;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import com.facebook.ads.internal.adapters.C1359i;
import com.facebook.ads.internal.adapters.C1366u;
import com.facebook.ads.internal.p047k.C1490h;
import com.facebook.ads.internal.p047k.C1507t;
import com.facebook.ads.internal.p047k.C1510w;
import com.facebook.ads.internal.p047k.ak;
import com.facebook.ads.internal.p047k.an;
import com.facebook.ads.internal.view.C3394u;
import com.facebook.ads.internal.view.component.CircularProgressView;
import com.facebook.ads.internal.view.p052c.p053b.C1582n;
import com.facebook.ads.internal.view.p052c.p080a.C3329b;
import com.facebook.ads.internal.view.p052c.p080a.C3330c;
import com.facebook.ads.internal.view.p052c.p080a.C3341n;
import com.facebook.ads.internal.view.p052c.p080a.C3342o;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.internal.view.b.b */
public class C3326b extends LinearLayout implements C1582n {
    /* renamed from: c */
    private static final float f10136c = Resources.getSystem().getDisplayMetrics().density;
    /* renamed from: d */
    private static final int f10137d = ((int) (f10136c * 40.0f));
    /* renamed from: e */
    private static final int f10138e = ((int) (f10136c * 44.0f));
    /* renamed from: f */
    private static final int f10139f = ((int) (f10136c * 10.0f));
    /* renamed from: g */
    private static final int f10140g = ((int) (f10136c * 16.0f));
    /* renamed from: h */
    private static final int f10141h = (f10140g - f10139f);
    /* renamed from: i */
    private static final int f10142i = ((f10140g * 2) - f10139f);
    /* renamed from: a */
    private final C3342o f10143a = new C41541(this);
    /* renamed from: b */
    private final C3330c f10144b = new C41552(this);
    /* renamed from: j */
    private final ImageView f10145j;
    /* renamed from: k */
    private final ImageView f10146k;
    /* renamed from: l */
    private final CircularProgressView f10147l;
    /* renamed from: m */
    private final C1555d f10148m;
    /* renamed from: n */
    private final PopupMenu f10149n;
    /* renamed from: o */
    private final AtomicBoolean f10150o = new AtomicBoolean(false);
    @Nullable
    /* renamed from: p */
    private C1553a f10151p;
    @Nullable
    /* renamed from: q */
    private C3394u f10152q;
    /* renamed from: r */
    private int f10153r = 0;

    /* renamed from: com.facebook.ads.internal.view.b.b$3 */
    class C15473 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C3326b f4326a;

        C15473(C3326b c3326b) {
            this.f4326a = c3326b;
        }

        public void onClick(View view) {
            if (this.f4326a.f10151p != null) {
                this.f4326a.f10151p.mo1832a();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.b.b$4 */
    class C15484 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C3326b f4327a;

        C15484(C3326b c3326b) {
            this.f4327a = c3326b;
        }

        public void onClick(View view) {
            this.f4327a.f10149n.show();
        }
    }

    /* renamed from: com.facebook.ads.internal.view.b.b$5 */
    class C15495 implements OnMenuItemClickListener {
        /* renamed from: a */
        final /* synthetic */ C1366u f4328a;
        /* renamed from: b */
        final /* synthetic */ C3326b f4329b;

        C15495(C3326b c3326b, C1366u c1366u) {
            this.f4329b = c3326b;
            this.f4328a = c1366u;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (!TextUtils.isEmpty(this.f4328a.m4766e())) {
                C1490h.m5252a(new ak(), this.f4329b.getContext(), Uri.parse(this.f4328a.m4766e()), this.f4328a.m4762a());
            }
            return true;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.b.b$6 */
    class C15506 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C3326b f4330a;

        C15506(C3326b c3326b) {
            this.f4330a = c3326b;
        }

        public void run() {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(new Animator[]{this.f4330a.m12852d(), this.f4330a.m12854e()});
            animatorSet.setDuration(600);
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.start();
        }
    }

    /* renamed from: com.facebook.ads.internal.view.b.b$7 */
    class C15517 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C3326b f4331a;

        C15517(C3326b c3326b) {
            this.f4331a = c3326b;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f4331a.f10147l.setVisibility(8);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.b.b$8 */
    class C15528 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C3326b f4332a;

        C15528(C3326b c3326b) {
            this.f4332a = c3326b;
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f4332a.f10146k.setAlpha(0.0f);
            this.f4332a.f10146k.setVisibility(0);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.b.b$a */
    public interface C1553a {
        /* renamed from: a */
        void mo1832a();
    }

    /* renamed from: com.facebook.ads.internal.view.b.b$1 */
    class C41541 extends C3342o {
        /* renamed from: a */
        final /* synthetic */ C3326b f13288a;

        C41541(C3326b c3326b) {
            this.f13288a = c3326b;
        }

        /* renamed from: a */
        public void m16501a(C3341n c3341n) {
            if (this.f13288a.f10152q != null && this.f13288a.f10153r != 0 && this.f13288a.f10147l.isShown()) {
                float currentPosition = ((float) this.f13288a.f10152q.getCurrentPosition()) / Math.min(((float) this.f13288a.f10153r) * 1000.0f, (float) this.f13288a.f10152q.getDuration());
                this.f13288a.f10147l.setProgressWithAnimation(100.0f * currentPosition);
                if (currentPosition >= 1.0f) {
                    this.f13288a.f10150o.set(true);
                    this.f13288a.m12851c();
                    this.f13288a.f10152q.getEventBus().m4997b(this.f13288a.f10143a, this.f13288a.f10144b);
                }
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.b.b$2 */
    class C41552 extends C3330c {
        /* renamed from: a */
        final /* synthetic */ C3326b f13289a;

        C41552(C3326b c3326b) {
            this.f13289a = c3326b;
        }

        /* renamed from: a */
        public void m16503a(C3329b c3329b) {
            if (!(this.f13289a.f10152q == null || this.f13289a.f10153r == 0 || !this.f13289a.f10147l.isShown() || this.f13289a.f10150o.get())) {
                this.f13289a.f10150o.set(true);
                this.f13289a.m12851c();
                this.f13289a.f10152q.getEventBus().m4997b(this.f13289a.f10143a, this.f13289a.f10144b);
            }
        }
    }

    public C3326b(Context context) {
        super(context);
        setGravity(16);
        this.f10146k = new ImageView(context);
        this.f10146k.setPadding(f10139f, f10139f, f10139f, f10139f);
        this.f10146k.setScaleType(ScaleType.FIT_CENTER);
        this.f10146k.setImageBitmap(C1510w.m5311a(context, C1507t.INTERSTITIAL_CLOSE));
        this.f10146k.setOnClickListener(new C15473(this));
        this.f10147l = new CircularProgressView(context);
        this.f10147l.setPadding(f10139f, f10139f, f10139f, f10139f);
        this.f10147l.setProgress(0.0f);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(f10141h, f10141h, f10142i, f10141h);
        LayoutParams layoutParams2 = new LinearLayout.LayoutParams(f10138e, f10138e);
        View frameLayout = new FrameLayout(context);
        frameLayout.addView(this.f10146k, layoutParams2);
        frameLayout.addView(this.f10147l, layoutParams2);
        addView(frameLayout, layoutParams);
        this.f10148m = new C1555d(context);
        layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        addView(this.f10148m, layoutParams);
        this.f10145j = new ImageView(context);
        this.f10145j.setPadding(f10139f, f10139f, f10139f, f10139f);
        this.f10145j.setScaleType(ScaleType.FIT_CENTER);
        this.f10145j.setImageBitmap(C1510w.m5311a(context, C1507t.INTERSTITIAL_AD_CHOICES));
        this.f10145j.setOnClickListener(new C15484(this));
        this.f10149n = new PopupMenu(context, this.f10145j);
        this.f10149n.getMenu().add("Ad Choices");
        LayoutParams layoutParams3 = new LinearLayout.LayoutParams(f10137d, f10137d);
        layoutParams3.setMargins(0, f10140g / 2, f10140g / 2, f10140g / 2);
        addView(this.f10145j, layoutParams3);
    }

    /* renamed from: c */
    private void m12851c() {
        post(new C15506(this));
    }

    /* renamed from: d */
    private ObjectAnimator m12852d() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f10147l, "alpha", new float[]{0.0f});
        ofFloat.addListener(new C15517(this));
        return ofFloat;
    }

    /* renamed from: e */
    private ObjectAnimator m12854e() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f10146k, "alpha", new float[]{1.0f});
        ofFloat.addListener(new C15528(this));
        return ofFloat;
    }

    /* renamed from: a */
    public void m12863a(C1359i c1359i, boolean z) {
        int a = c1359i.m4753a(z);
        this.f10148m.m5417a(c1359i.m4759g(z), a);
        this.f10145j.setColorFilter(a);
        this.f10146k.setColorFilter(a);
        this.f10147l.m5450a(C0443a.m1688c(a, 77), a);
        if (z) {
            Drawable gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            an.m5205a((View) this, gradientDrawable);
            return;
        }
        an.m5204a((View) this, 0);
    }

    /* renamed from: a */
    public void mo1788a(C3394u c3394u) {
        this.f10152q = c3394u;
        this.f10152q.getEventBus().m4995a(this.f10143a, this.f10144b);
    }

    /* renamed from: a */
    public boolean m12865a() {
        return this.f10150o.get() ^ 1;
    }

    /* renamed from: b */
    public void m12866b() {
        this.f10149n.dismiss();
    }

    /* renamed from: b */
    public void mo1789b(C3394u c3394u) {
        if (this.f10152q != null) {
            this.f10152q.getEventBus().m4997b(this.f10143a, this.f10144b);
            this.f10152q = null;
        }
    }

    public void setInterstitialControlsListener(C1553a c1553a) {
        this.f10151p = c1553a;
    }

    public void setPageDetails(com.facebook.ads.internal.adapters.C1366u r4) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:6:0x0042 in {2, 4, 5} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = r3.f10148m;
        r1 = r4.m4763b();
        r2 = r4.m4764c();
        r0.m5419a(r1, r2);
        r0 = r3.f10149n;
        r1 = new com.facebook.ads.internal.view.b.b$5;
        r1.<init>(r3, r4);
        r0.setOnMenuItemClickListener(r1);
        r4 = r4.m4765d();
        r0 = 0;
        r4 = r4.get(r0);
        r4 = (com.facebook.ads.internal.adapters.C1353c) r4;
        r4 = r4.m4745k();
        r3.f10153r = r4;
        r4 = r3.f10153r;
        r1 = 8;
        if (r4 <= 0) goto L_0x0039;
    L_0x002e:
        r4 = r3.f10146k;
        r4.setVisibility(r1);
        r4 = r3.f10150o;
    L_0x0035:
        r4.set(r0);
        return;
    L_0x0039:
        r4 = r3.f10147l;
        r4.setVisibility(r1);
        r4 = r3.f10150o;
        r0 = 1;
        goto L_0x0035;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.view.b.b.setPageDetails(com.facebook.ads.internal.adapters.u):void");
    }
}
