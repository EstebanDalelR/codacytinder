package com.tinder.scarlet;

import com.tinder.scarlet.WebSocket.Factory;
import com.tinder.scarlet.internal.C14801a;
import com.tinder.scarlet.internal.C14801a.C14798a;
import com.tinder.scarlet.internal.connection.C14804a.C14802a;
import com.tinder.scarlet.internal.p400a.C14800a;
import com.tinder.scarlet.internal.servicemethod.C14809a.C14808b;
import com.tinder.scarlet.internal.servicemethod.C14811b;
import com.tinder.scarlet.internal.servicemethod.C14813c.C14812a;
import com.tinder.scarlet.internal.servicemethod.C14814e;
import com.tinder.scarlet.internal.servicemethod.ServiceMethod.C16524b.C16523a;
import com.tinder.scarlet.internal.servicemethod.ServiceMethod.C16526c.C16525a;
import com.tinder.scarlet.lifecycle.C18039a;
import com.tinder.scarlet.p468a.p469a.C16499a;
import com.tinder.scarlet.p471b.p472a.C16508a;
import com.tinder.scarlet.retry.BackoffStrategy;
import com.tinder.scarlet.retry.C16546a;
import io.reactivex.C15679f;
import io.reactivex.schedulers.C15756a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\u0007\u001a\u0002H\b\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\u0001H\b¢\u0006\u0002\u0010\tJ\u001f\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000b¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J!\u0010\u0012\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0002¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/scarlet/Scarlet;", "", "runtimePlatform", "Lcom/tinder/scarlet/internal/utils/RuntimePlatform;", "serviceFactory", "Lcom/tinder/scarlet/internal/Service$Factory;", "(Lcom/tinder/scarlet/internal/utils/RuntimePlatform;Lcom/tinder/scarlet/internal/Service$Factory;)V", "create", "T", "()Ljava/lang/Object;", "service", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "createInvocationHandler", "Ljava/lang/reflect/InvocationHandler;", "serviceInterface", "serviceInstance", "Lcom/tinder/scarlet/internal/Service;", "implementService", "Builder", "scarlet"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.d */
public final class C14793d {
    /* renamed from: a */
    private final C14800a f46373a;
    /* renamed from: b */
    private final C14798a f46374b;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\tJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\rJ\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/tinder/scarlet/Scarlet$Builder;", "", "()V", "backoffStrategy", "Lcom/tinder/scarlet/retry/BackoffStrategy;", "lifecycle", "Lcom/tinder/scarlet/Lifecycle;", "messageAdapterFactories", "", "Lcom/tinder/scarlet/MessageAdapter$Factory;", "platform", "Lcom/tinder/scarlet/internal/utils/RuntimePlatform;", "streamAdapterFactories", "Lcom/tinder/scarlet/StreamAdapter$Factory;", "webSocketFactory", "Lcom/tinder/scarlet/WebSocket$Factory;", "addMessageAdapterFactory", "factory", "addStreamAdapterFactory", "build", "Lcom/tinder/scarlet/Scarlet;", "createConnectionFactory", "Lcom/tinder/scarlet/internal/connection/Connection$Factory;", "createMessageAdapterResolver", "Lcom/tinder/scarlet/internal/servicemethod/MessageAdapterResolver;", "createServiceFactory", "Lcom/tinder/scarlet/internal/Service$Factory;", "createServiceMethodExecutorFactory", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethodExecutor$Factory;", "createStreamAdapterResolver", "Lcom/tinder/scarlet/internal/servicemethod/StreamAdapterResolver;", "Companion", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.d$a */
    public static final class C14791a {
        @Deprecated
        /* renamed from: a */
        public static final C14790a f46358a = new C14790a();
        /* renamed from: h */
        private static final C18039a f46359h = new C18039a(null, 1, null);
        /* renamed from: i */
        private static final long f46360i = 1000;
        /* renamed from: j */
        private static final long f46361j = 10000;
        /* renamed from: k */
        private static final C16546a f46362k = new C16546a(f46358a.m56062b(), f46358a.m56064c());
        /* renamed from: l */
        private static final C15679f f46363l = C15756a.m59008a();
        /* renamed from: b */
        private Factory f46364b;
        /* renamed from: c */
        private Lifecycle f46365c = f46358a.m56060a();
        /* renamed from: d */
        private BackoffStrategy f46366d = f46358a.m56067d();
        /* renamed from: e */
        private final List<MessageAdapter.Factory> f46367e = new ArrayList();
        /* renamed from: f */
        private final List<StreamAdapter.Factory> f46368f = new ArrayList();
        /* renamed from: g */
        private final C14800a f46369g = C14800a.f46385a.m56105a();

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010XD¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0010XD¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/tinder/scarlet/Scarlet$Builder$Companion;", "", "()V", "DEFAULT_LIFECYCLE", "Lcom/tinder/scarlet/lifecycle/DefaultLifecycle;", "getDEFAULT_LIFECYCLE", "()Lcom/tinder/scarlet/lifecycle/DefaultLifecycle;", "DEFAULT_RETRY_STRATEGY", "Lcom/tinder/scarlet/retry/ExponentialBackoffStrategy;", "getDEFAULT_RETRY_STRATEGY", "()Lcom/tinder/scarlet/retry/ExponentialBackoffStrategy;", "DEFAULT_SCHEDULER", "Lio/reactivex/Scheduler;", "getDEFAULT_SCHEDULER", "()Lio/reactivex/Scheduler;", "RETRY_BASE_DURATION", "", "getRETRY_BASE_DURATION", "()J", "RETRY_MAX_DURATION", "getRETRY_MAX_DURATION", "scarlet"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.scarlet.d$a$a */
        private static final class C14790a {
            private C14790a() {
            }

