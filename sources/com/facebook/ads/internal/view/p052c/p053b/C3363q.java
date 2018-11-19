package com.facebook.ads.internal.view.p052c.p053b;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.support.annotation.Nullable;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.ads.internal.p041h.C1429s;
import com.facebook.ads.internal.view.C3394u;
import com.facebook.ads.internal.view.p052c.p080a.C3329b;
import com.facebook.ads.internal.view.p052c.p080a.C3330c;
import com.facebook.ads.internal.view.p052c.p080a.C3335h;
import com.facebook.ads.internal.view.p052c.p080a.C3336i;
import com.facebook.ads.internal.view.p052c.p080a.C3337j;
import com.facebook.ads.internal.view.p052c.p080a.C3338k;
import com.facebook.ads.internal.view.p052c.p080a.C3341n;
import com.facebook.ads.internal.view.p052c.p080a.C3342o;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.ads.internal.view.c.b.q */
public class C3363q extends RelativeLayout implements C1582n {
    /* renamed from: a */
    private ObjectAnimator f10199a;
    /* renamed from: b */
    private AtomicInteger f10200b;
    /* renamed from: c */
    private ProgressBar f10201c;
    @Nullable
    /* renamed from: d */
    private C3394u f10202d;
    /* renamed from: e */
    private C1429s f10203e;
    /* renamed from: f */
    private C1429s f10204f;
    /* renamed from: g */
    private C1429s f10205g;
    /* renamed from: h */
    private C1429s f10206h;

    /* renamed from: com.facebook.ads.internal.view.c.b.q$1 */
    class C41841 extends C3342o {
        /* renamed from: a */
        final /* synthetic */ C3363q f13343a;

        C41841(C3363q c3363q) {
            this.f13343a = c3363q;
        }

        /* renamed from: a */
        public void m16572a(C3341n c3341n) {
            if (this.f13343a.f10202d != null) {
                this.f13343a.m12932a(this.f13343a.f10202d.getDuration(), this.f13343a.f10202d.getCurrentPosition());
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.q$2 */
    class C41852 extends C3336i {
        /* renamed from: a */
        final /* synthetic */ C3363q f13344a;

        C41852(C3363q c3363q) {
            this.f13344a = c3363q;
        }

        /* renamed from: a */
        public void m16574a(C3335h c3335h) {
            this.f13344a.m12934b();
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.q$3 */
    class C41863 extends C3338k {
        /* renamed from: a */
        final /* synthetic */ C3363q f13345a;

        C41863(C3363q c3363q) {
            this.f13345a = c3363q;
        }

        /* renamed from: a */
        public void m16576a(C3337j c3337j) {
            if (this.f13345a.f10202d != null) {
                this.f13345a.m12932a(this.f13345a.f10202d.getDuration(), this.f13345a.f10202d.getCurrentPosition());
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.c.b.q$4 */
    class C41874 extends C3330c {
        /* renamed from: a */
        final /* synthetic */ C3363q f13346a;

        C41874(C3363q c3363q) {
            this.f13346a = c3363q;
        }

        /* renamed from: a */
        public void m16578a(C3329b c3329b) {
            if (this.f13346a.f10202d != null) {
                this.f13346a.m12936c();
            }
        }
    }

    public C3363q(Context context, int i) {
        this(context, i, -12549889);
    }

    public C3363q(Context context, int i, int i2) {
        super(context);
        this.f10203e = new C41841(this);
        this.f10204f = new C41852(this);
        this.f10205g = new C41863(this);
        this.f10206h = new C41874(this);
        this.f10200b = new AtomicInteger(-1);
        this.f10201c = new ProgressBar(context, null, 16842872);
        this.f10201c.setLayoutParams(new LayoutParams(-1, i));
        setProgressBarColor(i2);
        this.f10201c.setMax(10000);
        addView(this.f10201c);
    }

    /* renamed from: a */
    private void m12932a(int i, int i2) {
        m12934b();
        if (this.f10200b.get() < i2 && i > i2) {
            int i3 = (i2 * 10000) / i;
            int min = (Math.min(i2 + Callback.DEFAULT_SWIPE_ANIMATION_DURATION, i) * 10000) / i;
            this.f10199a = ObjectAnimator.ofInt(this.f10201c, "progress", new int[]{i3, min});
            this.f10199a.setDuration((long) Math.min(Callback.DEFAULT_SWIPE_ANIMATION_DURATION, i - i2));
            this.f10199a.setInterpolator(new LinearInterpolator());
            this.f10199a.start();
            this.f10200b.set(i2);
        }
    }

    /* renamed from: b */
    private void m12934b() {
        if (this.f10199a != null) {
            this.f10199a.cancel();
            this.f10199a.setTarget(null);
            this.f10199a = null;
            this.f10201c.clearAnimation();
        }
    }

    /* renamed from: c */
    private void m12936c() {
        m12934b();
        this.f10199a = ObjectAnimator.ofInt(this.f10201c, "progress", new int[]{0, 0});
        this.f10199a.setDuration(0);
        this.f10199a.setInterpolator(new LinearInterpolator());
        this.f10199a.start();
        this.f10200b.set(0);
    }

    /* renamed from: a */
    public void m12938a() {
        m12934b();
        this.f10201c = null;
        this.f10202d = null;
    }

    /* renamed from: a */
    public void mo1788a(C3394u c3394u) {
        this.f10202d = c3394u;
        c3394u.getEventBus().m4995a(this.f10204f, this.f10205g, this.f10203e, this.f10206h);
    }

    /* renamed from: b */
    public void mo1789b(C3394u c3394u) {
        c3394u.getEventBus().m4997b(this.f10203e, this.f10205g, this.f10204f, this.f10206h);
        this.f10202d = null;
    }

    public void setProgressBarColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(0);
        ColorDrawable colorDrawable2 = new ColorDrawable(0);
        ScaleDrawable scaleDrawable = new ScaleDrawable(new ColorDrawable(i), 8388611, 1.0f, -1.0f);
        Drawable layerDrawable = new LayerDrawable(new Drawable[]{colorDrawable, colorDrawable2, scaleDrawable});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        this.f10201c.setProgressDrawable(layerDrawable);
    }
}
