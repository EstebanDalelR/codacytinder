package com.facebook.ads;

import android.text.TextUtils;

public class AdError {
    public static final AdError CACHE_ERROR = new AdError(CACHE_ERROR_CODE, "Cache Error");
    public static final int CACHE_ERROR_CODE = 2002;
    public static final AdError INTERNAL_ERROR = new AdError(INTERNAL_ERROR_CODE, "Internal Error");
    public static final int INTERNAL_ERROR_CODE = 2001;
    public static final AdError LOAD_TOO_FREQUENTLY = new AdError(LOAD_TOO_FREQUENTLY_ERROR_CODE, "Ad was re-loaded too frequently");
    public static final int LOAD_TOO_FREQUENTLY_ERROR_CODE = 1002;
    public static final AdError MEDIATION_ERROR = new AdError(MEDIATION_ERROR_CODE, "Mediation Error");
    public static final int MEDIATION_ERROR_CODE = 3001;
    @Deprecated
    public static final AdError MISSING_PROPERTIES = new AdError(CACHE_ERROR_CODE, "Native ad failed to load due to missing properties");
    public static final AdError NETWORK_ERROR = new AdError(NETWORK_ERROR_CODE, "Network Error");
    public static final int NETWORK_ERROR_CODE = 1000;
    public static final AdError NO_FILL = new AdError(NO_FILL_ERROR_CODE, "No Fill");
    public static final int NO_FILL_ERROR_CODE = 1001;
    public static final AdError SERVER_ERROR = new AdError(2000, "Server Error");
    public static final int SERVER_ERROR_CODE = 2000;
    /* renamed from: a */
    private final int f3489a;
    /* renamed from: b */
    private final String f3490b;

    public AdError(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "unknown error";
        }
        this.f3489a = i;
        this.f3490b = str;
    }

    public int getErrorCode() {
        return this.f3489a;
    }

    public String getErrorMessage() {
        return this.f3490b;
    }
}
