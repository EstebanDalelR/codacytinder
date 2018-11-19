package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;

public final class CompanionObjectMapping {
    public static final CompanionObjectMapping INSTANCE = new CompanionObjectMapping();
    private static final LinkedHashSet<ClassId> classIds;

    static {
        Set set = PrimitiveType.NUMBER_TYPES;
        C2668g.a(set, "PrimitiveType.NUMBER_TYPES");
        Iterable<PrimitiveType> iterable = set;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (PrimitiveType primitiveFqName : iterable) {
            arrayList.add(KotlinBuiltIns.getPrimitiveFqName(primitiveFqName));
        }
        Iterable<FqName> a = C19299w.m68800a((Collection) C19299w.m68800a((Collection) (List) arrayList, (Object) KotlinBuiltIns.FQ_NAMES.string.toSafe()), (Object) KotlinBuiltIns.FQ_NAMES._enum.toSafe());
        arrayList = new LinkedHashSet();
        for (FqName topLevel : a) {
            arrayList.add(ClassId.topLevel(topLevel));
        }
        classIds = (LinkedHashSet) arrayList;
    }

    private CompanionObjectMapping() {
    }

    @NotNull
    public final Set<ClassId> allClassesWithIntrinsicCompanions() {
        Set<ClassId> unmodifiableSet = Collections.unmodifiableSet(classIds);
        C2668g.a(unmodifiableSet, "Collections.unmodifiableSet(classIds)");
        return unmodifiableSet;
    }

    public final boolean isMappedIntrinsicCompanionObject(@NotNull ClassDescriptor classDescriptor) {
        C2668g.b(classDescriptor, "classDescriptor");
        if (DescriptorUtils.isCompanionObject(classDescriptor)) {
            Iterable iterable = classIds;
            classDescriptor = DescriptorUtilsKt.getClassId(classDescriptor);
            if (C19299w.m68802a(iterable, (Object) classDescriptor != null ? classDescriptor.getOuterClassId() : null) != null) {
                return true;
            }
        }
        return null;
    }
}
