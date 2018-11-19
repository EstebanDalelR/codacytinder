package com.tinder.api.model.intropricing;

import com.squareup.moshi.Json;
import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lcom/tinder/api/model/intropricing/DiscountSponsoredMessage;", "", "creativeID", "", "lineItemID", "title", "logoUrl", "body", "clickthroughText", "clickthroughURL", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBody", "()Ljava/lang/String;", "getClickthroughText", "getClickthroughURL", "getCreativeID", "getLineItemID", "getLogoUrl", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class DiscountSponsoredMessage {
    @NotNull
    private final String body;
    @NotNull
    private final String clickthroughText;
    @NotNull
    private final String clickthroughURL;
    @NotNull
    private final String creativeID;
    @NotNull
    private final String lineItemID;
    @NotNull
    private final String logoUrl;
    @NotNull
    private final String title;

    @NotNull
    public static /* synthetic */ DiscountSponsoredMessage copy$default(DiscountSponsoredMessage discountSponsoredMessage, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = discountSponsoredMessage.creativeID;
        }
        if ((i & 2) != 0) {
            str2 = discountSponsoredMessage.lineItemID;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = discountSponsoredMessage.title;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = discountSponsoredMessage.logoUrl;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = discountSponsoredMessage.body;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = discountSponsoredMessage.clickthroughText;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = discountSponsoredMessage.clickthroughURL;
        }
        return discountSponsoredMessage.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @NotNull
    public final String component1() {
        return this.creativeID;
    }

    @NotNull
    public final String component2() {
        return this.lineItemID;
    }

    @NotNull
    public final String component3() {
        return this.title;
    }

    @NotNull
    public final String component4() {
        return this.logoUrl;
    }

    @NotNull
    public final String component5() {
        return this.body;
    }

    @NotNull
    public final String component6() {
        return this.clickthroughText;
    }

    @NotNull
    public final String component7() {
        return this.clickthroughURL;
    }

    @NotNull
    public final DiscountSponsoredMessage copy(@NotNull @Json(name = "creativeID") String str, @NotNull @Json(name = "lineItemID") String str2, @NotNull @Json(name = "title") String str3, @NotNull @Json(name = "logo") String str4, @NotNull @Json(name = "body") String str5, @NotNull @Json(name = "clickthroughText") String str6, @NotNull @Json(name = "clickthroughURL") String str7) {
        String str8 = str;
        C2668g.b(str8, "creativeID");
        String str9 = str2;
        C2668g.b(str9, "lineItemID");
        String str10 = str3;
        C2668g.b(str10, ManagerWebServices.PARAM_JOB_TITLE);
        String str11 = str4;
        C2668g.b(str11, "logoUrl");
        String str12 = str5;
        C2668g.b(str12, "body");
        String str13 = str6;
        C2668g.b(str13, "clickthroughText");
        String str14 = str7;
        C2668g.b(str14, "clickthroughURL");
        return new DiscountSponsoredMessage(str8, str9, str10, str11, str12, str13, str14);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DiscountSponsoredMessage) {
                DiscountSponsoredMessage discountSponsoredMessage = (DiscountSponsoredMessage) obj;
                if (C2668g.a(this.creativeID, discountSponsoredMessage.creativeID) && C2668g.a(this.lineItemID, discountSponsoredMessage.lineItemID) && C2668g.a(this.title, discountSponsoredMessage.title) && C2668g.a(this.logoUrl, discountSponsoredMessage.logoUrl) && C2668g.a(this.body, discountSponsoredMessage.body) && C2668g.a(this.clickthroughText, discountSponsoredMessage.clickthroughText) && C2668g.a(this.clickthroughURL, discountSponsoredMessage.clickthroughURL)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.creativeID;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.lineItemID;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.title;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.logoUrl;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.body;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.clickthroughText;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.clickthroughURL;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DiscountSponsoredMessage(creativeID=");
        stringBuilder.append(this.creativeID);
        stringBuilder.append(", lineItemID=");
        stringBuilder.append(this.lineItemID);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", logoUrl=");
        stringBuilder.append(this.logoUrl);
        stringBuilder.append(", body=");
        stringBuilder.append(this.body);
        stringBuilder.append(", clickthroughText=");
        stringBuilder.append(this.clickthroughText);
        stringBuilder.append(", clickthroughURL=");
        stringBuilder.append(this.clickthroughURL);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public DiscountSponsoredMessage(@NotNull @Json(name = "creativeID") String str, @NotNull @Json(name = "lineItemID") String str2, @NotNull @Json(name = "title") String str3, @NotNull @Json(name = "logo") String str4, @NotNull @Json(name = "body") String str5, @NotNull @Json(name = "clickthroughText") String str6, @NotNull @Json(name = "clickthroughURL") String str7) {
        C2668g.b(str, "creativeID");
        C2668g.b(str2, "lineItemID");
        C2668g.b(str3, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(str4, "logoUrl");
        C2668g.b(str5, "body");
        C2668g.b(str6, "clickthroughText");
        C2668g.b(str7, "clickthroughURL");
        this.creativeID = str;
        this.lineItemID = str2;
        this.title = str3;
        this.logoUrl = str4;
        this.body = str5;
        this.clickthroughText = str6;
        this.clickthroughURL = str7;
    }

    @NotNull
    public final String getCreativeID() {
        return this.creativeID;
    }

    @NotNull
    public final String getLineItemID() {
        return this.lineItemID;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }

    @NotNull
    public final String getClickthroughText() {
        return this.clickthroughText;
    }

    @NotNull
    public final String getClickthroughURL() {
        return this.clickthroughURL;
    }
}
