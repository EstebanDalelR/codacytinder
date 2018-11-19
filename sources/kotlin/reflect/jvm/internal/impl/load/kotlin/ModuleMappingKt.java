package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.C2668g;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;

public final class ModuleMappingKt {
    private static final String internalNameOf(String str, String str2) {
        str = JvmClassName.byFqNameWithoutInnerClasses(new FqName(str).child(Name.identifier(str2)));
        C2668g.a(str, "JvmClassName.byFqNameWit…e.identifier(className)))");
        str = str.getInternalName();
        C2668g.a(str, "JvmClassName.byFqNameWit…className))).internalName");
        return str;
    }
}
