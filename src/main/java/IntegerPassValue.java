import java.lang.reflect.Field;

public class IntegerPassValue {
    public int passValue(){
        Integer integer = new Integer(145);
        handleRst(integer);
        return integer.intValue();
    }

    public Book changeName(){
        Book book = new Book("Java", 12);
        changeBook(book);
        return book;
    }

    private void changeBook(Book book) {
        book.setName("Java in door");
        book.setPrice(13);
    }

    private void handleRst(Integer integer) {
        Class aClass = integer.getClass();
        try {
            Field field = aClass.getDeclaredField("value");
            field.setAccessible(true);
            field.set(integer, 146);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
