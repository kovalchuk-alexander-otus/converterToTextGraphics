package ru.netology.graphics;

import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.image.TextGraphicsConverterImpl;
import ru.netology.graphics.server.GServer;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new TextGraphicsConverterImpl(); // Создайте тут объект вашего класса конвертера

        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем

//          Или то же, но с выводом на экран:
//        converter.setMaxRatio(1.5);
//        converter.setMaxWidth(200);
//        converter.setMaxHeight(200);
//
//        TextColorSchema schema = new TextColorSchemaImpl(new char[]{'@', '#', '$', '%', '&', 'Q', 'q', 'i', '^', '*', '_', ' '});
//        converter.setTextColorSchema(schema);
//
//        String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
//        String imgTxt = converter.convert(url);
//        System.out.println(imgTxt);
    }
}
