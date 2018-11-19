package com.foursquare.internal.api.gson;

import com.foursquare.api.types.FoursquareType;
import com.foursquare.api.types.ResponseV2;
import com.foursquare.api.types.ResponseV2.Meta;
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

public class ResponseV2TypeAdapterFactory implements TypeAdapterFactory {
    public <T> TypeAdapter<T> create(final Gson gson, TypeToken<T> typeToken) {
        if (typeToken.getRawType() != ResponseV2.class) {
            return null;
        }
        typeToken = ((ParameterizedType) typeToken.getType()).getActualTypeArguments()[0];
        return new TypeAdapter<T>(this) {
            /* renamed from: c */
            final /* synthetic */ ResponseV2TypeAdapterFactory f10573c;

            public void write(JsonWriter jsonWriter, T t) throws IOException {
            }

            public T read(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.nextNull();
                    return null;
                }
                T responseV2 = new ResponseV2();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if (nextName.equals(ManagerWebServices.PARAM_META)) {
                        responseV2.setMeta((Meta) gson.fromJson(jsonReader, Meta.class));
                    } else if (nextName.equals("response")) {
                        responseV2.setResult((FoursquareType) gson.fromJson(jsonReader, typeToken));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                return responseV2;
            }
        };
    }
}
