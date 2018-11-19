package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C15813i;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor$FunctionTypeConstructor$computeSupertypes$1 */
final class C19079x86380a31 extends Lambda implements Function2<PackageFragmentDescriptor, Name, C15813i> {
    final /* synthetic */ ArrayList $result;
    final /* synthetic */ FunctionTypeConstructor this$0;

    C19079x86380a31(FunctionTypeConstructor functionTypeConstructor, ArrayList arrayList) {
        this.this$0 = functionTypeConstructor;
        this.$result = arrayList;
        super(2);
    }

    public final void invoke(@NotNull PackageFragmentDescriptor packageFragmentDescriptor, @NotNull Name name) {
        C2668g.b(packageFragmentDescriptor, "packageFragment");
        C2668g.b(name, "name");
        ClassifierDescriptor contributedClassifier = packageFragmentDescriptor.getMemberScope().getContributedClassifier(name, NoLookupLocation.FROM_BUILTINS);
        if (!(contributedClassifier instanceof ClassDescriptor)) {
            contributedClassifier = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) contributedClassifier;
        if (classDescriptor != null) {
            packageFragmentDescriptor = classDescriptor.getTypeConstructor();
            name = this.this$0.getParameters();
            C2668g.a(packageFragmentDescriptor, "typeConstructor");
            Iterable<TypeParameterDescriptor> e = C19299w.m68826e((List) name, (int) packageFragmentDescriptor.getParameters().size());
            Collection collection = (Collection) new ArrayList(C18457p.m66906a((Iterable) e, 10));
            for (TypeParameterDescriptor defaultType : e) {
                collection.add(new TypeProjectionImpl(defaultType.getDefaultType()));
            }
            this.$result.add(KotlinTypeFactory.simpleNotNullType(Annotations.Companion.getEMPTY(), classDescriptor, (List) collection));
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Class ");
        stringBuilder.append(name);
        stringBuilder.append(" not found in ");
        stringBuilder.append(packageFragmentDescriptor);
        throw ((Throwable) new IllegalStateException(stringBuilder.toString().toString()));
    }
}
