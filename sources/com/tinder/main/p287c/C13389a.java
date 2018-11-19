package com.tinder.main.p287c;

import android.animation.Animator.AnimatorListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.support.v4.content.C0432b;
import android.view.View;
import android.widget.ImageView;
import com.tinder.main.C9830c.C9816a;
import com.tinder.main.C9830c.C9817b;
import com.tinder.main.model.C9832a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\bH\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001b\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tinder/main/view/ImageMainTabIconView;", "Lcom/tinder/main/view/MainTabIconView;", "context", "Landroid/content/Context;", "homeTab", "Lcom/tinder/main/model/MainTabViewModel;", "(Landroid/content/Context;Lcom/tinder/main/model/MainTabViewModel;)V", "grayColor", "", "imageView", "Landroid/widget/ImageView;", "indicatorRadius", "indicatorStrokeWidth", "innerPaint", "Landroid/graphics/Paint;", "outerPaint", "redColor", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "getAnimListener", "Landroid/animation/Animator$AnimatorListener;", "isSelecting", "", "getSelectColor", "getUnselectedColor", "getViewToAnimate", "main_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.main.c.a */
public final class C13389a extends C11993b {
    /* renamed from: a */
    private final int f42449a;
    /* renamed from: b */
    private final int f42450b;
    /* renamed from: c */
    private final int f42451c;
    /* renamed from: d */
    private final int f42452d;
    /* renamed from: e */
    private final Paint f42453e = new Paint();
    /* renamed from: f */
    private final Paint f42454f;
    /* renamed from: g */
    private final ImageView f42455g;

    @Nullable
    /* renamed from: a */
    public AnimatorListener mo11151a(boolean z) {
        return null;
    }

    public C13389a(@NotNull Context context, @NotNull C9832a c9832a) {
        C2668g.b(context, "context");
        C2668g.b(c9832a, "homeTab");
        super(context);
        this.f42449a = context.getResources().getDimensionPixelSize(C9817b.actionbar_indicator_radius);
        this.f42450b = context.getResources().getDimensionPixelSize(C9817b.actionbar_indicator_stroke_radius);
        this.f42451c = C0432b.c(context, C9816a.tinder_red);
        this.f42452d = C0432b.c(context, C9816a.tinder_gray);
        setWillNotDraw(false);
        this.f42455g = new ImageView(context);
        this.f42455g.setContentDescription(getResources().getString(c9832a.m40443c()));
        this.f42455g.setImageResource(c9832a.m40442b());
        addView((View) this.f42455g);
        this.f42453e.setColor(-1);
        this.f42453e.setStyle(Style.FILL);
        this.f42454f = new Paint();
        this.f42454f.setStyle(Style.FILL);
        this.f42454f.setColor(this.f42451c);
        this.f42455g.setLayerPaint(this.f42454f);
    }

    protected void dispatchDraw(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (m48037e()) {
            Drawable drawable = this.f42455g.getDrawable();
            if (drawable != null) {
                float[] fArr = new float[9];
                this.f42455g.getImageMatrix().getValues(fArr);
                int round = Math.round(fArr[0] * ((float) drawable.getIntrinsicWidth()));
                float width = (float) (((getWidth() - round) / 2) + round);
                float f = (float) (this.f42450b + this.f42449a);
                canvas.drawCircle(width, f, f, this.f42453e);
                canvas.drawCircle(width, f, (float) this.f42449a, this.f42454f);
            }
        }
    }

    @NotNull
    public ImageView getViewToAnimate() {
        return this.f42455g;
    }

    public int getSelectColor() {
        return this.f42451c;
    }

    public int getUnselectedColor() {
        return this.f42452d;
    }
}
