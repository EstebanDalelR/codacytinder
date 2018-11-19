package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import java.io.IOException;

final class AutoValue_ProcessedFile extends C$AutoValue_ProcessedFile {

    public static final class MoshiJsonAdapter extends JsonAdapter<ProcessedFile> {
        private static final String[] NAMES = new String[]{"width", "height", "url"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Integer> heightAdapter;
        private final JsonAdapter<String> urlAdapter;
        private final JsonAdapter<Integer> widthAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.widthAdapter = c5987p.a(Integer.class);
            this.heightAdapter = c5987p.a(Integer.class);
            this.urlAdapter = c5987p.a(String.class);
        }

        public ProcessedFile fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Integer num = null;
            Integer num2 = null;
            String str = num2;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        num = (Integer) this.widthAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        num2 = (Integer) this.heightAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        str = (String) this.urlAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_ProcessedFile(num, num2, str);
        }

        public void toJson(C5983k c5983k, ProcessedFile processedFile) throws IOException {
            c5983k.c();
            Integer width = processedFile.width();
            if (width != null) {
                c5983k.b("width");
                this.widthAdapter.toJson(c5983k, width);
            }
            width = processedFile.height();
            if (width != null) {
                c5983k.b("height");
                this.heightAdapter.toJson(c5983k, width);
            }
            processedFile = processedFile.url();
            if (processedFile != null) {
                c5983k.b("url");
                this.urlAdapter.toJson(c5983k, processedFile);
            }
            c5983k.d();
        }
    }

    AutoValue_ProcessedFile(Integer num, Integer num2, String str) {
        super(num, num2, str);
    }
}
