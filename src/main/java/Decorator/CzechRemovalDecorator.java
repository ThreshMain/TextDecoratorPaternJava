package Decorator;

public class CzechRemovalDecorator extends DecoratorConvertor {
    protected final String to;

    public CzechRemovalDecorator(Convertor convertor) {
        this(convertor, "-");
    }

    public CzechRemovalDecorator(Convertor convertor, String to) {
        super(convertor);
        this.to = to;
    }

    @Override
    public String convert(String text) {
        text = super.convert(text);
        return text.replaceAll("[áčďéěňóřšťúůýžÁČĎÉĚŇÓŘŠŤÚŮÝŽ]", to);
    }
}
