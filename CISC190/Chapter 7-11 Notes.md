Chapter 7

Classes and OOP
public key word scope is available to the tihng its in
    public class Restaurant{
        Restaurant one = new Restaurant();
        Restaurant two = new Restaurant();
        public void setname(){}
    }
    The class is public everywhere
    The setName is public to the class
    new keyword says to allocate memory on heap for object

to access functions within a class object use 
    object.function();

public keyword is available everywhere
private keyword is only available to functions in same scopre/class

mutator "mutates" a class fields            SETTER
accessor "accesses"fields but not modify    GETTER

if you make a constructor -> do like public functionname(){} then it just works
    public Voicemail(){
      setNumber(0);
      setGreeting("Empty");}

   public void setNumber(int voicemailNumber) {
		number = voicemailNumber;}
	
	public void setGreeting(String voicemailGreeting) {
		greeting = voicemailGreeting;}

if you have like thing, this.x is the private variable
    private int x;
    public void name(int x){
        this.x = x;
    }

you can declare a data type OBJECT with capital beginning (like String)
    you even have a wrapper data type -> primitive data type
        why? so you can use wrapper functions and primitive data type functions to your choosing :|
    toString()
    Integer.toString(someInteger)
    Integer.parseInt(someString)
    Integer.valueOf(someString)
    Integer.toBinaryString(someInteger)

import java.util.ArrayList
    Constructor: ArrayList<Integer> vals = new ArrayList<Integer>()
        add(element), to the end of ArrayList
            add(index, element), shifts element at index right and places new thing
    	get(index), returns the element at index
    	set(index, element), replaces index with new element
        size(), returns number of elements present
        isEmpty() returns if array empty or not
        clear() yk
        remove() yk
    
static keyword makes the scope everywhere for all objects of the same type

java.lang	
    String, Integer, Double, Math	
    Contains fundamental Java classes. Automatically imported by Java.
java.util	
    Collection, ArrayList, LinkedList, Scanner	
    Contains the Java collections framework classes and miscellaneous utility classes.
java.io
	File, InputStream, OutputStream	
    Contains classes for system input and output.
javax.swing	
    JFrame, JTextField, JButton	
    Contains classes for building graphical user interfaces.

use import java.package.thinginpackage.function
use import java.package.*; to import all things in package

%c	char	                    Prints a single Unicode character
%d	int, long, short	        Prints a decimal integer value.
%o	int, long, short	        Prints an octal integer value.
%h	int, char, long, short	    Prints a hexadecimal integer value.
%f	float, double	            Prints a floating-point value.
%e	float, double	            Prints a floating-point value in scientific notation.
    %.3e prints number with 3 decimals precision
    %+.5f prints a + to the left with 5 decimals precision
    %09.2f prints 9 integers left, concatenating leftward with 0 if too many, then 2 decimals right

%s	String	                    Prints the characters in a String variable or literal.
%%		                        Prints the "%" character.
%n		                        Prints the platform-specific new-line character.

if you do %integer it is like concatenating white space till you have minimum amount of characters

System.out.printf("The %s account saved you $%f over %d years\n",
    account, total, years);
        its like replacing the format specifiers with the variable

flush() is op when you just want to clear the buffer, makingthings faster

String Streams
if you have a string like a sentence
use the string stream objects
    String string = "blah1 blah2 blah3:
    Scanner stream = new Scanner(string)
        then when you call stream.next its like blah1, then subsequent things

String and Print Writer :|
    StringWriter s = new StringWriter();
    PrintWriter p = new PrintWriter(s);

File InputStream
    FileInputStream filestream = null;
    Scanner inFS = null;

     filestream = new FileInputStream("name.txt");
     inFS = new Scanner(FileInputStream);

     you want to also close the filestream after use with
     filestream.close();

    inFS.hasNextInt();  shows if a next string in file is an integer
    inFS.hasNext(); shows if there are more in the stream stream 

