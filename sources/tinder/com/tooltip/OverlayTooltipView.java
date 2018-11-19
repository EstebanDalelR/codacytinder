package tinder.com.tooltip;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.FrameLayout;
import java.util.Arrays;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tinder.com.tooltip.Tooltip.AnchorGravity;
import tinder.com.tooltip.TooltipView.C19466a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004%&'(B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0011\u001a\u00020\u0012J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0002J \u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0014H\u0002J\u0018\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J\u001b\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\"H\u0000¢\u0006\u0002\b#J\u0006\u0010$\u001a\u00020 R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Ltinder/com/tooltip/OverlayTooltipView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onTooltipHideTriggeredListener", "Ltinder/com/tooltip/OverlayTooltipView$OnTooltipHideTriggeredListener;", "onTooltipViewShownListener", "Ltinder/com/tooltip/OverlayTooltipView$OnTooltipViewShownListener;", "overLayView", "Landroid/view/View;", "tooltipParams", "Ltinder/com/tooltip/OverlayTooltipView$TooltipParams;", "tooltipView", "Ltinder/com/tooltip/TooltipView;", "asDialog", "Ltinder/com/tooltip/OverlayTooltipDialog;", "calculateLeftForTooltip", "", "params", "tooltipWidth", "containerWidth", "calculateTooltipOffsetX", "", "leftForTooltip", "calculateTooltipTranslationY", "tooltipViewTop", "tooltipViewHeight", "createTooltipView", "hideTooltip", "", "onAnimationEnd", "Lkotlin/Function0;", "hideTooltip$tooltip_release", "showTooltip", "Builder", "OnTooltipHideTriggeredListener", "OnTooltipViewShownListener", "TooltipParams", "tooltip_release"}, k = 1, mv = {1, 1, 10})
public final class OverlayTooltipView extends FrameLayout {
    /* renamed from: a */
    private OnTooltipViewShownListener f60727a;
    /* renamed from: b */
    private OnTooltipHideTriggeredListener f60728b;
    /* renamed from: c */
    private TooltipView f60729c;
    /* renamed from: d */
    private final View f60730d;
    /* renamed from: e */
    private C19459b f60731e;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tH&¨\u0006\n"}, d2 = {"Ltinder/com/tooltip/OverlayTooltipView$OnTooltipHideTriggeredListener;", "", "onTooltipHideTriggered", "", "tooltipView", "Ltinder/com/tooltip/TooltipView;", "overlayView", "Landroid/view/View;", "onAnimationEnd", "Lkotlin/Function0;", "tooltip_release"}, k = 1, mv = {1, 1, 10})
    public interface OnTooltipHideTriggeredListener {
        void onTooltipHideTriggered(@NotNull TooltipView tooltipView, @NotNull View view, @NotNull Function0<C15813i> function0);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Ltinder/com/tooltip/OverlayTooltipView$OnTooltipViewShownListener;", "", "onTooltipViewShown", "", "tooltipView", "Ltinder/com/tooltip/TooltipView;", "overlayView", "Landroid/view/View;", "tooltip_release"}, k = 1, mv = {1, 1, 10})
    public interface OnTooltipViewShownListener {
        void onTooltipViewShown(@NotNull TooltipView tooltipView, @NotNull View view);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\bJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\bJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\rJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Ltinder/com/tooltip/OverlayTooltipView$Builder;", "", "context", "Landroid/content/Context;", "anchorGravity", "Ltinder/com/tooltip/Tooltip$AnchorGravity;", "(Landroid/content/Context;Ltinder/com/tooltip/Tooltip$AnchorGravity;)V", "anchorViewHeight", "", "anchorViewWidth", "anchorX", "anchorY", "backgroundGradientColors", "", "onTooltipHideTriggeredListener", "Ltinder/com/tooltip/OverlayTooltipView$OnTooltipHideTriggeredListener;", "onTooltipViewShownListener", "Ltinder/com/tooltip/OverlayTooltipView$OnTooltipViewShownListener;", "overlayColor", "overlayOffsetTop", "", "textColor", "textSizePx", "toolTipMessage", "", "tooltipTranslationYFactor", "anchorView", "Landroid/view/View;", "build", "Ltinder/com/tooltip/OverlayTooltipView;", "textSize", "tooltipGradientColors", "colors", "tooltipMessage", "tooltip_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: tinder.com.tooltip.OverlayTooltipView$a */
    public static final class C19458a {
        /* renamed from: a */
        private float f60695a;
        /* renamed from: b */
        private int f60696b;
        /* renamed from: c */
        private int f60697c;
        /* renamed from: d */
        private int f60698d;
        /* renamed from: e */
        private int f60699e;
        /* renamed from: f */
        private String f60700f = "";
        /* renamed from: g */
        private int f60701g;
        /* renamed from: h */
        private int[] f60702h = new int[]{-16777216, -1};
        /* renamed from: i */
        private int f60703i = -1;
        /* renamed from: j */
        private int f60704j;
        /* renamed from: k */
        private float f60705k;
        /* renamed from: l */
        private OnTooltipViewShownListener f60706l;
        /* renamed from: m */
        private OnTooltipHideTriggeredListener f60707m;
        /* renamed from: n */
        private final Context f60708n;
        /* renamed from: o */
        private final AnchorGravity f60709o;

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C19458a(@org.jetbrains.annotations.NotNull android.content.Context r2, @org.jetbrains.annotations.NotNull tinder.com.tooltip.Tooltip.AnchorGravity r3) {
            /*
            r1 = this;
            r0 = "context";
            kotlin.jvm.internal.C2668g.b(r2, r0);
            r0 = "anchorGravity";
            kotlin.jvm.internal.C2668g.b(r3, r0);
            r1.<init>();
            r1.f60708n = r2;
            r1.f60709o = r3;
            r2 = "";
            r1.f60700f = r2;
            r2 = 2;
            r2 = new int[r2];
            r2 = {-16777216, -1};
            r1.f60702h = r2;
            r2 = -1;
            r1.f60703i = r2;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: tinder.com.tooltip.OverlayTooltipView.a.<init>(android.content.Context, tinder.com.tooltip.Tooltip$AnchorGravity):void");
        }

        @NotNull
        /* renamed from: a */
        public final C19458a m70006a(@NotNull View view) {
            C2668g.b(view, "anchorView");
            C19458a c19458a = this;
            Point b = C19478g.m70100b(view);
            int i = b.x;
            int i2 = b.y;
            c19458a.f60695a = (float) i2;
            c19458a.f60696b = i;
            c19458a.f60697c = i2;
            c19458a.f60698d = view.getWidth();
            c19458a.f60699e = view.getHeight();
            return c19458a;
        }

        @NotNull
        /* renamed from: a */
        public final C19458a m70007a(@NotNull String str) {
            C2668g.b(str, "toolTipMessage");
            C19458a c19458a = this;
            c19458a.f60700f = str;
            return c19458a;
        }

        @NotNull
        /* renamed from: a */
        public final C19458a m70005a(int i) {
            C19458a c19458a = this;
            c19458a.f60701g = i;
            return c19458a;
        }

        @NotNull
        /* renamed from: a */
        public final C19458a m70010a(@NotNull int[] iArr) {
            C2668g.b(iArr, "colors");
            C19458a c19458a = this;
            c19458a.f60702h = iArr;
            return c19458a;
        }

        @NotNull
        /* renamed from: b */
        public final C19458a m70012b(int i) {
            C19458a c19458a = this;
            c19458a.f60703i = i;
            return c19458a;
        }

        @NotNull
        /* renamed from: c */
        public final C19458a m70013c(int i) {
            C19458a c19458a = this;
            c19458a.f60704j = i;
            return c19458a;
        }

        @NotNull
        /* renamed from: a */
        public final C19458a m70009a(@NotNull OnTooltipViewShownListener onTooltipViewShownListener) {
            C2668g.b(onTooltipViewShownListener, "onTooltipViewShownListener");
            C19458a c19458a = this;
            c19458a.f60706l = onTooltipViewShownListener;
            return c19458a;
        }

        @NotNull
        /* renamed from: a */
        public final C19458a m70008a(@NotNull OnTooltipHideTriggeredListener onTooltipHideTriggeredListener) {
            C2668g.b(onTooltipHideTriggeredListener, "onTooltipHideTriggeredListener");
            C19458a c19458a = this;
            c19458a.f60707m = onTooltipHideTriggeredListener;
            return c19458a;
        }

        @NotNull
        /* renamed from: a */
        public final C19458a m70004a(float f) {
            C19458a c19458a = this;
            c19458a.f60705k = f;
            return c19458a;
        }

        @NotNull
        /* renamed from: a */
        public final OverlayTooltipView m70011a() {
            OverlayTooltipView overlayTooltipView = new OverlayTooltipView(this.f60708n, null, 2, null);
            overlayTooltipView.f60727a = this.f60706l;
            overlayTooltipView.f60728b = this.f60707m;
            overlayTooltipView.f60731e = new C19459b(this.f60695a, this.f60696b, this.f60697c, this.f60698d, this.f60699e, this.f60700f, this.f60701g, this.f60702h, this.f60703i, this.f60704j, this.f60705k, this.f60709o);
            return overlayTooltipView;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0012HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0005HÖ\u0001J\t\u00106\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001f¨\u00067"}, d2 = {"Ltinder/com/tooltip/OverlayTooltipView$TooltipParams;", "", "overlayOffsetTop", "", "anchorX", "", "anchorY", "anchorViewWidth", "anchorViewHeight", "toolTipMessage", "", "overlayColor", "backgroundGradientColors", "", "textColor", "textSizePx", "tooltipTranslationYFactor", "anchorGravity", "Ltinder/com/tooltip/Tooltip$AnchorGravity;", "(FIIIILjava/lang/String;I[IIIFLtinder/com/tooltip/Tooltip$AnchorGravity;)V", "getAnchorGravity", "()Ltinder/com/tooltip/Tooltip$AnchorGravity;", "getAnchorViewHeight", "()I", "getAnchorViewWidth", "getAnchorX", "getAnchorY", "getBackgroundGradientColors", "()[I", "getOverlayColor", "getOverlayOffsetTop", "()F", "getTextColor", "getTextSizePx", "getToolTipMessage", "()Ljava/lang/String;", "getTooltipTranslationYFactor", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "tooltip_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: tinder.com.tooltip.OverlayTooltipView$b */
    public static final class C19459b {
        /* renamed from: a */
        private final float f60710a;
        /* renamed from: b */
        private final int f60711b;
        /* renamed from: c */
        private final int f60712c;
        /* renamed from: d */
        private final int f60713d;
        /* renamed from: e */
        private final int f60714e;
        @NotNull
        /* renamed from: f */
        private final String f60715f;
        /* renamed from: g */
        private final int f60716g;
        @NotNull
        /* renamed from: h */
        private final int[] f60717h;
        /* renamed from: i */
        private final int f60718i;
        /* renamed from: j */
        private final int f60719j;
        /* renamed from: k */
        private final float f60720k;
        @NotNull
        /* renamed from: l */
        private final AnchorGravity f60721l;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C19459b) {
                C19459b c19459b = (C19459b) obj;
                if (Float.compare(this.f60710a, c19459b.f60710a) == 0) {
                    if ((this.f60711b == c19459b.f60711b ? 1 : null) != null) {
                        if ((this.f60712c == c19459b.f60712c ? 1 : null) != null) {
                            if ((this.f60713d == c19459b.f60713d ? 1 : null) != null) {
                                if ((this.f60714e == c19459b.f60714e ? 1 : null) != null && C2668g.a(this.f60715f, c19459b.f60715f)) {
                                    if ((this.f60716g == c19459b.f60716g ? 1 : null) != null && C2668g.a(this.f60717h, c19459b.f60717h)) {
                                        if ((this.f60718i == c19459b.f60718i ? 1 : null) != null) {
                                            return (this.f60719j == c19459b.f60719j ? 1 : null) != null && Float.compare(this.f60720k, c19459b.f60720k) == 0 && C2668g.a(this.f60721l, c19459b.f60721l);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        public int hashCode() {
            int floatToIntBits = ((((((((Float.floatToIntBits(this.f60710a) * 31) + this.f60711b) * 31) + this.f60712c) * 31) + this.f60713d) * 31) + this.f60714e) * 31;
            String str = this.f60715f;
            int i = 0;
            floatToIntBits = (((floatToIntBits + (str != null ? str.hashCode() : 0)) * 31) + this.f60716g) * 31;
            int[] iArr = this.f60717h;
            floatToIntBits = (((((((floatToIntBits + (iArr != null ? Arrays.hashCode(iArr) : 0)) * 31) + this.f60718i) * 31) + this.f60719j) * 31) + Float.floatToIntBits(this.f60720k)) * 31;
            AnchorGravity anchorGravity = this.f60721l;
            if (anchorGravity != null) {
                i = anchorGravity.hashCode();
            }
            return floatToIntBits + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TooltipParams(overlayOffsetTop=");
            stringBuilder.append(this.f60710a);
            stringBuilder.append(", anchorX=");
            stringBuilder.append(this.f60711b);
            stringBuilder.append(", anchorY=");
            stringBuilder.append(this.f60712c);
            stringBuilder.append(", anchorViewWidth=");
            stringBuilder.append(this.f60713d);
            stringBuilder.append(", anchorViewHeight=");
            stringBuilder.append(this.f60714e);
            stringBuilder.append(", toolTipMessage=");
            stringBuilder.append(this.f60715f);
            stringBuilder.append(", overlayColor=");
            stringBuilder.append(this.f60716g);
            stringBuilder.append(", backgroundGradientColors=");
            stringBuilder.append(Arrays.toString(this.f60717h));
            stringBuilder.append(", textColor=");
            stringBuilder.append(this.f60718i);
            stringBuilder.append(", textSizePx=");
            stringBuilder.append(this.f60719j);
            stringBuilder.append(", tooltipTranslationYFactor=");
            stringBuilder.append(this.f60720k);
            stringBuilder.append(", anchorGravity=");
            stringBuilder.append(this.f60721l);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C19459b(float f, int i, int i2, int i3, int i4, @NotNull String str, int i5, @NotNull int[] iArr, int i6, int i7, float f2, @NotNull AnchorGravity anchorGravity) {
            C2668g.b(str, "toolTipMessage");
            C2668g.b(iArr, "backgroundGradientColors");
            C2668g.b(anchorGravity, "anchorGravity");
            this.f60710a = f;
            this.f60711b = i;
            this.f60712c = i2;
            this.f60713d = i3;
            this.f60714e = i4;
            this.f60715f = str;
            this.f60716g = i5;
            this.f60717h = iArr;
            this.f60718i = i6;
            this.f60719j = i7;
            this.f60720k = f2;
            this.f60721l = anchorGravity;
        }

        /* renamed from: a */
        public final int m70014a() {
            return this.f60711b;
        }

        /* renamed from: b */
        public final int m70015b() {
            return this.f60712c;
        }

        /* renamed from: c */
        public final int m70016c() {
            return this.f60713d;
        }

        /* renamed from: d */
        public final int m70017d() {
            return this.f60714e;
        }

        @NotNull
        /* renamed from: e */
        public final String m70018e() {
            return this.f60715f;
        }

        /* renamed from: f */
        public final int m70019f() {
            return this.f60716g;
        }

        @NotNull
        /* renamed from: g */
        public final int[] m70020g() {
            return this.f60717h;
        }

        /* renamed from: h */
        public final int m70021h() {
            return this.f60718i;
        }

        /* renamed from: i */
        public final int m70022i() {
            return this.f60719j;
        }

        /* renamed from: j */
        public final float m70023j() {
            return this.f60720k;
        }

        @NotNull
        /* renamed from: k */
        public final AnchorGravity m70024k() {
            return this.f60721l;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"tinder/com/tooltip/OverlayTooltipView$createTooltipView$2", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "(Ltinder/com/tooltip/OverlayTooltipView;Ltinder/com/tooltip/TooltipView;Ltinder/com/tooltip/OverlayTooltipView$TooltipParams;I)V", "onPreDraw", "", "tooltip_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: tinder.com.tooltip.OverlayTooltipView$c */
    public static final class C19460c implements OnPreDrawListener {
        /* renamed from: a */
        final /* synthetic */ OverlayTooltipView f60722a;
        /* renamed from: b */
        final /* synthetic */ TooltipView f60723b;
        /* renamed from: c */
        final /* synthetic */ C19459b f60724c;
        /* renamed from: d */
        final /* synthetic */ int f60725d;

        C19460c(OverlayTooltipView overlayTooltipView, TooltipView tooltipView, C19459b c19459b, int i) {
            this.f60722a = overlayTooltipView;
            this.f60723b = tooltipView;
            this.f60724c = c19459b;
            this.f60725d = i;
        }

        public boolean onPreDraw() {
            this.f60723b.getViewTreeObserver().removeOnPreDrawListener(this);
            float a = this.f60722a.m70035b(this.f60724c, C19478g.m70100b(this.f60723b).y, this.f60723b.getHeight());
            this.f60723b.setTranslationX((float) this.f60725d);
            this.f60723b.setTranslationY(a);
            OnTooltipViewShownListener a2 = this.f60722a.f60727a;
            if (a2 != null) {
                a2.onTooltipViewShown(this.f60723b, this.f60722a.f60730d);
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"tinder/com/tooltip/OverlayTooltipView$showTooltip$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "(Ltinder/com/tooltip/OverlayTooltipView;)V", "onPreDraw", "", "tooltip_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: tinder.com.tooltip.OverlayTooltipView$d */
    public static final class C19461d implements OnPreDrawListener {
        /* renamed from: a */
        final /* synthetic */ OverlayTooltipView f60726a;

        C19461d(OverlayTooltipView overlayTooltipView) {
            this.f60726a = overlayTooltipView;
        }

        public boolean onPreDraw() {
            if (!C19478g.m70102d(this.f60726a)) {
                return true;
            }
            this.f60726a.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f60726a.f60729c = this.f60726a.m70029a(OverlayTooltipView.m70036b(this.f60726a), this.f60726a.getWidth());
            this.f60726a.addView(this.f60726a.f60729c);
            return false;
        }
    }

    @NotNull
    /* renamed from: b */
    public static final /* synthetic */ C19459b m70036b(OverlayTooltipView overlayTooltipView) {
        overlayTooltipView = overlayTooltipView.f60731e;
        if (overlayTooltipView == null) {
            C2668g.b("tooltipParams");
        }
        return overlayTooltipView;
    }

    public /* synthetic */ OverlayTooltipView(Context context, AttributeSet attributeSet, int i, C15823e c15823e) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public OverlayTooltipView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        C2668g.b(context, "context");
        super(context, attributeSet);
        attributeSet = new View(context);
        attributeSet.setLayoutParams((LayoutParams) new FrameLayout.LayoutParams(-1, -1));
        this.f60730d = attributeSet;
        addView(this.f60730d);
    }

    /* renamed from: a */
    public final void m70039a() {
        View view = this.f60730d;
        C19459b c19459b = this.f60731e;
        if (c19459b == null) {
            C2668g.b("tooltipParams");
        }
        view.setBackgroundColor(c19459b.m70019f());
        getViewTreeObserver().addOnPreDrawListener(new C19461d(this));
    }

    /* renamed from: a */
    public final void m70040a(@NotNull Function0<C15813i> function0) {
        C2668g.b(function0, "onAnimationEnd");
        TooltipView tooltipView = this.f60729c;
        if (tooltipView != null) {
            OnTooltipHideTriggeredListener onTooltipHideTriggeredListener = this.f60728b;
            if (onTooltipHideTriggeredListener != null) {
                onTooltipHideTriggeredListener.onTooltipHideTriggered(tooltipView, this.f60730d, function0);
            }
        }
    }

    @NotNull
    /* renamed from: b */
    public final C19472b m70041b() {
        Context context = getContext();
        C2668g.a(context, "context");
        return new C19472b(context, this);
    }

    /* renamed from: a */
    private final TooltipView m70029a(C19459b c19459b, int i) {
        if ((i > 0 ? 1 : null) == null) {
            c19459b = new StringBuilder();
            c19459b.append("Check implementation, container width is:");
            c19459b.append(i);
            throw ((Throwable) new IllegalArgumentException(c19459b.toString().toString()));
        }
        Context context = getContext();
        C2668g.a(context, "context");
        TooltipView a = new C19466a(context).m70061a(c19459b.m70024k()).m70063a(c19459b.m70020g()).m70065b(i).m70060a(c19459b.m70018e()).m70059a(c19459b.m70021h()).m70058a((float) c19459b.m70022i()).m70062a(false).m70064a();
        i = m70027a(c19459b, a.getRealWidth(), i);
        a.setXOffset(m70025a(i, a.getRealWidth(), c19459b));
        a.getViewTreeObserver().addOnPreDrawListener(new C19460c(this, a, c19459b, i));
        return a;
    }

    /* renamed from: a */
    private final int m70027a(C19459b c19459b, int i, int i2) {
        c19459b = Math.max(null, (c19459b.m70014a() - (i / 2)) + (c19459b.m70016c() / 2));
        return c19459b + i >= i2 ? i2 - i : c19459b;
    }

    /* renamed from: a */
    private final float m70025a(int i, int i2, C19459b c19459b) {
        return ((float) (i + i2)) - (((float) c19459b.m70014a()) + (((float) c19459b.m70016c()) / 2.0f));
    }

    /* renamed from: b */
    private final float m70035b(C19459b c19459b, int i, int i2) {
        switch (C19473c.f60806a[c19459b.m70024k().ordinal()]) {
            case 1:
                return ((float) ((c19459b.m70015b() - i) + c19459b.m70017d())) - (((float) c19459b.m70017d()) * c19459b.m70023j());
            case 2:
                return ((float) ((c19459b.m70015b() - i) - i2)) - (((float) c19459b.m70017d()) * c19459b.m70023j());
            default:
                i2 = new StringBuilder();
                i2.append("An operation is not implemented: ");
                i2.append("OverlayTooltipView does not yet support the gravity you specified");
                throw ((Throwable) new NotImplementedError(i2.toString()));
        }
    }
}
