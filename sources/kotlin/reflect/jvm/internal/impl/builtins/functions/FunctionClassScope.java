package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C15807n;
import kotlin.collections.C17554o;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

public final class FunctionClassScope extends GivenFunctionsMemberScope {
    public FunctionClassScope(@NotNull StorageManager storageManager, @NotNull FunctionClassDescriptor functionClassDescriptor) {
        C2668g.b(storageManager, "storageManager");
        C2668g.b(functionClassDescriptor, "containingClass");
        super(storageManager, functionClassDescriptor);
    }

    @NotNull
    protected List<FunctionDescriptor> computeDeclaredFunctions() {
        ClassDescriptor containingClass = getContainingClass();
        if (containingClass == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        }
        switch (((FunctionClassDescriptor) containingClass).getFunctionKind()) {
            case Function:
                return C15807n.m59826a(FunctionInvokeDescriptor.Factory.create((FunctionClassDescriptor) getContainingClass(), false));
            case SuspendFunction:
                return C15807n.m59826a(FunctionInvokeDescriptor.Factory.create((FunctionClassDescriptor) getContainingClass(), true));
            default:
                return C17554o.m64195a();
        }
    }
}
