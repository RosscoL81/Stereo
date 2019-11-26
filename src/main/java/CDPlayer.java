public class CDPlayer extends Component implements IPlay, IStop{

    private int noOfDiscs;

    public CDPlayer(int noOfDiscs, String make, String model){
        super(make, model);
        this.noOfDiscs = noOfDiscs;

    }

    public int getNoOfDiscs() {
        return this.noOfDiscs;
    }

    public String play(){
        return "play pressed";
    }

    public String stop(){
        return "stop pressed";
    }
}
