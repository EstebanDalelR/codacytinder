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
import java.util.Map;

final class AutoValue_PurchaseLogResponse extends C$AutoValue_PurchaseLogResponse {

    public static final class MoshiJsonAdapter extends JsonAdapter<PurchaseLogResponse> {
        private static final String[] NAMES = new String[]{"ProcessedItems", "UnprocessedIndices"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Map<String, String>> processItemsAdapter;
        private final JsonAdapter<List<Integer>> unprocessedIndicesAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.processItemsAdapter = c5987p.a(C5992r.a(Map.class, new Type[]{String.class, String.class}));
            this.unprocessedIndicesAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Integer.class}));
        }

        public PurchaseLogResponse fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Map map = null;
            List list = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        map = (Map) this.processItemsAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        list = (List) this.unprocessedIndicesAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_PurchaseLogResponse(map, list);
        }

        public void toJson(C5983k c5983k, PurchaseLogResponse purchaseLogResponse) throws IOException {
            c5983k.c();
            Map processItems = purchaseLogResponse.processItems();
            if (processItems != null) {
                c5983k.b("ProcessedItems");
                this.processItemsAdapter.toJson(c5983k, processItems);
            }
            purchaseLogResponse = purchaseLogResponse.unprocessedIndices();
            if (purchaseLogResponse != null) {
                c5983k.b("UnprocessedIndices");
                this.unprocessedIndicesAdapter.toJson(c5983k, purchaseLogResponse);
            }
            c5983k.d();
        }
    }

    AutoValue_PurchaseLogResponse(Map<String, String> map, List<Integer> list) {
        super(map, list);
    }
}
