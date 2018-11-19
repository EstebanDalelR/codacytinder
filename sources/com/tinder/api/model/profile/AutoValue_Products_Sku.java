package com.tinder.api.model.profile;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.profile.Products.Sku;
import com.tinder.api.model.profile.Products.Sku.ProductType;
import com.tinder.api.model.profile.Products.Sku.PurchaseType;
import java.io.IOException;

final class AutoValue_Products_Sku extends C$AutoValue_Products_Sku {

    public static final class MoshiJsonAdapter extends JsonAdapter<Sku> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_PRODUCT_TYPE, ManagerWebServices.PARAM_PURCHASE_TYPE, ManagerWebServices.PARAM_PRODUCT_ID, ManagerWebServices.PARAM_IS_BASE_GROUP, ManagerWebServices.PARAM_IS_PRIMARY, ManagerWebServices.PARAM_ORIGINAL_PRODUCT_ID, ManagerWebServices.PARAM_AMOUNT, "terms", ManagerWebServices.PARAM_DISCOUNT_PERCENTAGE, "is_intro_price"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<Integer> amountAdapter;
        private final JsonAdapter<Integer> discountPercentageAdapter;
        private final JsonAdapter<Boolean> isBaseGroupAdapter;
        private final JsonAdapter<Boolean> isIntroPricingAdapter;
        private final JsonAdapter<Boolean> isPrimaryAdapter;
        private final JsonAdapter<String> originalProductIdAdapter;
        private final JsonAdapter<String> productIdAdapter;
        private final JsonAdapter<ProductType> productTypeAdapter;
        private final JsonAdapter<PurchaseType> purchaseTypeAdapter;
        private final JsonAdapter<Integer> termAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.productTypeAdapter = c5987p.a(ProductType.class);
            this.purchaseTypeAdapter = c5987p.a(PurchaseType.class);
            this.productIdAdapter = c5987p.a(String.class);
            this.isBaseGroupAdapter = c5987p.a(Boolean.class);
            this.isPrimaryAdapter = c5987p.a(Boolean.class);
            this.originalProductIdAdapter = c5987p.a(String.class);
            this.amountAdapter = c5987p.a(Integer.class);
            this.termAdapter = c5987p.a(Integer.class);
            this.discountPercentageAdapter = c5987p.a(Integer.class);
            this.isIntroPricingAdapter = c5987p.a(Boolean.class);
        }

        public Sku fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            ProductType productType = null;
            PurchaseType purchaseType = productType;
            String str = purchaseType;
            Boolean bool = str;
            Boolean bool2 = bool;
            String str2 = bool2;
            Integer num = str2;
            Integer num2 = num;
            Integer num3 = num2;
            Boolean bool3 = num3;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        productType = (ProductType) this.productTypeAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        purchaseType = (PurchaseType) this.purchaseTypeAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        str = (String) this.productIdAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        bool = (Boolean) this.isBaseGroupAdapter.fromJson(jsonReader);
                        break;
                    case 4:
                        bool2 = (Boolean) this.isPrimaryAdapter.fromJson(jsonReader);
                        break;
                    case 5:
                        str2 = (String) this.originalProductIdAdapter.fromJson(jsonReader);
                        break;
                    case 6:
                        num = (Integer) this.amountAdapter.fromJson(jsonReader);
                        break;
                    case 7:
                        num2 = (Integer) this.termAdapter.fromJson(jsonReader);
                        break;
                    case 8:
                        num3 = (Integer) this.discountPercentageAdapter.fromJson(jsonReader);
                        break;
                    case 9:
                        bool3 = (Boolean) this.isIntroPricingAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_Products_Sku(productType, purchaseType, str, bool, bool2, str2, num, num2, num3, bool3);
        }

        public void toJson(C5983k c5983k, Sku sku) throws IOException {
            c5983k.c();
            c5983k.b(ManagerWebServices.PARAM_PRODUCT_TYPE);
            this.productTypeAdapter.toJson(c5983k, sku.productType());
            c5983k.b(ManagerWebServices.PARAM_PURCHASE_TYPE);
            this.purchaseTypeAdapter.toJson(c5983k, sku.purchaseType());
            c5983k.b(ManagerWebServices.PARAM_PRODUCT_ID);
            this.productIdAdapter.toJson(c5983k, sku.productId());
            Boolean isBaseGroup = sku.isBaseGroup();
            if (isBaseGroup != null) {
                c5983k.b(ManagerWebServices.PARAM_IS_BASE_GROUP);
                this.isBaseGroupAdapter.toJson(c5983k, isBaseGroup);
            }
            isBaseGroup = sku.isPrimary();
            if (isBaseGroup != null) {
                c5983k.b(ManagerWebServices.PARAM_IS_PRIMARY);
                this.isPrimaryAdapter.toJson(c5983k, isBaseGroup);
            }
            String originalProductId = sku.originalProductId();
            if (originalProductId != null) {
                c5983k.b(ManagerWebServices.PARAM_ORIGINAL_PRODUCT_ID);
                this.originalProductIdAdapter.toJson(c5983k, originalProductId);
            }
            Integer amount = sku.amount();
            if (amount != null) {
                c5983k.b(ManagerWebServices.PARAM_AMOUNT);
                this.amountAdapter.toJson(c5983k, amount);
            }
            amount = sku.term();
            if (amount != null) {
                c5983k.b("terms");
                this.termAdapter.toJson(c5983k, amount);
            }
            amount = sku.discountPercentage();
            if (amount != null) {
                c5983k.b(ManagerWebServices.PARAM_DISCOUNT_PERCENTAGE);
                this.discountPercentageAdapter.toJson(c5983k, amount);
            }
            sku = sku.isIntroPricing();
            if (sku != null) {
                c5983k.b("is_intro_price");
                this.isIntroPricingAdapter.toJson(c5983k, sku);
            }
            c5983k.d();
        }
    }

    AutoValue_Products_Sku(ProductType productType, PurchaseType purchaseType, String str, Boolean bool, Boolean bool2, String str2, Integer num, Integer num2, Integer num3, Boolean bool3) {
        super(productType, purchaseType, str, bool, bool2, str2, num, num2, num3, bool3);
    }
}
