package com.mapbox.mapboxsdk.attribution;

public class Attribution {
    static final String IMPROVE_MAP_URL = "https://www.mapbox.com/map-feedback/";
    static final String MAPBOX_URL = "https://www.mapbox.com/about/maps/";
    private static final String OPENSTREETMAP = "OpenStreetMap";
    private static final String OPENSTREETMAP_ABBR = "OSM";
    static final String TELEMETRY = "Telemetry Settings";
    static final String TELEMETRY_URL = "https://www.mapbox.com/telemetry/";
    private String title;
    private String url;

    Attribution(String str, String str2) {
        this.title = str;
        this.url = str2;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTitleAbbreviated() {
        if (this.title.equals(OPENSTREETMAP)) {
            return OPENSTREETMAP_ABBR;
        }
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 1;
        if (r4 != r5) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = 0;
        if (r5 == 0) goto L_0x003c;
    L_0x0007:
        r2 = r4.getClass();
        r3 = r5.getClass();
        if (r2 == r3) goto L_0x0012;
    L_0x0011:
        goto L_0x003c;
    L_0x0012:
        r5 = (com.mapbox.mapboxsdk.attribution.Attribution) r5;
        r2 = r4.title;
        if (r2 == 0) goto L_0x0023;
    L_0x0018:
        r2 = r4.title;
        r3 = r5.title;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0028;
    L_0x0022:
        goto L_0x0027;
    L_0x0023:
        r2 = r5.title;
        if (r2 == 0) goto L_0x0028;
    L_0x0027:
        return r1;
    L_0x0028:
        r2 = r4.url;
        if (r2 == 0) goto L_0x0035;
    L_0x002c:
        r0 = r4.url;
        r5 = r5.url;
        r0 = r0.equals(r5);
        goto L_0x003b;
    L_0x0035:
        r5 = r5.url;
        if (r5 != 0) goto L_0x003a;
    L_0x0039:
        goto L_0x003b;
    L_0x003a:
        r0 = 0;
    L_0x003b:
        return r0;
    L_0x003c:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.attribution.Attribution.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int hashCode = (this.title != null ? this.title.hashCode() : 0) * 31;
        if (this.url != null) {
            i = this.url.hashCode();
        }
        return hashCode + i;
    }
}
