package com.tinder.shimmy;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout.LayoutParams;
import com.tinder.shimmy.C14947a.C14939a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nB\u001f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0002\u0010\fB\u0011\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fB\u0011\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011B\u0011\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0012B\u000f\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0002\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/tinder/shimmy/ShimmerFrameLayout$LayoutParams;", "Landroid/widget/FrameLayout$LayoutParams;", "c", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "width", "", "height", "(II)V", "gravity", "(III)V", "source", "Landroid/view/ViewGroup$LayoutParams;", "(Landroid/view/ViewGroup$LayoutParams;)V", "Landroid/view/ViewGroup$MarginLayoutParams;", "(Landroid/view/ViewGroup$MarginLayoutParams;)V", "(Landroid/widget/FrameLayout$LayoutParams;)V", "(Lcom/tinder/shimmy/ShimmerFrameLayout$LayoutParams;)V", "shimmers", "", "getShimmers", "()Z", "setShimmers", "(Z)V", "Companion", "shimmy_release"}, k = 1, mv = {1, 1, 9})
public final class ShimmerFrameLayout$LayoutParams extends LayoutParams {
    /* renamed from: a */
    public static final C14938a f46655a = new C14938a();
    /* renamed from: c */
    private static final boolean f46656c = true;
    /* renamed from: b */
    private boolean f46657b = f46655a.m56426a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/shimmy/ShimmerFrameLayout$LayoutParams$Companion;", "", "()V", "DEFAULT_SHIMMERS", "", "getDEFAULT_SHIMMERS", "()Z", "shimmy_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.shimmy.ShimmerFrameLayout$LayoutParams$a */
    public static final class C14938a {
        private C14938a() {
        }

        /* renamed from: a */
        private final boolean m56426a() {
            return ShimmerFrameLayout$LayoutParams.f46656c;
        }
    }

    /* renamed from: a */
    public final void m56429a(boolean z) {
        this.f46657b = z;
    }

    /* renamed from: a */
    public final boolean m56430a() {
        return this.f46657b;
    }

    public ShimmerFrameLayout$LayoutParams(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        C2668g.b(context, "c");
        C2668g.b(attributeSet, "attrs");
        super(context, attributeSet);
        context = context.obtainStyledAttributes(attributeSet, C14939a.ShimmerFrameLayout_Layout);
        this.f46657b = context.getBoolean(C14939a.ShimmerFrameLayout_Layout_layout_shimmers, f46655a.m56426a());
        context.recycle();
    }

    public ShimmerFrameLayout$LayoutParams(int i, int i2) {
        super(i, i2);
    }
}
