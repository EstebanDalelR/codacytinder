package com.google.android.m4b.maps.cg;

import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.google.android.m4b.maps.ay.C4728u;
import com.google.android.m4b.maps.ay.C4731z;
import com.google.android.m4b.maps.bc.C7448r;
import com.google.android.m4b.maps.bc.C7449w;
import com.google.android.m4b.maps.bv.ae;
import com.google.android.m4b.maps.ci.C6642d;
import java.util.concurrent.ScheduledExecutorService;

public class bm {
    /* renamed from: a */
    private static final String f19121a = "bm";
    /* renamed from: b */
    private static final String f19122b;

    static {
        Object obj;
        String str;
        String str2 = (String) C4731z.m21053a("debug.mapview.renderer").mo5813a("NOTHING");
        String toUpperCase = str2.toUpperCase();
        int hashCode = toUpperCase.hashCode();
        if (hashCode != -1447660627) {
            if (hashCode != 2191599) {
                if (hashCode == 2336942) {
                    if (toUpperCase.equals("LITE")) {
                        obj = 1;
                        switch (obj) {
                            case null:
                                f19122b = "G";
                                return;
                            case 1:
                                f19122b = "L";
                                return;
                            case 2:
                                f19122b = null;
                                return;
                            default:
                                if (C4728u.m21050a(f19121a, 6)) {
                                    toUpperCase = f19121a;
                                    str = "Unsupported map renderer: ";
                                    str2 = String.valueOf(str2);
                                    Log.e(toUpperCase, str2.length() == 0 ? str.concat(str2) : new String(str));
                                }
                                f19122b = null;
                                return;
                        }
                    }
                }
            } else if (toUpperCase.equals("GMM6")) {
                obj = null;
                switch (obj) {
                    case null:
                        f19122b = "G";
                        return;
                    case 1:
                        f19122b = "L";
                        return;
                    case 2:
                        f19122b = null;
                        return;
                    default:
                        if (C4728u.m21050a(f19121a, 6)) {
                            toUpperCase = f19121a;
                            str = "Unsupported map renderer: ";
                            str2 = String.valueOf(str2);
                            if (str2.length() == 0) {
                            }
                            Log.e(toUpperCase, str2.length() == 0 ? str.concat(str2) : new String(str));
                        }
                        f19122b = null;
                        return;
                }
            }
        } else if (toUpperCase.equals("NOTHING")) {
            obj = 2;
            switch (obj) {
                case null:
                    f19122b = "G";
                    return;
                case 1:
                    f19122b = "L";
                    return;
                case 2:
                    f19122b = null;
                    return;
                default:
                    if (C4728u.m21050a(f19121a, 6)) {
                        toUpperCase = f19121a;
                        str = "Unsupported map renderer: ";
                        str2 = String.valueOf(str2);
                        if (str2.length() == 0) {
                        }
                        Log.e(toUpperCase, str2.length() == 0 ? str.concat(str2) : new String(str));
                    }
                    f19122b = null;
                    return;
            }
        }
        obj = -1;
        switch (obj) {
            case null:
                f19122b = "G";
                return;
            case 1:
                f19122b = "L";
                return;
            case 2:
                f19122b = null;
                return;
            default:
                if (C4728u.m21050a(f19121a, 6)) {
                    toUpperCase = f19121a;
                    str = "Unsupported map renderer: ";
                    str2 = String.valueOf(str2);
                    if (str2.length() == 0) {
                    }
                    Log.e(toUpperCase, str2.length() == 0 ? str.concat(str2) : new String(str));
                }
                f19122b = null;
                return;
        }
    }

