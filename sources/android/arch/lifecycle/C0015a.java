package android.arch.lifecycle;

import android.arch.lifecycle.Lifecycle.Event;
import android.support.annotation.Nullable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: android.arch.lifecycle.a */
class C0015a {
    /* renamed from: a */
    static C0015a f37a = new C0015a();
    /* renamed from: b */
    private final Map<Class, C0013a> f38b = new HashMap();
    /* renamed from: c */
    private final Map<Class, Boolean> f39c = new HashMap();

    /* renamed from: android.arch.lifecycle.a$a */
    static class C0013a {
        /* renamed from: a */
        final Map<Event, List<C0014b>> f33a = new HashMap();
        /* renamed from: b */
        final Map<C0014b, Event> f34b;

        C0013a(Map<C0014b, Event> map) {
            this.f34b = map;
            map = map.entrySet().iterator();
            while (map.hasNext()) {
                Entry entry = (Entry) map.next();
                Event event = (Event) entry.getValue();
                List list = (List) this.f33a.get(event);
                if (list == null) {
                    list = new ArrayList();
                    this.f33a.put(event, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: a */
        void m79a(LifecycleOwner lifecycleOwner, Event event, Object obj) {
            C0013a.m78a((List) this.f33a.get(event), lifecycleOwner, event, obj);
            C0013a.m78a((List) this.f33a.get(Event.ON_ANY), lifecycleOwner, event, obj);
        }

        /* renamed from: a */
        private static void m78a(List<C0014b> list, LifecycleOwner lifecycleOwner, Event event, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0014b) list.get(size)).m80a(lifecycleOwner, event, obj);
                }
            }
        }
    }

    /* renamed from: android.arch.lifecycle.a$b */
    static class C0014b {
        /* renamed from: a */
        final int f35a;
        /* renamed from: b */
        final Method f36b;

        C0014b(int i, Method method) {
            this.f35a = i;
            this.f36b = method;
            this.f36b.setAccessible(true);
        }

        /* renamed from: a */
        void m80a(LifecycleOwner lifecycleOwner, Event event, Object obj) {
            try {
                switch (this.f35a) {
                    case 0:
                        this.f36b.invoke(obj, new Object[0]);
                        return;
                    case 1:
                        this.f36b.invoke(obj, new Object[]{lifecycleOwner});
                        return;
                    case 2:
                        this.f36b.invoke(obj, new Object[]{lifecycleOwner, event});
                        return;
                    default:
                        return;
                }
            } catch (LifecycleOwner lifecycleOwner2) {
                throw new RuntimeException("Failed to call observer method", lifecycleOwner2.getCause());
            } catch (LifecycleOwner lifecycleOwner22) {
                throw new RuntimeException(lifecycleOwner22);
            }
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    C0014b c0014b = (C0014b) obj;
                    if (this.f35a != c0014b.f35a || this.f36b.getName().equals(c0014b.f36b.getName()) == null) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f35a * 31) + this.f36b.getName().hashCode();
        }
    }

    C0015a() {
    }

    /* renamed from: a */
    boolean m84a(Class cls) {
        if (this.f39c.containsKey(cls)) {
            return ((Boolean) this.f39c.get(cls)).booleanValue();
        }
        Method[] c = m83c(cls);
        for (Method annotation : c) {
            if (((OnLifecycleEvent) annotation.getAnnotation(OnLifecycleEvent.class)) != null) {
                m81a(cls, c);
                return true;
            }
        }
        this.f39c.put(cls, Boolean.valueOf(false));
        return false;
    }

    /* renamed from: c */
    private Method[] m83c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (Class cls2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", cls2);
        }
    }

    /* renamed from: b */
    C0013a m85b(Class cls) {
        C0013a c0013a = (C0013a) this.f38b.get(cls);
        if (c0013a != null) {
            return c0013a;
        }
        return m81a(cls, null);
    }

    /* renamed from: a */
    private void m82a(Map<C0014b, Event> map, C0014b c0014b, Event event, Class cls) {
        Event event2 = (Event) map.get(c0014b);
        if (event2 != null && event != event2) {
            map = c0014b.f36b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Method ");
            stringBuilder.append(map.getName());
            stringBuilder.append(" in ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(" already declared with different @OnLifecycleEvent value: previous value ");
            stringBuilder.append(event2);
            stringBuilder.append(", new value ");
            stringBuilder.append(event);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (event2 == null) {
            map.put(c0014b, event);
        }
    }

    /* renamed from: a */
    private C0013a m81a(Class cls, @Nullable Method[] methodArr) {
        Class superclass = cls.getSuperclass();
        Map hashMap = new HashMap();
        if (superclass != null) {
            C0013a b = m85b(superclass);
            if (b != null) {
                hashMap.putAll(b.f34b);
            }
        }
        for (Class b2 : cls.getInterfaces()) {
            for (Entry entry : m85b(b2).f34b.entrySet()) {
                m82a(hashMap, (C0014b) entry.getKey(), (Event) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m83c(cls);
        }
        boolean z = false;
        for (Method method : r13) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                int i;
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(LifecycleOwner.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                Event value = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(Event.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value != Event.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    } else {
                        i = 2;
                    }
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m82a(hashMap, new C0014b(i, method), value, cls);
                z = true;
            }
        }
        methodArr = new C0013a(hashMap);
        this.f38b.put(cls, methodArr);
        this.f39c.put(cls, Boolean.valueOf(z));
        return methodArr;
    }
}
