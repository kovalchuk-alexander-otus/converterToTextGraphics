package ru.netology.graphics.image;

public class TextColorSchemaImpl implements TextColorSchema {

    char[] palette;

    public TextColorSchemaImpl() {
        this.palette = new char[]{'▇', '●', '◉', '◍', '◎', '○', '☉', '◌', '-'};
    }

    public TextColorSchemaImpl(char[] palette) {
        this.palette = palette;
    }

    @Override
    public char convert(int color) {
        return this.palette[(int) Math.min(Math.floor(color / (256 / palette.length)), palette.length-1)];
    }
}
