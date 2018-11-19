package com.squareup.moshi;

import com.squareup.moshi.JsonReader.C5971a;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C17549c;
import kotlin.collections.C19301m;
import kotlin.jvm.internal.C2668g;
import kotlin.ranges.C18461c;
import kotlin.ranges.C19068g;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 1}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002\u001e\u001fB9\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0015\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¢\u0006\u0002\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016R'\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lcom/squareup/moshi/KotlinJsonAdapter;", "T", "Lcom/squareup/moshi/JsonAdapter;", "constructor", "Lkotlin/reflect/KFunction;", "bindings", "", "Lcom/squareup/moshi/KotlinJsonAdapter$Binding;", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "(Lkotlin/reflect/KFunction;Ljava/util/List;Lcom/squareup/moshi/JsonReader$Options;)V", "getBindings", "()Ljava/util/List;", "getConstructor", "()Lkotlin/reflect/KFunction;", "getOptions", "()Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "(Lcom/squareup/moshi/JsonReader;)Ljava/lang/Object;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "(Lcom/squareup/moshi/JsonWriter;Ljava/lang/Object;)V", "toString", "", "Binding", "IndexedParameterMap", "moshi-kotlin"}, k = 1, mv = {1, 1, 5})
/* renamed from: com.squareup.moshi.l */
public final class C7189l<T> extends JsonAdapter<T> {
    @NotNull
    /* renamed from: a */
    private final KFunction<T> f25987a;
    @NotNull
    /* renamed from: b */
    private final List<C5984a<T, Object>> f25988b;
    @NotNull
    /* renamed from: c */
    private final C5971a f25989c;

