package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.List;
import kotlin.collections.C17554o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import org.jetbrains.annotations.NotNull;

final class StaticScopeForKotlinEnum$functions$2 extends Lambda implements Function0<List<? extends SimpleFunctionDescriptor>> {
    final /* synthetic */ StaticScopeForKotlinEnum this$0;

    StaticScopeForKotlinEnum$functions$2(StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        this.this$0 = staticScopeForKotlinEnum;
        super(0);
    }

    @NotNull
    public final List<SimpleFunctionDescriptor> invoke() {
        return C17554o.m64199b((Object[]) new SimpleFunctionDescriptor[]{DescriptorFactory.createEnumValueOfMethod(this.this$0.containingClass), DescriptorFactory.createEnumValuesMethod(this.this$0.containingClass)});
    }
}
