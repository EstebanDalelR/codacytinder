package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C18457p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.AnnotationConstructorCaller.CallMode;
import kotlin.reflect.jvm.internal.AnnotationConstructorCaller.Origin;
import kotlin.reflect.jvm.internal.JvmFunctionSignature.BuiltInFunction;
import kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor;
import kotlin.reflect.jvm.internal.JvmFunctionSignature.JavaConstructor;
import kotlin.reflect.jvm.internal.JvmFunctionSignature.JavaMethod;
import kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinConstructor;
import kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/FunctionCaller;", "Ljava/lang/reflect/Member;", "invoke"}, k = 3, mv = {1, 1, 10})
final class KFunctionImpl$caller$2 extends Lambda implements Function0<FunctionCaller<? extends Member>> {
    final /* synthetic */ KFunctionImpl this$0;

    KFunctionImpl$caller$2(KFunctionImpl kFunctionImpl) {
        this.this$0 = kFunctionImpl;
        super(0);
    }

    @NotNull
    public final FunctionCaller<Member> invoke() {
        Object findConstructorBySignature;
        FunctionCaller<Member> access$createConstructorCaller;
        JvmFunctionSignature mapSignature = RuntimeTypeMapper.INSTANCE.mapSignature(this.this$0.getDescriptor());
        Class jClass;
        Collection arrayList;
        if (mapSignature instanceof KotlinConstructor) {
            if (this.this$0.isAnnotationConstructor()) {
                jClass = this.this$0.getContainer().getJClass();
                Iterable<KParameter> parameters = this.this$0.getParameters();
                arrayList = new ArrayList(C18457p.m66906a((Iterable) parameters, 10));
                for (KParameter name : parameters) {
                    String name2 = name.getName();
                    if (name2 == null) {
                        C2668g.a();
                    }
                    arrayList.add(name2);
                }
                return new AnnotationConstructorCaller(jClass, (List) arrayList, CallMode.POSITIONAL_CALL, Origin.KOTLIN, null, 16, null);
            }
            findConstructorBySignature = this.this$0.getContainer().findConstructorBySignature(((KotlinConstructor) mapSignature).getConstructorDesc(), UtilKt.isPublicInBytecode(this.this$0.getDescriptor()));
        } else if (mapSignature instanceof KotlinFunction) {
            KotlinFunction kotlinFunction = (KotlinFunction) mapSignature;
            findConstructorBySignature = this.this$0.getContainer().findMethodBySignature(kotlinFunction.getMethodName(), kotlinFunction.getMethodDesc(), UtilKt.isPublicInBytecode(this.this$0.getDescriptor()));
        } else if (mapSignature instanceof JavaMethod) {
            findConstructorBySignature = ((JavaMethod) mapSignature).getMethod();
        } else if (mapSignature instanceof JavaConstructor) {
            findConstructorBySignature = ((JavaConstructor) mapSignature).getConstructor();
        } else if (mapSignature instanceof FakeJavaAnnotationConstructor) {
            List methods = ((FakeJavaAnnotationConstructor) mapSignature).getMethods();
            jClass = this.this$0.getContainer().getJClass();
            Iterable<Method> iterable = methods;
            arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (Method method : iterable) {
                C2668g.a(method, "it");
                arrayList.add(method.getName());
            }
            return new AnnotationConstructorCaller(jClass, (List) arrayList, CallMode.POSITIONAL_CALL, Origin.JAVA, methods);
        } else if (mapSignature instanceof BuiltInFunction) {
            findConstructorBySignature = ((BuiltInFunction) mapSignature).getMember(this.this$0.getContainer());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (findConstructorBySignature instanceof Constructor) {
            access$createConstructorCaller = this.this$0.createConstructorCaller((Constructor) findConstructorBySignature);
        } else if (findConstructorBySignature instanceof Method) {
            FunctionCaller.Method access$createInstanceMethodCaller;
            Method method2 = (Method) findConstructorBySignature;
            if (!Modifier.isStatic(method2.getModifiers())) {
                access$createInstanceMethodCaller = this.this$0.createInstanceMethodCaller(method2);
            } else if (this.this$0.getDescriptor().getAnnotations().findAnnotation(UtilKt.getJVM_STATIC()) != null) {
                access$createInstanceMethodCaller = this.this$0.createJvmStaticInObjectCaller(method2);
            } else {
                access$createInstanceMethodCaller = this.this$0.createStaticMethodCaller(method2);
            }
            access$createConstructorCaller = access$createInstanceMethodCaller;
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Call is not yet supported for this function: ");
            stringBuilder.append(this.this$0.getDescriptor());
            stringBuilder.append(" (member = ");
            stringBuilder.append(findConstructorBySignature);
            stringBuilder.append(')');
            throw new KotlinReflectionInternalError(stringBuilder.toString());
        }
        return access$createConstructorCaller;
    }
}
