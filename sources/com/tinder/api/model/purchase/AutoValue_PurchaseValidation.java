package com.tinder.api.model.purchase;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.purchase.PurchaseValidation.Receipt;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_PurchaseValidation extends C$AutoValue_PurchaseValidation {

    public static final class MoshiJsonAdapter extends JsonAdapter<PurchaseValidation> {
        private static final String[] NAMES = new String[]{"status", ManagerWebServices.PARAM_RESULTS};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<List<Receipt>> receiptsAdapter;
        private final JsonAdapter<Integer> statusAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.statusAdapter = c5987p.a(Integer.class);
            this.receiptsAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Receipt.class}));
        }

        public PurchaseValidation fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Integer num = null;
            List list = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        num = (Integer) this.statusAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        list = (List) this.receiptsAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_PurchaseValidation(num, list);
        }

        public void toJson(C5983k c5983k, PurchaseValidation purchaseValidation) throws IOException {
            c5983k.c();
            Integer status = purchaseValidation.status();
            if (status != null) {
                c5983k.b("status");
                this.statusAdapter.toJson(c5983k, status);
            }
            purchaseValidation = purchaseValidation.receipts();
            if (purchaseValidation != null) {
                c5983k.b(ManagerWebServices.PARAM_RESULTS);
                this.receiptsAdapter.toJson(c5983k, purchaseValidation);
            }
            c5983k.d();
        }
    }

    AutoValue_PurchaseValidation(Integer num, List<Receipt> list) {
        super(num, list);
    }
}
