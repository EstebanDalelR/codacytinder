package com.tinder.data.match;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.tinder.data.match.C8673k.C10794a;
import com.tinder.domain.common.model.Photo;
import java.util.List;
import org.joda.time.DateTime;

/* renamed from: com.tinder.data.match.a */
final class C12909a extends C10794a {
    /* renamed from: a */
    private final String f41377a;
    /* renamed from: b */
    private final String f41378b;
    /* renamed from: c */
    private final String f41379c;
    /* renamed from: d */
    private final String f41380d;
    /* renamed from: e */
    private final String f41381e;
    /* renamed from: f */
    private final String f41382f;
    /* renamed from: g */
    private final String f41383g;
    /* renamed from: h */
    private final DateTime f41384h;
    /* renamed from: i */
    private final List<Photo> f41385i;

    C12909a(String str, String str2, String str3, String str4, String str5, String str6, String str7, DateTime dateTime, @Nullable List<Photo> list) {
        if (str == null) {
            throw new NullPointerException("Null template_id");
        }
        this.f41377a = str;
        if (str2 == null) {
            throw new NullPointerException("Null match_id");
        }
        this.f41378b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null title");
        }
        this.f41379c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null logo_url");
        }
        this.f41380d = str4;
        if (str5 == null) {
            throw new NullPointerException("Null body");
        }
        this.f41381e = str5;
        if (str6 == null) {
            throw new NullPointerException("Null clickthrough_url");
        }
        this.f41382f = str6;
        if (str7 == null) {
            throw new NullPointerException("Null clickthrough_text");
        }
        this.f41383g = str7;
        if (dateTime == null) {
            throw new NullPointerException("Null end_date");
        }
        this.f41384h = dateTime;
        this.f41385i = list;
    }

    @NonNull
    public String template_id() {
        return this.f41377a;
    }

    @NonNull
    public String match_id() {
        return this.f41378b;
    }

    @NonNull
    public String title() {
        return this.f41379c;
    }

    @NonNull
    public String logo_url() {
        return this.f41380d;
    }

    @NonNull
    public String body() {
        return this.f41381e;
    }

    @NonNull
    public String clickthrough_url() {
        return this.f41382f;
    }

    @NonNull
    public String clickthrough_text() {
        return this.f41383g;
    }

    @NonNull
    public DateTime end_date() {
        return this.f41384h;
    }

    @Nullable
    public List<Photo> photos() {
        return this.f41385i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CreativeValues{template_id=");
        stringBuilder.append(this.f41377a);
        stringBuilder.append(", match_id=");
        stringBuilder.append(this.f41378b);
        stringBuilder.append(", title=");
        stringBuilder.append(this.f41379c);
        stringBuilder.append(", logo_url=");
        stringBuilder.append(this.f41380d);
        stringBuilder.append(", body=");
        stringBuilder.append(this.f41381e);
        stringBuilder.append(", clickthrough_url=");
        stringBuilder.append(this.f41382f);
        stringBuilder.append(", clickthrough_text=");
        stringBuilder.append(this.f41383g);
        stringBuilder.append(", end_date=");
        stringBuilder.append(this.f41384h);
        stringBuilder.append(", photos=");
        stringBuilder.append(this.f41385i);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10794a)) {
            return false;
        }
        C10794a c10794a = (C10794a) obj;
        if (this.f41377a.equals(c10794a.template_id()) && this.f41378b.equals(c10794a.match_id()) && this.f41379c.equals(c10794a.title()) && this.f41380d.equals(c10794a.logo_url()) && this.f41381e.equals(c10794a.body()) && this.f41382f.equals(c10794a.clickthrough_url()) && this.f41383g.equals(c10794a.clickthrough_text()) && this.f41384h.equals(c10794a.end_date())) {
            if (this.f41385i == null) {
                if (c10794a.photos() == null) {
                    return z;
                }
            } else if (this.f41385i.equals(c10794a.photos()) != null) {
                return z;
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        return ((((((((((((((((this.f41377a.hashCode() ^ 1000003) * 1000003) ^ this.f41378b.hashCode()) * 1000003) ^ this.f41379c.hashCode()) * 1000003) ^ this.f41380d.hashCode()) * 1000003) ^ this.f41381e.hashCode()) * 1000003) ^ this.f41382f.hashCode()) * 1000003) ^ this.f41383g.hashCode()) * 1000003) ^ this.f41384h.hashCode()) * 1000003) ^ (this.f41385i == null ? 0 : this.f41385i.hashCode());
    }
}
