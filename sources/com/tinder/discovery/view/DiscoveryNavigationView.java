package com.tinder.discovery.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tinder.discovery.C8878a.C8873a;
import com.tinder.discovery.C8878a.C8874b;
import com.tinder.discovery.badge.Badgeable;
import com.tinder.discovery.badge.p233a.C8887a;
import com.tinder.discovery.badge.renderer.BadgeIconRenderer;
import com.tinder.discovery.badge.renderer.BadgeIconRenderer.BadgeIconRendererView;
import com.tinder.discovery.badge.renderer.BadgeIconRenderer.BadgePosition;
import com.tinder.utils.au;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0017J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0016J\b\u0010\u001e\u001a\u00020\u0018H\u0014J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J(\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0013H\u0014J\u0010\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020'H\u0016J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020'H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/tinder/discovery/view/DiscoveryNavigationView;", "Landroid/widget/ImageView;", "Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer$BadgeIconRendererView;", "Lcom/tinder/discovery/badge/Badgeable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "badgeIconRenderer", "Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer;", "value", "Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer$BadgePosition;", "badgePosition", "getBadgePosition", "()Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer$BadgePosition;", "setBadgePosition", "(Lcom/tinder/discovery/badge/renderer/BadgeIconRenderer$BadgePosition;)V", "selectedColor", "", "showBadgeAnimator", "Lcom/tinder/discovery/badge/animation/ShowBadgeAnimator;", "unselectedColor", "drawOnCanvasProxy", "", "canvas", "Landroid/graphics/Canvas;", "getSelectColor", "getUnselectedColor", "hideBadge", "onDetachedFromWindow", "onDraw", "onSizeChanged", "w", "h", "oldw", "oldh", "setActivated", "activated", "", "setSelected", "selected", "showBadge", "animate", "discovery_release"}, k = 1, mv = {1, 1, 10})
public final class DiscoveryNavigationView extends ImageView implements Badgeable, BadgeIconRendererView {
    /* renamed from: a */
    private final int f36039a;
    /* renamed from: b */
    private final int f36040b;
    /* renamed from: c */
    private final BadgeIconRenderer f36041c;
    /* renamed from: d */
    private final C8887a f36042d;
    @NotNull
    /* renamed from: e */
    private BadgePosition f36043e;

    public /* synthetic */ DiscoveryNavigationView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public DiscoveryNavigationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f36039a = au.c(this, C8873a.tinder_red);
        this.f36040b = au.c(this, C8873a.tinder_gray);
        this.f36042d = new C8887a(null, 1, null);
        this.f36043e = BadgePosition.RIGHT;
        int dimensionPixelSize = getResources().getDimensionPixelSize(C8874b.actionbar_indicator_radius);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C8874b.actionbar_indicator_stroke_radius) + dimensionPixelSize;
        BadgeIconRendererView badgeIconRendererView = this;
        int c = au.c(this, C8873a.white);
        int c2 = au.c(this, C8873a.tinder_red);
        attributeSet = getResources();
        C2668g.a(attributeSet, "resources");
        this.f36041c = new BadgeIconRenderer(badgeIconRendererView, dimensionPixelSize2, dimensionPixelSize, c, c2, attributeSet.getDisplayMetrics().density, null, null, 192, null);
        setScaleType(ScaleType.CENTER);
        setSelected(null);
    }

    @NotNull
    public final BadgePosition getBadgePosition() {
        return this.f36043e;
    }

    public final void setBadgePosition(@NotNull BadgePosition badgePosition) {
        C2668g.b(badgePosition, "value");
        this.f36043e = badgePosition;
        this.f36041c.m37689a(this.f36043e);
        invalidate();
    }

    public void showBadge(boolean z) {
        this.f36041c.m37692b(true);
        if (z) {
            this.f36042d.m37670a(this.f36041c);
        } else {
            this.f36042d.m37669a();
        }
        invalidate();
    }

    public void hideBadge() {
        this.f36041c.m37692b(false);
        this.f36042d.m37669a();
        invalidate();
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        if (z) {
            z = getSelectColor();
        } else {
            z = getUnselectedColor();
        }
        setColorFilter(z, Mode.SRC_ATOP);
    }

    public void setActivated(boolean z) {
        super.setActivated(z);
        this.f36041c.m37690a(z ^ 1);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        i3 = getDrawable();
        i4 = 0;
        i3 = i3 != 0 ? i3.getIntrinsicWidth() : 0;
        Drawable drawable = getDrawable();
        if (drawable != null) {
            i4 = drawable.getIntrinsicWidth();
        }
        this.f36041c.m37687a(i, i2, i3, i4);
    }

    protected void onDraw(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        this.f36041c.m37688a(canvas);
    }

    @SuppressLint({"WrongCall"})
    public void drawOnCanvasProxy(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        super.onDraw(canvas);
    }

    protected void onDetachedFromWindow() {
        this.f36042d.m37669a();
        super.onDetachedFromWindow();
    }

    private final int getSelectColor() {
        return this.f36039a;
    }

    private final int getUnselectedColor() {
        return this.f36040b;
    }
}
