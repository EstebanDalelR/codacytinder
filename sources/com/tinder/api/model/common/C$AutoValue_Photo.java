package com.tinder.api.model.common;

import android.support.annotation.Nullable;
import com.squareup.moshi.Json;
import java.util.List;

/* renamed from: com.tinder.api.model.common.$AutoValue_Photo */
abstract class C$AutoValue_Photo extends Photo {
    private final String crop;
    private final String extension;
    private final String fbId;
    private final String fileName;
    private final String id;
    private final List<ProcessedFile> processedFiles;
    private final List<ProcessedVideo> processedVideos;
    private final Float selectRate;
    private final Double successRate;
    private final String url;
    private final Double xdistancePercent;
    private final Double xoffsetPercent;
    private final Double ydistancePercent;
    private final Double yoffsetPercent;

    C$AutoValue_Photo(@Nullable String str, @Nullable List<ProcessedFile> list, @Nullable List<ProcessedVideo> list2, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Double d, @Nullable Double d2, @Nullable Double d3, @Nullable Double d4, @Nullable String str6, @Nullable Double d5, @Nullable Float f) {
        this.id = str;
        this.processedFiles = list;
        this.processedVideos = list2;
        this.extension = str2;
        this.fileName = str3;
        this.url = str4;
        this.crop = str5;
        this.xdistancePercent = d;
        this.ydistancePercent = d2;
        this.xoffsetPercent = d3;
        this.yoffsetPercent = d4;
        this.fbId = str6;
        this.successRate = d5;
        this.selectRate = f;
    }

    @Nullable
    @Json(name = "id")
    public String id() {
        return this.id;
    }

    @Nullable
    @Json(name = "processedFiles")
    public List<ProcessedFile> processedFiles() {
        return this.processedFiles;
    }

    @Nullable
    @Json(name = "processedVideos")
    public List<ProcessedVideo> processedVideos() {
        return this.processedVideos;
    }

    @Nullable
    @Json(name = "extension")
    public String extension() {
        return this.extension;
    }

    @Nullable
    @Json(name = "fileName")
    public String fileName() {
        return this.fileName;
    }

    @Nullable
    @Json(name = "url")
    public String url() {
        return this.url;
    }

    @Nullable
    @Json(name = "crop")
    public String crop() {
        return this.crop;
    }

    @Nullable
    @Json(name = "xdistance_percent")
    public Double xdistancePercent() {
        return this.xdistancePercent;
    }

    @Nullable
    @Json(name = "ydistance_percent")
    public Double ydistancePercent() {
        return this.ydistancePercent;
    }

    @Nullable
    @Json(name = "xoffset_percent")
    public Double xoffsetPercent() {
        return this.xoffsetPercent;
    }

    @Nullable
    @Json(name = "yoffset_percent")
    public Double yoffsetPercent() {
        return this.yoffsetPercent;
    }

    @Nullable
    @Json(name = "fbid")
    public String fbId() {
        return this.fbId;
    }

    @Nullable
    @Json(name = "success_rate")
    public Double successRate() {
        return this.successRate;
    }

