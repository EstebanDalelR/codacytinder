package kotlin.reflect.jvm.internal;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\bH\u0000\" \u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"moduleByClassLoader", "Ljava/util/concurrent/ConcurrentMap;", "Lkotlin/reflect/jvm/internal/WeakClassLoaderBox;", "Ljava/lang/ref/WeakReference;", "Lkotlin/reflect/jvm/internal/components/RuntimeModuleData;", "clearModuleByClassLoaderCache", "", "getOrCreateModule", "Ljava/lang/Class;", "kotlin-reflection"}, k = 2, mv = {1, 1, 10})
public final class ModuleByClassLoaderKt {
    private static final ConcurrentMap<WeakClassLoaderBox, WeakReference<RuntimeModuleData>> moduleByClassLoader = new ConcurrentHashMap();

    @NotNull
    public static final RuntimeModuleData getOrCreateModule(@NotNull Class<?> cls) {
        RuntimeModuleData weakReference;
        C2668g.b(cls, "$receiver");
        cls = ReflectClassUtilKt.getSafeClassLoader(cls);
        WeakClassLoaderBox weakClassLoaderBox = new WeakClassLoaderBox(cls);
        WeakReference weakReference2 = (WeakReference) moduleByClassLoader.get(weakClassLoaderBox);
        if (weakReference2 != null) {
            RuntimeModuleData runtimeModuleData = (RuntimeModuleData) weakReference2.get();
            if (runtimeModuleData != null) {
                C2668g.a(runtimeModuleData, "it");
                return runtimeModuleData;
            }
            moduleByClassLoader.remove(weakClassLoaderBox, weakReference2);
        }
        cls = RuntimeModuleData.Companion.create(cls);
        while (true) {
            try {
                ConcurrentMap concurrentMap = moduleByClassLoader;
                weakReference = new WeakReference(cls);
                WeakReference weakReference3 = (WeakReference) concurrentMap.putIfAbsent(weakClassLoaderBox, weakReference);
                if (weakReference3 == null) {
                    weakClassLoaderBox.setTemporaryStrongRef((ClassLoader) null);
                    return cls;
                }
                weakReference = (RuntimeModuleData) weakReference3.get();
                if (weakReference != null) {
                    break;
                }
                weakReference = moduleByClassLoader;
                weakReference.remove(weakClassLoaderBox, weakReference3);
            } finally {
                weakClassLoaderBox.setTemporaryStrongRef((ClassLoader) null);
            }
        }
        return weakReference;
    }

    public static final void clearModuleByClassLoaderCache() {
        moduleByClassLoader.clear();
    }
}
