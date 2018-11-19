package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.FunctionCaller.BoundClassCompanionFieldGetter;
import kotlin.reflect.jvm.internal.FunctionCaller.BoundClassCompanionFieldSetter;
import kotlin.reflect.jvm.internal.FunctionCaller.BoundInstanceFieldGetter;
import kotlin.reflect.jvm.internal.FunctionCaller.BoundInstanceFieldSetter;
import kotlin.reflect.jvm.internal.FunctionCaller.BoundJvmStaticInObjectFieldGetter;
import kotlin.reflect.jvm.internal.FunctionCaller.BoundJvmStaticInObjectFieldSetter;
import kotlin.reflect.jvm.internal.FunctionCaller.ClassCompanionFieldGetter;
import kotlin.reflect.jvm.internal.FunctionCaller.ClassCompanionFieldSetter;
import kotlin.reflect.jvm.internal.FunctionCaller.InstanceFieldGetter;
import kotlin.reflect.jvm.internal.FunctionCaller.InstanceFieldSetter;
import kotlin.reflect.jvm.internal.FunctionCaller.JvmStaticInObjectFieldGetter;
import kotlin.reflect.jvm.internal.FunctionCaller.JvmStaticInObjectFieldSetter;
import kotlin.reflect.jvm.internal.FunctionCaller.StaticFieldGetter;
import kotlin.reflect.jvm.internal.FunctionCaller.StaticFieldSetter;
import kotlin.reflect.jvm.internal.KPropertyImpl.Accessor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"computeFieldCaller", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "Ljava/lang/reflect/Field;", "field", "invoke"}, k = 3, mv = {1, 1, 10})
final class KPropertyImplKt$computeCallerForAccessor$4 extends Lambda implements Function1<Field, FunctionCaller<? extends Field>> {
    final /* synthetic */ boolean $isGetter;
    final /* synthetic */ KPropertyImplKt$computeCallerForAccessor$1 $isInsideClassCompanionObject$1;
    final /* synthetic */ KPropertyImplKt$computeCallerForAccessor$2 $isJvmStaticProperty$2;
    final /* synthetic */ KPropertyImplKt$computeCallerForAccessor$3 $isNotNullProperty$3;
    final /* synthetic */ Accessor receiver$0;

    KPropertyImplKt$computeCallerForAccessor$4(Accessor accessor, KPropertyImplKt$computeCallerForAccessor$1 kPropertyImplKt$computeCallerForAccessor$1, boolean z, KPropertyImplKt$computeCallerForAccessor$3 kPropertyImplKt$computeCallerForAccessor$3, KPropertyImplKt$computeCallerForAccessor$2 kPropertyImplKt$computeCallerForAccessor$2) {
        this.receiver$0 = accessor;
        this.$isInsideClassCompanionObject$1 = kPropertyImplKt$computeCallerForAccessor$1;
        this.$isGetter = z;
        this.$isNotNullProperty$3 = kPropertyImplKt$computeCallerForAccessor$3;
        this.$isJvmStaticProperty$2 = kPropertyImplKt$computeCallerForAccessor$2;
        super(1);
    }

    @NotNull
    public final FunctionCaller<Field> invoke(@NotNull Field field) {
        C2668g.b(field, "field");
        if (this.$isInsideClassCompanionObject$1.invoke()) {
            DeclarationDescriptor containingDeclaration = this.receiver$0.getDescriptor().getContainingDeclaration();
            if (containingDeclaration == null) {
                throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            }
            Class toJavaClass = UtilKt.toJavaClass((ClassDescriptor) containingDeclaration);
            if (toJavaClass == null) {
                C2668g.a();
            }
            if (this.$isGetter) {
                if (this.receiver$0.isBound()) {
                    return new BoundClassCompanionFieldGetter(field, toJavaClass);
                }
                return new ClassCompanionFieldGetter(field, toJavaClass);
            } else if (this.receiver$0.isBound()) {
                return new BoundClassCompanionFieldSetter(field, toJavaClass);
            } else {
                return new ClassCompanionFieldSetter(field, toJavaClass);
            }
        } else if (Modifier.isStatic(field.getModifiers())) {
            if (this.$isJvmStaticProperty$2.invoke()) {
                if (this.$isGetter) {
                    if (this.receiver$0.isBound()) {
                        r0 = new BoundJvmStaticInObjectFieldGetter(field);
                    } else {
                        r0 = new JvmStaticInObjectFieldGetter(field);
                    }
                    return r0;
                }
                if (this.receiver$0.isBound()) {
                    r0 = new BoundJvmStaticInObjectFieldSetter(field, this.$isNotNullProperty$3.invoke());
                } else {
                    r0 = new JvmStaticInObjectFieldSetter(field, this.$isNotNullProperty$3.invoke());
                }
                return r0;
            } else if (this.$isGetter) {
                return new StaticFieldGetter(field);
            } else {
                return new StaticFieldSetter(field, this.$isNotNullProperty$3.invoke());
            }
        } else if (this.$isGetter) {
            if (this.receiver$0.isBound()) {
                r0 = new BoundInstanceFieldGetter(field, this.receiver$0.getProperty().getBoundReceiver());
            } else {
                r0 = new InstanceFieldGetter(field);
            }
            return r0;
        } else {
            if (this.receiver$0.isBound()) {
                r0 = new BoundInstanceFieldSetter(field, this.$isNotNullProperty$3.invoke(), this.receiver$0.getProperty().getBoundReceiver());
            } else {
                r0 = new InstanceFieldSetter(field, this.$isNotNullProperty$3.invoke());
            }
            return r0;
        }
    }
}
