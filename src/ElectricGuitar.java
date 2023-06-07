final public class ElectricGuitar extends Guitar {
    private final int numberOfSwitches;

    public ElectricGuitar(Type type, Brands brands, Price price, int numberOfStrings, int numberOfFrets,
                          String model, int numberOfSwitches) {
        super(type, brands, price, numberOfStrings, numberOfFrets, model);
        this.numberOfSwitches = numberOfSwitches;
    }
    @Override
    public void playSolo(){
        System.out.println("Вы играете соло на электро гитаре");
    }
    @Override
    public void playInstrument(){
        System.out.println("Звук электро гитары");
    }
    @Override
    public String getInfo(){
        return super.getInfo() + "\nКоличество переключателей: " + numberOfSwitches;
    }
}
