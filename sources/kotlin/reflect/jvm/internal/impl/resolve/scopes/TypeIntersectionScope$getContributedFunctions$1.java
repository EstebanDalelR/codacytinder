package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import org.jetbrains.annotations.NotNull;

final class TypeIntersectionScope$getContributedFunctions$1 extends Lambda implements Function1<SimpleFunctionDescriptor, SimpleFunctionDescriptor> {
    public static final TypeIntersectionScope$getContributedFunctions$1 INSTANCE = new TypeIntersectionScope$getContributedFunctions$1();

    TypeIntersectionScope$getContributedFunctions$1() {
        super(1);
    }

    @NotNull
    public final SimpleFunctionDescriptor invoke(@NotNull SimpleFunctionDescriptor simpleFunctionDescriptor) {
        C2668g.b(simpleFunctionDescriptor, "$receiver");
        return simpleFunctionDescriptor;
    }
}
