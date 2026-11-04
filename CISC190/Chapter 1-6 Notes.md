you can declare a multiline note with the edge things
Scanner is a object with functions
new keyword allocates memory
scnr.nextInt() is like cin >>

you connect var and strings with (var + "str" + var...)

PEMDAS but left to right if equal priority. 
   P  ()
   U  unary - (negation)
   M D * / % 
   A S + -

System.out.printf("%.3f", 9.1357); this rounds 9.1357 to 9.136

final keyword makes a variable immutable

Math.function is a thing LOL like a header file

typecast is like (datatype)x Wow!!
implicit typcast is upgrade to biggest data type

escape sequences
\n newline
\t tab
\' single quote
\" double quote
\\ back slash


scnr.nextLine() is like cin for the whole line instead of scnr.nextInt()
scnr.next() is like cin but separated with whitespace

long keyword can be use to declare a Super long data type
float takes up 32 bits
double takes up 64 bits

import java.util.Random (makes a class thing for random shi)
randGen.nextInt(int); = 0 1 2 3 4 ... int
randGen.setSeed(int); sets the random seed

API documentation
import java.name_of_api... this includes 

the reason you call 
   Scanner scnr = new Scanner(System.in)
      System.in means like the input stream and scnr can read from there

int x;
var y; y takes on x data type!!!

STRING COMPARISM
Relation	                         Returns	                   Expression to detect
str1 less than str2	         Negative number	            str1.compareTo(str2) < 0
str1 equal to str2	                0	                     str1.compareTo(str2) == 0
str1 greater than str2	      Positive number	            str1.compareTo(str2) > 0

you can yse str.charAt(0) to return the letter
you can use str.length() to get int value for length of string
you can use str1.concat(s2) to concatenate

Character.isLetter() true or false
Character.isDigit()	true if digit: 0-9.
Character.isWhitespace() true if whitespace
Character.toUpperCase()
Character.toLowerCase()

str.indexOf(textToFind, n) to find where the nth time a string happens
str.lastIndexOf(textToFind) to find the last occurence of string to find

str.substring(n,m) returns the string from n to m-1 
str.replace(old string, new string) replaces all instances of old string in new string

TERNARY OPERATOR
y = (condition) ? what happens if true : what happens if false THIS IS ACTUALLY SO GOOD

FLOAT COMPARISONS
ok so to compare floats, you cannot do == because yk floating point errors
what you need is Math.abs and to declare a very small epsilon value
so its like Math.abs(x-y) < epsilon to compare :)

SHORT CIRCUIT EVALUATION
in an and or statement, if one thing is true or false, the other does not need to be evaluated
like short circuit evaluation skips evaluating the second thing :)))

LOOPS
while (condition){}
for ( i = 0; conditionExpression; i++) {
 

STRING LITERAL
YOU CANNOT DO COMPARISON OF == YOU MUST USE str1.equals(str2)

CONTINUE AND BREAK
continue ends the iteration in the loop
break ends the loop

ENUMERATION TYPES
public enum identifier {enumerator1, enumerator2,  ...}
its like declaring a domain that a variable can be an element of but in OOP
you access the variables within with identifier.enumerator_name

ARRAY DECLARATION N SHI
data_type[] name = new int[n]; the n is the amoutn of elements within
datatyoe[][] name = new int[n][m] wow you can really do this
you can also declare int[] name = {1,2,3,4,5,6, ...} PERFECT SIZE ARRAY FOR UNCHANGING SHIII
 
ENHANCED FOR LOOP for []
for (variable type of whats in array name: array name) {
  basically for things in each elementof array from "array name"

USER DEFINED FUNCTIONS
public static int computeSquare(int numToSquare) {
      return numToSquare * numToSquare;
      BRO WHAT IS PUBLIC STATIC INT?? LLLLL
   }

UNIT TESTING
to test things, make a testbench or assert
assert testExpression : detailedMessage;
   basically if expression is false, return detailed message no print needed
   
SCOPE
you can declare variables in the class but not in main
you need to not have input variables and method variables same name

METHODS
if methods name functions same, different paramenters, the compiler automatically resolves this

OVERSIZED ARRAY
you only use a portion of the array
int MILES_DRIVEN_DAILY_CAPACITY = 31;
double[] milesDrivenDaily = 
   new double[MILES_DRIVEN_DAILY_CAPACITY];
int milesDrivenDailySize = 0;

prints null if you access undeclared portions of array
str.split(" ") splits a string into arrays

if you have a method that returns:
array reference: new array made
void: original aray altered
else: original array unaltered