    /* renamed from: a */
    static String m22979a(boolean z) {
        z = z ? "L" : "G";
        if (C4728u.m21050a(f19121a, 4)) {
            String str = f19121a;
            String str2 = "Selected map renderer: ";
            String valueOf = String.valueOf(z);
            Log.i(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        if (f19122b == null) {
            return z;
        }
        if (C4728u.m21050a(f19121a, 4)) {
            z = f19121a;
            str = "Overriding map renderer from system property: ";
            String valueOf2 = String.valueOf(f19122b);
            Log.i(z, valueOf2.length() != 0 ? str.concat(valueOf2) : new String(str));
        }
        return f19122b;
    }

    /* renamed from: a */
    static ao m22977a(String str, C5173d c5173d, ScheduledExecutorService scheduledExecutorService, View view, C5177h c5177h, boolean z, String str2, boolean z2, TextView textView, an anVar, C5188s c5188s, cb cbVar, C5162c c5162c) {
        Object obj;
        String str3;
        String str4 = str;
        int hashCode = str4.hashCode();
        if (hashCode != 71) {
            if (hashCode == 76) {
                if (str4.equals("L")) {
                    obj = null;
                    switch (obj) {
                        case null:
                            return C6642d.m29593a(c5173d.m23113c(), c5173d.m23114d(), c5173d.m23111a(), scheduledExecutorService, view, c5177h, c5188s, anVar, textView, c5173d.m23112b(), c5173d.m23119i(), cbVar, c5162c);
                        case 1:
                            if (C4731z.m21057a(z)) {
                                return C7448r.m32100a(c5173d, scheduledExecutorService, view, c5177h, str2, z2, textView, anVar, cbVar, c5162c);
                            }
                            return C7449w.m32130a(c5173d, scheduledExecutorService, view, c5177h, str2, z2, textView, anVar, cbVar, c5162c);
                        default:
                            str3 = "Unsupported renderer: ";
                            str4 = String.valueOf(str4);
                            if (str4.length() != 0) {
                                str4 = str3.concat(str4);
                            } else {
                                str4 = new String(str3);
                            }
                            throw new IllegalArgumentException(str4);
                    }
                }
            }
        } else if (str4.equals("G")) {
            obj = 1;
            switch (obj) {
                case null:
                    return C6642d.m29593a(c5173d.m23113c(), c5173d.m23114d(), c5173d.m23111a(), scheduledExecutorService, view, c5177h, c5188s, anVar, textView, c5173d.m23112b(), c5173d.m23119i(), cbVar, c5162c);
                case 1:
                    if (C4731z.m21057a(z)) {
                        return C7449w.m32130a(c5173d, scheduledExecutorService, view, c5177h, str2, z2, textView, anVar, cbVar, c5162c);
                    }
                    return C7448r.m32100a(c5173d, scheduledExecutorService, view, c5177h, str2, z2, textView, anVar, cbVar, c5162c);
                default:
                    str3 = "Unsupported renderer: ";
                    str4 = String.valueOf(str4);
                    if (str4.length() != 0) {
                        str4 = new String(str3);
                    } else {
                        str4 = str3.concat(str4);
                    }
                    throw new IllegalArgumentException(str4);
            }
        }
        obj = -1;
        switch (obj) {
            case null:
                return C6642d.m29593a(c5173d.m23113c(), c5173d.m23114d(), c5173d.m23111a(), scheduledExecutorService, view, c5177h, c5188s, anVar, textView, c5173d.m23112b(), c5173d.m23119i(), cbVar, c5162c);
            case 1:
                if (C4731z.m21057a(z)) {
                    return C7448r.m32100a(c5173d, scheduledExecutorService, view, c5177h, str2, z2, textView, anVar, cbVar, c5162c);
                }
                return C7449w.m32130a(c5173d, scheduledExecutorService, view, c5177h, str2, z2, textView, anVar, cbVar, c5162c);
            default:
                str3 = "Unsupported renderer: ";
                str4 = String.valueOf(str4);
                if (str4.length() != 0) {
                    str4 = str3.concat(str4);
                } else {
                    str4 = new String(str3);
                }
                throw new IllegalArgumentException(str4);
        }
    }

    /* renamed from: a */
    static bt m22978a(String str, C5173d c5173d) {
        Object obj;
        if (str.hashCode() == 71) {
            if (str.equals("G")) {
                obj = null;
                if (obj != null) {
                    return ae.m28869a(c5173d);
                }
                String str2 = "Unsupported renderer: ";
                str = String.valueOf(str);
                throw new IllegalArgumentException(str.length() == 0 ? str2.concat(str) : new String(str2));
            }
        }
        obj = -1;
        if (obj != null) {
            return ae.m28869a(c5173d);
        }
        String str22 = "Unsupported renderer: ";
        str = String.valueOf(str);
        if (str.length() == 0) {
        }
        throw new IllegalArgumentException(str.length() == 0 ? str22.concat(str) : new String(str22));
    }
}
