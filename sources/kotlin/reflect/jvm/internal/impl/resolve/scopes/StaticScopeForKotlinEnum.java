package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C15819j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class StaticScopeForKotlinEnum extends MemberScopeImpl {
    static final /* synthetic */ KProperty[] $$delegatedProperties = new KProperty[]{C15825i.m59867a(new PropertyReference1Impl(C15825i.m59860a(StaticScopeForKotlinEnum.class), "functions", "getFunctions()Ljava/util/List;"))};
    private final ClassDescriptor containingClass;
    private final NotNullLazyValue functions$delegate;

    private final List<SimpleFunctionDescriptor> getFunctions() {
        return (List) StorageKt.getValue(this.functions$delegate, (Object) this, $$delegatedProperties[0]);
    }

    @Nullable
    public Void getContributedClassifier(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        return null;
    }

    public StaticScopeForKotlinEnum(@NotNull StorageManager storageManager, @NotNull ClassDescriptor classDescriptor) {
        C2668g.b(storageManager, "storageManager");
        C2668g.b(classDescriptor, "containingClass");
        this.containingClass = classDescriptor;
        classDescriptor = this.containingClass.getKind() == ClassKind.ENUM_CLASS ? true : null;
        if (C15819j.f49018a && classDescriptor == null) {
            storageManager = new StringBuilder();
            storageManager.append("Class should be an enum: ");
            storageManager.append(this.containingClass);
            throw ((Throwable) new AssertionError(storageManager.toString()));
        }
        this.functions$delegate = storageManager.createLazyValue((Function0) new StaticScopeForKotlinEnum$functions$2(this));
    }

    @NotNull
    public List<SimpleFunctionDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter descriptorKindFilter, @NotNull Function1<? super Name, Boolean> function1) {
        C2668g.b(descriptorKindFilter, "kindFilter");
        C2668g.b(function1, "nameFilter");
        return getFunctions();
    }

    @NotNull
    public ArrayList<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation) {
        C2668g.b(name, "name");
        C2668g.b(lookupLocation, "location");
        Collection arrayList = new ArrayList(1);
        for (Object next : getFunctions()) {
            if (C2668g.a(((SimpleFunctionDescriptor) next).getName(), name)) {
                arrayList.add(next);
            }
        }
        return (ArrayList) arrayList;
    }
}
