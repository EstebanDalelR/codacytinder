package com.tinder.etl.event;

class aad implements EtlField<String> {
    public String description() {
        return "JSON object containing the count of mutual top artists, and the mutual artists previewed, e.g. for the element in the screenshot: { numMutualArtists: 3, mutualTopArtists: ['Lianne La Havas', 'Kendrick Lamar', 'Bob Marley'] }";
    }

    public String name() {
        return "valueProfileElementMutualTopArtists";
    }

    aad() {
    }

    public Class<String> type() {
        return String.class;
    }
}
