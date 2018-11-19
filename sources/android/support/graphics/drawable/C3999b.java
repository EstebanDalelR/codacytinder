package android.support.graphics.drawable;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.graphics.drawable.Animatable2Compat.C0253a;
import android.support.v4.content.res.C0442b;
import android.support.v4.graphics.drawable.C0450a;
import android.support.v4.util.C2880a;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.graphics.drawable.b */
public class C3999b extends C2782g implements Animatable2Compat {
    /* renamed from: a */
    final Callback f12725a;
    /* renamed from: c */
    private C0257a f12726c;
    /* renamed from: d */
    private Context f12727d;
    /* renamed from: e */
    private ArgbEvaluator f12728e;
    /* renamed from: f */
    private AnimatorListener f12729f;
    /* renamed from: g */
    private ArrayList<C0253a> f12730g;

    /* renamed from: android.support.graphics.drawable.b$1 */
    class C02551 implements Callback {
        /* renamed from: a */
        final /* synthetic */ C3999b f918a;

        C02551(C3999b c3999b) {
            this.f918a = c3999b;
        }

        public void invalidateDrawable(Drawable drawable) {
            this.f918a.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            this.f918a.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            this.f918a.unscheduleSelf(runnable);
        }
    }

    /* renamed from: android.support.graphics.drawable.b$2 */
    class C02562 extends AnimatorListenerAdapter {
        /* renamed from: a */
        final /* synthetic */ C3999b f919a;

        C02562(C3999b c3999b) {
            this.f919a = c3999b;
        }

        public void onAnimationStart(Animator animator) {
            animator = new ArrayList(this.f919a.f12730g);
            int size = animator.size();
            for (int i = 0; i < size; i++) {
                ((C0253a) animator.get(i)).m929a(this.f919a);
            }
        }

        public void onAnimationEnd(Animator animator) {
            animator = new ArrayList(this.f919a.f12730g);
            int size = animator.size();
            for (int i = 0; i < size; i++) {
                ((C0253a) animator.get(i)).m930b(this.f919a);
            }
        }
    }

    /* renamed from: android.support.graphics.drawable.b$a */
    private static class C0257a extends ConstantState {
        /* renamed from: a */
        int f920a;
        /* renamed from: b */
        C4000h f921b;
        /* renamed from: c */
        AnimatorSet f922c;
        /* renamed from: d */
        C2880a<Animator, String> f923d;
        /* renamed from: e */
        private ArrayList<Animator> f924e;

        public C0257a(Context context, C0257a c0257a, Callback callback, Resources resources) {
            if (c0257a != null) {
                this.f920a = c0257a.f920a;
                int i = 0;
                if (c0257a.f921b != null) {
                    context = c0257a.f921b.getConstantState();
                    if (resources != null) {
                        this.f921b = (C4000h) context.newDrawable(resources);
                    } else {
                        this.f921b = (C4000h) context.newDrawable();
                    }
                    this.f921b = (C4000h) this.f921b.mutate();
                    this.f921b.setCallback(callback);
                    this.f921b.setBounds(c0257a.f921b.getBounds());
                    this.f921b.m15695a(false);
                }
                if (c0257a.f924e != null) {
                    int size = c0257a.f924e.size();
                    this.f924e = new ArrayList(size);
                    this.f923d = new C2880a(size);
                    while (i < size) {
                        Animator animator = (Animator) c0257a.f924e.get(i);
                        resources = animator.clone();
                        String str = (String) c0257a.f923d.get(animator);
                        resources.setTarget(this.f921b.m15694a(str));
                        this.f924e.add(resources);
                        this.f923d.put(resources, str);
                        i++;
                    }
                    m933a();
                }
            }
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public int getChangingConfigurations() {
            return this.f920a;
        }

        /* renamed from: a */
        public void m933a() {
            if (this.f922c == null) {
                this.f922c = new AnimatorSet();
            }
            this.f922c.playTogether(this.f924e);
        }
    }

    @RequiresApi(24)
    /* renamed from: android.support.graphics.drawable.b$b */
    private static class C0258b extends ConstantState {
        /* renamed from: a */
        private final ConstantState f925a;

        public C0258b(ConstantState constantState) {
            this.f925a = constantState;
        }

