package ru.netology.domain;

public class Radio {
    private static final int MIN_VOLUME = 0;
    private static final int MAX_VOLUME = 100;
    private static final int MIN_CHANNEL = 0;

    private int currentChannel;
    private int currentVolume;

    int totalChannels;
    int maxChannel;


    public Radio() {
        this(10);
        maxChannel = this.totalChannels - 1;
    }

    public Radio(int totalChannels) {
        this.totalChannels = totalChannels;
        maxChannel = this.totalChannels - 1;
    }

    public int getNumberChannelMin() {
        return MIN_CHANNEL;
    }

    public int getNumberChannelMax() {
        return maxChannel;
    }

    public int getVolumeLevelMin() {
        return MIN_VOLUME;
    }

    public int getVolumeLevelMax() {
        return MAX_VOLUME;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > totalChannels) {
            this.currentChannel = totalChannels;
            return;
        }
        if (currentChannel < MIN_CHANNEL) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > MAX_VOLUME) {
            this.currentVolume = MAX_VOLUME;
            return;
        }
        if (currentVolume < MIN_VOLUME) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void switchChannelUp() {
        if (currentChannel >= maxChannel) {
            setCurrentChannel(MIN_CHANNEL);
        } else {
            setCurrentChannel(currentChannel + 1);
        }
    }

    public void switchChannelDown() {
        if (currentChannel <= MIN_CHANNEL) {
            setCurrentChannel(totalChannels);
        } else {
            setCurrentChannel(currentChannel - 1);
        }
    }

    public void switchVolumeUp() {
        if (currentVolume >= MAX_VOLUME) {
            setCurrentVolume(MAX_VOLUME);
        } else {
            setCurrentVolume(currentVolume + 1);
        }
    }

    public void switchVolumeDown() {
        if (currentVolume <= MIN_VOLUME) {
            setCurrentVolume(MIN_VOLUME);
        } else {
            setCurrentVolume(currentVolume - 1);
        }
    }


}
