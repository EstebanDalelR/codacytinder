package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C15811g;
import kotlin.Pair;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class FakePureImplementationsProvider {
    public static final FakePureImplementationsProvider INSTANCE;
    private static final HashMap<FqName, FqName> pureImplementations = new HashMap();

    static {
        FakePureImplementationsProvider fakePureImplementationsProvider = new FakePureImplementationsProvider();
        INSTANCE = fakePureImplementationsProvider;
        FqName fqName = KotlinBuiltIns.FQ_NAMES.mutableList;
        C2668g.a(fqName, "FQ_NAMES.mutableList");
        fakePureImplementationsProvider.implementedWith(fqName, fakePureImplementationsProvider.fqNameListOf("java.util.ArrayList", "java.util.LinkedList"));
        fqName = KotlinBuiltIns.FQ_NAMES.mutableSet;
        C2668g.a(fqName, "FQ_NAMES.mutableSet");
        fakePureImplementationsProvider.implementedWith(fqName, fakePureImplementationsProvider.fqNameListOf("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        fqName = KotlinBuiltIns.FQ_NAMES.mutableMap;
        C2668g.a(fqName, "FQ_NAMES.mutableMap");
        fakePureImplementationsProvider.implementedWith(fqName, fakePureImplementationsProvider.fqNameListOf("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        fakePureImplementationsProvider.implementedWith(new FqName("java.util.function.Function"), fakePureImplementationsProvider.fqNameListOf("java.util.function.UnaryOperator"));
        fakePureImplementationsProvider.implementedWith(new FqName("java.util.function.BiFunction"), fakePureImplementationsProvider.fqNameListOf("java.util.function.BinaryOperator"));
    }

    private FakePureImplementationsProvider() {
    }

    @Nullable
    public final FqName getPurelyImplementedInterface(@NotNull FqName fqName) {
        C2668g.b(fqName, "classFqName");
        return (FqName) pureImplementations.get(fqName);
    }

    private final void implementedWith(@NotNull FqName fqName, List<FqName> list) {
        Map map = pureImplementations;
        for (FqName a : list) {
            Pair a2 = C15811g.m59834a(a, fqName);
            map.put(a2.m59803a(), a2.m59804b());
        }
    }

    private final List<FqName> fqNameListOf(String... strArr) {
        Collection arrayList = new ArrayList(strArr.length);
        for (String fqName : strArr) {
            arrayList.add(new FqName(fqName));
        }
        return (List) arrayList;
    }
}
