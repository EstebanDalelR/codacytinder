package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C18457p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C18464j;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

final class LazyJavaClassMemberScope$enumEntryIndex$1 extends Lambda implements Function0<Map<Name, ? extends JavaField>> {
    final /* synthetic */ LazyJavaClassMemberScope this$0;

    LazyJavaClassMemberScope$enumEntryIndex$1(LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.this$0 = lazyJavaClassMemberScope;
        super(0);
    }

    @NotNull
    public final Map<Name, JavaField> invoke() {
        Collection arrayList = new ArrayList();
        for (Object next : this.this$0.jClass.getFields()) {
            if (((JavaField) next).isEnumEntry()) {
                arrayList.add(next);
            }
        }
        Iterable iterable = (List) arrayList;
        Map<Name, JavaField> linkedHashMap = new LinkedHashMap(C18464j.m66926c(ah.m66883a(C18457p.m66906a(iterable, 10)), 16));
        for (Object next2 : iterable) {
            linkedHashMap.put(((JavaField) next2).getName(), next2);
        }
        return linkedHashMap;
    }
}
