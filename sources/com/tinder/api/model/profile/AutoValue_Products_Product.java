package com.tinder.api.model.profile;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.C5992r;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.profile.Products.Product;
import com.tinder.api.model.profile.Products.Sku;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

final class AutoValue_Products_Product extends C$AutoValue_Products_Product {

    public static final class MoshiJsonAdapter extends JsonAdapter<Product> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_SKUS, ManagerWebServices.PARAM_VIEWED_AT, ManagerWebServices.PARAM_EXPIRES_AT, ManagerWebServices.PARAM_DISCOUNT_CAMPAIGN_VARIANT, ManagerWebServices.PARAM_DISCOUNT_CAMPAIGN};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> campaignAdapter;
        private final JsonAdapter<String> campaignVariantNameAdapter;
        private final JsonAdapter<Long> expiredAtAdapter;
        private final JsonAdapter<List<Sku>> skusAdapter;
        private final JsonAdapter<Long> viewAtAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.skusAdapter = c5987p.a(C5992r.a(List.class, new Type[]{Sku.class}));
            this.viewAtAdapter = c5987p.a(Long.class);
            this.expiredAtAdapter = c5987p.a(Long.class);
            this.campaignVariantNameAdapter = c5987p.a(String.class);
            this.campaignAdapter = c5987p.a(String.class);
        }

        public Product fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            List list = null;
            Long l = list;
            Long l2 = l;
            String str = l2;
            String str2 = str;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        list = (List) this.skusAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        l = (Long) this.viewAtAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        l2 = (Long) this.expiredAtAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        str = (String) this.campaignVariantNameAdapter.fromJson(jsonReader);
                        break;
                    case 4:
                        str2 = (String) this.campaignAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Products_Product(list, l, l2, str, str2);
        }

        public void toJson(C5983k c5983k, Product product) throws IOException {
            c5983k.c();
            c5983k.b(ManagerWebServices.PARAM_SKUS);
            this.skusAdapter.toJson(c5983k, product.skus());
            Long viewAt = product.viewAt();
            if (viewAt != null) {
                c5983k.b(ManagerWebServices.PARAM_VIEWED_AT);
                this.viewAtAdapter.toJson(c5983k, viewAt);
            }
            viewAt = product.expiredAt();
            if (viewAt != null) {
                c5983k.b(ManagerWebServices.PARAM_EXPIRES_AT);
                this.expiredAtAdapter.toJson(c5983k, viewAt);
            }
            String campaignVariantName = product.campaignVariantName();
            if (campaignVariantName != null) {
                c5983k.b(ManagerWebServices.PARAM_DISCOUNT_CAMPAIGN_VARIANT);
                this.campaignVariantNameAdapter.toJson(c5983k, campaignVariantName);
            }
            product = product.campaign();
            if (product != null) {
                c5983k.b(ManagerWebServices.PARAM_DISCOUNT_CAMPAIGN);
                this.campaignAdapter.toJson(c5983k, product);
            }
            c5983k.d();
        }
    }

    AutoValue_Products_Product(List<Sku> list, Long l, Long l2, String str, String str2) {
        super(list, l, l2, str, str2);
    }
}
