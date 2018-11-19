package com.tinder.domain.onboarding;

import com.tinder.api.ManagerWebServices;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C19301m;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u0012B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tinder/domain/onboarding/Onboarding;", "", "tutorials", "", "Lcom/tinder/domain/onboarding/Onboarding$Tutorial;", "(Ljava/util/List;)V", "getTutorials", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "Tutorial", "domain_release"}, k = 1, mv = {1, 1, 10})
public final class Onboarding {
    public static final Companion Companion = new Companion();
    @NotNull
    private static final Onboarding DEFAULT = new Onboarding(C19301m.a());
    @NotNull
    private final List<Tutorial> tutorials;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/onboarding/Onboarding$Companion;", "", "()V", "DEFAULT", "Lcom/tinder/domain/onboarding/Onboarding;", "getDEFAULT", "()Lcom/tinder/domain/onboarding/Onboarding;", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final Onboarding getDEFAULT() {
            return Onboarding.DEFAULT;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/tinder/domain/onboarding/Onboarding$Tutorial;", "", "assets", "", "Lcom/tinder/domain/onboarding/Onboarding$Tutorial$Asset;", "name", "Lcom/tinder/domain/onboarding/Onboarding$Tutorial$Name;", "(Ljava/util/List;Lcom/tinder/domain/onboarding/Onboarding$Tutorial$Name;)V", "getAssets", "()Ljava/util/List;", "getName", "()Lcom/tinder/domain/onboarding/Onboarding$Tutorial$Name;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Asset", "Name", "domain_release"}, k = 1, mv = {1, 1, 10})
    public static final class Tutorial {
        @NotNull
        private final List<Asset> assets;
        @NotNull
        private final Name name;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/domain/onboarding/Onboarding$Tutorial$Asset;", "", "type", "Lcom/tinder/domain/onboarding/Onboarding$Tutorial$Asset$Type;", "url", "", "(Lcom/tinder/domain/onboarding/Onboarding$Tutorial$Asset$Type;Ljava/lang/String;)V", "getType", "()Lcom/tinder/domain/onboarding/Onboarding$Tutorial$Asset$Type;", "getUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Type", "domain_release"}, k = 1, mv = {1, 1, 10})
        public static final class Asset {
            @NotNull
            private final Type type;
            @NotNull
            private final String url;

            @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/tinder/domain/onboarding/Onboarding$Tutorial$Asset$Type;", "", "apiName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getApiName", "()Ljava/lang/String;", "IMAGE", "VIDEO", "NONE", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
            public enum Type {
                ;
                
                public static final Companion Companion = null;
                @NotNull
                private final String apiName;

                @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/onboarding/Onboarding$Tutorial$Asset$Type$Companion;", "", "()V", "fromApiName", "Lcom/tinder/domain/onboarding/Onboarding$Tutorial$Asset$Type;", "apiName", "", "domain_release"}, k = 1, mv = {1, 1, 10})
                public static final class Companion {
                    private Companion() {
                    }

                    @NotNull
                    public final Type fromApiName(@NotNull String str) {
                        C2668g.b(str, "apiName");
                        for (Type type : Type.values()) {
                            if (C2668g.a(type.getApiName(), str)) {
                                break;
                            }
                        }
                        Type type2 = null;
                        return type2 != null ? type2 : Type.NONE;
                    }
                }

                protected Type(String str) {
                    C2668g.b(str, "apiName");
                    this.apiName = str;
                }

                @NotNull
                public final String getApiName() {
                    return this.apiName;
                }

                static {
                    Companion = new Companion();
                }
            }

            @NotNull
            public static /* synthetic */ Asset copy$default(Asset asset, Type type, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    type = asset.type;
                }
                if ((i & 2) != 0) {
                    str = asset.url;
                }
                return asset.copy(type, str);
            }

            @NotNull
            public final Type component1() {
                return this.type;
            }

            @NotNull
            public final String component2() {
                return this.url;
            }

            @NotNull
            public final Asset copy(@NotNull Type type, @NotNull String str) {
                C2668g.b(type, "type");
                C2668g.b(str, "url");
                return new Asset(type, str);
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
                Type type = this.type;
                int i = 0;
                int hashCode = (type != null ? type.hashCode() : 0) * 31;
                String str = this.url;
                if (str != null) {
                    i = str.hashCode();
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

            public Asset(@NotNull Type type, @NotNull String str) {
                C2668g.b(type, "type");
                C2668g.b(str, "url");
                this.type = type;
                this.url = str;
            }

            @NotNull
            public final Type getType() {
                return this.type;
            }

            @NotNull
            public final String getUrl() {
                return this.url;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/tinder/domain/onboarding/Onboarding$Tutorial$Name;", "", "apiName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getApiName", "()Ljava/lang/String;", "TOP_PICKS_INTRO", "NONE", "Companion", "domain_release"}, k = 1, mv = {1, 1, 10})
        public enum Name {
            ;
            
            public static final Companion Companion = null;
            @NotNull
            private final String apiName;

            @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/tinder/domain/onboarding/Onboarding$Tutorial$Name$Companion;", "", "()V", "fromApiName", "Lcom/tinder/domain/onboarding/Onboarding$Tutorial$Name;", "apiName", "", "domain_release"}, k = 1, mv = {1, 1, 10})
            public static final class Companion {
                private Companion() {
                }

                @JvmStatic
                @NotNull
                public final Name fromApiName(@NotNull String str) {
                    C2668g.b(str, "apiName");
                    for (Name name : Name.values()) {
                        if (C2668g.a(name.getApiName(), str)) {
                            break;
                        }
                    }
                    Name name2 = null;
                    return name2 != null ? name2 : Name.NONE;
                }
            }

            @JvmStatic
            @NotNull
            public static final Name fromApiName(@NotNull String str) {
                return Companion.fromApiName(str);
            }

            protected Name(String str) {
                C2668g.b(str, "apiName");
                this.apiName = str;
            }

            @NotNull
            public final String getApiName() {
                return this.apiName;
            }

            static {
                Companion = new Companion();
            }
        }

        @NotNull
        public static /* synthetic */ Tutorial copy$default(Tutorial tutorial, List list, Name name, int i, Object obj) {
            if ((i & 1) != 0) {
                list = tutorial.assets;
            }
            if ((i & 2) != 0) {
                name = tutorial.name;
            }
            return tutorial.copy(list, name);
        }

        @NotNull
        public final List<Asset> component1() {
            return this.assets;
        }

        @NotNull
        public final Name component2() {
            return this.name;
        }

        @NotNull
        public final Tutorial copy(@NotNull List<Asset> list, @NotNull Name name) {
            C2668g.b(list, ManagerWebServices.PARAM_KEY_ASSETS);
            C2668g.b(name, "name");
            return new Tutorial(list, name);
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
            Name name = this.name;
            if (name != null) {
                i = name.hashCode();
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

        public Tutorial(@NotNull List<Asset> list, @NotNull Name name) {
            C2668g.b(list, ManagerWebServices.PARAM_KEY_ASSETS);
            C2668g.b(name, "name");
            this.assets = list;
            this.name = name;
        }

        @NotNull
        public final List<Asset> getAssets() {
            return this.assets;
        }

        @NotNull
        public final Name getName() {
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
    public final Onboarding copy(@NotNull List<Tutorial> list) {
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

    public Onboarding(@NotNull List<Tutorial> list) {
        C2668g.b(list, ManagerWebServices.PARAM_TUTORIALS);
        this.tutorials = list;
    }

    @NotNull
    public final List<Tutorial> getTutorials() {
        return this.tutorials;
    }
}
