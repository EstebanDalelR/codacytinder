package android.databinding;

import java.util.List;

public interface ObservableList<T> extends List<T> {

    /* renamed from: android.databinding.ObservableList$a */
    public static abstract class C0102a<T extends ObservableList> {
    }

    void addOnListChangedCallback(C0102a<? extends ObservableList<T>> c0102a);

    void removeOnListChangedCallback(C0102a<? extends ObservableList<T>> c0102a);
}
