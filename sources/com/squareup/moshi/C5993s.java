package com.squareup.moshi;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.squareup.moshi.s */
final class C5993s {
    /* renamed from: a */
    public static final Set<Annotation> f21879a = Collections.emptySet();

    /* renamed from: a */
    public static Set<? extends Annotation> m25692a(AnnotatedElement annotatedElement) {
        return C5993s.m25693a(annotatedElement.getAnnotations());
    }

    /* renamed from: a */
    public static Set<? extends Annotation> m25693a(Annotation[] annotationArr) {
        Set set = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(JsonQualifier.class)) {
                if (set == null) {
                    set = new LinkedHashSet();
                }
                set.add(annotation);
            }
        }
        return set != null ? Collections.unmodifiableSet(set) : f21879a;
    }
}
