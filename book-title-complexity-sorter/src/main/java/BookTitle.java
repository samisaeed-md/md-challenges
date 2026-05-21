import java.util.*;

public class BookTitle {
    void main() {
        String[] booksArray = {"The Catcher in the Rye", "To Kill a Mockingbird", "1984", "Moby Dick"};
        System.out.println(Arrays.toString(orderArray(createMultiDimArray(booksArray))));
    }

    public static Object[][] createMultiDimArray(String[] booksArray) {
        // Create a multidimensional array, {{<title>, <asciiValue>}, ...}
        Object[][] titlesAndValues = new Object[booksArray.length][2];

        for (int i = 0; i < booksArray.length; i++) {
            titlesAndValues[i] = findAsciiValue(booksArray[i]);
        }
        return titlesAndValues;
    }

    public static Object[] findAsciiValue(String bookTitle) {
        // Find the ascii value of one book title:
        int counter = 0;
        for (int i = 0; i < bookTitle.length(); i++) {
            char character = bookTitle.charAt(i);
            int asciiValue = (int) character;
            counter += asciiValue;
        }
        Object[] book = {bookTitle, counter};
        return book;
    }

    public static String[] orderArray(Object[][] titlesAndValues) {
        // Create a sorted array of the ascii values:
        int[] valuesArray = new int[titlesAndValues.length];
        for (int i = 0; i < titlesAndValues.length; i++) {
            valuesArray[i] = (int) titlesAndValues[i][1];
        }
        Arrays.sort(valuesArray);

        // Match sorted values to corresponding titles to create a sorted array of titles:
        String[] sortedTitles = new String[valuesArray.length];

        for (int i = 0; i < valuesArray.length; i++) {
            int asciiValue = valuesArray[i];

            for (int j = 0; j < titlesAndValues.length; j++) {
                if ((int) titlesAndValues[j][1] == asciiValue) {
                    sortedTitles[i] = (String) titlesAndValues[j][0];
                    break;
                }
            }
        }
        return sortedTitles;
    }

}