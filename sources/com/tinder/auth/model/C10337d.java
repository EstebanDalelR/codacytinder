package com.tinder.auth.model;

/* renamed from: com.tinder.auth.model.d */
final class C10337d extends C8289c {
    /* renamed from: a */
    private final boolean f33757a;

    C10337d(boolean z) {
        this.f33757a = z;
    }

    /* renamed from: a */
    public boolean mo9233a() {
        return this.f33757a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AuthSession{hasUserPreviouslyLoggedIn=");
        stringBuilder.append(this.f33757a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8289c)) {
            return false;
        }
        if (this.f33757a != ((C8289c) obj).mo9233a()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.f33757a ? 1231 : 1237) ^ 1000003;
    }
}
