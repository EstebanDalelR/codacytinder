package de.greenrobot.event;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* renamed from: de.greenrobot.event.c */
public class C2664c {
    /* renamed from: a */
    public static String f8408a = "Event";
    /* renamed from: b */
    private static final C15527d f8409b = new C15527d();
    /* renamed from: c */
    private static final Map<Class<?>, List<Class<?>>> f8410c = new HashMap();
    /* renamed from: d */
    private final Map<Class<?>, CopyOnWriteArrayList<C15534l>> f8411d;
    /* renamed from: e */
    private final Map<Object, List<Class<?>>> f8412e;
    /* renamed from: f */
    private final Map<Class<?>, Object> f8413f;
    /* renamed from: g */
    private final ThreadLocal<c$a> f8414g;
    /* renamed from: h */
    private final C15528e f8415h;
    /* renamed from: i */
    private final C15526b f8416i;
    /* renamed from: j */
    private final C15525a f8417j;
    /* renamed from: k */
    private final C15533k f8418k;
    /* renamed from: l */
    private final ExecutorService f8419l;
    /* renamed from: m */
    private final boolean f8420m;
    /* renamed from: n */
    private final boolean f8421n;
    /* renamed from: o */
    private final boolean f8422o;
    /* renamed from: p */
    private final boolean f8423p;
    /* renamed from: q */
    private final boolean f8424q;
    /* renamed from: r */
    private final boolean f8425r;

    /* renamed from: a */
    public static C15527d m10241a() {
        return new C15527d();
    }

    public C2664c() {
        this(f8409b);
    }

    C2664c(C15527d c15527d) {
        this.f8414g = new c$1(this);
        this.f8411d = new HashMap();
        this.f8412e = new HashMap();
        this.f8413f = new ConcurrentHashMap();
        this.f8415h = new C15528e(this, Looper.getMainLooper(), 10);
        this.f8416i = new C15526b(this);
        this.f8417j = new C15525a(this);
        this.f8418k = new C15533k(c15527d.f47975h);
        this.f8421n = c15527d.f47968a;
        this.f8422o = c15527d.f47969b;
        this.f8423p = c15527d.f47970c;
        this.f8424q = c15527d.f47971d;
        this.f8420m = c15527d.f47972e;
        this.f8425r = c15527d.f47973f;
        this.f8419l = c15527d.f47974g;
    }

    /* renamed from: a */
    public void m10254a(Object obj) {
        m10248a(obj, false, 0);
    }

    /* renamed from: a */
    public void m10255a(Object obj, int i) {
        m10248a(obj, true, i);
    }

    /* renamed from: a */
    private synchronized void m10248a(Object obj, boolean z, int i) {
        for (C15532j a : this.f8418k.a(obj.getClass())) {
            m10246a(obj, a, z, i);
        }
    }

