package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C18457p;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import org.jetbrains.annotations.NotNull;

public final class TypeTable {
    @NotNull
    private final List<Type> types;

    public TypeTable(@NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable typeTable) {
        C2668g.b(typeTable, "typeTable");
        TypeTable typeTable2 = this;
        List typeList = typeTable.getTypeList();
        if (typeTable.hasFirstNullable()) {
            int firstNullable = typeTable.getFirstNullable();
            typeTable = typeTable.getTypeList();
            C2668g.a(typeTable, "typeTable.typeList");
            Iterable<Object> iterable = (Iterable) typeTable;
            Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            int i = 0;
            for (Object obj : iterable) {
                Object obj2;
                int i2 = i + 1;
                if (i >= firstNullable) {
                    obj2 = obj2.toBuilder().setNullable(true).build();
                }
                arrayList.add(obj2);
                i = i2;
            }
            typeList = (List) arrayList;
        } else {
            C2668g.a(typeList, "originalTypes");
        }
        this.types = typeList;
    }

    @NotNull
    public final Type get(int i) {
        return (Type) this.types.get(i);
    }
}
