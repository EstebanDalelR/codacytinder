package com.tinder.ads;

import android.net.Uri;
import com.google.android.gms.ads.formats.C2356c.C2355b;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.tinder.ads.Ad.AdType;
import com.tinder.ads.source.dfp.NativeDfpAd;
import com.tinder.ads.source.dfp.NativeDfpSource;
import com.tinder.ads.source.dfp.NativeDfpSource.NativeDfpAdFactory;
import com.tinder.api.ManagerWebServices;
import com.tinder.domain.config.model.ProfileEditingConfig;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C2668g;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

@Metadata(bv = {1, 0, 2}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001:\u0003345B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\b\u0010\u0006\u001a\u00020\u001fH\u0016J\t\u0010 \u001a\u00020\u0003HÂ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0011HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÂ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003Jw\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016¨\u00066"}, d2 = {"Lcom/tinder/ads/MessageAd;", "Lcom/tinder/ads/source/dfp/NativeDfpAd;", "dfpSource", "Lcom/tinder/ads/source/dfp/NativeDfpSource;", "customTemplateAd", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "adType", "Lcom/tinder/ads/TinderAdType;", "logo", "", "clickthroughText", "lineItemId", "clickthroughUrl", "creativeId", "body", "title", "endDate", "Lorg/joda/time/DateTime;", "(Lcom/tinder/ads/source/dfp/NativeDfpSource;Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;Lcom/tinder/ads/TinderAdType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getAdType", "()Lcom/tinder/ads/TinderAdType;", "getBody", "()Ljava/lang/String;", "getClickthroughText", "getClickthroughUrl", "getCreativeId", "getEndDate", "()Lorg/joda/time/DateTime;", "getLineItemId", "getLogo", "getTitle", "Lcom/tinder/ads/Ad$AdType;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Factory", "SponsoredMessageAdFactory", "TinderUpdateMessageAdFactory", "Tinder_release"}, k = 1, mv = {1, 1, 10})
public final class MessageAd extends NativeDfpAd {
    @NotNull
    private final TinderAdType adType;
    @NotNull
    private final String body;
    @NotNull
    private final String clickthroughText;
    @NotNull
    private final String clickthroughUrl;
    @NotNull
    private final String creativeId;
    private final NativeCustomTemplateAd customTemplateAd;
    private final NativeDfpSource dfpSource;
    @NotNull
    private final DateTime endDate;
    @NotNull
    private final String lineItemId;
    @NotNull
    private final String logo;
    @NotNull
    private final String title;

    @Metadata(bv = {1, 0, 2}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/tinder/ads/MessageAd$Factory;", "Lcom/tinder/ads/source/dfp/NativeDfpSource$NativeDfpAdFactory;", "adType", "Lcom/tinder/ads/TinderAdType;", "(Lcom/tinder/ads/TinderAdType;)V", "createAd", "Lcom/tinder/ads/source/dfp/NativeDfpAd;", "source", "Lcom/tinder/ads/source/dfp/NativeDfpSource;", "wrapped", "Lcom/google/android/gms/ads/formats/NativeCustomTemplateAd;", "parseDate", "Lorg/joda/time/DateTime;", "date", "", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static abstract class Factory extends NativeDfpAdFactory {
        private final TinderAdType adType;

        public Factory(@NotNull TinderAdType tinderAdType) {
            C2668g.b(tinderAdType, "adType");
            this.adType = tinderAdType;
        }

        @NotNull
        public NativeDfpAd createAd(@NotNull NativeDfpSource nativeDfpSource, @NotNull NativeCustomTemplateAd nativeCustomTemplateAd) {
            String uri;
            CharSequence text;
            String obj;
            String obj2;
            String obj3;
            String obj4;
            String obj5;
            String obj6;
            C2668g.b(nativeDfpSource, "source");
            C2668g.b(nativeCustomTemplateAd, "wrapped");
            TinderAdType tinderAdType = this.adType;
            C2355b image = nativeCustomTemplateAd.getImage("logo");
            String str = null;
            if (image != null) {
                Uri b = image.b();
                if (b != null) {
                    uri = b.toString();
                    if (uri != null) {
                        throw ((Throwable) new IllegalArgumentException("Required value was null.".toString()));
                    }
                    text = nativeCustomTemplateAd.getText("clickthrough_text");
                    obj = text == null ? text.toString() : null;
                    if (obj != null) {
                        throw ((Throwable) new IllegalArgumentException("Required value was null.".toString()));
                    }
                    text = nativeCustomTemplateAd.getText("line_item_id");
                    obj2 = text == null ? text.toString() : null;
                    if (obj2 != null) {
                        throw ((Throwable) new IllegalArgumentException("Required value was null.".toString()));
                    }
                    text = nativeCustomTemplateAd.getText("clickthrough_url");
                    obj3 = text == null ? text.toString() : null;
                    if (obj3 != null) {
                        throw ((Throwable) new IllegalArgumentException("Required value was null.".toString()));
                    }
                    text = nativeCustomTemplateAd.getText("creative_id");
                    obj4 = text == null ? text.toString() : null;
                    if (obj4 != null) {
                        throw ((Throwable) new IllegalArgumentException("Required value was null.".toString()));
                    }
                    text = nativeCustomTemplateAd.getText("body");
                    obj5 = text == null ? text.toString() : null;
                    if (obj5 != null) {
                        throw ((Throwable) new IllegalArgumentException("Required value was null.".toString()));
                    }
                    text = nativeCustomTemplateAd.getText(ManagerWebServices.PARAM_JOB_TITLE);
                    obj6 = text == null ? text.toString() : null;
                    if (obj6 != null) {
                        throw ((Throwable) new IllegalArgumentException("Required value was null.".toString()));
                    }
                    text = nativeCustomTemplateAd.getText("end_date");
                    if (text != null) {
                        str = text.toString();
                    }
                    if (str != null) {
                        throw ((Throwable) new IllegalArgumentException("Required value was null.".toString()));
                    }
                    return new MessageAd(nativeDfpSource, nativeCustomTemplateAd, tinderAdType, uri, obj, obj2, obj3, obj4, obj5, obj6, parseDate(str));
                }
            }
            uri = null;
            if (uri != null) {
                text = nativeCustomTemplateAd.getText("clickthrough_text");
                if (text == null) {
                }
                if (obj != null) {
                    text = nativeCustomTemplateAd.getText("line_item_id");
                    if (text == null) {
                    }
                    if (obj2 != null) {
                        text = nativeCustomTemplateAd.getText("clickthrough_url");
                        if (text == null) {
                        }
                        if (obj3 != null) {
                            text = nativeCustomTemplateAd.getText("creative_id");
                            if (text == null) {
                            }
                            if (obj4 != null) {
                                text = nativeCustomTemplateAd.getText("body");
                                if (text == null) {
                                }
                                if (obj5 != null) {
                                    text = nativeCustomTemplateAd.getText(ManagerWebServices.PARAM_JOB_TITLE);
                                    if (text == null) {
                                    }
                                    if (obj6 != null) {
                                        text = nativeCustomTemplateAd.getText("end_date");
                                        if (text != null) {
                                            str = text.toString();
                                        }
                                        if (str != null) {
                                            return new MessageAd(nativeDfpSource, nativeCustomTemplateAd, tinderAdType, uri, obj, obj2, obj3, obj4, obj5, obj6, parseDate(str));
                                        }
                                        throw ((Throwable) new IllegalArgumentException("Required value was null.".toString()));
                                    }
                                    throw ((Throwable) new IllegalArgumentException("Required value was null.".toString()));
                                }
                                throw ((Throwable) new IllegalArgumentException("Required value was null.".toString()));
                            }
                            throw ((Throwable) new IllegalArgumentException("Required value was null.".toString()));
                        }
                        throw ((Throwable) new IllegalArgumentException("Required value was null.".toString()));
                    }
                    throw ((Throwable) new IllegalArgumentException("Required value was null.".toString()));
                }
                throw ((Throwable) new IllegalArgumentException("Required value was null.".toString()));
            }
            throw ((Throwable) new IllegalArgumentException("Required value was null.".toString()));
        }

        private final org.joda.time.DateTime parseDate(java.lang.String r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r2 = this;
            r0 = com.tinder.ads.MessageAdKt.DATE_FORMATTER;	 Catch:{ IllegalArgumentException -> 0x000e }
            r0 = r0.d(r3);	 Catch:{ IllegalArgumentException -> 0x000e }
            r1 = "DATE_FORMATTER.parseDateTime(date)";	 Catch:{ IllegalArgumentException -> 0x000e }
            kotlin.jvm.internal.C2668g.a(r0, r1);	 Catch:{ IllegalArgumentException -> 0x000e }
            goto L_0x002a;
        L_0x000e:
            r0 = com.tinder.ads.MessageAdKt.FIRST_ALTERNATIVE_DATE_FORMATTER;	 Catch:{ IllegalArgumentException -> 0x001c }
            r0 = r0.d(r3);	 Catch:{ IllegalArgumentException -> 0x001c }
            r1 = "FIRST_ALTERNATIVE_DATE_F…ATTER.parseDateTime(date)";	 Catch:{ IllegalArgumentException -> 0x001c }
            kotlin.jvm.internal.C2668g.a(r0, r1);	 Catch:{ IllegalArgumentException -> 0x001c }
            goto L_0x002a;
        L_0x001c:
            r0 = com.tinder.ads.MessageAdKt.SECOND_ALTERNATIVE_DATE_FORMATTER;
            r3 = r0.d(r3);
            r0 = "SECOND_ALTERNATIVE_DATE_…ATTER.parseDateTime(date)";
            kotlin.jvm.internal.C2668g.a(r3, r0);
            r0 = r3;
        L_0x002a:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tinder.ads.MessageAd.Factory.parseDate(java.lang.String):org.joda.time.DateTime");
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/ads/MessageAd$SponsoredMessageAdFactory;", "Lcom/tinder/ads/MessageAd$Factory;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class SponsoredMessageAdFactory extends Factory {
        @Inject
        public SponsoredMessageAdFactory() {
            super(TinderAdType.SPONSORED_MESSAGE);
        }
    }

    @Metadata(bv = {1, 0, 2}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/tinder/ads/MessageAd$TinderUpdateMessageAdFactory;", "Lcom/tinder/ads/MessageAd$Factory;", "()V", "Tinder_release"}, k = 1, mv = {1, 1, 10})
    public static final class TinderUpdateMessageAdFactory extends Factory {
        @Inject
        public TinderUpdateMessageAdFactory() {
            super(TinderAdType.TINDER_UPDATE_MESSAGE);
        }
    }

    private final NativeDfpSource component1() {
        return this.dfpSource;
    }

    private final NativeCustomTemplateAd component2() {
        return this.customTemplateAd;
    }

    @NotNull
    public static /* synthetic */ MessageAd copy$default(MessageAd messageAd, NativeDfpSource nativeDfpSource, NativeCustomTemplateAd nativeCustomTemplateAd, TinderAdType tinderAdType, String str, String str2, String str3, String str4, String str5, String str6, String str7, DateTime dateTime, int i, Object obj) {
        MessageAd messageAd2 = messageAd;
        int i2 = i;
        return messageAd2.copy((i2 & 1) != 0 ? messageAd2.dfpSource : nativeDfpSource, (i2 & 2) != 0 ? messageAd2.customTemplateAd : nativeCustomTemplateAd, (i2 & 4) != 0 ? messageAd2.adType : tinderAdType, (i2 & 8) != 0 ? messageAd2.logo : str, (i2 & 16) != 0 ? messageAd2.clickthroughText : str2, (i2 & 32) != 0 ? messageAd2.lineItemId : str3, (i2 & 64) != 0 ? messageAd2.clickthroughUrl : str4, (i2 & ProfileEditingConfig.DEFAULT_MAX_LENGTH) != 0 ? messageAd2.creativeId : str5, (i2 & 256) != 0 ? messageAd2.body : str6, (i2 & 512) != 0 ? messageAd2.title : str7, (i2 & 1024) != 0 ? messageAd2.endDate : dateTime);
    }

    @NotNull
    public final String component10() {
        return this.title;
    }

    @NotNull
    public final DateTime component11() {
        return this.endDate;
    }

    @NotNull
    public final TinderAdType component3() {
        return this.adType;
    }

    @NotNull
    public final String component4() {
        return this.logo;
    }

    @NotNull
    public final String component5() {
        return this.clickthroughText;
    }

    @NotNull
    public final String component6() {
        return this.lineItemId;
    }

    @NotNull
    public final String component7() {
        return this.clickthroughUrl;
    }

    @NotNull
    public final String component8() {
        return this.creativeId;
    }

    @NotNull
    public final String component9() {
        return this.body;
    }

    @NotNull
    public final MessageAd copy(@NotNull NativeDfpSource nativeDfpSource, @NotNull NativeCustomTemplateAd nativeCustomTemplateAd, @NotNull TinderAdType tinderAdType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull DateTime dateTime) {
        NativeDfpSource nativeDfpSource2 = nativeDfpSource;
        C2668g.b(nativeDfpSource2, "dfpSource");
        NativeCustomTemplateAd nativeCustomTemplateAd2 = nativeCustomTemplateAd;
        C2668g.b(nativeCustomTemplateAd2, "customTemplateAd");
        TinderAdType tinderAdType2 = tinderAdType;
        C2668g.b(tinderAdType2, "adType");
        String str8 = str;
        C2668g.b(str8, "logo");
        String str9 = str2;
        C2668g.b(str9, "clickthroughText");
        String str10 = str3;
        C2668g.b(str10, "lineItemId");
        String str11 = str4;
        C2668g.b(str11, "clickthroughUrl");
        String str12 = str5;
        C2668g.b(str12, "creativeId");
        String str13 = str6;
        C2668g.b(str13, "body");
        String str14 = str7;
        C2668g.b(str14, ManagerWebServices.PARAM_JOB_TITLE);
        DateTime dateTime2 = dateTime;
        C2668g.b(dateTime2, "endDate");
        return new MessageAd(nativeDfpSource2, nativeCustomTemplateAd2, tinderAdType2, str8, str9, str10, str11, str12, str13, str14, dateTime2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MessageAd) {
                MessageAd messageAd = (MessageAd) obj;
                if (C2668g.a(this.dfpSource, messageAd.dfpSource) && C2668g.a(this.customTemplateAd, messageAd.customTemplateAd) && C2668g.a(this.adType, messageAd.adType) && C2668g.a(this.logo, messageAd.logo) && C2668g.a(this.clickthroughText, messageAd.clickthroughText) && C2668g.a(this.lineItemId, messageAd.lineItemId) && C2668g.a(this.clickthroughUrl, messageAd.clickthroughUrl) && C2668g.a(this.creativeId, messageAd.creativeId) && C2668g.a(this.body, messageAd.body) && C2668g.a(this.title, messageAd.title) && C2668g.a(this.endDate, messageAd.endDate)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        NativeDfpSource nativeDfpSource = this.dfpSource;
        int i = 0;
        int hashCode = (nativeDfpSource != null ? nativeDfpSource.hashCode() : 0) * 31;
        NativeCustomTemplateAd nativeCustomTemplateAd = this.customTemplateAd;
        hashCode = (hashCode + (nativeCustomTemplateAd != null ? nativeCustomTemplateAd.hashCode() : 0)) * 31;
        TinderAdType tinderAdType = this.adType;
        hashCode = (hashCode + (tinderAdType != null ? tinderAdType.hashCode() : 0)) * 31;
        String str = this.logo;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.clickthroughText;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.lineItemId;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.clickthroughUrl;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.creativeId;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.body;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.title;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        DateTime dateTime = this.endDate;
        if (dateTime != null) {
            i = dateTime.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MessageAd(dfpSource=");
        stringBuilder.append(this.dfpSource);
        stringBuilder.append(", customTemplateAd=");
        stringBuilder.append(this.customTemplateAd);
        stringBuilder.append(", adType=");
        stringBuilder.append(this.adType);
        stringBuilder.append(", logo=");
        stringBuilder.append(this.logo);
        stringBuilder.append(", clickthroughText=");
        stringBuilder.append(this.clickthroughText);
        stringBuilder.append(", lineItemId=");
        stringBuilder.append(this.lineItemId);
        stringBuilder.append(", clickthroughUrl=");
        stringBuilder.append(this.clickthroughUrl);
        stringBuilder.append(", creativeId=");
        stringBuilder.append(this.creativeId);
        stringBuilder.append(", body=");
        stringBuilder.append(this.body);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", endDate=");
        stringBuilder.append(this.endDate);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    @NotNull
    public final TinderAdType getAdType() {
        return this.adType;
    }

    @NotNull
    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    public final String getClickthroughText() {
        return this.clickthroughText;
    }

    @NotNull
    public final String getLineItemId() {
        return this.lineItemId;
    }

    @NotNull
    public final String getClickthroughUrl() {
        return this.clickthroughUrl;
    }

    @NotNull
    public final String getCreativeId() {
        return this.creativeId;
    }

    @NotNull
    public final String getBody() {
        return this.body;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final DateTime getEndDate() {
        return this.endDate;
    }

    public MessageAd(@NotNull NativeDfpSource nativeDfpSource, @NotNull NativeCustomTemplateAd nativeCustomTemplateAd, @NotNull TinderAdType tinderAdType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull DateTime dateTime) {
        C2668g.b(nativeDfpSource, "dfpSource");
        C2668g.b(nativeCustomTemplateAd, "customTemplateAd");
        C2668g.b(tinderAdType, "adType");
        C2668g.b(str, "logo");
        C2668g.b(str2, "clickthroughText");
        C2668g.b(str3, "lineItemId");
        C2668g.b(str4, "clickthroughUrl");
        C2668g.b(str5, "creativeId");
        C2668g.b(str6, "body");
        C2668g.b(str7, ManagerWebServices.PARAM_JOB_TITLE);
        C2668g.b(dateTime, "endDate");
        super(nativeDfpSource, nativeCustomTemplateAd);
        this.dfpSource = nativeDfpSource;
        this.customTemplateAd = nativeCustomTemplateAd;
        this.adType = tinderAdType;
        this.logo = str;
        this.clickthroughText = str2;
        this.lineItemId = str3;
        this.clickthroughUrl = str4;
        this.creativeId = str5;
        this.body = str6;
        this.title = str7;
        this.endDate = dateTime;
    }

    @NotNull
    public AdType adType() {
        return this.adType;
    }
}
