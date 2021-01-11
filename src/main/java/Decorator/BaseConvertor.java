package Decorator;

public class BaseConvertor implements Convertor{
    @Override
    public String convert(String text) {
        return text;
    }
}
