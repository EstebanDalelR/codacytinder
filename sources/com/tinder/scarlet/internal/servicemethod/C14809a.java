package com.tinder.scarlet.internal.servicemethod;

import com.tinder.scarlet.C14787a;
import com.tinder.scarlet.C14787a.C16497a;
import com.tinder.scarlet.C14787a.C16498b;
import com.tinder.scarlet.C14788b;
import com.tinder.scarlet.C14788b.C16504a.C18035a;
import com.tinder.scarlet.C14788b.C16506c;
import com.tinder.scarlet.C14788b.C16507d.C18037a;
import com.tinder.scarlet.C14789c;
import com.tinder.scarlet.C14797g;
import com.tinder.scarlet.Lifecycle.C14785a;
import com.tinder.scarlet.MessageAdapter;
import com.tinder.scarlet.WebSocket.C14786a;
import com.tinder.scarlet.WebSocket.C14786a.C16496e;
import com.tinder.scarlet.utils.C14821e;
import io.reactivex.C3958c;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \b*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002:\t\b\t\n\u000b\f\r\u000e\u000f\u0010B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/EventMapper;", "T", "", "()V", "mapToData", "Lio/reactivex/Maybe;", "event", "Lcom/tinder/scarlet/Event;", "Companion", "Factory", "FilterEventType", "NoOp", "ToDeserialization", "ToDeserializedValue", "ToLifecycleState", "ToState", "ToWebSocketEvent", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper$NoOp;", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper$FilterEventType;", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper$ToLifecycleState;", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper$ToWebSocketEvent;", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper$ToState;", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper$ToDeserialization;", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper$ToDeserializedValue;", "scarlet"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.internal.servicemethod.a */
public abstract class C14809a<T> {
    /* renamed from: a */
    public static final C14807a f46407a = new C14807a();

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/EventMapper$Companion;", "", "()V", "getFirstTypeArgument", "Ljava/lang/reflect/Type;", "Ljava/lang/reflect/ParameterizedType;", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.internal.servicemethod.a$a */
    public static final class C14807a {
        private C14807a() {
        }

