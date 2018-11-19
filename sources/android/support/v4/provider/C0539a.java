package android.support.v4.provider;

import android.support.annotation.ArrayRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import android.support.v4.util.C0561l;
import android.util.Base64;
import java.util.List;

/* renamed from: android.support.v4.provider.a */
public final class C0539a {
    /* renamed from: a */
    private final String f1668a;
    /* renamed from: b */
    private final String f1669b;
    /* renamed from: c */
    private final String f1670c;
    /* renamed from: d */
    private final List<List<byte[]>> f1671d;
    /* renamed from: e */
    private final int f1672e = null;
    /* renamed from: f */
    private final String f1673f;

    public C0539a(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<List<byte[]>> list) {
        this.f1668a = (String) C0561l.m2061a(str);
        this.f1669b = (String) C0561l.m2061a(str2);
        this.f1670c = (String) C0561l.m2061a(str3);
        this.f1671d = (List) C0561l.m2061a(list);
        str = new StringBuilder(this.f1668a);
        str.append("-");
        str.append(this.f1669b);
        str.append("-");
        str.append(this.f1670c);
        this.f1673f = str.toString();
    }

    @NonNull
    /* renamed from: a */
    public String m1983a() {
        return this.f1668a;
    }

    @NonNull
    /* renamed from: b */
    public String m1984b() {
        return this.f1669b;
    }

    @NonNull
    /* renamed from: c */
    public String m1985c() {
        return this.f1670c;
    }

    @Nullable
    /* renamed from: d */
    public List<List<byte[]>> m1986d() {
        return this.f1671d;
    }

    @ArrayRes
    /* renamed from: e */
    public int m1987e() {
        return this.f1672e;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public String m1988f() {
        return this.f1673f;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("FontRequest {mProviderAuthority: ");
        stringBuilder2.append(this.f1668a);
        stringBuilder2.append(", mProviderPackage: ");
        stringBuilder2.append(this.f1669b);
        stringBuilder2.append(", mQuery: ");
        stringBuilder2.append(this.f1670c);
        stringBuilder2.append(", mCertificates:");
        stringBuilder.append(stringBuilder2.toString());
        for (int i = 0; i < this.f1671d.size(); i++) {
            stringBuilder.append(" [");
            List list = (List) this.f1671d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                stringBuilder.append(" \"");
                stringBuilder.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                stringBuilder.append("\"");
            }
            stringBuilder.append(" ]");
        }
        stringBuilder.append("}");
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("mCertificatesArray: ");
        stringBuilder2.append(this.f1672e);
        stringBuilder.append(stringBuilder2.toString());
        return stringBuilder.toString();
    }
}
