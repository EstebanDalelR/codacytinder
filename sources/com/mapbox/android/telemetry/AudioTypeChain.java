package com.mapbox.android.telemetry;

class AudioTypeChain {
    AudioTypeChain() {
    }

    AudioTypeResolver setup() {
        AudioTypeResolver unknownAudioType = new UnknownAudioType();
        AudioTypeResolver speakerAudioType = new SpeakerAudioType();
        speakerAudioType.nextChain(unknownAudioType);
        unknownAudioType = new HeadphonesAudioType();
        unknownAudioType.nextChain(speakerAudioType);
        speakerAudioType = new BluetoothAudioType();
        speakerAudioType.nextChain(unknownAudioType);
        return speakerAudioType;
    }
}
