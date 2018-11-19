package android.support.transition;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

@RequiresApi(18)
class ad implements ae {
    /* renamed from: a */
    private final ViewGroupOverlay f12752a;

    ad(@NonNull ViewGroup viewGroup) {
        this.f12752a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo342a(@NonNull Drawable drawable) {
        this.f12752a.add(drawable);
    }

    /* renamed from: b */
    public void mo343b(@NonNull Drawable drawable) {
        this.f12752a.remove(drawable);
    }

    /* renamed from: a */
    public void mo3017a(@NonNull View view) {
        this.f12752a.add(view);
    }

    /* renamed from: b */
    public void mo3018b(@NonNull View view) {
        this.f12752a.remove(view);
    }
}
