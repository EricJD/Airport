package base;

public class BaggageIdentificationTag {

    private String id;
    private BoardingPass boardingPass;
    private Carrier carrier;
    private int sequence;
    private String via01 = "N/A";
    private String via02 = "N/A";
    private String via03 = "N/A";
    private Baggage baggage;
    private SpecialGood specialGood;
    private boolean isLocal;
    private boolean isTransfer;
    private boolean isTransferFirst;
    private String barCode;

    public BaggageIdentificationTag(String id, BoardingPass boardingPass, Carrier carrier,
                                    int sequence, String via01, String via02, String via03,
                                    Baggage baggage, SpecialGood specialGood, boolean isLocal,
                                    boolean isTransfer, boolean isTransferFirst, String barCode) {
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

    public BoardingPass getBoardingPass() {
        return boardingPass;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public int getSequence() {
        return sequence;
    }

    public String getVia01() {
        return via01;
    }

    public String getVia02() {
        return via02;
    }

    public String getVia03() {
        return via03;
    }

    public Baggage getBaggage() {
        return baggage;
    }

    public SpecialGood getSpecialGood() {
        return specialGood;
    }

    public boolean isLocal() {
        return isLocal;
    }

    public boolean isTransfer() {
        return isTransfer;
    }

    public boolean isTransferFirst() {
        return isTransferFirst;
    }

    public String getBarCode() {
        return barCode;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setBoardingPass(BoardingPass boardingPass) {
        this.boardingPass = boardingPass;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public void setVia01(String via01) {
        this.via01 = via01;
    }

    public void setVia02(String via02) {
        this.via02 = via02;
    }

    public void setVia03(String via03) {
        this.via03 = via03;
    }

    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }

    public void setSpecialGood(SpecialGood specialGood) {
        this.specialGood = specialGood;
    }

    public void setLocal(boolean local) {
        isLocal = local;
    }

    public void setTransfer(boolean transfer) {
        isTransfer = transfer;
    }

    public void setTransferFirst(boolean transferFirst) {
        isTransferFirst = transferFirst;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    @Override
    public String toString() {
        return "BaggageIdentificationTag{" +
                "id='" + id + '\'' +
                ", boardingPass=" + boardingPass +
                ", carrier=" + carrier +
                ", sequence=" + sequence +
                ", via01='" + via01 + '\'' +
                ", via02='" + via02 + '\'' +
                ", via03='" + via03 + '\'' +
                ", baggage=" + baggage +
                ", specialGood=" + specialGood +
                ", isLocal=" + isLocal +
                ", isTransfer=" + isTransfer +
                ", isTransferFirst=" + isTransferFirst +
                ", barCode='" + barCode + '\'' +
                '}';
    }
}
