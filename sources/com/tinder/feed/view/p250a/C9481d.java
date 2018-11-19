package com.tinder.feed.view.p250a;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.v4.content.res.C0441a;
import com.tinder.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/tinder/feed/view/extension/UnreadIndicatorConfig;", "", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "indicatorRadius", "", "getIndicatorRadius$Tinder_release", "()F", "indicatorStrokeWidth", "getIndicatorStrokeWidth$Tinder_release", "innerPaint", "Landroid/graphics/Paint;", "getInnerPaint$Tinder_release", "()Landroid/graphics/Paint;", "outerPaint", "getOuterPaint$Tinder_release", "totalRadius", "getTotalRadius$Tinder_release", "totalSize", "", "getTotalSize$Tinder_release", "()I", "Tinder_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.feed.view.a.d */
public final class C9481d {
    @NotNull
    /* renamed from: a */
    private final Paint f31786a = new Paint();
    @NotNull
    /* renamed from: b */
    private final Paint f31787b = new Paint();
    /* renamed from: c */
    private final float f31788c;
    /* renamed from: d */
    private final float f31789d;
    /* renamed from: e */
    private final float f31790e;
    /* renamed from: f */
    private final int f31791f;

    public C9481d(@NotNull Resources resources) {
        C2668g.b(resources, "resources");
        this.f31788c = resources.getDimension(R.dimen.actionbar_indicator_radius);
        this.f31789d = resources.getDimension(R.dimen.actionbar_indicator_stroke_radius);
        this.f31790e = this.f31789d + this.f31788c;
        this.f31791f = (int) (this.f31790e * ((float) 2));
        this.f31786a.setColor(-1);
        this.f31786a.setStyle(Style.FILL);
        this.f31786a.setAntiAlias(true);
        this.f31787b.setStyle(Style.FILL);
        this.f31787b.setColor(C0441a.b(resources, R.color.tinder_red, null));
        this.f31787b.setAntiAlias(true);
    }

    @NotNull
    /* renamed from: a */
    public final Paint m39650a() {
        return this.f31786a;
    }

    @NotNull
    /* renamed from: b */
    public final Paint m39651b() {
        return this.f31787b;
    }

    /* renamed from: c */
    public final float m39652c() {
        return this.f31788c;
    }

    /* renamed from: d */
    public final float m39653d() {
        return this.f31790e;
    }

    /* renamed from: e */
    public final int m39654e() {
        return this.f31791f;
    }
}
