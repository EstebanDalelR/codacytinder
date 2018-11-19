package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import org.jetbrains.annotations.NotNull;

public class IntersectionTypeConstructor implements TypeConstructor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final int hashCode = this.intersectedTypes.hashCode();
    private final Set<KotlinType> intersectedTypes;

    public ClassifierDescriptor getDeclarationDescriptor() {
        return null;
    }

    public boolean isDenotable() {
        return false;
    }

    public IntersectionTypeConstructor(Collection<KotlinType> collection) {
        this.intersectedTypes = new LinkedHashSet(collection);
    }

    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return Collections.emptyList();
    }

    @NotNull
    public Collection<KotlinType> getSupertypes() {
        return this.intersectedTypes;
    }

    public MemberScope createScopeForKotlinType() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("member scope for intersection type ");
        stringBuilder.append(this);
        return TypeIntersectionScope.create(stringBuilder.toString(), this.intersectedTypes);
    }

    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        return ((KotlinType) this.intersectedTypes.iterator().next()).getConstructor().getBuiltIns();
    }

    public String toString() {
        return makeDebugNameForIntersectionType(this.intersectedTypes);
    }

    private static String makeDebugNameForIntersectionType(Iterable<KotlinType> iterable) {
        StringBuilder stringBuilder = new StringBuilder("{");
        iterable = iterable.iterator();
        while (iterable.hasNext()) {
            stringBuilder.append(((KotlinType) iterable.next()).toString());
            if (iterable.hasNext()) {
                stringBuilder.append(" & ");
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) obj;
                if (this.intersectedTypes == null) {
                    return intersectionTypeConstructor.intersectedTypes == null;
                } else {
                    if (this.intersectedTypes.equals(intersectionTypeConstructor.intersectedTypes) == null) {
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.hashCode;
    }
}
