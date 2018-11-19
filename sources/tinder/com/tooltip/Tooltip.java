package tinder.com.tooltip;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.ColorInt;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C15824f;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tinder.com.tooltip.C19475d.C19474a;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004 !\"#Bo\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u001eH\u0016R\u000e\u0010\u0019\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Ltinder/com/tooltip/Tooltip;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "gravity", "Ltinder/com/tooltip/Tooltip$AnchorGravity;", "backgroundColor", "", "gradientColors", "", "text", "", "textColor", "textSize", "", "animate", "", "duration", "", "viewPositions", "Ltinder/com/tooltip/Tooltip$ViewPositions;", "shouldCancelWhenTouchOutside", "onClickListener", "Ltinder/com/tooltip/Tooltip$OnClickListener;", "(Landroid/content/Context;Ltinder/com/tooltip/Tooltip$AnchorGravity;I[ILjava/lang/String;IFZJLtinder/com/tooltip/Tooltip$ViewPositions;ZLtinder/com/tooltip/Tooltip$OnClickListener;)V", "anchorGravity", "offset", "tooltipView", "Ltinder/com/tooltip/TooltipView;", "initAnchorPositions", "", "show", "AnchorGravity", "Builder", "OnClickListener", "ViewPositions", "tooltip_release"}, k = 1, mv = {1, 1, 10})
public final class Tooltip extends Dialog {
    /* renamed from: a */
    private final float f60755a;
    /* renamed from: b */
    private AnchorGravity f60756b;
    /* renamed from: c */
    private final TooltipView f60757c;
    /* renamed from: d */
    private final long f60758d;
    /* renamed from: e */
    private final OnClickListener f60759e;
    /* renamed from: f */
    private final C19464b f60760f;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Ltinder/com/tooltip/Tooltip$AnchorGravity;", "", "(Ljava/lang/String;I)V", "LEFT", "RIGHT", "TOP", "BOTTOM", "tooltip_release"}, k = 1, mv = {1, 1, 10})
    public enum AnchorGravity {
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Ltinder/com/tooltip/Tooltip$OnClickListener;", "", "onClick", "", "tooltip_release"}, k = 1, mv = {1, 1, 10})
    public interface OnClickListener {
        void onClick();
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\nJ\u0010\u0010\u0017\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\u0018J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001aR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Ltinder/com/tooltip/Tooltip$Builder;", "", "context", "Landroid/content/Context;", "anchorView", "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;)V", "animate", "", "backgroundColor", "", "cancelTouchOutside", "duration", "", "gradientColors", "", "gravity", "Ltinder/com/tooltip/Tooltip$AnchorGravity;", "onClickListener", "Ltinder/com/tooltip/Tooltip$OnClickListener;", "text", "", "textColor", "textSize", "", "viewPositions", "Ltinder/com/tooltip/Tooltip$ViewPositions;", "backgroundGradientColors", "build", "Ltinder/com/tooltip/Tooltip;", "cancelWhenTouchOutside", "cancel", "viewPosition", "tooltip_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: tinder.com.tooltip.Tooltip$a */
    public static final class C19463a {
        /* renamed from: a */
        private AnchorGravity f60733a = AnchorGravity.BOTTOM;
        /* renamed from: b */
        private int f60734b = -1;
        /* renamed from: c */
        private int f60735c = -1;
        /* renamed from: d */
        private float f60736d = C15824f.f49024a.a();
        /* renamed from: e */
        private int[] f60737e;
        /* renamed from: f */
        private String f60738f = "";
        /* renamed from: g */
        private boolean f60739g = true;
        /* renamed from: h */
        private long f60740h = Long.MIN_VALUE;
        /* renamed from: i */
        private boolean f60741i = true;
        /* renamed from: j */
        private OnClickListener f60742j;
        /* renamed from: k */
        private C19464b f60743k;
        /* renamed from: l */
        private final Context f60744l;
        /* renamed from: m */
        private final View f60745m;

        public C19463a(@NotNull Context context, @Nullable View view) {
            C2668g.b(context, "context");
            this.f60744l = context;
            this.f60745m = view;
        }

        @NotNull
        /* renamed from: a */
        public final C19463a m70045a(@NotNull AnchorGravity anchorGravity) {
            C2668g.b(anchorGravity, "gravity");
            C19463a c19463a = this;
            c19463a.f60733a = anchorGravity;
            return c19463a;
        }

        @NotNull
        /* renamed from: a */
        public final C19463a m70048a(@NotNull int[] iArr) {
            C2668g.b(iArr, "gradientColors");
            C19463a c19463a = this;
            c19463a.f60737e = iArr;
            return c19463a;
        }

        @NotNull
        /* renamed from: a */
        public final C19463a m70044a(@NotNull String str) {
            C2668g.b(str, ManagerWebServices.PARAM_TEXT);
            C19463a c19463a = this;
            c19463a.f60738f = str;
            return c19463a;
        }

        @NotNull
        /* renamed from: a */
        public final C19463a m70042a(int i) {
            C19463a c19463a = this;
            c19463a.f60735c = i;
            return c19463a;
        }

        @NotNull
        /* renamed from: a */
        public final C19463a m70047a(boolean z) {
            C19463a c19463a = this;
            c19463a.f60739g = z;
            return c19463a;
        }

        @NotNull
        /* renamed from: a */
        public final C19463a m70043a(long j) {
            C19463a c19463a = this;
            c19463a.f60740h = j;
            return c19463a;
        }

        @NotNull
        /* renamed from: b */
        public final C19463a m70050b(boolean z) {
            C19463a c19463a = this;
            c19463a.f60741i = z;
            return c19463a;
        }

        @NotNull
        /* renamed from: a */
        public final C19463a m70046a(@NotNull OnClickListener onClickListener) {
            C2668g.b(onClickListener, "onClickListener");
            C19463a c19463a = this;
            c19463a.f60742j = onClickListener;
            return c19463a;
        }

        @NotNull
        /* renamed from: a */
        public final Tooltip m70049a() {
            Object obj;
            View view;
            C19464b c;
            C19464b c19464b;
            Context context;
            if (this.f60745m == null) {
                if (r0.f60743k == null) {
                    obj = null;
                    if (obj != null) {
                        throw new IllegalStateException("Neither anchorView nor the viewPositions have been set".toString());
                    }
                    view = r0.f60745m;
                    if (view != null) {
                        c = C19478g.m70101c(view);
                        if (c != null) {
                            c19464b = c;
                            context = r0.f60744l;
                            if (c19464b == null) {
                                C2668g.a();
                            }
                            return new Tooltip(context, r0.f60733a, r0.f60734b, r0.f60737e, r0.f60738f, r0.f60735c, r0.f60736d, r0.f60739g, r0.f60740h, c19464b, r0.f60741i, r0.f60742j);
                        }
                    }
                    c = r0.f60743k;
                    c19464b = c;
                    context = r0.f60744l;
                    if (c19464b == null) {
                        C2668g.a();
                    }
                    return new Tooltip(context, r0.f60733a, r0.f60734b, r0.f60737e, r0.f60738f, r0.f60735c, r0.f60736d, r0.f60739g, r0.f60740h, c19464b, r0.f60741i, r0.f60742j);
                }
            }
            obj = 1;
            if (obj != null) {
                view = r0.f60745m;
                if (view != null) {
                    c = C19478g.m70101c(view);
                    if (c != null) {
                        c19464b = c;
                        context = r0.f60744l;
                        if (c19464b == null) {
                            C2668g.a();
                        }
                        return new Tooltip(context, r0.f60733a, r0.f60734b, r0.f60737e, r0.f60738f, r0.f60735c, r0.f60736d, r0.f60739g, r0.f60740h, c19464b, r0.f60741i, r0.f60742j);
                    }
                }
                c = r0.f60743k;
                c19464b = c;
                context = r0.f60744l;
                if (c19464b == null) {
                    C2668g.a();
                }
                return new Tooltip(context, r0.f60733a, r0.f60734b, r0.f60737e, r0.f60738f, r0.f60735c, r0.f60736d, r0.f60739g, r0.f60740h, c19464b, r0.f60741i, r0.f60742j);
            }
            throw new IllegalStateException("Neither anchorView nor the viewPositions have been set".toString());
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014¨\u0006("}, d2 = {"Ltinder/com/tooltip/Tooltip$ViewPositions;", "", "rootViewWidth", "", "rootViewHeight", "rootViewY", "", "anchorViewAbsolutePosition", "Landroid/graphics/Point;", "anchorViewX", "anchorViewY", "anchorViewWidth", "anchorViewHeight", "(IIFLandroid/graphics/Point;FFII)V", "getAnchorViewAbsolutePosition", "()Landroid/graphics/Point;", "getAnchorViewHeight", "()I", "getAnchorViewWidth", "getAnchorViewX", "()F", "getAnchorViewY", "getRootViewHeight", "getRootViewWidth", "getRootViewY", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "tooltip_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: tinder.com.tooltip.Tooltip$b */
    public static final class C19464b {
        /* renamed from: a */
        private final int f60746a;
        /* renamed from: b */
        private final int f60747b;
        /* renamed from: c */
        private final float f60748c;
        @NotNull
        /* renamed from: d */
        private final Point f60749d;
        /* renamed from: e */
        private final float f60750e;
        /* renamed from: f */
        private final float f60751f;
        /* renamed from: g */
        private final int f60752g;
        /* renamed from: h */
        private final int f60753h;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C19464b) {
                C19464b c19464b = (C19464b) obj;
                if ((this.f60746a == c19464b.f60746a ? 1 : null) != null) {
                    if ((this.f60747b == c19464b.f60747b ? 1 : null) != null && Float.compare(this.f60748c, c19464b.f60748c) == 0 && C2668g.a(this.f60749d, c19464b.f60749d) && Float.compare(this.f60750e, c19464b.f60750e) == 0 && Float.compare(this.f60751f, c19464b.f60751f) == 0) {
                        if ((this.f60752g == c19464b.f60752g ? 1 : null) != null) {
                            if ((this.f60753h == c19464b.f60753h ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }

        public int hashCode() {
            int floatToIntBits = ((((this.f60746a * 31) + this.f60747b) * 31) + Float.floatToIntBits(this.f60748c)) * 31;
            Point point = this.f60749d;
            return ((((((((floatToIntBits + (point != null ? point.hashCode() : 0)) * 31) + Float.floatToIntBits(this.f60750e)) * 31) + Float.floatToIntBits(this.f60751f)) * 31) + this.f60752g) * 31) + this.f60753h;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewPositions(rootViewWidth=");
            stringBuilder.append(this.f60746a);
            stringBuilder.append(", rootViewHeight=");
            stringBuilder.append(this.f60747b);
            stringBuilder.append(", rootViewY=");
            stringBuilder.append(this.f60748c);
            stringBuilder.append(", anchorViewAbsolutePosition=");
            stringBuilder.append(this.f60749d);
            stringBuilder.append(", anchorViewX=");
            stringBuilder.append(this.f60750e);
            stringBuilder.append(", anchorViewY=");
            stringBuilder.append(this.f60751f);
            stringBuilder.append(", anchorViewWidth=");
            stringBuilder.append(this.f60752g);
            stringBuilder.append(", anchorViewHeight=");
            stringBuilder.append(this.f60753h);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C19464b(int i, int i2, float f, @NotNull Point point, float f2, float f3, int i3, int i4) {
            C2668g.b(point, "anchorViewAbsolutePosition");
            this.f60746a = i;
            this.f60747b = i2;
            this.f60748c = f;
            this.f60749d = point;
            this.f60750e = f2;
            this.f60751f = f3;
            this.f60752g = i3;
            this.f60753h = i4;
        }

        /* renamed from: a */
        public final int m70051a() {
            return this.f60746a;
        }

        /* renamed from: b */
        public final int m70052b() {
            return this.f60747b;
        }

        /* renamed from: c */
        public final float m70053c() {
            return this.f60748c;
        }

        @NotNull
        /* renamed from: d */
        public final Point m70054d() {
            return this.f60749d;
        }

        /* renamed from: e */
        public final int m70055e() {
            return this.f60752g;
        }

        /* renamed from: f */
        public final int m70056f() {
            return this.f60753h;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 10})
    /* renamed from: tinder.com.tooltip.Tooltip$c */
    static final class C19465c implements Runnable {
        /* renamed from: a */
        final /* synthetic */ Tooltip f60754a;

        C19465c(Tooltip tooltip) {
            this.f60754a = tooltip;
        }

        public final void run() {
            this.f60754a.dismiss();
        }
    }

    private Tooltip(Context context, AnchorGravity anchorGravity, @ColorInt int i, int[] iArr, String str, @ColorInt int i2, float f, boolean z, long j, C19464b c19464b, boolean z2, final OnClickListener onClickListener) {
        super(context);
        this.f60760f = c19464b;
        this.f60755a = context.getResources().getDimension(C19474a.tooltip_offset);
        requestWindowFeature(1);
        this.f60758d = j;
        this.f60756b = anchorGravity;
        this.f60759e = onClickListener;
        getWindow().setBackgroundDrawable(new ColorDrawable(null));
        setCanceledOnTouchOutside(z2);
        this.f60757c = new TooltipView(context, null);
        this.f60757c.setAnchorGravity$tooltip_release(anchorGravity);
        this.f60757c.setBackgroundPaintColor$tooltip_release(i);
        this.f60757c.setGradientColors$tooltip_release(iArr);
        this.f60757c.setRootWidth$tooltip_release(this.f60760f.m70051a());
        this.f60757c.setText$tooltip_release(str);
        this.f60757c.setTextColor$tooltip_release(i2);
        this.f60757c.setTooltipTextSize$tooltip_release(f);
        this.f60757c.setAnimate$tooltip_release(z);
        this.f60757c.setOnClickListener((android.view.View.OnClickListener) new android.view.View.OnClickListener() {
            public final void onClick(View view) {
                view = onClickListener;
                if (view != null) {
                    view.onClick();
                }
            }
        });
        setContentView((View) this.f60757c);
        m70057a();
    }

    /* renamed from: a */
    public final void m70057a() {
        float e;
        Window window = getWindow();
        C2668g.a(window, "window");
        LayoutParams attributes = window.getAttributes();
        attributes.gravity = 8388659;
        attributes.flags = 768;
        Context context = getContext();
        C2668g.a(context, "context");
        Pair a = C19469a.m70088a(context);
        float realWidth = (float) this.f60757c.getRealWidth();
        float realHeight = (float) this.f60757c.getRealHeight();
        Point d = this.f60760f.m70054d();
        float f = (float) d.x;
        float f2 = (float) d.y;
        switch (C19476e.f60807a[this.f60756b.ordinal()]) {
            case 1:
                e = ((float) this.f60760f.m70055e()) + f;
                f2 = (f2 + ((float) (this.f60760f.m70056f() / 2))) - (realHeight / ((float) 2));
                break;
            case 2:
                e = f - realWidth;
                f2 = (f2 + ((float) (this.f60760f.m70056f() / 2))) - (realHeight / ((float) 2));
                break;
            case 3:
                e = (f - (realWidth / ((float) 2))) + ((float) (this.f60760f.m70055e() / 2));
                f2 -= realHeight;
                break;
            case 4:
                e = (f - (realWidth / ((float) 2))) + ((float) (this.f60760f.m70055e() / 2));
                f2 += (float) this.f60760f.m70056f();
                break;
            default:
                f2 = 0.0f;
                e = 0.0f;
                break;
        }
        if (e < 0.0f) {
            e = 0.0f;
        }
        Context context2 = getContext();
        C2668g.a(context2, "context");
        float b = (float) C19469a.m70089b(context2);
        if (f2 < b) {
            f2 = b;
        }
        if (e + realWidth >= ((Number) a.a()).floatValue()) {
            e = ((Number) a.a()).floatValue() - realWidth;
        }
        if (((float) ((int) f2)) + realHeight >= this.f60760f.m70053c() + ((float) this.f60760f.m70052b())) {
            float intValue = (float) ((Number) a.b()).intValue();
            Context context3 = getContext();
            C2668g.a(context3, "context");
            f2 = intValue - ((float) C19469a.m70090c(context3));
        }
        this.f60757c.setXOffset((realWidth + e) - (f + (((float) this.f60760f.m70055e()) / 2.0f)));
        attributes.x = (int) e;
        attributes.y = (int) f2;
    }

    public void show() {
        LayoutParams layoutParams = new LayoutParams();
        Window window = getWindow();
        C2668g.a(window, "window");
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = this.f60757c.getRealWidth();
        layoutParams.height = this.f60757c.getRealHeight() + ((int) this.f60755a);
        super.show();
        window = getWindow();
        C2668g.a(window, "window");
        window.setAttributes(layoutParams);
        if (this.f60758d != Long.MIN_VALUE) {
            this.f60757c.postDelayed(new C19465c(this), this.f60758d);
        }
    }
}
