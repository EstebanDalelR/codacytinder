package com.tinder.cardstack.cardgrid.view;

import android.content.res.Resources;
import com.tinder.cardstack.cardgrid.swipe.SwipeGestureDetector.TouchInterceptPredicate;
import com.tinder.cardstack.cardgrid.swipe.p186a.C8378a;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/HorizontalTouchInterceptPredicate;", "Lcom/tinder/cardstack/cardgrid/swipe/SwipeGestureDetector$TouchInterceptPredicate;", "()V", "shouldIntercept", "", "pointer", "Lcom/tinder/cardstack/cardgrid/swipe/model/Pointer;", "Companion", "cardstack_release"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.cardstack.cardgrid.view.d */
public final class C10484d implements TouchInterceptPredicate {
    /* renamed from: a */
    public static final C8385a f34097a = new C8385a();
    /* renamed from: b */
    private static final float f34098b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/cardstack/cardgrid/view/HorizontalTouchInterceptPredicate$Companion;", "", "()V", "MIN_DISPLACEMENT_FOR_HORIZONTAL_SWIPE", "", "getMIN_DISPLACEMENT_FOR_HORIZONTAL_SWIPE", "()F", "cardstack_release"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.cardstack.cardgrid.view.d$a */
    public static final class C8385a {
        private C8385a() {
        }

        /* renamed from: a */
        public final float m35747a() {
            return C10484d.f34098b;
        }
    }

    public boolean shouldIntercept(@NotNull C8378a c8378a) {
        C2668g.b(c8378a, "pointer");
        c8378a = c8378a.m35732f();
        if (c8378a.m35610c()) {
            return false;
        }
        float h = c8378a.m35614h();
        float i = c8378a.m35615i();
        if (Math.abs(h) < f34097a.m35747a() && Math.abs(i) < f34097a.m35747a()) {
            return false;
        }
        c8378a = c8378a.m35607b();
        if (c8378a >= 1110704128 && c8378a <= ((float) 360) - 45.0f) {
            i = (float) 180;
            if (c8378a <= i - 45.0f || c8378a >= i + 45.0f) {
                return false;
            }
        }
        return true;
    }

    static {
        float f = (float) 4;
        Resources system = Resources.getSystem();
        C2668g.a(system, "Resources.getSystem()");
        f34098b = f * system.getDisplayMetrics().density;
    }
}
