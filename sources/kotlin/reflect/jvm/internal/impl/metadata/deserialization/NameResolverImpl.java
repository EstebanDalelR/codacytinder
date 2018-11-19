package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable;
import org.jetbrains.annotations.NotNull;

public final class NameResolverImpl implements NameResolver {
    private final QualifiedNameTable qualifiedNames;
    private final StringTable strings;

    public NameResolverImpl(@NotNull StringTable stringTable, @NotNull QualifiedNameTable qualifiedNameTable) {
        C2668g.b(stringTable, "strings");
        C2668g.b(qualifiedNameTable, "qualifiedNames");
        this.strings = stringTable;
        this.qualifiedNames = qualifiedNameTable;
    }

    @NotNull
    public String getString(int i) {
        i = this.strings.getString(i);
        C2668g.a(i, "strings.getString(index)");
        return i;
    }

    @NotNull
    public String getQualifiedClassName(int i) {
        i = traverseIds(i);
        List list = (List) i.m59810d();
        i = C19299w.m68797a((List) i.m59811e(), ".", null, null, 0, null, null, 62, null);
        if (list.isEmpty()) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(C19299w.m68797a(list, "/", null, null, 0, null, null, 62, null));
        stringBuilder.append('/');
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    public boolean isLocalClassName(int i) {
        return ((Boolean) traverseIds(i).m59809c()).booleanValue();
    }

    private final Triple<List<String>, List<String>, Boolean> traverseIds(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            i = this.qualifiedNames.getQualifiedName(i);
            StringTable stringTable = this.strings;
            C2668g.a(i, "proto");
            String string = stringTable.getString(i.getShortName());
            Kind kind = i.getKind();
            if (kind == null) {
                C2668g.a();
            }
            switch (kind) {
                case CLASS:
                    linkedList2.addFirst(string);
                    break;
                case PACKAGE:
                    linkedList.addFirst(string);
                    break;
                case LOCAL:
                    linkedList2.addFirst(string);
                    z = true;
                    break;
                default:
                    break;
            }
            i = i.getParentQualifiedName();
        }
        return new Triple(linkedList, linkedList2, Boolean.valueOf(z));
    }
}
