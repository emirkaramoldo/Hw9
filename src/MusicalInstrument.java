public class MusicalInstrument {
    private Type type;
    private Brands brands;
    private Price price;
    public MusicalInstrument(Type type, Brands brands, Price price) {
        this.type = type;
        this.brands = brands;
        this.price = price;
    }
    public Type getType() {
        return type;
    }
    public Brands getBrands() {
        return brands;
    }
    public Price getPrice() {
        return price;
    }
    public void playInstrument(){
        System.out.println("Звук музыкального инструмента");
    }
    public void brokeInstrument(){
        System.out.println("Вы сломали инструмент");
    }
    public String getInfo(){
        return "Тип: " + type +
                "\nБренд: " + brands +
                "\nСтоимость: " + price.getPrice() + " " + price.getCurrency();
    }
}
