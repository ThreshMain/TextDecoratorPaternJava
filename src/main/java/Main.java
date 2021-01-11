import Decorator.*;

public class Main {
    public static void main(String[] args) {
        String text;
        if(args.length>0){
            text=String.join(" ",args);
        }else{
            text="Testing 1234 šěřšěř ADGHNLKADHN adngklhn... #^&^$!(";
        }
        Convertor base=new BaseConvertor();
        System.out.println("BaseConvertor = " + base.convert(text));
        base=new ReplacementDecorator(base,'e','a');
        System.out.println("ReplacementDecorator = " + base.convert(text));
        base=new CzechRemovalDecorator(base);
        System.out.println("CzechRemovalDecorator = " + base.convert(text));
        base=new ToLowerDecorator(base);
        System.out.println("ToLowerDecorator = " + base.convert(text));
        base=new ToMorseDecorator(base);
        System.out.println("ToMorseDecorator = " + base.convert(text));

    }
}
