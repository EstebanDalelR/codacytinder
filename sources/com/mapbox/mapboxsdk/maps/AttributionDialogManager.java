package com.mapbox.mapboxsdk.maps;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ArrayAdapter;
import com.mapbox.android.telemetry.TelemetryEnabler;
import com.mapbox.android.telemetry.TelemetryEnabler.State;
import com.mapbox.mapboxsdk.C5812R;
import com.mapbox.mapboxsdk.attribution.Attribution;
import com.mapbox.mapboxsdk.attribution.AttributionParser.Options;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.style.sources.Source;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class AttributionDialogManager implements OnClickListener, View.OnClickListener {
    private static final String MAP_FEEDBACK_LOCATION_FORMAT = "https://www.mapbox.com/map-feedback/#/%f/%f/%d";
    private static final String MAP_FEEDBACK_URL = "https://www.mapbox.com/map-feedback";
    private Set<Attribution> attributionSet;
    private final Context context;
    private final MapboxMap mapboxMap;

    /* renamed from: com.mapbox.mapboxsdk.maps.AttributionDialogManager$1 */
    class C58281 implements OnClickListener {
        C58281() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            TelemetryEnabler.updateTelemetryState(State.ENABLED);
            Telemetry.obtainTelemetry().enable();
            dialogInterface.cancel();
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.AttributionDialogManager$2 */
    class C58292 implements OnClickListener {
        C58292() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AttributionDialogManager.this.showWebPage(AttributionDialogManager.this.context.getResources().getString(C5812R.string.mapbox_telemetryLink));
            dialogInterface.cancel();
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.maps.AttributionDialogManager$3 */
    class C58303 implements OnClickListener {
        C58303() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Telemetry.obtainTelemetry().disable();
            TelemetryEnabler.updateTelemetryState(State.DISABLED);
            dialogInterface.cancel();
        }
    }

    private static class AttributionBuilder {
        private final MapboxMap mapboxMap;

        AttributionBuilder(MapboxMap mapboxMap) {
            this.mapboxMap = mapboxMap;
        }

        private Set<Attribution> build() {
            List arrayList = new ArrayList();
            for (Source attribution : this.mapboxMap.getSources()) {
                arrayList.add(attribution.getAttribution());
            }
            return new Options().withCopyrightSign(true).withImproveMap(true).withTelemetryAttribution(true).withAttributionData((String[]) arrayList.toArray(new String[arrayList.size()])).build().getAttributions();
        }
    }

    public AttributionDialogManager(@NonNull Context context, @NonNull MapboxMap mapboxMap) {
        this.context = context;
        this.mapboxMap = mapboxMap;
    }

    public void onClick(View view) {
        this.attributionSet = new AttributionBuilder(this.mapboxMap).build();
        if (((this.context instanceof Activity) != null ? ((Activity) this.context).isFinishing() : null) == null) {
            showAttributionDialog(getAttributionTitles());
        }
    }

    protected void showAttributionDialog(String[] strArr) {
        Builder builder = new Builder(this.context);
        builder.setTitle(C5812R.string.mapbox_attributionsDialogTitle);
        builder.setAdapter(new ArrayAdapter(this.context, C5812R.layout.mapbox_attribution_list_item, strArr), this);
        builder.show();
    }

    private String[] getAttributionTitles() {
        List arrayList = new ArrayList();
        for (Attribution title : this.attributionSet) {
            arrayList.add(title.getTitle());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (isLatestEntry(i) != null) {
            showTelemetryDialog();
        } else {
            showMapFeedbackWebPage(i);
        }
    }

    private boolean isLatestEntry(int i) {
        return i == getAttributionTitles().length - 1;
    }

    private void showTelemetryDialog() {
        Builder builder = new Builder(this.context);
        builder.setTitle(C5812R.string.mapbox_attributionTelemetryTitle);
        builder.setMessage(C5812R.string.mapbox_attributionTelemetryMessage);
        builder.setPositiveButton(C5812R.string.mapbox_attributionTelemetryPositive, new C58281());
        builder.setNeutralButton(C5812R.string.mapbox_attributionTelemetryNeutral, new C58292());
        builder.setNegativeButton(C5812R.string.mapbox_attributionTelemetryNegative, new C58303());
        builder.show();
    }

    private void showMapFeedbackWebPage(int i) {
        i = ((Attribution[]) this.attributionSet.toArray(new Attribution[this.attributionSet.size()]))[i].getUrl();
        if (i.contains(MAP_FEEDBACK_URL)) {
            i = buildMapFeedbackMapUrl(this.mapboxMap.getCameraPosition());
        }
        showWebPage(i);
    }

    private String buildMapFeedbackMapUrl(CameraPosition cameraPosition) {
        if (cameraPosition == null) {
            return MAP_FEEDBACK_URL;
        }
        return String.format(Locale.getDefault(), MAP_FEEDBACK_LOCATION_FORMAT, new Object[]{Double.valueOf(cameraPosition.target.getLongitude()), Double.valueOf(cameraPosition.target.getLatitude()), Integer.valueOf((int) cameraPosition.zoom)});
    }

    private void showWebPage(@android.support.annotation.NonNull java.lang.String r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x0014 }
        r1 = "android.intent.action.VIEW";	 Catch:{ ActivityNotFoundException -> 0x0014 }
        r0.<init>(r1);	 Catch:{ ActivityNotFoundException -> 0x0014 }
        r3 = android.net.Uri.parse(r3);	 Catch:{ ActivityNotFoundException -> 0x0014 }
        r0.setData(r3);	 Catch:{ ActivityNotFoundException -> 0x0014 }
        r3 = r2.context;	 Catch:{ ActivityNotFoundException -> 0x0014 }
        r3.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x0014 }
        goto L_0x0020;
    L_0x0014:
        r3 = r2.context;
        r0 = com.mapbox.mapboxsdk.C5812R.string.mapbox_attributionErrorNoBrowser;
        r1 = 1;
        r3 = android.widget.Toast.makeText(r3, r0, r1);
        r3.show();
    L_0x0020:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.mapboxsdk.maps.AttributionDialogManager.showWebPage(java.lang.String):void");
    }
}