    /* renamed from: a */
    private void m10246a(Object obj, C15532j c15532j, boolean z, int i) {
        Class cls = c15532j.f47992c;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f8411d.get(cls);
        C15534l c15534l = new C15534l(obj, c15532j, i);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f8411d.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(c15534l) != null) {
            z = new StringBuilder();
            z.append("Subscriber ");
            z.append(obj.getClass());
            z.append(" already registered to event ");
            z.append(cls);
            throw new EventBusException(z.toString());
        }
        c15532j = copyOnWriteArrayList.size();
        i = 0;
        while (i <= c15532j) {
            if (i != c15532j) {
                if (c15534l.f47998c <= ((C15534l) copyOnWriteArrayList.get(i)).f47998c) {
                    i++;
                }
            }
            copyOnWriteArrayList.add(i, c15534l);
            break;
        }
        c15532j = (List) this.f8412e.get(obj);
        if (c15532j == null) {
            c15532j = new ArrayList();
            this.f8412e.put(obj, c15532j);
        }
        c15532j.add(cls);
        if (!z) {
            return;
        }
        if (this.f8425r != null) {
            for (Entry entry : this.f8413f.entrySet()) {
                if (cls.isAssignableFrom((Class) entry.getKey())) {
                    m10251b(c15534l, entry.getValue());
                }
            }
            return;
        }
        m10251b(c15534l, this.f8413f.get(cls));
    }

    /* renamed from: b */
    private void m10251b(C15534l c15534l, Object obj) {
        if (obj != null) {
            m10244a(c15534l, obj, Looper.getMainLooper() == Looper.myLooper());
        }
    }

    /* renamed from: b */
    public synchronized boolean m10257b(Object obj) {
        return this.f8412e.containsKey(obj);
    }

    /* renamed from: a */
    private void m10247a(Object obj, Class<?> cls) {
        List list = (List) this.f8411d.get(cls);
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                C15534l c15534l = (C15534l) list.get(i);
                if (c15534l.f47996a == obj) {
                    c15534l.f47999d = false;
                    list.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    /* renamed from: c */
    public synchronized void m10259c(Object obj) {
        List<Class> list = (List) this.f8412e.get(obj);
        if (list != null) {
            for (Class a : list) {
                m10247a(obj, a);
            }
            this.f8412e.remove(obj);
        } else {
            String str = f8408a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Subscriber to unregister was not registered before: ");
            stringBuilder.append(obj.getClass());
            Log.w(str, stringBuilder.toString());
        }
    }

    /* renamed from: d */
    public void m10260d(Object obj) {
        c$a c_a = (c$a) this.f8414g.get();
        List list = c_a.f47961a;
        list.add(obj);
        if (c_a.f47962b == null) {
            c_a.f47963c = Looper.getMainLooper() == Looper.myLooper() ? true : null;
            c_a.f47962b = true;
            if (c_a.f47966f != null) {
                throw new EventBusException("Internal error. Abort state was not reset");
            }
            while (list.isEmpty() == null) {
                try {
                    m10245a(list.remove(0), c_a);
                } finally {
                    c_a.f47962b = false;
                    c_a.f47963c = false;
                }
            }
        }
    }

    /* renamed from: e */
    public void m10261e(Object obj) {
        synchronized (this.f8413f) {
            this.f8413f.put(obj.getClass(), obj);
        }
        m10260d(obj);
    }

    /* renamed from: b */
    public void m10256b() {
        synchronized (this.f8413f) {
            this.f8413f.clear();
        }
    }

    /* renamed from: a */
    private void m10245a(Object obj, c$a c_a) throws Error {
        int i;
        Class cls = obj.getClass();
        if (this.f8425r) {
            List a = m10242a(cls);
            i = 0;
            for (int i2 = 0; i2 < a.size(); i2++) {
                i |= m10250a(obj, c_a, (Class) a.get(i2));
            }
        } else {
            i = m10250a(obj, c_a, cls);
        }
        if (i == 0) {
            if (this.f8422o != null) {
                c_a = f8408a;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("No subscribers registered for event ");
                stringBuilder.append(cls);
                Log.d(c_a, stringBuilder.toString());
            }
            if (this.f8424q != null && cls != C2665f.class && cls != C15531i.class) {
                m10260d(new C2665f(this, obj));
            }
        }
    }

    /* renamed from: a */
    private boolean m10250a(Object obj, c$a c_a, Class<?> cls) {
        synchronized (this) {
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f8411d.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        cls = copyOnWriteArrayList.iterator();
        loop0:
        while (cls.hasNext()) {
            boolean z = (C15534l) cls.next();
            c_a.f47965e = obj;
            c_a.f47964d = z;
            try {
                m10244a((C15534l) z, obj, c_a.f47963c);
                z = c_a.f47966f;
                continue;
            } finally {
                c_a.f47965e = null;
                c_a.f47964d = null;
                c_a.f47966f = false;
            }
            if (z) {
                break loop0;
            }
        }
        return true;
    }

    /* renamed from: a */
    private void m10244a(C15534l c15534l, Object obj, boolean z) {
        switch (c$2.f47960a[c15534l.f47997b.f47991b.ordinal()]) {
            case 1:
                m10253a(c15534l, obj);
                return;
            case 2:
                if (z) {
                    m10253a(c15534l, obj);
                    return;
                } else {
                    this.f8415h.a(c15534l, obj);
                    return;
                }
            case 3:
                if (z) {
                    this.f8416i.a(c15534l, obj);
                    return;
                } else {
                    m10253a(c15534l, obj);
                    return;
                }
            case 4:
                this.f8417j.a(c15534l, obj);
                return;
            default:
                z = new StringBuilder();
                z.append("Unknown thread mode: ");
                z.append(c15534l.f47997b.f47991b);
                throw new IllegalStateException(z.toString());
        }
    }

    /* renamed from: a */
    private List<Class<?>> m10242a(Class<?> cls) {
        List<Class<?>> list;
        synchronized (f8410c) {
            list = (List) f8410c.get(cls);
            if (list == null) {
                list = new ArrayList();
                for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    C2664c.m10249a((List) list, cls2.getInterfaces());
                }
                f8410c.put(cls, list);
            }
        }
        return list;
    }

    /* renamed from: a */
    static void m10249a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                C2664c.m10249a((List) list, cls.getInterfaces());
            }
        }
    }

    /* renamed from: a */
    void m10252a(C15529g c15529g) {
        Object obj = c15529g.f47981a;
        C15534l c15534l = c15529g.f47982b;
        C15529g.a(c15529g);
        if (c15534l.f47999d != null) {
            m10253a(c15534l, obj);
        }
    }

    /* renamed from: a */
    void m10253a(C15534l c15534l, Object obj) {
        try {
            c15534l.f47997b.f47990a.invoke(c15534l.f47996a, new Object[]{obj});
        } catch (InvocationTargetException e) {
            m10243a(c15534l, obj, e.getCause());
        } catch (C15534l c15534l2) {
            throw new IllegalStateException("Unexpected exception", c15534l2);
        }
    }

    /* renamed from: a */
    private void m10243a(C15534l c15534l, Object obj, Throwable th) {
        String str;
        StringBuilder stringBuilder;
        if (obj instanceof C15531i) {
            if (this.f8421n) {
                str = f8408a;
                stringBuilder = new StringBuilder();
                stringBuilder.append("SubscriberExceptionEvent subscriber ");
                stringBuilder.append(c15534l.f47996a.getClass());
                stringBuilder.append(" threw an exception");
                Log.e(str, stringBuilder.toString(), th);
                C15531i c15531i = (C15531i) obj;
                c15534l = f8408a;
                th = new StringBuilder();
                th.append("Initial event ");
                th.append(c15531i.f47988c);
                th.append(" caused exception in ");
                th.append(c15531i.f47989d);
                Log.e(c15534l, th.toString(), c15531i.f47987b);
            }
        } else if (this.f8420m) {
            throw new EventBusException("Invoking subscriber failed", th);
        } else {
            if (this.f8421n) {
                str = f8408a;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Could not dispatch event: ");
                stringBuilder.append(obj.getClass());
                stringBuilder.append(" to subscribing class ");
                stringBuilder.append(c15534l.f47996a.getClass());
                Log.e(str, stringBuilder.toString(), th);
            }
            if (this.f8423p) {
                m10260d(new C15531i(this, th, obj, c15534l.f47996a));
            }
        }
    }

    /* renamed from: c */
    ExecutorService m10258c() {
        return this.f8419l;
    }
}
