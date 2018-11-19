package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C19299w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import org.jetbrains.annotations.NotNull;

final class LazyJavaScope$properties$1 extends Lambda implements Function1<Name, List<? extends PropertyDescriptor>> {
    final /* synthetic */ LazyJavaScope this$0;

    LazyJavaScope$properties$1(LazyJavaScope lazyJavaScope) {
        this.this$0 = lazyJavaScope;
        super(1);
    }

    @NotNull
    public final List<PropertyDescriptor> invoke(@NotNull Name name) {
        C2668g.b(name, "name");
        ArrayList arrayList = new ArrayList();
        JavaField findFieldByName = ((DeclaredMemberIndex) this.this$0.getDeclaredMemberIndex().invoke()).findFieldByName(name);
        if (!(findFieldByName == null || findFieldByName.isEnumEntry())) {
            arrayList.add(this.this$0.resolveProperty(findFieldByName));
        }
        Collection collection = arrayList;
        this.this$0.computeNonDeclaredProperties(name, collection);
        if (DescriptorUtils.isAnnotationClass(this.this$0.getOwnerDescriptor()) != null) {
            return C19299w.m68840l(arrayList);
        }
        return C19299w.m68840l(this.this$0.getC().getComponents().getSignatureEnhancement().enhanceSignatures(this.this$0.getC(), collection));
    }
}
