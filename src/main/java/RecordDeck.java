public class RecordDeck extends Component implements IPlay, IStop{

    private int playSpeeds;

    public RecordDeck(int playSpeeds, String make, String model){
        super(make, model);
        this.playSpeeds = playSpeeds;

    }

    public int speed() {
        return this.playSpeeds;
    }

    public String play(){
        return "play pressed";
    }

    public String stop(){
        return "stop pressed";
    }
}
