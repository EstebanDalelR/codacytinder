package android.support.transition;

import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.WindowId;

@RequiresApi(18)
class au implements av {
    /* renamed from: a */
    private final WindowId f8876a;

    au(@NonNull View view) {
        this.f8876a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (!(obj instanceof au) || ((au) obj).f8876a.equals(this.f8876a) == null) ? null : true;
    }

    public int hashCode() {
        return this.f8876a.hashCode();
    }
}
