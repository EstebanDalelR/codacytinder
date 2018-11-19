package com.foursquare.api;

import android.support.annotation.Nullable;
import com.foursquare.pilgrim.PilgrimUserInfo;
import com.foursquare.pilgrim.RegionType;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

final class AutoValue_PilgrimSearchParams extends C$AutoValue_PilgrimSearchParams {

    public static final class GsonTypeAdapter extends TypeAdapter<PilgrimSearchParams> {
        private final TypeAdapter<String> checksumAdapter;
        private final TypeAdapter<Long> elapsedRealtimeNanosAdapter;
        private final TypeAdapter<Boolean> hasHomeWorkAdapter;
        private final TypeAdapter<Integer> limitAdapter;
        private final TypeAdapter<Boolean> limitAdsTrackingAdapter;
        private final TypeAdapter<FoursquareLocation> locationAdapter;
        private final TypeAdapter<RegionType> locationTypeAdapter;
        private final TypeAdapter<String> nearbyTriggersAdapter;
        private final TypeAdapter<Long> nowAdapter;
        private final TypeAdapter<Boolean> skipLoggingAdapter;
        private final TypeAdapter<Long> timestampAdapter;
        private final TypeAdapter<PilgrimUserInfo> userInfoAdapter;
        private final TypeAdapter<String> wifiScanAdapter;

        public GsonTypeAdapter(Gson gson) {
            this.locationAdapter = gson.getAdapter(FoursquareLocation.class);
            this.timestampAdapter = gson.getAdapter(Long.class);
            this.nowAdapter = gson.getAdapter(Long.class);
            this.elapsedRealtimeNanosAdapter = gson.getAdapter(Long.class);
            this.limitAdapter = gson.getAdapter(Integer.class);
            this.wifiScanAdapter = gson.getAdapter(String.class);
            this.limitAdsTrackingAdapter = gson.getAdapter(Boolean.class);
            this.checksumAdapter = gson.getAdapter(String.class);
            this.hasHomeWorkAdapter = gson.getAdapter(Boolean.class);
            this.userInfoAdapter = gson.getAdapter(PilgrimUserInfo.class);
            this.locationTypeAdapter = gson.getAdapter(RegionType.class);
            this.nearbyTriggersAdapter = gson.getAdapter(String.class);
            this.skipLoggingAdapter = gson.getAdapter(Boolean.class);
        }

