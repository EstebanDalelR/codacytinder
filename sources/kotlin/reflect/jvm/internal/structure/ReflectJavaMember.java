package kotlin.reflect.jvm.internal.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19066k;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner.DefaultImpls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J=\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\"0\"2\u0006\u0010&\u001a\u00020\u001bH\u0004¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0013H\u0016J\b\u0010)\u001a\u00020*H\u0016R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006+"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaMember;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaMember;", "()V", "containingClass", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "getContainingClass", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaClass;", "element", "Ljava/lang/reflect/AnnotatedElement;", "getElement", "()Ljava/lang/reflect/AnnotatedElement;", "member", "Ljava/lang/reflect/Member;", "getMember", "()Ljava/lang/reflect/Member;", "modifiers", "", "getModifiers", "()I", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "equals", "", "other", "", "getValueParameters", "", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaValueParameter;", "parameterTypes", "", "Ljava/lang/reflect/Type;", "parameterAnnotations", "", "isVararg", "([Ljava/lang/reflect/Type;[[Ljava/lang/annotation/Annotation;Z)Ljava/util/List;", "hashCode", "toString", "", "descriptors.runtime"}, k = 1, mv = {1, 1, 10})
public abstract class ReflectJavaMember extends ReflectJavaElement implements JavaMember, ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner {
    @NotNull
    public abstract Member getMember();

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

    @NotNull
    public AnnotatedElement getElement() {
        Member member = getMember();
        if (member != null) {
            return (AnnotatedElement) member;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
    }

    public int getModifiers() {
        return getMember().getModifiers();
    }

    @NotNull
    public Name getName() {
        Name identifier;
        String name = getMember().getName();
        if (name != null) {
            identifier = Name.identifier(name);
            if (identifier != null) {
                return identifier;
            }
        }
        identifier = SpecialNames.NO_NAME_PROVIDED;
        C2668g.a(identifier, "SpecialNames.NO_NAME_PROVIDED");
        return identifier;
    }

    @NotNull
    public ReflectJavaClass getContainingClass() {
        Class declaringClass = getMember().getDeclaringClass();
        C2668g.a(declaringClass, "member.declaringClass");
        return new ReflectJavaClass(declaringClass);
    }

    @NotNull
    protected final List<JavaValueParameter> getValueParameters(@NotNull Type[] typeArr, @NotNull Annotation[][] annotationArr, boolean z) {
        C2668g.b(typeArr, "parameterTypes");
        C2668g.b(annotationArr, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(typeArr.length);
        List loadParameterNames = Java8ParameterNamesLoader.INSTANCE.loadParameterNames(getMember());
        int length = typeArr.length;
        int i = 0;
        while (i < length) {
            ReflectJavaType create = ReflectJavaType.Factory.create(typeArr[i]);
            String str = loadParameterNames != null ? (String) loadParameterNames.get(i) : null;
            boolean z2 = z && i == C19066k.m68006h(typeArr);
            arrayList.add(new ReflectJavaValueParameter(create, annotationArr[i], str, z2));
            i++;
        }
        return arrayList;
    }

    public boolean equals(@Nullable Object obj) {
        return (!(obj instanceof ReflectJavaMember) || C2668g.a(getMember(), ((ReflectJavaMember) obj).getMember()) == null) ? null : true;
    }

    public int hashCode() {
        return getMember().hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append(": ");
        stringBuilder.append(getMember());
        return stringBuilder.toString();
    }
}
