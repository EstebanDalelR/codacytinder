package android.support.transition;

import android.os.IBinder;
import android.support.annotation.RequiresApi;

@RequiresApi(14)
class at implements av {
    /* renamed from: a */
    private final IBinder f8875a;

    at(IBinder iBinder) {
        this.f8875a = iBinder;
    }

    public boolean equals(Object obj) {
        return (!(obj instanceof at) || ((at) obj).f8875a.equals(this.f8875a) == null) ? null : true;
    }

    public int hashCode() {
        return this.f8875a.hashCode();
    }
}
