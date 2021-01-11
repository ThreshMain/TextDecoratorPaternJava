import Decorator.*;

public class Main {
    public static void main(String[] args) {
        String testingString="kAŘ12 12";
        Convertor base=new BaseConvertor();
        System.out.println("BaseConvertor = " + base.convert(testingString));
        base=new ReplacementDecorator(base,'k','j');
        System.out.println("ReplacementDecorator = " + base.convert(testingString));
        base=new CzechRemovalDecorator(base);
        System.out.println("CzechRemovalDecorator = " + base.convert(testingString));
        base=new ToLowerDecorator(base);
        System.out.println("ToLowerDecorator = " + base.convert(testingString));
        base=new ToMorseDecorator(base);
        System.out.println("ToMorseDecorator = " + base.convert(testingString));

    }
}
