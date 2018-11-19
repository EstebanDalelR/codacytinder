package com.google.android.exoplayer2.text.p082d;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.text.C4258a;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2296g;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.text.d.a */
public final class C4382a extends C4258a {
    /* renamed from: a */
    private static final Pattern f14518a = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");
    /* renamed from: b */
    private final boolean f14519b;
    /* renamed from: c */
    private int f14520c;
    /* renamed from: d */
    private int f14521d;
    /* renamed from: e */
    private int f14522e;
    /* renamed from: f */
    private int f14523f;

    /* renamed from: a */
    protected /* synthetic */ Subtitle mo3740a(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        return m18100b(bArr, i, z);
    }

    public C4382a() {
        this(null);
    }

    public C4382a(List<byte[]> list) {
        super("SsaDecoder");
        if (list == null || list.isEmpty()) {
            this.f14519b = false;
            return;
        }
        this.f14519b = true;
        String str = new String((byte[]) list.get(0));
        C2289a.m8311a(str.startsWith("Format: "));
        m18098b(str);
        m18095a(new C2302k((byte[]) list.get(1)));
    }

    /* renamed from: b */
    protected C3705b m18100b(byte[] bArr, int i, boolean z) {
        List arrayList = new ArrayList();
        C2296g c2296g = new C2296g();
        C2302k c2302k = new C2302k(bArr, i);
        if (this.f14519b == null) {
            m18095a(c2302k);
        }
        m18096a(c2302k, arrayList, c2296g);
        bArr = new Cue[arrayList.size()];
        arrayList.toArray(bArr);
        return new C3705b(bArr, c2296g.m8340b());
    }

    /* renamed from: a */
    private void m18095a(C2302k c2302k) {
        String z;
        do {
            z = c2302k.m8414z();
            if (z == null) {
                return;
            }
        } while (!z.startsWith("[Events]"));
    }

    /* renamed from: a */
    private void m18096a(C2302k c2302k, List<Cue> list, C2296g c2296g) {
        while (true) {
            String z = c2302k.m8414z();
            if (z == null) {
                return;
            }
            if (!this.f14519b && z.startsWith("Format: ")) {
                m18098b(z);
            } else if (z.startsWith("Dialogue: ")) {
                m18097a(z, (List) list, c2296g);
            }
        }
    }

    /* renamed from: b */
    private void m18098b(String str) {
        str = TextUtils.split(str.substring("Format: ".length()), ",");
        this.f14520c = str.length;
        this.f14521d = -1;
        this.f14522e = -1;
        this.f14523f = -1;
        for (int i = 0; i < this.f14520c; i++) {
            Object obj;
            String d = C2314v.m8493d(str[i].trim());
            int hashCode = d.hashCode();
            if (hashCode != 100571) {
                if (hashCode != 3556653) {
                    if (hashCode == 109757538) {
                        if (d.equals("start")) {
                            obj = null;
                            switch (obj) {
                                case null:
                                    this.f14521d = i;
                                    break;
                                case 1:
                                    this.f14522e = i;
                                    break;
                                case 2:
                                    this.f14523f = i;
                                    break;
                                default:
                                    break;
                            }
                        }
                    }
                } else if (d.equals(ManagerWebServices.PARAM_TEXT)) {
                    obj = 2;
                    switch (obj) {
                        case null:
                            this.f14521d = i;
                            break;
                        case 1:
                            this.f14522e = i;
                            break;
                        case 2:
                            this.f14523f = i;
                            break;
                        default:
                            break;
                    }
                }
            } else if (d.equals("end")) {
                obj = 1;
                switch (obj) {
                    case null:
                        this.f14521d = i;
                        break;
                    case 1:
                        this.f14522e = i;
                        break;
                    case 2:
                        this.f14523f = i;
                        break;
                    default:
                        break;
                }
            }
            obj = -1;
            switch (obj) {
                case null:
                    this.f14521d = i;
                    break;
                case 1:
                    this.f14522e = i;
                    break;
                case 2:
                    this.f14523f = i;
                    break;
                default:
                    break;
            }
        }
        if (this.f14521d == -1 || this.f14522e == -1 || this.f14523f == -1) {
            this.f14520c = 0;
        }
    }

    /* renamed from: a */
    private void m18097a(String str, List<Cue> list, C2296g c2296g) {
        if (this.f14520c == 0) {
            c2296g = new StringBuilder();
            c2296g.append("Skipping dialogue line before complete format: ");
            c2296g.append(str);
            Log.w("SsaDecoder", c2296g.toString());
            return;
        }
        String[] split = str.substring("Dialogue: ".length()).split(",", this.f14520c);
        if (split.length != this.f14520c) {
            c2296g = new StringBuilder();
            c2296g.append("Skipping dialogue line with fewer columns than format: ");
            c2296g.append(str);
            Log.w("SsaDecoder", c2296g.toString());
            return;
        }
        long a = C4382a.m18094a(split[this.f14521d]);
        if (a == -9223372036854775807L) {
            c2296g = new StringBuilder();
            c2296g.append("Skipping invalid timing: ");
            c2296g.append(str);
            Log.w("SsaDecoder", c2296g.toString());
            return;
        }
        long j;
        String str2 = split[this.f14522e];
        if (str2.trim().isEmpty()) {
            j = -9223372036854775807L;
        } else {
            j = C4382a.m18094a(str2);
            if (j == -9223372036854775807L) {
                c2296g = new StringBuilder();
                c2296g.append("Skipping invalid timing: ");
                c2296g.append(str);
                Log.w("SsaDecoder", c2296g.toString());
                return;
            }
        }
        list.add(new Cue(split[this.f14523f].replaceAll("\\{.*?\\}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
        c2296g.m8339a(a);
        if (j != -9223372036854775807L) {
            list.add(null);
            c2296g.m8339a(j);
        }
    }

    /* renamed from: a */
    public static long m18094a(String str) {
        str = f14518a.matcher(str);
        if (str.matches()) {
            return (((((Long.parseLong(str.group(1)) * 60) * 60) * 1000000) + ((Long.parseLong(str.group(2)) * 60) * 1000000)) + (Long.parseLong(str.group(3)) * 1000000)) + (Long.parseLong(str.group(4)) * 10000);
        }
        return -9223372036854775807L;
    }
}
