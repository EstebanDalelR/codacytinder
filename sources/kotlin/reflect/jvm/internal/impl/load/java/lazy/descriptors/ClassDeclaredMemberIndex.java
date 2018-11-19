package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C17554o;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.C19155k;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ClassDeclaredMemberIndex implements DeclaredMemberIndex {
    private final Map<Name, JavaField> fields;
    @NotNull
    private final JavaClass jClass;
    private final Function1<JavaMember, Boolean> memberFilter;
    private final Function1<JavaMethod, Boolean> methodFilter = ((Function1) new ClassDeclaredMemberIndex$methodFilter$1(this));
    private final Map<Name, List<JavaMethod>> methods;

    public ClassDeclaredMemberIndex(@NotNull JavaClass javaClass, @NotNull Function1<? super JavaMember, Boolean> function1) {
        C2668g.b(javaClass, "jClass");
        C2668g.b(function1, "memberFilter");
        this.jClass = javaClass;
        this.memberFilter = function1;
        Map map = (Map) new LinkedHashMap();
        for (Object next : C19155k.m68024a((Sequence) C19299w.m68846r(this.jClass.getMethods()), (Function1) this.methodFilter)) {
            Name name = ((JavaMethod) next).getName();
            ArrayList arrayList = map.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(name, arrayList);
            }
            arrayList.add(next);
        }
        this.methods = map;
        map = (Map) new LinkedHashMap();
        for (Object next2 : C19155k.m68024a((Sequence) C19299w.m68846r(this.jClass.getFields()), (Function1) this.memberFilter)) {
            map.put(((JavaField) next2).getName(), next2);
        }
        this.fields = map;
    }

    @NotNull
    public Collection<JavaMethod> findMethodsByName(@NotNull Name name) {
        C2668g.b(name, "name");
        name = (List) this.methods.get(name);
        if (name == null) {
            name = C17554o.m64195a();
        }
        return (Collection) name;
    }

    @NotNull
    public Set<Name> getMethodNames() {
        Collection linkedHashSet = new LinkedHashSet();
        for (JavaMethod name : C19155k.m68024a(C19299w.m68846r(this.jClass.getMethods()), this.methodFilter)) {
            linkedHashSet.add(name.getName());
        }
        return (Set) linkedHashSet;
    }

    @Nullable
    public JavaField findFieldByName(@NotNull Name name) {
        C2668g.b(name, "name");
        return (JavaField) this.fields.get(name);
    }

    @NotNull
    public Set<Name> getFieldNames() {
        Collection linkedHashSet = new LinkedHashSet();
        for (JavaField name : C19155k.m68024a(C19299w.m68846r(this.jClass.getFields()), this.memberFilter)) {
            linkedHashSet.add(name.getName());
        }
        return (Set) linkedHashSet;
    }
}
