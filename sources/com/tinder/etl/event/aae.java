package com.tinder.etl.event;

class aae implements EtlField<String> {
    public String description() {
        return "JSON object containing the count of the top artists, and the artists previewed, e.g. for the element in the screenshot: { numArtists: 10, topArtists: ['Lianne La Havas', 'Kendrick Lamar', 'Bob Marley', 'Blu & Exile'] }";
    }

    public String name() {
        return "valueProfileElementTopArtists";
    }

    aae() {
    }

    public Class<String> type() {
        return String.class;
    }
}
