package com.tinder.api.model.common;

import com.squareup.moshi.Json;
import com.tinder.api.model.common.TinderSelect.Select;
import javax.annotation.Nullable;

/* renamed from: com.tinder.api.model.common.$AutoValue_TinderSelect */
abstract class C$AutoValue_TinderSelect extends TinderSelect {
    private final Select select;

    C$AutoValue_TinderSelect(@Nullable Select select) {
        this.select = select;
    }

    @Nullable
    @Json(name = "select")
    public Select select() {
        return this.select;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TinderSelect{select=");
        stringBuilder.append(this.select);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TinderSelect)) {
            return false;
        }
        TinderSelect tinderSelect = (TinderSelect) obj;
        if (this.select != null) {
            z = this.select.equals(tinderSelect.select());
        } else if (tinderSelect.select() != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.select == null ? 0 : this.select.hashCode()) ^ 1000003;
    }
}
