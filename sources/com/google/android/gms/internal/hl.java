package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.media.MediaCodecList;
import android.os.Build.VERSION;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@zzzv
public final class hl {
    /* renamed from: a */
    private static Map<String, List<Map<String, Object>>> f16147a = new HashMap();
    /* renamed from: b */
    private static List<MediaCodecInfo> f16148b;
    /* renamed from: c */
    private static final Object f16149c = new Object();

    @TargetApi(16)
    /* renamed from: a */
    public static List<Map<String, Object>> m19852a(String str) {
        synchronized (f16149c) {
            if (f16147a.containsKey(str)) {
                return (List) f16147a.get(str);
            }
            List arrayList;
            try {
                synchronized (f16149c) {
                    if (f16148b == null) {
                        List asList;
                        if (VERSION.SDK_INT >= 21) {
                            asList = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else if (VERSION.SDK_INT >= 16) {
                            int codecCount = MediaCodecList.getCodecCount();
                            f16148b = new ArrayList(codecCount);
                            for (int i = 0; i < codecCount; i++) {
                                f16148b.add(MediaCodecList.getCodecInfoAt(i));
                            }
                        } else {
                            asList = Collections.emptyList();
                        }
                        f16148b = asList;
                    }
                }
                arrayList = new ArrayList();
                for (MediaCodecInfo mediaCodecInfo : f16148b) {
                    if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                        Map hashMap = new HashMap();
                        hashMap.put("codecName", mediaCodecInfo.getName());
                        CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        ArrayList arrayList2 = new ArrayList();
                        for (CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                        }
                        hashMap.put("profileLevels", arrayList2);
                        if (VERSION.SDK_INT >= 21) {
                            VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            hashMap.put("bitRatesBps", m19853a(videoCapabilities.getBitrateRange()));
                            hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            hashMap.put("frameRates", m19853a(videoCapabilities.getSupportedFrameRates()));
                            hashMap.put("widths", m19853a(videoCapabilities.getSupportedWidths()));
                            hashMap.put("heights", m19853a(videoCapabilities.getSupportedHeights()));
                        }
                        if (VERSION.SDK_INT >= 23) {
                            hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                        }
                        arrayList.add(hashMap);
                    }
                }
                f16147a.put(str, arrayList);
                return arrayList;
            } catch (RuntimeException e) {
                Map hashMap2 = new HashMap();
                hashMap2.put("error", e.getClass().getSimpleName());
                arrayList = new ArrayList();
                arrayList.add(hashMap2);
                f16147a.put(str, arrayList);
                return arrayList;
            }
        }
    }

    @TargetApi(21)
    /* renamed from: a */
    private static Integer[] m19853a(Range<Integer> range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}
