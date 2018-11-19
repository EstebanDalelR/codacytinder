package com.tinder.scarlet.internal.p400a;

import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.C15820a;
import kotlin.jvm.internal.C15825i;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u000e2\u00020\u0001:\u0003\u000e\u000f\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JQ\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\b\u001a\u00020\u00012&\u0010\t\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\n0\n\"\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\nH\u0016¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u0001\u0002\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/tinder/scarlet/internal/utils/RuntimePlatform;", "", "()V", "invokeDefaultMethod", "method", "Ljava/lang/reflect/Method;", "declaringClass", "Ljava/lang/Class;", "proxy", "args", "", "(Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Object;[[Ljava/lang/Object;)Ljava/lang/Object;", "isDefaultMethod", "", "Companion", "Default", "Java8", "Lcom/tinder/scarlet/internal/utils/RuntimePlatform$Default;", "Lcom/tinder/scarlet/internal/utils/RuntimePlatform$Java8;", "scarlet"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.internal.a.a */
public abstract class C14800a {
    /* renamed from: a */
    public static final C14799a f46385a = new C14799a();
    /* renamed from: b */
    private static final C14800a f46386b = f46385a.m56104c();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/tinder/scarlet/internal/utils/RuntimePlatform$Companion;", "", "()V", "PLATFORM", "Lcom/tinder/scarlet/internal/utils/RuntimePlatform;", "getPLATFORM", "()Lcom/tinder/scarlet/internal/utils/RuntimePlatform;", "findPlatform", "get", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.internal.a.a$a */
    public static final class C14799a {
        private C14799a() {
        }

        /* renamed from: b */
        private final C14800a m56103b() {
            return C14800a.f46386b;
        }

        @NotNull
        /* renamed from: a */
        public final C14800a m56105a() {
            return m56103b();
        }

        /* renamed from: c */
        private final com.tinder.scarlet.internal.p400a.C14800a m56104c() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r1 = this;
            r0 = "java.util.Optional";	 Catch:{ ClassNotFoundException -> 0x000d }
            java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x000d }
            r0 = new com.tinder.scarlet.internal.a.a$c;	 Catch:{ ClassNotFoundException -> 0x000d }
            r0.<init>();	 Catch:{ ClassNotFoundException -> 0x000d }
            r0 = (com.tinder.scarlet.internal.p400a.C14800a) r0;	 Catch:{ ClassNotFoundException -> 0x000d }
            goto L_0x0014;
        L_0x000d:
            r0 = new com.tinder.scarlet.internal.a.a$b;
            r0.<init>();
            r0 = (com.tinder.scarlet.internal.p400a.C14800a) r0;
        L_0x0014:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.scarlet.internal.a.a.a.c():com.tinder.scarlet.internal.a.a");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/scarlet/internal/utils/RuntimePlatform$Default;", "Lcom/tinder/scarlet/internal/utils/RuntimePlatform;", "()V", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.internal.a.a$b */
    public static final class C16521b extends C14800a {
        public C16521b() {
            super();
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JQ\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\t\u001a\u00020\u00042&\u0010\n\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u000b0\u000b\"\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"Lcom/tinder/scarlet/internal/utils/RuntimePlatform$Java8;", "Lcom/tinder/scarlet/internal/utils/RuntimePlatform;", "()V", "invokeDefaultMethod", "", "method", "Ljava/lang/reflect/Method;", "declaringClass", "Ljava/lang/Class;", "proxy", "args", "", "(Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Object;[[Ljava/lang/Object;)Ljava/lang/Object;", "isDefaultMethod", "", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.internal.a.a$c */
    public static final class C16522c extends C14800a {
        public C16522c() {
            super();
        }

        /* renamed from: a */
        public boolean mo12253a(@NotNull Method method) {
            C2668g.b(method, "method");
            return method.isDefault();
        }

        @NotNull
        /* renamed from: a */
        public Object mo12252a(@NotNull Method method, @NotNull Class<?> cls, @NotNull Object obj, @NotNull Object[]... objArr) {
            C2668g.b(method, "method");
            C2668g.b(cls, "declaringClass");
            C2668g.b(obj, "proxy");
            C2668g.b(objArr, "args");
            Constructor declaredConstructor = Lookup.class.getDeclaredConstructor(new Class[]{Class.class, C15820a.m59852b(C15825i.m59860a(Integer.TYPE))});
            C2668g.a(declaredConstructor, "constructor");
            declaredConstructor.setAccessible(true);
            method = ((Lookup) declaredConstructor.newInstance(new Object[]{cls, Integer.valueOf(-1)})).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(new Object[]{objArr});
            C2668g.a(method, "constructor.newInstance(…invokeWithArguments(args)");
            return method;
        }
    }

    /* renamed from: a */
    public boolean mo12253a(@NotNull Method method) {
        C2668g.b(method, "method");
        return false;
    }

    private C14800a() {
    }

    @NotNull
    /* renamed from: a */
    public Object mo12252a(@NotNull Method method, @NotNull Class<?> cls, @NotNull Object obj, @NotNull Object[]... objArr) {
        C2668g.b(method, "method");
        C2668g.b(cls, "declaringClass");
        C2668g.b(obj, "proxy");
        C2668g.b(objArr, "args");
        throw ((Throwable) new UnsupportedOperationException());
    }
}
