package kotlin.reflect.jvm.internal.components;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"tryLoadClass", "Ljava/lang/Class;", "Ljava/lang/ClassLoader;", "fqName", "", "descriptors.runtime"}, k = 2, mv = {1, 1, 10})
public final class ReflectJavaClassFinderKt {
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Class<?> tryLoadClass(@org.jetbrains.annotations.NotNull java.lang.ClassLoader r1, @org.jetbrains.annotations.NotNull java.lang.String r2) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = "$receiver";
        kotlin.jvm.internal.C2668g.b(r1, r0);
        r0 = "fqName";
        kotlin.jvm.internal.C2668g.b(r2, r0);
        r1 = r1.loadClass(r2);	 Catch:{ ClassNotFoundException -> 0x000f }
        goto L_0x0010;
    L_0x000f:
        r1 = 0;
    L_0x0010:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.components.ReflectJavaClassFinderKt.tryLoadClass(java.lang.ClassLoader, java.lang.String):java.lang.Class<?>");
    }
}
