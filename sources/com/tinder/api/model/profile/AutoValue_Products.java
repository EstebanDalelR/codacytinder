package com.tinder.api.model.profile;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.profile.Products.Variant;
import com.tinder.domain.common.model.Subscription;
import java.io.IOException;

final class AutoValue_Products extends C$AutoValue_Products {

    public static final class MoshiJsonAdapter extends JsonAdapter<Products> {
        private static final String[] NAMES = new String[]{"plus", ManagerWebServices.PARAM_SUPER_LIKE, ManagerWebServices.PARAM_BOOST, Subscription.GOLD, "toppicks"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Variant> boostAdapter;
        private final JsonAdapter<Variant> goldAdapter;
        private final JsonAdapter<Variant> plusAdapter;
        private final JsonAdapter<Variant> superlikeAdapter;
        private final JsonAdapter<Variant> topPicksAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.plusAdapter = c5987p.a(Variant.class);
            this.superlikeAdapter = c5987p.a(Variant.class);
            this.boostAdapter = c5987p.a(Variant.class);
            this.goldAdapter = c5987p.a(Variant.class);
            this.topPicksAdapter = c5987p.a(Variant.class);
        }

        public Products fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            Variant variant = null;
            Variant variant2 = variant;
            Variant variant3 = variant2;
            Variant variant4 = variant3;
            Variant variant5 = variant4;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        variant = (Variant) this.plusAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        variant2 = (Variant) this.superlikeAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        variant3 = (Variant) this.boostAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        variant4 = (Variant) this.goldAdapter.fromJson(jsonReader);
                        break;
                    case 4:
                        variant5 = (Variant) this.topPicksAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Products(variant, variant2, variant3, variant4, variant5);
        }

        public void toJson(C5983k c5983k, Products products) throws IOException {
            c5983k.c();
            Variant plus = products.plus();
            if (plus != null) {
                c5983k.b("plus");
                this.plusAdapter.toJson(c5983k, plus);
            }
            plus = products.superlike();
            if (plus != null) {
                c5983k.b(ManagerWebServices.PARAM_SUPER_LIKE);
                this.superlikeAdapter.toJson(c5983k, plus);
            }
            plus = products.boost();
            if (plus != null) {
                c5983k.b(ManagerWebServices.PARAM_BOOST);
                this.boostAdapter.toJson(c5983k, plus);
            }
            plus = products.gold();
            if (plus != null) {
                c5983k.b(Subscription.GOLD);
                this.goldAdapter.toJson(c5983k, plus);
            }
            products = products.topPicks();
            if (products != null) {
                c5983k.b("toppicks");
                this.topPicksAdapter.toJson(c5983k, products);
            }
            c5983k.d();
        }
    }

    AutoValue_Products(Variant variant, Variant variant2, Variant variant3, Variant variant4, Variant variant5) {
        super(variant, variant2, variant3, variant4, variant5);
    }
}
