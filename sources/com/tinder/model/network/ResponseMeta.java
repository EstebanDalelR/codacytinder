package com.tinder.model.network;

import com.google.gson.annotations.SerializedName;

public class ResponseMeta {
    @SerializedName("status")
    private int statusCode;

    public int getStatusCode() {
        return this.statusCode;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                if (this.statusCode != ((ResponseMeta) obj).statusCode) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.statusCode;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ResponseMeta{statusCode=");
        stringBuilder.append(this.statusCode);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
