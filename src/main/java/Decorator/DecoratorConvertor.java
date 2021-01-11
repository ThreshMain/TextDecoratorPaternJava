package Decorator;

public class DecoratorConvertor implements Convertor{
    protected Convertor convertor;

    protected DecoratorConvertor(Convertor convertor)
    {
        this.convertor = convertor;
    }

    public String convert(String text)
    {
        return convertor.convert(text);
    }
}
