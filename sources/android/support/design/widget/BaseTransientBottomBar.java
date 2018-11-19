package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.design.C0181a.C0170a;
import android.support.design.C0181a.C0177h;
import android.support.design.C0181a.C0180k;
import android.support.design.widget.C0243k.C0241a;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.design.widget.CoordinatorLayout.C0205b;
import android.support.design.widget.SwipeDismissBehavior.OnDismissListener;
import android.support.v4.view.C0610p;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    /* renamed from: a */
    static final Handler f631a = new Handler(Looper.getMainLooper(), new C01891());
    /* renamed from: d */
    private static final boolean f632d;
    /* renamed from: b */
    final C0196d f633b;
    /* renamed from: c */
    final C0241a f634c = new C27576(this);
    /* renamed from: e */
    private final ViewGroup f635e;
    /* renamed from: f */
    private final Context f636f;
    /* renamed from: g */
    private final ContentViewCallback f637g;
    /* renamed from: h */
    private int f638h;
    /* renamed from: i */
    private List<BaseCallback<B>> f639i;
    /* renamed from: j */
    private final AccessibilityManager f640j;

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$1 */
    static class C01891 implements Callback {
        C01891() {
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    ((BaseTransientBottomBar) message.obj).m650d();
                    return true;
                case 1:
                    ((BaseTransientBottomBar) message.obj).m648c(message.arg1);
                    return true;
                default:
                    return null;
            }
        }
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$3 */
    class C01913 implements AnimatorUpdateListener {
        /* renamed from: a */
        final /* synthetic */ BaseTransientBottomBar f624a;
        /* renamed from: b */
        private int f625b = null;

        C01913(BaseTransientBottomBar baseTransientBottomBar) {
            this.f624a = baseTransientBottomBar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            valueAnimator = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f632d) {
                ViewCompat.m2202c(this.f624a.f633b, valueAnimator - this.f625b);
            } else {
                this.f624a.f633b.setTranslationY((float) valueAnimator);
            }
            this.f625b = valueAnimator;
        }
    }

    public static abstract class BaseCallback<B> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        @RestrictTo({Scope.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        public @interface DismissEvent {
        }

        public void onDismissed(B b, int i) {
        }

        public void onShown(B b) {
        }
    }

    public interface ContentViewCallback {
        void animateContentIn(int i, int i2);

        void animateContentOut(int i, int i2);
    }

    @IntRange(from = 1)
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Duration {
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: android.support.design.widget.BaseTransientBottomBar$b */
    interface C0194b {
        /* renamed from: a */
        void mo221a(View view);

        /* renamed from: b */
        void mo222b(View view);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: android.support.design.widget.BaseTransientBottomBar$c */
    interface C0195c {
        /* renamed from: a */
        void mo223a(View view, int i, int i2, int i3, int i4);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: android.support.design.widget.BaseTransientBottomBar$d */
    static class C0196d extends FrameLayout {
        /* renamed from: a */
        private C0195c f629a;
        /* renamed from: b */
        private C0194b f630b;

        C0196d(Context context) {
            this(context, null);
        }

        C0196d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, C0180k.SnackbarLayout);
            if (context.hasValue(C0180k.SnackbarLayout_elevation) != null) {
                ViewCompat.m2215i(this, (float) context.getDimensionPixelSize(C0180k.SnackbarLayout_elevation, 0));
            }
            context.recycle();
            setClickable(true);
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f629a) {
                this.f629a.mo223a(this, i, i2, i3, i4);
            }
        }

        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.f630b != null) {
                this.f630b.mo221a(this);
            }
            ViewCompat.m2226r(this);
        }

        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.f630b != null) {
                this.f630b.mo222b(this);
            }
        }

        void setOnLayoutChangeListener(C0195c c0195c) {
            this.f629a = c0195c;
        }

        void setOnAttachStateChangeListener(C0194b c0194b) {
            this.f630b = c0194b;
        }
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$5 */
    class C27565 implements OnApplyWindowInsetsListener {
        /* renamed from: a */
        final /* synthetic */ BaseTransientBottomBar f8684a;

        C27565(BaseTransientBottomBar baseTransientBottomBar) {
            this.f8684a = baseTransientBottomBar;
        }

        public C0610p onApplyWindowInsets(View view, C0610p c0610p) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), c0610p.m2392d());
            return c0610p;
        }
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$6 */
    class C27576 implements C0241a {
        /* renamed from: a */
        final /* synthetic */ BaseTransientBottomBar f8685a;

        C27576(BaseTransientBottomBar baseTransientBottomBar) {
            this.f8685a = baseTransientBottomBar;
        }

        /* renamed from: a */
        public void mo217a() {
            BaseTransientBottomBar.f631a.sendMessage(BaseTransientBottomBar.f631a.obtainMessage(0, this.f8685a));
        }

        /* renamed from: a */
        public void mo218a(int i) {
            BaseTransientBottomBar.f631a.sendMessage(BaseTransientBottomBar.f631a.obtainMessage(1, i, 0, this.f8685a));
        }
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$7 */
    class C27587 implements OnDismissListener {
        /* renamed from: a */
        final /* synthetic */ BaseTransientBottomBar f8686a;

        C27587(BaseTransientBottomBar baseTransientBottomBar) {
            this.f8686a = baseTransientBottomBar;
        }

        public void onDismiss(View view) {
            view.setVisibility(8);
            this.f8686a.m647b(0);
        }

        public void onDragStateChanged(int i) {
            switch (i) {
                case 0:
                    C0243k.m898a().m910d(this.f8686a.f634c);
                    return;
                case 1:
                case 2:
                    C0243k.m898a().m909c(this.f8686a.f634c);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$8 */
    class C27598 implements C0194b {
        /* renamed from: a */
        final /* synthetic */ BaseTransientBottomBar f8687a;

        /* renamed from: android.support.design.widget.BaseTransientBottomBar$8$1 */
        class C01931 implements Runnable {
            /* renamed from: a */
            final /* synthetic */ C27598 f628a;

            C01931(C27598 c27598) {
                this.f628a = c27598;
            }

            public void run() {
                this.f628a.f8687a.m651d(3);
            }
        }

        /* renamed from: a */
        public void mo221a(View view) {
        }

        C27598(BaseTransientBottomBar baseTransientBottomBar) {
            this.f8687a = baseTransientBottomBar;
        }

        /* renamed from: b */
        public void mo222b(View view) {
            if (this.f8687a.m649c() != null) {
                BaseTransientBottomBar.f631a.post(new C01931(this));
            }
        }
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$9 */
    class C27609 implements C0195c {
        /* renamed from: a */
        final /* synthetic */ BaseTransientBottomBar f8688a;

        C27609(BaseTransientBottomBar baseTransientBottomBar) {
            this.f8688a = baseTransientBottomBar;
        }

        /* renamed from: a */
        public void mo223a(View view, int i, int i2, int i3, int i4) {
            this.f8688a.f633b.setOnLayoutChangeListener(0);
            if (this.f8688a.m654g() != null) {
                this.f8688a.m652e();
            } else {
                this.f8688a.m653f();
            }
        }
    }

    /* renamed from: android.support.design.widget.BaseTransientBottomBar$a */
    final class C3996a extends SwipeDismissBehavior<C0196d> {
        /* renamed from: a */
        final /* synthetic */ BaseTransientBottomBar f12682a;

        C3996a(BaseTransientBottomBar baseTransientBottomBar) {
            this.f12682a = baseTransientBottomBar;
        }

        /* renamed from: a */
        public boolean mo2981a(View view) {
            return view instanceof C0196d;
        }

        /* renamed from: a */
        public boolean m15609a(CoordinatorLayout coordinatorLayout, C0196d c0196d, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 3) {
                switch (actionMasked) {
                    case 0:
                        if (coordinatorLayout.m15645a((View) c0196d, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                            C0243k.m898a().m909c(this.f12682a.f634c);
                            break;
                        }
                        break;
                    case 1:
                        break;
                    default:
                        break;
                }
            }
            C0243k.m898a().m910d(this.f12682a.f634c);
            return super.mo234a(coordinatorLayout, (View) c0196d, motionEvent);
        }
    }

    static {
        boolean z = VERSION.SDK_INT >= 16 && VERSION.SDK_INT <= 19;
        f632d = z;
    }

    protected BaseTransientBottomBar(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull ContentViewCallback contentViewCallback) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (contentViewCallback == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        } else {
            this.f635e = viewGroup;
            this.f637g = contentViewCallback;
            this.f636f = viewGroup.getContext();
            C0248o.m917a(this.f636f);
            this.f633b = (C0196d) LayoutInflater.from(this.f636f).inflate(C0177h.design_layout_snackbar, this.f635e, false);
            this.f633b.addView(view);
            ViewCompat.m2196b(this.f633b, 1);
            ViewCompat.m2176a(this.f633b, 1);
            ViewCompat.m2198b(this.f633b, true);
            ViewCompat.m2184a(this.f633b, new C27565(this));
            this.f640j = (AccessibilityManager) this.f636f.getSystemService("accessibility");
        }
    }

    @NonNull
    /* renamed from: a */
    public B m643a(int i) {
        this.f638h = i;
        return this;
    }

    @NonNull
    /* renamed from: a */
    public Context m642a() {
        return this.f636f;
    }

    /* renamed from: b */
    public void m646b() {
        C0243k.m898a().m904a(this.f638h, this.f634c);
    }

    /* renamed from: b */
    void m647b(int i) {
        C0243k.m898a().m906a(this.f634c, i);
    }

    @NonNull
    /* renamed from: a */
    public B m644a(@NonNull BaseCallback<B> baseCallback) {
        if (baseCallback == null) {
            return this;
        }
        if (this.f639i == null) {
            this.f639i = new ArrayList();
        }
        this.f639i.add(baseCallback);
        return this;
    }

    @NonNull
    /* renamed from: b */
    public B m645b(@NonNull BaseCallback<B> baseCallback) {
        if (baseCallback == null || this.f639i == null) {
            return this;
        }
        this.f639i.remove(baseCallback);
        return this;
    }

    /* renamed from: c */
    public boolean m649c() {
        return C0243k.m898a().m911e(this.f634c);
    }

    /* renamed from: d */
    final void m650d() {
        if (this.f633b.getParent() == null) {
            LayoutParams layoutParams = this.f633b.getLayoutParams();
            if (layoutParams instanceof C0205b) {
                C0205b c0205b = (C0205b) layoutParams;
                Behavior c3996a = new C3996a(this);
                c3996a.m10776a(0.1f);
                c3996a.m10781b(0.6f);
                c3996a.m10777a(0);
                c3996a.m10778a(new C27587(this));
                c0205b.m716a(c3996a);
                c0205b.f688g = 80;
            }
            this.f635e.addView(this.f633b);
        }
        this.f633b.setOnAttachStateChangeListener(new C27598(this));
        if (!ViewCompat.m2234z(this.f633b)) {
            this.f633b.setOnLayoutChangeListener(new C27609(this));
        } else if (m654g()) {
            m652e();
        } else {
            m653f();
        }
    }

    /* renamed from: e */
    void m652e() {
        if (VERSION.SDK_INT >= 12) {
            final int height = this.f633b.getHeight();
            if (f632d) {
                ViewCompat.m2202c(this.f633b, height);
            } else {
                this.f633b.setTranslationY((float) height);
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{height, 0});
            valueAnimator.setInterpolator(C0226a.f781b);
            valueAnimator.setDuration(250);
            valueAnimator.addListener(new AnimatorListenerAdapter(this) {
                /* renamed from: a */
                final /* synthetic */ BaseTransientBottomBar f617a;

                {
                    this.f617a = r1;
                }

                public void onAnimationStart(Animator animator) {
                    this.f617a.f637g.animateContentIn(70, 180);
                }

                public void onAnimationEnd(Animator animator) {
                    this.f617a.m653f();
                }
            });
            valueAnimator.addUpdateListener(new AnimatorUpdateListener(this) {
                /* renamed from: b */
                final /* synthetic */ BaseTransientBottomBar f619b;
                /* renamed from: c */
                private int f620c = height;

                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    valueAnimator = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (BaseTransientBottomBar.f632d) {
                        ViewCompat.m2202c(this.f619b.f633b, valueAnimator - this.f620c);
                    } else {
                        this.f619b.f633b.setTranslationY((float) valueAnimator);
                    }
                    this.f620c = valueAnimator;
                }
            });
            valueAnimator.start();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f633b.getContext(), C0170a.design_snackbar_in);
        loadAnimation.setInterpolator(C0226a.f781b);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new AnimationListener(this) {
            /* renamed from: a */
            final /* synthetic */ BaseTransientBottomBar f621a;

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }

            {
                this.f621a = r1;
            }

            public void onAnimationEnd(Animation animation) {
                this.f621a.m653f();
            }
        });
        this.f633b.startAnimation(loadAnimation);
    }

    /* renamed from: e */
    private void mo254e(final int i) {
        if (VERSION.SDK_INT >= 12) {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{0, this.f633b.getHeight()});
            valueAnimator.setInterpolator(C0226a.f781b);
            valueAnimator.setDuration(250);
            valueAnimator.addListener(new AnimatorListenerAdapter(this) {
                /* renamed from: b */
                final /* synthetic */ BaseTransientBottomBar f623b;

                public void onAnimationStart(Animator animator) {
                    this.f623b.f637g.animateContentOut(0, 180);
                }

                public void onAnimationEnd(Animator animator) {
                    this.f623b.m651d(i);
                }
            });
            valueAnimator.addUpdateListener(new C01913(this));
            valueAnimator.start();
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f633b.getContext(), C0170a.design_snackbar_out);
        loadAnimation.setInterpolator(C0226a.f781b);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new AnimationListener(this) {
            /* renamed from: b */
            final /* synthetic */ BaseTransientBottomBar f627b;

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }

            public void onAnimationEnd(Animation animation) {
                this.f627b.m651d(i);
            }
        });
        this.f633b.startAnimation(loadAnimation);
    }

    /* renamed from: c */
    final void m648c(int i) {
        if (m654g() && this.f633b.getVisibility() == 0) {
            mo254e(i);
        } else {
            m651d(i);
        }
    }

    /* renamed from: f */
    void m653f() {
        C0243k.m898a().m908b(this.f634c);
        if (this.f639i != null) {
            for (int size = this.f639i.size() - 1; size >= 0; size--) {
                ((BaseCallback) this.f639i.get(size)).onShown(this);
            }
        }
    }

    /* renamed from: d */
    void m651d(int i) {
        C0243k.m898a().m905a(this.f634c);
        if (this.f639i != null) {
            for (int size = this.f639i.size() - 1; size >= 0; size--) {
                ((BaseCallback) this.f639i.get(size)).onDismissed(this, i);
            }
        }
        if (VERSION.SDK_INT < 11) {
            this.f633b.setVisibility(8);
        }
        i = this.f633b.getParent();
        if (i instanceof ViewGroup) {
            ((ViewGroup) i).removeView(this.f633b);
        }
    }

    /* renamed from: g */
    boolean m654g() {
        return this.f640j.isEnabled() ^ 1;
    }
}
