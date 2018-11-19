package com.tinder.discovery.badge.renderer;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.support.annotation.ColorInt;
import android.support.annotation.FloatRange;
import com.tinder.domain.config.model.ProfileEditingConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001:\u0004OPQRBM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u001c\u00106\u001a\u00020\u00052\b\b\u0001\u00107\u001a\u00020\n2\b\b\u0001\u00108\u001a\u00020\u0005H\u0002J\b\u00109\u001a\u00020\u0005H\u0002J\u000e\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020#J \u0010=\u001a\u00020;2\u0006\u0010\"\u001a\u00020#2\u0006\u0010>\u001a\u00020#2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010?\u001a\u00020;2\u0006\u0010<\u001a\u00020#H\u0002J\b\u0010@\u001a\u00020\u0011H\u0002J\u0012\u0010A\u001a\u00020\u00052\b\b\u0001\u00107\u001a\u00020\nH\u0002J\u0018\u0010B\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010C\u001a\u00020\nH\u0002J\b\u0010D\u001a\u00020\nH\u0002J\b\u0010E\u001a\u00020\nH\u0002J\u0006\u0010F\u001a\u00020;J\u0006\u0010G\u001a\u00020;J\u000e\u0010H\u001a\u00020;2\u0006\u0010I\u001a\u00020\nJ&\u0010J\u001a\u00020;2\u0006\u00102\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0005J\u0018\u0010K\u001a\u00020\u00112\u0006\u0010L\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u0005H\u0002J\u0018\u0010N\u001a\u00020;2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020\u0011H\u0002R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0004¢\u0006\u0002\n\u0000R$\u0010(\u001a\u00020'2\u0006\u0010\u0014\u001a\u00020'@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001a\u00103\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0017\"\u0004\b5\u0010\u0019¨\u0006S"}, d2 = {"Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer;", "", "badgeIconRendererView", "Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer$BadgeIconRendererView;", "outerRadius", "", "innerRadius", "outerColor", "innerColor", "screenDensity", "", "bitmapFactory", "Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer$BitmapFactory;", "maskedCanvasFactory", "Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer$MaskedCanvasFactory;", "(Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer$BadgeIconRendererView;IIIIFLcom/tinder/discovery/badge/renderer/BadgeIconRenderer$BitmapFactory;Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer$MaskedCanvasFactory;)V", "animating", "", "animatingFraction", "bitmapSizeErrorCorrectionPx", "value", "drawBadgeOnIcon", "getDrawBadgeOnIcon", "()Z", "setDrawBadgeOnIcon", "(Z)V", "iconHeight", "iconWidth", "innerLayer", "Landroid/graphics/drawable/GradientDrawable;", "layerDrawable", "Landroid/graphics/drawable/LayerDrawable;", "maskedBitmap", "Landroid/graphics/Bitmap;", "maskedCanvas", "Landroid/graphics/Canvas;", "outerLayer", "paint", "Landroid/graphics/Paint;", "Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer$BadgePosition;", "position", "getPosition", "()Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer$BadgePosition;", "setPosition", "(Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer$BadgePosition;)V", "scale", "strokeWidth", "translationWhenAnimating", "viewCenterY", "viewHeight", "viewWidth", "visible", "getVisible", "setVisible", "applyAlpha", "alpha", "color", "diameter", "draw", "", "canvas", "drawAnimatingMask", "viewCanvas", "drawBadge", "iconHasSize", "intToAlphaColor", "leftBound", "maskedCanvasLeft", "maskedCanvasRight", "maskedCanvasRotation", "onAnimationEnd", "onAnimationStart", "onAnimationUpdate", "fraction", "onSizeChanged", "shouldCreateNewBitmap", "newWidth", "newHeight", "updateDrawableBounds", "BadgeIconRendererView", "BadgePosition", "BitmapFactory", "MaskedCanvasFactory", "discovery_release"}, k = 1, mv = {1, 1, 10})
public final class BadgeIconRenderer {
    /* renamed from: a */
    private final GradientDrawable f31094a;
    /* renamed from: b */
    private final GradientDrawable f31095b;
    /* renamed from: c */
    private final Paint f31096c;
    /* renamed from: d */
    private final int f31097d;
    /* renamed from: e */
    private final LayerDrawable f31098e;
    /* renamed from: f */
    private final float f31099f;
    /* renamed from: g */
    private float f31100g;
    /* renamed from: h */
    private Bitmap f31101h;
    /* renamed from: i */
    private Canvas f31102i;
    /* renamed from: j */
    private int f31103j;
    /* renamed from: k */
    private int f31104k;
    /* renamed from: l */
    private int f31105l;
    /* renamed from: m */
    private int f31106m;
    /* renamed from: n */
    private int f31107n;
    /* renamed from: o */
    private float f31108o;
    /* renamed from: p */
    private boolean f31109p;
    /* renamed from: q */
    private float f31110q;
    /* renamed from: r */
    private boolean f31111r;
    /* renamed from: s */
    private boolean f31112s;
    @NotNull
    /* renamed from: t */
    private BadgePosition f31113t;
    /* renamed from: u */
    private final BadgeIconRendererView f31114u;
    /* renamed from: v */
    private final int f31115v;
    /* renamed from: w */
    private final int f31116w;
    /* renamed from: x */
    private final int f31117x;
    /* renamed from: y */
    private final C8888a f31118y;
    /* renamed from: z */
    private final C8889b f31119z;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer$BadgeIconRendererView;", "", "drawOnCanvasProxy", "", "canvas", "Landroid/graphics/Canvas;", "invalidate", "discovery_release"}, k = 1, mv = {1, 1, 10})
    public interface BadgeIconRendererView {
        void drawOnCanvasProxy(@NotNull Canvas canvas);