        public void write(JsonWriter jsonWriter, PilgrimSearchParams pilgrimSearchParams) throws IOException {
            if (pilgrimSearchParams == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("location");
            this.locationAdapter.write(jsonWriter, pilgrimSearchParams.location());
            jsonWriter.name("timestamp");
            this.timestampAdapter.write(jsonWriter, Long.valueOf(pilgrimSearchParams.timestamp()));
            jsonWriter.name("now");
            this.nowAdapter.write(jsonWriter, Long.valueOf(pilgrimSearchParams.now()));
            jsonWriter.name("elapsedRealtimeNanos");
            this.elapsedRealtimeNanosAdapter.write(jsonWriter, Long.valueOf(pilgrimSearchParams.elapsedRealtimeNanos()));
            jsonWriter.name(ManagerWebServices.PARAM_LIMIT);
            this.limitAdapter.write(jsonWriter, Integer.valueOf(pilgrimSearchParams.limit()));
            jsonWriter.name("wifiScan");
            this.wifiScanAdapter.write(jsonWriter, pilgrimSearchParams.wifiScan());
            jsonWriter.name("limitAdsTracking");
            this.limitAdsTrackingAdapter.write(jsonWriter, Boolean.valueOf(pilgrimSearchParams.limitAdsTracking()));
            jsonWriter.name("checksum");
            this.checksumAdapter.write(jsonWriter, pilgrimSearchParams.checksum());
            jsonWriter.name("hasHomeWork");
            this.hasHomeWorkAdapter.write(jsonWriter, Boolean.valueOf(pilgrimSearchParams.hasHomeWork()));
            jsonWriter.name("userInfo");
            this.userInfoAdapter.write(jsonWriter, pilgrimSearchParams.userInfo());
            jsonWriter.name("locationType");
            this.locationTypeAdapter.write(jsonWriter, pilgrimSearchParams.locationType());
            jsonWriter.name("nearbyTriggers");
            this.nearbyTriggersAdapter.write(jsonWriter, pilgrimSearchParams.nearbyTriggers());
            jsonWriter.name("skipLogging");
            this.skipLoggingAdapter.write(jsonWriter, Boolean.valueOf(pilgrimSearchParams.skipLogging()));
            jsonWriter.endObject();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.foursquare.api.PilgrimSearchParams read(com.google.gson.stream.JsonReader r24) throws java.io.IOException {
            /*
            r23 = this;
            r0 = r23;
            r1 = r24;
            r2 = r24.peek();
            r3 = com.google.gson.stream.JsonToken.NULL;
            r4 = 0;
            if (r2 != r3) goto L_0x0011;
        L_0x000d:
            r24.nextNull();
            return r4;
        L_0x0011:
            r24.beginObject();
            r2 = 0;
            r5 = 0;
            r8 = r2;
            r10 = r8;
            r12 = r10;
            r7 = r4;
            r15 = r7;
            r17 = r15;
            r19 = r17;
            r20 = r19;
            r21 = r20;
            r14 = 0;
            r16 = 0;
            r18 = 0;
            r22 = 0;
        L_0x002b:
            r2 = r24.hasNext();
            if (r2 == 0) goto L_0x0190;
        L_0x0031:
            r2 = r24.nextName();
            r3 = r24.peek();
            r4 = com.google.gson.stream.JsonToken.NULL;
            if (r3 != r4) goto L_0x0041;
        L_0x003d:
            r24.nextNull();
            goto L_0x002b;
        L_0x0041:
            r3 = -1;
            r4 = r2.hashCode();
            switch(r4) {
                case -1906612918: goto L_0x00ca;
                case -1522035508: goto L_0x00c0;
                case -1340647630: goto L_0x00b6;
                case -1214045984: goto L_0x00ab;
                case -654962312: goto L_0x00a1;
                case -266803431: goto L_0x0096;
                case -58277745: goto L_0x008b;
                case 109270: goto L_0x0081;
                case 55126294: goto L_0x0077;
                case 102976443: goto L_0x006d;
                case 1426915674: goto L_0x0061;
                case 1536908355: goto L_0x0056;
                case 1901043637: goto L_0x004b;
                default: goto L_0x0049;
            };
        L_0x0049:
            goto L_0x00d5;
        L_0x004b:
            r4 = "location";
            r2 = r2.equals(r4);
            if (r2 == 0) goto L_0x00d5;
        L_0x0053:
            r2 = 0;
            goto L_0x00d6;
        L_0x0056:
            r4 = "checksum";
            r2 = r2.equals(r4);
            if (r2 == 0) goto L_0x00d5;
        L_0x005e:
            r2 = 7;
            goto L_0x00d6;
        L_0x0061:
            r4 = "nearbyTriggers";
            r2 = r2.equals(r4);
            if (r2 == 0) goto L_0x00d5;
        L_0x0069:
            r2 = 11;
            goto L_0x00d6;
        L_0x006d:
            r4 = "limit";
            r2 = r2.equals(r4);
            if (r2 == 0) goto L_0x00d5;
        L_0x0075:
            r2 = 4;
            goto L_0x00d6;
        L_0x0077:
            r4 = "timestamp";
            r2 = r2.equals(r4);
            if (r2 == 0) goto L_0x00d5;
        L_0x007f:
            r2 = 1;
            goto L_0x00d6;
        L_0x0081:
            r4 = "now";
            r2 = r2.equals(r4);
            if (r2 == 0) goto L_0x00d5;
        L_0x0089:
            r2 = 2;
            goto L_0x00d6;
        L_0x008b:
            r4 = "locationType";
            r2 = r2.equals(r4);
            if (r2 == 0) goto L_0x00d5;
        L_0x0093:
            r2 = 10;
            goto L_0x00d6;
        L_0x0096:
            r4 = "userInfo";
            r2 = r2.equals(r4);
            if (r2 == 0) goto L_0x00d5;
        L_0x009e:
            r2 = 9;
            goto L_0x00d6;
        L_0x00a1:
            r4 = "elapsedRealtimeNanos";
            r2 = r2.equals(r4);
            if (r2 == 0) goto L_0x00d5;
        L_0x00a9:
            r2 = 3;
            goto L_0x00d6;
        L_0x00ab:
            r4 = "skipLogging";
            r2 = r2.equals(r4);
            if (r2 == 0) goto L_0x00d5;
        L_0x00b3:
            r2 = 12;
            goto L_0x00d6;
        L_0x00b6:
            r4 = "wifiScan";
            r2 = r2.equals(r4);
            if (r2 == 0) goto L_0x00d5;
        L_0x00be:
            r2 = 5;
            goto L_0x00d6;
        L_0x00c0:
            r4 = "limitAdsTracking";
            r2 = r2.equals(r4);
            if (r2 == 0) goto L_0x00d5;
        L_0x00c8:
            r2 = 6;
            goto L_0x00d6;
        L_0x00ca:
            r4 = "hasHomeWork";
            r2 = r2.equals(r4);
            if (r2 == 0) goto L_0x00d5;
        L_0x00d2:
            r2 = 8;
            goto L_0x00d6;
        L_0x00d5:
            r2 = -1;
        L_0x00d6:
            switch(r2) {
                case 0: goto L_0x0185;
                case 1: goto L_0x0176;
                case 2: goto L_0x0167;
                case 3: goto L_0x0158;
                case 4: goto L_0x0149;
                case 5: goto L_0x013e;
                case 6: goto L_0x012e;
                case 7: goto L_0x0122;
                case 8: goto L_0x0112;
                case 9: goto L_0x0106;
                case 10: goto L_0x00fa;
                case 11: goto L_0x00ee;
                case 12: goto L_0x00de;
                default: goto L_0x00d9;
            };
        L_0x00d9:
            r24.skipValue();
            goto L_0x002b;
        L_0x00de:
            r2 = r0.skipLoggingAdapter;
            r2 = r2.read(r1);
            r2 = (java.lang.Boolean) r2;
            r2 = r2.booleanValue();
            r22 = r2;
            goto L_0x002b;
        L_0x00ee:
            r2 = r0.nearbyTriggersAdapter;
            r2 = r2.read(r1);
            r2 = (java.lang.String) r2;
            r21 = r2;
            goto L_0x002b;
        L_0x00fa:
            r2 = r0.locationTypeAdapter;
            r2 = r2.read(r1);
            r2 = (com.foursquare.pilgrim.RegionType) r2;
            r20 = r2;
            goto L_0x002b;
        L_0x0106:
            r2 = r0.userInfoAdapter;
            r2 = r2.read(r1);
            r2 = (com.foursquare.pilgrim.PilgrimUserInfo) r2;
            r19 = r2;
            goto L_0x002b;
        L_0x0112:
            r2 = r0.hasHomeWorkAdapter;
            r2 = r2.read(r1);
            r2 = (java.lang.Boolean) r2;
            r2 = r2.booleanValue();
            r18 = r2;
            goto L_0x002b;
        L_0x0122:
            r2 = r0.checksumAdapter;
            r2 = r2.read(r1);
            r2 = (java.lang.String) r2;
            r17 = r2;
            goto L_0x002b;
        L_0x012e:
            r2 = r0.limitAdsTrackingAdapter;
            r2 = r2.read(r1);
            r2 = (java.lang.Boolean) r2;
            r2 = r2.booleanValue();
            r16 = r2;
            goto L_0x002b;
        L_0x013e:
            r2 = r0.wifiScanAdapter;
            r2 = r2.read(r1);
            r2 = (java.lang.String) r2;
            r15 = r2;
            goto L_0x002b;
        L_0x0149:
            r2 = r0.limitAdapter;
            r2 = r2.read(r1);
            r2 = (java.lang.Integer) r2;
            r2 = r2.intValue();
            r14 = r2;
            goto L_0x002b;
        L_0x0158:
            r2 = r0.elapsedRealtimeNanosAdapter;
            r2 = r2.read(r1);
            r2 = (java.lang.Long) r2;
            r2 = r2.longValue();
            r12 = r2;
            goto L_0x002b;
        L_0x0167:
            r2 = r0.nowAdapter;
            r2 = r2.read(r1);
            r2 = (java.lang.Long) r2;
            r2 = r2.longValue();
            r10 = r2;
            goto L_0x002b;
        L_0x0176:
            r2 = r0.timestampAdapter;
            r2 = r2.read(r1);
            r2 = (java.lang.Long) r2;
            r2 = r2.longValue();
            r8 = r2;
            goto L_0x002b;
        L_0x0185:
            r2 = r0.locationAdapter;
            r2 = r2.read(r1);
            r2 = (com.foursquare.api.FoursquareLocation) r2;
            r7 = r2;
            goto L_0x002b;
        L_0x0190:
            r24.endObject();
            r1 = new com.foursquare.api.AutoValue_PilgrimSearchParams;
            r6 = r1;
            r6.<init>(r7, r8, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22);
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.foursquare.api.AutoValue_PilgrimSearchParams.GsonTypeAdapter.read(com.google.gson.stream.JsonReader):com.foursquare.api.PilgrimSearchParams");
        }
    }

    AutoValue_PilgrimSearchParams(FoursquareLocation foursquareLocation, long j, long j2, long j3, int i, @Nullable String str, boolean z, @Nullable String str2, boolean z2, @Nullable PilgrimUserInfo pilgrimUserInfo, RegionType regionType, @Nullable String str3, boolean z3) {
        super(foursquareLocation, j, j2, j3, i, str, z, str2, z2, pilgrimUserInfo, regionType, str3, z3);
    }
}
