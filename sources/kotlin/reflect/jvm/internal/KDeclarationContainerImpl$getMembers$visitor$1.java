package kotlin.reflect.jvm.internal;

import com.tinder.api.ManagerWebServices;
import kotlin.C15813i;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorVisitorEmptyBodies;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J!\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\tJ!\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\fJ!\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"kotlin/reflect/jvm/internal/KDeclarationContainerImpl$getMembers$visitor$1", "Lkotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorVisitorEmptyBodies;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "visitConstructorDescriptor", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "data", "(Lorg/jetbrains/kotlin/descriptors/ConstructorDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "visitFunctionDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "visitPropertyDescriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lkotlin/Unit;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
public final class KDeclarationContainerImpl$getMembers$visitor$1 extends DeclarationDescriptorVisitorEmptyBodies<KCallableImpl<?>, C15813i> {
    final /* synthetic */ KDeclarationContainerImpl this$0;

    KDeclarationContainerImpl$getMembers$visitor$1(KDeclarationContainerImpl kDeclarationContainerImpl) {
        this.this$0 = kDeclarationContainerImpl;
    }

    @NotNull
    public KCallableImpl<?> visitPropertyDescriptor(@NotNull PropertyDescriptor propertyDescriptor, @NotNull C15813i c15813i) {
        C2668g.b(propertyDescriptor, "descriptor");
        C2668g.b(c15813i, ManagerWebServices.FB_DATA);
        return this.this$0.createProperty(propertyDescriptor);
    }

    @NotNull
    public KCallableImpl<?> visitFunctionDescriptor(@NotNull FunctionDescriptor functionDescriptor, @NotNull C15813i c15813i) {
        C2668g.b(functionDescriptor, "descriptor");
        C2668g.b(c15813i, ManagerWebServices.FB_DATA);
        return (KCallableImpl) new KFunctionImpl(this.this$0, functionDescriptor);
    }

    @NotNull
    public KCallableImpl<?> visitConstructorDescriptor(@NotNull ConstructorDescriptor constructorDescriptor, @NotNull C15813i c15813i) {
        C2668g.b(constructorDescriptor, "descriptor");
        C2668g.b(c15813i, ManagerWebServices.FB_DATA);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No constructors should appear in this scope: ");
        stringBuilder.append(constructorDescriptor);
        throw ((Throwable) new IllegalStateException(stringBuilder.toString()));
    }
}
