package com.tinder.views;

import android.support.v4.view.ViewPager.OnPageChangeListener;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0016J \u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004H\u0016R#\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR#\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u000e\u0010\f\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/views/TransitionPageChangeListener;", "Landroid/support/v4/view/ViewPager$OnPageChangeListener;", "enterAction", "Lkotlin/Function2;", "", "", "", "exitAction", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "getEnterAction", "()Lkotlin/jvm/functions/Function2;", "getExitAction", "lastPosition", "onPageScrollStateChanged", "state", "onPageScrolled", "position", "offset", "offsetPixels", "onPageSelected", "Tinder_release"}, k = 1, mv = {1, 1, 10})
final class aa implements OnPageChangeListener {
    /* renamed from: a */
    private float f52903a = -0.1f;
    @NotNull
    /* renamed from: b */
    private final Function2<Integer, Float, C15813i> f52904b;
    @NotNull
    /* renamed from: c */
    private final Function2<Integer, Float, C15813i> f52905c;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageSelected(int i) {
    }

    public aa(@NotNull Function2<? super Integer, ? super Float, C15813i> function2, @NotNull Function2<? super Integer, ? super Float, C15813i> function22) {
        C2668g.b(function2, "enterAction");
        C2668g.b(function22, "exitAction");
        this.f52904b = function2;
        this.f52905c = function22;
    }

    public void onPageScrolled(int i, float f, int i2) {
        int i3 = f == 0.0f ? i - 1 : i;
        i2 = f == 0.0f ? 1065353216 : f;
        this.f52905c.invoke(Integer.valueOf(i3), Float.valueOf(f));
        this.f52904b.invoke(Integer.valueOf(i3 + 1), Float.valueOf(i2));
        this.f52903a = ((float) i) + f;
    }
}
