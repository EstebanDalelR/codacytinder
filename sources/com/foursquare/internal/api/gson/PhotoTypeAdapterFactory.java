package com.foursquare.internal.api.gson;

import android.text.TextUtils;
import com.foursquare.api.types.Photo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public class PhotoTypeAdapterFactory implements TypeAdapterFactory {

    /* renamed from: com.foursquare.internal.api.gson.PhotoTypeAdapterFactory$2 */
    static /* synthetic */ class C19152 {
        /* renamed from: a */
        static final /* synthetic */ int[] f5134a = new int[JsonToken.values().length];

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
            f5134a = r0;
            r0 = f5134a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = f5134a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.google.gson.stream.JsonToken.STRING;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.foursquare.internal.api.gson.PhotoTypeAdapterFactory.2.<clinit>():void");
        }
    }

    public <T> TypeAdapter<T> create(final Gson gson, TypeToken<T> typeToken) {
        if (typeToken.getRawType() != Photo.class) {
            return null;
        }
        return new TypeAdapter<T>(this) {
            /* renamed from: b */
            final /* synthetic */ PhotoTypeAdapterFactory f10570b;

            public void write(JsonWriter jsonWriter, T t) throws IOException {
                if (t == null) {
                    jsonWriter.nullValue();
                    return;
                }
                Photo photo = (Photo) t;
                jsonWriter.beginObject();
                jsonWriter.name("createdAt");
                jsonWriter.value(photo.getCreatedAt());
                jsonWriter.name("width");
                jsonWriter.value((long) photo.getWidth());
                jsonWriter.name("height");
                jsonWriter.value((long) photo.getHeight());
                jsonWriter.name("id");
                jsonWriter.value(photo.getId());
                jsonWriter.name("name");
                jsonWriter.value(photo.getName());
                jsonWriter.name("prefix");
                jsonWriter.value(photo.getPrefix());
                jsonWriter.name("suffix");
                jsonWriter.value(photo.getSuffix());
                jsonWriter.name("url");
                jsonWriter.value(photo.getUrl());
                jsonWriter.name("sizes");
                gson.toJson(photo.getSizes(), int[].class, jsonWriter);
                jsonWriter.endObject();
            }

            public T read(JsonReader jsonReader) throws IOException {
                JsonToken peek = jsonReader.peek();
                Object obj = null;
                if (peek == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                T photo = new Photo();
                switch (C19152.f5134a[peek.ordinal()]) {
                    case 1:
                        jsonReader.beginObject();
                        Object obj2 = null;
                        while (jsonReader.hasNext()) {
                            String nextName = jsonReader.nextName();
                            if (nextName.equals("createdAt")) {
                                photo.setCreatedAt(jsonReader.nextLong());
                            } else if (nextName.equals("width")) {
                                photo.setWidth(jsonReader.nextInt());
                            } else if (nextName.equals("height")) {
                                photo.setHeight(jsonReader.nextInt());
                            } else if (nextName.equals("id")) {
                                photo.setId(jsonReader.nextString());
                            } else if (nextName.equals("name")) {
                                photo.setName(jsonReader.nextString());
                            } else if (nextName.equals("prefix")) {
                                photo.setPrefix(jsonReader.nextString());
                            } else if (nextName.equals("suffix")) {
                                photo.setSuffix(jsonReader.nextString());
                            } else if (nextName.equals("url")) {
                                obj = jsonReader.nextString();
                            } else if (nextName.equals("fullPath")) {
                                obj2 = jsonReader.nextString();
                            } else if (nextName.equals("sizes")) {
                                photo.setSizes((int[]) gson.fromJson(jsonReader, int[].class));
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        if (TextUtils.isEmpty(obj) != null) {
                            if (TextUtils.isEmpty(obj2) == null) {
                                photo.setUrl(obj2);
                                break;
                            }
                        }
                        photo.setUrl(obj);
                        break;
                        break;
                    case 2:
                        photo.setUrl(jsonReader.nextString());
                        break;
                    default:
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Expected object but got");
                        stringBuilder.append(peek);
                        throw new IllegalStateException(stringBuilder.toString());
                }
                return photo;
            }
        };
    }
}
