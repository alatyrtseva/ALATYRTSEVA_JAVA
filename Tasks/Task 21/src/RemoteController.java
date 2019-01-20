public class RemoteController {

    private TV tv;

    public RemoteController(TV tv) {
        this.tv = tv;
    }

    protected void tvChangeState(){
        this.tv.changeState();
    }

    protected void changeChannel(Channel channel){
        this.tv.setCurrentChannel(channel);
    }

    protected void increaseVolume(){
        this.tv.changeVolumeLevel(true);
    }

    protected void decreaseVolume(){
        this.tv.changeVolumeLevel(false);
    }

    protected void showProgramList(){
        this.tv.showProgramList();
    }

    protected void showCurrentProramInfo(){
        System.out.println(this.tv.getCurrentChannel().getCurrentProgram().getTime());
        System.out.println(this.tv.getCurrentChannel().getCurrentProgram().getName());
        System.out.println(this.tv.getCurrentChannel().getCurrentProgram().getDescription());
    }
}