        public Drawable newDrawable() {
            Drawable c3999b = new C3999b();
            c3999b.b = this.f925a.newDrawable();
            c3999b.b.setCallback(c3999b.f12725a);
            return c3999b;
        }

        public Drawable newDrawable(Resources resources) {
            Drawable c3999b = new C3999b();
            c3999b.b = this.f925a.newDrawable(resources);
            c3999b.b.setCallback(c3999b.f12725a);
            return c3999b;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            Drawable c3999b = new C3999b();
            c3999b.b = this.f925a.newDrawable(resources, theme);
            c3999b.b.setCallback(c3999b.f12725a);
            return c3999b;
        }

        public boolean canApplyTheme() {
            return this.f925a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f925a.getChangingConfigurations();
        }
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    C3999b() {
        this(null, null, null);
    }

    private C3999b(@Nullable Context context) {
        this(context, null, null);
    }

    private C3999b(@Nullable Context context, @Nullable C0257a c0257a, @Nullable Resources resources) {
        this.f12728e = null;
        this.f12729f = null;
        this.f12730g = null;
        this.f12725a = new C02551(this);
        this.f12727d = context;
        if (c0257a != null) {
            this.f12726c = c0257a;
        } else {
            this.f12726c = new C0257a(context, c0257a, this.f12725a, resources);
        }
    }

    public Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
        }
        return this;
    }

