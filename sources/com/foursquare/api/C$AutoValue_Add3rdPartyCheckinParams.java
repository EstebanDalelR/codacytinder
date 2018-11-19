package com.foursquare.api;

import android.support.annotation.Nullable;
import com.foursquare.api.Add3rdPartyCheckinParams.VenueIdType;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Date;

/* renamed from: com.foursquare.api.$AutoValue_Add3rdPartyCheckinParams */
abstract class C$AutoValue_Add3rdPartyCheckinParams extends C$$AutoValue_Add3rdPartyCheckinParams {

    public static final class GsonTypeAdapter extends TypeAdapter<Add3rdPartyCheckinParams> {
        private final TypeAdapter<FoursquareLocation> llAdapter;
        private final TypeAdapter<Date> nowAdapter;
        private final TypeAdapter<String> pilgrimVisitIdAdapter;
        private final TypeAdapter<String> venueIdAdapter;
        private final TypeAdapter<VenueIdType> venueIdTypeAdapter;
        private final TypeAdapter<String> wifiScanAdapter;

        public GsonTypeAdapter(Gson gson) {
            this.venueIdAdapter = gson.getAdapter(String.class);
            this.venueIdTypeAdapter = gson.getAdapter(VenueIdType.class);
            this.nowAdapter = gson.getAdapter(Date.class);
            this.pilgrimVisitIdAdapter = gson.getAdapter(String.class);
            this.wifiScanAdapter = gson.getAdapter(String.class);
            this.llAdapter = gson.getAdapter(FoursquareLocation.class);
        }

        public void write(JsonWriter jsonWriter, Add3rdPartyCheckinParams add3rdPartyCheckinParams) throws IOException {
            if (add3rdPartyCheckinParams == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("venueId");
            this.venueIdAdapter.write(jsonWriter, add3rdPartyCheckinParams.venueId());
            jsonWriter.name("venueIdType");
            this.venueIdTypeAdapter.write(jsonWriter, add3rdPartyCheckinParams.venueIdType());
            jsonWriter.name("now");
            this.nowAdapter.write(jsonWriter, add3rdPartyCheckinParams.now());
            jsonWriter.name("pilgrimVisitId");
            this.pilgrimVisitIdAdapter.write(jsonWriter, add3rdPartyCheckinParams.pilgrimVisitId());
            jsonWriter.name("wifiScan");
            this.wifiScanAdapter.write(jsonWriter, add3rdPartyCheckinParams.wifiScan());
            jsonWriter.name("ll");
            this.llAdapter.write(jsonWriter, add3rdPartyCheckinParams.ll());
            jsonWriter.endObject();
        }

        public Add3rdPartyCheckinParams read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            String str = null;
            VenueIdType venueIdType = str;
            Date date = venueIdType;
            String str2 = date;
            String str3 = str2;
            FoursquareLocation foursquareLocation = str3;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    Object obj = -1;
                    switch (nextName.hashCode()) {
                        case -1832545724:
                            if (nextName.equals("venueIdType")) {
                                obj = 1;
                                break;
                            }
                            break;
                        case -1340647630:
                            if (nextName.equals("wifiScan")) {
                                obj = 4;
                                break;
                            }
                            break;
                        case 3456:
                            if (nextName.equals("ll")) {
                                obj = 5;
                                break;
                            }
                            break;
                        case 109270:
                            if (nextName.equals("now")) {
                                obj = 2;
                                break;
                            }
                            break;
                        case 347968490:
                            if (nextName.equals("venueId")) {
                                obj = null;
                                break;
                            }
                            break;
                        case 510417412:
                            if (nextName.equals("pilgrimVisitId")) {
                                obj = 3;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    switch (obj) {
                        case null:
                            str = (String) this.venueIdAdapter.read(jsonReader);
                            break;
                        case 1:
                            venueIdType = (VenueIdType) this.venueIdTypeAdapter.read(jsonReader);
                            break;
                        case 2:
                            date = (Date) this.nowAdapter.read(jsonReader);
                            break;
                        case 3:
                            str2 = (String) this.pilgrimVisitIdAdapter.read(jsonReader);
                            break;
                        case 4:
                            str3 = (String) this.wifiScanAdapter.read(jsonReader);
                            break;
                        case 5:
                            foursquareLocation = (FoursquareLocation) this.llAdapter.read(jsonReader);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.nextNull();
            }
            jsonReader.endObject();
            return new AutoValue_Add3rdPartyCheckinParams(str, venueIdType, date, str2, str3, foursquareLocation);
        }
    }

    C$AutoValue_Add3rdPartyCheckinParams(String str, VenueIdType venueIdType, Date date, @Nullable String str2, @Nullable String str3, FoursquareLocation foursquareLocation) {
        super(str, venueIdType, date, str2, str3, foursquareLocation);
    }
}
