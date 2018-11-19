package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C15811g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2668g;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import org.jetbrains.annotations.NotNull;

final class LazyJavaPackageFragment$binaryClasses$2 extends Lambda implements Function0<Map<String, ? extends KotlinJvmBinaryClass>> {
    final /* synthetic */ LazyJavaPackageFragment this$0;

    LazyJavaPackageFragment$binaryClasses$2(LazyJavaPackageFragment lazyJavaPackageFragment) {
        this.this$0 = lazyJavaPackageFragment;
        super(0);
    }

    @NotNull
    public final Map<String, KotlinJvmBinaryClass> invoke() {
        PackagePartProvider packageMapper = this.this$0.f59982c.getComponents().getPackageMapper();
        String asString = this.this$0.getFqName().asString();
        C2668g.a(asString, "fqName.asString()");
        Iterable<String> findPackageParts = packageMapper.findPackageParts(asString);
        Collection arrayList = new ArrayList();
        for (String str : findPackageParts) {
            JvmClassName byInternalName = JvmClassName.byInternalName(str);
            C2668g.a(byInternalName, "JvmClassName.byInternalName(partName)");
            ClassId topLevel = ClassId.topLevel(byInternalName.getFqNameForTopLevelClassMaybeWithDollars());
            KotlinClassFinder kotlinClassFinder = this.this$0.f59982c.getComponents().getKotlinClassFinder();
            C2668g.a(topLevel, "classId");
            KotlinJvmBinaryClass findKotlinClass = kotlinClassFinder.findKotlinClass(topLevel);
            Object a = findKotlinClass != null ? C15811g.m59834a(str, findKotlinClass) : null;
            if (a != null) {
                arrayList.add(a);
            }
        }
        return ah.m66885a((Iterable) (List) arrayList);
    }
}
