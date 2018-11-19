package com.foursquare.api.types;

import android.support.annotation.Nullable;
import com.foursquare.api.types.TrailPoint.Location;
import com.foursquare.pilgrim.WifiScanResult;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_TrailPoint extends C$AutoValue_TrailPoint {

    public static final class GsonTypeAdapter extends TypeAdapter<TrailPoint> {
        private final TypeAdapter<Location> locationAdapter;
        private final TypeAdapter<GoogleMotionReading> motionReadingAdapter;
        private final TypeAdapter<List<WifiScanResult>> wifiScansAdapter;

        public GsonTypeAdapter(Gson gson) {
            this.locationAdapter = gson.getAdapter(Location.class);
            this.motionReadingAdapter = gson.getAdapter(GoogleMotionReading.class);
            this.wifiScansAdapter = gson.getAdapter(TypeToken.getParameterized(List.class, new Type[]{WifiScanResult.class}));
        }

        public void write(JsonWriter jsonWriter, TrailPoint trailPoint) throws IOException {
            if (trailPoint == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name("location");
            this.locationAdapter.write(jsonWriter, trailPoint.location());
            jsonWriter.name("motionReading");
            this.motionReadingAdapter.write(jsonWriter, trailPoint.motionReading());
            jsonWriter.name("wifiScans");
            this.wifiScansAdapter.write(jsonWriter, trailPoint.wifiScans());
            jsonWriter.endObject();
        }

        public TrailPoint read(JsonReader jsonReader) throws IOException {
            Location location = null;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            GoogleMotionReading googleMotionReading = null;
            List list = googleMotionReading;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    Object obj = -1;
                    int hashCode = nextName.hashCode();
                    if (hashCode != 496807414) {
                        if (hashCode != 1389596545) {
                            if (hashCode == 1901043637) {
                                if (nextName.equals("location")) {
                                    obj = null;
                                }
                            }
                        } else if (nextName.equals("wifiScans")) {
                            obj = 2;
                        }
                    } else if (nextName.equals("motionReading")) {
                        obj = 1;
                    }
                    switch (obj) {
                        case null:
                            location = (Location) this.locationAdapter.read(jsonReader);
                            break;
                        case 1:
                            googleMotionReading = (GoogleMotionReading) this.motionReadingAdapter.read(jsonReader);
                            break;
                        case 2:
                            list = (List) this.wifiScansAdapter.read(jsonReader);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.nextNull();
            }
            jsonReader.endObject();
            return new AutoValue_TrailPoint(location, googleMotionReading, list);
        }
    }

    AutoValue_TrailPoint(@Nullable Location location, @Nullable GoogleMotionReading googleMotionReading, @Nullable List<WifiScanResult> list) {
        super(location, googleMotionReading, list);
    }
}
