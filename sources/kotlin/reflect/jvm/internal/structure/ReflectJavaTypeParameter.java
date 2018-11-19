package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C17554o;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.structure.ReflectJavaAnnotationOwner.DefaultImpls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaTypeParameter;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaElement;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaTypeParameter;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "typeVariable", "Ljava/lang/reflect/TypeVariable;", "(Ljava/lang/reflect/TypeVariable;)V", "element", "Ljava/lang/reflect/AnnotatedElement;", "getElement", "()Ljava/lang/reflect/AnnotatedElement;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getName", "()Lorg/jetbrains/kotlin/name/Name;", "getTypeVariable", "()Ljava/lang/reflect/TypeVariable;", "upperBounds", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaClassifierType;", "getUpperBounds", "()Ljava/util/List;", "equals", "", "other", "", "hashCode", "", "toString", "", "descriptors.runtime"}, k = 1, mv = {1, 1, 10})
public final class ReflectJavaTypeParameter extends ReflectJavaElement implements JavaTypeParameter, ReflectJavaAnnotationOwner {
    @NotNull
    private final TypeVariable<?> typeVariable;

    @Nullable
    public ReflectJavaAnnotation findAnnotation(@NotNull FqName fqName) {
        C2668g.b(fqName, "fqName");
        return DefaultImpls.findAnnotation(this, fqName);
    }

    @NotNull
    public List<ReflectJavaAnnotation> getAnnotations() {
        return DefaultImpls.getAnnotations(this);
    }

    public boolean isDeprecatedInJavaDoc() {
        return DefaultImpls.isDeprecatedInJavaDoc(this);
    }

    public ReflectJavaTypeParameter(@NotNull TypeVariable<?> typeVariable) {
        C2668g.b(typeVariable, "typeVariable");
        this.typeVariable = typeVariable;
    }

    @NotNull
    public List<ReflectJavaClassifierType> getUpperBounds() {
        Object bounds = this.typeVariable.getBounds();
        C2668g.a(bounds, "typeVariable.bounds");
        Collection arrayList = new ArrayList(bounds.length);
        for (Type reflectJavaClassifierType : bounds) {
            arrayList.add(new ReflectJavaClassifierType(reflectJavaClassifierType));
        }
        List<ReflectJavaClassifierType> list = (List) arrayList;
        ReflectJavaClassifierType reflectJavaClassifierType2 = (ReflectJavaClassifierType) C19299w.m68838k((List) list);
        return C2668g.a(reflectJavaClassifierType2 != null ? reflectJavaClassifierType2.getReflectType() : null, Object.class) ? C17554o.m64195a() : list;
    }

    @Nullable
    public AnnotatedElement getElement() {
        TypeVariable typeVariable = this.typeVariable;
        if (!(typeVariable instanceof AnnotatedElement)) {
            typeVariable = null;
        }
        return (AnnotatedElement) typeVariable;
    }

    @NotNull
    public Name getName() {
        Name identifier = Name.identifier(this.typeVariable.getName());
        C2668g.a(identifier, "Name.identifier(typeVariable.name)");
        return identifier;
    }

    public boolean equals(@Nullable Object obj) {
        return (!(obj instanceof ReflectJavaTypeParameter) || C2668g.a(this.typeVariable, ((ReflectJavaTypeParameter) obj).typeVariable) == null) ? null : true;
    }

    public int hashCode() {
        return this.typeVariable.hashCode();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getName());
        stringBuilder.append(": ");
        stringBuilder.append(this.typeVariable);
        return stringBuilder.toString();
    }
}
