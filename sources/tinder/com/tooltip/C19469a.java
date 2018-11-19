package tinder.com.tooltip;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewConfiguration;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0003H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0003H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0002*\u00020\u0003H\u0000¨\u0006\b"}, d2 = {"getDisplaySize", "Lkotlin/Pair;", "", "Landroid/content/Context;", "hasPhysicalNavigation", "", "navigationBarHeight", "statusBarHeight", "tooltip_release"}, k = 2, mv = {1, 1, 10})
/* renamed from: tinder.com.tooltip.a */
public final class C19469a {
    @NotNull
    /* renamed from: a */
    public static final Pair<Integer, Integer> m70088a(@NotNull Context context) {
        C2668g.b(context, "$receiver");
        context = Resources.getSystem();
        C2668g.a(context, "Resources.getSystem()");
        context = context.getDisplayMetrics();
        return new Pair(Integer.valueOf(context.widthPixels), Integer.valueOf(context.heightPixels));
    }

    /* renamed from: b */
    public static final int m70089b(@NotNull Context context) {
        C2668g.b(context, "$receiver");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : null;
    }

    /* renamed from: c */
    public static final int m70090c(@NotNull Context context) {
        C2668g.b(context, "$receiver");
        if (C19469a.m70091d(context)) {
            return 0;
        }
        int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: d */
    public static final boolean m70091d(@NotNull Context context) {
        C2668g.b(context, "$receiver");
        return ViewConfiguration.get(context).hasPermanentMenuKey();
    }
}
