package com.tinder.match.viewmodel;

import android.support.annotation.NonNull;
import com.tinder.match.viewmodel.NewMatchListItem.C9884a;
import com.tinder.match.viewmodel.NewMatchListItem.Type;
import java8.util.Optional;

/* renamed from: com.tinder.match.viewmodel.c */
final class C12097c extends NewMatchListItem {
    /* renamed from: a */
    private final Optional<C12102k> f39251a;
    /* renamed from: b */
    private final Type f39252b;

    /* renamed from: com.tinder.match.viewmodel.c$a */
    static final class C12096a extends C9884a {
        /* renamed from: a */
        private Optional<C12102k> f39249a;
        /* renamed from: b */
        private Type f39250b;

        C12096a() {
        }

        /* renamed from: a */
        public C9884a mo10604a(Optional<C12102k> optional) {
            this.f39249a = optional;
            return this;
        }

        /* renamed from: a */
        public C9884a mo10603a(Type type) {
            this.f39250b = type;
            return this;
        }

        /* renamed from: a */
        public NewMatchListItem mo10605a() {
            String str = "";
            if (this.f39249a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" newMatchViewModel");
                str = stringBuilder.toString();
            }
            if (this.f39250b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(" type");
                str = stringBuilder.toString();
            }
            if (str.isEmpty()) {
                return new C12097c(this.f39249a, this.f39250b);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Missing required properties:");
            stringBuilder2.append(str);
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    private C12097c(Optional<C12102k> optional, Type type) {
        this.f39251a = optional;
        this.f39252b = type;
    }

    @NonNull
    /* renamed from: a */
    public Optional<C12102k> mo10606a() {
        return this.f39251a;
    }

    @NonNull
    /* renamed from: b */
    public Type mo10607b() {
        return this.f39252b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NewMatchListItem{newMatchViewModel=");
        stringBuilder.append(this.f39251a);
        stringBuilder.append(", type=");
        stringBuilder.append(this.f39252b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewMatchListItem)) {
            return false;
        }
        NewMatchListItem newMatchListItem = (NewMatchListItem) obj;
        if (!this.f39251a.equals(newMatchListItem.mo10606a()) || this.f39252b.equals(newMatchListItem.mo10607b()) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.f39251a.hashCode() ^ 1000003) * 1000003) ^ this.f39252b.hashCode();
    }
}
