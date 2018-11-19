package com.tinder.analytics.fireworks.api;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.tinder.analytics.fireworks.C2632i;
import com.tinder.analytics.fireworks.C2633r;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p000a.p001a.C0001a;

/* renamed from: com.tinder.analytics.fireworks.api.a */
class C7320a extends TypeAdapter<C2632i> {
    C7320a() {
    }

    public /* synthetic */ Object read(@NonNull JsonReader jsonReader) throws IOException {
        return m31246a(jsonReader);
    }

    public /* synthetic */ void write(@NonNull JsonWriter jsonWriter, @Nullable Object obj) throws IOException {
        m31247a(jsonWriter, (C2632i) obj);
    }

    /* renamed from: a */
    public void m31247a(@NonNull JsonWriter jsonWriter, @Nullable C2632i c2632i) throws IOException {
        if (c2632i == null) {
            jsonWriter.nullValue();
            return;
        }
        Set entrySet = c2632i.c().entrySet();
        jsonWriter.beginObject();
        jsonWriter.name("schema");
        jsonWriter.value(c2632i.b());
        if (entrySet.isEmpty() == null) {
            m31233a(jsonWriter, entrySet);
        }
        jsonWriter.endObject();
    }

    /* renamed from: a */
    public C2632i m31246a(@NonNull JsonReader jsonReader) throws IOException {
        throw new IOException("Unable to read FireworksEvent from JSON");
    }

    /* renamed from: a */
    private void m31233a(@NonNull JsonWriter jsonWriter, @NonNull Set<Entry<C2633r, Object>> set) throws IOException {
        jsonWriter.name("event");
        jsonWriter.beginObject();
        for (Entry entry : set) {
            C2633r c2633r = (C2633r) entry.getKey();
            String a = c2633r.a();
            Class b = c2633r.b();
            Object value = entry.getValue();
            jsonWriter.name(a);
            C7320a.m31230a(jsonWriter, b, value);
        }
        jsonWriter.endObject();
    }

    /* renamed from: a */
    private static void m31230a(@NonNull JsonWriter jsonWriter, @NonNull Class<?> cls, @NonNull Object obj) throws IOException {
        if (cls == String.class) {
            jsonWriter.value((String) obj);
        } else if (cls == Boolean.class) {
            jsonWriter.value((Boolean) obj);
        } else if (Number.class.isAssignableFrom(cls)) {
            jsonWriter.value((Number) obj);
        } else if (List.class.isAssignableFrom(cls)) {
            C7320a.m31231a(jsonWriter, (List) obj);
        } else if (Map.class.isAssignableFrom(cls)) {
            C7320a.m31232a(jsonWriter, (Map) obj);
        } else {
            obj = new StringBuilder();
            obj.append("Unsupported type: ");
            obj.append(cls);
            throw new IOException(obj.toString());
        }
    }

    /* renamed from: a */
    private static void m31231a(@NonNull JsonWriter jsonWriter, @NonNull List list) throws IOException {
        if (C7320a.m31235a(list)) {
            C7320a.m31236b(jsonWriter, list);
        } else if (C7320a.m31237b(list)) {
            C7320a.m31238c(jsonWriter, list);
        } else if (C7320a.m31239c(list)) {
            C7320a.m31240d(jsonWriter, list);
        } else if (C7320a.m31241d(list)) {
            C7320a.m31242e(jsonWriter, list);
        } else if (C7320a.m31243e(list)) {
            C7320a.m31244f(jsonWriter, list);
        } else {
            C7320a.m31245f(list);
        }
    }

    /* renamed from: b */
    private static void m31236b(@NonNull JsonWriter jsonWriter, @NonNull List<String> list) throws IOException {
        jsonWriter.beginArray();
        for (String value : list) {
            jsonWriter.value(value);
        }
        jsonWriter.endArray();
    }

    /* renamed from: c */
    private static void m31238c(@NonNull JsonWriter jsonWriter, @NonNull List<Number> list) throws IOException {
        jsonWriter.beginArray();
        for (Number value : list) {
            jsonWriter.value(value);
        }
        jsonWriter.endArray();
    }

    /* renamed from: d */
    private static void m31240d(@NonNull JsonWriter jsonWriter, @NonNull List<Boolean> list) throws IOException {
        jsonWriter.beginArray();
        for (Boolean value : list) {
            jsonWriter.value(value);
        }
        jsonWriter.endArray();
    }

    /* renamed from: e */
    private static void m31242e(@NonNull JsonWriter jsonWriter, @NonNull List<List> list) throws IOException {
        jsonWriter.beginArray();
        for (List a : list) {
            C7320a.m31231a(jsonWriter, a);
        }
        jsonWriter.endArray();
    }

    /* renamed from: f */
    private static void m31244f(@NonNull JsonWriter jsonWriter, @NonNull List<Map> list) throws IOException {
        jsonWriter.beginArray();
        for (Map a : list) {
            C7320a.m31232a(jsonWriter, a);
        }
        jsonWriter.endArray();
    }

    /* renamed from: a */
    private static void m31232a(@NonNull JsonWriter jsonWriter, @NonNull Map map) throws IOException {
        C7320a.m31234a(map);
        jsonWriter.beginObject();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                C0001a.e("ignoring unexpected null value for key : %s", new Object[]{str});
            } else {
                jsonWriter.name(str);
                C7320a.m31230a(jsonWriter, value.getClass(), value);
            }
        }
        jsonWriter.endObject();
    }

    /* renamed from: a */
    private static boolean m31235a(@NonNull List list) {
        for (Object obj : list) {
            if (!(obj instanceof String)) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m31237b(@NonNull List list) {
        for (Object obj : list) {
            if (!(obj instanceof Number)) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m31239c(@NonNull List list) {
        for (Object obj : list) {
            if (!(obj instanceof Boolean)) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m31241d(@NonNull List list) {
        for (Object obj : list) {
            if (!(obj instanceof List)) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: e */
    private static boolean m31243e(@NonNull List list) {
        for (Object obj : list) {
            if (!(obj instanceof Map)) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static void m31234a(@NonNull Map map) throws IOException {
        for (Object obj : map.keySet()) {
            if (!(obj instanceof String)) {
                throw new IOException("Map keys can only be of type String");
            }
        }
    }

    /* renamed from: f */
    private static void m31245f(@NonNull List list) throws IOException {
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = list.get(i).getClass().getName();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("List contains mixed types and/or unsupported types: ");
        stringBuilder.append(Arrays.toString(strArr));
        throw new IOException(stringBuilder.toString());
    }
}
