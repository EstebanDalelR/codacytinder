package com.tinder.boost.view;

import android.content.Context;
import android.os.CountDownTimer;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.tinder.boost.provider.C10446l;
import com.tinder.model.DefaultObserver;
import com.tinder.utils.RxUtils;
import java.util.Random;
import rx.Observable;
import rx.Subscription;

public class BoostEmitterView extends FrameLayout {
    /* renamed from: a */
    private BoostedImageProvider f29670a;
    /* renamed from: b */
    private long f29671b;
    /* renamed from: c */
    private int f29672c;
    /* renamed from: d */
    private int f29673d;
    /* renamed from: e */
    private int f29674e;
    /* renamed from: f */
    private int f29675f;
    /* renamed from: g */
    private int f29676g;
    /* renamed from: h */
    private int f29677h;
    /* renamed from: i */
    private boolean f29678i;
    /* renamed from: j */
    private final Random f29679j;
    /* renamed from: k */
    private Random f29680k;
    /* renamed from: l */
    private CountDownTimer f29681l;
    /* renamed from: m */
    private Subscription f29682m;

    public interface BoostedImageProvider {
        Observable<C12641a> createdNextBoostedImageView(Context context);
    }

    public interface PointProvider {

        public enum Signage {
            NEGATIVE(-1),
            POSITIVE(1);
            
            private int mMultiplier;

            private Signage(int i) {
                this.mMultiplier = i;
            }

            public int getMultiplier() {
                return this.mMultiplier;
            }
        }

        void onMagnitudeChange(double d);

        void onNextPointCalculated(float f, float f2, float f3);

        void startAt(int i, int i2);
    }

    /* renamed from: com.tinder.boost.view.BoostEmitterView$b */
    public static class C8351b {
        /* renamed from: a */
        private BoostEmitterView f29668a;
        /* renamed from: b */
        private ViewGroup f29669b;

        /* renamed from: a */
        public C8351b m35556a(ViewGroup viewGroup) {
            this.f29669b = viewGroup;
            this.f29668a = new BoostEmitterView(viewGroup.getContext());
            return this;
        }

        /* renamed from: a */
        public C8351b m35557a(BoostedImageProvider boostedImageProvider) {
            this.f29668a.f29670a = boostedImageProvider;
            return this;
        }

        /* renamed from: a */
        public C8351b m35554a(int i) {
            this.f29668a.f29675f = i;
            return this;
        }

        /* renamed from: b */
        public C8351b m35559b(int i) {
            this.f29668a.f29676g = i;
            return this;
        }

        /* renamed from: c */
        public C8351b m35560c(int i) {
            this.f29668a.f29677h = i;
            return this;
        }

        /* renamed from: a */
        public C8351b m35555a(long j) {
            this.f29668a.f29671b = j;
            return this;
        }

        /* renamed from: a */
        public BoostEmitterView m35558a(View view) {
            float x = view.getX() + (((float) view.getWidth()) / 2.0f);
            LayoutParams layoutParams = new FrameLayout.LayoutParams(view.getWidth() + 180, (int) (view.getY() + (((float) view.getHeight()) / 2.0f)));
            layoutParams.leftMargin = (int) (((float) ((int) x)) - (((float) layoutParams.width) / 2.0f));
            this.f29669b.removeView(view);
            this.f29669b.addView(this.f29668a, layoutParams);
            this.f29669b.addView(view);
            return this.f29668a;
        }
    }

    /* renamed from: com.tinder.boost.view.BoostEmitterView$2 */
    class C126402 extends DefaultObserver<C12641a> {
        /* renamed from: a */
        final /* synthetic */ BoostEmitterView f40778a;

        C126402(BoostEmitterView boostEmitterView) {
            this.f40778a = boostEmitterView;
        }

        public /* synthetic */ void onNext(Object obj) {
            m49895a((C12641a) obj);
        }

        /* renamed from: a */
        public void m49895a(C12641a c12641a) {
            this.f40778a.addView(c12641a, new FrameLayout.LayoutParams(c12641a.getTargetWidth(), c12641a.getTargetHeight(), 81));
            c12641a.mo11308a();
            final Signage signage = this.f40778a.f29672c % 2 == 0 ? Signage.POSITIVE : Signage.NEGATIVE;
            final C12641a c12641a2 = c12641a;
            new C10446l(this, signage, new AccelerateDecelerateInterpolator(), this.f40778a.f29679j.nextInt(41) + 50, 1800, this.f40778a.f29675f) {
                /* renamed from: c */
                final /* synthetic */ C126402 f40776c;
                /* renamed from: d */
                private boolean f40777d;

                public void onNextPointCalculated(float f, float f2, float f3) {
                    c12641a2.setX(f);
                    c12641a2.setY(f2);
                    if (((double) f3) > 0.75d && this.f40777d == null) {
                        this.f40777d = true;
                        c12641a2.animate().alpha(0.0f).setDuration(6.3E-43f);
                    }
                }

                public void onMagnitudeChange(double d) {
                    c12641a2.setRotation((((float) d) * ((float) signage.getMultiplier())) / 4.0f);
                }
            }.startAt(this.f40778a.f29673d + this.f40778a.f29677h, (this.f40778a.f29674e == -1 ? this.f40778a.getHeight() : this.f40778a.f29674e) - this.f40778a.f29676g);
        }
    }

    /* renamed from: com.tinder.boost.view.BoostEmitterView$a */
    public static abstract class C12641a extends AppCompatImageView {
        /* renamed from: a */
        public abstract void mo11308a();

        public abstract int getTargetHeight();

        public abstract int getTargetWidth();

        public C12641a(Context context) {
            super(context);
        }
    }

    private BoostEmitterView(Context context) {
        super(context);
        this.f29674e = -1;
        this.f29679j = new Random();
        this.f29680k = new Random();
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f29673d = ((int) (((float) i) / 1073741824)) - 30;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f29681l != null) {
            this.f29681l.cancel();
        }
        if (this.f29682m != null) {
            this.f29682m.unsubscribe();
        }
    }

    /* renamed from: a */
    public void m35579a() {
        if (!this.f29678i) {
            this.f29678i = true;
            this.f29681l = new CountDownTimer(this, this.f29671b, 450) {
                /* renamed from: a */
                final /* synthetic */ BoostEmitterView f29666a;
                /* renamed from: b */
                private int f29667b = null;

                public void onTick(long j) {
                    this.f29667b++;
                    this.f29666a.f29680k = new Random();
                    if (this.f29667b % (this.f29666a.f29680k.nextInt(2) + 1) == 0) {
                        this.f29666a.m35573d();
                    }
                }

                public void onFinish() {
                    this.f29666a.f29678i = false;
                }
            };
            this.f29681l.start();
        }
    }

    /* renamed from: b */
    public void m35580b() {
        this.f29678i = false;
        if (this.f29681l != null) {
            this.f29681l.cancel();
        }
    }

    /* renamed from: c */
    public boolean m35581c() {
        return this.f29678i;
    }

    /* renamed from: d */
    private void m35573d() {
        this.f29672c++;
        this.f29682m = this.f29670a.createdNextBoostedImageView(getContext()).a(RxUtils.a()).l(C12642b.f40779a).a(new C126402(this));
    }
}
