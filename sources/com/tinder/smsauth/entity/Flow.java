package com.tinder.smsauth.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.C15823e;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0007"}, d2 = {"Lcom/tinder/smsauth/entity/Flow;", "", "()V", "Error", "Event", "SideEffect", "State", "entity"}, k = 1, mv = {1, 1, 10})
public final class Flow {

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\f\r\u000e\u000f\u0010B\u001f\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0001\u0005\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$Error;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "internalMessage", "", "original", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "getInternalMessage", "()Ljava/lang/String;", "getOriginal", "()Ljava/lang/Throwable;", "ConnectivityIssue", "OneTimePasswordVerifiedAsInvalid", "PhoneNumberVerifiedAsInvalid", "TooManyRequests", "Unexpected", "Lcom/tinder/smsauth/entity/Flow$Error$PhoneNumberVerifiedAsInvalid;", "Lcom/tinder/smsauth/entity/Flow$Error$OneTimePasswordVerifiedAsInvalid;", "Lcom/tinder/smsauth/entity/Flow$Error$ConnectivityIssue;", "Lcom/tinder/smsauth/entity/Flow$Error$TooManyRequests;", "Lcom/tinder/smsauth/entity/Flow$Error$Unexpected;", "entity"}, k = 1, mv = {1, 1, 10})
    public static abstract class Error extends RuntimeException {
        @Nullable
        /* renamed from: a */
        private final String f46737a;
        @Nullable
        /* renamed from: b */
        private final Throwable f46738b;

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$Error$OneTimePasswordVerifiedAsInvalid;", "Lcom/tinder/smsauth/entity/Flow$Error;", "()V", "entity"}, k = 1, mv = {1, 1, 10})
        public static final class OneTimePasswordVerifiedAsInvalid extends Error {
            /* renamed from: a */
            public static final OneTimePasswordVerifiedAsInvalid f51713a = new OneTimePasswordVerifiedAsInvalid();

            private OneTimePasswordVerifiedAsInvalid() {
                super("Invalid request: Sms code invalid", null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$Error$TooManyRequests;", "Lcom/tinder/smsauth/entity/Flow$Error;", "()V", "entity"}, k = 1, mv = {1, 1, 10})
        public static final class TooManyRequests extends Error {
            /* renamed from: a */
            public static final TooManyRequests f51714a = new TooManyRequests();

            private TooManyRequests() {
                super("Rate limited.", null, 2, null);
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$Error$Unexpected;", "Lcom/tinder/smsauth/entity/Flow$Error;", "code", "", "message", "(Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "entity"}, k = 1, mv = {1, 1, 10})
        public static final class Unexpected extends Error {
            @Nullable
            /* renamed from: a */
            private final String f51715a;
            @NotNull
            /* renamed from: b */
            private final String f51716b;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Unexpected) {
                        Unexpected unexpected = (Unexpected) obj;
                        if (C2668g.a(this.f51715a, unexpected.f51715a) && C2668g.a(getMessage(), unexpected.getMessage())) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                String str = this.f51715a;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String message = getMessage();
                if (message != null) {
                    i = message.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected(code=");
                stringBuilder.append(this.f51715a);
                stringBuilder.append(", message=");
                stringBuilder.append(getMessage());
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            @Nullable
            /* renamed from: a */
            public final String m62234a() {
                return this.f51715a;
            }

            @NotNull
            public String getMessage() {
                return this.f51716b;
            }

            public Unexpected(@Nullable String str, @NotNull String str2) {
                C2668g.b(str2, "message");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(str2);
                stringBuilder.append("\nError code: ");
                stringBuilder.append(str);
                stringBuilder.append('.');
                super(stringBuilder.toString(), null, 2, null);
                this.f51715a = str;
                this.f51716b = str2;
            }
        }

        /* synthetic */ Error(String str, Throwable th, int i, C15823e c15823e) {
            if ((i & 1) != null) {
                str = null;
            }
            if ((i & 2) != 0) {
                th = null;
            }
            this(str, th);
        }

        private Error(String str, Throwable th) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Internal message: ");
            stringBuilder.append(str);
            super(stringBuilder.toString());
            this.f46737a = str;
            this.f46738b = th;
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\f\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$Event;", "", "()V", "OnBackRequested", "OnCountryCodeChanged", "OnCountryCodeListRequested", "OnOneTimePasswordChanged", "OnOneTimePasswordRequestFailed", "OnOneTimePasswordRequestSucceeded", "OnOneTimePasswordResendRequested", "OnOneTimePasswordVerificationRequestFailed", "OnOneTimePasswordVerificationRequestSucceeded", "OnPhoneNumberChanged", "OnRetryRequested", "OnSubmissionRequested", "Lcom/tinder/smsauth/entity/Flow$Event$OnPhoneNumberChanged;", "Lcom/tinder/smsauth/entity/Flow$Event$OnOneTimePasswordChanged;", "Lcom/tinder/smsauth/entity/Flow$Event$OnCountryCodeChanged;", "Lcom/tinder/smsauth/entity/Flow$Event$OnCountryCodeListRequested;", "Lcom/tinder/smsauth/entity/Flow$Event$OnSubmissionRequested;", "Lcom/tinder/smsauth/entity/Flow$Event$OnBackRequested;", "Lcom/tinder/smsauth/entity/Flow$Event$OnOneTimePasswordResendRequested;", "Lcom/tinder/smsauth/entity/Flow$Event$OnRetryRequested;", "Lcom/tinder/smsauth/entity/Flow$Event$OnOneTimePasswordRequestSucceeded;", "Lcom/tinder/smsauth/entity/Flow$Event$OnOneTimePasswordRequestFailed;", "Lcom/tinder/smsauth/entity/Flow$Event$OnOneTimePasswordVerificationRequestSucceeded;", "Lcom/tinder/smsauth/entity/Flow$Event$OnOneTimePasswordVerificationRequestFailed;", "entity"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.entity.Flow$a */
    public static abstract class C14972a {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$Event$OnBackRequested;", "Lcom/tinder/smsauth/entity/Flow$Event;", "()V", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$a$a */
        public static final class C16725a extends C14972a {
            /* renamed from: a */
            public static final C16725a f51717a = new C16725a();

            private C16725a() {
                super();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$Event$OnCountryCodeChanged;", "Lcom/tinder/smsauth/entity/Flow$Event;", "regionCode", "", "(Ljava/lang/String;)V", "getRegionCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$a$b */
        public static final class C16726b extends C14972a {
            @NotNull
            /* renamed from: a */
            private final String f51718a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C16726b) {
                        if (C2668g.a(this.f51718a, ((C16726b) obj).f51718a)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                String str = this.f51718a;
                return str != null ? str.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("OnCountryCodeChanged(regionCode=");
                stringBuilder.append(this.f51718a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C16726b(@NotNull String str) {
                C2668g.b(str, "regionCode");
                super();
                this.f51718a = str;
            }

            @NotNull
            /* renamed from: a */
            public final String m62235a() {
                return this.f51718a;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$Event$OnCountryCodeListRequested;", "Lcom/tinder/smsauth/entity/Flow$Event;", "()V", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$a$c */
        public static final class C16727c extends C14972a {
            /* renamed from: a */
            public static final C16727c f51719a = new C16727c();

            private C16727c() {
                super();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$Event$OnOneTimePasswordChanged;", "Lcom/tinder/smsauth/entity/Flow$Event;", "value", "", "wasAutoPopulated", "", "(Ljava/lang/String;Z)V", "getValue", "()Ljava/lang/String;", "getWasAutoPopulated", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$a$d */
        public static final class C16728d extends C14972a {
            @NotNull
            /* renamed from: a */
            private final String f51720a;
            /* renamed from: b */
            private final boolean f51721b;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C16728d) {
                    C16728d c16728d = (C16728d) obj;
                    if (C2668g.a(this.f51720a, c16728d.f51720a)) {
                        if ((this.f51721b == c16728d.f51721b ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                String str = this.f51720a;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                int i = this.f51721b;
                if (i != 0) {
                    i = 1;
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("OnOneTimePasswordChanged(value=");
                stringBuilder.append(this.f51720a);
                stringBuilder.append(", wasAutoPopulated=");
                stringBuilder.append(this.f51721b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C16728d(@NotNull String str, boolean z) {
                C2668g.b(str, "value");
                super();
                this.f51720a = str;
                this.f51721b = z;
            }

            @NotNull
            /* renamed from: a */
            public final String m62236a() {
                return this.f51720a;
            }

            /* renamed from: b */
            public final boolean m62237b() {
                return this.f51721b;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$Event$OnOneTimePasswordRequestFailed;", "Lcom/tinder/smsauth/entity/Flow$Event;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$a$e */
        public static final class C16729e extends C14972a {
            @NotNull
            /* renamed from: a */
            private final Throwable f51722a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C16729e) {
                        if (C2668g.a(this.f51722a, ((C16729e) obj).f51722a)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                Throwable th = this.f51722a;
                return th != null ? th.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("OnOneTimePasswordRequestFailed(error=");
                stringBuilder.append(this.f51722a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C16729e(@NotNull Throwable th) {
                C2668g.b(th, "error");
                super();
                this.f51722a = th;
            }

            @NotNull
            /* renamed from: a */
            public final Throwable m62238a() {
                return this.f51722a;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$Event$OnOneTimePasswordRequestSucceeded;", "Lcom/tinder/smsauth/entity/Flow$Event;", "oneTimePasswordInfo", "Lcom/tinder/smsauth/entity/OneTimePasswordInfo;", "(Lcom/tinder/smsauth/entity/OneTimePasswordInfo;)V", "getOneTimePasswordInfo", "()Lcom/tinder/smsauth/entity/OneTimePasswordInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$a$f */
        public static final class C16730f extends C14972a {
            @NotNull
            /* renamed from: a */
            private final C14977f f51723a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C16730f) {
                        if (C2668g.a(this.f51723a, ((C16730f) obj).f51723a)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C14977f c14977f = this.f51723a;
                return c14977f != null ? c14977f.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("OnOneTimePasswordRequestSucceeded(oneTimePasswordInfo=");
                stringBuilder.append(this.f51723a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C16730f(@NotNull C14977f c14977f) {
                C2668g.b(c14977f, "oneTimePasswordInfo");
                super();
                this.f51723a = c14977f;
            }

            @NotNull
            /* renamed from: a */
            public final C14977f m62239a() {
                return this.f51723a;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$Event$OnOneTimePasswordResendRequested;", "Lcom/tinder/smsauth/entity/Flow$Event;", "()V", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$a$g */
        public static final class C16731g extends C14972a {
            /* renamed from: a */
            public static final C16731g f51724a = new C16731g();

            private C16731g() {
                super();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$Event$OnOneTimePasswordVerificationRequestFailed;", "Lcom/tinder/smsauth/entity/Flow$Event;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$a$h */
        public static final class C16732h extends C14972a {
            @NotNull
            /* renamed from: a */
            private final Throwable f51725a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C16732h) {
                        if (C2668g.a(this.f51725a, ((C16732h) obj).f51725a)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                Throwable th = this.f51725a;
                return th != null ? th.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("OnOneTimePasswordVerificationRequestFailed(error=");
                stringBuilder.append(this.f51725a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C16732h(@NotNull Throwable th) {
                C2668g.b(th, "error");
                super();
                this.f51725a = th;
            }

            @NotNull
            /* renamed from: a */
            public final Throwable m62240a() {
                return this.f51725a;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$Event$OnOneTimePasswordVerificationRequestSucceeded;", "Lcom/tinder/smsauth/entity/Flow$Event;", "loginCredentials", "Lcom/tinder/smsauth/entity/LoginCredentials;", "(Lcom/tinder/smsauth/entity/LoginCredentials;)V", "getLoginCredentials", "()Lcom/tinder/smsauth/entity/LoginCredentials;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$a$i */
        public static final class C16733i extends C14972a {
            @NotNull
            /* renamed from: a */
            private final C14976d f51726a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C16733i) {
                        if (C2668g.a(this.f51726a, ((C16733i) obj).f51726a)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C14976d c14976d = this.f51726a;
                return c14976d != null ? c14976d.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("OnOneTimePasswordVerificationRequestSucceeded(loginCredentials=");
                stringBuilder.append(this.f51726a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C16733i(@NotNull C14976d c14976d) {
                C2668g.b(c14976d, "loginCredentials");
                super();
                this.f51726a = c14976d;
            }

            @NotNull
            /* renamed from: a */
            public final C14976d m62241a() {
                return this.f51726a;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$Event$OnPhoneNumberChanged;", "Lcom/tinder/smsauth/entity/Flow$Event;", "value", "", "wasAutoPopulated", "", "(Ljava/lang/String;Z)V", "getValue", "()Ljava/lang/String;", "getWasAutoPopulated", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$a$j */
        public static final class C16734j extends C14972a {
            @NotNull
            /* renamed from: a */
            private final String f51727a;
            /* renamed from: b */
            private final boolean f51728b;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C16734j) {
                    C16734j c16734j = (C16734j) obj;
                    if (C2668g.a(this.f51727a, c16734j.f51727a)) {
                        if ((this.f51728b == c16734j.f51728b ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public int hashCode() {
                String str = this.f51727a;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                int i = this.f51728b;
                if (i != 0) {
                    i = 1;
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("OnPhoneNumberChanged(value=");
                stringBuilder.append(this.f51727a);
                stringBuilder.append(", wasAutoPopulated=");
                stringBuilder.append(this.f51728b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public C16734j(@NotNull String str, boolean z) {
                C2668g.b(str, "value");
                super();
                this.f51727a = str;
                this.f51728b = z;
            }

            @NotNull
            /* renamed from: a */
            public final String m62242a() {
                return this.f51727a;
            }

            /* renamed from: b */
            public final boolean m62243b() {
                return this.f51728b;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$Event$OnRetryRequested;", "Lcom/tinder/smsauth/entity/Flow$Event;", "()V", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$a$k */
        public static final class C16735k extends C14972a {
            /* renamed from: a */
            public static final C16735k f51729a = new C16735k();

            private C16735k() {
                super();
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$Event$OnSubmissionRequested;", "Lcom/tinder/smsauth/entity/Flow$Event;", "()V", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$a$l */
        public static final class C16736l extends C14972a {
            /* renamed from: a */
            public static final C16736l f51730a = new C16736l();

            private C16736l() {
                super();
            }
        }

        private C14972a() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$SideEffect;", "", "()V", "RequestOneTimePassword", "VerifyOneTimePassword", "Lcom/tinder/smsauth/entity/Flow$SideEffect$RequestOneTimePassword;", "Lcom/tinder/smsauth/entity/Flow$SideEffect$VerifyOneTimePassword;", "entity"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.entity.Flow$b */
    public static abstract class C14973b {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$SideEffect$RequestOneTimePassword;", "Lcom/tinder/smsauth/entity/Flow$SideEffect;", "phoneNumber", "Lcom/tinder/smsauth/entity/PhoneNumber;", "(Lcom/tinder/smsauth/entity/PhoneNumber;)V", "getPhoneNumber", "()Lcom/tinder/smsauth/entity/PhoneNumber;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$b$a */
        public static final class C16737a extends C14973b {
            @NotNull
            /* renamed from: a */
            private final C14980h f51731a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C16737a) {
                        if (C2668g.a(this.f51731a, ((C16737a) obj).f51731a)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C14980h c14980h = this.f51731a;
                return c14980h != null ? c14980h.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("RequestOneTimePassword(phoneNumber=");
                stringBuilder.append(this.f51731a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            @NotNull
            /* renamed from: a */
            public final C14980h m62244a() {
                return this.f51731a;
            }

            public C16737a(@NotNull C14980h c14980h) {
                C2668g.b(c14980h, "phoneNumber");
                super();
                this.f51731a = c14980h;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$SideEffect$VerifyOneTimePassword;", "Lcom/tinder/smsauth/entity/Flow$SideEffect;", "phoneNumber", "Lcom/tinder/smsauth/entity/PhoneNumber;", "oneTimePassword", "", "(Lcom/tinder/smsauth/entity/PhoneNumber;Ljava/lang/String;)V", "getOneTimePassword", "()Ljava/lang/String;", "getPhoneNumber", "()Lcom/tinder/smsauth/entity/PhoneNumber;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$b$b */
        public static final class C16738b extends C14973b {
            @NotNull
            /* renamed from: a */
            private final C14980h f51732a;
            @NotNull
            /* renamed from: b */
            private final String f51733b;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C16738b) {
                        C16738b c16738b = (C16738b) obj;
                        if (C2668g.a(this.f51732a, c16738b.f51732a) && C2668g.a(this.f51733b, c16738b.f51733b)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C14980h c14980h = this.f51732a;
                int i = 0;
                int hashCode = (c14980h != null ? c14980h.hashCode() : 0) * 31;
                String str = this.f51733b;
                if (str != null) {
                    i = str.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("VerifyOneTimePassword(phoneNumber=");
                stringBuilder.append(this.f51732a);
                stringBuilder.append(", oneTimePassword=");
                stringBuilder.append(this.f51733b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            @NotNull
            /* renamed from: a */
            public final C14980h m62245a() {
                return this.f51732a;
            }

            @NotNull
            /* renamed from: b */
            public final String m62246b() {
                return this.f51733b;
            }

            public C16738b(@NotNull C14980h c14980h, @NotNull String str) {
                C2668g.b(c14980h, "phoneNumber");
                C2668g.b(str, "oneTimePassword");
                super();
                this.f51732a = c14980h;
                this.f51733b = str;
            }
        }

        private C14973b() {
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0007\b\t\n\u000b\f\r\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$State;", "", "()V", "phoneNumberStatus", "Lcom/tinder/smsauth/entity/PhoneNumberStatus;", "getPhoneNumberStatus", "()Lcom/tinder/smsauth/entity/PhoneNumberStatus;", "CollectingOneTimePassword", "CollectingPhoneNumber", "FailedToRequestOneTimePassword", "LoginSuccessful", "RequestingOneTimePassword", "SelectingCountryCode", "UnableToVerifyOneTimePassword", "VerifyingOneTimePassword", "Lcom/tinder/smsauth/entity/Flow$State$CollectingPhoneNumber;", "Lcom/tinder/smsauth/entity/Flow$State$SelectingCountryCode;", "Lcom/tinder/smsauth/entity/Flow$State$RequestingOneTimePassword;", "Lcom/tinder/smsauth/entity/Flow$State$FailedToRequestOneTimePassword;", "Lcom/tinder/smsauth/entity/Flow$State$CollectingOneTimePassword;", "Lcom/tinder/smsauth/entity/Flow$State$VerifyingOneTimePassword;", "Lcom/tinder/smsauth/entity/Flow$State$UnableToVerifyOneTimePassword;", "Lcom/tinder/smsauth/entity/Flow$State$LoginSuccessful;", "entity"}, k = 1, mv = {1, 1, 10})
    /* renamed from: com.tinder.smsauth.entity.Flow$c */
    public static abstract class C14974c {

        @Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$State$CollectingOneTimePassword;", "Lcom/tinder/smsauth/entity/Flow$State;", "phoneNumberStatus", "Lcom/tinder/smsauth/entity/PhoneNumberStatus;", "oneTimePasswordStatus", "Lcom/tinder/smsauth/entity/OneTimePasswordStatus;", "error", "", "(Lcom/tinder/smsauth/entity/PhoneNumberStatus;Lcom/tinder/smsauth/entity/OneTimePasswordStatus;Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "getOneTimePasswordStatus", "()Lcom/tinder/smsauth/entity/OneTimePasswordStatus;", "getPhoneNumberStatus", "()Lcom/tinder/smsauth/entity/PhoneNumberStatus;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$c$a */
        public static final class C16739a extends C14974c {
            @NotNull
            /* renamed from: a */
            private final C14981i f51734a;
            @NotNull
            /* renamed from: b */
            private final C14978g f51735b;
            @Nullable
            /* renamed from: c */
            private final Throwable f51736c;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C16739a) {
                        C16739a c16739a = (C16739a) obj;
                        if (C2668g.a(mo12366a(), c16739a.mo12366a()) && C2668g.a(this.f51735b, c16739a.f51735b) && C2668g.a(this.f51736c, c16739a.f51736c)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C14981i a = mo12366a();
                int i = 0;
                int hashCode = (a != null ? a.hashCode() : 0) * 31;
                C14978g c14978g = this.f51735b;
                hashCode = (hashCode + (c14978g != null ? c14978g.hashCode() : 0)) * 31;
                Throwable th = this.f51736c;
                if (th != null) {
                    i = th.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("CollectingOneTimePassword(phoneNumberStatus=");
                stringBuilder.append(mo12366a());
                stringBuilder.append(", oneTimePasswordStatus=");
                stringBuilder.append(this.f51735b);
                stringBuilder.append(", error=");
                stringBuilder.append(this.f51736c);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            @NotNull
            /* renamed from: a */
            public C14981i mo12366a() {
                return this.f51734a;
            }

            @NotNull
            /* renamed from: b */
            public final C14978g m62248b() {
                return this.f51735b;
            }

            public /* synthetic */ C16739a(C14981i c14981i, C14978g c14978g, Throwable th, int i, C15823e c15823e) {
                if ((i & 4) != 0) {
                    th = null;
                }
                this(c14981i, c14978g, th);
            }

            @Nullable
            /* renamed from: c */
            public final Throwable m62249c() {
                return this.f51736c;
            }

            public C16739a(@NotNull C14981i c14981i, @NotNull C14978g c14978g, @Nullable Throwable th) {
                C2668g.b(c14981i, "phoneNumberStatus");
                C2668g.b(c14978g, "oneTimePasswordStatus");
                super();
                this.f51734a = c14981i;
                this.f51735b = c14978g;
                this.f51736c = th;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$State$CollectingPhoneNumber;", "Lcom/tinder/smsauth/entity/Flow$State;", "phoneNumberStatus", "Lcom/tinder/smsauth/entity/PhoneNumberStatus;", "(Lcom/tinder/smsauth/entity/PhoneNumberStatus;)V", "getPhoneNumberStatus", "()Lcom/tinder/smsauth/entity/PhoneNumberStatus;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$c$b */
        public static final class C16740b extends C14974c {
            @NotNull
            /* renamed from: a */
            private final C14981i f51737a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C16740b) {
                        if (C2668g.a(mo12366a(), ((C16740b) obj).mo12366a())) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C14981i a = mo12366a();
                return a != null ? a.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("CollectingPhoneNumber(phoneNumberStatus=");
                stringBuilder.append(mo12366a());
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            @NotNull
            /* renamed from: a */
            public C14981i mo12366a() {
                return this.f51737a;
            }

            public C16740b(@NotNull C14981i c14981i) {
                C2668g.b(c14981i, "phoneNumberStatus");
                super();
                this.f51737a = c14981i;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$State$FailedToRequestOneTimePassword;", "Lcom/tinder/smsauth/entity/Flow$State;", "phoneNumberStatus", "Lcom/tinder/smsauth/entity/PhoneNumberStatus;", "error", "", "(Lcom/tinder/smsauth/entity/PhoneNumberStatus;Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "getPhoneNumberStatus", "()Lcom/tinder/smsauth/entity/PhoneNumberStatus;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$c$c */
        public static final class C16741c extends C14974c {
            @NotNull
            /* renamed from: a */
            private final C14981i f51738a;
            @NotNull
            /* renamed from: b */
            private final Throwable f51739b;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C16741c) {
                        C16741c c16741c = (C16741c) obj;
                        if (C2668g.a(mo12366a(), c16741c.mo12366a()) && C2668g.a(this.f51739b, c16741c.f51739b)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C14981i a = mo12366a();
                int i = 0;
                int hashCode = (a != null ? a.hashCode() : 0) * 31;
                Throwable th = this.f51739b;
                if (th != null) {
                    i = th.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("FailedToRequestOneTimePassword(phoneNumberStatus=");
                stringBuilder.append(mo12366a());
                stringBuilder.append(", error=");
                stringBuilder.append(this.f51739b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            @NotNull
            /* renamed from: a */
            public C14981i mo12366a() {
                return this.f51738a;
            }

            @NotNull
            /* renamed from: b */
            public final Throwable m62252b() {
                return this.f51739b;
            }

            public C16741c(@NotNull C14981i c14981i, @NotNull Throwable th) {
                C2668g.b(c14981i, "phoneNumberStatus");
                C2668g.b(th, "error");
                super();
                this.f51738a = c14981i;
                this.f51739b = th;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$State$LoginSuccessful;", "Lcom/tinder/smsauth/entity/Flow$State;", "phoneNumberStatus", "Lcom/tinder/smsauth/entity/PhoneNumberStatus;", "oneTimePasswordStatus", "Lcom/tinder/smsauth/entity/OneTimePasswordStatus;", "loginCredentials", "Lcom/tinder/smsauth/entity/LoginCredentials;", "(Lcom/tinder/smsauth/entity/PhoneNumberStatus;Lcom/tinder/smsauth/entity/OneTimePasswordStatus;Lcom/tinder/smsauth/entity/LoginCredentials;)V", "getLoginCredentials", "()Lcom/tinder/smsauth/entity/LoginCredentials;", "getOneTimePasswordStatus", "()Lcom/tinder/smsauth/entity/OneTimePasswordStatus;", "getPhoneNumberStatus", "()Lcom/tinder/smsauth/entity/PhoneNumberStatus;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$c$d */
        public static final class C16742d extends C14974c {
            @NotNull
            /* renamed from: a */
            private final C14981i f51740a;
            @NotNull
            /* renamed from: b */
            private final C14978g f51741b;
            @NotNull
            /* renamed from: c */
            private final C14976d f51742c;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C16742d) {
                        C16742d c16742d = (C16742d) obj;
                        if (C2668g.a(mo12366a(), c16742d.mo12366a()) && C2668g.a(this.f51741b, c16742d.f51741b) && C2668g.a(this.f51742c, c16742d.f51742c)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C14981i a = mo12366a();
                int i = 0;
                int hashCode = (a != null ? a.hashCode() : 0) * 31;
                C14978g c14978g = this.f51741b;
                hashCode = (hashCode + (c14978g != null ? c14978g.hashCode() : 0)) * 31;
                C14976d c14976d = this.f51742c;
                if (c14976d != null) {
                    i = c14976d.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("LoginSuccessful(phoneNumberStatus=");
                stringBuilder.append(mo12366a());
                stringBuilder.append(", oneTimePasswordStatus=");
                stringBuilder.append(this.f51741b);
                stringBuilder.append(", loginCredentials=");
                stringBuilder.append(this.f51742c);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            @NotNull
            /* renamed from: a */
            public C14981i mo12366a() {
                return this.f51740a;
            }

            @NotNull
            /* renamed from: b */
            public final C14976d m62254b() {
                return this.f51742c;
            }

            public C16742d(@NotNull C14981i c14981i, @NotNull C14978g c14978g, @NotNull C14976d c14976d) {
                C2668g.b(c14981i, "phoneNumberStatus");
                C2668g.b(c14978g, "oneTimePasswordStatus");
                C2668g.b(c14976d, "loginCredentials");
                super();
                this.f51740a = c14981i;
                this.f51741b = c14978g;
                this.f51742c = c14976d;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$State$RequestingOneTimePassword;", "Lcom/tinder/smsauth/entity/Flow$State;", "phoneNumberStatus", "Lcom/tinder/smsauth/entity/PhoneNumberStatus;", "(Lcom/tinder/smsauth/entity/PhoneNumberStatus;)V", "getPhoneNumberStatus", "()Lcom/tinder/smsauth/entity/PhoneNumberStatus;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$c$e */
        public static final class C16743e extends C14974c {
            @NotNull
            /* renamed from: a */
            private final C14981i f51743a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C16743e) {
                        if (C2668g.a(mo12366a(), ((C16743e) obj).mo12366a())) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C14981i a = mo12366a();
                return a != null ? a.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("RequestingOneTimePassword(phoneNumberStatus=");
                stringBuilder.append(mo12366a());
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            @NotNull
            /* renamed from: a */
            public C14981i mo12366a() {
                return this.f51743a;
            }

            public C16743e(@NotNull C14981i c14981i) {
                C2668g.b(c14981i, "phoneNumberStatus");
                super();
                this.f51743a = c14981i;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$State$SelectingCountryCode;", "Lcom/tinder/smsauth/entity/Flow$State;", "phoneNumberStatus", "Lcom/tinder/smsauth/entity/PhoneNumberStatus;", "(Lcom/tinder/smsauth/entity/PhoneNumberStatus;)V", "getPhoneNumberStatus", "()Lcom/tinder/smsauth/entity/PhoneNumberStatus;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$c$f */
        public static final class C16744f extends C14974c {
            @NotNull
            /* renamed from: a */
            private final C14981i f51744a;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C16744f) {
                        if (C2668g.a(mo12366a(), ((C16744f) obj).mo12366a())) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C14981i a = mo12366a();
                return a != null ? a.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SelectingCountryCode(phoneNumberStatus=");
                stringBuilder.append(mo12366a());
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            @NotNull
            /* renamed from: a */
            public C14981i mo12366a() {
                return this.f51744a;
            }

            public C16744f(@NotNull C14981i c14981i) {
                C2668g.b(c14981i, "phoneNumberStatus");
                super();
                this.f51744a = c14981i;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$State$UnableToVerifyOneTimePassword;", "Lcom/tinder/smsauth/entity/Flow$State;", "phoneNumberStatus", "Lcom/tinder/smsauth/entity/PhoneNumberStatus;", "oneTimePasswordStatus", "Lcom/tinder/smsauth/entity/OneTimePasswordStatus;", "error", "", "(Lcom/tinder/smsauth/entity/PhoneNumberStatus;Lcom/tinder/smsauth/entity/OneTimePasswordStatus;Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "getOneTimePasswordStatus", "()Lcom/tinder/smsauth/entity/OneTimePasswordStatus;", "getPhoneNumberStatus", "()Lcom/tinder/smsauth/entity/PhoneNumberStatus;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$c$g */
        public static final class C16745g extends C14974c {
            @NotNull
            /* renamed from: a */
            private final C14981i f51745a;
            @NotNull
            /* renamed from: b */
            private final C14978g f51746b;
            @NotNull
            /* renamed from: c */
            private final Throwable f51747c;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C16745g) {
                        C16745g c16745g = (C16745g) obj;
                        if (C2668g.a(mo12366a(), c16745g.mo12366a()) && C2668g.a(this.f51746b, c16745g.f51746b) && C2668g.a(this.f51747c, c16745g.f51747c)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C14981i a = mo12366a();
                int i = 0;
                int hashCode = (a != null ? a.hashCode() : 0) * 31;
                C14978g c14978g = this.f51746b;
                hashCode = (hashCode + (c14978g != null ? c14978g.hashCode() : 0)) * 31;
                Throwable th = this.f51747c;
                if (th != null) {
                    i = th.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("UnableToVerifyOneTimePassword(phoneNumberStatus=");
                stringBuilder.append(mo12366a());
                stringBuilder.append(", oneTimePasswordStatus=");
                stringBuilder.append(this.f51746b);
                stringBuilder.append(", error=");
                stringBuilder.append(this.f51747c);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            @NotNull
            /* renamed from: a */
            public C14981i mo12366a() {
                return this.f51745a;
            }

            @NotNull
            /* renamed from: b */
            public final C14978g m62258b() {
                return this.f51746b;
            }

            @NotNull
            /* renamed from: c */
            public final Throwable m62259c() {
                return this.f51747c;
            }

            public C16745g(@NotNull C14981i c14981i, @NotNull C14978g c14978g, @NotNull Throwable th) {
                C2668g.b(c14981i, "phoneNumberStatus");
                C2668g.b(c14978g, "oneTimePasswordStatus");
                C2668g.b(th, "error");
                super();
                this.f51745a = c14981i;
                this.f51746b = c14978g;
                this.f51747c = th;
            }
        }

        @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/tinder/smsauth/entity/Flow$State$VerifyingOneTimePassword;", "Lcom/tinder/smsauth/entity/Flow$State;", "phoneNumberStatus", "Lcom/tinder/smsauth/entity/PhoneNumberStatus;", "oneTimePasswordStatus", "Lcom/tinder/smsauth/entity/OneTimePasswordStatus;", "(Lcom/tinder/smsauth/entity/PhoneNumberStatus;Lcom/tinder/smsauth/entity/OneTimePasswordStatus;)V", "getOneTimePasswordStatus", "()Lcom/tinder/smsauth/entity/OneTimePasswordStatus;", "getPhoneNumberStatus", "()Lcom/tinder/smsauth/entity/PhoneNumberStatus;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "entity"}, k = 1, mv = {1, 1, 10})
        /* renamed from: com.tinder.smsauth.entity.Flow$c$h */
        public static final class C16746h extends C14974c {
            @NotNull
            /* renamed from: a */
            private final C14981i f51748a;
            @NotNull
            /* renamed from: b */
            private final C14978g f51749b;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C16746h) {
                        C16746h c16746h = (C16746h) obj;
                        if (C2668g.a(mo12366a(), c16746h.mo12366a()) && C2668g.a(this.f51749b, c16746h.f51749b)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C14981i a = mo12366a();
                int i = 0;
                int hashCode = (a != null ? a.hashCode() : 0) * 31;
                C14978g c14978g = this.f51749b;
                if (c14978g != null) {
                    i = c14978g.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("VerifyingOneTimePassword(phoneNumberStatus=");
                stringBuilder.append(mo12366a());
                stringBuilder.append(", oneTimePasswordStatus=");
                stringBuilder.append(this.f51749b);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            @NotNull
            /* renamed from: a */
            public C14981i mo12366a() {
                return this.f51748a;
            }

            @NotNull
            /* renamed from: b */
            public final C14978g m62261b() {
                return this.f51749b;
            }

            public C16746h(@NotNull C14981i c14981i, @NotNull C14978g c14978g) {
                C2668g.b(c14981i, "phoneNumberStatus");
                C2668g.b(c14978g, "oneTimePasswordStatus");
                super();
                this.f51748a = c14981i;
                this.f51749b = c14978g;
            }
        }

        @NotNull
        /* renamed from: a */
        public abstract C14981i mo12366a();

        private C14974c() {
        }
    }
}
