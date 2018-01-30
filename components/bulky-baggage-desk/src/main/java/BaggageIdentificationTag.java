public class BaggageIdentificationTag {
    private String id;
    private BoardingPass boardingPass;
    private Carrier carrier;
    private int sequence;
    private String via01;
    private String via02;
    private String via03;
    private Baggage baggage;
    private SpecialGood specialGood;
    private boolean isLocal;
    private boolean isTransfer;
    private boolean isTransferFirst;
    private String barCode;

    public BaggageIdentificationTag(String id, BoardingPass boardingPass, Carrier carrier, int sequence, String via01, String via02, String via03, Baggage baggage, SpecialGood specialGood, boolean isLocal, boolean isTransfer, boolean isTransferFirst, String barCode) {
        this.id = id;
        this.boardingPass = boardingPass;
        this.carrier = carrier;
        this.sequence = sequence;
        this.via01 = via01;
        this.via02 = via02;
        this.via03 = via03;
        this.baggage = baggage;
        this.specialGood = specialGood;
        this.isLocal = isLocal;
        this.isTransfer = isTransfer;
        this.isTransferFirst = isTransferFirst;
        this.barCode = barCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BoardingPass getBoardingPass() {
        return boardingPass;
    }

    public void setBoardingPass(BoardingPass boardingPass) {
        this.boardingPass = boardingPass;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public String getVia01() {
        return via01;
    }

    public void setVia01(String via01) {
        this.via01 = via01;
    }

    public String getVia02() {
        return via02;
    }

    public void setVia02(String via02) {
        this.via02 = via02;
    }

    public String getVia03() {
        return via03;
    }

    public void setVia03(String via03) {
        this.via03 = via03;
    }

    public Baggage getBaggage() {
        return baggage;
    }

    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }

    public SpecialGood getSpecialGood() {
        return specialGood;
    }

    public void setSpecialGood(SpecialGood specialGood) {
        this.specialGood = specialGood;
    }

    public boolean isLocal() {
        return isLocal;
    }

    public void setLocal(boolean local) {
        isLocal = local;
    }

    public boolean isTransfer() {
        return isTransfer;
    }

    public void setTransfer(boolean transfer) {
        isTransfer = transfer;
    }

    public boolean isTransferFirst() {
        return isTransferFirst;
    }

    public void setTransferFirst(boolean transferFirst) {
        isTransferFirst = transferFirst;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }
}
