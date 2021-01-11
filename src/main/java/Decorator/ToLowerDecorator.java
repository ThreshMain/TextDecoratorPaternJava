package Decorator;

public class ToLowerDecorator extends DecoratorConvertor{
    public ToLowerDecorator(Convertor convertor) {
        super(convertor);
    }

    @Override
    public String convert(String text) {
        text=super.convert(text);
        return text.toLowerCase();
    }
}
