package com.tinder.api.model.purchase;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import com.tinder.api.model.profile.Products.Sku.ProductType;
import com.tinder.api.model.profile.Products.Sku.PurchaseType;
import com.tinder.api.model.purchase.PurchaseValidation.Receipt;
import java.io.IOException;

final class AutoValue_PurchaseValidation_Receipt extends C$AutoValue_PurchaseValidation_Receipt {

    public static final class MoshiJsonAdapter extends JsonAdapter<Receipt> {
        private static final String[] NAMES = new String[]{"error", ManagerWebServices.PARAM_ERROR_CODE, "receipt_id", ManagerWebServices.PARAM_PRODUCT_TYPE, ManagerWebServices.PARAM_PURCHASE_TYPE, ManagerWebServices.PARAM_PRODUCT_ID, ManagerWebServices.PARAM_CREATE_DATE};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> createDateAdapter;
        private final JsonAdapter<String> errorCodeAdapter;
        private final JsonAdapter<String> errorMessageAdapter;
        private final JsonAdapter<String> productIdAdapter;
        private final JsonAdapter<ProductType> productTypeAdapter;
        private final JsonAdapter<PurchaseType> purchaseTypeAdapter;
        private final JsonAdapter<String> receiptIdAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.errorMessageAdapter = c5987p.a(String.class);
            this.errorCodeAdapter = c5987p.a(String.class);
            this.receiptIdAdapter = c5987p.a(String.class);
            this.productTypeAdapter = c5987p.a(ProductType.class);
            this.purchaseTypeAdapter = c5987p.a(PurchaseType.class);
            this.productIdAdapter = c5987p.a(String.class);
            this.createDateAdapter = c5987p.a(String.class);
        }

        public Receipt fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = str;
            String str3 = str2;
            ProductType productType = str3;
            PurchaseType purchaseType = productType;
            String str4 = purchaseType;
            String str5 = str4;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.errorMessageAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str2 = (String) this.errorCodeAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        str3 = (String) this.receiptIdAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        productType = (ProductType) this.productTypeAdapter.fromJson(jsonReader);
                        break;
                    case 4:
                        purchaseType = (PurchaseType) this.purchaseTypeAdapter.fromJson(jsonReader);
                        break;
                    case 5:
                        str4 = (String) this.productIdAdapter.fromJson(jsonReader);
                        break;
                    case 6:
                        str5 = (String) this.createDateAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_PurchaseValidation_Receipt(str, str2, str3, productType, purchaseType, str4, str5);
        }

        public void toJson(C5983k c5983k, Receipt receipt) throws IOException {
            c5983k.c();
            String errorMessage = receipt.errorMessage();
            if (errorMessage != null) {
                c5983k.b("error");
                this.errorMessageAdapter.toJson(c5983k, errorMessage);
            }
            errorMessage = receipt.errorCode();
            if (errorMessage != null) {
                c5983k.b(ManagerWebServices.PARAM_ERROR_CODE);
                this.errorCodeAdapter.toJson(c5983k, errorMessage);
            }
            errorMessage = receipt.receiptId();
            if (errorMessage != null) {
                c5983k.b("receipt_id");
                this.receiptIdAdapter.toJson(c5983k, errorMessage);
            }
            ProductType productType = receipt.productType();
            if (productType != null) {
                c5983k.b(ManagerWebServices.PARAM_PRODUCT_TYPE);
                this.productTypeAdapter.toJson(c5983k, productType);
            }
            PurchaseType purchaseType = receipt.purchaseType();
            if (purchaseType != null) {
                c5983k.b(ManagerWebServices.PARAM_PURCHASE_TYPE);
                this.purchaseTypeAdapter.toJson(c5983k, purchaseType);
            }
            errorMessage = receipt.productId();
            if (errorMessage != null) {
                c5983k.b(ManagerWebServices.PARAM_PRODUCT_ID);
                this.productIdAdapter.toJson(c5983k, errorMessage);
            }
            receipt = receipt.createDate();
            if (receipt != null) {
                c5983k.b(ManagerWebServices.PARAM_CREATE_DATE);
                this.createDateAdapter.toJson(c5983k, receipt);
            }
            c5983k.d();
        }
    }

    AutoValue_PurchaseValidation_Receipt(String str, String str2, String str3, ProductType productType, PurchaseType purchaseType, String str4, String str5) {
        super(str, str2, str3, productType, purchaseType, str4, str5);
    }
}
