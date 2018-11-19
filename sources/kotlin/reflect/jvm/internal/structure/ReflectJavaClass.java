package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C17554o;
import kotlin.collections.C18457p;
import kotlin.collections.C19066k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C15827k;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner.DefaultImpls;
import kotlin.sequences.C19155k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0011\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0002\u0010\u0007J\u0013\u00108\u001a\u00020\u001b2\b\u00109\u001a\u0004\u0018\u00010:H\u0002J\u0012\u0010;\u001a\u0004\u0018\u00010\u00002\u0006\u0010*\u001a\u00020\u0018H\u0016J\b\u0010<\u001a\u00020'H\u0016J\u0010\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020AH\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\fR\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0012\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\u0004\u0018\u00010 8VX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\t8VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\fR\u0014\u0010&\u001a\u00020'8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0016\u0010-\u001a\u0004\u0018\u00010\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\b\u0012\u0004\u0012\u000202018VX\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002060\t8VX\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\f¨\u0006B"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClass;", "klass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "constructors", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaConstructor;", "getConstructors", "()Ljava/util/List;", "element", "getElement", "()Ljava/lang/Class;", "fields", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaField;", "getFields", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getFqName", "()Lorg/jetbrains/kotlin/name/FqName;", "innerClassNames", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getInnerClassNames", "isAnnotationType", "", "()Z", "isEnum", "isInterface", "lightClassOriginKind", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/LightClassOriginKind;", "getLightClassOriginKind", "()Lorg/jetbrains/kotlin/load/java/structure/LightClassOriginKind;", "methods", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaMethod;", "getMethods", "modifiers", "", "getModifiers", "()I", "name", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "outerClass", "getOuterClass", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "supertypes", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaClassifierType;", "getSupertypes", "()Ljava/util/Collection;", "typeParameters", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "getTypeParameters", "equals", "other", "", "findInnerClass", "hashCode", "isEnumValuesOrValueOf", "method", "Ljava/lang/reflect/Method;", "toString", "", "descriptors.runtime"}, k = 1, mv = {1, 1, 10})
public final class ReflectJavaClass extends ReflectJavaElement implements JavaClass, ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner {
    private final Class<?> klass;

    @Nullable
    public LightClassOriginKind getLightClassOriginKind() {
        return null;
    }

    @Nullable
    public ReflectJavaAnnotation findAnnotation(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        return DefaultImpls.findAnnotation(this, fqName);
    }

    @NotNull
    public List<ReflectJavaAnnotation> getAnnotations() {
        return DefaultImpls.getAnnotations(this);
    }

    @NotNull
    public Visibility getVisibility() {
        return ReflectJavaModifierListOwner.DefaultImpls.getVisibility(this);
    }

    public boolean isAbstract() {
        return ReflectJavaModifierListOwner.DefaultImpls.isAbstract(this);
    }

    public boolean isDeprecatedInJavaDoc() {
        return DefaultImpls.isDeprecatedInJavaDoc(this);
    }

    public boolean isFinal() {
        return ReflectJavaModifierListOwner.DefaultImpls.isFinal(this);
    }

    public boolean isStatic() {
        return ReflectJavaModifierListOwner.DefaultImpls.isStatic(this);
    }

    public ReflectJavaClass(@NotNull Class<?> cls) {
        C2668g.b(cls, "klass");
        this.klass = cls;
    }

    @NotNull
    public Class<?> getElement() {
        return this.klass;
    }

    public int getModifiers() {
        return this.klass.getModifiers();
    }

    @NotNull
    public List<Name> getInnerClassNames() {
        Object declaredClasses = this.klass.getDeclaredClasses();
        C2668g.a(declaredClasses, "klass.declaredClasses");
        return C19155k.m68033f(C19155k.m68034f(C19155k.m68026b(C19066k.m68012n(declaredClasses), ReflectJavaClass$innerClassNames$1.INSTANCE), ReflectJavaClass$innerClassNames$2.INSTANCE));
    }

    @NotNull
    public FqName getFqName() {
        FqName asSingleFqName = ReflectClassUtilKt.getClassId(this.klass).asSingleFqName();
        C2668g.a(asSingleFqName, "klass.classId.asSingleFqName()");
        return asSingleFqName;
    }

