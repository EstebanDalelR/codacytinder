package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader;", "", "()V", "cache", "Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "getCache", "()Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "setCache", "(Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;)V", "buildCache", "member", "Ljava/lang/reflect/Member;", "loadParameterNames", "", "", "Cache", "descriptors.runtime"}, k = 1, mv = {1, 1, 10})
final class Java8ParameterNamesLoader {
    public static final Java8ParameterNamesLoader INSTANCE = new Java8ParameterNamesLoader();
    @Nullable
    private static Cache cache;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/structure/Java8ParameterNamesLoader$Cache;", "", "getParameters", "Ljava/lang/reflect/Method;", "getName", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "getGetName", "()Ljava/lang/reflect/Method;", "getGetParameters", "descriptors.runtime"}, k = 1, mv = {1, 1, 10})
    public static final class Cache {
        @Nullable
        private final Method getName;
        @Nullable
        private final Method getParameters;

        public Cache(@Nullable Method method, @Nullable Method method2) {
            this.getParameters = method;
            this.getName = method2;
        }

        @Nullable
        public final Method getGetName() {
            return this.getName;
        }

        @Nullable
        public final Method getGetParameters() {
            return this.getParameters;
        }
    }

    private Java8ParameterNamesLoader() {
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.structure.Java8ParameterNamesLoader.Cache buildCache(@org.jetbrains.annotations.NotNull java.lang.reflect.Member r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = "member";
        kotlin.jvm.internal.C2668g.b(r5, r0);
        r5 = r5.getClass();
        r0 = "getParameters";	 Catch:{ NoSuchMethodException -> 0x002a }
        r1 = 0;	 Catch:{ NoSuchMethodException -> 0x002a }
        r2 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x002a }
        r0 = r5.getMethod(r0, r2);	 Catch:{ NoSuchMethodException -> 0x002a }
        r5 = kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt.getSafeClassLoader(r5);
        r2 = "java.lang.reflect.Parameter";
        r5 = r5.loadClass(r2);
        r2 = new kotlin.reflect.jvm.internal.structure.Java8ParameterNamesLoader$Cache;
        r3 = "getName";
        r1 = new java.lang.Class[r1];
        r5 = r5.getMethod(r3, r1);
        r2.<init>(r0, r5);
        return r2;
    L_0x002a:
        r5 = new kotlin.reflect.jvm.internal.structure.Java8ParameterNamesLoader$Cache;
        r0 = 0;
        r5.<init>(r0, r0);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.structure.Java8ParameterNamesLoader.buildCache(java.lang.reflect.Member):kotlin.reflect.jvm.internal.structure.Java8ParameterNamesLoader$Cache");
    }

    @Nullable
    public final List<String> loadParameterNames(@NotNull Member member) {
        C2668g.b(member, "member");
        Cache cache = cache;
        if (cache == null) {
            cache = buildCache(member);
            cache = cache;
        }
        Method getParameters = cache.getGetParameters();
        if (getParameters == null) {
            return null;
        }
        Method getName = cache.getGetName();
        if (getName == null) {
            return null;
        }
        member = getParameters.invoke(member, new Object[0]);
        if (member == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<*>");
        }
        Object[] objArr = (Object[]) member;
        Collection arrayList = new ArrayList(objArr.length);
        for (Object invoke : objArr) {
            Object invoke2 = getName.invoke(invoke2, new Object[0]);
            if (invoke2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
            }
            arrayList.add((String) invoke2);
        }
        return (List) arrayList;
    }
}
