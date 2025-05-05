//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[][] booksAndAuthors ={
                {"Война и Мир", "Лев Толстой"},
                {"1984", "Джордж Оруэлл"},
                {"Мастер и Маргарита", "Михаил Булгаков"}
        };

        //Форматируем и выводим каждую пару

        for(String[] pair : booksAndAuthors){
            String bookTitle = pair[0];
            String authorFullName = pair[1];
            String formattedString = formatBookAuthor(bookTitle, authorFullName);
            System.out.println(formattedString);
        }
        

    }

    private static String formatBookAuthor(String bookTitle, String authorFullName) {
            return "\"" + bookTitle + "\" " + authorFullName;
    }
}