Print Writer
    FileOutputStream fileStream = null;
    PrintWriter outFS = null;
        fileStream = new FileOutputStream("note.txt");
        outFS = new PrintWriter(fileStream);
    now you can write to note.txt with....
        outFS("string to print")

Subclasses and Polymorphism
    If you have two classes A and B, you can make A also a class with functions of B by doing
        public class A extends B{}
        now A has all of Bs things but more for what you want to add

Protected keyword
    makes it so that all derived classes from base class get the thing

Private keywork
    makes it so that derived classes CANNOT get the same thing...

Heres the thing

if declared as, then thing is accessable to:
        	Class	Package	Subclass	World
public	      Y	       Y	   Y       	  Y
protected	  Y    	   Y	   Y	      N
no modifier	  Y        Y	   N	      N
private	      Y        N	   N	      N

Overrides
    if you declare a function with name in both the derived and subclasses, then the subclass function takes priority in a object of that subclass
    you have to explicitly say @Override on top of override method
    if you want to access the base class function you need to append super to it 
        like super.function()

Overloading
    if there are multiple of the same function name with different inputs

DUDE you can do a toString method in a class
    if you call System.out.println(name), the System.out.println AUTOMATICALLY calls toString,,, so you can just alter the toString in thing to be different

Polymorphism is like if you have a bunch of different objects in one interface and you wanna do stuff with them
    overloading with different things is one way to do thing with this
    ArrayList<Object> objList = new ArrayList<Object>(); holds ANY object 

Abstract Classes are like saying EVERY subclass must follow these rules. 
    objects can NOT take on this type, only of subclasses
    you define with public abstract class name{}
    ALSOOO you define methods you want subclasses to hae with abstract functionname();
        so they MUST have that override function type thing ykwim

Interfaces are like a blueprint but like better because it not a class
    faster, less comptationally taxing
    like abstract classes, but there no inheritance
    define with public interface name in separate file
    define object in main with classname implements interfacename{} 
    
Exception handling
    try{} literally tries code unless it breaks
    catch(ErrorType e){} if try fails, do catch. dont always need it tho i think 
        InputMismatchException
        EOFException
        ArrayIndexOutOfBoundsException
        FileNotFoundException
        ArithmeticException
            you gotta import java.lang. on these tho,not java.util

    you can force an exception using throw new Exception("exception message")
        then in the catch statement, you can get the message with name.getMessage()
    you can put different exception catches also subsequent
        order matters,you should have the predefined ones first, then the custom ones

    finally{} always happen after a try catch statement
    
    you can use throw clauses in methods by saying like
        public void main() throws exceptionname, exceptionname2...
            basically if function has exception error, then it returns the message
            you just do the throw new Exceptiontype

    other types of exception error
        NullPointerException	
        IndexOutOfBoundsException	
        ArithmeticException	
        IOError	
        ClassCastException	
        IllegalArgumentException

    Know that the exception catch will catch EVERY type of exception,,, beware...
        also put any non specified exception using the exception class at the end of a line of multiple catches
    
    User Defined Exceptions
        class ExceptionName extends Exception
            public ExceptionName(String message){
                super(message)
            }

        Dude its  because you literally call throw new ExceptionName("Message")
            so its literally just like normal but you wrap it brodie kai jones

Basic Graphics
    import javax.swing.JFrame
        make object:
            JFrame name = new Jframe();
        has methods:
            setSize(width,length)
            setTitle(string)
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
            setVisible()

        If you make a rectangle, first two ints is the top left
        Rectangle rectangle = new Rectangle(0, 0, 150, 100);  
        Color color = new Color(0, 255, 0);
        graphicsObj.setColor(color);
        graphicsObj.fill(rectangle);

        Types of things you can draw
            Rectangle	
            RoundRectangle2D	
            Ellipse2D.Double	
            Line2D.Double	
            Polygon

    JFrame object is like making an empty window (start with null)
    JTextField is like making a empty textbox under the JFrame (start with null)

    JFrame("name") is the title
        object.setTitle is the same

    JTextField.setText() is pretty good you
