package kotlin.reflect.jvm.internal;

import com.tinder.api.ManagerWebServices;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19066k;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.text.C19298r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0006\u0005\u0006\u0007\b\t\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0001\u0006\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "()V", "asString", "", "BuiltInFunction", "FakeJavaAnnotationConstructor", "JavaConstructor", "JavaMethod", "KotlinConstructor", "KotlinFunction", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$BuiltInFunction;", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
public abstract class JvmFunctionSignature {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$BuiltInFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "signature", "", "(Ljava/lang/String;)V", "asString", "getMember", "Ljava/lang/reflect/Member;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Predefined", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
    public static class BuiltInFunction extends JvmFunctionSignature {
        private final String signature;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$BuiltInFunction$Predefined;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$BuiltInFunction;", "signature", "", "member", "Ljava/lang/reflect/Member;", "(Ljava/lang/String;Ljava/lang/reflect/Member;)V", "getMember", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
        public static final class Predefined extends BuiltInFunction {
            private final Member member;

            public Predefined(@NotNull String str, @NotNull Member member) {
                C2668g.b(str, ManagerWebServices.PARAM_SIGNATURE);
                C2668g.b(member, "member");
                super(str);
                this.member = member;
            }

            @NotNull
            public Member getMember(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl) {
                C2668g.b(kDeclarationContainerImpl, "container");
                return this.member;
            }
        }

        @Nullable
        public Member getMember(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl) {
            C2668g.b(kDeclarationContainerImpl, "container");
            return null;
        }

        public BuiltInFunction(@NotNull String str) {
            C2668g.b(str, ManagerWebServices.PARAM_SIGNATURE);
            super();
            this.signature = str;
        }

        @NotNull
        public String asString() {
            return this.signature;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "getJClass", "()Ljava/lang/Class;", "methods", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "getMethods", "()Ljava/util/List;", "asString", "", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
    public static final class FakeJavaAnnotationConstructor extends JvmFunctionSignature {
        @NotNull
        private final Class<?> jClass;
        @NotNull
        private final List<Method> methods;

        public FakeJavaAnnotationConstructor(@NotNull Class<?> cls) {
            C2668g.b(cls, "jClass");
            super();
            this.jClass = cls;
            cls = this.jClass.getDeclaredMethods();
            C2668g.a(cls, "jClass.declaredMethods");
            this.methods = C19066k.m67996c((Object[]) cls, (Comparator) new C15844x577aa3c4());
        }

        @NotNull
        public final List<Method> getMethods() {
            return this.methods;
        }

        @NotNull
        public String asString() {
            return C19299w.m68797a(this.methods, "", "<init>(", ")V", 0, null, JvmFunctionSignature$FakeJavaAnnotationConstructor$asString$1.INSTANCE, 24, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "constructor", "Ljava/lang/reflect/Constructor;", "(Ljava/lang/reflect/Constructor;)V", "getConstructor", "()Ljava/lang/reflect/Constructor;", "asString", "", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
    public static final class JavaConstructor extends JvmFunctionSignature {
        @NotNull
        private final Constructor<?> constructor;

        public JavaConstructor(@NotNull Constructor<?> constructor) {
            C2668g.b(constructor, "constructor");
            super();
            this.constructor = constructor;
        }

        @NotNull
        public final Constructor<?> getConstructor() {
            return this.constructor;
        }

        @NotNull
        public String asString() {
            Object parameterTypes = this.constructor.getParameterTypes();
            C2668g.a(parameterTypes, "constructor.parameterTypes");
            return C19066k.m67968a(parameterTypes, "", "<init>(", ")V", 0, null, JvmFunctionSignature$JavaConstructor$asString$1.INSTANCE, 24, null);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)V", "getMethod", "()Ljava/lang/reflect/Method;", "asString", "", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
    public static final class JavaMethod extends JvmFunctionSignature {
        @NotNull
        private final Method method;

        public JavaMethod(@NotNull Method method) {
            C2668g.b(method, "method");
            super();
            this.method = method;
        }

        @NotNull
        public final Method getMethod() {
            return this.method;
        }

        @NotNull
        public String asString() {
            return RuntimeTypeMapperKt.getSignature(this.method);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "signature", "", "(Ljava/lang/String;)V", "constructorDesc", "getConstructorDesc", "()Ljava/lang/String;", "getSignature", "asString", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
    public static final class KotlinConstructor extends JvmFunctionSignature {
        @NotNull
        private final String signature;

        public KotlinConstructor(@NotNull String str) {
            C2668g.b(str, ManagerWebServices.PARAM_SIGNATURE);
            super();
            this.signature = str;
        }

        @NotNull
        public final String getConstructorDesc() {
            String str = this.signature;
            int a = C19298r.m68740a((CharSequence) this.signature, '(', 0, false, 6, null);
            if (str == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            str = str.substring(a);
            C2668g.a(str, "(this as java.lang.String).substring(startIndex)");
            return str;
        }

        @NotNull
        public String asString() {
            return this.signature;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "signature", "", "(Ljava/lang/String;)V", "methodDesc", "getMethodDesc", "()Ljava/lang/String;", "methodName", "getMethodName", "getSignature", "asString", "kotlin-reflection"}, k = 1, mv = {1, 1, 10})
    public static final class KotlinFunction extends JvmFunctionSignature {
        @NotNull
        private final String signature;

        public KotlinFunction(@NotNull String str) {
            C2668g.b(str, ManagerWebServices.PARAM_SIGNATURE);
            super();
            this.signature = str;
        }

        @NotNull
        public final String getMethodName() {
            return C19298r.m68749a(this.signature, '(', null, 2, null);
        }

        @NotNull
        public final String getMethodDesc() {
            String str = this.signature;
            int a = C19298r.m68740a((CharSequence) this.signature, '(', 0, false, 6, null);
            if (str == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            str = str.substring(a);
            C2668g.a(str, "(this as java.lang.String).substring(startIndex)");
            return str;
        }

        @NotNull
        public String asString() {
            return this.signature;
        }
    }

    @NotNull
    public abstract String asString();

    private JvmFunctionSignature() {
    }
}
