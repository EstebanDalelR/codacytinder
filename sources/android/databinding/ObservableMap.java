package android.databinding;

import java.util.Map;

public interface ObservableMap<K, V> extends Map<K, V> {

    /* renamed from: android.databinding.ObservableMap$a */
    public static abstract class C0104a<T extends ObservableMap<K, V>, K, V> {
    }

    void addOnMapChangedCallback(C0104a<? extends ObservableMap<K, V>, K, V> c0104a);

    void removeOnMapChangedCallback(C0104a<? extends ObservableMap<K, V>, K, V> c0104a);
}
