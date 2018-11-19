package com.foursquare.pilgrim;

import android.support.annotation.Nullable;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

final class AutoValue_WifiScanResult extends C3513a {

    public static final class GsonTypeAdapter extends TypeAdapter<WifiScanResult> {
        /* renamed from: a */
        private final TypeAdapter<Long> f10579a;
        /* renamed from: b */
        private final TypeAdapter<String> f10580b;
        /* renamed from: c */
        private final TypeAdapter<String> f10581c;
        /* renamed from: d */
        private final TypeAdapter<Integer> f10582d;
        /* renamed from: e */
        private final TypeAdapter<Integer> f10583e;

        public GsonTypeAdapter(Gson gson) {
            this.f10579a = gson.getAdapter(Long.class);
            this.f10580b = gson.getAdapter(String.class);
            this.f10581c = gson.getAdapter(String.class);
            this.f10582d = gson.getAdapter(Integer.class);
            this.f10583e = gson.getAdapter(Integer.class);
        }

        public void write(JsonWriter jsonWriter, WifiScanResult wifiScanResult) throws IOException {
            if (wifiScanResult == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("timestamp");
            this.f10579a.write(jsonWriter, Long.valueOf(wifiScanResult.timestamp()));
            jsonWriter.name("ssid");
            this.f10580b.write(jsonWriter, wifiScanResult.ssid());
            jsonWriter.name("bssid");
            this.f10581c.write(jsonWriter, wifiScanResult.bssid());
            jsonWriter.name("frequency");
            this.f10582d.write(jsonWriter, Integer.valueOf(wifiScanResult.frequency()));
            jsonWriter.name("rssi");
            this.f10583e.write(jsonWriter, Integer.valueOf(wifiScanResult.rssi()));
            jsonWriter.endObject();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.foursquare.pilgrim.WifiScanResult read(com.google.gson.stream.JsonReader r12) throws java.io.IOException {
            /*
            r11 = this;
            r0 = r12.peek();
            r1 = com.google.gson.stream.JsonToken.NULL;
            r2 = 0;
            if (r0 != r1) goto L_0x000d;
        L_0x0009:
            r12.nextNull();
            return r2;
        L_0x000d:
            r12.beginObject();
            r0 = 0;
            r3 = 0;
            r5 = r0;
            r7 = r2;
            r8 = r7;
            r9 = 0;
            r10 = 0;
        L_0x0018:
            r0 = r12.hasNext();
            if (r0 == 0) goto L_0x00b1;
        L_0x001e:
            r0 = r12.nextName();
            r1 = r12.peek();
            r2 = com.google.gson.stream.JsonToken.NULL;
            if (r1 != r2) goto L_0x002e;
        L_0x002a:
            r12.nextNull();
            goto L_0x0018;
        L_0x002e:
            r1 = -1;
            r2 = r0.hashCode();
            switch(r2) {
                case -70023844: goto L_0x005f;
                case 3510359: goto L_0x0055;
                case 3539835: goto L_0x004b;
                case 55126294: goto L_0x0041;
                case 94044893: goto L_0x0037;
                default: goto L_0x0036;
            };
        L_0x0036:
            goto L_0x0069;
        L_0x0037:
            r2 = "bssid";
            r0 = r0.equals(r2);
            if (r0 == 0) goto L_0x0069;
        L_0x003f:
            r0 = 2;
            goto L_0x006a;
        L_0x0041:
            r2 = "timestamp";
            r0 = r0.equals(r2);
            if (r0 == 0) goto L_0x0069;
        L_0x0049:
            r0 = 0;
            goto L_0x006a;
        L_0x004b:
            r2 = "ssid";
            r0 = r0.equals(r2);
            if (r0 == 0) goto L_0x0069;
        L_0x0053:
            r0 = 1;
            goto L_0x006a;
        L_0x0055:
            r2 = "rssi";
            r0 = r0.equals(r2);
            if (r0 == 0) goto L_0x0069;
        L_0x005d:
            r0 = 4;
            goto L_0x006a;
        L_0x005f:
            r2 = "frequency";
            r0 = r0.equals(r2);
            if (r0 == 0) goto L_0x0069;
        L_0x0067:
            r0 = 3;
            goto L_0x006a;
        L_0x0069:
            r0 = -1;
        L_0x006a:
            switch(r0) {
                case 0: goto L_0x00a2;
                case 1: goto L_0x0097;
                case 2: goto L_0x008d;
                case 3: goto L_0x007f;
                case 4: goto L_0x0071;
                default: goto L_0x006d;
            };
        L_0x006d:
            r12.skipValue();
            goto L_0x0018;
        L_0x0071:
            r0 = r11.f10583e;
            r0 = r0.read(r12);
            r0 = (java.lang.Integer) r0;
            r0 = r0.intValue();
            r10 = r0;
            goto L_0x0018;
        L_0x007f:
            r0 = r11.f10582d;
            r0 = r0.read(r12);
            r0 = (java.lang.Integer) r0;
            r0 = r0.intValue();
            r9 = r0;
            goto L_0x0018;
        L_0x008d:
            r0 = r11.f10581c;
            r0 = r0.read(r12);
            r0 = (java.lang.String) r0;
            r8 = r0;
            goto L_0x0018;
        L_0x0097:
            r0 = r11.f10580b;
            r0 = r0.read(r12);
            r0 = (java.lang.String) r0;
            r7 = r0;
            goto L_0x0018;
        L_0x00a2:
            r0 = r11.f10579a;
            r0 = r0.read(r12);
            r0 = (java.lang.Long) r0;
            r0 = r0.longValue();
            r5 = r0;
            goto L_0x0018;
        L_0x00b1:
            r12.endObject();
            r12 = new com.foursquare.pilgrim.AutoValue_WifiScanResult;
            r4 = r12;
            r4.<init>(r5, r7, r8, r9, r10);
            return r12;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.foursquare.pilgrim.AutoValue_WifiScanResult.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.foursquare.pilgrim.WifiScanResult");
        }
    }

    AutoValue_WifiScanResult(long j, @Nullable String str, @Nullable String str2, int i, int i2) {
        super(j, str, str2, i, i2);
    }
}
