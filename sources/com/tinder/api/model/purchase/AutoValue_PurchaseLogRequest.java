package com.tinder.api.model.purchase;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_PurchaseLogRequest extends C$AutoValue_PurchaseLogRequest {

    public static final class MoshiJsonAdapter extends JsonAdapter<PurchaseLogRequest> {
        private static final String[] NAMES = new String[]{"errors"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<List<PurchaseLog>> purchaseLogsAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.purchaseLogsAdapter = c5987p.a(C5992r.a(List.class, new Type[]{PurchaseLog.class}));
        }

        public PurchaseLogRequest fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            List list = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        list = (List) this.purchaseLogsAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_PurchaseLogRequest(list);
        }

        public void toJson(C5983k c5983k, PurchaseLogRequest purchaseLogRequest) throws IOException {
            c5983k.c();
            c5983k.b("errors");
            this.purchaseLogsAdapter.toJson(c5983k, purchaseLogRequest.purchaseLogs());
            c5983k.d();
        }
    }

    AutoValue_PurchaseLogRequest(List<PurchaseLog> list) {
        super(list);
    }
}
