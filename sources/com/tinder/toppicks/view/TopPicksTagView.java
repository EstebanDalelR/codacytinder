package com.tinder.toppicks.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J \u00100\u001a\u0002012\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u00104\u001a\u00020)H\u0002J\b\u00105\u001a\u000201H\u0002J\u0010\u00106\u001a\u0002012\u0006\u00107\u001a\u000208H\u0002J(\u00109\u001a\u0002012\u0006\u00107\u001a\u0002082\u0006\u0010:\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n2\u0006\u0010<\u001a\u00020\bH\u0002J\u0010\u0010=\u001a\u0002012\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010>\u001a\u00020?2\u0006\u0010;\u001a\u00020\nH\u0002J\u0006\u0010@\u001a\u000201J\u0010\u0010A\u001a\u0002012\u0006\u00107\u001a\u000208H\u0014J(\u0010B\u001a\u0002012\u0006\u0010C\u001a\u00020\u00152\u0006\u0010D\u001a\u00020\u00152\u0006\u0010E\u001a\u00020\u00152\u0006\u0010F\u001a\u00020\u0015H\u0014J\u0012\u0010G\u001a\u0002012\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u000e\u0010H\u001a\u0002012\u0006\u0010(\u001a\u00020)R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0012\u0010\rR\u001b\u0010\u0014\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001a\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001d\u0010\u0017R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010%\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b'\u0010\u000f\u001a\u0004\b&\u0010\u0017R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010*\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b,\u0010\u000f\u001a\u0004\b+\u0010\rR\u000e\u0010-\u001a\u00020.X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/tinder/toppicks/view/TopPicksTagView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "borderPaint", "Landroid/graphics/Paint;", "borderRadius", "", "borderWidth", "getBorderWidth", "()F", "borderWidth$delegate", "Lkotlin/Lazy;", "bottomBorderPaint", "fabWidth", "getFabWidth", "fabWidth$delegate", "goldColorOne", "", "getGoldColorOne", "()I", "goldColorOne$delegate", "goldColorThree", "getGoldColorThree", "goldColorThree$delegate", "goldColorTwo", "getGoldColorTwo", "goldColorTwo$delegate", "gradient", "Landroid/graphics/LinearGradient;", "gradientColors", "", "gradientPositions", "", "tagPlateColor", "getTagPlateColor", "tagPlateColor$delegate", "tagText", "", "tagTextSize", "getTagTextSize", "tagTextSize$delegate", "textPaint", "Landroid/text/TextPaint;", "whiteBorderPaint", "autoSizeText", "", "beginningTextSize", "desiredWidth", "text", "createGradient", "drawBorderView", "canvas", "Landroid/graphics/Canvas;", "drawRotatedRect", "degrees", "rectHeight", "paint", "drawTagText", "getOverlyLargeRect", "Landroid/graphics/RectF;", "hide", "onDraw", "onSizeChanged", "w", "h", "oldw", "oldh", "prepTextForDrawingIfNecessary", "showWithText", "toppicks_release"}, k = 1, mv = {1, 1, 10})
public final class TopPicksTagView extends View {
    /* renamed from: a */
    static final /* synthetic */ KProperty[] f47485a = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(TopPicksTagView.class), "tagTextSize", "getTagTextSize()F")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(TopPicksTagView.class), "borderWidth", "getBorderWidth()F")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(TopPicksTagView.class), "fabWidth", "getFabWidth()F")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(TopPicksTagView.class), "goldColorOne", "getGoldColorOne()I")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(TopPicksTagView.class), "goldColorTwo", "getGoldColorTwo()I")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(TopPicksTagView.class), "goldColorThree", "getGoldColorThree()I")), C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(TopPicksTagView.class), "tagPlateColor", "getTagPlateColor()I"))};
    /* renamed from: b */
    private final Lazy f47486b;
    /* renamed from: c */
    private final Lazy f47487c;
    /* renamed from: d */
    private final Lazy f47488d;
    /* renamed from: e */
    private final Lazy f47489e;
    /* renamed from: f */
    private final Lazy f47490f;
    /* renamed from: g */
    private final Lazy f47491g;
    /* renamed from: h */
    private final Lazy f47492h;
    /* renamed from: i */
    private final float f47493i;
    /* renamed from: j */
    private final int[] f47494j;
    /* renamed from: k */
    private final float[] f47495k;
    /* renamed from: l */
    private LinearGradient f47496l;
    /* renamed from: m */
    private final Paint f47497m;
    /* renamed from: n */
    private final Paint f47498n;
    /* renamed from: o */
    private final Paint f47499o;
    /* renamed from: p */
    private final TextPaint f47500p;
    /* renamed from: q */
    private String f47501q;

    private final float getBorderWidth() {
        Lazy lazy = this.f47487c;
        KProperty kProperty = f47485a[1];
        return ((Number) lazy.getValue()).floatValue();
    }

    private final float getFabWidth() {
        Lazy lazy = this.f47488d;
        KProperty kProperty = f47485a[2];
        return ((Number) lazy.getValue()).floatValue();
    }

    private final int getGoldColorOne() {
        Lazy lazy = this.f47489e;
        KProperty kProperty = f47485a[3];
        return ((Number) lazy.getValue()).intValue();
    }

    private final int getGoldColorThree() {
        Lazy lazy = this.f47491g;
        KProperty kProperty = f47485a[5];
        return ((Number) lazy.getValue()).intValue();
    }

    private final int getGoldColorTwo() {
        Lazy lazy = this.f47490f;
        KProperty kProperty = f47485a[4];
        return ((Number) lazy.getValue()).intValue();
    }

    private final int getTagPlateColor() {
        Lazy lazy = this.f47492h;
        KProperty kProperty = f47485a[6];
        return ((Number) lazy.getValue()).intValue();
    }

    private final float getTagTextSize() {
        Lazy lazy = this.f47486b;
        KProperty kProperty = f47485a[0];
        return ((Number) lazy.getValue()).floatValue();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TopPicksTagView(@org.jetbrains.annotations.NotNull android.content.Context r5, @org.jetbrains.annotations.Nullable android.util.AttributeSet r6) {
        /*
        r4 = this;
        r0 = "context";
        kotlin.jvm.internal.C2668g.b(r5, r0);
        r4.<init>(r5, r6);
        r6 = new com.tinder.toppicks.view.TopPicksTagView$tagTextSize$2;
        r6.<init>(r4);
        r6 = (kotlin.jvm.functions.Function0) r6;
        r6 = kotlin.C15810e.m59833a(r6);
        r4.f47486b = r6;
        r6 = new com.tinder.toppicks.view.TopPicksTagView$borderWidth$2;
        r6.<init>(r4);
        r6 = (kotlin.jvm.functions.Function0) r6;
        r6 = kotlin.C15810e.m59833a(r6);
        r4.f47487c = r6;
        r6 = new com.tinder.toppicks.view.TopPicksTagView$fabWidth$2;
        r6.<init>(r4);
        r6 = (kotlin.jvm.functions.Function0) r6;
        r6 = kotlin.C15810e.m59833a(r6);
        r4.f47488d = r6;
        r6 = new com.tinder.toppicks.view.TopPicksTagView$goldColorOne$2;
        r6.<init>(r5);
        r6 = (kotlin.jvm.functions.Function0) r6;
        r6 = kotlin.C15810e.m59833a(r6);
        r4.f47489e = r6;
        r6 = new com.tinder.toppicks.view.TopPicksTagView$goldColorTwo$2;
        r6.<init>(r5);
        r6 = (kotlin.jvm.functions.Function0) r6;
        r6 = kotlin.C15810e.m59833a(r6);
        r4.f47490f = r6;
        r6 = new com.tinder.toppicks.view.TopPicksTagView$goldColorThree$2;
        r6.<init>(r5);
        r6 = (kotlin.jvm.functions.Function0) r6;
        r6 = kotlin.C15810e.m59833a(r6);
        r4.f47491g = r6;
        r6 = new com.tinder.toppicks.view.TopPicksTagView$tagPlateColor$2;
        r6.<init>(r5);
        r6 = (kotlin.jvm.functions.Function0) r6;
        r6 = kotlin.C15810e.m59833a(r6);
        r4.f47492h = r6;
        r6 = r4.getResources();
        r0 = com.tinder.toppicks.C15235b.C15226b.rec_card_radius;
        r6 = r6.getDimensionPixelSize(r0);
        r6 = (float) r6;
        r4.f47493i = r6;
        r6 = 9;
        r0 = new int[r6];
        r1 = r4.getGoldColorOne();
        r2 = 0;
        r0[r2] = r1;
        r1 = r4.getGoldColorOne();
        r2 = 1;
        r0[r2] = r1;
        r1 = r4.getGoldColorTwo();
        r3 = 2;
        r0[r3] = r1;
        r1 = r4.getGoldColorOne();
        r3 = 3;
        r0[r3] = r1;
        r1 = r4.getGoldColorThree();
        r3 = 4;
        r0[r3] = r1;
        r1 = r4.getGoldColorOne();
        r3 = 5;
        r0[r3] = r1;
        r1 = r4.getGoldColorTwo();
        r3 = 6;
        r0[r3] = r1;
        r1 = r4.getGoldColorOne();
        r3 = 7;
        r0[r3] = r1;
        r1 = r4.getGoldColorOne();
        r3 = 8;
        r0[r3] = r1;
        r4.f47494j = r0;
        r6 = new float[r6];
        r6 = {0, 1035489772, 1043878380, 1050924810, 1056964608, 1059816735, 1062501089, 1063675494, 1065353216};
        r4.f47495k = r6;
        r6 = new android.graphics.Paint;
        r6.<init>();
        r0 = r4.getBorderWidth();
        r6.setStrokeWidth(r0);
        r0 = android.graphics.Paint.Style.STROKE;
        r6.setStyle(r0);
        r6.setAntiAlias(r2);
        r4.f47497m = r6;
        r6 = new android.graphics.Paint;
        r6.<init>();
        r0 = android.graphics.Paint.Style.FILL;
        r6.setStyle(r0);
        r6.setAntiAlias(r2);
        r4.f47498n = r6;
        r6 = new android.graphics.Paint;
        r6.<init>();
        r0 = r4.getTagPlateColor();
        r6.setColor(r0);
        r0 = android.graphics.Paint.Style.FILL;
        r6.setStyle(r0);
        r6.setAntiAlias(r2);
        r4.f47499o = r6;
        r6 = new android.text.TextPaint;
        r6.<init>();
        r0 = r4.getTagTextSize();
        r6.setTextSize(r0);
        r6.setAntiAlias(r2);
        r0 = -1098907648; // 0xffffffffbe800000 float:-0.25 double:NaN;
        r6.setTextSkewX(r0);
        r0 = com.tinder.toppicks.C15235b.C15228d.proximanova_extrabold;
        r5 = android.support.v4.content.res.C0441a.a(r5, r0);
        r6.setTypeface(r5);
        r4.f47500p = r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.toppicks.view.TopPicksTagView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public /* synthetic */ TopPicksTagView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    protected void onDraw(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f47496l == null) {
            m57465b();
        }
        m57463a(canvas);
        float height = ((float) getHeight()) / 1.26f;
        Paint paint = this.f47498n;
        paint.setShader(this.f47496l);
        m57464a(canvas, 9.0f, height, paint);
        m57464a(canvas, 5.5f, ((float) getHeight()) / 1.2f, this.f47499o);
        m57466b(canvas);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m57465b();
        m57467b(this.f47501q);
    }

    /* renamed from: a */
    public final void m57469a(@NotNull String str) {
        C2668g.b(str, "tagText");
        this.f47501q = str;
        m57467b(str);
        setVisibility(null);
    }

    /* renamed from: a */
    public final void m57468a() {
        setVisibility(8);
    }

    /* renamed from: b */
    private final void m57467b(String str) {
        if (getWidth() > 0) {
            float width = ((float) getWidth()) - getFabWidth();
            float tagTextSize = getTagTextSize();
            if (str == null) {
                C2668g.a();
            }
            m57462a(tagTextSize, width, str);
        }
    }

    /* renamed from: a */
    private final RectF m57461a(float f) {
        float f2 = (float) 2;
        return new RectF(-((float) getWidth()), f, ((float) getWidth()) * f2, ((float) getHeight()) * f2);
    }

    /* renamed from: a */
    private final void m57462a(float f, float f2, String str) {
        this.f47500p.setTextSize(f);
        Rect rect = new Rect();
        this.f47500p.getTextBounds(str, 0, str.length(), rect);
        f *= f2 / ((float) rect.width());
        if (f < this.f47500p.getTextSize()) {
            this.f47500p.setTextSize(f);
        }
    }

    /* renamed from: a */
    private final void m57463a(Canvas canvas) {
        this.f47497m.setShader(this.f47496l);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight()), this.f47493i, this.f47493i, this.f47497m);
    }

    /* renamed from: a */
    private final void m57464a(Canvas canvas, float f, float f2, Paint paint) {
        float f3 = (float) 2;
        float width = ((float) getWidth()) / f3;
        float height = ((float) getHeight()) / f3;
        int save = canvas.save();
        canvas.rotate(f, width, height);
        try {
            canvas.drawRect(m57461a(f2), paint);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: b */
    private final void m57465b() {
        float f = (float) 2;
        this.f47496l = new LinearGradient(0.0f, ((float) getHeight()) / f, (float) getWidth(), ((float) getHeight()) / f, this.f47494j, this.f47495k, TileMode.CLAMP);
    }

    /* renamed from: b */
    private final void m57466b(Canvas canvas) {
        m57467b(this.f47501q);
        float width = ((float) getWidth()) / 20.0f;
        float height = (((float) getHeight()) / 1.075f) + ((getTagTextSize() - this.f47500p.getTextSize()) / ((float) 2));
        this.f47500p.setShader(this.f47496l);
        canvas.drawText(this.f47501q, width, height, this.f47500p);
    }
}
