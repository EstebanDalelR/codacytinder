package com.tinder.recsgrid;

import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.tinder.recs.view.RecCardView$OnTouchEventInterceptedListener;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/tinder/recsgrid/ViewPagerBlockTouchInterceptor;", "Lcom/tinder/recs/view/RecCardView$OnTouchEventInterceptedListener;", "viewPager", "Landroid/support/v4/view/ViewPager;", "(Landroid/support/v4/view/ViewPager;)V", "onTouchEventIntercepted", "", "view", "Landroid/view/View;", "motionEvent", "Landroid/view/MotionEvent;", "Companion", "recs-grid_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.recsgrid.g */
public final class C16488g implements RecCardView$OnTouchEventInterceptedListener {
    /* renamed from: a */
    public static final C14784a f51164a = new C14784a();
    /* renamed from: b */
    private final ViewPager f51165b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/recsgrid/ViewPagerBlockTouchInterceptor$Companion;", "", "()V", "forViewPagerChild", "Lcom/tinder/recsgrid/ViewPagerBlockTouchInterceptor;", "view", "Landroid/view/View;", "recs-grid_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.recsgrid.g$a */
    public static final class C14784a {
        private C14784a() {
        }

        @NotNull
        /* renamed from: a */
        public final C16488g m56059a(@NotNull View view) {
            C2668g.b(view, "view");
            view = view.getParent();
            while (view != null && !(view instanceof ViewPager)) {
                view = view.getParent();
            }
            if (!(view instanceof ViewPager)) {
                view = (ViewParent) null;
            }
            if (!(view instanceof ViewPager)) {
                view = null;
            }
            return new C16488g((ViewPager) view);
        }
    }

    public C16488g(@Nullable ViewPager viewPager) {
        this.f51165b = viewPager;
    }

    public boolean onTouchEventIntercepted(@NotNull View view, @Nullable MotionEvent motionEvent) {
        C2668g.b(view, "view");
        view = this.f51165b;
        if (view != null) {
            view.requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }
}
