package de.greenrobot.event;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.michaelevans.aftermath.Aftermath;

/* renamed from: de.greenrobot.event.k */
class C15533k {
    /* renamed from: a */
    private static final Map<String, List<C15532j>> f47994a = new HashMap();
    /* renamed from: b */
    private final Map<Class<?>, Class<?>> f47995b = new ConcurrentHashMap();

    C15533k(List<Class<?>> list) {
        if (list != null) {
            for (Class cls : list) {
                this.f47995b.put(cls, cls);
            }
        }
    }

    /* renamed from: a */
    List<C15532j> m58026a(Class<?> cls) {
        String name = cls.getName();
        synchronized (f47994a) {
            List<C15532j> list = (List) f47994a.get(name);
        }
        if (list != null) {
            return list;
        }
        List<C15532j> arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        StringBuilder stringBuilder = new StringBuilder();
        Class cls2 = cls;
        while (cls2 != null) {
            String name2 = cls2.getName();
            if (name2.startsWith(Aftermath.JAVA_PREFIX) || name2.startsWith("javax.")) {
                break;
            } else if (name2.startsWith(Aftermath.ANDROID_PREFIX)) {
                break;
            } else {
                try {
                    m58025a(arrayList, hashMap, stringBuilder, cls2.getDeclaredMethods());
                    cls2 = cls2.getSuperclass();
                } catch (Throwable th) {
                    th.printStackTrace();
                    Method[] methods = cls.getMethods();
                    arrayList.clear();
                    hashMap.clear();
                    m58025a(arrayList, hashMap, stringBuilder, methods);
                }
            }
        }
        if (arrayList.isEmpty()) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Subscriber ");
            stringBuilder2.append(cls);
            stringBuilder2.append(" has no public methods called ");
            stringBuilder2.append("onEvent");
            throw new EventBusException(stringBuilder2.toString());
        }
        synchronized (f47994a) {
            f47994a.put(name, arrayList);
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m58025a(List<C15532j> list, HashMap<String, Class> hashMap, StringBuilder stringBuilder, Method[] methodArr) {
        for (Method method : methodArr) {
            String name = method.getName();
            if (name.startsWith("onEvent")) {
                int modifiers = method.getModifiers();
                Class declaringClass = method.getDeclaringClass();
                if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                    Class[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        ThreadMode a = m58024a(declaringClass, method, name);
                        if (a != null) {
                            Class cls = parameterTypes[0];
                            stringBuilder.setLength(0);
                            stringBuilder.append(name);
                            stringBuilder.append('>');
                            stringBuilder.append(cls.getName());
                            name = stringBuilder.toString();
                            Class cls2 = (Class) hashMap.put(name, declaringClass);
                            if (cls2 != null) {
                                if (!cls2.isAssignableFrom(declaringClass)) {
                                    hashMap.put(name, cls2);
                                }
                            }
                            list.add(new C15532j(method, a, cls));
                        }
                    }
                } else if (!this.f47995b.containsKey(declaringClass)) {
                    String str = C2664c.f8408a;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Skipping method (not public, static or abstract): ");
                    stringBuilder2.append(declaringClass);
                    stringBuilder2.append(".");
                    stringBuilder2.append(name);
                    Log.d(str, stringBuilder2.toString());
                }
            }
        }
    }

    /* renamed from: a */
    private ThreadMode m58024a(Class<?> cls, Method method, String str) {
        str = str.substring("onEvent".length());
        if (str.length() == 0) {
            return ThreadMode.PostThread;
        }
        if (str.equals("MainThread")) {
            return ThreadMode.MainThread;
        }
        if (str.equals("BackgroundThread")) {
            return ThreadMode.BackgroundThread;
        }
        if (str.equals("Async") != null) {
            return ThreadMode.Async;
        }
        if (this.f47995b.containsKey(cls) != null) {
            return null;
        }
        str = new StringBuilder();
        str.append("Illegal onEvent method, check for typos: ");
        str.append(method);
        throw new EventBusException(str.toString());
    }
}
