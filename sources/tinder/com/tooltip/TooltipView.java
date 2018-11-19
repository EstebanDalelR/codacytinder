package tinder.com.tooltip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.support.annotation.FloatRange;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tinder.api.ManagerWebServices;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C15824f;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Observable;
import rx.Subscription;
import rx.functions.Action1;
import rx.p494a.p496b.C19397a;
import tinder.com.tooltip.C19475d.C19474a;
import tinder.com.tooltip.Tooltip.AnchorGravity;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 p2\u00020\u0001:\u0004opqrB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J@\u0010V\u001a\u00020W2\u0006\u0010+\u001a\u00020,2\u0006\u0010X\u001a\u00020'2\u0006\u0010Y\u001a\u00020'2\u0006\u0010Z\u001a\u00020'2\u0006\u0010[\u001a\u00020'2\u0006\u0010\\\u001a\u00020'2\u0006\u0010]\u001a\u00020'H\u0002J\b\u0010^\u001a\u00020WH\u0002J\b\u0010_\u001a\u00020WH\u0002J8\u0010`\u001a\u00020,2\u0006\u0010Z\u001a\u00020'2\u0006\u0010[\u001a\u00020'2\u0006\u0010\\\u001a\u00020'2\u0006\u0010]\u001a\u00020'2\u0006\u0010a\u001a\u00020'2\u0006\u0010b\u001a\u00020'H\u0002J\u0010\u0010c\u001a\u00020W2\u0006\u0010d\u001a\u00020eH\u0002J\b\u0010f\u001a\u00020\u000fH\u0002J\u0010\u0010g\u001a\u00020W2\u0006\u0010X\u001a\u00020'H\u0002J\b\u0010h\u001a\u00020WH\u0014J\b\u0010i\u001a\u00020WH\u0014J\u0010\u0010j\u001a\u00020W2\u0006\u0010d\u001a\u00020eH\u0014J\u0018\u0010k\u001a\u00020W2\u0006\u0010l\u001a\u00020\u00192\u0006\u0010m\u001a\u00020\u0019H\u0014J\b\u0010n\u001a\u00020WH\u0002R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0004¢\u0006\u0002\n\u0000R$\u0010.\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u0019@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010\u001dR$\u00101\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u0019@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001b\"\u0004\b3\u0010\u001dR\u001a\u00104\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001b\"\u0004\b6\u0010\u001dR\u000e\u00107\u001a\u00020,X\u0004¢\u0006\u0002\n\u0000R(\u00109\u001a\u0004\u0018\u0001082\b\u0010\u0007\u001a\u0004\u0018\u000108@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001b\"\u0004\b@\u0010\u001dR\u001a\u0010A\u001a\u00020BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0014\u0010G\u001a\b\u0018\u00010HR\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000R$\u0010J\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020'@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u000e\u0010O\u001a\u00020PX\u000e¢\u0006\u0002\n\u0000R$\u0010Q\u001a\u00020'2\u0006\u0010\u0007\u001a\u00020'@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010L\"\u0004\bS\u0010NR\u000e\u0010T\u001a\u00020'X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020'X\u000e¢\u0006\u0002\n\u0000¨\u0006s"}, d2 = {"Ltinder/com/tooltip/TooltipView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "Ltinder/com/tooltip/Tooltip$AnchorGravity;", "anchorGravity", "getAnchorGravity$tooltip_release", "()Ltinder/com/tooltip/Tooltip$AnchorGravity;", "setAnchorGravity$tooltip_release", "(Ltinder/com/tooltip/Tooltip$AnchorGravity;)V", "animate", "", "getAnimate$tooltip_release", "()Z", "setAnimate$tooltip_release", "(Z)V", "animateBounceSubscription", "Lrx/Subscription;", "backgroundPaint", "Landroid/graphics/Paint;", "backgroundPaintColor", "", "getBackgroundPaintColor$tooltip_release", "()I", "setBackgroundPaintColor$tooltip_release", "(I)V", "gradient", "Landroid/graphics/Shader;", "gradientColors", "", "getGradientColors$tooltip_release", "()[I", "setGradientColors$tooltip_release", "([I)V", "maxWidth", "", "minMargin", "offset", "offsetInitialized", "path", "Landroid/graphics/Path;", "<set-?>", "realHeight", "getRealHeight", "setRealHeight", "realWidth", "getRealWidth", "setRealWidth", "rootWidth", "getRootWidth$tooltip_release", "setRootWidth$tooltip_release", "roundedRectPath", "", "text", "getText$tooltip_release", "()Ljava/lang/String;", "setText$tooltip_release", "(Ljava/lang/String;)V", "textColor", "getTextColor$tooltip_release", "setTextColor$tooltip_release", "textPaint", "Landroid/text/TextPaint;", "getTextPaint$tooltip_release", "()Landroid/text/TextPaint;", "setTextPaint$tooltip_release", "(Landroid/text/TextPaint;)V", "textRenderer", "Ltinder/com/tooltip/TooltipView$TextRenderer;", "tooltipSize", "tooltipTextSize", "getTooltipTextSize$tooltip_release", "()F", "setTooltipTextSize$tooltip_release", "(F)V", "translateState", "Ltinder/com/tooltip/TooltipView$TranslateState;", "xOffset", "getXOffset", "setXOffset", "xTextOffsetMultiplier", "xWidthOffsetMultiplier", "addTooltipToPath", "", "width", "height", "left", "top", "right", "bottom", "animateTranslateDefault", "animateTranslateDown", "createRoundedRect", "radiusX", "radiusY", "drawBackgroundPath", "canvas", "Landroid/graphics/Canvas;", "hasLeftOrRightGravity", "initializeXOffsetIfNecessary", "onAttachedToWindow", "onDetachedFromWindow", "onDraw", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "startAnimationSubscription", "Builder", "Companion", "TextRenderer", "TranslateState", "tooltip_release"}, k = 1, mv = {1, 1, 10})
public final class TooltipView extends View {
    /* renamed from: a */
    public static final C19467b f60772a = new C19467b();
    /* renamed from: A */
    private int f60773A;
    /* renamed from: b */
    private float f60774b;
    /* renamed from: c */
    private float f60775c;
    /* renamed from: d */
    private TranslateState f60776d;
    /* renamed from: e */
    private boolean f60777e;
    /* renamed from: f */
    private final float f60778f;
    /* renamed from: g */
    private final float f60779g;
    /* renamed from: h */
    private final float f60780h;
    /* renamed from: i */
    private final float f60781i;
    /* renamed from: j */
    private final Path f60782j;
    /* renamed from: k */
    private final Path f60783k;
    /* renamed from: l */
    private final Paint f60784l;
    /* renamed from: m */
    private Shader f60785m;
    /* renamed from: n */
    private Subscription f60786n;
    /* renamed from: o */
    private C19468c f60787o;
    /* renamed from: p */
    private int f60788p;
    @Nullable
    /* renamed from: q */
    private int[] f60789q;
    /* renamed from: r */
    private int f60790r;
    /* renamed from: s */
    private int f60791s;
    /* renamed from: t */
    private boolean f60792t;
    /* renamed from: u */
    private float f60793u;
    @NotNull
    /* renamed from: v */
    private AnchorGravity f60794v;
    @Nullable
    /* renamed from: w */
    private String f60795w;
    @NotNull
    /* renamed from: x */
    private TextPaint f60796x;
    /* renamed from: y */
    private float f60797y;
    /* renamed from: z */
    private int f60798z;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Ltinder/com/tooltip/TooltipView$TranslateState;", "", "(Ljava/lang/String;I)V", "DOWN", "DEFAULT", "tooltip_release"}, k = 1, mv = {1, 1, 10})
    private enum TranslateState {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\bJ\u0010\u0010\u0011\u001a\u00020\u00002\b\b\u0001\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Ltinder/com/tooltip/TooltipView$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "animate", "", "backgroundColor", "", "gradientColors", "", "gravity", "Ltinder/com/tooltip/Tooltip$AnchorGravity;", "rootViewWidth", "text", "", "textColor", "textSize", "", "backgroundGradientColors", "build", "Ltinder/com/tooltip/TooltipView;", "tooltip_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: tinder.com.tooltip.TooltipView$a */
    public static final class C19466a {
        /* renamed from: a */
        private AnchorGravity f60761a = AnchorGravity.BOTTOM;
        /* renamed from: b */
        private int f60762b = -1;
        /* renamed from: c */
        private int f60763c = -1;
        /* renamed from: d */
        private float f60764d = C15824f.f49024a.a();
        /* renamed from: e */
        private int[] f60765e;
        /* renamed from: f */
        private String f60766f = "";
        /* renamed from: g */
        private int f60767g;
        /* renamed from: h */
        private boolean f60768h;
        /* renamed from: i */
        private final Context f60769i;

        public C19466a(@NotNull Context context) {
            C2668g.b(context, "context");
            this.f60769i = context;
        }

        @NotNull
        /* renamed from: a */
        public final C19466a m70061a(@NotNull AnchorGravity anchorGravity) {
            C2668g.b(anchorGravity, "gravity");
            C19466a c19466a = this;
            c19466a.f60761a = anchorGravity;
            return c19466a;
        }

        @NotNull
        /* renamed from: a */
        public final C19466a m70063a(@NotNull int[] iArr) {
            C2668g.b(iArr, "gradientColors");
            C19466a c19466a = this;
            c19466a.f60765e = iArr;
            return c19466a;
        }

        @NotNull
        /* renamed from: a */
        public final C19466a m70060a(@NotNull String str) {
            C2668g.b(str, ManagerWebServices.PARAM_TEXT);
            C19466a c19466a = this;
            c19466a.f60766f = str;
            return c19466a;
        }

        @NotNull
        /* renamed from: a */
        public final C19466a m70059a(int i) {
            C19466a c19466a = this;
            c19466a.f60763c = i;
            return c19466a;
        }

        @NotNull
        /* renamed from: a */
        public final C19466a m70058a(@FloatRange(from = 0.0d) float f) {
            C19466a c19466a = this;
            c19466a.f60764d = f;
            return c19466a;
        }

        @NotNull
        /* renamed from: b */
        public final C19466a m70065b(int i) {
            C19466a c19466a = this;
            c19466a.f60767g = i;
            return c19466a;
        }

        @NotNull
        /* renamed from: a */
        public final C19466a m70062a(boolean z) {
            C19466a c19466a = this;
            c19466a.f60768h = z;
            return c19466a;
        }

        @NotNull
        /* renamed from: a */
        public final TooltipView m70064a() {
            TooltipView tooltipView = new TooltipView(this.f60769i, null, 2, null);
            tooltipView.setAnchorGravity$tooltip_release(this.f60761a);
            tooltipView.setGradientColors$tooltip_release(this.f60765e);
            tooltipView.setBackgroundPaintColor$tooltip_release(this.f60762b);
            tooltipView.setGradientColors$tooltip_release(this.f60765e);
            tooltipView.setRootWidth$tooltip_release(this.f60767g);
            tooltipView.setText$tooltip_release(this.f60766f);
            tooltipView.setTextColor$tooltip_release(this.f60763c);
            tooltipView.setTooltipTextSize$tooltip_release(this.f60764d);
            tooltipView.setAnimate$tooltip_release(this.f60768h);
            return tooltipView;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Ltinder/com/tooltip/TooltipView$Companion;", "", "()V", "BOUNCE_INTERVAL", "", "DEFAULT_TRANSLATION", "", "LINE_SPACING_ADD", "LINE_SPACING_MULTIPLIER", "MINIMUM_X_OFFSET_MULTIPLIER", "TEXT_OFFSET_MULTIPLIER", "X_PADDING_MULTIPLIER", "Y_OFFSET", "Y_PADDING_MULTIPLIER", "tooltip_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: tinder.com.tooltip.TooltipView$b */
    public static final class C19467b {
        private C19467b() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Ltinder/com/tooltip/TooltipView$TextRenderer;", "", "text", "", "(Ltinder/com/tooltip/TooltipView;Ljava/lang/String;)V", "textLayout", "Landroid/text/StaticLayout;", "calculateOptimalTextWidth", "", "padding", "", "calculateRealHeight", "textHeight", "calculateRealWidth", "textWidth", "draw", "", "canvas", "Landroid/graphics/Canvas;", "draw$tooltip_release", "tooltip_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: tinder.com.tooltip.TooltipView$c */
    public final class C19468c {
        /* renamed from: a */
        final /* synthetic */ TooltipView f60770a;
        /* renamed from: b */
        private final StaticLayout f60771b;

        /* renamed from: b */
        private final int m70068b(int i, float f) {
            return i + ((int) f);
        }

        public C19468c(TooltipView tooltipView, @NotNull String str) {
            C2668g.b(str, ManagerWebServices.PARAM_TEXT);
            this.f60770a = tooltipView;
            float d = tooltipView.f60780h * 2.0f;
            int a = m70067a(str, d);
            tooltipView.f60798z = m70066a(a, d);
            this.f60771b = new StaticLayout(str, 0, str.length(), tooltipView.getTextPaint$tooltip_release(), a, Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            tooltipView.f60773A = m70068b(this.f60771b.getHeight(), tooltipView.f60780h * 3.0f);
        }

        /* renamed from: a */
        private final int m70067a(String str, float f) {
            return (int) Math.min(Math.min(this.f60770a.getTextPaint$tooltip_release().measureText(str), this.f60770a.f60779g - (this.f60770a.f60774b * f)), ((float) this.f60770a.getRootWidth$tooltip_release()) - (f * this.f60770a.f60774b));
        }

        /* renamed from: a */
        private final int m70066a(int i, float f) {
            return (int) (((float) i) + (f * this.f60770a.f60775c));
        }

        /* renamed from: a */
        public final void m70069a(@NotNull Canvas canvas) {
            C2668g.b(canvas, "canvas");
            canvas.save();
            canvas.translate(this.f60770a.f60780h * this.f60770a.f60774b, this.f60770a.f60780h * 1.5f);
            this.f60771b.draw(canvas);
            canvas.restore();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "call", "(Ljava/lang/Long;)V"}, k = 3, mv = {1, 1, 10})
    /* renamed from: tinder.com.tooltip.TooltipView$d */
    static final class C19863d<T> implements Action1<Long> {
        /* renamed from: a */
        final /* synthetic */ TooltipView f62146a;

        C19863d(TooltipView tooltipView) {
            this.f62146a = tooltipView;
        }

        public /* synthetic */ void call(Object obj) {
            m71485a((Long) obj);
        }

        /* renamed from: a */
        public final void m71485a(Long l) {
            if (this.f62146a.f60776d == TranslateState.DEFAULT) {
                this.f62146a.m70072a();
                this.f62146a.f60776d = TranslateState.DOWN;
                return;
            }
            this.f62146a.m70079b();
            this.f62146a.f60776d = TranslateState.DEFAULT;
        }
    }

    public /* synthetic */ TooltipView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public TooltipView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        this.f60774b = 0.5f;
        this.f60775c = 1.0f;
        this.f60776d = TranslateState.DEFAULT;
        this.f60778f = C19478g.m70096a((View) this, C19474a.min_margin);
        this.f60779g = C19478g.m70096a((View) this, C19474a.tooltip_max_width);
        this.f60780h = C19478g.m70096a((View) this, C19474a.tooltip_offset);
        this.f60781i = C19478g.m70096a((View) this, C19474a.tooltip_size);
        this.f60782j = new Path();
        this.f60783k = new Path();
        this.f60784l = new Paint(1);
        this.f60788p = -1;
        this.f60790r = -1;
        this.f60792t = true;
        this.f60793u = C19478g.m70096a((View) this, C19474a.tooltip_text_size);
        this.f60794v = AnchorGravity.TOP;
        context = new TextPaint(1);
        context.setColor(this.f60788p);
        context.setTextSize(this.f60793u);
        this.f60796x = context;
        this.f60797y = C15824f.f49024a.a();
    }

    public final int getTextColor$tooltip_release() {
        return this.f60788p;
    }

    public final void setTextColor$tooltip_release(int i) {
        this.f60788p = i;
    }

    @Nullable
    public final int[] getGradientColors$tooltip_release() {
        return this.f60789q;
    }

    public final void setGradientColors$tooltip_release(@Nullable int[] iArr) {
        this.f60789q = iArr;
    }

    public final int getBackgroundPaintColor$tooltip_release() {
        return this.f60790r;
    }

    public final void setBackgroundPaintColor$tooltip_release(int i) {
        this.f60790r = i;
    }

    public final int getRootWidth$tooltip_release() {
        return this.f60791s;
    }

    public final void setRootWidth$tooltip_release(int i) {
        this.f60791s = i;
    }

    public final boolean getAnimate$tooltip_release() {
        return this.f60792t;
    }

    public final void setAnimate$tooltip_release(boolean z) {
        this.f60792t = z;
    }

    public final float getTooltipTextSize$tooltip_release() {
        return this.f60793u;
    }

    public final void setTooltipTextSize$tooltip_release(float f) {
        if (f != C15824f.f49024a.a()) {
            this.f60793u = f;
        }
    }

    @NotNull
    public final AnchorGravity getAnchorGravity$tooltip_release() {
        return this.f60794v;
    }

    public final void setAnchorGravity$tooltip_release(@NotNull AnchorGravity anchorGravity) {
        C2668g.b(anchorGravity, "value");
        this.f60794v = anchorGravity;
        float f = 1.0f;
        this.f60774b = this.f60794v == AnchorGravity.RIGHT ? 1069547520 : 1065353216;
        if (m70084d() != null) {
            f = 1.5f;
        }
        this.f60775c = f;
    }

    @Nullable
    public final String getText$tooltip_release() {
        return this.f60795w;
    }

    public final void setText$tooltip_release(@Nullable String str) {
        this.f60795w = str;
        if (str != null) {
            this.f60787o = new C19468c(this, str);
        }
    }

    @NotNull
    public final TextPaint getTextPaint$tooltip_release() {
        return this.f60796x;
    }

    public final void setTextPaint$tooltip_release(@NotNull TextPaint textPaint) {
        C2668g.b(textPaint, "<set-?>");
        this.f60796x = textPaint;
    }

    public final float getXOffset() {
        return this.f60797y;
    }

    public final void setXOffset(float f) {
        this.f60797y = f;
        this.f60777e = false;
        invalidate();
    }

    private final void setRealWidth(int i) {
        this.f60798z = i;
    }

    public final int getRealWidth() {
        return this.f60798z;
    }

    private final void setRealHeight(int i) {
        this.f60773A = i;
    }

    public final int getRealHeight() {
        return this.f60773A;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f60792t) {
            m70082c();
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Subscription subscription = this.f60786n;
        if (subscription != null) {
            subscription.unsubscribe();
        }
    }

    protected void onDraw(@NotNull Canvas canvas) {
        C2668g.b(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f60785m != null || this.f60789q == null) {
            this.f60784l.setColor(this.f60790r);
        } else {
            this.f60785m = new LinearGradient(0.0f, 0.0f, (float) this.f60798z, (float) this.f60773A, this.f60789q, null, TileMode.MIRROR);
            this.f60784l.setShader(this.f60785m);
        }
        m70074a(canvas);
        C19468c c19468c = this.f60787o;
        if (c19468c != null) {
            c19468c.m70069a(canvas);
        }
    }

    /* renamed from: a */
    private final void m70074a(Canvas canvas) {
        this.f60782j.reset();
        float f = (float) this.f60773A;
        float f2 = (float) this.f60798z;
        float f3 = this.f60794v == AnchorGravity.RIGHT ? r8.f60780h : r8.f60778f;
        float f4 = f2 - (r8.f60794v == AnchorGravity.LEFT ? r8.f60780h : r8.f60778f);
        float f5 = r8.f60780h;
        float f6 = f - r8.f60780h;
        float f7 = r8.f60780h;
        m70073a(f2);
        r8.f60782j.addPath(m70071a(f3, f5, f4, f6, f7, f7));
        m70075a(r8.f60782j, f2, f, f3, f5, f4, f6);
        r8.f60782j.close();
        canvas.drawPath(r8.f60782j, r8.f60784l);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(MeasureSpec.makeMeasureSpec(this.f60798z, 1073741824), MeasureSpec.makeMeasureSpec(this.f60773A, 1073741824));
    }

    /* renamed from: a */
    private final void m70072a() {
        animate().setDuration(500).translationY(15.0f).start();
    }

    /* renamed from: b */
    private final void m70079b() {
        animate().setDuration(500).translationY(0.0f).start();
    }

    /* renamed from: c */
    private final void m70082c() {
        this.f60786n = Observable.m69612a(500, TimeUnit.MILLISECONDS, C19397a.m69785a()).m69691d((Action1) new C19863d(this));
    }

    /* renamed from: d */
    private final boolean m70084d() {
        if (this.f60794v != AnchorGravity.LEFT) {
            if (this.f60794v != AnchorGravity.RIGHT) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private final Path m70071a(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = (float) 2;
        f = (f3 - f) - (f7 * f5);
        f4 = (f4 - f2) - (f7 * f6);
        Path path = this.f60783k;
        path.reset();
        path.moveTo(f3, f2 + f6);
        f2 = -f6;
        f3 = -f5;
        path.rQuadTo(0.0f, f2, f3, f2);
        path.rLineTo(-f, 0.0f);
        path.rQuadTo(f3, 0.0f, f3, f6);
        path.rLineTo(0.0f, f4);
        path.rQuadTo(0.0f, f6, f5, f6);
        path.rLineTo(f, 0.0f);
        path.rQuadTo(f5, 0.0f, f5, f2);
        path.rLineTo(0.0f, -f4);
        return path;
    }

    /* renamed from: a */
    private final void m70075a(Path path, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f2 / 2.0f;
        switch (C19477f.f60808a[this.f60794v.ordinal()]) {
            case 1:
                path.moveTo(f5, f7 - this.f60781i);
                path.lineTo(f - this.f60781i, f7);
                path.lineTo(f5, f7 + this.f60781i);
                return;
            case 2:
                path.moveTo(f3, f7 - this.f60781i);
                path.lineTo(this.f60781i, f7);
                path.lineTo(f3, f7 + this.f60781i);
                return;
            case 3:
                path.moveTo(this.f60797y - this.f60781i, f6);
                path.lineTo(this.f60797y, f2 - this.f60781i);
                path.lineTo(this.f60797y + this.f60781i, f6);
                return;
            case 4:
                path.moveTo(this.f60797y - this.f60781i, f4);
                path.lineTo(this.f60797y, this.f60781i);
                path.lineTo(this.f60797y + this.f60781i, f4);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private final void m70073a(float f) {
        if (!this.f60777e) {
            float f2 = f / 2.0f;
            if (this.f60797y == C15824f.f49024a.a()) {
                setXOffset(f2);
            }
            setXOffset(f - this.f60797y);
            f = this.f60780h * 1.6f;
            if (this.f60797y <= f) {
                setXOffset(f);
            }
            this.f60777e = true;
        }
    }
}
