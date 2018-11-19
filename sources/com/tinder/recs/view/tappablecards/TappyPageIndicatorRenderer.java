package com.tinder.recs.view.tappablecards;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.support.annotation.DimenRes;
import android.view.View;
import com.tinder.recs.C14694R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 -2\u00020\u0001:\u0001-B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0012\u0010\"\u001a\u00020\u000e2\b\b\u0001\u0010#\u001a\u00020\u0006H\u0002J\u0006\u0010$\u001a\u00020\u0006J\u0006\u0010%\u001a\u00020\u0006J \u0010\u0011\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000eH\u0002J\u000e\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u0006J\u000e\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u0006R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/tinder/recs/view/tappablecards/TappyPageIndicatorRenderer;", "", "parent", "Landroid/view/View;", "pageCountProvider", "Lkotlin/Function0;", "", "isPageActive", "Lkotlin/Function1;", "", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "activePaint", "Landroid/graphics/Paint;", "gapWidth", "", "gradientHeight", "gradientPaint", "horizontalLine", "Landroid/graphics/RectF;", "horizontalMargin", "inactivePaint", "()Lkotlin/jvm/functions/Function1;", "setPageActive", "(Lkotlin/jvm/functions/Function1;)V", "lineHeight", "getPageCountProvider", "()Lkotlin/jvm/functions/Function0;", "setPageCountProvider", "(Lkotlin/jvm/functions/Function0;)V", "verticalMargin", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getDimen", "id", "getHeight", "getWidth", "x", "y", "length", "setActivePage", "index", "setPageCount", "pageCount", "Companion", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
public final class TappyPageIndicatorRenderer {
    public static final Companion Companion = new Companion();
    private static final float SHADOW_RADIUS = 10.0f;
    private final Paint activePaint;
    private final float gapWidth;
    private final float gradientHeight;
    private final Paint gradientPaint;
    private final RectF horizontalLine;
    private final float horizontalMargin;
    private final Paint inactivePaint;
    @NotNull
    private Function1<? super Integer, Boolean> isPageActive;
    private final float lineHeight;
    @NotNull
    private Function0<Integer> pageCountProvider;
    private final View parent;
    private final float verticalMargin;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tinder/recs/view/tappablecards/TappyPageIndicatorRenderer$Companion;", "", "()V", "SHADOW_RADIUS", "", "recs-cards_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recs.view.tappablecards.TappyPageIndicatorRenderer$1 */
    static final class C187731 extends Lambda implements Function0<Integer> {
        public static final C187731 INSTANCE = new C187731();

        C187731() {
            super(0);
        }

        public final int invoke() {
            return 0;
        }

        /* renamed from: invoke */
        public /* synthetic */ Object m71748invoke() {
            return Integer.valueOf(invoke());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 10})
    /* renamed from: com.tinder.recs.view.tappablecards.TappyPageIndicatorRenderer$2 */
    static final class C187742 extends Lambda implements Function1<Integer, Boolean> {
        public static final C187742 INSTANCE = new C187742();

        C187742() {
            super(1);
        }

        public final boolean invoke(int i) {
            return false;
        }

        public /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke(((Number) obj).intValue()));
        }
    }

    public TappyPageIndicatorRenderer(@NotNull View view, @NotNull Function0<Integer> function0, @NotNull Function1<? super Integer, Boolean> function1) {
        C2668g.b(view, "parent");
        C2668g.b(function0, "pageCountProvider");
        C2668g.b(function1, "isPageActive");
        this.parent = view;
        this.pageCountProvider = function0;
        this.isPageActive = function1;
        this.verticalMargin = getDimen(C14694R.dimen.tappy_indicator_top_margin);
        this.horizontalMargin = getDimen(C14694R.dimen.tappy_indicator_bottom_margin);
        this.gapWidth = getDimen(C14694R.dimen.tappy_indicator_gap_width);
        this.lineHeight = getDimen(C14694R.dimen.tappy_indicator_line_height);
        this.gradientHeight = getDimen(C14694R.dimen.tappy_indicator_gradient_height);
        this.horizontalLine = new RectF();
        view = new Paint(1);
        view.setColor(-1);
        view.setShadowLayer(SHADOW_RADIUS, 0.0f, 0.2f, Color.argb(40, 0, 0, 0));
        this.activePaint = view;
        view = new Paint(1);
        view.setColor(Color.argb(40, 0, 0, 0));
        this.inactivePaint = view;
        view = new Paint(1);
        view.setShader((Shader) new LinearGradient(0.0f, 0.0f, 0.0f, this.gradientHeight, Color.argb(30, 0, 0, 0), 0, TileMode.CLAMP));
        this.gradientPaint = view;
    }

    public /* synthetic */ TappyPageIndicatorRenderer(View view, Function0 function0, Function1 function1, int i, C15823e c15823e) {
        if ((i & 2) != null) {
            function0 = C187731.INSTANCE;
        }
        if ((i & 4) != 0) {
            function1 = C187742.INSTANCE;
        }
        this(view, function0, function1);
    }

    @NotNull
    public final Function0<Integer> getPageCountProvider() {
        return this.pageCountProvider;
    }

    public final void setPageCountProvider(@NotNull Function0<Integer> function0) {
        C2668g.b(function0, "<set-?>");
        this.pageCountProvider = function0;
    }

    @NotNull
    public final Function1<Integer, Boolean> isPageActive() {
        return this.isPageActive;
    }

    public final void setPageActive(@NotNull Function1<? super Integer, Boolean> function1) {
        C2668g.b(function1, "<set-?>");
        this.isPageActive = function1;
    }

    public final void draw(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        int intValue = ((Number) this.pageCountProvider.invoke()).intValue();
        if (intValue != 0) {
            float f = (float) 2;
            float width = (float) this.parent.getWidth();
            float f2 = (width - ((((float) (intValue - 1)) * this.gapWidth) + (this.horizontalMargin * f))) / ((float) intValue);
            float top = ((float) this.parent.getTop()) + this.verticalMargin;
            canvas.drawRect(0.0f, 0.0f, width, this.gradientHeight, this.gradientPaint);
            for (int i = 0; i < intValue; i++) {
                RectF horizontalLine = horizontalLine((((float) i) * (this.gapWidth + f2)) + this.horizontalMargin, top, f2);
                float height = horizontalLine.height() / f;
                canvas.drawRoundRect(horizontalLine, height, height, ((Boolean) this.isPageActive.invoke(Integer.valueOf(i))).booleanValue() ? this.activePaint : this.inactivePaint);
            }
        }
    }

    public final int getWidth() {
        return this.parent.getWidth();
    }

    public final int getHeight() {
        return (int) ((this.lineHeight + this.gradientHeight) + (((float) 2) * this.verticalMargin));
    }

    public final void setPageCount(int i) {
        this.pageCountProvider = new TappyPageIndicatorRenderer$setPageCount$1(i);
    }

    public final void setActivePage(int i) {
        this.isPageActive = new TappyPageIndicatorRenderer$setActivePage$1(i);
    }

    private final RectF horizontalLine(float f, float f2, float f3) {
        RectF rectF = this.horizontalLine;
        rectF.set(f, f2, f3 + f, this.lineHeight + f2);
        return rectF;
    }

    private final float getDimen(@DimenRes int i) {
        return this.parent.getResources().getDimension(i);
    }
}
