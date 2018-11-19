package com.tinder.api.model.meta.v2;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/tinder/api/model/meta/v2/SelectConfig;", "", "enabled", "", "selectRecsEnabled", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSelectRecsEnabled", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/tinder/api/model/meta/v2/SelectConfig;", "equals", "other", "hashCode", "", "toString", "", "api_release"}, k = 1, mv = {1, 1, 10})
public final class SelectConfig {
    @Nullable
    private final Boolean enabled;
    @Nullable
    private final Boolean selectRecsEnabled;

    @NotNull
    public static /* synthetic */ SelectConfig copy$default(SelectConfig selectConfig, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = selectConfig.enabled;
        }
        if ((i & 2) != 0) {
            bool2 = selectConfig.selectRecsEnabled;
        }
        return selectConfig.copy(bool, bool2);
    }

    @Nullable
    public final Boolean component1() {
        return this.enabled;
    }

    @Nullable
    public final Boolean component2() {
        return this.selectRecsEnabled;
    }

    @NotNull
    public final SelectConfig copy(@Nullable @Json(name = "select_enabled") Boolean bool, @Nullable @Json(name = "select_recs_enabled") Boolean bool2) {
        return new SelectConfig(bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SelectConfig) {
                SelectConfig selectConfig = (SelectConfig) obj;
                if (C2668g.a(this.enabled, selectConfig.enabled) && C2668g.a(this.selectRecsEnabled, selectConfig.selectRecsEnabled)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.selectRecsEnabled;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SelectConfig(enabled=");
        stringBuilder.append(this.enabled);
        stringBuilder.append(", selectRecsEnabled=");
        stringBuilder.append(this.selectRecsEnabled);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public SelectConfig(@Nullable @Json(name = "select_enabled") Boolean bool, @Nullable @Json(name = "select_recs_enabled") Boolean bool2) {
        this.enabled = bool;
        this.selectRecsEnabled = bool2;
    }

    @Nullable
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final Boolean getSelectRecsEnabled() {
        return this.selectRecsEnabled;
    }
}
