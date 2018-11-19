package com.tinder.profile.p366e;

import android.content.res.Resources;
import android.support.annotation.NonNull;
import com.tinder.R;
import com.tinder.domain.common.model.School;
import com.tinder.model.SchoolDisplayType;
import javax.inject.Inject;

/* renamed from: com.tinder.profile.e.f */
public class C14415f {
    /* renamed from: a */
    private School f45623a;
    /* renamed from: b */
    private SchoolDisplayType f45624b;
    /* renamed from: c */
    private boolean f45625c;
    /* renamed from: d */
    private String f45626d;
    /* renamed from: e */
    private String f45627e;

    /* renamed from: com.tinder.profile.e.f$a */
    public static class C14414a {
        /* renamed from: a */
        private final Resources f45622a;

        @Inject
        public C14414a(Resources resources) {
            this.f45622a = resources;
        }

        @NonNull
        /* renamed from: a */
        public C14415f m54875a(@NonNull School school) {
            C14415f c14415f = new C14415f();
            c14415f.f45624b = SchoolDisplayType.ID;
            c14415f.f45623a = school;
            c14415f.f45626d = school.name();
            c14415f.f45625c = school.displayed();
            c14415f.f45627e = school.id();
            return c14415f;
        }

        /* renamed from: a */
        public C14415f m54874a() {
            C14415f c14415f = new C14415f();
            c14415f.f45624b = SchoolDisplayType.NONE;
            c14415f.f45626d = this.f45622a.getString(R.string.none);
            return c14415f;
        }
    }

    @NonNull
    /* renamed from: a */
    public School m54881a() {
        return this.f45623a;
    }

    @NonNull
    /* renamed from: b */
    public SchoolDisplayType m54883b() {
        return this.f45624b;
    }

    @NonNull
    /* renamed from: c */
    public String m54884c() {
        return this.f45626d;
    }

    /* renamed from: d */
    public boolean m54885d() {
        return this.f45625c;
    }

    /* renamed from: a */
    public void m54882a(boolean z) {
        this.f45625c = z;
        if (this.f45624b == SchoolDisplayType.ID) {
            this.f45623a = this.f45623a.toBuilder().displayed(z).build();
        }
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                C14415f c14415f = (C14415f) obj;
                if (this.f45624b != c14415f.f45624b) {
                    return false;
                }
                if (this.f45626d != null) {
                    z = this.f45626d.equals(c14415f.f45626d);
                } else if (c14415f.f45626d != null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.f45624b != null ? this.f45624b.hashCode() : 0) * 31;
        if (this.f45626d != null) {
            i = this.f45626d.hashCode();
        }
        return hashCode + i;
    }
}
