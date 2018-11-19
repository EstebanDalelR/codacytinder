package com.tinder.api.buckets;

import com.squareup.moshi.Json;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/api/buckets/BucketsRequestBody;", "", "deviceId", "", "experiments", "", "(Ljava/lang/String;Ljava/util/List;)V", "getDeviceId", "()Ljava/lang/String;", "getExperiments", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class BucketsRequestBody {
    @NotNull
    private final String deviceId;
    @NotNull
    private final List<String> experiments;

    @NotNull
    public static /* synthetic */ BucketsRequestBody copy$default(BucketsRequestBody bucketsRequestBody, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bucketsRequestBody.deviceId;
        }
        if ((i & 2) != 0) {
            list = bucketsRequestBody.experiments;
        }
        return bucketsRequestBody.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.deviceId;
    }

    @NotNull
    public final List<String> component2() {
        return this.experiments;
    }

    @NotNull
    public final BucketsRequestBody copy(@NotNull @Json(name = "device_id") String str, @NotNull @Json(name = "experiments") List<String> list) {
        C2668g.b(str, "deviceId");
        C2668g.b(list, "experiments");
        return new BucketsRequestBody(str, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BucketsRequestBody) {
                BucketsRequestBody bucketsRequestBody = (BucketsRequestBody) obj;
                if (C2668g.a(this.deviceId, bucketsRequestBody.deviceId) && C2668g.a(this.experiments, bucketsRequestBody.experiments)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.deviceId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.experiments;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BucketsRequestBody(deviceId=");
        stringBuilder.append(this.deviceId);
        stringBuilder.append(", experiments=");
        stringBuilder.append(this.experiments);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public BucketsRequestBody(@NotNull @Json(name = "device_id") String str, @NotNull @Json(name = "experiments") List<String> list) {
        C2668g.b(str, "deviceId");
        C2668g.b(list, "experiments");
        this.deviceId = str;
        this.experiments = list;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final List<String> getExperiments() {
        return this.experiments;
    }
}
