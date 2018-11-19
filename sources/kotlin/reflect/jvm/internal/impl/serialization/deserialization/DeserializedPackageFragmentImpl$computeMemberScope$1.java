package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C18457p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

final class DeserializedPackageFragmentImpl$computeMemberScope$1 extends Lambda implements Function0<List<? extends Name>> {
    final /* synthetic */ DeserializedPackageFragmentImpl this$0;

    DeserializedPackageFragmentImpl$computeMemberScope$1(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        this.this$0 = deserializedPackageFragmentImpl;
        super(0);
    }

    @NotNull
    public final List<Name> invoke() {
        Collection arrayList = new ArrayList();
        for (Object next : this.this$0.getClassDataFinder().getAllClassIds$deserialization()) {
            ClassId classId = (ClassId) next;
            Object obj = (classId.isNestedClass() || ClassDeserializer.Companion.getBLACK_LIST().contains(classId)) ? null : 1;
            if (obj != null) {
                arrayList.add(next);
            }
        }
        Iterable<ClassId> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (ClassId shortClassName : iterable) {
            arrayList2.add(shortClassName.getShortClassName());
        }
        return (List) arrayList2;
    }
}
