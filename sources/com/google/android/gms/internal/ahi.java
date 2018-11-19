package com.google.android.gms.internal;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

@zzzv
public final class ahi {
    /* renamed from: a */
    private final agy f15265a;
    /* renamed from: b */
    private final int f15266b;
    /* renamed from: c */
    private String f15267c;
    /* renamed from: d */
    private String f15268d;
    /* renamed from: e */
    private final boolean f15269e = false;
    /* renamed from: f */
    private final int f15270f;
    /* renamed from: g */
    private final int f15271g;

    public ahi(int i, int i2, int i3) {
        this.f15266b = i;
        if (i2 <= 64) {
            if (i2 >= 0) {
                this.f15270f = i2;
                if (i3 > 0) {
                    this.f15271g = 1;
                } else {
                    this.f15271g = i3;
                }
                this.f15265a = new ahg(this.f15270f);
            }
        }
        this.f15270f = 64;
        if (i3 > 0) {
            this.f15271g = i3;
        } else {
            this.f15271g = 1;
        }
        this.f15265a = new ahg(this.f15270f);
    }

    /* renamed from: a */
    private final boolean m19172a(String str, HashSet<String> hashSet) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return true;
        }
        for (String str2 : split) {
            String str22;
            int i;
            Object obj;
            int i2;
            if (str22.indexOf("'") != -1) {
                StringBuilder stringBuilder = new StringBuilder(str22);
                i = 1;
                obj = null;
                while (true) {
                    i2 = i + 2;
                    if (i2 > stringBuilder.length()) {
                        break;
                    }
                    if (stringBuilder.charAt(i) == '\'') {
                        if (stringBuilder.charAt(i - 1) != ' ') {
                            int i3 = i + 1;
                            if ((stringBuilder.charAt(i3) == 's' || stringBuilder.charAt(i3) == 'S') && (i2 == stringBuilder.length() || stringBuilder.charAt(i2) == ' ')) {
                                stringBuilder.insert(i, ' ');
                                i = i2;
                                obj = 1;
                            }
                        }
                        stringBuilder.setCharAt(i, ' ');
                        obj = 1;
                    }
                    i++;
                }
                String stringBuilder2 = obj != null ? stringBuilder.toString() : null;
                if (stringBuilder2 != null) {
                    this.f15268d = stringBuilder2;
                    str22 = stringBuilder2;
                }
            }
            String[] a = ahc.m19166a(str22, true);
            if (a.length >= this.f15271g) {
                for (int i4 = 0; i4 < a.length; i4++) {
                    Object obj2;
                    obj = "";
                    for (i = 0; i < this.f15271g; i++) {
                        i2 = i4 + i;
                        if (i2 >= a.length) {
                            obj2 = null;
                            break;
                        }
                        if (i > 0) {
                            obj = String.valueOf(obj).concat(" ");
                        }
                        String valueOf = String.valueOf(obj);
                        String valueOf2 = String.valueOf(a[i2]);
                        obj = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                    }
                    obj2 = 1;
                    if (obj2 == null) {
                        break;
                    }
                    hashSet.add(obj);
                    if (hashSet.size() >= this.f15266b) {
                        return false;
                    }
                }
                if (hashSet.size() >= this.f15266b) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final String m19173a(ArrayList<String> arrayList, ArrayList<agx> arrayList2) {
        Collections.sort(arrayList2, new ahj(this));
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < arrayList2.size() && m19172a(Normalizer.normalize((CharSequence) arrayList.get(((agx) arrayList2.get(i)).m19159e()), Form.NFKC).toLowerCase(Locale.US), hashSet)) {
            i++;
        }
        ahb ahb = new ahb();
        this.f15267c = "";
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                ahb.m19164a(this.f15265a.mo4244a((String) it.next()));
            } catch (Throwable e) {
                hx.m19912b("Error while writing hash to byteStream", e);
            }
        }
        return ahb.toString();
    }
}
