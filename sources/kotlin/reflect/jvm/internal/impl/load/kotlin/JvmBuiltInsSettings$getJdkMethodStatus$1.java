package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors;
import org.jetbrains.annotations.NotNull;

final class JvmBuiltInsSettings$getJdkMethodStatus$1<N> implements Neighbors<N> {
    final /* synthetic */ JvmBuiltInsSettings this$0;

    JvmBuiltInsSettings$getJdkMethodStatus$1(JvmBuiltInsSettings jvmBuiltInsSettings) {
        this.this$0 = jvmBuiltInsSettings;
    }

    @NotNull
    public final List<LazyJavaClassDescriptor> getNeighbors(ClassDescriptor classDescriptor) {
        C2668g.a(classDescriptor, "it");
        classDescriptor = classDescriptor.getTypeConstructor();
        C2668g.a(classDescriptor, "it.typeConstructor");
        classDescriptor = classDescriptor.getSupertypes();
        C2668g.a(classDescriptor, "it.typeConstructor.supertypes");
        Collection arrayList = new ArrayList();
        for (KotlinType constructor : (Iterable) classDescriptor) {
            ClassifierDescriptor declarationDescriptor = constructor.getConstructor().getDeclarationDescriptor();
            Object obj = null;
            declarationDescriptor = declarationDescriptor != null ? declarationDescriptor.getOriginal() : null;
            if (!(declarationDescriptor instanceof ClassDescriptor)) {
                declarationDescriptor = null;
            }
            ClassDescriptor classDescriptor2 = (ClassDescriptor) declarationDescriptor;
            if (classDescriptor2 != null) {
                obj = this.this$0.getJavaAnalogue(classDescriptor2);
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return (List) arrayList;
    }
}
