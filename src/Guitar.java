public class Guitar extends MusicalInstrument {
    private int numberOfStrings;
    private int numberOfFrets;
    private String model;
    public Guitar(Type type, Brands brands, Price price, int numberOfStrings, int numberOfFrets, String model) {
        super(type, brands, price);
        this.numberOfStrings = numberOfStrings;
        this.numberOfFrets = numberOfFrets;
        this.model = model;
    }
    public int getNumberOfStrings() {
        return numberOfStrings;
    }
    public int getNumberOfFrets() {
        return numberOfFrets;
    }
    public String getModel() {
        return model;
    }

    final public void playChords(String major, String minor){
        System.out.println("Вы играете мажорные аккорды " + major + " и " +
                "минорные аккорды " + minor);
    }
    final public void playChords(String major){
        System.out.println("Вы играете мажорные аккорды " + major);
    }
    public void playSolo(){
        System.out.println("Вы играете соло");
    }
    public void playSolo(String soloSound){
        System.out.println("Вы играете соло " + soloSound);
    }
    @Override
    public void playInstrument(){
        System.out.println("Звук гитары");
    }
    @Override
    final public void brokeInstrument(){
        System.out.println("Вы сломали инструмент и вам придется за него платить!");
    }
    @Override
    public String getInfo(){
        return "Бренд: " + super.getBrands() +
                "\nМодель: " + model +
                "\nКоличество струн: " + numberOfStrings +
                "\nКоличество ладов: " + numberOfFrets +
                "\nТип инструмента: " + super.getType() +
                "\nСтоимость: " + super.getPrice().getPrice() + " " + super.getPrice().getCurrency();
    }
}
