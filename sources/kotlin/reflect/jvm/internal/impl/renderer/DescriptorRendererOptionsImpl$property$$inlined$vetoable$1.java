package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.C2668g;
import kotlin.properties.C17564c;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

public final class DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 extends C17564c<T> {
    final /* synthetic */ Object $initialValue;
    final /* synthetic */ DescriptorRendererOptionsImpl this$0;

    public DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(Object obj, Object obj2, DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        this.$initialValue = obj;
        this.this$0 = descriptorRendererOptionsImpl;
        super(obj2);
    }

    protected boolean beforeChange(@NotNull KProperty<?> kProperty, T t, T t2) {
        C2668g.b(kProperty, "property");
        if (this.this$0.isLocked() == null) {
            return true;
        }
        throw ((Throwable) new IllegalStateException("Cannot modify readonly DescriptorRendererOptions"));
    }
}
