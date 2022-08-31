package HomeWork1;

public class NameSwitch implements ICommunicationPrinter {

    @Override
    public String welcom(String name) {
        switch (name){
            case "Вася":
                return "Привет\nЯ тебя так долго ждал";
            case "Анастасия":
                return "Я тебя так долго ждал";
            default:
                return "Добрый день, а вы кто?";
        }
    }
}


