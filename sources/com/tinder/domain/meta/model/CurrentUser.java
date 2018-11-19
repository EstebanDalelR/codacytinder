package com.tinder.domain.meta.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.common.p076a.C2640a;
import com.tinder.domain.common.model.Instagram;
import com.tinder.domain.common.model.User;
import com.tinder.domain.common.model.UserImpl;
import org.joda.time.DateTime;

public class CurrentUser extends UserDecorator {
    public static CurrentUser CURRENT_GUEST_USER = builder(UserImpl.GUEST, DateTime.a()).build();
    private final int connectionCount;
    @NonNull
    private final DateTime createDate;
    @Nullable
    private final Instagram instagram;
    private final boolean isVerified;
    @Nullable
    private final String phoneId;
    @Nullable
    private final String username;

    public static class Builder {
        private int connectionCount;
        @NonNull
        private final DateTime createDate;
        @Nullable
        private Instagram instagram;
        private boolean isVerified;
        @Nullable
        private String phoneId;
        @NonNull
        private final User userToBeDecorated;
        @Nullable
        private String username;

        public Builder(@NonNull User user, @NonNull DateTime dateTime) {
            this.userToBeDecorated = user;
            this.createDate = dateTime;
        }

        public Builder setConnectionCount(int i) {
            this.connectionCount = i;
            return this;
        }

        public Builder setInstagram(@Nullable Instagram instagram) {
            this.instagram = instagram;
            return this;
        }

        public Builder setIsVerified(boolean z) {
            this.isVerified = z;
            return this;
        }

        public Builder setPhoneId(@Nullable String str) {
            this.phoneId = str;
            return this;
        }

        public Builder setUsername(@Nullable String str) {
            this.username = str;
            return this;
        }

        public CurrentUser build() {
            C2640a.a(this.userToBeDecorated);
            C2640a.a(this.createDate);
            return new CurrentUser();
        }
    }

    private CurrentUser(Builder builder) {
        super(builder.userToBeDecorated);
        this.createDate = builder.createDate;
        this.connectionCount = builder.connectionCount;
        this.instagram = builder.instagram;
        this.isVerified = builder.isVerified;
        this.phoneId = builder.phoneId;
        this.username = builder.username;
    }

    @NonNull
    public DateTime createDate() {
        return this.createDate;
    }

    public int connectionCount() {
        return this.connectionCount;
    }

    @Nullable
    public Instagram instagram() {
        return this.instagram;
    }

    public boolean isVerified() {
        return this.isVerified;
    }

    @Nullable
    public String username() {
        return this.username;
    }

    @Nullable
    public String phoneId() {
        return this.phoneId;
    }

    public static Builder builder(User user, DateTime dateTime) {
        return new Builder(user, dateTime);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r5 instanceof com.tinder.domain.meta.model.CurrentUser;
        r2 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r2;
    L_0x000a:
        r5 = (com.tinder.domain.meta.model.CurrentUser) r5;
        r1 = r4.connectionCount;
        r3 = r5.connectionCount;
        if (r1 == r3) goto L_0x0013;
    L_0x0012:
        return r2;
    L_0x0013:
        r1 = r4.isVerified;
        r3 = r5.isVerified;
        if (r1 == r3) goto L_0x001a;
    L_0x0019:
        return r2;
    L_0x001a:
        r1 = r4.createDate;
        r3 = r5.createDate;
        r1 = r1.equals(r3);
        if (r1 != 0) goto L_0x0025;
    L_0x0024:
        return r2;
    L_0x0025:
        r1 = r4.instagram;
        if (r1 == 0) goto L_0x0034;
    L_0x0029:
        r1 = r4.instagram;
        r3 = r5.instagram;
        r1 = r1.equals(r3);
        if (r1 != 0) goto L_0x0039;
    L_0x0033:
        goto L_0x0038;
    L_0x0034:
        r1 = r5.instagram;
        if (r1 == 0) goto L_0x0039;
    L_0x0038:
        return r2;
    L_0x0039:
        r1 = r4.phoneId;
        if (r1 == 0) goto L_0x0048;
    L_0x003d:
        r1 = r4.phoneId;
        r3 = r5.phoneId;
        r1 = r1.equals(r3);
        if (r1 != 0) goto L_0x004d;
    L_0x0047:
        goto L_0x004c;
    L_0x0048:
        r1 = r5.phoneId;
        if (r1 == 0) goto L_0x004d;
    L_0x004c:
        return r2;
    L_0x004d:
        r1 = r4.username;
        if (r1 == 0) goto L_0x005a;
    L_0x0051:
        r0 = r4.username;
        r5 = r5.username;
        r0 = r0.equals(r5);
        goto L_0x0060;
    L_0x005a:
        r5 = r5.username;
        if (r5 != 0) goto L_0x005f;
    L_0x005e:
        goto L_0x0060;
    L_0x005f:
        r0 = 0;
    L_0x0060:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.domain.meta.model.CurrentUser.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((this.createDate.hashCode() * 31) + (this.instagram != null ? this.instagram.hashCode() : 0)) * 31) + (this.phoneId != null ? this.phoneId.hashCode() : 0)) * 31;
        if (this.username != null) {
            i = this.username.hashCode();
        }
        return ((((hashCode + i) * 31) + this.connectionCount) * 31) + this.isVerified;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CurrentUser{createDate=");
        stringBuilder.append(this.createDate);
        stringBuilder.append(", instagram=");
        stringBuilder.append(this.instagram);
        stringBuilder.append(", phoneId='");
        stringBuilder.append(this.phoneId);
        stringBuilder.append('\'');
        stringBuilder.append(", username='");
        stringBuilder.append(this.username);
        stringBuilder.append('\'');
        stringBuilder.append(", connectionCount=");
        stringBuilder.append(this.connectionCount);
        stringBuilder.append(", isVerified=");
        stringBuilder.append(this.isVerified);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
