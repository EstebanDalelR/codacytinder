package com.tinder.scarlet.internal.servicemethod;

import com.tinder.scarlet.internal.connection.C14804a;
import com.tinder.scarlet.internal.p400a.C14800a;
import com.tinder.scarlet.internal.servicemethod.ServiceMethod.C16524b;
import com.tinder.scarlet.internal.servicemethod.ServiceMethod.C16524b.C16523a;
import com.tinder.scarlet.internal.servicemethod.ServiceMethod.C16526c;
import com.tinder.scarlet.internal.servicemethod.ServiceMethod.C16526c.C16525a;
import com.tinder.scarlet.internal.servicemethod.ServiceMethod.Factory;
import com.tinder.scarlet.ws.Receive;
import com.tinder.scarlet.ws.Send;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C18457p;
import kotlin.collections.C19299w;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000eB\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J!\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\u0010\rR \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/ServiceMethodExecutor;", "", "serviceMethods", "", "Ljava/lang/reflect/Method;", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod;", "(Ljava/util/Map;)V", "getServiceMethods$scarlet", "()Ljava/util/Map;", "execute", "method", "args", "", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "Factory", "scarlet"}, k = 1, mv = {1, 1, 9})
/* renamed from: com.tinder.scarlet.internal.servicemethod.c */
public final class C14813c {
    @NotNull
    /* renamed from: a */
    private final Map<Method, ServiceMethod> f46415a;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u0011H\u0002J$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/tinder/scarlet/internal/servicemethod/ServiceMethodExecutor$Factory;", "", "runtimePlatform", "Lcom/tinder/scarlet/internal/utils/RuntimePlatform;", "sendServiceMethodFactory", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Send$Factory;", "receiveServiceMethodFactory", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Receive$Factory;", "(Lcom/tinder/scarlet/internal/utils/RuntimePlatform;Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Send$Factory;Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Receive$Factory;)V", "create", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethodExecutor;", "serviceInterface", "Ljava/lang/Class;", "connection", "Lcom/tinder/scarlet/internal/connection/Connection;", "findServiceMethodFactory", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod$Factory;", "", "findServiceMethods", "", "Ljava/lang/reflect/Method;", "Lcom/tinder/scarlet/internal/servicemethod/ServiceMethod;", "toServiceMethod", "scarlet"}, k = 1, mv = {1, 1, 9})
    /* renamed from: com.tinder.scarlet.internal.servicemethod.c$a */
    public static final class C14812a {
        /* renamed from: a */
        private final C14800a f46412a;
        /* renamed from: b */
        private final C16525a f46413b;
        /* renamed from: c */
        private final C16523a f46414c;

        public C14812a(@NotNull C14800a c14800a, @NotNull C16525a c16525a, @NotNull C16523a c16523a) {
            C2668g.b(c14800a, "runtimePlatform");
            C2668g.b(c16525a, "sendServiceMethodFactory");
            C2668g.b(c16523a, "receiveServiceMethodFactory");
            this.f46412a = c14800a;
            this.f46413b = c16525a;
            this.f46414c = c16523a;
        }

        @NotNull
        /* renamed from: a */
        public final C14813c m56157a(@NotNull Class<?> cls, @NotNull C14804a c14804a) {
            C2668g.b(cls, "serviceInterface");
            C2668g.b(c14804a, "connection");
            return new C14813c(m56156b(cls, c14804a));
        }

        /* renamed from: b */
        private final Map<Method, ServiceMethod> m56156b(@NotNull Class<?> cls, C14804a c14804a) {
            cls = cls.getDeclaredMethods();
            C2668g.a(cls, "declaredMethods");
            Object[] objArr = (Object[]) cls;
            Collection arrayList = new ArrayList();
            for (Object obj : objArr) {
                Method method = (Method) obj;
                C14800a c14800a = this.f46412a;
                C2668g.a(method, "it");
                if (!c14800a.mo12253a(method)) {
                    arrayList.add(obj);
                }
            }
            Iterable<Method> iterable = (List) arrayList;
            Collection collection = (Collection) new ArrayList(C18457p.m66906a((Iterable) iterable, 10));
            for (Method method2 : iterable) {
                C2668g.a(method2, "it");
                collection.add(m56155a(method2, c14804a));
            }
            return ah.m66885a((Iterable) C19299w.m68815c((Iterable) iterable, (Iterable) (List) collection));
        }

        /* renamed from: a */
        private final ServiceMethod m56155a(@NotNull Method method, C14804a c14804a) {
            Object annotations = method.getAnnotations();
            C2668g.a(annotations, "annotations");
            Object[] objArr = (Object[]) annotations;
            Collection arrayList = new ArrayList();
            Object obj = null;
            for (Object obj2 : objArr) {
                Annotation annotation = (Annotation) obj2;
                C2668g.a(annotation, "it");
                Factory a = m56154a(annotation);
                if (a != null) {
                    arrayList.add(a);
                }
            }
            List list = (List) arrayList;
            if (list.size() == 1) {
                obj = 1;
            }
            if (obj != null) {
                return ((Factory) C19299w.m68829f(list)).create(c14804a, method);
            }
            c14804a = new StringBuilder();
            c14804a.append("A method must have one and only one service method annotation: ");
            c14804a.append(method);
            throw ((Throwable) new IllegalArgumentException(c14804a.toString().toString()));
        }

        /* renamed from: a */
        private final Factory m56154a(@NotNull Annotation annotation) {
            if (annotation instanceof Send) {
                return (Factory) this.f46413b;
            }
            return (annotation instanceof Receive) != null ? (Factory) this.f46414c : null;
        }
    }

    public C14813c(@NotNull Map<Method, ? extends ServiceMethod> map) {
        C2668g.b(map, "serviceMethods");
        this.f46415a = map;
    }

    @NotNull
    /* renamed from: a */
    public final Object m56158a(@NotNull Method method, @NotNull Object[] objArr) {
        C2668g.b(method, "method");
        C2668g.b(objArr, "args");
        method = this.f46415a.get(method);
        if (method == null) {
            throw ((Throwable) new IllegalStateException("Service method not found".toString()));
        }
        ServiceMethod serviceMethod = (ServiceMethod) method;
        if (serviceMethod instanceof C16526c) {
            return ((C16526c) serviceMethod).m61947a(objArr[0]);
        }
        if ((serviceMethod instanceof C16524b) != null) {
            return ((C16524b) serviceMethod).m61945a();
        }
        throw new NoWhenBranchMatchedException();
    }
}
