package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.pcollections.HashPMap;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0005\u001a\u00020\u0006H\u0000\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\b\b\u0000\u0010\t*\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u000bH\u0000\"*\u0010\u0000\u001a\u001e\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0001X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"K_CLASS_CACHE", "Lkotlin/reflect/jvm/internal/pcollections/HashPMap;", "", "kotlin.jvm.PlatformType", "", "clearKClassCache", "", "getOrCreateKotlinClass", "Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "jClass", "Ljava/lang/Class;", "kotlin-reflection"}, k = 2, mv = {1, 1, 10})
public final class KClassCacheKt {
    private static HashPMap<String, Object> K_CLASS_CACHE = HashPMap.empty();

    @NotNull
    public static final <T> KClassImpl<T> getOrCreateKotlinClass(@NotNull Class<T> cls) {
        KClassImpl<T> kClassImpl;
        C2668g.b(cls, "jClass");
        String name = cls.getName();
        Object obj = K_CLASS_CACHE.get(name);
        Object obj2 = null;
        if (obj instanceof WeakReference) {
            kClassImpl = (KClassImpl) ((WeakReference) obj).get();
            if (kClassImpl != null) {
                obj2 = kClassImpl.getJClass();
            }
            if (C2668g.a(obj2, cls)) {
                return kClassImpl;
            }
        } else if (obj != null) {
            for (WeakReference weakReference : (WeakReference[]) obj) {
                KClassImpl<T> kClassImpl2 = (KClassImpl) weakReference.get();
                if (C2668g.a(kClassImpl2 != null ? kClassImpl2.getJClass() : null, cls)) {
                    return kClassImpl2;
                }
            }
            int length = ((Object[]) obj).length;
            obj2 = new WeakReference[(length + 1)];
            System.arraycopy(obj, 0, obj2, 0, length);
            kClassImpl = new KClassImpl(cls);
            obj2[length] = new WeakReference(kClassImpl);
            K_CLASS_CACHE = K_CLASS_CACHE.plus(name, obj2);
            return kClassImpl;
        }
        kClassImpl = new KClassImpl(cls);
        K_CLASS_CACHE = K_CLASS_CACHE.plus(name, new WeakReference(kClassImpl));
        return kClassImpl;
    }

    public static final void clearKClassCache() {
        K_CLASS_CACHE = HashPMap.empty();
    }
}
