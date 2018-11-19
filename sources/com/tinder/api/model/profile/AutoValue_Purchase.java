package com.tinder.api.model.profile;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.profile.Purchase.Platform;
import java.io.IOException;

final class AutoValue_Purchase extends C$AutoValue_Purchase {

    public static final class MoshiJsonAdapter extends JsonAdapter<Purchase> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_PRODUCT_TYPE, ManagerWebServices.PARAM_PURCHASE_TYPE, ManagerWebServices.PARAM_PRODUCT_ID, "platform"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Platform> platformAdapter;
        private final JsonAdapter<String> productIdAdapter;
        private final JsonAdapter<String> productTypeAdapter;
        private final JsonAdapter<String> purchaseTypeAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.productTypeAdapter = c5987p.a(String.class);
            this.purchaseTypeAdapter = c5987p.a(String.class);
            this.productIdAdapter = c5987p.a(String.class);
            this.platformAdapter = c5987p.a(Platform.class);
        }

        public Purchase fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = null;
            String str3 = str2;
            Platform platform = str3;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.productTypeAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str2 = (String) this.purchaseTypeAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        str3 = (String) this.productIdAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        platform = (Platform) this.platformAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Purchase(str, str2, str3, platform);
        }

        public void toJson(C5983k c5983k, Purchase purchase) throws IOException {
            c5983k.c();
            c5983k.b(ManagerWebServices.PARAM_PRODUCT_TYPE);
            this.productTypeAdapter.toJson(c5983k, purchase.productType());
            c5983k.b(ManagerWebServices.PARAM_PURCHASE_TYPE);
            this.purchaseTypeAdapter.toJson(c5983k, purchase.purchaseType());
            c5983k.b(ManagerWebServices.PARAM_PRODUCT_ID);
            this.productIdAdapter.toJson(c5983k, purchase.productId());
            purchase = purchase.platform();
            if (purchase != null) {
                c5983k.b("platform");
                this.platformAdapter.toJson(c5983k, purchase);
            }
            c5983k.d();
        }
    }

    AutoValue_Purchase(String str, String str2, String str3, Platform platform) {
        super(str, str2, str3, platform);
    }
}
