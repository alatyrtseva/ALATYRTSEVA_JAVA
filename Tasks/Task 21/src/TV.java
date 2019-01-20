public class TV {

    private static final int MAX_VOLUME = 25;
    private boolean isOn;
    private int volumeLevel;
    private Channel currentChannel;
    private Channel channels[];
    private RemoteController remote;

    public TV(Channel currentChannel, Channel[] channels, RemoteController remote) {
        this.isOn = false;
        this.volumeLevel = 5;
        this.currentChannel = currentChannel;
        this.channels = channels;
        this.remote = remote;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public Channel getCurrentChannel() {
        return currentChannel;
    }

    public Channel[] getChannels() {
        return channels;
    }

    void changeState(){
        this.isOn = !(this.isOn);
    }

    protected void setCurrentChannel(Channel currentChannel) {
        if (this.isOn) this.currentChannel = currentChannel;
    }

    protected void changeVolumeLevel (boolean increase){
        if (increase){
            if (volumeLevel < this.MAX_VOLUME) volumeLevel += 1;
        } else {
            if (volumeLevel > 0) volumeLevel -= 1;
        }
    }

    protected void showProgramList(){
        Program programList[] = currentChannel.getProgramList();

        for (int i = 0; i < programList.length && programList[i] != null; i++) {
            System.out.println(programList[i].getTime() + " " + programList[i].getName());
        }
    }
}
