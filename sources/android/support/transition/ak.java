package android.support.transition;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.ViewOverlay;

@RequiresApi(18)
class ak implements al {
    /* renamed from: a */
    private final ViewOverlay f8874a;

    ak(@NonNull View view) {
        this.f8874a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo342a(@NonNull Drawable drawable) {
        this.f8874a.add(drawable);
    }

    /* renamed from: b */
    public void mo343b(@NonNull Drawable drawable) {
        this.f8874a.remove(drawable);
    }
}
