package rx.p498c;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx.c.f */
public class C19403f {
    /* renamed from: a */
    static final C19400b f60574a = new C195681();
    /* renamed from: b */
    private static final C19403f f60575b = new C19403f();
    /* renamed from: c */
    private final AtomicReference<C19400b> f60576c = new AtomicReference();
    /* renamed from: d */
    private final AtomicReference<C19402d> f60577d = new AtomicReference();
    /* renamed from: e */
    private final AtomicReference<C19405h> f60578e = new AtomicReference();
    /* renamed from: f */
    private final AtomicReference<C19399a> f60579f = new AtomicReference();
    /* renamed from: g */
    private final AtomicReference<C19404g> f60580g = new AtomicReference();

    /* renamed from: rx.c.f$1 */
    static class C195681 extends C19400b {
        C195681() {
        }
    }

    /* renamed from: rx.c.f$2 */
    class C195692 extends C19399a {
        /* renamed from: a */
        final /* synthetic */ C19403f f61115a;

        C195692(C19403f c19403f) {
            this.f61115a = c19403f;
        }
    }

    @Deprecated
    /* renamed from: a */
    public static C19403f m69828a() {
        return f60575b;
    }

    C19403f() {
    }

    /* renamed from: b */
    public C19400b m69829b() {
        if (this.f60576c.get() == null) {
            Object a = C19403f.m69827a(C19400b.class, System.getProperties());
            if (a == null) {
                this.f60576c.compareAndSet(null, f60574a);
            } else {
                this.f60576c.compareAndSet(null, (C19400b) a);
            }
        }
        return (C19400b) this.f60576c.get();
    }

    /* renamed from: c */
    public C19402d m69830c() {
        if (this.f60577d.get() == null) {
            Object a = C19403f.m69827a(C19402d.class, System.getProperties());
            if (a == null) {
                this.f60577d.compareAndSet(null, C19567e.m70542a());
            } else {
                this.f60577d.compareAndSet(null, (C19402d) a);
            }
        }
        return (C19402d) this.f60577d.get();
    }

    /* renamed from: d */
    public C19405h m69831d() {
        if (this.f60578e.get() == null) {
            Object a = C19403f.m69827a(C19405h.class, System.getProperties());
            if (a == null) {
                this.f60578e.compareAndSet(null, C19570i.m70543a());
            } else {
                this.f60578e.compareAndSet(null, (C19405h) a);
            }
        }
        return (C19405h) this.f60578e.get();
    }

    /* renamed from: e */
    public C19399a m69832e() {
        if (this.f60579f.get() == null) {
            Object a = C19403f.m69827a(C19399a.class, System.getProperties());
            if (a == null) {
                this.f60579f.compareAndSet(null, new C195692(this));
            } else {
                this.f60579f.compareAndSet(null, (C19399a) a);
            }
        }
        return (C19399a) this.f60579f.get();
    }

    /* renamed from: a */
    static Object m69827a(Class<?> cls, Properties properties) {
        StringBuilder stringBuilder;
        properties = (Properties) properties.clone();
        String simpleName = cls.getSimpleName();
        String str = "rxjava.plugin.";
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(simpleName);
        stringBuilder2.append(".implementation");
        String property = properties.getProperty(stringBuilder2.toString());
        if (property == null) {
            String str2 = ".class";
            String str3 = ".impl";
            for (Entry entry : properties.entrySet()) {
                String obj = entry.getKey().toString();
                if (obj.startsWith(str) && obj.endsWith(str2) && simpleName.equals(entry.getValue().toString())) {
                    property = obj.substring(0, obj.length() - str2.length()).substring(str.length());
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(str);
                    stringBuilder3.append(property);
                    stringBuilder3.append(str3);
                    str = stringBuilder3.toString();
                    property = properties.getProperty(str);
                    if (property == null) {
                        properties = new StringBuilder();
                        properties.append("Implementing class declaration for ");
                        properties.append(simpleName);
                        properties.append(" missing: ");
                        properties.append(str);
                        throw new IllegalStateException(properties.toString());
                    }
                }
            }
        }
        if (property == null) {
            return null;
        }
        try {
            return Class.forName(property).asSubclass(cls).newInstance();
        } catch (Class<?> cls2) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(simpleName);
            stringBuilder.append(" implementation is not an instance of ");
            stringBuilder.append(simpleName);
            stringBuilder.append(": ");
            stringBuilder.append(property);
            throw new IllegalStateException(stringBuilder.toString(), cls2);
        } catch (Class<?> cls22) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(simpleName);
            stringBuilder.append(" implementation class not found: ");
            stringBuilder.append(property);
            throw new IllegalStateException(stringBuilder.toString(), cls22);
        } catch (Class<?> cls222) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(simpleName);
            stringBuilder.append(" implementation not able to be instantiated: ");
            stringBuilder.append(property);
            throw new IllegalStateException(stringBuilder.toString(), cls222);
        } catch (Class<?> cls2222) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(simpleName);
            stringBuilder.append(" implementation not able to be accessed: ");
            stringBuilder.append(property);
            throw new IllegalStateException(stringBuilder.toString(), cls2222);
        }
    }

    /* renamed from: f */
    public C19404g m69833f() {
        if (this.f60580g.get() == null) {
            Object a = C19403f.m69827a(C19404g.class, System.getProperties());
            if (a == null) {
                this.f60580g.compareAndSet(null, C19404g.m69840g());
            } else {
                this.f60580g.compareAndSet(null, (C19404g) a);
            }
        }
        return (C19404g) this.f60580g.get();
    }
}
