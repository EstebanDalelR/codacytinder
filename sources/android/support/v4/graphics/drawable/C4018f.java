package android.support.v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.graphics.drawable.C2845e.C0453a;

@RequiresApi(19)
/* renamed from: android.support.v4.graphics.drawable.f */
class C4018f extends C2845e {

    /* renamed from: android.support.v4.graphics.drawable.f$a */
    private static class C2846a extends C0453a {
        C2846a(@Nullable C0453a c0453a, @Nullable Resources resources) {
            super(c0453a, resources);
        }

        @NonNull
        public Drawable newDrawable(@Nullable Resources resources) {
            return new C4018f(this, resources);
        }
    }

    C4018f(Drawable drawable) {
        super(drawable);
    }

    C4018f(C0453a c0453a, Resources resources) {
        super(c0453a, resources);
    }

    public void setAutoMirrored(boolean z) {
        this.c.setAutoMirrored(z);
    }

    public boolean isAutoMirrored() {
        return this.c.isAutoMirrored();
    }

    @NonNull
    /* renamed from: a */
    C0453a mo3039a() {
        return new C2846a(this.b, null);
    }
}
