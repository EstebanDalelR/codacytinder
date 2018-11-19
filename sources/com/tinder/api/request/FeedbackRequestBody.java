package com.tinder.api.request;

import com.tinder.api.ManagerWebServices;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lcom/tinder/api/request/FeedbackRequestBody;", "", "description", "", "model", "dataProvider", "manufacturer", "osVersion", "tiVersion", "stars", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getDataProvider", "()Ljava/lang/String;", "getDescription", "getManufacturer", "getModel", "getOsVersion", "getStars", "()I", "getTiVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class FeedbackRequestBody {
    @NotNull
    private final String dataProvider;
    @NotNull
    private final String description;
    @NotNull
    private final String manufacturer;
    @NotNull
    private final String model;
    @NotNull
    private final String osVersion;
    private final int stars;
    @NotNull
    private final String tiVersion;

    @NotNull
    public static /* synthetic */ FeedbackRequestBody copy$default(FeedbackRequestBody feedbackRequestBody, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = feedbackRequestBody.description;
        }
        if ((i2 & 2) != 0) {
            str2 = feedbackRequestBody.model;
        }
        String str7 = str2;
        if ((i2 & 4) != 0) {
            str3 = feedbackRequestBody.dataProvider;
        }
        String str8 = str3;
        if ((i2 & 8) != 0) {
            str4 = feedbackRequestBody.manufacturer;
        }
        String str9 = str4;
        if ((i2 & 16) != 0) {
            str5 = feedbackRequestBody.osVersion;
        }
        String str10 = str5;
        if ((i2 & 32) != 0) {
            str6 = feedbackRequestBody.tiVersion;
        }
        String str11 = str6;
        if ((i2 & 64) != 0) {
            i = feedbackRequestBody.stars;
        }
        return feedbackRequestBody.copy(str, str7, str8, str9, str10, str11, i);
    }

    @NotNull
    public final String component1() {
        return this.description;
    }

    @NotNull
    public final String component2() {
        return this.model;
    }

    @NotNull
    public final String component3() {
        return this.dataProvider;
    }

    @NotNull
    public final String component4() {
        return this.manufacturer;
    }

    @NotNull
    public final String component5() {
        return this.osVersion;
    }

    @NotNull
    public final String component6() {
        return this.tiVersion;
    }

    public final int component7() {
        return this.stars;
    }

    @NotNull
    public final FeedbackRequestBody copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i) {
        String str7 = str;
        C2668g.b(str7, ManagerWebServices.PARAM_BADGE_DESC);
        String str8 = str2;
        C2668g.b(str8, "model");
        String str9 = str3;
        C2668g.b(str9, "dataProvider");
        String str10 = str4;
        C2668g.b(str10, "manufacturer");
        String str11 = str5;
        C2668g.b(str11, "osVersion");
        String str12 = str6;
        C2668g.b(str12, "tiVersion");
        return new FeedbackRequestBody(str7, str8, str9, str10, str11, str12, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FeedbackRequestBody) {
            FeedbackRequestBody feedbackRequestBody = (FeedbackRequestBody) obj;
            if (C2668g.a(this.description, feedbackRequestBody.description) && C2668g.a(this.model, feedbackRequestBody.model) && C2668g.a(this.dataProvider, feedbackRequestBody.dataProvider) && C2668g.a(this.manufacturer, feedbackRequestBody.manufacturer) && C2668g.a(this.osVersion, feedbackRequestBody.osVersion) && C2668g.a(this.tiVersion, feedbackRequestBody.tiVersion)) {
                if ((this.stars == feedbackRequestBody.stars ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.description;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.model;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.dataProvider;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.manufacturer;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.osVersion;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.tiVersion;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.stars;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FeedbackRequestBody(description=");
        stringBuilder.append(this.description);
        stringBuilder.append(", model=");
        stringBuilder.append(this.model);
        stringBuilder.append(", dataProvider=");
        stringBuilder.append(this.dataProvider);
        stringBuilder.append(", manufacturer=");
        stringBuilder.append(this.manufacturer);
        stringBuilder.append(", osVersion=");
        stringBuilder.append(this.osVersion);
        stringBuilder.append(", tiVersion=");
        stringBuilder.append(this.tiVersion);
        stringBuilder.append(", stars=");
        stringBuilder.append(this.stars);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public FeedbackRequestBody(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i) {
        C2668g.b(str, ManagerWebServices.PARAM_BADGE_DESC);
        C2668g.b(str2, "model");
        C2668g.b(str3, "dataProvider");
        C2668g.b(str4, "manufacturer");
        C2668g.b(str5, "osVersion");
        C2668g.b(str6, "tiVersion");
        this.description = str;
        this.model = str2;
        this.dataProvider = str3;
        this.manufacturer = str4;
        this.osVersion = str5;
        this.tiVersion = str6;
        this.stars = i;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getDataProvider() {
        return this.dataProvider;
    }

    @NotNull
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @NotNull
    public final String getOsVersion() {
        return this.osVersion;
    }

    @NotNull
    public final String getTiVersion() {
        return this.tiVersion;
    }

    public final int getStars() {
        return this.stars;
    }
}
