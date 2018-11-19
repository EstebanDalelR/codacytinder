package com.foursquare.api.types;

import android.support.annotation.Nullable;
import com.foursquare.api.types.TrailPoint.Location;
import com.foursquare.pilgrim.BackgroundWakeupSource;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

final class AutoValue_TrailPoint_Location extends C$AutoValue_TrailPoint_Location {

    public static final class GsonTypeAdapter extends TypeAdapter<Location> {
        private final TypeAdapter<Long> elapsedRealtimeNanosAdapter;
        private final TypeAdapter<Float> haccAdapter;
        private final TypeAdapter<Float> headingAdapter;
        private final TypeAdapter<Double> latAdapter;
        private final TypeAdapter<Double> lngAdapter;
        private final TypeAdapter<BackgroundWakeupSource> sourceAdapter;
        private final TypeAdapter<Float> speedAdapter;
        private final TypeAdapter<Long> timestampAdapter;

        public GsonTypeAdapter(Gson gson) {
            this.latAdapter = gson.getAdapter(Double.class);
            this.lngAdapter = gson.getAdapter(Double.class);
            this.haccAdapter = gson.getAdapter(Float.class);
            this.timestampAdapter = gson.getAdapter(Long.class);
            this.elapsedRealtimeNanosAdapter = gson.getAdapter(Long.class);
            this.speedAdapter = gson.getAdapter(Float.class);
            this.headingAdapter = gson.getAdapter(Float.class);
            this.sourceAdapter = gson.getAdapter(BackgroundWakeupSource.class);
        }

        public void write(JsonWriter jsonWriter, Location location) throws IOException {
            if (location == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            jsonWriter.name(ManagerWebServices.PARAM_LAT);
            this.latAdapter.write(jsonWriter, Double.valueOf(location.lat()));
            jsonWriter.name("lng");
            this.lngAdapter.write(jsonWriter, Double.valueOf(location.lng()));
            jsonWriter.name("hacc");
            this.haccAdapter.write(jsonWriter, location.hacc());
            jsonWriter.name("timestamp");
            this.timestampAdapter.write(jsonWriter, Long.valueOf(location.timestamp()));
            jsonWriter.name("elapsedRealtimeNanos");
            this.elapsedRealtimeNanosAdapter.write(jsonWriter, Long.valueOf(location.elapsedRealtimeNanos()));
            jsonWriter.name("speed");
            this.speedAdapter.write(jsonWriter, location.speed());
            jsonWriter.name("heading");
            this.headingAdapter.write(jsonWriter, location.heading());
            jsonWriter.name("source");
            this.sourceAdapter.write(jsonWriter, location.source());
            jsonWriter.endObject();
        }

        public Location read(JsonReader jsonReader) throws IOException {
            GsonTypeAdapter gsonTypeAdapter = this;
            JsonReader jsonReader2 = jsonReader;
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.beginObject();
            long j = 0;
            long j2 = j;
            Float f = null;
            Float f2 = f;
            Float f3 = f2;
            BackgroundWakeupSource backgroundWakeupSource = f3;
            double d = 0.0d;
            double d2 = d;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    Object obj = -1;
                    switch (nextName.hashCode()) {
                        case -896505829:
                            if (nextName.equals("source")) {
                                obj = 7;
                                break;
                            }
                            break;
                        case -654962312:
                            if (nextName.equals("elapsedRealtimeNanos")) {
                                obj = 4;
                                break;
                            }
                            break;
                        case 106911:
                            if (nextName.equals(ManagerWebServices.PARAM_LAT)) {
                                obj = null;
                                break;
                            }
                            break;
                        case 107301:
                            if (nextName.equals("lng")) {
                                obj = 1;
                                break;
                            }
                            break;
                        case 3194649:
                            if (nextName.equals("hacc")) {
                                obj = 2;
                                break;
                            }
                            break;
                        case 55126294:
                            if (nextName.equals("timestamp")) {
                                obj = 3;
                                break;
                            }
                            break;
                        case 109641799:
                            if (nextName.equals("speed")) {
                                obj = 5;
                                break;
                            }
                            break;
                        case 795311618:
                            if (nextName.equals("heading")) {
                                obj = 6;
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                    switch (obj) {
                        case null:
                            d = ((Double) gsonTypeAdapter.latAdapter.read(jsonReader2)).doubleValue();
                            break;
                        case 1:
                            d2 = ((Double) gsonTypeAdapter.lngAdapter.read(jsonReader2)).doubleValue();
                            break;
                        case 2:
                            f = (Float) gsonTypeAdapter.haccAdapter.read(jsonReader2);
                            break;
                        case 3:
                            j = ((Long) gsonTypeAdapter.timestampAdapter.read(jsonReader2)).longValue();
                            break;
                        case 4:
                            j2 = ((Long) gsonTypeAdapter.elapsedRealtimeNanosAdapter.read(jsonReader2)).longValue();
                            break;
                        case 5:
                            f2 = (Float) gsonTypeAdapter.speedAdapter.read(jsonReader2);
                            break;
                        case 6:
                            f3 = (Float) gsonTypeAdapter.headingAdapter.read(jsonReader2);
                            break;
                        case 7:
                            backgroundWakeupSource = (BackgroundWakeupSource) gsonTypeAdapter.sourceAdapter.read(jsonReader2);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.nextNull();
            }
            jsonReader.endObject();
            return new AutoValue_TrailPoint_Location(d, d2, f, j, j2, f2, f3, backgroundWakeupSource);
        }
    }

    AutoValue_TrailPoint_Location(double d, double d2, @Nullable Float f, long j, long j2, @Nullable Float f2, @Nullable Float f3, BackgroundWakeupSource backgroundWakeupSource) {
        super(d, d2, f, j, j2, f2, f3, backgroundWakeupSource);
    }
}
