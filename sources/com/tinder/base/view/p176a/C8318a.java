package com.tinder.base.view.p176a;

import android.os.SystemClock;
import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/tinder/base/view/animations/MotionEventFactory;", "", "()V", "Companion", "base_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.base.view.a.a */
public final class C8318a {
    /* renamed from: a */
    public static final C8317a f29598a = new C8317a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u000b"}, d2 = {"Lcom/tinder/base/view/animations/MotionEventFactory$Companion;", "", "()V", "createDown", "Landroid/view/MotionEvent;", "x", "", "y", "", "createMove", "createUp", "base_release"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.base.view.a.a$a */
    public static final class C8317a {
        private C8317a() {
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final MotionEvent m35426a(int i, int i2) {
            return m35425a((float) i, (float) i2);
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final MotionEvent m35425a(float f, float f2) {
            f = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 2, f, f2, 0);
            C2668g.a(f, "MotionEvent.obtain(\n    …  metaState\n            )");
            return f;
        }

        @JvmStatic
        @NotNull
        /* renamed from: b */
        public final MotionEvent m35427b(float f, float f2) {
            f = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, f, f2, 0);
            C2668g.a(f, "MotionEvent.obtain(\n    …  metaState\n            )");
            return f;
        }

        @JvmStatic
        @NotNull
        /* renamed from: c */
        public final MotionEvent m35428c(float f, float f2) {
            f = MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, f, f2, 0);
            C2668g.a(f, "MotionEvent.obtain(\n    …  metaState\n            )");
            return f;
        }
    }
}
