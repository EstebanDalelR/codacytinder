package com.tinder.scarlet.internal;

import com.tinder.scarlet.internal.connection.C14804a;
import com.tinder.scarlet.internal.connection.C14804a.C14802a;
import com.tinder.scarlet.internal.servicemethod.C14813c;
import com.tinder.scarlet.internal.servicemethod.C14813c.C14812a;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/scarlet/internal/Service;", "", "connection", "Lcom/tinder/scarlet/internal/connection/Connection;", "serviceMethodExecutor", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethodExecutor;", "(Lcom/tinder/scarlet/internal/connection/Connection;Lcom/tinder/scarlet/internal/servicemethod/ServiceMethodExecutor;)V", "execute", "method", "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "startForever", "", "Factory", "scarlet"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.internal.a */
public final class C14801a {
    /* renamed from: a */
    private final C14804a f46387a;
    /* renamed from: b */
    private final C14813c f46388b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nJ\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tinder/scarlet/internal/Service$Factory;", "", "connectionFactory", "Lcom/tinder/scarlet/internal/connection/Connection$Factory;", "serviceMethodExecutorFactory", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethodExecutor$Factory;", "(Lcom/tinder/scarlet/internal/connection/Connection$Factory;Lcom/tinder/scarlet/internal/servicemethod/ServiceMethodExecutor$Factory;)V", "create", "Lcom/tinder/scarlet/internal/Service;", "serviceInterface", "Ljava/lang/Class;", "validateService", "", "service", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.internal.a$a */
    public static final class C14798a {
        /* renamed from: a */
        private final C14802a f46383a;
        /* renamed from: b */
        private final C14812a f46384b;

        public C14798a(@NotNull C14802a c14802a, @NotNull C14812a c14812a) {
            C2668g.b(c14802a, "connectionFactory");
            C2668g.b(c14812a, "serviceMethodExecutorFactory");
            this.f46383a = c14802a;
            this.f46384b = c14812a;
        }

        @NotNull
        /* renamed from: a */
        public final C14801a m56101a(@NotNull Class<?> cls) {
            C2668g.b(cls, "serviceInterface");
            m56100b(cls);
            C14804a a = this.f46383a.m56114a();
            return new C14801a(a, this.f46384b.m56157a((Class) cls, a));
        }

        /* renamed from: b */
        private final void m56100b(Class<?> cls) {
            if (cls.isInterface()) {
                cls = cls.getInterfaces();
                C2668g.a(cls, "service.interfaces");
                if ((((Object[]) cls).length == null ? true : null) == null) {
                    throw new IllegalArgumentException("Service interfaces must not extend other interfaces.".toString());
                }
                return;
            }
            throw new IllegalArgumentException("Service declarations must be interfaces.".toString());
        }
    }

    public C14801a(@NotNull C14804a c14804a, @NotNull C14813c c14813c) {
        C2668g.b(c14804a, "connection");
        C2668g.b(c14813c, "serviceMethodExecutor");
        this.f46387a = c14804a;
        this.f46388b = c14813c;
    }

    /* renamed from: a */
    public final void m56110a() {
        this.f46387a.m56138a();
    }

    @NotNull
    /* renamed from: a */
    public final Object m56109a(@NotNull Method method, @NotNull Object[] objArr) {
        C2668g.b(method, "method");
        C2668g.b(objArr, "args");
        return this.f46388b.m56158a(method, objArr);
    }
}
