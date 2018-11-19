package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C18457p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18464j;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ProtoBasedClassDataFinder implements ClassDataFinder {
    private final Map<ClassId, Class> classIdToProto;
    private final Function1<ClassId, SourceElement> classSource;
    private final NameResolver nameResolver;

    public ProtoBasedClassDataFinder(@NotNull PackageFragment packageFragment, @NotNull NameResolver nameResolver, @NotNull Function1<? super ClassId, ? extends SourceElement> function1) {
        C2668g.b(packageFragment, "proto");
        C2668g.b(nameResolver, "nameResolver");
        C2668g.b(function1, "classSource");
        this.nameResolver = nameResolver;
        this.classSource = function1;
        packageFragment = packageFragment.getClass_List();
        C2668g.a(packageFragment, "proto.class_List");
        Iterable iterable = (Iterable) packageFragment;
        Map map = (Map) new LinkedHashMap(C18464j.m66926c(ah.m66883a((int) C18457p.m66906a(iterable, 10)), 16));
        for (NameResolver nameResolver2 : iterable) {
            Class classR = (Class) nameResolver2;
            NameResolver nameResolver3 = this.nameResolver;
            C2668g.a(classR, "klass");
            map.put(NameResolverUtilKt.getClassId(nameResolver3, classR.getFqName()), nameResolver2);
        }
        this.classIdToProto = map;
    }

    @NotNull
    public final Collection<ClassId> getAllClassIds$deserialization() {
        return this.classIdToProto.keySet();
    }

    @Nullable
    public ClassData findClassData(@NotNull ClassId classId) {
        C2668g.b(classId, "classId");
        Class classR = (Class) this.classIdToProto.get(classId);
        return classR != null ? new ClassData(this.nameResolver, classR, (SourceElement) this.classSource.invoke(classId)) : null;
    }
}
