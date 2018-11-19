package com.tinder.scarlet.internal.servicemethod;

import com.tinder.api.ManagerWebServices;
import com.tinder.scarlet.C14788b;
import com.tinder.scarlet.MessageAdapter;
import com.tinder.scarlet.StreamAdapter;
import com.tinder.scarlet.internal.connection.C14804a;
import com.tinder.scarlet.internal.servicemethod.C14809a.C14808b;
import com.tinder.scarlet.utils.C14820d;
import com.tinder.scarlet.utils.C14821e;
import io.reactivex.C15679f;
import io.reactivex.C3957b;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C19066k;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.Publisher;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00032\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod;", "", "()V", "Companion", "Factory", "Receive", "Send", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Send;", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Receive;", "scarlet"}, k = 1, mv = {1, 1, 9})
public abstract class ServiceMethod {
    /* renamed from: a */
    public static final C14805a f46404a = new C14805a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Factory;", "", "create", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod;", "connection", "Lcom/tinder/scarlet/internal/connection/Connection;", "method", "Ljava/lang/reflect/Method;", "scarlet"}, k = 1, mv = {1, 1, 9})
    public interface Factory {
        @NotNull
        ServiceMethod create(@NotNull C14804a c14804a, @NotNull Method method);
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0006H\u0002¢\u0006\u0002\u0010\u0007J\f\u0010\b\u001a\u00020\t*\u00020\u0006H\u0002J<\u0010\n\u001a\u00020\u000b*\u00020\u00062\u001a\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\r0\u0004\"\u0006\u0012\u0002\b\u00030\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\b¢\u0006\u0002\u0010\u0010J<\u0010\u0011\u001a\u00020\u000b*\u00020\u00062\u001a\u0010\f\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\r0\u0004\"\u0006\u0012\u0002\b\u00030\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\b¢\u0006\u0002\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u000b*\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\b¨\u0006\u0013"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Companion;", "", "()V", "getFirstParameterAnnotations", "", "", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)[Ljava/lang/annotation/Annotation;", "getFirstParameterType", "Ljava/lang/reflect/Type;", "requireParameterTypes", "", "types", "Ljava/lang/Class;", "lazyMessage", "Lkotlin/Function0;", "(Ljava/lang/reflect/Method;[Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)V", "requireReturnTypeIsOneOf", "requireReturnTypeIsResolvable", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.internal.servicemethod.ServiceMethod$a */
    public static final class C14805a {
        private C14805a() {
        }

        /* renamed from: a */
        private final Type m56142a(@NotNull Method method) {
            method = method.getGenericParameterTypes();
            C2668g.a(method, "genericParameterTypes");
            method = C19066k.m67994c((Object[]) method);
            C2668g.a(method, "genericParameterTypes.first()");
            return (Type) method;
        }

        /* renamed from: b */
        private final Annotation[] m56144b(@NotNull Method method) {
            method = method.getParameterAnnotations();
            C2668g.a(method, "parameterAnnotations");
            method = C19066k.m67994c((Object[]) method);
            C2668g.a(method, "parameterAnnotations.first()");
            return (Annotation[]) method;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000fB5\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u000e\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Receive;", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod;", "eventMapper", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper;", "connection", "Lcom/tinder/scarlet/internal/connection/Connection;", "scheduler", "Lio/reactivex/Scheduler;", "streamAdapter", "Lcom/tinder/scarlet/StreamAdapter;", "", "(Lcom/tinder/scarlet/internal/servicemethod/EventMapper;Lcom/tinder/scarlet/internal/connection/Connection;Lio/reactivex/Scheduler;Lcom/tinder/scarlet/StreamAdapter;)V", "getEventMapper$scarlet", "()Lcom/tinder/scarlet/internal/servicemethod/EventMapper;", "execute", "Factory", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.internal.servicemethod.ServiceMethod$b */
    public static final class C16524b extends ServiceMethod {
        @NotNull
        /* renamed from: b */
        private final C14809a<?> f51194b;
        /* renamed from: c */
        private final C14804a f51195c;
        /* renamed from: d */
        private final C15679f f51196d;
        /* renamed from: e */
        private final StreamAdapter<Object, Object> f51197e;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "Lcom/tinder/scarlet/Event;", "call"}, k = 3, mv = {1, 1, 9})
        /* renamed from: com.tinder.scarlet.internal.servicemethod.ServiceMethod$b$b */
        static final class C14806b<V> implements Callable<Publisher<? extends T>> {
            /* renamed from: a */
            final /* synthetic */ C16524b f46403a;

            C14806b(C16524b c16524b) {
                this.f46403a = c16524b;
            }

            public /* synthetic */ Object call() {
                return m56145a();
            }

            @NotNull
            /* renamed from: a */
            public final C3957b<C14788b> m56145a() {
                return this.f46403a.f51195c.m56140b();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0014\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Receive$Factory;", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Factory;", "scheduler", "Lio/reactivex/Scheduler;", "eventMapperFactory", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper$Factory;", "streamAdapterResolver", "Lcom/tinder/scarlet/internal/servicemethod/StreamAdapterResolver;", "(Lio/reactivex/Scheduler;Lcom/tinder/scarlet/internal/servicemethod/EventMapper$Factory;Lcom/tinder/scarlet/internal/servicemethod/StreamAdapterResolver;)V", "create", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Receive;", "connection", "Lcom/tinder/scarlet/internal/connection/Connection;", "method", "Ljava/lang/reflect/Method;", "createEventMapper", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper;", "createStreamAdapter", "Lcom/tinder/scarlet/StreamAdapter;", "", "scarlet"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.scarlet.internal.servicemethod.ServiceMethod$b$a */
        public static final class C16523a implements Factory {
            /* renamed from: a */
            private final C15679f f51191a;
            /* renamed from: b */
            private final C14808b f51192b;
            /* renamed from: c */
            private final C14814e f51193c;

            public C16523a(@NotNull C15679f c15679f, @NotNull C14808b c14808b, @NotNull C14814e c14814e) {
                C2668g.b(c15679f, "scheduler");
                C2668g.b(c14808b, "eventMapperFactory");
                C2668g.b(c14814e, "streamAdapterResolver");
                this.f51191a = c15679f;
                this.f51192b = c14808b;
                this.f51193c = c14814e;
            }

            public /* synthetic */ ServiceMethod create(C14804a c14804a, Method method) {
                return m61943a(c14804a, method);
            }

            @NotNull
            /* renamed from: a */
            public C16524b m61943a(@NotNull C14804a c14804a, @NotNull Method method) {
                C2668g.b(c14804a, "connection");
                C2668g.b(method, "method");
                C14805a c14805a = ServiceMethod.f46404a;
                int i = 0;
                Object[] objArr = (Object[]) new Class[0];
                if ((((Object[]) method.getGenericParameterTypes()).length == objArr.length ? 1 : null) == null) {
                    c14804a = new StringBuilder();
                    c14804a.append("Receive method must have zero parameter: ");
                    c14804a.append(method);
                    throw ((Throwable) new IllegalArgumentException(c14804a.toString().toString()));
                }
                Object obj;
                Object obj2;
                Object genericParameterTypes = method.getGenericParameterTypes();
                C2668g.a(genericParameterTypes, "genericParameterTypes");
                Iterable<Pair> a = C19066k.m67975a((Object[]) genericParameterTypes, objArr);
                if (!((a instanceof Collection) && ((Collection) a).isEmpty())) {
                    for (Pair pair : a) {
                        obj = (Type) pair.m59805c();
                        Class cls = (Class) pair.m59806d();
                        if (cls != obj) {
                            if (!cls.isInstance(obj)) {
                                genericParameterTypes = null;
                                continue;
                                if (genericParameterTypes == null) {
                                    obj2 = null;
                                    break;
                                }
                            }
                        }
                        genericParameterTypes = 1;
                        continue;
                        if (genericParameterTypes == null) {
                            obj2 = null;
                            break;
                        }
                    }
                }
                obj2 = 1;
                if (obj2 == null) {
                    c14804a = new StringBuilder();
                    c14804a.append("Receive method must have zero parameter: ");
                    c14804a.append(method);
                    throw ((Throwable) new IllegalArgumentException(c14804a.toString().toString()));
                }
                C14805a c14805a2 = ServiceMethod.f46404a;
                objArr = (Object[]) new Class[]{ParameterizedType.class};
                for (Object obj3 : objArr) {
                    Class cls2 = (Class) obj3;
                    if (cls2 != method.getGenericReturnType()) {
                        if (!cls2.isInstance(method.getGenericReturnType())) {
                            obj3 = null;
                            if (obj3 != null) {
                                i = 1;
                                break;
                            }
                        }
                    }
                    obj3 = 1;
                    if (obj3 != null) {
                        i = 1;
                        break;
                    }
                }
                if (i == 0) {
                    c14804a = new StringBuilder();
                    c14804a.append("Receive method must return ParameterizedType: ");
                    c14804a.append(method);
                    throw ((Throwable) new IllegalArgumentException(c14804a.toString().toString()));
                }
                c14805a = ServiceMethod.f46404a;
                Type genericReturnType = method.getGenericReturnType();
                C2668g.a(genericReturnType, "genericReturnType");
                if ((C14821e.m56169b(genericReturnType) ^ 1) == 0) {
                    c14804a = new StringBuilder();
                    c14804a.append("Method return type must not include a type variable or wildcard: ");
                    c14804a.append(method.getGenericReturnType());
                    throw ((Throwable) new IllegalArgumentException(c14804a.toString().toString()));
                }
                return new C16524b(m61941a(method), c14804a, this.f51191a, m61942b(method));
            }

            /* renamed from: a */
            private final C14809a<?> m61941a(Method method) {
                C14808b c14808b = this.f51192b;
                Type genericReturnType = method.getGenericReturnType();
                if (genericReturnType == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                }
                ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
                method = method.getAnnotations();
                C2668g.a(method, "method.annotations");
                return c14808b.m56150a(parameterizedType, method);
            }

            /* renamed from: b */
            private final StreamAdapter<Object, Object> m61942b(Method method) {
                C14814e c14814e = this.f51193c;
                method = method.getGenericReturnType();
                C2668g.a(method, "method.genericReturnType");
                return c14814e.m56159a(method);
            }
        }

        public C16524b(@NotNull C14809a<?> c14809a, @NotNull C14804a c14804a, @NotNull C15679f c15679f, @NotNull StreamAdapter<Object, ? extends Object> streamAdapter) {
            C2668g.b(c14809a, "eventMapper");
            C2668g.b(c14804a, "connection");
            C2668g.b(c15679f, "scheduler");
            C2668g.b(streamAdapter, "streamAdapter");
            super();
            this.f51194b = c14809a;
            this.f51195c = c14804a;
            this.f51196d = c15679f;
            this.f51197e = streamAdapter;
        }

        @NotNull
        /* renamed from: a */
        public final Object m61945a() {
            C3957b d = C3957b.a(new C14806b(this)).a(this.f51196d).d(new C16541d(new ServiceMethod$Receive$execute$stream$2(this.f51194b)));
            C2668g.a(d, "Flowable.defer { connect…e(eventMapper::mapToData)");
            return this.f51197e.adapt(C14820d.m56166a(d));
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Send;", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod;", "connection", "Lcom/tinder/scarlet/internal/connection/Connection;", "messageAdapter", "Lcom/tinder/scarlet/MessageAdapter;", "", "(Lcom/tinder/scarlet/internal/connection/Connection;Lcom/tinder/scarlet/MessageAdapter;)V", "execute", "data", "Factory", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.internal.servicemethod.ServiceMethod$c */
    public static final class C16526c extends ServiceMethod {
        /* renamed from: b */
        private final C14804a f51199b;
        /* renamed from: c */
        private final MessageAdapter<Object> f51200c;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Send$Factory;", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Factory;", "messageAdapterResolver", "Lcom/tinder/scarlet/internal/servicemethod/MessageAdapterResolver;", "(Lcom/tinder/scarlet/internal/servicemethod/MessageAdapterResolver;)V", "create", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Send;", "connection", "Lcom/tinder/scarlet/internal/connection/Connection;", "method", "Ljava/lang/reflect/Method;", "scarlet"}, k = 1, mv = {1, 1, 9})
        /* renamed from: com.tinder.scarlet.internal.servicemethod.ServiceMethod$c$a */
        public static final class C16525a implements Factory {
            /* renamed from: a */
            private final C14811b f51198a;

            public C16525a(@NotNull C14811b c14811b) {
                C2668g.b(c14811b, "messageAdapterResolver");
                this.f51198a = c14811b;
            }

            public /* synthetic */ ServiceMethod create(C14804a c14804a, Method method) {
                return m61946a(c14804a, method);
            }

            @NotNull
            /* renamed from: a */
            public C16526c m61946a(@NotNull C14804a c14804a, @NotNull Method method) {
                C2668g.b(c14804a, "connection");
                C2668g.b(method, "method");
                C14805a c14805a = ServiceMethod.f46404a;
                int i = 1;
                Object[] objArr = (Object[]) new Class[]{Object.class};
                if ((((Object[]) method.getGenericParameterTypes()).length == objArr.length ? 1 : null) == null) {
                    c14804a = new StringBuilder();
                    c14804a.append("Send method must have one and only one parameter: ");
                    c14804a.append(method);
                    throw ((Throwable) new IllegalArgumentException(c14804a.toString().toString()));
                }
                Object obj;
                Class cls;
                Object obj2;
                Object genericParameterTypes = method.getGenericParameterTypes();
                C2668g.a(genericParameterTypes, "genericParameterTypes");
                Iterable<Pair> a = C19066k.m67975a((Object[]) genericParameterTypes, objArr);
                if (!((a instanceof Collection) && ((Collection) a).isEmpty())) {
                    for (Pair pair : a) {
                        obj = (Type) pair.m59805c();
                        cls = (Class) pair.m59806d();
                        if (cls != obj) {
                            if (!cls.isInstance(obj)) {
                                genericParameterTypes = null;
                                continue;
                                if (genericParameterTypes == null) {
                                    obj2 = null;
                                    break;
                                }
                            }
                        }
                        genericParameterTypes = 1;
                        continue;
                        if (genericParameterTypes == null) {
                            obj2 = null;
                            break;
                        }
                    }
                }
                obj2 = 1;
                if (obj2 == null) {
                    c14804a = new StringBuilder();
                    c14804a.append("Send method must have one and only one parameter: ");
                    c14804a.append(method);
                    throw ((Throwable) new IllegalArgumentException(c14804a.toString().toString()));
                }
                C14805a c14805a2 = ServiceMethod.f46404a;
                Class[] clsArr = new Class[2];
                clsArr[0] = Boolean.TYPE;
                cls = Void.TYPE;
                C2668g.a(cls, "Void.TYPE");
                clsArr[1] = cls;
                objArr = (Object[]) clsArr;
                for (Object obj3 : objArr) {
                    Class cls2 = (Class) obj3;
                    if (cls2 != method.getGenericReturnType()) {
                        if (!cls2.isInstance(method.getGenericReturnType())) {
                            obj3 = null;
                            if (obj3 != null) {
                                break;
                            }
                        }
                    }
                    obj3 = 1;
                    if (obj3 != null) {
                        break;
                    }
                }
                i = 0;
                if (i == 0) {
                    c14804a = new StringBuilder();
                    c14804a.append("Send method must return Boolean or Void: ");
                    c14804a.append(method);
                    throw ((Throwable) new IllegalArgumentException(c14804a.toString().toString()));
                }
                return new C16526c(c14804a, this.f51198a.m56153a(ServiceMethod.f46404a.m56142a(method), ServiceMethod.f46404a.m56144b(method)));
            }
        }

        public C16526c(@NotNull C14804a c14804a, @NotNull MessageAdapter<Object> messageAdapter) {
            C2668g.b(c14804a, "connection");
            C2668g.b(messageAdapter, "messageAdapter");
            super();
            this.f51199b = c14804a;
            this.f51200c = messageAdapter;
        }

        @NotNull
        /* renamed from: a */
        public final Object m61947a(@NotNull Object obj) {
            C2668g.b(obj, ManagerWebServices.FB_DATA);
            return Boolean.valueOf(this.f51199b.m56139a(this.f51200c.toMessage(obj)));
        }
    }

    private ServiceMethod() {
    }
}
