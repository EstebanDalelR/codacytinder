package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C18457p;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ProtoTypeTableUtilKt {
    @NotNull
    public static final List<Type> supertypes(@NotNull Class classR, @NotNull TypeTable typeTable) {
        C2668g.b(classR, "$receiver");
        C2668g.b(typeTable, "typeTable");
        List<Type> supertypeList = classR.getSupertypeList();
        if ((supertypeList.isEmpty() ^ 1) == 0) {
            supertypeList = null;
        }
        if (supertypeList != null) {
            return supertypeList;
        }
        classR = classR.getSupertypeIdList();
        C2668g.a(classR, "supertypeIdList");
        Iterable<Integer> iterable = (Iterable) classR;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (Integer num : iterable) {
            C2668g.a(num, "it");
            arrayList.add(typeTable.get(num.intValue()));
        }
        return (List) arrayList;
    }

    @Nullable
    public static final Type type(@NotNull Argument argument, @NotNull TypeTable typeTable) {
        C2668g.b(argument, "$receiver");
        C2668g.b(typeTable, "typeTable");
        if (argument.hasType()) {
            return argument.getType();
        }
        return argument.hasTypeId() ? typeTable.get(argument.getTypeId()) : null;
    }

    @Nullable
    public static final Type flexibleUpperBound(@NotNull Type type, @NotNull TypeTable typeTable) {
        C2668g.b(type, "$receiver");
        C2668g.b(typeTable, "typeTable");
        if (type.hasFlexibleUpperBound()) {
            return type.getFlexibleUpperBound();
        }
        return type.hasFlexibleUpperBoundId() ? typeTable.get(type.getFlexibleUpperBoundId()) : null;
    }

    @NotNull
    public static final List<Type> upperBounds(@NotNull TypeParameter typeParameter, @NotNull TypeTable typeTable) {
        C2668g.b(typeParameter, "$receiver");
        C2668g.b(typeTable, "typeTable");
        List<Type> upperBoundList = typeParameter.getUpperBoundList();
        if ((upperBoundList.isEmpty() ^ 1) == 0) {
            upperBoundList = null;
        }
        if (upperBoundList != null) {
            return upperBoundList;
        }
        typeParameter = typeParameter.getUpperBoundIdList();
        C2668g.a(typeParameter, "upperBoundIdList");
        Iterable<Integer> iterable = (Iterable) typeParameter;
        Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
        for (Integer num : iterable) {
            C2668g.a(num, "it");
            arrayList.add(typeTable.get(num.intValue()));
        }
        return (List) arrayList;
    }

    @NotNull
    public static final Type returnType(@NotNull Function function, @NotNull TypeTable typeTable) {
        C2668g.b(function, "$receiver");
        C2668g.b(typeTable, "typeTable");
        if (function.hasReturnType()) {
            function = function.getReturnType();
            C2668g.a(function, "returnType");
            return function;
        } else if (function.hasReturnTypeId()) {
            return typeTable.get(function.getReturnTypeId());
        } else {
            throw ((Throwable) new IllegalStateException("No returnType in ProtoBuf.Function".toString()));
        }
    }

    public static final boolean hasReceiver(@NotNull Function function) {
        C2668g.b(function, "$receiver");
        if (!function.hasReceiverType()) {
            if (function.hasReceiverTypeId() == null) {
                return null;
            }
        }
        return true;
    }

    @Nullable
    public static final Type receiverType(@NotNull Function function, @NotNull TypeTable typeTable) {
        C2668g.b(function, "$receiver");
        C2668g.b(typeTable, "typeTable");
        if (function.hasReceiverType()) {
            return function.getReceiverType();
        }
        return function.hasReceiverTypeId() ? typeTable.get(function.getReceiverTypeId()) : null;
    }

    @NotNull
    public static final Type returnType(@NotNull Property property, @NotNull TypeTable typeTable) {
        C2668g.b(property, "$receiver");
        C2668g.b(typeTable, "typeTable");
        if (property.hasReturnType()) {
            property = property.getReturnType();
            C2668g.a(property, "returnType");
            return property;
        } else if (property.hasReturnTypeId()) {
            return typeTable.get(property.getReturnTypeId());
        } else {
            throw ((Throwable) new IllegalStateException("No returnType in ProtoBuf.Property".toString()));
        }
    }

    public static final boolean hasReceiver(@NotNull Property property) {
        C2668g.b(property, "$receiver");
        if (!property.hasReceiverType()) {
            if (property.hasReceiverTypeId() == null) {
                return null;
            }
        }
        return true;
    }

    @Nullable
    public static final Type receiverType(@NotNull Property property, @NotNull TypeTable typeTable) {
        C2668g.b(property, "$receiver");
        C2668g.b(typeTable, "typeTable");
        if (property.hasReceiverType()) {
            return property.getReceiverType();
        }
        return property.hasReceiverTypeId() ? typeTable.get(property.getReceiverTypeId()) : null;
    }

    @NotNull
    public static final Type type(@NotNull ValueParameter valueParameter, @NotNull TypeTable typeTable) {
        C2668g.b(valueParameter, "$receiver");
        C2668g.b(typeTable, "typeTable");
        if (valueParameter.hasType()) {
            valueParameter = valueParameter.getType();
            C2668g.a(valueParameter, "type");
            return valueParameter;
        } else if (valueParameter.hasTypeId()) {
            return typeTable.get(valueParameter.getTypeId());
        } else {
            throw ((Throwable) new IllegalStateException("No type in ProtoBuf.ValueParameter".toString()));
        }
    }

    @Nullable
    public static final Type varargElementType(@NotNull ValueParameter valueParameter, @NotNull TypeTable typeTable) {
        C2668g.b(valueParameter, "$receiver");
        C2668g.b(typeTable, "typeTable");
        if (valueParameter.hasVarargElementType()) {
            return valueParameter.getVarargElementType();
        }
        return valueParameter.hasVarargElementTypeId() ? typeTable.get(valueParameter.getVarargElementTypeId()) : null;
    }

    @Nullable
    public static final Type outerType(@NotNull Type type, @NotNull TypeTable typeTable) {
        C2668g.b(type, "$receiver");
        C2668g.b(typeTable, "typeTable");
        if (type.hasOuterType()) {
            return type.getOuterType();
        }
        return type.hasOuterTypeId() ? typeTable.get(type.getOuterTypeId()) : null;
    }

    @Nullable
    public static final Type abbreviatedType(@NotNull Type type, @NotNull TypeTable typeTable) {
        C2668g.b(type, "$receiver");
        C2668g.b(typeTable, "typeTable");
        if (type.hasAbbreviatedType()) {
            return type.getAbbreviatedType();
        }
        return type.hasAbbreviatedTypeId() ? typeTable.get(type.getAbbreviatedTypeId()) : null;
    }

    @NotNull
    public static final Type underlyingType(@NotNull TypeAlias typeAlias, @NotNull TypeTable typeTable) {
        C2668g.b(typeAlias, "$receiver");
        C2668g.b(typeTable, "typeTable");
        if (typeAlias.hasUnderlyingType()) {
            typeAlias = typeAlias.getUnderlyingType();
            C2668g.a(typeAlias, "underlyingType");
            return typeAlias;
        } else if (typeAlias.hasUnderlyingTypeId()) {
            return typeTable.get(typeAlias.getUnderlyingTypeId());
        } else {
            throw ((Throwable) new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString()));
        }
    }

    @NotNull
    public static final Type expandedType(@NotNull TypeAlias typeAlias, @NotNull TypeTable typeTable) {
        C2668g.b(typeAlias, "$receiver");
        C2668g.b(typeTable, "typeTable");
        if (typeAlias.hasExpandedType()) {
            typeAlias = typeAlias.getExpandedType();
            C2668g.a(typeAlias, "expandedType");
            return typeAlias;
        } else if (typeAlias.hasExpandedTypeId()) {
            return typeTable.get(typeAlias.getExpandedTypeId());
        } else {
            throw ((Throwable) new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString()));
        }
    }
}
