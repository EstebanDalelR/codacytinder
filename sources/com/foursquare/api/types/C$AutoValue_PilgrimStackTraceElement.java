package com.foursquare.api.types;

import android.support.annotation.Nullable;

/* renamed from: com.foursquare.api.types.$AutoValue_PilgrimStackTraceElement */
abstract class C$AutoValue_PilgrimStackTraceElement extends PilgrimStackTraceElement {
    private final String className;
    private final String fileName;
    private final int lineno;
    private final String method;

    static final class Builder implements Builder {
        private String className;
        private String fileName;
        private Integer lineno;
        private String method;

        Builder() {
        }

        public Builder className(@Nullable String str) {
            this.className = str;
            return this;
        }

        public Builder method(@Nullable String str) {
            this.method = str;
            return this;
        }

        public Builder fileName(@Nullable String str) {
            this.fileName = str;
            return this;
        }

        public Builder lineno(int i) {
            this.lineno = Integer.valueOf(i);
            return this;
        }

        public PilgrimStackTraceElement build() {
            String str = "";
            if (this.lineno == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" lineno");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_PilgrimStackTraceElement(this.className, this.method, this.fileName, this.lineno.intValue());
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    C$AutoValue_PilgrimStackTraceElement(@Nullable String str, @Nullable String str2, @Nullable String str3, int i) {
        this.className = str;
        this.method = str2;
        this.fileName = str3;
        this.lineno = i;
    }

    @Nullable
    public String className() {
        return this.className;
    }

    @Nullable
    public String method() {
        return this.method;
    }

    @Nullable
    public String fileName() {
        return this.fileName;
    }

    public int lineno() {
        return this.lineno;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PilgrimStackTraceElement{className=");
        stringBuilder.append(this.className);
        stringBuilder.append(", method=");
        stringBuilder.append(this.method);
        stringBuilder.append(", fileName=");
        stringBuilder.append(this.fileName);
        stringBuilder.append(", lineno=");
        stringBuilder.append(this.lineno);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r5 != r4) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.foursquare.api.types.PilgrimStackTraceElement;
        r2 = 0;
        if (r1 == 0) goto L_0x005b;
    L_0x0009:
        r5 = (com.foursquare.api.types.PilgrimStackTraceElement) r5;
        r1 = r4.className;
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r1 = r5.className();
        if (r1 != 0) goto L_0x0059;
    L_0x0015:
        goto L_0x0022;
    L_0x0016:
        r1 = r4.className;
        r3 = r5.className();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0059;
    L_0x0022:
        r1 = r4.method;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = r5.method();
        if (r1 != 0) goto L_0x0059;
    L_0x002c:
        goto L_0x0039;
    L_0x002d:
        r1 = r4.method;
        r3 = r5.method();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0059;
    L_0x0039:
        r1 = r4.fileName;
        if (r1 != 0) goto L_0x0044;
    L_0x003d:
        r1 = r5.fileName();
        if (r1 != 0) goto L_0x0059;
    L_0x0043:
        goto L_0x0050;
    L_0x0044:
        r1 = r4.fileName;
        r3 = r5.fileName();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0059;
    L_0x0050:
        r1 = r4.lineno;
        r5 = r5.lineno();
        if (r1 != r5) goto L_0x0059;
    L_0x0058:
        goto L_0x005a;
    L_0x0059:
        r0 = 0;
    L_0x005a:
        return r0;
    L_0x005b:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.foursquare.api.types.$AutoValue_PilgrimStackTraceElement.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.className == null ? 0 : this.className.hashCode()) ^ 1000003) * 1000003) ^ (this.method == null ? 0 : this.method.hashCode())) * 1000003;
        if (this.fileName != null) {
            i = this.fileName.hashCode();
        }
        return ((hashCode ^ i) * 1000003) ^ this.lineno;
    }
}
