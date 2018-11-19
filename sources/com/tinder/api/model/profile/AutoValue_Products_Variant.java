package com.tinder.api.model.profile;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.profile.Products.Product;
import com.tinder.api.model.profile.Products.Variant;
import java.io.IOException;

final class AutoValue_Products_Variant extends C$AutoValue_Products_Variant {

    public static final class MoshiJsonAdapter extends JsonAdapter<Variant> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_REGULAR, ManagerWebServices.PARAM_DISCOUNT};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Product> discountAdapter;
        private final JsonAdapter<Product> regularAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.regularAdapter = c5987p.a(Product.class);
            this.discountAdapter = c5987p.a(Product.class);
        }

        public Variant fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Product product = null;
            Product product2 = null;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        product = (Product) this.regularAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        product2 = (Product) this.discountAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Products_Variant(product, product2);
        }

        public void toJson(C5983k c5983k, Variant variant) throws IOException {
            c5983k.c();
            c5983k.b(ManagerWebServices.PARAM_REGULAR);
            this.regularAdapter.toJson(c5983k, variant.regular());
            variant = variant.discount();
            if (variant != null) {
                c5983k.b(ManagerWebServices.PARAM_DISCOUNT);
                this.discountAdapter.toJson(c5983k, variant);
            }
            c5983k.d();
        }
    }

    AutoValue_Products_Variant(Product product, Product product2) {
        super(product, product2);
    }
}
