package com.tinder.etl.event;

class zz implements EtlField<String> {
    public String description() {
        return "JSON object representing the anthem shown, e.g. for the anthem in the screenshot: { title: \"What You Don't Do - (feat. FKJ)\", artist: \"Lianne La Havas\" }";
    }

    public String name() {
        return "valueProfileElementAnthem";
    }

    zz() {
    }

    public Class<String> type() {
        return String.class;
    }
}