    /* renamed from: a */
    public static C3999b m15679a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        C3999b c3999b = new C3999b(context);
        c3999b.inflate(resources, xmlPullParser, attributeSet, theme);
        return c3999b;
    }

    public ConstantState getConstantState() {
        return (this.b == null || VERSION.SDK_INT < 24) ? null : new C0258b(this.b.getConstantState());
    }

    public int getChangingConfigurations() {
        if (this.b != null) {
            return this.b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f12726c.f920a;
    }

    public void draw(Canvas canvas) {
        if (this.b != null) {
            this.b.draw(canvas);
            return;
        }
        this.f12726c.f921b.draw(canvas);
        if (this.f12726c.f922c.isStarted() != null) {
            invalidateSelf();
        }
    }

    protected void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        } else {
            this.f12726c.f921b.setBounds(rect);
        }
    }

    protected boolean onStateChange(int[] iArr) {
        if (this.b != null) {
            return this.b.setState(iArr);
        }
        return this.f12726c.f921b.setState(iArr);
    }

    protected boolean onLevelChange(int i) {
        if (this.b != null) {
            return this.b.setLevel(i);
        }
        return this.f12726c.f921b.setLevel(i);
    }

    public int getAlpha() {
        if (this.b != null) {
            return C0450a.m1726c(this.b);
        }
        return this.f12726c.f921b.getAlpha();
    }

    public void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
        } else {
            this.f12726c.f921b.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
        } else {
            this.f12726c.f921b.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i) {
        if (this.b != null) {
            C0450a.m1717a(this.b, i);
        } else {
            this.f12726c.f921b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            C0450a.m1719a(this.b, colorStateList);
        } else {
            this.f12726c.f921b.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        if (this.b != null) {
            C0450a.m1722a(this.b, mode);
        } else {
            this.f12726c.f921b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.b != null) {
            return this.b.setVisible(z, z2);
        }
        this.f12726c.f921b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public boolean isStateful() {
        if (this.b != null) {
            return this.b.isStateful();
        }
        return this.f12726c.f921b.isStateful();
    }

    public int getOpacity() {
        if (this.b != null) {
            return this.b.getOpacity();
        }
        return this.f12726c.f921b.getOpacity();
    }

    public int getIntrinsicWidth() {
        if (this.b != null) {
            return this.b.getIntrinsicWidth();
        }
        return this.f12726c.f921b.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        if (this.b != null) {
            return this.b.getIntrinsicHeight();
        }
        return this.f12726c.f921b.getIntrinsicHeight();
    }

    public boolean isAutoMirrored() {
        if (this.b != null) {
            return C0450a.m1724b(this.b);
        }
        return this.f12726c.f921b.isAutoMirrored();
    }

    public void setAutoMirrored(boolean z) {
        if (this.b != null) {
            C0450a.m1723a(this.b, z);
        } else {
            this.f12726c.f921b.setAutoMirrored(z);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        if (this.b != null) {
            C0450a.m1721a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                TypedArray a;
                if ("animated-vector".equals(name)) {
                    a = C0442b.m1673a(resources, theme, attributeSet, C0254a.f910e);
                    int resourceId = a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C4000h a2 = C4000h.m15688a(resources, resourceId, theme);
                        a2.m15695a(false);
                        a2.setCallback(this.f12725a);
                        if (this.f12726c.f921b != null) {
                            this.f12726c.f921b.setCallback(null);
                        }
                        this.f12726c.f921b = a2;
                    }
                    a.recycle();
                } else if ("target".equals(name)) {
                    a = resources.obtainAttributes(attributeSet, C0254a.f911f);
                    String string = a.getString(0);
                    int resourceId2 = a.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.f12727d != null) {
                            m15683a(string, C0262d.m939a(this.f12727d, resourceId2));
                        } else {
                            a.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    a.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f12726c.m933a();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    public void applyTheme(Theme theme) {
        if (this.b != null) {
            C0450a.m1720a(this.b, theme);
        }
    }

    public boolean canApplyTheme() {
        return this.b != null ? C0450a.m1727d(this.b) : false;
    }

    /* renamed from: a */
    private void m15682a(Animator animator) {
        if (animator instanceof AnimatorSet) {
            List childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    m15682a((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f12728e == null) {
                    this.f12728e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f12728e);
            }
        }
    }

    /* renamed from: a */
    private void m15683a(String str, Animator animator) {
        animator.setTarget(this.f12726c.f921b.m15694a(str));
        if (VERSION.SDK_INT < 21) {
            m15682a(animator);
        }
        if (this.f12726c.f924e == null) {
            this.f12726c.f924e = new ArrayList();
            this.f12726c.f923d = new C2880a();
        }
        this.f12726c.f924e.add(animator);
        this.f12726c.f923d.put(animator, str);
    }

    public boolean isRunning() {
        if (this.b != null) {
            return ((AnimatedVectorDrawable) this.b).isRunning();
        }
        return this.f12726c.f922c.isRunning();
    }

    public void start() {
        if (this.b != null) {
            ((AnimatedVectorDrawable) this.b).start();
        } else if (!this.f12726c.f922c.isStarted()) {
            this.f12726c.f922c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.b != null) {
            ((AnimatedVectorDrawable) this.b).stop();
        } else {
            this.f12726c.f922c.end();
        }
    }

    @RequiresApi(23)
    /* renamed from: a */
    private static boolean m15684a(AnimatedVectorDrawable animatedVectorDrawable, C0253a c0253a) {
        return animatedVectorDrawable.unregisterAnimationCallback(c0253a.m928a());
    }

    public void registerAnimationCallback(@NonNull C0253a c0253a) {
        if (this.b != null) {
            C3999b.m15685b((AnimatedVectorDrawable) this.b, c0253a);
        } else if (c0253a != null) {
            if (this.f12730g == null) {
                this.f12730g = new ArrayList();
            }
            if (!this.f12730g.contains(c0253a)) {
                this.f12730g.add(c0253a);
                if (this.f12729f == null) {
                    this.f12729f = new C02562(this);
                }
                this.f12726c.f922c.addListener(this.f12729f);
            }
        }
    }

    @RequiresApi(23)
    /* renamed from: b */
    private static void m15685b(@NonNull AnimatedVectorDrawable animatedVectorDrawable, @NonNull C0253a c0253a) {
        animatedVectorDrawable.registerAnimationCallback(c0253a.m928a());
    }

    /* renamed from: a */
    private void m15681a() {
        if (this.f12729f != null) {
            this.f12726c.f922c.removeListener(this.f12729f);
            this.f12729f = null;
        }
    }

    public boolean unregisterAnimationCallback(@NonNull C0253a c0253a) {
        if (this.b != null) {
            C3999b.m15684a((AnimatedVectorDrawable) this.b, c0253a);
        }
        if (this.f12730g != null) {
            if (c0253a != null) {
                c0253a = this.f12730g.remove(c0253a);
                if (this.f12730g.size() == 0) {
                    m15681a();
                }
                return c0253a;
            }
        }
        return null;
    }

    public void clearAnimationCallbacks() {
        if (this.b != null) {
            ((AnimatedVectorDrawable) this.b).clearAnimationCallbacks();
            return;
        }
        m15681a();
        if (this.f12730g != null) {
            this.f12730g.clear();
        }
    }
}
