package com.google.android.exoplayer2.ui;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ui.C2273b.C2271e;
import com.google.android.exoplayer2.util.C2289a;
import com.google.android.exoplayer2.util.C2297h;
import com.google.android.exoplayer2.util.C2314v;
import java.util.Locale;

/* renamed from: com.google.android.exoplayer2.ui.a */
public class C3715a implements TrackNameProvider {
    /* renamed from: a */
    private final Resources f11640a;

    public C3715a(Resources resources) {
        this.f11640a = (Resources) C2289a.m8309a((Object) resources);
    }

    public String getTrackName(Format format) {
        int e = C3715a.m14079e(format);
        if (e == 2) {
            format = m14075a(m14073a(format), m14076b(format));
        } else if (e == 1) {
            format = m14075a(m14078d(format), m14077c(format), m14076b(format));
        } else {
            format = m14078d(format);
        }
        return format.length() == 0 ? this.f11640a.getString(C2271e.exo_track_unknown) : format;
    }

    /* renamed from: a */
    private String m14073a(Format format) {
        int i = format.width;
        format = format.height;
        if (i != -1) {
            if (format != -1) {
                return this.f11640a.getString(C2271e.exo_track_resolution, new Object[]{Integer.valueOf(i), Integer.valueOf(format)});
            }
        }
        return "";
    }

    /* renamed from: b */
    private String m14076b(Format format) {
        if (format.bitrate == -1) {
            return "";
        }
        return this.f11640a.getString(C2271e.exo_track_bitrate, new Object[]{Float.valueOf(((float) format) / 1000000.0f)});
    }

    /* renamed from: c */
    private String m14077c(Format format) {
        format = format.channelCount;
        if (format != -1) {
            if (format >= 1) {
                switch (format) {
                    case 1:
                        return this.f11640a.getString(C2271e.exo_track_mono);
                    case 2:
                        return this.f11640a.getString(C2271e.exo_track_stereo);
                    case 6:
                    case 7:
                        return this.f11640a.getString(C2271e.exo_track_surround_5_point_1);
                    case 8:
                        return this.f11640a.getString(C2271e.exo_track_surround_7_point_1);
                    default:
                        return this.f11640a.getString(C2271e.exo_track_surround);
                }
            }
        }
        return "";
    }

    /* renamed from: d */
    private String m14078d(Format format) {
        String str = format.language;
        if (!TextUtils.isEmpty(str)) {
            if (!"und".equals(str)) {
                return m14074a(str);
            }
        }
        return "";
    }

    /* renamed from: a */
    private String m14074a(String str) {
        return (C2314v.f6956a >= 21 ? Locale.forLanguageTag(str) : new Locale(str)).getDisplayLanguage();
    }

    /* renamed from: a */
    private String m14075a(String... strArr) {
        Object obj = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                if (TextUtils.isEmpty(obj)) {
                    obj = str;
                } else {
                    obj = this.f11640a.getString(C2271e.exo_item_list, new Object[]{obj, str});
                }
            }
        }
        return obj;
    }

    /* renamed from: e */
    private static int m14079e(Format format) {
        int g = C2297h.m8348g(format.sampleMimeType);
        if (g != -1) {
            return g;
        }
        if (C2297h.m8345d(format.codecs) != null) {
            return 2;
        }
        if (C2297h.m8346e(format.codecs) != null) {
            return 1;
        }
        if (format.width == -1) {
            if (format.height == -1) {
                if (format.channelCount == -1) {
                    if (format.sampleRate == -1) {
                        return -1;
                    }
                }
                return 1;
            }
        }
        return 2;
    }
}
