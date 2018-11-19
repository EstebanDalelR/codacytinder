package android.support.graphics.drawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2.AnimationCallback;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;

public interface Animatable2Compat extends Animatable {

    /* renamed from: android.support.graphics.drawable.Animatable2Compat$a */
    public static abstract class C0253a {
        /* renamed from: a */
        AnimationCallback f905a;

        /* renamed from: android.support.graphics.drawable.Animatable2Compat$a$1 */
        class C02521 extends AnimationCallback {
            /* renamed from: a */
            final /* synthetic */ C0253a f904a;

            C02521(C0253a c0253a) {
                this.f904a = c0253a;
            }

            public void onAnimationStart(Drawable drawable) {
                this.f904a.m929a(drawable);
            }

            public void onAnimationEnd(Drawable drawable) {
                this.f904a.m930b(drawable);
            }
        }

        /* renamed from: a */
        public void m929a(Drawable drawable) {
        }

        /* renamed from: b */
        public void m930b(Drawable drawable) {
        }

        @RequiresApi(23)
        /* renamed from: a */
        AnimationCallback m928a() {
            if (this.f905a == null) {
                this.f905a = new C02521(this);
            }
            return this.f905a;
        }
    }

    void clearAnimationCallbacks();

    void registerAnimationCallback(@NonNull C0253a c0253a);

    boolean unregisterAnimationCallback(@NonNull C0253a c0253a);
}
