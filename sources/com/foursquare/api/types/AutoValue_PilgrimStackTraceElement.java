package com.foursquare.api.types;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

final class AutoValue_PilgrimStackTraceElement extends C$AutoValue_PilgrimStackTraceElement {

    public static final class GsonTypeAdapter extends TypeAdapter<PilgrimStackTraceElement> {
        private final TypeAdapter<String> classNameAdapter;
        private final TypeAdapter<String> fileNameAdapter;
        private final TypeAdapter<Integer> linenoAdapter;
        private final TypeAdapter<String> methodAdapter;

        public GsonTypeAdapter(Gson gson) {
            this.classNameAdapter = gson.getAdapter(String.class);
            this.methodAdapter = gson.getAdapter(String.class);
            this.fileNameAdapter = gson.getAdapter(String.class);
            this.linenoAdapter = gson.getAdapter(Integer.class);
        }

        public void write(JsonWriter jsonWriter, PilgrimStackTraceElement pilgrimStackTraceElement) throws IOException {
            if (pilgrimStackTraceElement == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("className");
            this.classNameAdapter.write(jsonWriter, pilgrimStackTraceElement.className());
            jsonWriter.name("method");
            this.methodAdapter.write(jsonWriter, pilgrimStackTraceElement.method());
            jsonWriter.name("fileName");
            this.fileNameAdapter.write(jsonWriter, pilgrimStackTraceElement.fileName());
            jsonWriter.name("lineno");
            this.linenoAdapter.write(jsonWriter, Integer.valueOf(pilgrimStackTraceElement.lineno()));
            jsonWriter.endObject();
        }

        public PilgrimStackTraceElement read(JsonReader jsonReader) throws IOException {
            String str = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str2 = null;
            String str3 = str2;
            int i = 0;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    Object obj;
                    int hashCode = nextName.hashCode();
                    if (hashCode == -1102671691) {
                        if (nextName.equals("lineno")) {
                            obj = 3;
                            switch (obj) {
                                case null:
                                    str = (String) this.classNameAdapter.read(jsonReader);
                                    break;
                                case 1:
                                    str2 = (String) this.methodAdapter.read(jsonReader);
                                    break;
                                case 2:
                                    str3 = (String) this.fileNameAdapter.read(jsonReader);
                                    break;
                                case 3:
                                    i = ((Integer) this.linenoAdapter.read(jsonReader)).intValue();
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        }
                    } else if (hashCode == -1077554975) {
                        if (nextName.equals("method")) {
                            obj = 1;
                            switch (obj) {
                                case null:
                                    str = (String) this.classNameAdapter.read(jsonReader);
                                    break;
                                case 1:
                                    str2 = (String) this.methodAdapter.read(jsonReader);
                                    break;
                                case 2:
                                    str3 = (String) this.fileNameAdapter.read(jsonReader);
                                    break;
                                case 3:
                                    i = ((Integer) this.linenoAdapter.read(jsonReader)).intValue();
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        }
                    } else if (hashCode == -735721945) {
                        if (nextName.equals("fileName")) {
                            obj = 2;
                            switch (obj) {
                                case null:
                                    str = (String) this.classNameAdapter.read(jsonReader);
                                    break;
                                case 1:
                                    str2 = (String) this.methodAdapter.read(jsonReader);
                                    break;
                                case 2:
                                    str3 = (String) this.fileNameAdapter.read(jsonReader);
                                    break;
                                case 3:
                                    i = ((Integer) this.linenoAdapter.read(jsonReader)).intValue();
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        }
                    } else if (hashCode == -9888733) {
                        if (nextName.equals("className")) {
                            obj = null;
                            switch (obj) {
                                case null:
                                    str = (String) this.classNameAdapter.read(jsonReader);
                                    break;
                                case 1:
                                    str2 = (String) this.methodAdapter.read(jsonReader);
                                    break;
                                case 2:
                                    str3 = (String) this.fileNameAdapter.read(jsonReader);
                                    break;
                                case 3:
                                    i = ((Integer) this.linenoAdapter.read(jsonReader)).intValue();
                                    break;
                                default:
                                    jsonReader.skipValue();
                                    break;
                            }
                        }
                    }
                    obj = -1;
                    switch (obj) {
                        case null:
                            str = (String) this.classNameAdapter.read(jsonReader);
                            break;
                        case 1:
                            str2 = (String) this.methodAdapter.read(jsonReader);
                            break;
                        case 2:
                            str3 = (String) this.fileNameAdapter.read(jsonReader);
                            break;
                        case 3:
                            i = ((Integer) this.linenoAdapter.read(jsonReader)).intValue();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.nextNull();
            }
            jsonReader.endObject();
            return new AutoValue_PilgrimStackTraceElement(str, str2, str3, i);
        }
    }

    AutoValue_PilgrimStackTraceElement(@Nullable String str, @Nullable String str2, @Nullable String str3, int i) {
        super(str, str2, str3, i);
    }
}