            /* renamed from: a */
            private final C18039a m56060a() {
                return C14791a.f46359h;
            }

            /* renamed from: b */
            private final long m56062b() {
                return C14791a.f46360i;
            }

            /* renamed from: c */
            private final long m56064c() {
                return C14791a.f46361j;
            }

            /* renamed from: d */
            private final C16546a m56067d() {
                return C14791a.f46362k;
            }

            /* renamed from: e */
            private final C15679f m56069e() {
                return C14791a.f46363l;
            }
        }

        @NotNull
        /* renamed from: a */
        public final C14791a m56083a(@NotNull Factory factory) {
            C2668g.b(factory, "factory");
            C14791a c14791a = this;
            c14791a.f46364b = factory;
            return c14791a;
        }

        @NotNull
        /* renamed from: a */
        public final C14791a m56080a(@NotNull Lifecycle lifecycle) {
            C2668g.b(lifecycle, "lifecycle");
            C14791a c14791a = this;
            c14791a.f46365c = lifecycle;
            return c14791a;
        }

        @NotNull
        /* renamed from: a */
        public final C14791a m56084a(@NotNull BackoffStrategy backoffStrategy) {
            C2668g.b(backoffStrategy, "backoffStrategy");
            C14791a c14791a = this;
            c14791a.f46366d = backoffStrategy;
            return c14791a;
        }

        @NotNull
        /* renamed from: a */
        public final C14791a m56081a(@NotNull MessageAdapter.Factory factory) {
            C2668g.b(factory, "factory");
            C14791a c14791a = this;
            c14791a.f46367e.add(factory);
            return c14791a;
        }

        @NotNull
        /* renamed from: a */
        public final C14791a m56082a(@NotNull StreamAdapter.Factory factory) {
            C2668g.b(factory, "factory");
            C14791a c14791a = this;
            c14791a.f46368f.add(factory);
            return c14791a;
        }

        @NotNull
        /* renamed from: a */
        public final C14793d m56085a() {
            return new C14793d(this.f46369g, m56075g());
        }

        /* renamed from: g */
        private final C14798a m56075g() {
            return new C14798a(m56076h(), m56077i());
        }

        /* renamed from: h */
        private final C14802a m56076h() {
            Lifecycle lifecycle = this.f46365c;
            Factory factory = this.f46364b;
            if (factory == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            BackoffStrategy backoffStrategy = this.f46366d;
            C15679f a = f46358a.m56069e();
            C2668g.a(a, "DEFAULT_SCHEDULER");
            return new C14802a(lifecycle, factory, backoffStrategy, a);
        }

        /* renamed from: i */
        private final C14812a m56077i() {
            C14811b j = m56078j();
            C14814e k = m56079k();
            C14808b c14808b = new C14808b(j);
            C16525a c16525a = new C16525a(j);
            C15679f a = f46358a.m56069e();
            C2668g.a(a, "DEFAULT_SCHEDULER");
            return new C14812a(this.f46369g, c16525a, new C16523a(a, c14808b, k));
        }

        /* renamed from: j */
        private final C14811b m56078j() {
            List list = this.f46367e;
            list.add(new C16499a());
            return new C14811b(C19299w.m68840l(list));
        }

        /* renamed from: k */
        private final C14814e m56079k() {
            List list = this.f46368f;
            list.add(new C16508a());
            return new C14814e(C19299w.m68840l(list));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00050\u00052,\u0010\u0006\u001a(\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00010\u0001 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00070\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "proxy", "kotlin.jvm.PlatformType", "method", "Ljava/lang/reflect/Method;", "nullableArgs", "", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.d$b */
    static final class C14792b implements InvocationHandler {
        /* renamed from: a */
        final /* synthetic */ C14793d f46370a;
        /* renamed from: b */
        final /* synthetic */ Class f46371b;
        /* renamed from: c */
        final /* synthetic */ C14801a f46372c;

        C14792b(C14793d c14793d, Class cls, C14801a c14801a) {
            this.f46370a = c14793d;
            this.f46371b = cls;
            this.f46372c = c14801a;
        }

        @NotNull
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            if (objArr == null) {
                objArr = new Object[0];
            }
            C14800a a = this.f46370a.f46373a;
            C2668g.a(method, "method");
            if (!a.mo12253a(method)) {
                return this.f46372c.m56109a(method, objArr);
            }
            a = this.f46370a.f46373a;
            Class cls = this.f46371b;
            C2668g.a(obj, "proxy");
            return a.mo12252a(method, cls, obj, objArr);
        }
    }

    public C14793d(@NotNull C14800a c14800a, @NotNull C14798a c14798a) {
        C2668g.b(c14800a, "runtimePlatform");
        C2668g.b(c14798a, "serviceFactory");
        this.f46373a = c14800a;
        this.f46374b = c14798a;
    }

    /* renamed from: a */
    public final <T> T m56089a(@NotNull Class<T> cls) {
        C2668g.b(cls, "service");
        return m56088b(cls);
    }

    /* renamed from: b */
    private final <T> T m56088b(Class<T> cls) {
        C14801a a = this.f46374b.m56101a(cls);
        a.m56110a();
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, m56087a(cls, a)));
    }

    /* renamed from: a */
    private final InvocationHandler m56087a(Class<?> cls, C14801a c14801a) {
        return new C14792b(this, cls, c14801a);
    }
}
