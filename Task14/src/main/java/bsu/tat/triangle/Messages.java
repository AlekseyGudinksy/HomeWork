package bsu.tat.triangle;

/**
 * Class which contains messages for all expressions
 *
 * @author Aleksey Gudinsky
 */
public class Messages {
    static Messages msg = new Messages();
    final String HELLO = "Input value of triangle side's";
    final String EQUILATERAL = "Triangle is Equilateral";
    final String ISOSCELES = "Triangle is Isosceles";
    final String USUAL = "Triangle is Usual";
    final String SYMBOL_INPUT = "You inputted symbols, not a number";
    final String LENGTH_OF_A_SIDE = "Length of side a is = ";
    final String LENGTH_OF_B_SIDE = "Length of side b is = ";
    final String LENGTH_OF_C_SIDE = "Length of side c is = ";
    final String TRIANGLE_DONOT_EXIST = "Triangle can't have that length of sides";
    final String NEGATIVE_LENGTH = "Triangle can't have a side less then 0";
    final String ZERO_LENGTH = "Triangle can't have a side equal to 0";
}
