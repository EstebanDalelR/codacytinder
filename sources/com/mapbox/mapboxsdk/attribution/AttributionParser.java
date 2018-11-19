package com.mapbox.mapboxsdk.attribution;

import android.os.Build.VERSION;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import java.util.LinkedHashSet;
import java.util.Set;

public class AttributionParser {
    private final String attributionData;
    private final Set<Attribution> attributions = new LinkedHashSet();
    private final boolean withCopyrightSign;
    private final boolean withImproveMap;
    private final boolean withMapboxAttribution;
    private final boolean withTelemetryAttribution;

    public static class Options {
        private String[] attributionDataStringArray;
        private boolean withCopyrightSign = true;
        private boolean withImproveMap = true;
        private boolean withMapboxAttribution = true;
        private boolean withTelemetryAttribution = false;

        public Options withAttributionData(String... strArr) {
            this.attributionDataStringArray = strArr;
            return this;
        }

        public Options withImproveMap(boolean z) {
            this.withImproveMap = z;
            return this;
        }

        public Options withCopyrightSign(boolean z) {
            this.withCopyrightSign = z;
            return this;
        }

        public Options withTelemetryAttribution(boolean z) {
            this.withTelemetryAttribution = z;
            return this;
        }

        public Options withMapboxAttribution(boolean z) {
            this.withMapboxAttribution = z;
            return this;
        }

        public AttributionParser build() {
            if (this.attributionDataStringArray == null) {
                throw new IllegalStateException("Using builder without providing attribution data");
            }
            AttributionParser attributionParser = new AttributionParser(parseAttribution(this.attributionDataStringArray), this.withImproveMap, this.withCopyrightSign, this.withTelemetryAttribution, this.withMapboxAttribution);
            attributionParser.parse();
            return attributionParser;
        }

        private String parseAttribution(String[] strArr) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String str : strArr) {
                if (!str.isEmpty()) {
                    stringBuilder.append(str);
                }
            }
            return stringBuilder.toString();
        }
    }

    AttributionParser(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.attributionData = str;
        this.withImproveMap = z;
        this.withCopyrightSign = z2;
        this.withTelemetryAttribution = z3;
        this.withMapboxAttribution = z4;
    }

    public Set<Attribution> getAttributions() {
        return this.attributions;
    }

    public String createAttributionString() {
        return createAttributionString(false);
    }

    public String createAttributionString(boolean z) {
        StringBuilder stringBuilder = new StringBuilder(this.withCopyrightSign ? "" : "© ");
        int i = 0;
        for (Attribution attribution : this.attributions) {
            i++;
            stringBuilder.append(!z ? attribution.getTitle() : attribution.getTitleAbbreviated());
            if (i != this.attributions.size()) {
                stringBuilder.append(" / ");
            }
        }
        return stringBuilder.toString();
    }

    protected void parse() {
        parseAttributions();
        addAdditionalAttributions();
    }

    private void parseAttributions() {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) fromHtml(this.attributionData);
        int i = 0;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        int length = uRLSpanArr.length;
        while (i < length) {
            parseUrlSpan(spannableStringBuilder, uRLSpanArr[i]);
            i++;
        }
    }

    private void parseUrlSpan(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan) {
        String url = uRLSpan.getURL();
        if (isUrlValid(url)) {
            this.attributions.add(new Attribution(parseAnchorValue(spannableStringBuilder, uRLSpan), url));
        }
    }

    private boolean isUrlValid(String str) {
        return (!isValidForImproveThisMap(str) || isValidForMapbox(str) == null) ? null : true;
    }

    private boolean isValidForImproveThisMap(String str) {
        if (!this.withImproveMap) {
            if (str.equals("https://www.mapbox.com/map-feedback/") != null) {
                return null;
            }
        }
        return true;
    }

    private boolean isValidForMapbox(String str) {
        if (!this.withMapboxAttribution) {
            if (str.equals("https://www.mapbox.com/about/maps/") != null) {
                return null;
            }
        }
        return true;
    }

    private String parseAnchorValue(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan) {
        int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
        uRLSpan = spannableStringBuilder.getSpanEnd(uRLSpan);
        char[] cArr = new char[(uRLSpan - spanStart)];
        spannableStringBuilder.getChars(spanStart, uRLSpan, cArr, 0);
        return stripCopyright(String.valueOf(cArr));
    }

    private String stripCopyright(String str) {
        return (this.withCopyrightSign || !str.startsWith("© ")) ? str : str.substring(2, str.length());
    }

    private void addAdditionalAttributions() {
        if (this.withTelemetryAttribution) {
            this.attributions.add(new Attribution("Telemetry Settings", "https://www.mapbox.com/telemetry/"));
        }
    }

    private static Spanned fromHtml(String str) {
        if (VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, 0);
        }
        return Html.fromHtml(str);
    }
}