    @Nullable
    @Json(name = "selectRate")
    public Float selectRate() {
        return this.selectRate;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Photo{id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", processedFiles=");
        stringBuilder.append(this.processedFiles);
        stringBuilder.append(", processedVideos=");
        stringBuilder.append(this.processedVideos);
        stringBuilder.append(", extension=");
        stringBuilder.append(this.extension);
        stringBuilder.append(", fileName=");
        stringBuilder.append(this.fileName);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", crop=");
        stringBuilder.append(this.crop);
        stringBuilder.append(", xdistancePercent=");
        stringBuilder.append(this.xdistancePercent);
        stringBuilder.append(", ydistancePercent=");
        stringBuilder.append(this.ydistancePercent);
        stringBuilder.append(", xoffsetPercent=");
        stringBuilder.append(this.xoffsetPercent);
        stringBuilder.append(", yoffsetPercent=");
        stringBuilder.append(this.yoffsetPercent);
        stringBuilder.append(", fbId=");
        stringBuilder.append(this.fbId);
        stringBuilder.append(", successRate=");
        stringBuilder.append(this.successRate);
        stringBuilder.append(", selectRate=");
        stringBuilder.append(this.selectRate);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.tinder.api.model.common.Photo;
        r2 = 0;
        if (r1 == 0) goto L_0x0150;
    L_0x0009:
        r5 = (com.tinder.api.model.common.Photo) r5;
        r1 = r4.id;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.id();
        if (r1 != 0) goto L_0x014e;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.id;
        r3 = r5.id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x0022:
        r1 = r4.processedFiles;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.processedFiles();
        if (r1 != 0) goto L_0x014e;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.processedFiles;
        r3 = r5.processedFiles();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x0039:
        r1 = r4.processedVideos;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.processedVideos();
        if (r1 != 0) goto L_0x014e;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.processedVideos;
        r3 = r5.processedVideos();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x0050:
        r1 = r4.extension;
        if (r1 != 0) goto L_0x005b;
    L_0x0054:
        r1 = r5.extension();
        if (r1 != 0) goto L_0x014e;
    L_0x005a:
        goto L_0x0067;
    L_0x005b:
        r1 = r4.extension;
        r3 = r5.extension();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x0067:
        r1 = r4.fileName;
        if (r1 != 0) goto L_0x0072;
    L_0x006b:
        r1 = r5.fileName();
        if (r1 != 0) goto L_0x014e;
    L_0x0071:
        goto L_0x007e;
    L_0x0072:
        r1 = r4.fileName;
        r3 = r5.fileName();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x007e:
        r1 = r4.url;
        if (r1 != 0) goto L_0x0089;
    L_0x0082:
        r1 = r5.url();
        if (r1 != 0) goto L_0x014e;
    L_0x0088:
        goto L_0x0095;
    L_0x0089:
        r1 = r4.url;
        r3 = r5.url();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x0095:
        r1 = r4.crop;
        if (r1 != 0) goto L_0x00a0;
    L_0x0099:
        r1 = r5.crop();
        if (r1 != 0) goto L_0x014e;
    L_0x009f:
        goto L_0x00ac;
    L_0x00a0:
        r1 = r4.crop;
        r3 = r5.crop();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x00ac:
        r1 = r4.xdistancePercent;
        if (r1 != 0) goto L_0x00b7;
    L_0x00b0:
        r1 = r5.xdistancePercent();
        if (r1 != 0) goto L_0x014e;
    L_0x00b6:
        goto L_0x00c3;
    L_0x00b7:
        r1 = r4.xdistancePercent;
        r3 = r5.xdistancePercent();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x00c3:
        r1 = r4.ydistancePercent;
        if (r1 != 0) goto L_0x00ce;
    L_0x00c7:
        r1 = r5.ydistancePercent();
        if (r1 != 0) goto L_0x014e;
    L_0x00cd:
        goto L_0x00da;
    L_0x00ce:
        r1 = r4.ydistancePercent;
        r3 = r5.ydistancePercent();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x00da:
        r1 = r4.xoffsetPercent;
        if (r1 != 0) goto L_0x00e5;
    L_0x00de:
        r1 = r5.xoffsetPercent();
        if (r1 != 0) goto L_0x014e;
    L_0x00e4:
        goto L_0x00f1;
    L_0x00e5:
        r1 = r4.xoffsetPercent;
        r3 = r5.xoffsetPercent();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x00f1:
        r1 = r4.yoffsetPercent;
        if (r1 != 0) goto L_0x00fc;
    L_0x00f5:
        r1 = r5.yoffsetPercent();
        if (r1 != 0) goto L_0x014e;
    L_0x00fb:
        goto L_0x0108;
    L_0x00fc:
        r1 = r4.yoffsetPercent;
        r3 = r5.yoffsetPercent();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x0108:
        r1 = r4.fbId;
        if (r1 != 0) goto L_0x0113;
    L_0x010c:
        r1 = r5.fbId();
        if (r1 != 0) goto L_0x014e;
    L_0x0112:
        goto L_0x011f;
    L_0x0113:
        r1 = r4.fbId;
        r3 = r5.fbId();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x011f:
        r1 = r4.successRate;
        if (r1 != 0) goto L_0x012a;
    L_0x0123:
        r1 = r5.successRate();
        if (r1 != 0) goto L_0x014e;
    L_0x0129:
        goto L_0x0136;
    L_0x012a:
        r1 = r4.successRate;
        r3 = r5.successRate();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x014e;
    L_0x0136:
        r1 = r4.selectRate;
        if (r1 != 0) goto L_0x0141;
    L_0x013a:
        r5 = r5.selectRate();
        if (r5 != 0) goto L_0x014e;
    L_0x0140:
        goto L_0x014f;
    L_0x0141:
        r1 = r4.selectRate;
        r5 = r5.selectRate();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x014e;
    L_0x014d:
        goto L_0x014f;
    L_0x014e:
        r0 = 0;
    L_0x014f:
        return r0;
    L_0x0150:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.api.model.common.$AutoValue_Photo.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((((((((((((((((((((((this.id == null ? 0 : this.id.hashCode()) ^ 1000003) * 1000003) ^ (this.processedFiles == null ? 0 : this.processedFiles.hashCode())) * 1000003) ^ (this.processedVideos == null ? 0 : this.processedVideos.hashCode())) * 1000003) ^ (this.extension == null ? 0 : this.extension.hashCode())) * 1000003) ^ (this.fileName == null ? 0 : this.fileName.hashCode())) * 1000003) ^ (this.url == null ? 0 : this.url.hashCode())) * 1000003) ^ (this.crop == null ? 0 : this.crop.hashCode())) * 1000003) ^ (this.xdistancePercent == null ? 0 : this.xdistancePercent.hashCode())) * 1000003) ^ (this.ydistancePercent == null ? 0 : this.ydistancePercent.hashCode())) * 1000003) ^ (this.xoffsetPercent == null ? 0 : this.xoffsetPercent.hashCode())) * 1000003) ^ (this.yoffsetPercent == null ? 0 : this.yoffsetPercent.hashCode())) * 1000003) ^ (this.fbId == null ? 0 : this.fbId.hashCode())) * 1000003) ^ (this.successRate == null ? 0 : this.successRate.hashCode())) * 1000003;
        if (this.selectRate != null) {
            i = this.selectRate.hashCode();
        }
        return hashCode ^ i;
    }
}
