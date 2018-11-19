package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C18457p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.AnnotationConstructorCaller.CallMode;
import kotlin.reflect.jvm.internal.AnnotationConstructorCaller.Origin;
import kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor;
import kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinConstructor;
import kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "Ljava/lang/reflect/Member;", "invoke"}, k = 3, mv = {1, 1, 10})
final class KFunctionImpl$defaultCaller$2 extends Lambda implements Function0<FunctionCaller<? extends Member>> {
    final /* synthetic */ KFunctionImpl this$0;

    KFunctionImpl$defaultCaller$2(KFunctionImpl kFunctionImpl) {
        this.this$0 = kFunctionImpl;
        super(0);
    }

    @Nullable
    public final FunctionCaller<Member> invoke() {
        Member findDefaultMethod;
        JvmFunctionSignature mapSignature = RuntimeTypeMapper.INSTANCE.mapSignature(this.this$0.getDescriptor());
        FunctionCaller<Member> functionCaller = null;
        if (mapSignature instanceof KotlinFunction) {
            KDeclarationContainerImpl container = this.this$0.getContainer();
            KotlinFunction kotlinFunction = (KotlinFunction) mapSignature;
            String methodName = kotlinFunction.getMethodName();
            String methodDesc = kotlinFunction.getMethodDesc();
            Member member$kotlin_reflection = this.this$0.getCaller().getMember$kotlin_reflection();
            if (member$kotlin_reflection == null) {
                C2668g.a();
            }
            findDefaultMethod = container.findDefaultMethod(methodName, methodDesc, Modifier.isStatic(member$kotlin_reflection.getModifiers()) ^ 1, UtilKt.isPublicInBytecode(this.this$0.getDescriptor()));
        } else if (mapSignature instanceof KotlinConstructor) {
            if (this.this$0.isAnnotationConstructor()) {
                r5 = this.this$0.getContainer().getJClass();
                Iterable<KParameter> parameters = this.this$0.getParameters();
                r1 = new ArrayList(C18457p.m66906a((Iterable) parameters, 10));
                for (KParameter name : parameters) {
                    String name2 = name.getName();
                    if (name2 == null) {
                        C2668g.a();
                    }
                    r1.add(name2);
                }
                return new AnnotationConstructorCaller(r5, (List) r1, CallMode.CALL_BY_NAME, Origin.KOTLIN, null, 16, null);
            }
            findDefaultMethod = this.this$0.getContainer().findDefaultConstructor(((KotlinConstructor) mapSignature).getConstructorDesc(), UtilKt.isPublicInBytecode(this.this$0.getDescriptor()));
        } else if (mapSignature instanceof FakeJavaAnnotationConstructor) {
            List methods = ((FakeJavaAnnotationConstructor) mapSignature).getMethods();
            r5 = this.this$0.getContainer().getJClass();
            Iterable<Method> iterable = methods;
            r1 = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (Method method : iterable) {
                C2668g.a(method, "it");
                r1.add(method.getName());
            }
            return new AnnotationConstructorCaller(r5, (List) r1, CallMode.CALL_BY_NAME, Origin.JAVA, methods);
        } else {
            findDefaultMethod = null;
        }
        if (findDefaultMethod instanceof Constructor) {
            functionCaller = this.this$0.createConstructorCaller((Constructor) findDefaultMethod);
        } else if (findDefaultMethod instanceof Method) {
            FunctionCaller.Method access$createJvmStaticInObjectCaller;
            if (this.this$0.getDescriptor().getAnnotations().findAnnotation(UtilKt.getJVM_STATIC()) != null) {
                DeclarationDescriptor containingDeclaration = this.this$0.getDescriptor().getContainingDeclaration();
                if (containingDeclaration == null) {
                    throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                } else if (!((ClassDescriptor) containingDeclaration).isCompanionObject()) {
                    access$createJvmStaticInObjectCaller = this.this$0.createJvmStaticInObjectCaller((Method) findDefaultMethod);
                    functionCaller = access$createJvmStaticInObjectCaller;
                }
            }
            access$createJvmStaticInObjectCaller = this.this$0.createStaticMethodCaller((Method) findDefaultMethod);
            functionCaller = access$createJvmStaticInObjectCaller;
        }
        return functionCaller;
    }
}
