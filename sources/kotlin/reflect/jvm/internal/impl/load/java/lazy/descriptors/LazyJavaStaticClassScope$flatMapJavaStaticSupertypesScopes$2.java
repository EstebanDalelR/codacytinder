package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.Set;
import kotlin.C15813i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler;
import org.jetbrains.annotations.NotNull;

public final class LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2 extends AbstractNodeHandler<ClassDescriptor, C15813i> {
    final /* synthetic */ Function1 $onJavaStaticScope;
    final /* synthetic */ Set $result;
    final /* synthetic */ ClassDescriptor $root;

    public void result() {
    }

    LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(ClassDescriptor classDescriptor, Set set, Function1 function1) {
        this.$root = classDescriptor;
        this.$result = set;
        this.$onJavaStaticScope = function1;
    }

    public boolean beforeChildren(@NotNull ClassDescriptor classDescriptor) {
        C2668g.b(classDescriptor, "current");
        if (classDescriptor == this.$root) {
            return true;
        }
        classDescriptor = classDescriptor.getStaticScope();
        if (!(classDescriptor instanceof LazyJavaStaticScope)) {
            return true;
        }
        this.$result.addAll((Collection) this.$onJavaStaticScope.invoke(classDescriptor));
        return null;
    }
}
