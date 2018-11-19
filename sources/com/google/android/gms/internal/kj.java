package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.ar;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.tinder.api.ManagerWebServices;
import java.util.Map;

@zzzv
public final class kj implements zzt<zzamp> {
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzamp zzamp = (zzamp) obj;
        if (((Boolean) aja.m19221f().m19334a(alo.bg)).booleanValue()) {
            li zzsg = zzamp.zzsg();
            if (zzsg == null) {
                try {
                    li liVar = new li(zzamp, Float.parseFloat((String) map.get(ManagerWebServices.PARAM_DURATION)), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                    zzamp.zza(liVar);
                    zzsg = liVar;
                } catch (Throwable e) {
                    hx.m19912b("Unable to parse videoMeta message.", e);
                    ar.i().m27296a(e, "VideoMetaGmsgHandler.onGmsg");
                }
            }
            boolean equals = "1".equals(map.get(ManagerWebServices.PARAM_IS_MUTED));
            float parseFloat = Float.parseFloat((String) map.get("currentTime"));
            int parseInt = Integer.parseInt((String) map.get("playbackState"));
            if (parseInt < 0 || 3 < parseInt) {
                parseInt = 0;
            }
            String str = (String) map.get("aspectRatio");
            float parseFloat2 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
            if (hx.m19910a(3)) {
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 79);
                stringBuilder.append("Video Meta GMSG: isMuted : ");
                stringBuilder.append(equals);
                stringBuilder.append(" , playbackState : ");
                stringBuilder.append(parseInt);
                stringBuilder.append(" , aspectRatio : ");
                stringBuilder.append(str);
                hx.m19911b(stringBuilder.toString());
            }
            zzsg.m31604a(parseFloat, parseInt, equals, parseFloat2);
        }
    }
}
