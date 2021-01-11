package Decorator;

public class ReplacementDecorator extends DecoratorConvertor {
    private char from;
    private char to;

    public ReplacementDecorator(Convertor convertor, char from, char to) {
        super(convertor);
        this.from = from;
        this.to = to;
    }

    @Override
    public String convert(String text) {
        text = super.convert(text);
        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == from) {
                newText.append(to);
            } else {
                newText.append(text.charAt(i));
            }
        }
        return newText.toString();
    }
}