        /* renamed from: a */
        private final Type m56147a(@NotNull ParameterizedType parameterizedType) {
            return C14821e.m56168a(parameterizedType, 0);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\u0010\u0010J\u001a\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0002J)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/EventMapper$Factory;", "", "messageAdapterResolver", "Lcom/tinder/scarlet/internal/servicemethod/MessageAdapterResolver;", "(Lcom/tinder/scarlet/internal/servicemethod/MessageAdapterResolver;)V", "toDeserializationCache", "", "Lcom/tinder/scarlet/MessageAdapter;", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper$ToDeserialization;", "create", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper;", "returnType", "Ljava/lang/reflect/ParameterizedType;", "annotations", "", "", "(Ljava/lang/reflect/ParameterizedType;[Ljava/lang/annotation/Annotation;)Lcom/tinder/scarlet/internal/servicemethod/EventMapper;", "createToDeserializationIfNeeded", "messageAdapter", "resolveMessageAdapter", "(Ljava/lang/reflect/ParameterizedType;[Ljava/lang/annotation/Annotation;)Lcom/tinder/scarlet/MessageAdapter;", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.internal.servicemethod.a$b */
    public static final class C14808b {
        /* renamed from: a */
        private final Map<MessageAdapter<Object>, C16531e<?>> f46405a = ((Map) new LinkedHashMap());
        /* renamed from: b */
        private final C14811b f46406b;

        public C14808b(@NotNull C14811b c14811b) {
            C2668g.b(c14811b, "messageAdapterResolver");
            this.f46406b = c14811b;
        }

        @NotNull
        /* renamed from: a */
        public final C14809a<?> m56150a(@NotNull ParameterizedType parameterizedType, @NotNull Annotation[] annotationArr) {
            C2668g.b(parameterizedType, "returnType");
            C2668g.b(annotationArr, "annotations");
            Class a = C14821e.m56167a(C14809a.f46407a.m56147a(parameterizedType));
            if (C2668g.a(a, C14788b.class)) {
                return (C14809a) C16528d.f51202b;
            }
            if ((C14788b.class.isAssignableFrom(a) ^ 1) == 0) {
                throw ((Throwable) new IllegalArgumentException("Subclasses of Event is not supported".toString()));
            } else if (C2668g.a(C14785a.class, a)) {
                return (C14809a) C16536g.f51211b;
            } else {
                if ((C14785a.class.isAssignableFrom(a) ^ 1) == 0) {
                    throw ((Throwable) new IllegalArgumentException("Subclasses of Lifecycle.Event is not supported".toString()));
                } else if (C2668g.a(C14786a.class, a)) {
                    return (C14809a) C16540i.f51217b;
                } else {
                    if ((C14786a.class.isAssignableFrom(a) ^ 1) == 0) {
                        throw ((Throwable) new IllegalArgumentException("Subclasses of WebSocket.Event is not supported".toString()));
                    } else if (C2668g.a(C14797g.class, a)) {
                        return (C14809a) C16538h.f51214b;
                    } else {
                        if ((C14797g.class.isAssignableFrom(a) ^ 1) == 0) {
                            throw ((Throwable) new IllegalArgumentException("Subclasses of State is not supported".toString()));
                        }
                        parameterizedType = m56148a(m56149b(parameterizedType, annotationArr));
                        if (C2668g.a(a, C14787a.class) != null) {
                            parameterizedType = (C14809a) parameterizedType;
                        } else {
                            parameterizedType = (C14809a) new C16534f(parameterizedType);
                        }
                        return parameterizedType;
                    }
                }
            }
        }

        /* renamed from: a */
        private final C16531e<?> m56148a(MessageAdapter<Object> messageAdapter) {
            if (this.f46405a.containsKey(messageAdapter)) {
                messageAdapter = this.f46405a.get(messageAdapter);
                if (messageAdapter == null) {
                    C2668g.a();
                }
                return (C16531e) messageAdapter;
            }
            C16531e<?> c16531e = new C16531e(messageAdapter);
            this.f46405a.put(messageAdapter, c16531e);
            return c16531e;
        }

        /* renamed from: b */
        private final MessageAdapter<Object> m56149b(ParameterizedType parameterizedType, Annotation[] annotationArr) {
            parameterizedType = C14809a.f46407a.m56147a(parameterizedType);
            if (C2668g.a(C14821e.m56167a(parameterizedType), C14787a.class)) {
                C14807a c14807a = C14809a.f46407a;
                if (parameterizedType == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
                }
                parameterizedType = c14807a.m56147a(parameterizedType);
            }
            return this.f46406b.m56153a(parameterizedType, annotationArr);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/EventMapper$FilterEventType;", "E", "Lcom/tinder/scarlet/Event;", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "mapToData", "Lio/reactivex/Maybe;", "event", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.internal.servicemethod.a$c */
    public static final class C16527c<E extends C14788b> extends C14809a<E> {
        /* renamed from: b */
        private final Class<E> f51201b;

        public C16527c(@NotNull Class<E> cls) {
            C2668g.b(cls, "clazz");
            super();
            this.f51201b = cls;
        }

        @NotNull
        /* renamed from: a */
        public C3958c<E> mo12255a(@NotNull C14788b c14788b) {
            C2668g.b(c14788b, "event");
            if (this.f51201b.isInstance(c14788b)) {
                c14788b = C3958c.a(c14788b);
                C2668g.a(c14788b, "Maybe.just(event as E)");
                return c14788b;
            }
            c14788b = C3958c.a();
            C2668g.a(c14788b, "Maybe.empty()");
            return c14788b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/EventMapper$NoOp;", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper;", "", "()V", "mapToData", "Lio/reactivex/Maybe;", "event", "Lcom/tinder/scarlet/Event;", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.internal.servicemethod.a$d */
    public static final class C16528d extends C14809a<Object> {
        /* renamed from: b */
        public static final C16528d f51202b = new C16528d();

        private C16528d() {
            super();
        }

        @NotNull
        /* renamed from: a */
        public C3958c<Object> mo12255a(@NotNull C14788b c14788b) {
            C2668g.b(c14788b, "event");
            c14788b = C3958c.a(c14788b);
            C2668g.a(c14788b, "Maybe.just(event)");
            return c14788b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004*\u00020\u000fH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/EventMapper$ToDeserialization;", "T", "", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper;", "Lcom/tinder/scarlet/Deserialization;", "messageAdapter", "Lcom/tinder/scarlet/MessageAdapter;", "(Lcom/tinder/scarlet/MessageAdapter;)V", "toWebSocketEvent", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper$ToWebSocketEvent;", "mapToData", "Lio/reactivex/Maybe;", "event", "Lcom/tinder/scarlet/Event;", "deserialize", "Lcom/tinder/scarlet/Message;", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.internal.servicemethod.a$e */
    public static final class C16531e<T> extends C14809a<C14787a<T>> {
        /* renamed from: b */
        private final C16540i f51205b = C16540i.f51217b;
        /* renamed from: c */
        private final MessageAdapter<T> f51206c;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "", "it", "Lcom/tinder/scarlet/WebSocket$Event;", "test"}, k = 3, mv = {1, 1, 9})
        /* renamed from: com.tinder.scarlet.internal.servicemethod.a$e$a */
        static final class C16529a<T> implements Predicate<C14786a> {
            /* renamed from: a */
            public static final C16529a f51203a = new C16529a();

            C16529a() {
            }

            public /* synthetic */ boolean test(Object obj) {
                return m61950a((C14786a) obj);
            }

            /* renamed from: a */
            public final boolean m61950a(@NotNull C14786a c14786a) {
                C2668g.b(c14786a, "it");
                return c14786a instanceof C16496e;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/scarlet/Deserialization;", "T", "", "it", "Lcom/tinder/scarlet/WebSocket$Event;", "apply"}, k = 3, mv = {1, 1, 9})
        /* renamed from: com.tinder.scarlet.internal.servicemethod.a$e$b */
        static final class C16530b<T, R> implements Function<T, R> {
            /* renamed from: a */
            final /* synthetic */ C16531e f51204a;

            C16530b(C16531e c16531e) {
                this.f51204a = c16531e;
            }

            public /* synthetic */ Object apply(Object obj) {
                return m61951a((C14786a) obj);
            }

            @NotNull
            /* renamed from: a */
            public final C14787a<T> m61951a(@NotNull C14786a c14786a) {
                C2668g.b(c14786a, "it");
                return this.f51204a.m61952a((C14789c) ((C16496e) c14786a).m61920a());
            }
        }

        public C16531e(@NotNull MessageAdapter<T> messageAdapter) {
            C2668g.b(messageAdapter, "messageAdapter");
            super();
            this.f51206c = messageAdapter;
        }

        @NotNull
        /* renamed from: a */
        public C3958c<C14787a<T>> mo12255a(@NotNull C14788b c14788b) {
            C2668g.b(c14788b, "event");
            c14788b = this.f51205b.mo12255a(c14788b).a(C16529a.f51203a).f(new C16530b(this));
            C2668g.a(c14788b, "toWebSocketEvent.mapToDa…).message.deserialize() }");
            return c14788b;
        }

        /* renamed from: a */
        private final C14787a<T> m61952a(@NotNull C14789c c14789c) {
            try {
                return new C16498b(this.f51206c.fromMessage(c14789c));
            } catch (C14789c c14789c2) {
                return new C16497a(c14789c2);
            }
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/EventMapper$ToDeserializedValue;", "T", "", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper;", "toDeserialization", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper$ToDeserialization;", "(Lcom/tinder/scarlet/internal/servicemethod/EventMapper$ToDeserialization;)V", "mapToData", "Lio/reactivex/Maybe;", "event", "Lcom/tinder/scarlet/Event;", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.internal.servicemethod.a$f */
    public static final class C16534f<T> extends C14809a<T> {
        /* renamed from: b */
        private final C16531e<T> f51209b;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "", "it", "Lcom/tinder/scarlet/Deserialization;", "test"}, k = 3, mv = {1, 1, 9})
        /* renamed from: com.tinder.scarlet.internal.servicemethod.a$f$a */
        static final class C16532a<T> implements Predicate<C14787a<T>> {
            /* renamed from: a */
            public static final C16532a f51207a = new C16532a();

            C16532a() {
            }

            public /* synthetic */ boolean test(Object obj) {
                return m61955a((C14787a) obj);
            }

            /* renamed from: a */
            public final boolean m61955a(@NotNull C14787a<T> c14787a) {
                C2668g.b(c14787a, "it");
                return c14787a instanceof C16498b;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "T", "", "it", "Lcom/tinder/scarlet/Deserialization;", "apply", "(Lcom/tinder/scarlet/Deserialization;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 9})
        /* renamed from: com.tinder.scarlet.internal.servicemethod.a$f$b */
        static final class C16533b<T, R> implements Function<T, R> {
            /* renamed from: a */
            public static final C16533b f51208a = new C16533b();

            C16533b() {
            }

            public /* synthetic */ Object apply(Object obj) {
                return m61956a((C14787a) obj);
            }

            @NotNull
            /* renamed from: a */
            public final T m61956a(@NotNull C14787a<T> c14787a) {
                C2668g.b(c14787a, "it");
                return ((C16498b) c14787a).m61921a();
            }
        }

        public C16534f(@NotNull C16531e<T> c16531e) {
            C2668g.b(c16531e, "toDeserialization");
            super();
            this.f51209b = c16531e;
        }

        @NotNull
        /* renamed from: a */
        public C3958c<T> mo12255a(@NotNull C14788b c14788b) {
            C2668g.b(c14788b, "event");
            c14788b = this.f51209b.mo12255a(c14788b).a(C16532a.f51207a).f(C16533b.f51208a);
            C2668g.a(c14788b, "toDeserialization.mapToD…lization.Success).value }");
            return c14788b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0018\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/EventMapper$ToLifecycleState;", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper;", "Lcom/tinder/scarlet/Lifecycle$State;", "()V", "filterEventType", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper$FilterEventType;", "Lcom/tinder/scarlet/Event$OnLifecycle$StateChange;", "mapToData", "Lio/reactivex/Maybe;", "event", "Lcom/tinder/scarlet/Event;", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.internal.servicemethod.a$g */
    public static final class C16536g extends C14809a<C14785a> {
        /* renamed from: b */
        public static final C16536g f51211b = new C16536g();
        /* renamed from: c */
        private static final C16527c<C18035a<?>> f51212c = new C16527c(C18035a.class);

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/scarlet/Lifecycle$State;", "T", "", "it", "Lcom/tinder/scarlet/Event$OnLifecycle$StateChange;", "apply"}, k = 3, mv = {1, 1, 9})
        /* renamed from: com.tinder.scarlet.internal.servicemethod.a$g$a */
        static final class C16535a<T, R> implements Function<T, R> {
            /* renamed from: a */
            public static final C16535a f51210a = new C16535a();

            C16535a() {
            }

            public /* synthetic */ Object apply(Object obj) {
                return m61958a((C18035a) obj);
            }

            @NotNull
            /* renamed from: a */
            public final C14785a m61958a(@NotNull C18035a<?> c18035a) {
                C2668g.b(c18035a, "it");
                return c18035a.m65500a();
            }
        }

        private C16536g() {
            super();
        }

        @NotNull
        /* renamed from: a */
        public C3958c<C14785a> mo12255a(@NotNull C14788b c14788b) {
            C2668g.b(c14788b, "event");
            c14788b = f51212c.mo12255a(c14788b).f(C16535a.f51210a);
            C2668g.a(c14788b, "filterEventType.mapToData(event).map { it.state }");
            return c14788b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0018\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/EventMapper$ToState;", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper;", "Lcom/tinder/scarlet/State;", "()V", "filterEventType", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper$FilterEventType;", "Lcom/tinder/scarlet/Event$OnStateChange;", "mapToData", "Lio/reactivex/Maybe;", "event", "Lcom/tinder/scarlet/Event;", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.internal.servicemethod.a$h */
    public static final class C16538h extends C14809a<C14797g> {
        /* renamed from: b */
        public static final C16538h f51214b = new C16538h();
        /* renamed from: c */
        private static final C16527c<C16506c<?>> f51215c = new C16527c(C16506c.class);

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/scarlet/State;", "T", "", "it", "Lcom/tinder/scarlet/Event$OnStateChange;", "apply"}, k = 3, mv = {1, 1, 9})
        /* renamed from: com.tinder.scarlet.internal.servicemethod.a$h$a */
        static final class C16537a<T, R> implements Function<T, R> {
            /* renamed from: a */
            public static final C16537a f51213a = new C16537a();

            C16537a() {
            }

            public /* synthetic */ Object apply(Object obj) {
                return m61960a((C16506c) obj);
            }

            @NotNull
            /* renamed from: a */
            public final C14797g m61960a(@NotNull C16506c<?> c16506c) {
                C2668g.b(c16506c, "it");
                return c16506c.m61928a();
            }
        }

        private C16538h() {
            super();
        }

        @NotNull
        /* renamed from: a */
        public C3958c<C14797g> mo12255a(@NotNull C14788b c14788b) {
            C2668g.b(c14788b, "event");
            c14788b = f51215c.mo12255a(c14788b).f(C16537a.f51213a);
            C2668g.a(c14788b, "filterEventType.mapToData(event).map { it.state }");
            return c14788b;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0018\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/EventMapper$ToWebSocketEvent;", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper;", "Lcom/tinder/scarlet/WebSocket$Event;", "()V", "filterEventType", "Lcom/tinder/scarlet/internal/servicemethod/EventMapper$FilterEventType;", "Lcom/tinder/scarlet/Event$OnWebSocket$Event;", "mapToData", "Lio/reactivex/Maybe;", "event", "Lcom/tinder/scarlet/Event;", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.internal.servicemethod.a$i */
    public static final class C16540i extends C14809a<C14786a> {
        /* renamed from: b */
        public static final C16540i f51217b = new C16540i();
        /* renamed from: c */
        private static final C16527c<C18037a<?>> f51218c = new C16527c(C18037a.class);

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/tinder/scarlet/WebSocket$Event;", "T", "", "it", "Lcom/tinder/scarlet/Event$OnWebSocket$Event;", "apply"}, k = 3, mv = {1, 1, 9})
        /* renamed from: com.tinder.scarlet.internal.servicemethod.a$i$a */
        static final class C16539a<T, R> implements Function<T, R> {
            /* renamed from: a */
            public static final C16539a f51216a = new C16539a();

            C16539a() {
            }

            public /* synthetic */ Object apply(Object obj) {
                return m61962a((C18037a) obj);
            }

            @NotNull
            /* renamed from: a */
            public final C14786a m61962a(@NotNull C18037a<?> c18037a) {
                C2668g.b(c18037a, "it");
                return c18037a.m65501a();
            }
        }

        private C16540i() {
            super();
        }

        @NotNull
        /* renamed from: a */
        public C3958c<C14786a> mo12255a(@NotNull C14788b c14788b) {
            C2668g.b(c14788b, "event");
            c14788b = f51218c.mo12255a(c14788b).f(C16539a.f51216a);
            C2668g.a(c14788b, "filterEventType.mapToData(event).map { it.event }");
            return c14788b;
        }
    }

    @NotNull
    /* renamed from: a */
    public abstract C3958c<T> mo12255a(@NotNull C14788b c14788b);

    private C14809a() {
    }
}
