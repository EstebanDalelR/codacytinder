package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import com.foursquare.internal.util.C1948m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import org.jetbrains.annotations.NotNull;

final class ClassDeclaredMemberIndex$methodFilter$1 extends Lambda implements Function1<JavaMethod, Boolean> {
    final /* synthetic */ ClassDeclaredMemberIndex this$0;

    ClassDeclaredMemberIndex$methodFilter$1(ClassDeclaredMemberIndex classDeclaredMemberIndex) {
        this.this$0 = classDeclaredMemberIndex;
        super(1);
    }

    public /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((JavaMethod) obj));
    }

    public final boolean invoke(@NotNull JavaMethod javaMethod) {
        C2668g.b(javaMethod, C1948m.f5228a);
        return (((Boolean) this.this$0.memberFilter.invoke(javaMethod)).booleanValue() && DescriptorResolverUtils.isObjectMethodInInterface(javaMethod) == null) ? true : null;
    }
}