    @Nullable
    public ReflectJavaClass getOuterClass() {
        Class declaringClass = this.klass.getDeclaringClass();
        return declaringClass != null ? new ReflectJavaClass(declaringClass) : null;
    }

    @NotNull
    public Collection<JavaClassifierType> getSupertypes() {
        if (C2668g.a(this.klass, Object.class)) {
            return C17554o.m64195a();
        }
        C15827k c15827k = new C15827k(2);
        Object genericSuperclass = this.klass.getGenericSuperclass();
        if (genericSuperclass == null) {
            genericSuperclass = Object.class;
        }
        c15827k.m59872b(genericSuperclass);
        genericSuperclass = this.klass.getGenericInterfaces();
        C2668g.a(genericSuperclass, "klass.genericInterfaces");
        c15827k.m59870a(genericSuperclass);
        Iterable<Type> b = C17554o.m64199b((Object[]) (Type[]) c15827k.m59871a(new Type[c15827k.m59869a()]));
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) b, 10));
        for (Type reflectJavaClassifierType : b) {
            arrayList.add(new ReflectJavaClassifierType(reflectJavaClassifierType));
        }
        return (List) arrayList;
    }

    @NotNull
    public List<ReflectJavaMethod> getMethods() {
        Object declaredMethods = this.klass.getDeclaredMethods();
        C2668g.a(declaredMethods, "klass.declaredMethods");
        return C19155k.m68033f(C19155k.m68032e(C19155k.m68024a(C19066k.m68012n(declaredMethods), (Function1) new ReflectJavaClass$methods$1(this)), ReflectJavaClass$methods$2.INSTANCE));
    }

    private final boolean isEnumValuesOrValueOf(Method method) {
        String name = method.getName();
        if (name == null) {
            return false;
        }
        int hashCode = name.hashCode();
        if (hashCode != -823812830) {
            if (hashCode != 231605032) {
                return false;
            }
            if (!name.equals("valueOf")) {
                return false;
            }
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        } else if (!name.equals("values")) {
            return false;
        } else {
            method = method.getParameterTypes();
            C2668g.a(method, "method.parameterTypes");
            if (method.length == null) {
                return true;
            }
            return false;
        }
    }

    @NotNull
    public List<ReflectJavaField> getFields() {
        Object declaredFields = this.klass.getDeclaredFields();
        C2668g.a(declaredFields, "klass.declaredFields");
        return C19155k.m68033f(C19155k.m68032e(C19155k.m68024a(C19066k.m68012n(declaredFields), (Function1) ReflectJavaClass$fields$1.INSTANCE), ReflectJavaClass$fields$2.INSTANCE));
    }

    @NotNull
    public List<ReflectJavaConstructor> getConstructors() {
        Object declaredConstructors = this.klass.getDeclaredConstructors();
        C2668g.a(declaredConstructors, "klass.declaredConstructors");
        return C19155k.m68033f(C19155k.m68032e(C19155k.m68024a(C19066k.m68012n(declaredConstructors), (Function1) ReflectJavaClass$constructors$1.INSTANCE), ReflectJavaClass$constructors$2.INSTANCE));
    }

    @NotNull
    public Name getName() {
        Name identifier = Name.identifier(this.klass.getSimpleName());
        C2668g.a(identifier, "Name.identifier(klass.simpleName)");
        return identifier;
    }

    @NotNull
    public List<ReflectJavaTypeParameter> getTypeParameters() {
        Object typeParameters = this.klass.getTypeParameters();
        C2668g.a(typeParameters, "klass.typeParameters");
        Collection arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable reflectJavaTypeParameter : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(reflectJavaTypeParameter));
        }
        return (List) arrayList;
    }

    public boolean isInterface() {
        return this.klass.isInterface();
    }

    public boolean isAnnotationType() {
        return this.klass.isAnnotation();
    }

    public boolean isEnum() {
        return this.klass.isEnum();
    }

    public boolean equals(@Nullable Object obj) {
        return (!(obj instanceof ReflectJavaClass) || C2668g.a(this.klass, ((ReflectJavaClass) obj).klass) == null) ? null : true;
    }

    public int hashCode() {
        return this.klass.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append(": ");
        stringBuilder.append(this.klass);
        return stringBuilder.toString();
    }
}
