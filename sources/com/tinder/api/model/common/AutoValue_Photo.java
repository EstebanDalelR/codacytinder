package com.tinder.api.model.common;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_Photo extends C$AutoValue_Photo {

    public static final class MoshiJsonAdapter extends JsonAdapter<Photo> {
        private static final String[] NAMES = new String[]{"id", ManagerWebServices.PARAM_PROCESSED_FILES_CAMEL, ManagerWebServices.PARAM_PROCESSED_VIDEOS_CAMEL, "extension", "fileName", "url", "crop", ManagerWebServices.PARAM_XDISTANCE_PERCENT, ManagerWebServices.PARAM_YDISTANCE_PERCENT, ManagerWebServices.PARAM_XOFFSET_PERCENT, ManagerWebServices.PARAM_YOFFSET_PERCENT, "fbid", "success_rate", "selectRate"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> cropAdapter;
        private final JsonAdapter<String> extensionAdapter;
        private final JsonAdapter<String> fbIdAdapter;
        private final JsonAdapter<String> fileNameAdapter;
        private final JsonAdapter<String> idAdapter;
        private final JsonAdapter<List<ProcessedFile>> processedFilesAdapter;
        private final JsonAdapter<List<ProcessedVideo>> processedVideosAdapter;
        private final JsonAdapter<Float> selectRateAdapter;
        private final JsonAdapter<Double> successRateAdapter;
        private final JsonAdapter<String> urlAdapter;
        private final JsonAdapter<Double> xdistancePercentAdapter;
        private final JsonAdapter<Double> xoffsetPercentAdapter;
        private final JsonAdapter<Double> ydistancePercentAdapter;
        private final JsonAdapter<Double> yoffsetPercentAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.idAdapter = c5987p.a(String.class);
            this.processedFilesAdapter = c5987p.a(C5992r.a(List.class, new Type[]{ProcessedFile.class}));
            this.processedVideosAdapter = c5987p.a(C5992r.a(List.class, new Type[]{ProcessedVideo.class}));
            this.extensionAdapter = c5987p.a(String.class);
            this.fileNameAdapter = c5987p.a(String.class);
            this.urlAdapter = c5987p.a(String.class);
            this.cropAdapter = c5987p.a(String.class);
            this.xdistancePercentAdapter = c5987p.a(Double.class);
            this.ydistancePercentAdapter = c5987p.a(Double.class);
            this.xoffsetPercentAdapter = c5987p.a(Double.class);
            this.yoffsetPercentAdapter = c5987p.a(Double.class);
            this.fbIdAdapter = c5987p.a(String.class);
            this.successRateAdapter = c5987p.a(Double.class);
            this.selectRateAdapter = c5987p.a(Float.class);
        }

        public Photo fromJson(JsonReader jsonReader) throws IOException {
            MoshiJsonAdapter moshiJsonAdapter = this;
            JsonReader jsonReader2 = jsonReader;
            jsonReader.e();
            String str = null;
            List list = str;
            List list2 = list;
            String str2 = list2;
            String str3 = str2;
            String str4 = str3;
            String str5 = str4;
            Double d = str5;
            Double d2 = d;
            Double d3 = d2;
            Double d4 = d3;
            String str6 = d4;
            Double d5 = str6;
            Float f = d5;
            while (jsonReader.g()) {
                switch (jsonReader2.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) moshiJsonAdapter.idAdapter.fromJson(jsonReader2);
                        break;
                    case 1:
                        list = (List) moshiJsonAdapter.processedFilesAdapter.fromJson(jsonReader2);
                        break;
                    case 2:
                        list2 = (List) moshiJsonAdapter.processedVideosAdapter.fromJson(jsonReader2);
                        break;
                    case 3:
                        str2 = (String) moshiJsonAdapter.extensionAdapter.fromJson(jsonReader2);
                        break;
                    case 4:
                        str3 = (String) moshiJsonAdapter.fileNameAdapter.fromJson(jsonReader2);
                        break;
                    case 5:
                        str4 = (String) moshiJsonAdapter.urlAdapter.fromJson(jsonReader2);
                        break;
                    case 6:
                        str5 = (String) moshiJsonAdapter.cropAdapter.fromJson(jsonReader2);
                        break;
                    case 7:
                        d = (Double) moshiJsonAdapter.xdistancePercentAdapter.fromJson(jsonReader2);
                        break;
                    case 8:
                        d2 = (Double) moshiJsonAdapter.ydistancePercentAdapter.fromJson(jsonReader2);
                        break;
                    case 9:
                        d3 = (Double) moshiJsonAdapter.xoffsetPercentAdapter.fromJson(jsonReader2);
                        break;
                    case 10:
                        d4 = (Double) moshiJsonAdapter.yoffsetPercentAdapter.fromJson(jsonReader2);
                        break;
                    case 11:
                        str6 = (String) moshiJsonAdapter.fbIdAdapter.fromJson(jsonReader2);
                        break;
                    case 12:
                        d5 = (Double) moshiJsonAdapter.successRateAdapter.fromJson(jsonReader2);
                        break;
                    case 13:
                        f = (Float) moshiJsonAdapter.selectRateAdapter.fromJson(jsonReader2);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Photo(str, list, list2, str2, str3, str4, str5, d, d2, d3, d4, str6, d5, f);
        }

        public void toJson(C5983k c5983k, Photo photo) throws IOException {
            c5983k.c();
            String id = photo.id();
            if (id != null) {
                c5983k.b("id");
                this.idAdapter.toJson(c5983k, id);
            }
            List processedFiles = photo.processedFiles();
            if (processedFiles != null) {
                c5983k.b(ManagerWebServices.PARAM_PROCESSED_FILES_CAMEL);
                this.processedFilesAdapter.toJson(c5983k, processedFiles);
            }
            processedFiles = photo.processedVideos();
            if (processedFiles != null) {
                c5983k.b(ManagerWebServices.PARAM_PROCESSED_VIDEOS_CAMEL);
                this.processedVideosAdapter.toJson(c5983k, processedFiles);
            }
            id = photo.extension();
            if (id != null) {
                c5983k.b("extension");
                this.extensionAdapter.toJson(c5983k, id);
            }
            id = photo.fileName();
            if (id != null) {
                c5983k.b("fileName");
                this.fileNameAdapter.toJson(c5983k, id);
            }
            id = photo.url();
            if (id != null) {
                c5983k.b("url");
                this.urlAdapter.toJson(c5983k, id);
            }
            id = photo.crop();
            if (id != null) {
                c5983k.b("crop");
                this.cropAdapter.toJson(c5983k, id);
            }
            Double xdistancePercent = photo.xdistancePercent();
            if (xdistancePercent != null) {
                c5983k.b(ManagerWebServices.PARAM_XDISTANCE_PERCENT);
                this.xdistancePercentAdapter.toJson(c5983k, xdistancePercent);
            }
            xdistancePercent = photo.ydistancePercent();
            if (xdistancePercent != null) {
                c5983k.b(ManagerWebServices.PARAM_YDISTANCE_PERCENT);
                this.ydistancePercentAdapter.toJson(c5983k, xdistancePercent);
            }
            xdistancePercent = photo.xoffsetPercent();
            if (xdistancePercent != null) {
                c5983k.b(ManagerWebServices.PARAM_XOFFSET_PERCENT);
                this.xoffsetPercentAdapter.toJson(c5983k, xdistancePercent);
            }
            xdistancePercent = photo.yoffsetPercent();
            if (xdistancePercent != null) {
                c5983k.b(ManagerWebServices.PARAM_YOFFSET_PERCENT);
                this.yoffsetPercentAdapter.toJson(c5983k, xdistancePercent);
            }
            id = photo.fbId();
            if (id != null) {
                c5983k.b("fbid");
                this.fbIdAdapter.toJson(c5983k, id);
            }
            xdistancePercent = photo.successRate();
            if (xdistancePercent != null) {
                c5983k.b("success_rate");
                this.successRateAdapter.toJson(c5983k, xdistancePercent);
            }
            photo = photo.selectRate();
            if (photo != null) {
                c5983k.b("selectRate");
                this.selectRateAdapter.toJson(c5983k, photo);
            }
            c5983k.d();
        }
    }

    AutoValue_Photo(String str, List<ProcessedFile> list, List<ProcessedVideo> list2, String str2, String str3, String str4, String str5, Double d, Double d2, Double d3, Double d4, String str6, Double d5, Float f) {
        super(str, list, list2, str2, str3, str4, str5, d, d2, d3, d4, str6, d5, f);
    }
}