        void invalidate();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer$BadgePosition;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "discovery_release"}, k = 1, mv = {1, 1, 10})
    public enum BadgePosition {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer$BitmapFactory;", "", "()V", "create", "Landroid/graphics/Bitmap;", "width", "", "height", "config", "Landroid/graphics/Bitmap$Config;", "discovery_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.badge.renderer.BadgeIconRenderer$a */
    public static final class C8888a {
        @NotNull
        /* renamed from: a */
        public final Bitmap m37671a(int i, int i2, @NotNull Config config) {
            C2668g.b(config, "config");
            i = Bitmap.createBitmap(i, i2, config);
            C2668g.a(i, "Bitmap.createBitmap(width, height, config)");
            return i;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer$MaskedCanvasFactory;", "", "()V", "create", "Landroid/graphics/Canvas;", "bitmap", "Landroid/graphics/Bitmap;", "discovery_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.discovery.badge.renderer.BadgeIconRenderer$b */
    public static final class C8889b {
        @NotNull
        /* renamed from: a */
        public final Canvas m37672a(@NotNull Bitmap bitmap) {
            C2668g.b(bitmap, "bitmap");
            return new Canvas(bitmap);
        }
    }

    /* renamed from: b */
    private final int m37677b(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        return (int) (f * ((float) 255));
    }

    public BadgeIconRenderer(@NotNull BadgeIconRendererView badgeIconRendererView, int i, int i2, @ColorInt int i3, @ColorInt int i4, float f, @NotNull C8888a c8888a, @NotNull C8889b c8889b) {
        C2668g.b(badgeIconRendererView, "badgeIconRendererView");
        C2668g.b(c8888a, "bitmapFactory");
        C2668g.b(c8889b, "maskedCanvasFactory");
        this.f31114u = badgeIconRendererView;
        this.f31115v = i;
        this.f31116w = i3;
        this.f31117x = i4;
        this.f31118y = c8888a;
        this.f31119z = c8889b;
        badgeIconRendererView = new GradientDrawable();
        badgeIconRendererView.setColor(this.f31116w);
        badgeIconRendererView.setCornerRadius((float) this.f31115v);
        this.f31094a = badgeIconRendererView;
        badgeIconRendererView = new GradientDrawable();
        badgeIconRendererView.setColor(this.f31117x);
        badgeIconRendererView.setCornerRadius((float) this.f31115v);
        this.f31095b = badgeIconRendererView;
        badgeIconRendererView = new Paint();
        badgeIconRendererView.setColor(m37673a((float) 1062836634, this.f31117x));
        badgeIconRendererView.setXfermode((Xfermode) new PorterDuffXfermode(Mode.SRC_ATOP));
        this.f31096c = badgeIconRendererView;
        this.f31097d = this.f31115v - i2;
        badgeIconRendererView = new LayerDrawable((Drawable[]) new GradientDrawable[]{this.f31094a, this.f31095b});
        badgeIconRendererView.setLayerInset(1, this.f31097d, this.f31097d, this.f31097d, this.f31097d);
        this.f31098e = badgeIconRendererView;
        this.f31099f = ((float) 4) * f;
        this.f31100g = 1.0f;
        this.f31113t = BadgePosition.LEFT;
    }

    public /* synthetic */ BadgeIconRenderer(BadgeIconRendererView badgeIconRendererView, int i, int i2, int i3, int i4, float f, C8888a c8888a, C8889b c8889b, int i5, C15823e c15823e) {
        int i6 = i5;
        this(badgeIconRendererView, i, i2, i3, i4, f, (i6 & 64) != 0 ? new C8888a() : c8888a, (i6 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? new C8889b() : c8889b);
    }

    /* renamed from: a */
    public final void m37690a(boolean z) {
        this.f31111r = z;
        m37675a(this.f31113t, this.f31111r);
    }

    /* renamed from: b */
    public final void m37692b(boolean z) {
        this.f31112s = z;
    }

    /* renamed from: a */
    public final void m37689a(@NotNull BadgePosition badgePosition) {
        C2668g.b(badgePosition, "value");
        this.f31113t = badgePosition;
        m37675a(badgePosition, this.f31111r);
    }

    /* renamed from: a */
    public final void m37688a(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        if (this.f31112s) {
            if (!this.f31109p || this.f31101h == null || this.f31101h == null) {
                this.f31114u.drawOnCanvasProxy(canvas);
            } else {
                Canvas canvas2 = this.f31102i;
                if (canvas2 == null) {
                    C2668g.a();
                }
                Bitmap bitmap = this.f31101h;
                if (bitmap == null) {
                    C2668g.a();
                }
                m37674a(canvas2, canvas, bitmap);
            }
            m37679b(canvas);
            return;
        }
        this.f31114u.drawOnCanvasProxy(canvas);
    }

    /* renamed from: a */
    public final void m37687a(int i, int i2, int i3, int i4) {
        this.f31105l = i;
        this.f31106m = i2;
        this.f31107n = i2 / 2;
        this.f31103j = i3;
        this.f31104k = i4;
        if (m37676a(i, i2) != 0) {
            i3 = this.f31101h;
            if (i3 != 0) {
                i3.recycle();
            }
            this.f31101h = this.f31118y.m37671a(i, i2, Config.ARGB_8888);
            i = this.f31119z;
            i2 = this.f31101h;
            if (i2 == 0) {
                C2668g.a();
            }
            this.f31102i = i.m37672a(i2);
        }
        m37675a(this.f31113t, this.f31111r);
    }

    /* renamed from: a */
    public final void m37685a() {
        this.f31109p = true;
        this.f31100g = 0.0f;
        this.f31108o = 0.0f;
        this.f31114u.invalidate();
    }

    /* renamed from: a */
    public final void m37686a(float f) {
        this.f31110q = f;
        this.f31100g = 1.0f * f;
        this.f31108o = Math.min((((float) this.f31105l) * f) * ((float) 2.8E-45f), (float) this.f31105l);
        this.f31114u.invalidate();
    }

    /* renamed from: b */
    public final void m37691b() {
        this.f31100g = 1.0f;
        this.f31109p = false;
        this.f31110q = 1.0f;
        this.f31114u.invalidate();
    }

    /* renamed from: b */
    private final void m37679b(Canvas canvas) {
        Rect bounds = this.f31098e.getBounds();
        int save = canvas.save();
        canvas.clipRect(bounds.left, bounds.top, bounds.right, bounds.bottom);
        if (this.f31100g >= ((float) 0) && this.f31100g < 1.0f) {
            float f = (float) 2;
            canvas.scale(this.f31100g, this.f31100g, ((float) (bounds.left + bounds.right)) / f, ((float) (bounds.top + bounds.bottom)) / f);
        }
        this.f31098e.draw(canvas);
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    private final void m37674a(Canvas canvas, Canvas canvas2, Bitmap bitmap) {
        int save = canvas.save();
        canvas.drawColor(0, Mode.CLEAR);
        this.f31114u.drawOnCanvasProxy(canvas);
        float f = (float) 2;
        canvas.rotate(m37683f(), ((float) this.f31105l) / f, ((float) this.f31106m) / f);
        canvas.drawRect(m37681d(), 0.0f, m37682e(), (float) this.f31106m, this.f31096c);
        canvas2.drawBitmap(bitmap, 0.0f, 0.0f, null);
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    private final void m37675a(BadgePosition badgePosition, boolean z) {
        badgePosition = m37678b(badgePosition, z);
        int i = this.f31107n - this.f31115v;
        this.f31098e.setBounds(badgePosition, i, m37680c() + badgePosition, this.f31107n + this.f31115v);
    }

    /* renamed from: b */
    private final int m37678b(BadgePosition badgePosition, boolean z) {
        int i = 0;
        if (badgePosition == BadgePosition.LEFT) {
            badgePosition = 0 - this.f31115v;
            if (z && m37684g()) {
                i = (this.f31105l / 2) - (this.f31103j / 2);
            }
            return badgePosition + i;
        }
        badgePosition = this.f31105l - this.f31115v;
        if (z && m37684g()) {
            i = (this.f31105l / 2) - (this.f31103j / 2);
        }
        return badgePosition - i;
    }

    /* renamed from: c */
    private final int m37680c() {
        return this.f31115v * 2;
    }

    /* renamed from: d */
    private final float m37681d() {
        return this.f31113t == BadgePosition.RIGHT ? this.f31108o : 0.0f;
    }

    /* renamed from: e */
    private final float m37682e() {
        if (this.f31113t == BadgePosition.RIGHT) {
            return (float) this.f31105l;
        }
        return ((float) this.f31105l) - this.f31108o;
    }

    /* renamed from: f */
    private final float m37683f() {
        float f = this.f31110q * 30.0f;
        return this.f31113t == BadgePosition.RIGHT ? f : f * ((float) -1);
    }

    /* renamed from: a */
    private final int m37673a(@FloatRange(from = 0.0d, to = 1.0d) float f, @ColorInt int i) {
        return Color.argb(m37677b(f), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: a */
    private final boolean m37676a(int i, int i2) {
        Bitmap bitmap = this.f31101h;
        boolean z = true;
        if (bitmap == null) {
            return true;
        }
        if (((float) Math.abs(i2 - bitmap.getHeight())) < this.f31099f) {
            if (((float) Math.abs(i - bitmap.getWidth())) < this.f31099f) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: g */
    private final boolean m37684g() {
        return this.f31103j > 0 && this.f31104k > 0;
    }
}
