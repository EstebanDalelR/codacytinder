package com.tinder.api.buckets;

import com.squareup.moshi.Json;
import com.tinder.api.ManagerWebServices;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/api/buckets/BucketsResponse;", "", "data", "Lcom/tinder/api/buckets/BucketsResponse$Data;", "(Lcom/tinder/api/buckets/BucketsResponse$Data;)V", "getData", "()Lcom/tinder/api/buckets/BucketsResponse$Data;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Data", "api_release"}, k = 1, mv = {1, 1, 10})
public final class BucketsResponse {
    @NotNull
    private final Data data;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\b\u0001\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001f\u0010\t\u001a\u00020\u00002\u0014\b\u0003\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/tinder/api/buckets/BucketsResponse$Data;", "", "buckets", "", "", "(Ljava/util/Map;)V", "getBuckets", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class Data {
        @NotNull
        private final Map<String, String> buckets;

        @NotNull
        public static /* synthetic */ Data copy$default(Data data, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = data.buckets;
            }
            return data.copy(map);
        }

        @NotNull
        public final Map<String, String> component1() {
            return this.buckets;
        }

        @NotNull
        public final Data copy(@NotNull @Json(name = "buckets") Map<String, String> map) {
            C2668g.b(map, "buckets");
            return new Data(map);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Data) {
                    if (C2668g.a(this.buckets, ((Data) obj).buckets)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Map map = this.buckets;
            return map != null ? map.hashCode() : 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Data(buckets=");
            stringBuilder.append(this.buckets);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Data(@NotNull @Json(name = "buckets") Map<String, String> map) {
            C2668g.b(map, "buckets");
            this.buckets = map;
        }

        @NotNull
        public final Map<String, String> getBuckets() {
            return this.buckets;
        }
    }

    @NotNull
    public static /* synthetic */ BucketsResponse copy$default(BucketsResponse bucketsResponse, Data data, int i, Object obj) {
        if ((i & 1) != 0) {
            data = bucketsResponse.data;
        }
        return bucketsResponse.copy(data);
    }

    @NotNull
    public final Data component1() {
        return this.data;
    }

    @NotNull
    public final BucketsResponse copy(@NotNull @Json(name = "data") Data data) {
        C2668g.b(data, ManagerWebServices.FB_DATA);
        return new BucketsResponse(data);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BucketsResponse) {
                if (C2668g.a(this.data, ((BucketsResponse) obj).data)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Data data = this.data;
        return data != null ? data.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BucketsResponse(data=");
        stringBuilder.append(this.data);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public BucketsResponse(@NotNull @Json(name = "data") Data data) {
        C2668g.b(data, ManagerWebServices.FB_DATA);
        this.data = data;
    }

    @NotNull
    public final Data getData() {
        return this.data;
    }
}
