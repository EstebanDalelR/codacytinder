package com.snapchat.kit.sdk.core.models;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.C17715c;

public class TokenErrorResponse {
    @SerializedName("error")
    protected String mError;
    @SerializedName("error_description")
    protected String mErrorDescription;
    @SerializedName("message")
    protected String mMessage;

    public TokenErrorResponse(String str) {
        this.mMessage = str;
    }

    public final String getError() {
        return this.mError;
    }

    public final String getErrorDescription() {
        return this.mErrorDescription;
    }

    public final String getMessage() {
        return this.mMessage;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.mError == null ? 0 : this.mError.hashCode() * 37) + 17) + (this.mErrorDescription == null ? 0 : this.mErrorDescription.hashCode() * 37);
        if (this.mMessage != null) {
            i = this.mMessage.hashCode() * 37;
        }
        return hashCode + i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null) {
            if (obj instanceof TokenErrorResponse) {
                TokenErrorResponse tokenErrorResponse = (TokenErrorResponse) obj;
                return new C17715c().a(this.mError, tokenErrorResponse.mError).a(this.mErrorDescription, tokenErrorResponse.mErrorDescription).a(this.mMessage, tokenErrorResponse.mMessage).a();
            }
        }
        return null;
    }
}
