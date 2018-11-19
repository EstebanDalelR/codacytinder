package com.google.android.exoplayer2.extractor.mp4;

import android.util.Log;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.util.C2302k;
import com.google.android.exoplayer2.util.C2314v;

/* renamed from: com.google.android.exoplayer2.extractor.mp4.e */
final class C2097e {
    /* renamed from: A */
    private static final int f5899A = C2314v.m8499g("sosn");
    /* renamed from: B */
    private static final int f5900B = C2314v.m8499g("tvsh");
    /* renamed from: C */
    private static final int f5901C = C2314v.m8499g("----");
    /* renamed from: D */
    private static final String[] f5902D = new String[]{"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};
    /* renamed from: a */
    private static final int f5903a = C2314v.m8499g("nam");
    /* renamed from: b */
    private static final int f5904b = C2314v.m8499g("trk");
    /* renamed from: c */
    private static final int f5905c = C2314v.m8499g("cmt");
    /* renamed from: d */
    private static final int f5906d = C2314v.m8499g("day");
    /* renamed from: e */
    private static final int f5907e = C2314v.m8499g("ART");
    /* renamed from: f */
    private static final int f5908f = C2314v.m8499g("too");
    /* renamed from: g */
    private static final int f5909g = C2314v.m8499g("alb");
    /* renamed from: h */
    private static final int f5910h = C2314v.m8499g("com");
    /* renamed from: i */
    private static final int f5911i = C2314v.m8499g("wrt");
    /* renamed from: j */
    private static final int f5912j = C2314v.m8499g("lyr");
    /* renamed from: k */
    private static final int f5913k = C2314v.m8499g("gen");
    /* renamed from: l */
    private static final int f5914l = C2314v.m8499g("covr");
    /* renamed from: m */
    private static final int f5915m = C2314v.m8499g("gnre");
    /* renamed from: n */
    private static final int f5916n = C2314v.m8499g("grp");
    /* renamed from: o */
    private static final int f5917o = C2314v.m8499g("disk");
    /* renamed from: p */
    private static final int f5918p = C2314v.m8499g("trkn");
    /* renamed from: q */
    private static final int f5919q = C2314v.m8499g("tmpo");
    /* renamed from: r */
    private static final int f5920r = C2314v.m8499g("cpil");
    /* renamed from: s */
    private static final int f5921s = C2314v.m8499g("aART");
    /* renamed from: t */
    private static final int f5922t = C2314v.m8499g("sonm");
    /* renamed from: u */
    private static final int f5923u = C2314v.m8499g("soal");
    /* renamed from: v */
    private static final int f5924v = C2314v.m8499g("soar");
    /* renamed from: w */
    private static final int f5925w = C2314v.m8499g("soaa");
    /* renamed from: x */
    private static final int f5926x = C2314v.m8499g("soco");
    /* renamed from: y */
    private static final int f5927y = C2314v.m8499g("rtng");
    /* renamed from: z */
    private static final int f5928z = C2314v.m8499g("pgap");

    /* renamed from: a */
    public static Entry m7504a(C2302k c2302k) {
        Entry b;
        int d = c2302k.m8389d() + c2302k.m8403o();
        int o = c2302k.m8403o();
        int i = (o >> 24) & 255;
        if (i != 169) {
            if (i != 65533) {
                try {
                    if (o == f5915m) {
                        b = C2097e.m7510b(c2302k);
                        return b;
                    } else if (o == f5917o) {
                        b = C2097e.m7509b(o, "TPOS", c2302k);
                        c2302k.m8388c(d);
                        return b;
                    } else if (o == f5918p) {
                        b = C2097e.m7509b(o, "TRCK", c2302k);
                        c2302k.m8388c(d);
                        return b;
                    } else if (o == f5919q) {
                        b = C2097e.m7506a(o, "TBPM", c2302k, true, false);
                        c2302k.m8388c(d);
                        return b;
                    } else if (o == f5920r) {
                        b = C2097e.m7506a(o, "TCMP", c2302k, true, true);
                        c2302k.m8388c(d);
                        return b;
                    } else if (o == f5914l) {
                        b = C2097e.m7511c(c2302k);
                        c2302k.m8388c(d);
                        return b;
                    } else if (o == f5921s) {
                        b = C2097e.m7508a(o, "TPE2", c2302k);
                        c2302k.m8388c(d);
                        return b;
                    } else if (o == f5922t) {
                        b = C2097e.m7508a(o, "TSOT", c2302k);
                        c2302k.m8388c(d);
                        return b;
                    } else if (o == f5923u) {
                        b = C2097e.m7508a(o, "TSO2", c2302k);
                        c2302k.m8388c(d);
                        return b;
                    } else if (o == f5924v) {
                        b = C2097e.m7508a(o, "TSOA", c2302k);
                        c2302k.m8388c(d);
                        return b;
                    } else if (o == f5925w) {
                        b = C2097e.m7508a(o, "TSOP", c2302k);
                        c2302k.m8388c(d);
                        return b;
                    } else if (o == f5926x) {
                        b = C2097e.m7508a(o, "TSOC", c2302k);
                        c2302k.m8388c(d);
                        return b;
                    } else if (o == f5927y) {
                        b = C2097e.m7506a(o, "ITUNESADVISORY", c2302k, false, false);
                        c2302k.m8388c(d);
                        return b;
                    } else if (o == f5928z) {
                        b = C2097e.m7506a(o, "ITUNESGAPLESS", c2302k, false, true);
                        c2302k.m8388c(d);
                        return b;
                    } else if (o == f5899A) {
                        b = C2097e.m7508a(o, "TVSHOWSORT", c2302k);
                        c2302k.m8388c(d);
                        return b;
                    } else if (o == f5900B) {
                        b = C2097e.m7508a(o, "TVSHOW", c2302k);
                        c2302k.m8388c(d);
                        return b;
                    } else {
                        if (o == f5901C) {
                            b = C2097e.m7507a(c2302k, d);
                            c2302k.m8388c(d);
                            return b;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Skipped unknown metadata entry: ");
                        stringBuilder.append(C2087a.m7472c(o));
                        Log.d("MetadataUtil", stringBuilder.toString());
                        c2302k.m8388c(d);
                        return null;
                    }
                } finally {
                    c2302k.m8388c(d);
                }
            }
        }
        i = 16777215 & o;
        if (i == f5905c) {
            b = C2097e.m7505a(o, c2302k);
            c2302k.m8388c(d);
            return b;
        }
        if (i != f5903a) {
            if (i != f5904b) {
                if (i != f5910h) {
                    if (i != f5911i) {
                        if (i == f5906d) {
                            b = C2097e.m7508a(o, "TDRC", c2302k);
                            c2302k.m8388c(d);
                            return b;
                        } else if (i == f5907e) {
                            b = C2097e.m7508a(o, "TPE1", c2302k);
                            c2302k.m8388c(d);
                            return b;
                        } else if (i == f5908f) {
                            b = C2097e.m7508a(o, "TSSE", c2302k);
                            c2302k.m8388c(d);
                            return b;
                        } else if (i == f5909g) {
                            b = C2097e.m7508a(o, "TALB", c2302k);
                            c2302k.m8388c(d);
                            return b;
                        } else if (i == f5912j) {
                            b = C2097e.m7508a(o, "USLT", c2302k);
                            c2302k.m8388c(d);
                            return b;
                        } else if (i == f5913k) {
                            b = C2097e.m7508a(o, "TCON", c2302k);
                            c2302k.m8388c(d);
                            return b;
                        } else {
                            if (i == f5916n) {
                                b = C2097e.m7508a(o, "TIT1", c2302k);
                                c2302k.m8388c(d);
                                return b;
                            }
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Skipped unknown metadata entry: ");
                            stringBuilder2.append(C2087a.m7472c(o));
                            Log.d("MetadataUtil", stringBuilder2.toString());
                            c2302k.m8388c(d);
                            return null;
                        }
                    }
                }
                b = C2097e.m7508a(o, "TCOM", c2302k);
                c2302k.m8388c(d);
                return b;
            }
        }
        b = C2097e.m7508a(o, "TIT2", c2302k);
        c2302k.m8388c(d);
        return b;
    }

    /* renamed from: a */
    private static TextInformationFrame m7508a(int i, String str, C2302k c2302k) {
        int o = c2302k.m8403o();
        if (c2302k.m8403o() == C2087a.aF) {
            c2302k.m8390d(8);
            return new TextInformationFrame(str, null, c2302k.m8394f(o - 16));
        }
        c2302k = new StringBuilder();
        c2302k.append("Failed to parse text attribute: ");
        c2302k.append(C2087a.m7472c(i));
        Log.w("MetadataUtil", c2302k.toString());
        return null;
    }

    /* renamed from: a */
    private static CommentFrame m7505a(int i, C2302k c2302k) {
        int o = c2302k.m8403o();
        if (c2302k.m8403o() == C2087a.aF) {
            c2302k.m8390d(8);
            i = c2302k.m8394f(o - 16);
            return new CommentFrame("und", i, i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Failed to parse comment attribute: ");
        stringBuilder.append(C2087a.m7472c(i));
        Log.w("MetadataUtil", stringBuilder.toString());
        return 0;
    }

    /* renamed from: a */
    private static Id3Frame m7506a(int i, String str, C2302k c2302k, boolean z, boolean z2) {
        c2302k = C2097e.m7512d(c2302k);
        if (z2) {
            c2302k = Math.min(true, c2302k);
        }
        if (c2302k >= null) {
            if (z) {
                i = new TextInformationFrame(str, null, Integer.toString(c2302k));
            } else {
                i = new CommentFrame("und", str, Integer.toString(c2302k));
            }
            return i;
        }
        c2302k = new StringBuilder();
        c2302k.append("Failed to parse uint8 attribute: ");
        c2302k.append(C2087a.m7472c(i));
        Log.w("MetadataUtil", c2302k.toString());
        return null;
    }

    /* renamed from: b */
    private static TextInformationFrame m7509b(int i, String str, C2302k c2302k) {
        int o = c2302k.m8403o();
        if (c2302k.m8403o() == C2087a.aF && o >= 22) {
            c2302k.m8390d(10);
            o = c2302k.m8396h();
            if (o > 0) {
                i = new StringBuilder();
                i.append("");
                i.append(o);
                i = i.toString();
                c2302k = c2302k.m8396h();
                if (c2302k > null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(i);
                    stringBuilder.append("/");
                    stringBuilder.append(c2302k);
                    i = stringBuilder.toString();
                }
                return new TextInformationFrame(str, null, i);
            }
        }
        c2302k = new StringBuilder();
        c2302k.append("Failed to parse index/count attribute: ");
        c2302k.append(C2087a.m7472c(i));
        Log.w("MetadataUtil", c2302k.toString());
        return null;
    }

    /* renamed from: b */
    private static TextInformationFrame m7510b(C2302k c2302k) {
        c2302k = C2097e.m7512d(c2302k);
        c2302k = (c2302k <= null || c2302k > f5902D.length) ? null : f5902D[c2302k - 1];
        if (c2302k != null) {
            return new TextInformationFrame("TCON", null, c2302k);
        }
        Log.w("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    /* renamed from: c */
    private static ApicFrame m7511c(C2302k c2302k) {
        int o = c2302k.m8403o();
        if (c2302k.m8403o() == C2087a.aF) {
            int b = C2087a.m7471b(c2302k.m8403o());
            String str = b == 13 ? "image/jpeg" : b == 14 ? "image/png" : null;
            if (str == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unrecognized cover art flags: ");
                stringBuilder.append(b);
                Log.w("MetadataUtil", stringBuilder.toString());
                return null;
            }
            c2302k.m8390d(4);
            byte[] bArr = new byte[(o - 16)];
            c2302k.m8384a(bArr, 0, bArr.length);
            return new ApicFrame(str, null, 3, bArr);
        }
        Log.w("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    /* renamed from: a */
    private static Id3Frame m7507a(C2302k c2302k, int i) {
        Object obj = null;
        String str = obj;
        int i2 = -1;
        int i3 = -1;
        while (c2302k.m8389d() < i) {
            int d = c2302k.m8389d();
            int o = c2302k.m8403o();
            int o2 = c2302k.m8403o();
            c2302k.m8390d(4);
            if (o2 == C2087a.aD) {
                obj = c2302k.m8394f(o - 12);
            } else if (o2 == C2087a.aE) {
                str = c2302k.m8394f(o - 12);
            } else {
                if (o2 == C2087a.aF) {
                    i2 = d;
                    i3 = o;
                }
                c2302k.m8390d(o - 12);
            }
        }
        if (!("com.apple.iTunes".equals(obj) == 0 || "iTunSMPB".equals(str) == 0)) {
            if (i2 != -1) {
                c2302k.m8388c(i2);
                c2302k.m8390d(16);
                return new CommentFrame("und", str, c2302k.m8394f(i3 - 16));
            }
        }
        return null;
    }

    /* renamed from: d */
    private static int m7512d(C2302k c2302k) {
        c2302k.m8390d(4);
        if (c2302k.m8403o() == C2087a.aF) {
            c2302k.m8390d(8);
            return c2302k.m8395g();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
