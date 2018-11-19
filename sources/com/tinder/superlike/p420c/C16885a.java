package com.tinder.superlike.p420c;

/* renamed from: com.tinder.superlike.c.a */
final class C16885a extends C15073b {
    /* renamed from: a */
    private final boolean f52037a;

    C16885a(boolean z) {
        this.f52037a = z;
    }

    /* renamed from: a */
    public boolean mo12481a() {
        return this.f52037a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SuperlikeConfig{featureEnabled=");
        stringBuilder.append(this.f52037a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15073b)) {
            return false;
        }
        if (this.f52037a != ((C15073b) obj).mo12481a()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (this.f52037a ? 1231 : 1237) ^ 1000003;
    }
}
