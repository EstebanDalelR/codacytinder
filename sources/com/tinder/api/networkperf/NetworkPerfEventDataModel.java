package com.tinder.api.networkperf;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/api/networkperf/NetworkPerfEventDataModel;", "", "url", "", "urlPathSegments", "", "(Ljava/lang/String;Ljava/util/List;)V", "getUrl", "()Ljava/lang/String;", "getUrlPathSegments", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class NetworkPerfEventDataModel {
    @NotNull
    private final String url;
    @NotNull
    private final List<String> urlPathSegments;

    @NotNull
    public static /* synthetic */ NetworkPerfEventDataModel copy$default(NetworkPerfEventDataModel networkPerfEventDataModel, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkPerfEventDataModel.url;
        }
        if ((i & 2) != 0) {
            list = networkPerfEventDataModel.urlPathSegments;
        }
        return networkPerfEventDataModel.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.url;
    }

    @NotNull
    public final List<String> component2() {
        return this.urlPathSegments;
    }

    @NotNull
    public final NetworkPerfEventDataModel copy(@NotNull String str, @NotNull List<String> list) {
        C2668g.b(str, "url");
        C2668g.b(list, "urlPathSegments");
        return new NetworkPerfEventDataModel(str, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NetworkPerfEventDataModel) {
                NetworkPerfEventDataModel networkPerfEventDataModel = (NetworkPerfEventDataModel) obj;
                if (C2668g.a(this.url, networkPerfEventDataModel.url) && C2668g.a(this.urlPathSegments, networkPerfEventDataModel.urlPathSegments)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.url;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.urlPathSegments;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NetworkPerfEventDataModel(url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", urlPathSegments=");
        stringBuilder.append(this.urlPathSegments);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public NetworkPerfEventDataModel(@NotNull String str, @NotNull List<String> list) {
        C2668g.b(str, "url");
        C2668g.b(list, "urlPathSegments");
        this.url = str;
        this.urlPathSegments = list;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final List<String> getUrlPathSegments() {
        return this.urlPathSegments;
    }
}
