public class Main {
    public static void main(String[] args) {
        Price instrumentPrice = new Price(10000, "сом" );
        Price instrumentPrice1 = new Price(5000, "сом" );
        Price instrumentPrice2 = new Price(7000, "сом" );
        Price instrumentPrice3 = new Price(15000, "сом" );
        Guitar guitar = new Guitar(Type.STRING, Brands.FENDER, instrumentPrice,6,15, "CD60S");
        ClassicalGuitar classicalGuitar1 = new ClassicalGuitar(Type.STRING, Brands.CORT, instrumentPrice1, 6, 15, "AP550M", 15);
        ClassicalGuitar classicalGuitar2 = new ClassicalGuitar(Type.STRING, Brands.YAMAHA, instrumentPrice2, 6, 15, "C40", 15);
        ElectricGuitar electricGuitar = new ElectricGuitar(Type.STRING, Brands.IBANEZ, instrumentPrice3, 6, 22, "RGT42DX", 2);
        System.out.println(guitar.getInfo() + "\n");
        System.out.println(classicalGuitar1.getInfo() + "\n");
        System.out.println(classicalGuitar2.getInfo() + "\n");
        System.out.println(electricGuitar.getInfo() + "\n");
        System.out.println(guitar.getBrands()+ " " + guitar.getModel());
        guitar.playChords("A, C, E");
        guitar.playChords("A, C, E", "Am, Dm, Em");
        guitar.playSolo();
        guitar.playSolo("Ля Минор");
        guitar.playInstrument();
        guitar.brokeInstrument();
        System.out.println("\n" + classicalGuitar1.getBrands()+ " " + classicalGuitar1.getModel());
        classicalGuitar1.playSolo();
        classicalGuitar1.playSolo("До Мажор");
        classicalGuitar1.playInstrument();
        classicalGuitar1.brokeInstrument();
        System.out.println("\n" + classicalGuitar2.getBrands()+ " " + classicalGuitar2.getModel());
        classicalGuitar2.playSolo();
        classicalGuitar2.playSolo("Ля Мажор");
        classicalGuitar2.playInstrument();
        classicalGuitar2.brokeInstrument();
        System.out.println("\n" + electricGuitar.getBrands()+ " " + electricGuitar.getModel());
        electricGuitar.playSolo();
        electricGuitar.playSolo("Ре минор");
        electricGuitar.playInstrument();
        electricGuitar.brokeInstrument();
    }
}