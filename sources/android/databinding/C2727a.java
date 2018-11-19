package android.databinding;

import android.databinding.Observable.C0095a;
import android.support.annotation.NonNull;

/* renamed from: android.databinding.a */
public class C2727a implements Observable {
    private transient C2731h mCallbacks;

    public void addOnPropertyChangedCallback(@NonNull C0095a c0095a) {
        synchronized (this) {
            if (this.mCallbacks == null) {
                this.mCallbacks = new C2731h();
            }
        }
        this.mCallbacks.m351a((Object) c0095a);
    }

    public void removeOnPropertyChangedCallback(@NonNull C0095a c0095a) {
        synchronized (this) {
            if (this.mCallbacks == null) {
                return;
            }
            this.mCallbacks.m353b((Object) c0095a);
        }
    }

    public void notifyChange() {
        synchronized (this) {
            if (this.mCallbacks == null) {
                return;
            }
            this.mCallbacks.m352a(this, 0, null);
        }
    }

    public void notifyPropertyChanged(int i) {
        synchronized (this) {
            if (this.mCallbacks == null) {
                return;
            }
            this.mCallbacks.m352a(this, i, null);
        }
    }
}
