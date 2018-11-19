package kotlin.reflect.jvm.internal.impl.platform;

import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C15819j;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

public final class MappingUtilKt {
    @NotNull
    public static final TypeConstructorSubstitution createMappedTypeParametersSubstitution(@NotNull ClassDescriptor classDescriptor, @NotNull ClassDescriptor classDescriptor2) {
        C2668g.b(classDescriptor, ManagerWebServices.PARAM_FROM);
        C2668g.b(classDescriptor2, "to");
        Object obj = classDescriptor.getDeclaredTypeParameters().size() == classDescriptor2.getDeclaredTypeParameters().size() ? 1 : null;
        if (C15819j.f49018a && obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(classDescriptor);
            stringBuilder.append(" and ");
            stringBuilder.append(classDescriptor2);
            stringBuilder.append(" should have same number of type parameters, ");
            stringBuilder.append("but ");
            stringBuilder.append(classDescriptor.getDeclaredTypeParameters().size());
            stringBuilder.append(" / ");
            stringBuilder.append(classDescriptor2.getDeclaredTypeParameters().size());
            stringBuilder.append(" found");
            throw ((Throwable) new AssertionError(stringBuilder.toString()));
        }
        Companion companion = TypeConstructorSubstitution.Companion;
        classDescriptor = classDescriptor.getDeclaredTypeParameters();
        C2668g.a(classDescriptor, "from.declaredTypeParameters");
        Iterable<TypeParameterDescriptor> iterable = (Iterable) classDescriptor;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (TypeParameterDescriptor typeConstructor : iterable) {
            arrayList.add(typeConstructor.getTypeConstructor());
        }
        Iterable iterable2 = (List) arrayList;
        classDescriptor = classDescriptor2.getDeclaredTypeParameters();
        C2668g.a(classDescriptor, "to.declaredTypeParameters");
        iterable = (Iterable) classDescriptor;
        Collection collection = (Collection) new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (TypeParameterDescriptor typeParameterDescriptor : iterable) {
            C2668g.a(typeParameterDescriptor, "it");
            SimpleType defaultType = typeParameterDescriptor.getDefaultType();
            C2668g.a(defaultType, "it.defaultType");
            collection.add(TypeUtilsKt.asTypeProjection(defaultType));
        }
        return Companion.createByConstructorsMap$default(companion, ah.m66885a((Iterable) C19299w.m68815c(iterable2, (Iterable) (List) collection)), false, 2, null);
    }
}
