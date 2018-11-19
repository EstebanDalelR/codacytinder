package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.C2314v;
import com.google.android.exoplayer2.video.ColorInfo;
import com.tinder.api.ManagerWebServices;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Format implements Parcelable {
    public static final Creator<Format> CREATOR = new C20071();
    public static final int NO_VALUE = -1;
    public static final long OFFSET_SAMPLE_RELATIVE = Long.MAX_VALUE;
    public final int accessibilityChannel;
    public final int bitrate;
    public final int channelCount;
    @Nullable
    public final String codecs;
    @Nullable
    public final ColorInfo colorInfo;
    @Nullable
    public final String containerMimeType;
    @Nullable
    public final DrmInitData drmInitData;
    public final int encoderDelay;
    public final int encoderPadding;
    public final float frameRate;
    private int hashCode;
    public final int height;
    @Nullable
    public final String id;
    public final List<byte[]> initializationData;
    @Nullable
    public final String language;
    public final int maxInputSize;
    @Nullable
    public final Metadata metadata;
    public final int pcmEncoding;
    public final float pixelWidthHeightRatio;
    @Nullable
    public final byte[] projectionData;
    public final int rotationDegrees;
    @Nullable
    public final String sampleMimeType;
    public final int sampleRate;
    public final int selectionFlags;
    public final int stereoMode;
    public final long subsampleOffsetUs;
    public final int width;

    /* renamed from: com.google.android.exoplayer2.Format$1 */
    static class C20071 implements Creator<Format> {
        C20071() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m7220a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m7221a(i);
        }

        /* renamed from: a */
        public Format m7220a(Parcel parcel) {
            return new Format(parcel);
        }

        /* renamed from: a */
        public Format[] m7221a(int i) {
            return new Format[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public static Format createVideoContainerFormat(@Nullable String str, @Nullable String str2, String str3, String str4, int i, int i2, int i3, float f, List<byte[]> list, int i4) {
        return new Format(str, str2, str3, str4, i, -1, i2, i3, f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i4, null, -1, OFFSET_SAMPLE_RELATIVE, list, null, null);
    }

    public static Format createVideoSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, @Nullable DrmInitData drmInitData) {
        return createVideoSampleFormat(str, str2, str3, i, i2, i3, i4, f, list, -1, -1.0f, drmInitData);
    }

    public static Format createVideoSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, @Nullable DrmInitData drmInitData) {
        return createVideoSampleFormat(str, str2, str3, i, i2, i3, i4, f, list, i5, f2, null, -1, null, drmInitData);
    }

    public static Format createVideoSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, @Nullable ColorInfo colorInfo, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo, -1, -1, -1, -1, -1, 0, null, -1, OFFSET_SAMPLE_RELATIVE, list, drmInitData, null);
    }

    public static Format createAudioContainerFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, int i3, List<byte[]> list, int i4, @Nullable String str5) {
        return new Format(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i2, i3, -1, -1, -1, i4, str5, -1, OFFSET_SAMPLE_RELATIVE, list, null, null);
    }

    public static Format createAudioSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, List<byte[]> list, @Nullable DrmInitData drmInitData, int i5, @Nullable String str4) {
        return createAudioSampleFormat(str, str2, str3, i, i2, i3, i4, -1, list, drmInitData, i5, str4);
    }

    public static Format createAudioSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, @Nullable DrmInitData drmInitData, int i6, @Nullable String str4) {
        return createAudioSampleFormat(str, str2, str3, i, i2, i3, i4, i5, -1, -1, list, drmInitData, i6, str4, null);
    }

    public static Format createAudioSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, @Nullable DrmInitData drmInitData, int i8, @Nullable String str4, @Nullable Metadata metadata) {
        return new Format(str, null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, i8, str4, -1, OFFSET_SAMPLE_RELATIVE, list, drmInitData, metadata);
    }

    public static Format createTextContainerFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, @Nullable String str5) {
        return createTextContainerFormat(str, str2, str3, str4, i, i2, str5, -1);
    }

    public static Format createTextContainerFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, @Nullable String str5, int i3) {
        return new Format(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str5, i3, OFFSET_SAMPLE_RELATIVE, null, null, null);
    }

    public static Format createTextSampleFormat(@Nullable String str, String str2, int i, @Nullable String str3) {
        return createTextSampleFormat(str, str2, i, str3, null);
    }

    public static Format createTextSampleFormat(@Nullable String str, String str2, int i, @Nullable String str3, @Nullable DrmInitData drmInitData) {
        return createTextSampleFormat(str, str2, null, -1, i, str3, -1, drmInitData, OFFSET_SAMPLE_RELATIVE, Collections.emptyList());
    }

    public static Format createTextSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable String str4, int i3, @Nullable DrmInitData drmInitData) {
        return createTextSampleFormat(str, str2, str3, i, i2, str4, i3, drmInitData, OFFSET_SAMPLE_RELATIVE, Collections.emptyList());
    }

    public static Format createTextSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable String str4, @Nullable DrmInitData drmInitData, long j) {
        return createTextSampleFormat(str, str2, str3, i, i2, str4, -1, drmInitData, j, Collections.emptyList());
    }

    public static Format createTextSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable String str4, int i3, @Nullable DrmInitData drmInitData, long j, List<byte[]> list) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, drmInitData, null);
    }

    public static Format createImageSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, List<byte[]> list, @Nullable String str4, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, -1, OFFSET_SAMPLE_RELATIVE, list, drmInitData, null);
    }

    public static Format createContainerFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, @Nullable String str5) {
        return new Format(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str5, -1, OFFSET_SAMPLE_RELATIVE, null, null, null);
    }

    public static Format createSampleFormat(@Nullable String str, @Nullable String str2, long j) {
        return new Format(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j, null, null, null);
    }

    public static Format createSampleFormat(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, OFFSET_SAMPLE_RELATIVE, null, drmInitData, null);
    }

    Format(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, @Nullable byte[] bArr, int i6, @Nullable ColorInfo colorInfo, int i7, int i8, int i9, int i10, int i11, int i12, @Nullable String str5, int i13, long j, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, @Nullable Metadata metadata) {
        this.id = str;
        this.containerMimeType = str2;
        this.sampleMimeType = str3;
        this.codecs = str4;
        this.bitrate = i;
        this.maxInputSize = i2;
        this.width = i3;
        this.height = i4;
        this.frameRate = f;
        int i14 = i5;
        if (i14 == -1) {
            i14 = 0;
        }
        r0.rotationDegrees = i14;
        r0.pixelWidthHeightRatio = f2 == -1.0f ? 1.0f : f2;
        r0.projectionData = bArr;
        r0.stereoMode = i6;
        r0.colorInfo = colorInfo;
        r0.channelCount = i7;
        r0.sampleRate = i8;
        r0.pcmEncoding = i9;
        i14 = i10;
        if (i14 == -1) {
            i14 = 0;
        }
        r0.encoderDelay = i14;
        i14 = i11;
        if (i14 == -1) {
            i14 = 0;
        }
        r0.encoderPadding = i14;
        r0.selectionFlags = i12;
        r0.language = str5;
        r0.accessibilityChannel = i13;
        r0.subsampleOffsetUs = j;
        r0.initializationData = list == null ? Collections.emptyList() : list;
        r0.drmInitData = drmInitData;
        r0.metadata = metadata;
    }

    Format(Parcel parcel) {
        this.id = parcel.readString();
        this.containerMimeType = parcel.readString();
        this.sampleMimeType = parcel.readString();
        this.codecs = parcel.readString();
        this.bitrate = parcel.readInt();
        this.maxInputSize = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.frameRate = parcel.readFloat();
        this.rotationDegrees = parcel.readInt();
        this.pixelWidthHeightRatio = parcel.readFloat();
        this.projectionData = C2314v.m8479a(parcel) ? parcel.createByteArray() : null;
        this.stereoMode = parcel.readInt();
        this.colorInfo = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.channelCount = parcel.readInt();
        this.sampleRate = parcel.readInt();
        this.pcmEncoding = parcel.readInt();
        this.encoderDelay = parcel.readInt();
        this.encoderPadding = parcel.readInt();
        this.selectionFlags = parcel.readInt();
        this.language = parcel.readString();
        this.accessibilityChannel = parcel.readInt();
        this.subsampleOffsetUs = parcel.readLong();
        int readInt = parcel.readInt();
        this.initializationData = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.initializationData.add(parcel.createByteArray());
        }
        this.drmInitData = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.metadata = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
    }

    public Format copyWithMaxInputSize(int i) {
        String str = this.id;
        String str2 = this.containerMimeType;
        String str3 = this.sampleMimeType;
        String str4 = this.codecs;
        int i2 = this.bitrate;
        int i3 = this.width;
        int i4 = this.height;
        float f = this.frameRate;
        int i5 = this.rotationDegrees;
        float f2 = this.pixelWidthHeightRatio;
        byte[] bArr = this.projectionData;
        int i6 = this.stereoMode;
        ColorInfo colorInfo = this.colorInfo;
        int i7 = this.channelCount;
        int i8 = this.sampleRate;
        ColorInfo colorInfo2 = colorInfo;
        int i9 = this.pcmEncoding;
        int i10 = this.encoderDelay;
        int i11 = this.encoderPadding;
        int i12 = this.selectionFlags;
        String str5 = this.language;
        int i13 = i6;
        int i14 = this.accessibilityChannel;
        long j = this.subsampleOffsetUs;
        List list = this.initializationData;
        List list2 = list;
        int i15 = i7;
        return new Format(str, str2, str3, str4, i2, i, i3, i4, f, i5, f2, bArr, i13, colorInfo2, i15, i8, i9, i10, i11, i12, str5, i14, j, list2, this.drmInitData, this.metadata);
    }

    public Format copyWithSubsampleOffsetUs(long j) {
        String str = this.id;
        String str2 = this.containerMimeType;
        String str3 = this.sampleMimeType;
        String str4 = this.codecs;
        int i = this.bitrate;
        int i2 = this.maxInputSize;
        int i3 = this.width;
        int i4 = this.height;
        float f = this.frameRate;
        int i5 = this.rotationDegrees;
        float f2 = this.pixelWidthHeightRatio;
        byte[] bArr = this.projectionData;
        int i6 = this.stereoMode;
        ColorInfo colorInfo = this.colorInfo;
        ColorInfo colorInfo2 = colorInfo;
        return new Format(str, str2, str3, str4, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo2, this.channelCount, this.sampleRate, this.pcmEncoding, this.encoderDelay, this.encoderPadding, this.selectionFlags, this.language, this.accessibilityChannel, j, this.initializationData, this.drmInitData, this.metadata);
    }

    public Format copyWithContainerInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, int i3, int i4, @Nullable String str4) {
        String str5 = this.containerMimeType;
        int i5 = this.maxInputSize;
        float f = this.frameRate;
        int i6 = this.rotationDegrees;
        float f2 = this.pixelWidthHeightRatio;
        byte[] bArr = this.projectionData;
        int i7 = this.stereoMode;
        ColorInfo colorInfo = this.colorInfo;
        int i8 = this.channelCount;
        int i9 = this.sampleRate;
        int i10 = this.pcmEncoding;
        int i11 = this.encoderDelay;
        int i12 = this.encoderPadding;
        int i13 = this.accessibilityChannel;
        int i14 = i7;
        ColorInfo colorInfo2 = colorInfo;
        long j = this.subsampleOffsetUs;
        List list = this.initializationData;
        long j2 = j;
        DrmInitData drmInitData = this.drmInitData;
        int i15 = i13;
        int i16 = i12;
        int i17 = i11;
        int i18 = i10;
        int i19 = i9;
        int i20 = i8;
        DrmInitData drmInitData2 = drmInitData;
        return new Format(str, str5, str2, str3, i, i5, i2, i3, f, i6, f2, bArr, i14, colorInfo2, i20, i19, i18, i17, i16, i4, str4, i15, j2, list, drmInitData2, this.metadata);
    }

    public Format copyWithManifestFormatInfo(Format format) {
        Format format2 = format;
        if (this == format2) {
            return r0;
        }
        return new Format(format2.id, r0.containerMimeType, r0.sampleMimeType, r0.codecs == null ? format2.codecs : r0.codecs, r0.bitrate == -1 ? format2.bitrate : r0.bitrate, r0.maxInputSize, r0.width, r0.height, r0.frameRate == -1.0f ? format2.frameRate : r0.frameRate, r0.rotationDegrees, r0.pixelWidthHeightRatio, r0.projectionData, r0.stereoMode, r0.colorInfo, r0.channelCount, r0.sampleRate, r0.pcmEncoding, r0.encoderDelay, r0.encoderPadding, r0.selectionFlags | format2.selectionFlags, r0.language == null ? format2.language : r0.language, r0.accessibilityChannel, r0.subsampleOffsetUs, r0.initializationData, DrmInitData.createSessionCreationData(format2.drmInitData, r0.drmInitData), r0.metadata);
    }

    public Format copyWithGaplessInfo(int i, int i2) {
        String str = this.id;
        String str2 = this.containerMimeType;
        String str3 = this.sampleMimeType;
        String str4 = this.codecs;
        int i3 = this.bitrate;
        int i4 = this.maxInputSize;
        int i5 = this.width;
        int i6 = this.height;
        float f = this.frameRate;
        int i7 = this.rotationDegrees;
        float f2 = this.pixelWidthHeightRatio;
        byte[] bArr = this.projectionData;
        int i8 = this.stereoMode;
        ColorInfo colorInfo = this.colorInfo;
        int i9 = this.channelCount;
        ColorInfo colorInfo2 = colorInfo;
        int i10 = this.sampleRate;
        int i11 = this.pcmEncoding;
        int i12 = this.selectionFlags;
        String str5 = this.language;
        int i13 = i8;
        int i14 = this.accessibilityChannel;
        long j = this.subsampleOffsetUs;
        List list = this.initializationData;
        List list2 = list;
        return new Format(str, str2, str3, str4, i3, i4, i5, i6, f, i7, f2, bArr, i13, colorInfo2, i9, i10, i11, i, i2, i12, str5, i14, j, list2, this.drmInitData, this.metadata);
    }

    public Format copyWithDrmInitData(@Nullable DrmInitData drmInitData) {
        String str = this.id;
        String str2 = this.containerMimeType;
        String str3 = this.sampleMimeType;
        String str4 = this.codecs;
        int i = this.bitrate;
        int i2 = this.maxInputSize;
        int i3 = this.width;
        int i4 = this.height;
        float f = this.frameRate;
        int i5 = this.rotationDegrees;
        float f2 = this.pixelWidthHeightRatio;
        byte[] bArr = this.projectionData;
        int i6 = this.stereoMode;
        ColorInfo colorInfo = this.colorInfo;
        int i7 = this.channelCount;
        ColorInfo colorInfo2 = colorInfo;
        int i8 = this.sampleRate;
        int i9 = this.pcmEncoding;
        int i10 = this.encoderDelay;
        int i11 = this.encoderPadding;
        int i12 = this.selectionFlags;
        String str5 = this.language;
        int i13 = i6;
        int i14 = this.accessibilityChannel;
        long j = this.subsampleOffsetUs;
        List list = this.initializationData;
        List list2 = list;
        return new Format(str, str2, str3, str4, i, i2, i3, i4, f, i5, f2, bArr, i13, colorInfo2, i7, i8, i9, i10, i11, i12, str5, i14, j, list2, drmInitData, this.metadata);
    }

    public Format copyWithMetadata(@Nullable Metadata metadata) {
        String str = this.id;
        String str2 = this.containerMimeType;
        String str3 = this.sampleMimeType;
        String str4 = this.codecs;
        int i = this.bitrate;
        int i2 = this.maxInputSize;
        int i3 = this.width;
        int i4 = this.height;
        float f = this.frameRate;
        int i5 = this.rotationDegrees;
        float f2 = this.pixelWidthHeightRatio;
        byte[] bArr = this.projectionData;
        int i6 = this.stereoMode;
        ColorInfo colorInfo = this.colorInfo;
        int i7 = this.channelCount;
        ColorInfo colorInfo2 = colorInfo;
        int i8 = this.sampleRate;
        int i9 = this.pcmEncoding;
        int i10 = this.encoderDelay;
        int i11 = this.encoderPadding;
        int i12 = this.selectionFlags;
        String str5 = this.language;
        int i13 = i6;
        int i14 = this.accessibilityChannel;
        long j = this.subsampleOffsetUs;
        List list = this.initializationData;
        List list2 = list;
        return new Format(str, str2, str3, str4, i, i2, i3, i4, f, i5, f2, bArr, i13, colorInfo2, i7, i8, i9, i10, i11, i12, str5, i14, j, list2, this.drmInitData, metadata);
    }

    public Format copyWithRotationDegrees(int i) {
        String str = this.id;
        String str2 = this.containerMimeType;
        String str3 = this.sampleMimeType;
        String str4 = this.codecs;
        int i2 = this.bitrate;
        int i3 = this.maxInputSize;
        int i4 = this.width;
        int i5 = this.height;
        float f = this.frameRate;
        float f2 = this.pixelWidthHeightRatio;
        byte[] bArr = this.projectionData;
        int i6 = this.stereoMode;
        ColorInfo colorInfo = this.colorInfo;
        int i7 = this.channelCount;
        int i8 = this.sampleRate;
        ColorInfo colorInfo2 = colorInfo;
        int i9 = this.pcmEncoding;
        int i10 = this.encoderDelay;
        int i11 = this.encoderPadding;
        int i12 = this.selectionFlags;
        String str5 = this.language;
        int i13 = i6;
        int i14 = this.accessibilityChannel;
        long j = this.subsampleOffsetUs;
        List list = this.initializationData;
        List list2 = list;
        int i15 = i7;
        return new Format(str, str2, str3, str4, i2, i3, i4, i5, f, i, f2, bArr, i13, colorInfo2, i15, i8, i9, i10, i11, i12, str5, i14, j, list2, this.drmInitData, this.metadata);
    }

    public int getPixelCount() {
        if (this.width == -1) {
            return -1;
        }
        if (this.height == -1) {
            return -1;
        }
        return this.height * this.width;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Format(");
        stringBuilder.append(this.id);
        stringBuilder.append(", ");
        stringBuilder.append(this.containerMimeType);
        stringBuilder.append(", ");
        stringBuilder.append(this.sampleMimeType);
        stringBuilder.append(", ");
        stringBuilder.append(this.bitrate);
        stringBuilder.append(", ");
        stringBuilder.append(this.language);
        stringBuilder.append(", [");
        stringBuilder.append(this.width);
        stringBuilder.append(", ");
        stringBuilder.append(this.height);
        stringBuilder.append(", ");
        stringBuilder.append(this.frameRate);
        stringBuilder.append("], [");
        stringBuilder.append(this.channelCount);
        stringBuilder.append(", ");
        stringBuilder.append(this.sampleRate);
        stringBuilder.append("])");
        return stringBuilder.toString();
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            int i = 0;
            int hashCode = (((((((((((((((((((((((527 + (this.id == null ? 0 : this.id.hashCode())) * 31) + (this.containerMimeType == null ? 0 : this.containerMimeType.hashCode())) * 31) + (this.sampleMimeType == null ? 0 : this.sampleMimeType.hashCode())) * 31) + (this.codecs == null ? 0 : this.codecs.hashCode())) * 31) + this.bitrate) * 31) + this.width) * 31) + this.height) * 31) + this.channelCount) * 31) + this.sampleRate) * 31) + (this.language == null ? 0 : this.language.hashCode())) * 31) + this.accessibilityChannel) * 31) + (this.drmInitData == null ? 0 : this.drmInitData.hashCode())) * 31;
            if (this.metadata != null) {
                i = this.metadata.hashCode();
            }
            this.hashCode = hashCode + i;
        }
        return this.hashCode;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                Format format = (Format) obj;
                if (this.bitrate != format.bitrate || this.maxInputSize != format.maxInputSize || this.width != format.width || this.height != format.height || this.frameRate != format.frameRate || this.rotationDegrees != format.rotationDegrees || this.pixelWidthHeightRatio != format.pixelWidthHeightRatio || this.stereoMode != format.stereoMode || this.channelCount != format.channelCount || this.sampleRate != format.sampleRate || this.pcmEncoding != format.pcmEncoding || this.encoderDelay != format.encoderDelay || this.encoderPadding != format.encoderPadding || this.subsampleOffsetUs != format.subsampleOffsetUs || this.selectionFlags != format.selectionFlags || !C2314v.m8480a(this.id, format.id) || !C2314v.m8480a(this.language, format.language) || this.accessibilityChannel != format.accessibilityChannel || !C2314v.m8480a(this.containerMimeType, format.containerMimeType) || !C2314v.m8480a(this.sampleMimeType, format.sampleMimeType) || !C2314v.m8480a(this.codecs, format.codecs) || !C2314v.m8480a(this.drmInitData, format.drmInitData) || !C2314v.m8480a(this.metadata, format.metadata) || !C2314v.m8480a(this.colorInfo, format.colorInfo) || !Arrays.equals(this.projectionData, format.projectionData) || initializationDataEquals(format) == null) {
                    z = false;
                }
                return z;
            }
        }
        return false;
    }

    public boolean initializationDataEquals(Format format) {
        if (this.initializationData.size() != format.initializationData.size()) {
            return false;
        }
        for (int i = 0; i < this.initializationData.size(); i++) {
            if (!Arrays.equals((byte[]) this.initializationData.get(i), (byte[]) format.initializationData.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static String toLogString(Format format) {
        if (format == null) {
            return ManagerWebServices.NULL_STRING_VALUE;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id=");
        stringBuilder.append(format.id);
        stringBuilder.append(", mimeType=");
        stringBuilder.append(format.sampleMimeType);
        if (format.bitrate != -1) {
            stringBuilder.append(", bitrate=");
            stringBuilder.append(format.bitrate);
        }
        if (!(format.width == -1 || format.height == -1)) {
            stringBuilder.append(", res=");
            stringBuilder.append(format.width);
            stringBuilder.append("x");
            stringBuilder.append(format.height);
        }
        if (format.frameRate != -1.0f) {
            stringBuilder.append(", fps=");
            stringBuilder.append(format.frameRate);
        }
        if (format.channelCount != -1) {
            stringBuilder.append(", channels=");
            stringBuilder.append(format.channelCount);
        }
        if (format.sampleRate != -1) {
            stringBuilder.append(", sample_rate=");
            stringBuilder.append(format.sampleRate);
        }
        if (format.language != null) {
            stringBuilder.append(", language=");
            stringBuilder.append(format.language);
        }
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.containerMimeType);
        parcel.writeString(this.sampleMimeType);
        parcel.writeString(this.codecs);
        parcel.writeInt(this.bitrate);
        parcel.writeInt(this.maxInputSize);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.frameRate);
        parcel.writeInt(this.rotationDegrees);
        parcel.writeFloat(this.pixelWidthHeightRatio);
        C2314v.m8471a(parcel, this.projectionData != null);
        if (this.projectionData != null) {
            parcel.writeByteArray(this.projectionData);
        }
        parcel.writeInt(this.stereoMode);
        parcel.writeParcelable(this.colorInfo, i);
        parcel.writeInt(this.channelCount);
        parcel.writeInt(this.sampleRate);
        parcel.writeInt(this.pcmEncoding);
        parcel.writeInt(this.encoderDelay);
        parcel.writeInt(this.encoderPadding);
        parcel.writeInt(this.selectionFlags);
        parcel.writeString(this.language);
        parcel.writeInt(this.accessibilityChannel);
        parcel.writeLong(this.subsampleOffsetUs);
        i = this.initializationData.size();
        parcel.writeInt(i);
        for (int i2 = 0; i2 < i; i2++) {
            parcel.writeByteArray((byte[]) this.initializationData.get(i2));
        }
        parcel.writeParcelable(this.drmInitData, 0);
        parcel.writeParcelable(this.metadata, 0);
    }
}
