package com.tinder.api.response;

/* renamed from: com.tinder.api.response.$AutoValue_EmptyResponse */
abstract class C$AutoValue_EmptyResponse extends EmptyResponse {
    private final Integer code;
    private final String message;

    static final class Builder extends com.tinder.api.response.EmptyResponse.Builder {
        private Integer code;
        private String message;

        Builder() {
        }

        Builder(EmptyResponse emptyResponse) {
            this.code = emptyResponse.code();
            this.message = emptyResponse.message();
        }

        public com.tinder.api.response.EmptyResponse.Builder code(Integer num) {
            this.code = num;
            return this;
        }

        public com.tinder.api.response.EmptyResponse.Builder message(String str) {
            this.message = str;
            return this;
        }

        public EmptyResponse build() {
            String str = "";
            if (this.code == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" code");
                str = stringBuilder.toString();
            }
            if (this.message == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" message");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_EmptyResponse(this.code, this.message);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    C$AutoValue_EmptyResponse(Integer num, String str) {
        if (num == null) {
            throw new NullPointerException("Null code");
        }
        this.code = num;
        if (str == null) {
            throw new NullPointerException("Null message");
        }
        this.message = str;
    }

    public Integer code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EmptyResponse{code=");
        stringBuilder.append(this.code);
        stringBuilder.append(", message=");
        stringBuilder.append(this.message);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EmptyResponse)) {
            return false;
        }
        EmptyResponse emptyResponse = (EmptyResponse) obj;
        if (!this.code.equals(emptyResponse.code()) || this.message.equals(emptyResponse.message()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.code.hashCode() ^ 1000003) * 1000003) ^ this.message.hashCode();
    }
}