    @Metadata(bv = {1, 0, 1}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\b\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u0003B9\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\tHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\u0013\u0010\u001d\u001a\u00028\u00022\u0006\u0010\u001e\u001a\u00028\u0001¢\u0006\u0002\u0010\u001fJ\t\u0010 \u001a\u00020!HÖ\u0001J\u001b\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00028\u0002¢\u0006\u0002\u0010%J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006'"}, d2 = {"Lcom/squareup/moshi/KotlinJsonAdapter$Binding;", "K", "P", "", "name", "", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "property", "Lkotlin/reflect/KProperty1;", "parameter", "Lkotlin/reflect/KParameter;", "(Ljava/lang/String;Lcom/squareup/moshi/JsonAdapter;Lkotlin/reflect/KProperty1;Lkotlin/reflect/KParameter;)V", "getAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "getName", "()Ljava/lang/String;", "getParameter", "()Lkotlin/reflect/KParameter;", "getProperty", "()Lkotlin/reflect/KProperty1;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "get", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "", "set", "", "result", "(Ljava/lang/Object;Ljava/lang/Object;)V", "toString", "moshi-kotlin"}, k = 1, mv = {1, 1, 5})
    /* renamed from: com.squareup.moshi.l$a */
    public static final class C5984a<K, P> {
        @NotNull
        /* renamed from: a */
        private final String f21852a;
        @NotNull
        /* renamed from: b */
        private final JsonAdapter<P> f21853b;
        @NotNull
        /* renamed from: c */
        private final KProperty1<K, P> f21854c;
        @Nullable
        /* renamed from: d */
        private final KParameter f21855d;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C5984a) {
                    C5984a c5984a = (C5984a) obj;
                    if (C2668g.a(this.f21852a, c5984a.f21852a) && C2668g.a(this.f21853b, c5984a.f21853b) && C2668g.a(this.f21854c, c5984a.f21854c) && C2668g.a(this.f21855d, c5984a.f21855d)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.f21852a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            JsonAdapter jsonAdapter = this.f21853b;
            hashCode = (hashCode + (jsonAdapter != null ? jsonAdapter.hashCode() : 0)) * 31;
            KProperty1 kProperty1 = this.f21854c;
            hashCode = (hashCode + (kProperty1 != null ? kProperty1.hashCode() : 0)) * 31;
            KParameter kParameter = this.f21855d;
            if (kParameter != null) {
                i = kParameter.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Binding(name=");
            stringBuilder.append(this.f21852a);
            stringBuilder.append(", adapter=");
            stringBuilder.append(this.f21853b);
            stringBuilder.append(", property=");
            stringBuilder.append(this.f21854c);
            stringBuilder.append(", parameter=");
            stringBuilder.append(this.f21855d);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public C5984a(@NotNull String str, @NotNull JsonAdapter<P> jsonAdapter, @NotNull KProperty1<K, ? extends P> kProperty1, @Nullable KParameter kParameter) {
            C2668g.b(str, "name");
            C2668g.b(jsonAdapter, "adapter");
            C2668g.b(kProperty1, "property");
            this.f21852a = str;
            this.f21853b = jsonAdapter;
            this.f21854c = kProperty1;
            this.f21855d = kParameter;
        }

        @NotNull
        /* renamed from: a */
        public final String m25659a() {
            return this.f21852a;
        }

        @NotNull
        /* renamed from: b */
        public final JsonAdapter<P> m25661b() {
            return this.f21853b;
        }

        /* renamed from: a */
        public final P m25658a(K k) {
            return this.f21854c.get(k);
        }

        /* renamed from: a */
        public final void m25660a(K k, P p) {
            if (p != C5979a.f21840a) {
                KProperty1 kProperty1 = this.f21854c;
                if (kProperty1 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.KMutableProperty1<K, P>");
                }
                ((KMutableProperty1) kProperty1).set(k, p);
            }
        }
    }

    @Metadata(bv = {1, 0, 1}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0002R(\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000b0\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/squareup/moshi/KotlinJsonAdapter$IndexedParameterMap;", "Lkotlin/collections/AbstractMap;", "Lkotlin/reflect/KParameter;", "", "parameterKeys", "", "parameterValues", "", "(Ljava/util/List;[Ljava/lang/Object;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "getParameterKeys", "()Ljava/util/List;", "getParameterValues", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "containsKey", "", "key", "get", "moshi-kotlin"}, k = 1, mv = {1, 1, 5})
    /* renamed from: com.squareup.moshi.l$b */
    public static final class C7941b extends C17549c<KParameter, Object> {
        @NotNull
        /* renamed from: b */
        private final List<KParameter> f28539b;
        @NotNull
        /* renamed from: c */
        private final Object[] f28540c;

        /* renamed from: a */
        public Object m33798a(KParameter kParameter, Object obj) {
            return super.getOrDefault(kParameter, obj);
        }

        public final boolean containsKey(Object obj) {
            return obj instanceof KParameter ? m33800a((KParameter) obj) : null;
        }

        public final Object get(Object obj) {
            return obj instanceof KParameter ? m33801b((KParameter) obj) : null;
        }

        public final Object getOrDefault(Object obj, Object obj2) {
            return obj instanceof KParameter ? m33798a((KParameter) obj, obj2) : obj2;
        }

        public C7941b(@NotNull List<? extends KParameter> list, @NotNull Object[] objArr) {
            C2668g.b(list, "parameterKeys");
            C2668g.b(objArr, "parameterValues");
            this.f28539b = list;
            this.f28540c = objArr;
        }

        @NotNull
        /* renamed from: a */
        public Set<Entry<KParameter, Object>> m33799a() {
            Iterable<KParameter> iterable = this.f28539b;
            Collection arrayList = new ArrayList(C19301m.a(iterable, 10));
            int i = 0;
            for (KParameter simpleEntry : iterable) {
                int i2 = i + 1;
                arrayList.add(new SimpleEntry(simpleEntry, this.f28540c[i]));
                i = i2;
            }
            Collection linkedHashSet = new LinkedHashSet();
            for (Object next : (List) arrayList) {
                if ((((SimpleEntry) next).getValue() != C5979a.f21840a ? 1 : null) != null) {
                    linkedHashSet.add(next);
                }
            }
            return (Set) linkedHashSet;
        }

        /* renamed from: a */
        public boolean m33800a(@NotNull KParameter kParameter) {
            C2668g.b(kParameter, "key");
            return this.f28540c[kParameter.getIndex()] != C5979a.f21840a ? true : null;
        }

        @Nullable
        /* renamed from: b */
        public Object m33801b(@NotNull KParameter kParameter) {
            C2668g.b(kParameter, "key");
            kParameter = this.f28540c[kParameter.getIndex()];
            return kParameter != C5979a.f21840a ? kParameter : null;
        }
    }

    public C7189l(@NotNull KFunction<? extends T> kFunction, @NotNull List<C5984a<T, Object>> list, @NotNull C5971a c5971a) {
        C2668g.b(kFunction, "constructor");
        C2668g.b(list, "bindings");
        C2668g.b(c5971a, "options");
        this.f25987a = kFunction;
        this.f25988b = list;
        this.f25989c = c5971a;
    }

    public T fromJson(@NotNull JsonReader jsonReader) {
        C2668g.b(jsonReader, "reader");
        int size = this.f25987a.getParameters().size();
        int size2 = this.f25988b.size();
        Object[] objArr = new Object[size2];
        size2--;
        if (size2 >= 0) {
            int i = 0;
            while (true) {
                objArr[i] = C5979a.f21840a;
                if (i == size2) {
                    break;
                }
                i++;
            }
        }
        objArr = objArr;
        jsonReader.mo6451e();
        while (true) {
            C5984a c5984a = null;
            if (!jsonReader.mo6453g()) {
                break;
            }
            size2 = jsonReader.mo6447a(this.f25989c);
            if (size2 != -1) {
                c5984a = (C5984a) this.f25988b.get(size2);
            }
            if (c5984a == null) {
                jsonReader.mo6455i();
                jsonReader.mo6462p();
            } else if (objArr[size2] != C5979a.f21840a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Multiple values for ");
                stringBuilder.append(((KParameter) this.f25987a.getParameters().get(size2)).getName());
                stringBuilder.append(" at ");
                stringBuilder.append(jsonReader.m25606r());
                throw new JsonDataException(stringBuilder.toString());
            } else {
                objArr[size2] = c5984a.m25661b().fromJson(jsonReader);
            }
        }
        jsonReader.mo6452f();
        C18461c b = C19068g.b(0, size);
        int a = b.a();
        size2 = b.b();
        if (a <= size2) {
            while (true) {
                if (objArr[a] == C5979a.f21840a && !((KParameter) this.f25987a.getParameters().get(a)).isOptional()) {
                    if (((KParameter) this.f25987a.getParameters().get(a)).getType().isMarkedNullable()) {
                        objArr[a] = null;
                    } else {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Required value ");
                        stringBuilder2.append(((KParameter) this.f25987a.getParameters().get(a)).getName());
                        stringBuilder2.append(" missing at ");
                        stringBuilder2.append(jsonReader.m25606r());
                        throw new JsonDataException(stringBuilder2.toString());
                    }
                }
                if (a == size2) {
                    break;
                }
                a++;
            }
        }
        jsonReader = this.f25987a.callBy(new C7941b(this.f25987a.getParameters(), objArr));
        C18461c b2 = C19068g.b(size, this.f25988b.size());
        size2 = b2.a();
        size = b2.b();
        if (size2 <= size) {
            while (true) {
                Object obj = this.f25988b.get(size2);
                if (obj == null) {
                    C2668g.a();
                }
                ((C5984a) obj).m25660a(jsonReader, objArr[size2]);
                if (size2 == size) {
                    break;
                }
                size2++;
            }
        }
        return jsonReader;
    }

    public void toJson(@NotNull C5983k c5983k, @Nullable T t) {
        C2668g.b(c5983k, "writer");
        if (t == null) {
            throw ((Throwable) new NullPointerException("value == null"));
        }
        c5983k.mo6472c();
        for (C5984a c5984a : this.f25988b) {
            if (c5984a != null) {
                c5983k.mo6471b(c5984a.m25659a());
                c5984a.m25661b().toJson(c5983k, c5984a.m25658a(t));
            }
        }
        c5983k.mo6474d();
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KotlinJsonAdapter(");
        stringBuilder.append(this.f25987a.getReturnType());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
