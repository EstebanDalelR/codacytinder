package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.List;
import kotlin.collections.C15807n;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

public final class CloneableClassScope extends GivenFunctionsMemberScope {
    @NotNull
    private static final Name CLONE_NAME = Name.identifier("clone");
    public static final Companion Companion = new Companion();

    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final Name getCLONE_NAME$descriptors_jvm() {
            return CloneableClassScope.CLONE_NAME;
        }
    }

    public CloneableClassScope(@NotNull StorageManager storageManager, @NotNull ClassDescriptor classDescriptor) {
        C2668g.b(storageManager, "storageManager");
        C2668g.b(classDescriptor, "containingClass");
        super(storageManager, classDescriptor);
    }

    @NotNull
    protected List<FunctionDescriptor> computeDeclaredFunctions() {
        SimpleFunctionDescriptorImpl create = SimpleFunctionDescriptorImpl.create(getContainingClass(), Annotations.Companion.getEMPTY(), CLONE_NAME, Kind.DECLARATION, SourceElement.NO_SOURCE);
        create.initialize(null, getContainingClass().getThisAsReceiverParameter(), C17554o.m64195a(), C17554o.m64195a(), (KotlinType) DescriptorUtilsKt.getBuiltIns(getContainingClass()).getAnyType(), Modality.OPEN, Visibilities.PROTECTED);
        return C15807n.m59826a(create);
    }
}
