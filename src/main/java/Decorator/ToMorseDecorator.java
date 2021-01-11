package Decorator;

import java.util.Hashtable;
import java.util.Locale;

public class ToMorseDecorator extends DecoratorConvertor {
    protected static Hashtable<Character,String> morse;

    public ToMorseDecorator(Convertor convertor) {
        super(convertor);
        if(morse==null){
            morse=new Hashtable<>(44);
            morse.put('A',".-");
            morse.put('B',"-...");
            morse.put('C',"-.-");
            morse.put('D',"-..");
            morse.put('E',".");
            morse.put('F',"..-.");
            morse.put('G',"--.");
            morse.put('H',"....");
            morse.put('I',"..");
            morse.put('J',".---");
            morse.put('K',"-.-");
            morse.put('L',".-..");
            morse.put('M',"--");
            morse.put('N',"-.");
            morse.put('O',"---");
            morse.put('P',".--.");
            morse.put('Q',"--.-");
            morse.put('R',".-.");
            morse.put('S',"...");
            morse.put('T',"-");
            morse.put('U',"..-");
            morse.put('V',"...-");
            morse.put('W',".--");
            morse.put('X',"-..-");
            morse.put('Y',"-.--");
            morse.put('Z',"--..");
            morse.put('1',".----");
            morse.put('2',"..---");
            morse.put('3',"...--");
            morse.put('4',"....-");
            morse.put('5',".....");
            morse.put('6',"-....");
            morse.put('7',"--...");
            morse.put('8',"---..");
            morse.put('9',"----.");
            morse.put('0',"------");
            morse.put(' ',"/");
            morse.put(',',"--..--");
            morse.put('?',"..--..");
            morse.put(':',"---...");
            morse.put('-',"-....-");
            morse.put('=',"-...-");
            morse.put('.',".-.-.-");
            morse.put('/',"-..-.");
        }
    }

    @Override
    public String convert(String text) {
        text = super.convert(text);
        text=text.toUpperCase();
        StringBuilder newText=new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if(morse.containsKey(text.charAt(i))){
                newText.append(morse.get(text.charAt(i))).append(' ');
            }else{
                newText.append(text.charAt(i));
            }
        }
        return newText.toString();
    }
}
