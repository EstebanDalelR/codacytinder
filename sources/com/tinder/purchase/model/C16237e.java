package com.tinder.purchase.model;

import com.squareup.moshi.C5983k;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/tinder/purchase/model/PurchaseInfoAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/tinder/purchase/model/PurchaseInfo;", "()V", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "purchase_release"}, k = 1, mv = {1, 1, 10})
/* renamed from: com.tinder.purchase.model.e */
final class C16237e extends JsonAdapter<PurchaseInfo> {
    public /* synthetic */ Object fromJson(JsonReader jsonReader) {
        return m61309a(jsonReader);
    }

    public /* synthetic */ void toJson(C5983k c5983k, Object obj) {
        m61310a(c5983k, (PurchaseInfo) obj);
    }

    @NotNull
    /* renamed from: a */
    public PurchaseInfo m61309a(@NotNull JsonReader jsonReader) {
        C2668g.b(jsonReader, "reader");
        jsonReader.e();
        int i = C14532c.f45935a.purchaseState;
        while (jsonReader.g()) {
            if (C2668g.a(jsonReader.i(), "purchaseState")) {
                i = jsonReader.o();
            } else {
                jsonReader.p();
            }
        }
        jsonReader.f();
        return new PurchaseInfo(i);
    }

    /* renamed from: a */
    public void m61310a(@Nullable C5983k c5983k, @Nullable PurchaseInfo purchaseInfo) {
        if (c5983k != null) {
            c5983k.c();
        }
        if (c5983k != null) {
            c5983k.b("purchaseState");
        }
        if (c5983k != null) {
            c5983k.a((Number) (purchaseInfo != null ? Integer.valueOf(purchaseInfo.m55480a()) : null));
        }
        if (c5983k != null) {
            c5983k.d();
        }
    }
}
