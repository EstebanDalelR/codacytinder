package org.apache.commons.lang3.builder;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* renamed from: org.apache.commons.lang3.builder.e */
public class C18553e extends C17717f {
    /* renamed from: a */
    protected String[] f57805a;
    /* renamed from: b */
    private boolean f57806b = false;
    /* renamed from: c */
    private boolean f57807c = false;
    /* renamed from: d */
    private Class<?> f57808d = null;

    /* renamed from: a */
    public static String m66975a(Object obj) {
        return C18553e.m66976a(obj, null, false, false, null);
    }

    /* renamed from: a */
    public static <T> String m66976a(T t, ToStringStyle toStringStyle, boolean z, boolean z2, Class<? super T> cls) {
        return new C18553e(t, toStringStyle, null, cls, z, z2).toString();
    }

    /* renamed from: d */
    private static Object m66977d(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException("The Object passed in should not be null.");
    }

    public <T> C18553e(T t, ToStringStyle toStringStyle, StringBuffer stringBuffer, Class<? super T> cls, boolean z, boolean z2) {
        super(C18553e.m66977d(t), toStringStyle, stringBuffer);
        m66984b((Class) cls);
        m66985b(z);
        m66980a(z2);
    }

    /* renamed from: a */
    protected boolean m66981a(Field field) {
        if (field.getName().indexOf(36) != -1) {
            return false;
        }
        if (Modifier.isTransient(field.getModifiers()) && !m66987c()) {
            return false;
        }
        if (Modifier.isStatic(field.getModifiers()) && !m66986b()) {
            return false;
        }
        if ((this.f57805a == null || Arrays.binarySearch(this.f57805a, field.getName()) < 0) && field.isAnnotationPresent(ToStringExclude.class) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected void m66979a(Class<?> cls) {
        if (cls.isArray()) {
            m66983b(m64553e());
            return;
        }
        cls = cls.getDeclaredFields();
        AccessibleObject.setAccessible(cls, true);
        for (Field field : cls) {
            String name = field.getName();
            if (m66981a(field)) {
                try {
                    m64552a(name, m66982b(field));
                } catch (Class<?> cls2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unexpected IllegalAccessException: ");
                    stringBuilder.append(cls2.getMessage());
                    throw new InternalError(stringBuilder.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public Class<?> m66978a() {
        return this.f57808d;
    }

    /* renamed from: b */
    protected Object m66982b(Field field) throws IllegalArgumentException, IllegalAccessException {
        return field.get(m64553e());
    }

    /* renamed from: b */
    public boolean m66986b() {
        return this.f57806b;
    }

    /* renamed from: c */
    public boolean m66987c() {
        return this.f57807c;
    }

    /* renamed from: b */
    public C18553e m66983b(Object obj) {
        m64555g().m60718d(m64554f(), null, obj);
        return this;
    }

    /* renamed from: a */
    public void m66980a(boolean z) {
        this.f57806b = z;
    }

    /* renamed from: b */
    public void m66985b(boolean z) {
        this.f57807c = z;
    }

    /* renamed from: b */
    public void m66984b(Class<?> cls) {
        if (cls != null) {
            Object e = m64553e();
            if (!(e == null || cls.isInstance(e))) {
                throw new IllegalArgumentException("Specified class is not a superclass of the object");
            }
        }
        this.f57808d = cls;
    }

    public String toString() {
        if (m64553e() == null) {
            return m64555g().m60725g();
        }
        Class cls = m64553e().getClass();
        m66979a(cls);
        while (cls.getSuperclass() != null && cls != m66978a()) {
            cls = cls.getSuperclass();
            m66979a(cls);
        }
        return super.toString();
    }
}
