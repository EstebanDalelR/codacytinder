package com.tinder.api.response.v2;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;
import java.lang.reflect.Type;

final class AutoValue_DataResponse<T> extends C$AutoValue_DataResponse<T> {

    public static final class MoshiJsonAdapter<T> extends JsonAdapter<DataResponse<T>> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_META, ManagerWebServices.FB_DATA, "error"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<T> dataAdapter;
        private final JsonAdapter<ResponseError> errorAdapter;
        private final JsonAdapter<ResponseMeta> metaAdapter;

        public MoshiJsonAdapter(C5987p c5987p, Type[] typeArr) {
            this.metaAdapter = c5987p.a(ResponseMeta.class);
            this.dataAdapter = c5987p.a(typeArr[0]);
            this.errorAdapter = c5987p.a(ResponseError.class);
        }

        public DataResponse<T> fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            ResponseMeta responseMeta = null;
            Object obj = null;
            ResponseError responseError = obj;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        responseMeta = (ResponseMeta) this.metaAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        obj = this.dataAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        responseError = (ResponseError) this.errorAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_DataResponse(responseMeta, obj, responseError);
        }

        public void toJson(C5983k c5983k, DataResponse<T> dataResponse) throws IOException {
            c5983k.c();
            ResponseMeta meta = dataResponse.meta();
            if (meta != null) {
                c5983k.b(ManagerWebServices.PARAM_META);
                this.metaAdapter.toJson(c5983k, meta);
            }
            Object data = dataResponse.data();
            if (data != null) {
                c5983k.b(ManagerWebServices.FB_DATA);
                this.dataAdapter.toJson(c5983k, data);
            }
            dataResponse = dataResponse.error();
            if (dataResponse != null) {
                c5983k.b("error");
                this.errorAdapter.toJson(c5983k, dataResponse);
            }
            c5983k.d();
        }
    }

    AutoValue_DataResponse(ResponseMeta responseMeta, T t, ResponseError responseError) {
        super(responseMeta, t, responseError);
    }
}
