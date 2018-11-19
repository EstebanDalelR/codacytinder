package com.mapbox.mapboxsdk.style.sources;

import android.support.annotation.Size;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.tinder.api.ManagerWebServices;
import java.util.HashMap;
import java.util.Map;

public class TileSet {
    private String attribution;
    private Float[] bounds;
    private Float[] center;
    private String[] data;
    private String description;
    private String encoding;
    private String[] grids;
    private String legend;
    private Float maxZoom;
    private Float minZoom;
    private String name;
    private String scheme;
    private String template;
    private final String tilejson;
    private final String[] tiles;
    private String version;

    public TileSet(String str, String... strArr) {
        this.tilejson = str;
        this.tiles = strArr;
    }

    public String getTilejson() {
        return this.tilejson;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public String getAttribution() {
        return this.attribution;
    }

    public void setAttribution(String str) {
        this.attribution = str;
    }

    public String getTemplate() {
        return this.template;
    }

    public void setTemplate(String str) {
        this.template = str;
    }

    public String getLegend() {
        return this.legend;
    }

    public void setLegend(String str) {
        this.legend = str;
    }

    public String getScheme() {
        return this.scheme;
    }

    public void setScheme(String str) {
        this.scheme = str;
    }

    public String[] getTiles() {
        return this.tiles;
    }

    public String[] getGrids() {
        return this.grids;
    }

    public void setGrids(String... strArr) {
        this.grids = strArr;
    }

    public String[] getData() {
        return this.data;
    }

    public void setData(String... strArr) {
        this.data = strArr;
    }

    public float getMinZoom() {
        return this.minZoom.floatValue();
    }

    public void setMinZoom(float f) {
        this.minZoom = Float.valueOf(f);
    }

    public float getMaxZoom() {
        return this.maxZoom.floatValue();
    }

    public void setMaxZoom(float f) {
        this.maxZoom = Float.valueOf(f);
    }

    public Float[] getBounds() {
        return this.bounds;
    }

    public void setBounds(@Size(4) Float... fArr) {
        this.bounds = fArr;
    }

    public String getEncoding() {
        return this.encoding;
    }

    public void setEncoding(String str) {
        this.encoding = str;
    }

    public Float[] getCenter() {
        return this.center;
    }

    public void setCenter(@Size(2) Float... fArr) {
        this.center = fArr;
    }

    public void setCenter(LatLng latLng) {
        this.center = new Float[]{Float.valueOf((float) latLng.getLongitude()), Float.valueOf((float) latLng.getLatitude())};
    }

    Map<String, Object> toValueObject() {
        Map<String, Object> hashMap = new HashMap();
        hashMap.put("tilejson", this.tilejson);
        hashMap.put("tiles", this.tiles);
        if (this.name != null) {
            hashMap.put("name", this.name);
        }
        if (this.description != null) {
            hashMap.put(ManagerWebServices.PARAM_BADGE_DESC, this.description);
        }
        if (this.version != null) {
            hashMap.put("version", this.version);
        }
        if (this.attribution != null) {
            hashMap.put("attribution", this.attribution);
        }
        if (this.template != null) {
            hashMap.put("template", this.template);
        }
        if (this.legend != null) {
            hashMap.put("legend", this.legend);
        }
        if (this.scheme != null) {
            hashMap.put("scheme", this.scheme);
        }
        if (this.grids != null) {
            hashMap.put("grids", this.grids);
        }
        if (this.data != null) {
            hashMap.put(ManagerWebServices.FB_DATA, this.data);
        }
        if (this.minZoom != null) {
            hashMap.put("minzoom", this.minZoom);
        }
        if (this.maxZoom != null) {
            hashMap.put("maxzoom", this.maxZoom);
        }
        if (this.bounds != null) {
            hashMap.put("bounds", this.bounds);
        }
        if (this.center != null) {
            hashMap.put("center", this.center);
        }
        if (this.encoding != null) {
            hashMap.put("encoding", this.encoding);
        }
        return hashMap;
    }
}
