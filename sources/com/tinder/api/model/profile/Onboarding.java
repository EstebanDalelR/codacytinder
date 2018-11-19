package com.tinder.api.model.profile;

import com.squareup.moshi.Json;
import com.tinder.api.ManagerWebServices;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0015\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/api/model/profile/Onboarding;", "", "tutorials", "", "Lcom/tinder/api/model/profile/Onboarding$Tutorial;", "(Ljava/util/List;)V", "getTutorials", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Tutorial", "api_release"}, k = 1, mv = {1, 1, 10})
public final class Onboarding {
    @NotNull
    private final List<Tutorial> tutorials;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001f\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tinder/api/model/profile/Onboarding$Tutorial;", "", "assets", "", "Lcom/tinder/api/model/profile/Onboarding$Tutorial$Asset;", "name", "", "(Ljava/util/List;Ljava/lang/String;)V", "getAssets", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Asset", "api_release"}, k = 1, mv = {1, 1, 10})
    public static final class Tutorial {
        @NotNull
        private final List<Asset> assets;
        @NotNull
        private final String name;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/tinder/api/model/profile/Onboarding$Tutorial$Asset;", "", "type", "", "url", "(Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_release"}, k = 1, mv = {1, 1, 10})
        public static final class Asset {
            @NotNull
            private final String type;
            @NotNull
            private final String url;

            @NotNull
            public static /* synthetic */ Asset copy$default(Asset asset, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = asset.type;
                }
                if ((i & 2) != 0) {
                    str2 = asset.url;
                }
                return asset.copy(str, str2);
            }

            @NotNull
            public final String component1() {
                return this.type;
            }

            @NotNull
            public final String component2() {
                return this.url;
            }

            @NotNull
            public final Asset copy(@NotNull @Json(name = "type") String str, @NotNull @Json(name = "url") String str2) {
                C2668g.b(str, "type");
                C2668g.b(str2, "url");
                return new Asset(str, str2);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Asset) {
                        Asset asset = (Asset) obj;
                        if (C2668g.a(this.type, asset.type) && C2668g.a(this.url, asset.url)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                String str = this.type;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.url;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Asset(type=");
                stringBuilder.append(this.type);
                stringBuilder.append(", url=");
                stringBuilder.append(this.url);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public Asset(@NotNull @Json(name = "type") String str, @NotNull @Json(name = "url") String str2) {
                C2668g.b(str, "type");
                C2668g.b(str2, "url");
                this.type = str;
                this.url = str2;
            }

            @NotNull
            public final String getType() {
                return this.type;
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }
        }

        @NotNull
        public static /* synthetic */ Tutorial copy$default(Tutorial tutorial, List list, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = tutorial.assets;
            }
            if ((i & 2) != 0) {
                str = tutorial.name;
            }
            return tutorial.copy(list, str);
        }

        @NotNull
        public final List<Asset> component1() {
            return this.assets;
        }

        @NotNull
        public final String component2() {
            return this.name;
        }

        @NotNull
        public final Tutorial copy(@NotNull @Json(name = "assets") List<Asset> list, @NotNull @Json(name = "name") String str) {
            C2668g.b(list, ManagerWebServices.PARAM_KEY_ASSETS);
            C2668g.b(str, "name");
            return new Tutorial(list, str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Tutorial) {
                    Tutorial tutorial = (Tutorial) obj;
                    if (C2668g.a(this.assets, tutorial.assets) && C2668g.a(this.name, tutorial.name)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            List list = this.assets;
            int i = 0;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            String str = this.name;
            if (str != null) {
                i = str.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Tutorial(assets=");
            stringBuilder.append(this.assets);
            stringBuilder.append(", name=");
            stringBuilder.append(this.name);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public Tutorial(@NotNull @Json(name = "assets") List<Asset> list, @NotNull @Json(name = "name") String str) {
            C2668g.b(list, ManagerWebServices.PARAM_KEY_ASSETS);
            C2668g.b(str, "name");
            this.assets = list;
            this.name = str;
        }

        @NotNull
        public final List<Asset> getAssets() {
            return this.assets;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }
    }

    @NotNull
    public static /* synthetic */ Onboarding copy$default(Onboarding onboarding, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = onboarding.tutorials;
        }
        return onboarding.copy(list);
    }

    @NotNull
    public final List<Tutorial> component1() {
        return this.tutorials;
    }

    @NotNull
    public final Onboarding copy(@NotNull @Json(name = "tutorials") List<Tutorial> list) {
        C2668g.b(list, ManagerWebServices.PARAM_TUTORIALS);
        return new Onboarding(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Onboarding) {
                if (C2668g.a(this.tutorials, ((Onboarding) obj).tutorials)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List list = this.tutorials;
        return list != null ? list.hashCode() : 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Onboarding(tutorials=");
        stringBuilder.append(this.tutorials);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Onboarding(@NotNull @Json(name = "tutorials") List<Tutorial> list) {
        C2668g.b(list, ManagerWebServices.PARAM_TUTORIALS);
        this.tutorials = list;
    }

    @NotNull
    public final List<Tutorial> getTutorials() {
        return this.tutorials;
    }
}
