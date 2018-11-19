package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class TypeConstructorSubstitution extends TypeSubstitution {
    public static final Companion Companion = new Companion();

    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        @NotNull
        @JvmOverloads
        public static /* synthetic */ TypeConstructorSubstitution createByConstructorsMap$default(Companion companion, Map map, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.createByConstructorsMap(map, z);
        }

        @JvmStatic
        @NotNull
        @JvmOverloads
        public final TypeConstructorSubstitution createByConstructorsMap(@NotNull Map<TypeConstructor, ? extends TypeProjection> map, boolean z) {
            C2668g.b(map, "map");
            return new TypeConstructorSubstitution$Companion$createByConstructorsMap$1(map, z);
        }

        @JvmStatic
        @NotNull
        public final TypeSubstitution create(@NotNull KotlinType kotlinType) {
            C2668g.b(kotlinType, "kotlinType");
            return create(kotlinType.getConstructor(), kotlinType.getArguments());
        }

        @JvmStatic
        @NotNull
        public final TypeSubstitution create(@NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list) {
            C2668g.b(typeConstructor, "typeConstructor");
            C2668g.b(list, "arguments");
            List parameters = typeConstructor.getParameters();
            C2668g.a(parameters, "parameters");
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) C19299w.m68834i(parameters);
            if (!(typeParameterDescriptor != null ? typeParameterDescriptor.isCapturedFromOuterDeclaration() : false)) {
                return (TypeSubstitution) new IndexedParametersSubstitution(parameters, list);
            }
            Companion companion = this;
            typeConstructor = typeConstructor.getParameters();
            C2668g.a(typeConstructor, "typeConstructor.parameters");
            Iterable<TypeParameterDescriptor> iterable = (Iterable) typeConstructor;
            Collection arrayList = new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (TypeParameterDescriptor typeParameterDescriptor2 : iterable) {
                C2668g.a(typeParameterDescriptor2, "it");
                arrayList.add(typeParameterDescriptor2.getTypeConstructor());
            }
            return createByConstructorsMap$default(companion, ah.m66885a((Iterable) C19299w.m68815c((Iterable) (List) arrayList, (Iterable) list)), false, 2, null);
        }
    }

    @JvmStatic
    @NotNull
    public static final TypeSubstitution create(@NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> list) {
        return Companion.create(typeConstructor, list);
    }

    @JvmStatic
    @NotNull
    @JvmOverloads
    public static final TypeConstructorSubstitution createByConstructorsMap(@NotNull Map<TypeConstructor, ? extends TypeProjection> map) {
        return Companion.createByConstructorsMap$default(Companion, map, false, 2, null);
    }

    @Nullable
    public abstract TypeProjection get(@NotNull TypeConstructor typeConstructor);

    @Nullable
    public TypeProjection get(@NotNull KotlinType kotlinType) {
        C2668g.b(kotlinType, "key");
        return get(kotlinType.getConstructor());
    }
}
