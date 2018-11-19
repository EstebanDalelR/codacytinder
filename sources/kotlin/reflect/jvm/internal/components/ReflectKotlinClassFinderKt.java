package kotlin.reflect.jvm.internal.components;

import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.text.C19296q;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toRuntimeFqName", "", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "descriptors.runtime"}, k = 2, mv = {1, 1, 10})
public final class ReflectKotlinClassFinderKt {
    private static final String toRuntimeFqName(@NotNull ClassId classId) {
        String asString = classId.getRelativeClassName().asString();
        C2668g.a(asString, "relativeClassName.asString()");
        String a = C19296q.m68670a(asString, '.', '$', false, 4, null);
        FqName packageFqName = classId.getPackageFqName();
        C2668g.a(packageFqName, "packageFqName");
        if (packageFqName.isRoot()) {
            return a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(classId.getPackageFqName());
        stringBuilder.append('.');
        stringBuilder.append(a);
        return stringBuilder.toString();
    }
}
