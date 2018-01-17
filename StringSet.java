import java.util.ArrayList;

/**
 * Created by DJ on 6/27/2017.
 *  Write a class StringSet.  A StringSet object is given a series of up to 10 String objects.
 *  It stores these Strings (or a reference to them, to be precise) and can perform limited calculations on the entire series.

 The StringSet class has the following specification:

 */
public class StringSet {
    // an instance variable of type String[]
    private ArrayList<String> words = new ArrayList<>();

// an int instance variable that indicates the number of String objects that the StringSet currently contains
    private int stringCount = 0;

// a single no-argument constructor

    public StringSet() {
    }

    // a mutator that adds a String newStr to the StringSet object
    void add(String newStr)
    {
        /*array would go here if needed but might need to declare the array at the top of the class.*/
        this.words.add(newStr);
        stringCount++;
    }

    // an accessor that returns the number of String objects that have been added to this StringSet object
    int size()
    {
        return stringCount;
    }

    // an accessor that returns the total number of characters in all of the Strings that have been added to this StringSet object
    int numChars()
    {
        int charCount = 0;
        for (int i = 0; i<  words.size(); i++)
        {
            String totalCount = words.get(i);
           for(int j =0; j< totalCount.length(); j++)
           {
                    charCount++;
            }
        }
        return charCount;
    }

    // an accessor that returns the number of Strings in the StringSet object that have exactly len characters
    int countStrings(int len)
    {
        int numStrings = 0;
        for (int i = 0; i<words.size(); i++ )
        {
            if(words.get(i).length() == len)
            {
                numStrings++;
            }
        }
        return numStrings;
    }

}




