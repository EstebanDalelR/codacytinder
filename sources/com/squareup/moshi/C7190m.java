package com.squareup.moshi;

import com.squareup.moshi.C7189l.C5984a;
import com.squareup.moshi.JsonAdapter.Factory;
import com.squareup.moshi.JsonReader.C5971a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C19301m;
import kotlin.collections.ae;
import kotlin.jvm.C15820a;
import kotlin.jvm.internal.C15829m;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C19068g;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty1;
import kotlin.reflect.full.C15839a;
import kotlin.reflect.jvm.C15840a;
import kotlin.reflect.jvm.C15842c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 1}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/squareup/moshi/KotlinJsonAdapterFactory;", "Lcom/squareup/moshi/JsonAdapter$Factory;", "()V", "create", "Lcom/squareup/moshi/JsonAdapter;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "moshi", "Lcom/squareup/moshi/Moshi;", "moshi-kotlin"}, k = 1, mv = {1, 1, 5})
/* renamed from: com.squareup.moshi.m */
public final class C7190m implements Factory {
    @Nullable
    public JsonAdapter<?> create(@Nullable Type type, @NotNull Set<? extends Annotation> set, @NotNull C5987p c5987p) {
        C5987p c5987p2 = c5987p;
        C2668g.b(set, "annotations");
        C2668g.b(c5987p2, "moshi");
        if (!set.isEmpty()) {
            return null;
        }
        Class e = C5992r.m25686e(type);
        if (e.isEnum() || !e.isAnnotationPresent(C5985n.f21856a) || C7182d.m30834a(e)) {
            return null;
        }
        KFunction a = C15839a.a(C15820a.a(e));
        if (a == null) {
            return null;
        }
        Iterable parameters = a.getParameters();
        Map linkedHashMap = new LinkedHashMap(C19068g.c(ae.a(C19301m.a(parameters, 10)), 16));
        for (Object next : parameters) {
            linkedHashMap.put(((KParameter) next).getName(), next);
        }
        C15840a.a(a, true);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (KProperty1 kProperty1 : C15839a.b(C15820a.a(e))) {
            Field a2 = C15842c.a(kProperty1);
            if (!Modifier.isTransient(a2 != null ? a2.getModifiers() : 0)) {
                KParameter kParameter = (KParameter) linkedHashMap.get(kProperty1.getName());
                if ((kProperty1 instanceof KMutableProperty1) || kParameter != null) {
                    String name;
                    Type a3;
                    Collection collection;
                    Object[] toArray;
                    JsonAdapter a4;
                    Map map;
                    String name2;
                    C15840a.a(kProperty1, true);
                    List annotations = kProperty1.getAnnotations();
                    for (Object next2 : kProperty1.getAnnotations()) {
                        if (((Annotation) next2) instanceof Json) {
                            break;
                        }
                    }
                    Object next22 = null;
                    Json json = (Json) next22;
                    if (kParameter != null) {
                        annotations = C19301m.b(annotations, kParameter.getAnnotations());
                        if (json == null) {
                            for (Object next222 : kParameter.getAnnotations()) {
                                if (((Annotation) next222) instanceof Json) {
                                    break;
                                }
                            }
                            next222 = null;
                            json = (Json) next222;
                        }
                    }
                    if (json != null) {
                        name = json.name();
                        if (name != null) {
                            a3 = C15842c.a(kProperty1.getReturnType());
                            collection = annotations;
                            if (collection != null) {
                                throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
                            }
                            collection = collection;
                            toArray = collection.toArray(new Annotation[collection.size()]);
                            if (toArray != null) {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                            a4 = c5987p2.m25668a(a3, C5993s.m25693a((Annotation[]) toArray));
                            map = linkedHashMap2;
                            name2 = kProperty1.getName();
                            C2668g.a(a4, "adapter");
                            if (kProperty1 != null) {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Any, kotlin.Any?>");
                            }
                            map.put(name2, new C5984a(name, a4, kProperty1, kParameter));
                        }
                    }
                    name = kProperty1.getName();
                    a3 = C15842c.a(kProperty1.getReturnType());
                    collection = annotations;
                    if (collection != null) {
                        collection = collection;
                        toArray = collection.toArray(new Annotation[collection.size()]);
                        if (toArray != null) {
                            a4 = c5987p2.m25668a(a3, C5993s.m25693a((Annotation[]) toArray));
                            map = linkedHashMap2;
                            name2 = kProperty1.getName();
                            C2668g.a(a4, "adapter");
                            if (kProperty1 != null) {
                                map.put(name2, new C5984a(name, a4, kProperty1, kParameter));
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Any, kotlin.Any?>");
                            }
                        }
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (KParameter kParameter2 : a.getParameters()) {
            C5984a c5984a = (C5984a) C15829m.g(linkedHashMap2).remove(kParameter2.getName());
            if (c5984a != null || kParameter2.isOptional()) {
                arrayList.add(c5984a);
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("No property for required constructor ");
                stringBuilder.append(kParameter2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        Collection collection2 = arrayList;
        Collection values = linkedHashMap2.values();
        C2668g.a(values, "bindingsByName.values");
        C19301m.a(collection2, values);
        Iterable<C5984a> iterable = arrayList;
        values = new ArrayList(C19301m.a(iterable, 10));
        for (C5984a c5984a2 : iterable) {
            Object a5;
            if (c5984a2 != null) {
                a5 = c5984a2.m25659a();
                if (a5 != null) {
                    values.add(a5);
                }
            }
            a5 = "\u0000";
            values.add(a5);
        }
        values = (List) values;
        Object[] toArray2 = values.toArray(new String[values.size()]);
        if (toArray2 == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) toArray2;
        C5971a a6 = C5971a.m25580a((String[]) Arrays.copyOf(strArr, strArr.length));
        List list = arrayList;
        C2668g.a(a6, "options");
        return new C7189l(a, list, a6).nullSafe();
    }
}
