package android.databinding;

public interface Observable {

    /* renamed from: android.databinding.Observable$a */
    public static abstract class C0095a {
        /* renamed from: a */
        public abstract void mo137a(Observable observable, int i);
    }

    void addOnPropertyChangedCallback(C0095a c0095a);

    void removeOnPropertyChangedCallback(C0095a c0095a);
}
