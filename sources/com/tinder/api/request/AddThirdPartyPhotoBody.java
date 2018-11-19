package com.tinder.api.request;

import com.squareup.moshi.Json;
import com.tinder.api.ManagerWebServices;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/tinder/api/request/AddThirdPartyPhotoBody;", "", "transmit", "", "assets", "", "Lcom/tinder/api/request/Asset;", "(Ljava/lang/String;Ljava/util/List;)V", "getAssets", "()Ljava/util/List;", "getTransmit", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
public final class AddThirdPartyPhotoBody {
    @NotNull
    private final List<Asset> assets;
    @NotNull
    private final String transmit;

    @NotNull
    public static /* synthetic */ AddThirdPartyPhotoBody copy$default(AddThirdPartyPhotoBody addThirdPartyPhotoBody, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addThirdPartyPhotoBody.transmit;
        }
        if ((i & 2) != 0) {
            list = addThirdPartyPhotoBody.assets;
        }
        return addThirdPartyPhotoBody.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.transmit;
    }

    @NotNull
    public final List<Asset> component2() {
        return this.assets;
    }

    @NotNull
    public final AddThirdPartyPhotoBody copy(@NotNull @Json(name = "transmit") String str, @NotNull @Json(name = "assets") List<Asset> list) {
        C2668g.b(str, ManagerWebServices.PARAM_KEY_SOURCE);
        C2668g.b(list, ManagerWebServices.PARAM_KEY_ASSETS);
        return new AddThirdPartyPhotoBody(str, list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AddThirdPartyPhotoBody) {
                AddThirdPartyPhotoBody addThirdPartyPhotoBody = (AddThirdPartyPhotoBody) obj;
                if (C2668g.a(this.transmit, addThirdPartyPhotoBody.transmit) && C2668g.a(this.assets, addThirdPartyPhotoBody.assets)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.transmit;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.assets;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AddThirdPartyPhotoBody(transmit=");
        stringBuilder.append(this.transmit);
        stringBuilder.append(", assets=");
        stringBuilder.append(this.assets);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public AddThirdPartyPhotoBody(@NotNull @Json(name = "transmit") String str, @NotNull @Json(name = "assets") List<Asset> list) {
        C2668g.b(str, ManagerWebServices.PARAM_KEY_SOURCE);
        C2668g.b(list, ManagerWebServices.PARAM_KEY_ASSETS);
        this.transmit = str;
        this.assets = list;
    }

    @NotNull
    public final String getTransmit() {
        return this.transmit;
    }

    @NotNull
    public final List<Asset> getAssets() {
        return this.assets;
    }
}
