package com.tinder.api.model.purchase;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.C5987p;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonReader.C5971a;
import com.tinder.api.ManagerWebServices;
import java.io.IOException;

final class AutoValue_BillingReceipt extends C$AutoValue_BillingReceipt {

    public static final class MoshiJsonAdapter extends JsonAdapter<BillingReceipt> {
        private static final String[] NAMES = new String[]{ManagerWebServices.PARAM_SIGNATURE, ManagerWebServices.PARAM_RECEIPT, "purchaseToken", "prev_receipt"};
        private static final C5971a OPTIONS = C5971a.a(NAMES);
        private final JsonAdapter<String> previousReceiptAdapter;
        private final JsonAdapter<String> purchaseTokenAdapter;
        private final JsonAdapter<String> receiptAdapter;
        private final JsonAdapter<String> signatureAdapter;

        public MoshiJsonAdapter(C5987p c5987p) {
            this.signatureAdapter = c5987p.a(String.class);
            this.receiptAdapter = c5987p.a(String.class);
            this.purchaseTokenAdapter = c5987p.a(String.class);
            this.previousReceiptAdapter = c5987p.a(String.class);
        }

        public BillingReceipt fromJson(JsonReader jsonReader) throws IOException {
            jsonReader.e();
            String str = null;
            String str2 = null;
            String str3 = str2;
            String str4 = str3;
            while (jsonReader.g()) {
                switch (jsonReader.a(OPTIONS)) {
                    case -1:
                        jsonReader.i();
                        jsonReader.p();
                        break;
                    case 0:
                        str = (String) this.signatureAdapter.fromJson(jsonReader);
                        break;
                    case 1:
                        str2 = (String) this.receiptAdapter.fromJson(jsonReader);
                        break;
                    case 2:
                        str3 = (String) this.purchaseTokenAdapter.fromJson(jsonReader);
                        break;
                    case 3:
                        str4 = (String) this.previousReceiptAdapter.fromJson(jsonReader);
                        break;
                    default:
                        break;
                }
            }
            jsonReader.f();
            return new AutoValue_BillingReceipt(str, str2, str3, str4);
        }

        public void toJson(C5983k c5983k, BillingReceipt billingReceipt) throws IOException {
            c5983k.c();
            c5983k.b(ManagerWebServices.PARAM_SIGNATURE);
            this.signatureAdapter.toJson(c5983k, billingReceipt.signature());
            c5983k.b(ManagerWebServices.PARAM_RECEIPT);
            this.receiptAdapter.toJson(c5983k, billingReceipt.receipt());
            String purchaseToken = billingReceipt.purchaseToken();
            if (purchaseToken != null) {
                c5983k.b("purchaseToken");
                this.purchaseTokenAdapter.toJson(c5983k, purchaseToken);
            }
            billingReceipt = billingReceipt.previousReceipt();
            if (billingReceipt != null) {
                c5983k.b("prev_receipt");
                this.previousReceiptAdapter.toJson(c5983k, billingReceipt);
            }
            c5983k.d();
        }
    }

    AutoValue_BillingReceipt(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
    }
}
