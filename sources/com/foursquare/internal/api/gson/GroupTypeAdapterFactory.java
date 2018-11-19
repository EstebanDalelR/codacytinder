package com.foursquare.internal.api.gson;

import com.foursquare.api.types.Group;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.util.Iterator;

public class GroupTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: com.foursquare.internal.api.gson.GroupTypeAdapterFactory$2 */
    static /* synthetic */ class C19142 {
        /* renamed from: a */
        static final /* synthetic */ int[] f5133a = new int[JsonToken.values().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/79094208.run(Unknown Source)
*/
            /*
            r0 = com.google.gson.stream.JsonToken.values();
            r0 = r0.length;
            r0 = new int[r0];
            f5133a = r0;
            r0 = f5133a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f5133a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.foursquare.internal.api.gson.GroupTypeAdapterFactory.2.<clinit>():void");
        }
    }

    public <T> TypeAdapter<T> create(final Gson gson, TypeToken<T> typeToken) {
        if (typeToken.getRawType() != Group.class) {
            return null;
        }
        typeToken = ((ParameterizedType) typeToken.getType()).getActualTypeArguments()[0];
        return new TypeAdapter<T>(this) {
            /* renamed from: c */
            final /* synthetic */ GroupTypeAdapterFactory f10568c;

            public T read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                T group = new Group();
                JsonToken peek = jsonReader.peek();
                switch (C19142.f5133a[peek.ordinal()]) {
                    case 1:
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            Object fromJson = gson.fromJson(jsonReader, typeToken);
                            if (fromJson != null) {
                                group.add(fromJson);
                            }
                        }
                        jsonReader.endArray();
                        group.setCount(group.size());
                        group._isArray = true;
                        break;
                    case 2:
                        jsonReader.beginObject();
                        Object obj = null;
                        while (jsonReader.hasNext()) {
                            String nextName = jsonReader.nextName();
                            if (nextName.equals(ManagerWebServices.FB_PARAM_FIELD_COUNT)) {
                                group.setCount(jsonReader.nextInt());
                                obj = 1;
                            } else if (nextName.equals("name")) {
                                group.setName(jsonReader.nextString());
                            } else if (nextName.equals("type")) {
                                group.setType(jsonReader.nextString());
                            } else if (nextName.equals(ManagerWebServices.FB_PARAM_SUMMARY)) {
                                group.setSummary(jsonReader.nextString());
                            } else if (nextName.equals("displayStyle")) {
                                group.setDisplayStyle(jsonReader.nextString());
                            } else if (nextName.equals("isPlaceholderGroup")) {
                                group.setIsPlaceholderGroup(jsonReader.nextBoolean());
                            } else if (nextName.equals("placeholderLimit")) {
                                group.setPlaceholderLimit(jsonReader.nextInt());
                            } else if (nextName.equals("initialCountToShow")) {
                                group.setInitialCountToShow(jsonReader.nextInt());
                            } else if (nextName.equals("items")) {
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    Object fromJson2 = gson.fromJson(jsonReader, typeToken);
                                    if (fromJson2 != null) {
                                        group.add(fromJson2);
                                    }
                                }
                                jsonReader.endArray();
                                if (obj == null) {
                                    group.setCount(group.size());
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        group._isArray = false;
                        jsonReader.endObject();
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Expected either an object or array but got ");
                        stringBuilder.append(peek);
                        throw new IllegalStateException(stringBuilder.toString());
                }
                return group;
            }

            public void write(JsonWriter jsonWriter, T t) throws IOException {
                if (t == null) {
                    jsonWriter.nullValue();
                    return;
                }
                Group group = (Group) t;
                if (group._isArray) {
                    jsonWriter.beginArray();
                    t = group.iterator();
                    while (t.hasNext()) {
                        gson.toJson(t.next(), typeToken, jsonWriter);
                    }
                    jsonWriter.endArray();
                } else {
                    jsonWriter.beginObject();
                    jsonWriter.name("items");
                    jsonWriter.beginArray();
                    Iterator it = group.iterator();
                    while (it.hasNext()) {
                        gson.toJson(it.next(), typeToken, jsonWriter);
                    }
                    jsonWriter.endArray();
                    jsonWriter.name("name");
                    jsonWriter.value(group.getName());
                    jsonWriter.name("type");
                    jsonWriter.value(group.getType());
                    jsonWriter.name(ManagerWebServices.FB_PARAM_SUMMARY);
                    jsonWriter.value(group.getSummary());
                    jsonWriter.name("displayStyle");
                    jsonWriter.value(group.getDisplayStyle());
                    jsonWriter.name(ManagerWebServices.FB_PARAM_FIELD_COUNT);
                    jsonWriter.value((long) group.getCount());
                    jsonWriter.name("isPlaceholderGroup");
                    jsonWriter.value(group.isPlaceholderGroup());
                    jsonWriter.name("placeholderLimit");
                    jsonWriter.value((long) group.getPlaceholderLimit());
                    jsonWriter.name("initialCountToShow");
                    jsonWriter.value((long) group.getInitialCountToShow());
                    jsonWriter.endObject();
                }
            }
        };
    }
}
