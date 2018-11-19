package com.tinder.data.match;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.data.match.C8680y.C10804e;
import com.tinder.domain.common.model.Badge;
import com.tinder.domain.common.model.Gender;
import com.tinder.domain.common.model.Job;
import com.tinder.domain.common.model.Photo;
import com.tinder.domain.common.model.School;
import java.util.List;
import org.joda.time.DateTime;

/* renamed from: com.tinder.data.match.f */
final class C12916f extends C10804e {
    /* renamed from: a */
    private final String f41410a;
    /* renamed from: b */
    private final String f41411b;
    /* renamed from: c */
    private final String f41412c;
    /* renamed from: d */
    private final DateTime f41413d;
    /* renamed from: e */
    private final Gender f41414e;
    /* renamed from: f */
    private final List<Photo> f41415f;
    /* renamed from: g */
    private final List<Badge> f41416g;
    /* renamed from: h */
    private final List<Job> f41417h;
    /* renamed from: i */
    private final List<School> f41418i;

    C12916f(String str, String str2, @Nullable String str3, @Nullable DateTime dateTime, Gender gender, List<Photo> list, List<Badge> list2, List<Job> list3, List<School> list4) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f41410a = str;
        if (str2 == null) {
            throw new NullPointerException("Null name");
        }
        this.f41411b = str2;
        this.f41412c = str3;
        this.f41413d = dateTime;
        if (gender == null) {
            throw new NullPointerException("Null gender");
        }
        this.f41414e = gender;
        if (list == null) {
            throw new NullPointerException("Null photos");
        }
        this.f41415f = list;
        if (list2 == null) {
            throw new NullPointerException("Null badges");
        }
        this.f41416g = list2;
        if (list3 == null) {
            throw new NullPointerException("Null jobs");
        }
        this.f41417h = list3;
        if (list4 == null) {
            throw new NullPointerException("Null schools");
        }
        this.f41418i = list4;
    }

    @NonNull
    public String id() {
        return this.f41410a;
    }

    @NonNull
    public String name() {
        return this.f41411b;
    }

    @Nullable
    public String bio() {
        return this.f41412c;
    }

    @Nullable
    public DateTime birth_date() {
        return this.f41413d;
    }

    @NonNull
    public Gender gender() {
        return this.f41414e;
    }

    @NonNull
    public List<Photo> photos() {
        return this.f41415f;
    }

    @NonNull
    public List<Badge> badges() {
        return this.f41416g;
    }

    @NonNull
    public List<Job> jobs() {
        return this.f41417h;
    }

    @NonNull
    public List<School> schools() {
        return this.f41418i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MatchPerson{id=");
        stringBuilder.append(this.f41410a);
        stringBuilder.append(", name=");
        stringBuilder.append(this.f41411b);
        stringBuilder.append(", bio=");
        stringBuilder.append(this.f41412c);
        stringBuilder.append(", birth_date=");
        stringBuilder.append(this.f41413d);
        stringBuilder.append(", gender=");
        stringBuilder.append(this.f41414e);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.f41415f);
        stringBuilder.append(", badges=");
        stringBuilder.append(this.f41416g);
        stringBuilder.append(", jobs=");
        stringBuilder.append(this.f41417h);
        stringBuilder.append(", schools=");
        stringBuilder.append(this.f41418i);
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
        r1 = r5 instanceof com.tinder.data.match.C8680y.C10804e;
        r2 = 0;
        if (r1 == 0) goto L_0x0090;
    L_0x0009:
        r5 = (com.tinder.data.match.C8680y.C10804e) r5;
        r1 = r4.f41410a;
        r3 = r5.id();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008e;
    L_0x0017:
        r1 = r4.f41411b;
        r3 = r5.name();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008e;
    L_0x0023:
        r1 = r4.f41412c;
        if (r1 != 0) goto L_0x002e;
    L_0x0027:
        r1 = r5.bio();
        if (r1 != 0) goto L_0x008e;
    L_0x002d:
        goto L_0x003a;
    L_0x002e:
        r1 = r4.f41412c;
        r3 = r5.bio();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008e;
    L_0x003a:
        r1 = r4.f41413d;
        if (r1 != 0) goto L_0x0045;
    L_0x003e:
        r1 = r5.birth_date();
        if (r1 != 0) goto L_0x008e;
    L_0x0044:
        goto L_0x0051;
    L_0x0045:
        r1 = r4.f41413d;
        r3 = r5.birth_date();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008e;
    L_0x0051:
        r1 = r4.f41414e;
        r3 = r5.gender();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008e;
    L_0x005d:
        r1 = r4.f41415f;
        r3 = r5.photos();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008e;
    L_0x0069:
        r1 = r4.f41416g;
        r3 = r5.badges();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008e;
    L_0x0075:
        r1 = r4.f41417h;
        r3 = r5.jobs();
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x008e;
    L_0x0081:
        r1 = r4.f41418i;
        r5 = r5.schools();
        r5 = r1.equals(r5);
        if (r5 == 0) goto L_0x008e;
    L_0x008d:
        goto L_0x008f;
    L_0x008e:
        r0 = 0;
    L_0x008f:
        return r0;
    L_0x0090:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tinder.data.match.f.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (((((this.f41410a.hashCode() ^ 1000003) * 1000003) ^ this.f41411b.hashCode()) * 1000003) ^ (this.f41412c == null ? 0 : this.f41412c.hashCode())) * 1000003;
        if (this.f41413d != null) {
            i = this.f41413d.hashCode();
        }
        return ((((((((((hashCode ^ i) * 1000003) ^ this.f41414e.hashCode()) * 1000003) ^ this.f41415f.hashCode()) * 1000003) ^ this.f41416g.hashCode()) * 1000003) ^ this.f41417h.hashCode()) * 1000003) ^ this.f41418i.hashCode();
    }
}
