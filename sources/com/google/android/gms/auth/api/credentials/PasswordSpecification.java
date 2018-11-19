package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.annotation.NonNull;
import android.support.annotation.VisibleForTesting;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.oj;
import com.google.android.gms.internal.zzbfm;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public final class PasswordSpecification extends zzbfm implements ReflectedParcelable {
    public static final Creator<PasswordSpecification> CREATOR = new C2440i();
    public static final PasswordSpecification zzeft = new C2431a().m8804a(12, 16).m8805a("abcdefghijkmnopqrstxyzABCDEFGHJKLMNPQRSTXY3456789").m8806a("abcdefghijkmnopqrstxyz", 1).m8806a("ABCDEFGHJKLMNPQRSTXY", 1).m8806a("3456789", 1).m8807a();
    private static PasswordSpecification zzefu = new C2431a().m8804a(12, 16).m8805a("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890").m8806a("abcdefghijklmnopqrstuvwxyz", 1).m8806a("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 1).m8806a("1234567890", 1).m8807a();
    private final Random zzbfo;
    @VisibleForTesting
    private String zzefv;
    @VisibleForTesting
    private List<String> zzefw;
    @VisibleForTesting
    private List<Integer> zzefx;
    @VisibleForTesting
    private int zzefy;
    @VisibleForTesting
    private int zzefz;
    private final int[] zzega;

    /* renamed from: com.google.android.gms.auth.api.credentials.PasswordSpecification$a */
    public static class C2431a {
        /* renamed from: a */
        private final TreeSet<Character> f7374a = new TreeSet();
        /* renamed from: b */
        private final List<String> f7375b = new ArrayList();
        /* renamed from: c */
        private final List<Integer> f7376c = new ArrayList();
        /* renamed from: d */
        private int f7377d = 12;
        /* renamed from: e */
        private int f7378e = 16;

        /* renamed from: a */
        private static TreeSet<Character> m8803a(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                throw new zzb(String.valueOf(str2).concat(" cannot be null or empty"));
            }
            TreeSet<Character> treeSet = new TreeSet();
            for (char c : str.toCharArray()) {
                if (PasswordSpecification.zzc(c, 32, 126)) {
                    throw new zzb(String.valueOf(str2).concat(" must only contain ASCII printable characters"));
                }
                treeSet.add(Character.valueOf(c));
            }
            return treeSet;
        }

        /* renamed from: a */
        public final C2431a m8804a(int i, int i2) {
            this.f7377d = 12;
            this.f7378e = 16;
            return this;
        }

        /* renamed from: a */
        public final C2431a m8805a(@NonNull String str) {
            this.f7374a.addAll(C2431a.m8803a(str, "allowedChars"));
            return this;
        }

        /* renamed from: a */
        public final C2431a m8806a(@NonNull String str, int i) {
            this.f7375b.add(PasswordSpecification.zzb(C2431a.m8803a(str, "requiredChars")));
            this.f7376c.add(Integer.valueOf(1));
            return this;
        }

        /* renamed from: a */
        public final PasswordSpecification m8807a() {
            if (this.f7374a.isEmpty()) {
                throw new zzb("no allowed characters specified");
            }
            int i = 0;
            for (Integer intValue : this.f7376c) {
                i += intValue.intValue();
            }
            if (i > this.f7378e) {
                throw new zzb("required character count cannot be greater than the max password size");
            }
            boolean[] zArr = new boolean[95];
            for (String toCharArray : this.f7375b) {
                for (char c : toCharArray.toCharArray()) {
                    int i2 = c - 32;
                    if (zArr[i2]) {
                        StringBuilder stringBuilder = new StringBuilder(58);
                        stringBuilder.append("character ");
                        stringBuilder.append(c);
                        stringBuilder.append(" occurs in more than one required character set");
                        throw new zzb(stringBuilder.toString());
                    }
                    zArr[i2] = true;
                }
            }
            return new PasswordSpecification(PasswordSpecification.zzb(this.f7374a), this.f7375b, this.f7376c, this.f7377d, this.f7378e);
        }
    }

    public static class zzb extends Error {
        public zzb(String str) {
            super(str);
        }
    }

    PasswordSpecification(String str, List<String> list, List<Integer> list2, int i, int i2) {
        this.zzefv = str;
        this.zzefw = Collections.unmodifiableList(list);
        this.zzefx = Collections.unmodifiableList(list2);
        this.zzefy = i;
        this.zzefz = i2;
        int[] iArr = new int[95];
        Arrays.fill(iArr, -1);
        i = 0;
        for (String toCharArray : this.zzefw) {
            for (char c : toCharArray.toCharArray()) {
                iArr[c - 32] = i;
            }
            i++;
        }
        this.zzega = iArr;
        this.zzbfo = new SecureRandom();
    }

    private static String zzb(Collection<Character> collection) {
        char[] cArr = new char[collection.size()];
        int i = 0;
        for (Character charValue : collection) {
            int i2 = i + 1;
            cArr[i] = charValue.charValue();
            i = i2;
        }
        return new String(cArr);
    }

    private static boolean zzc(int i, int i2, int i3) {
        if (i >= 32) {
            if (i <= 126) {
                return false;
            }
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = oj.a(parcel);
        oj.a(parcel, 1, this.zzefv, false);
        oj.b(parcel, 2, this.zzefw, false);
        oj.a(parcel, 3, this.zzefx, false);
        oj.a(parcel, 4, this.zzefy);
        oj.a(parcel, 5, this.zzefz);
        oj.a(parcel, i);
    }
}
