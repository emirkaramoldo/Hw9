final public class ClassicalGuitar extends Guitar {
    private final int palmBoardWidth;

    public ClassicalGuitar(Type type, Brands brands, Price price, int numberOfStrings, int numberOfFrets,
                           String model, int palmBoardWidth) {
        super(type, brands, price, numberOfStrings, numberOfFrets, model);
        this.palmBoardWidth = palmBoardWidth;
    }
    @Override
    public void playSolo(){
        System.out.println("Вы играете соло на классической гитаре");
    }
    @Override
    public void playInstrument(){
        System.out.println("Звук классической гитары");
    }
    @Override
    public String getInfo(){
        return super.getInfo() + "\nШирина подладонника: " + palmBoardWidth + " мм";
    }
}
