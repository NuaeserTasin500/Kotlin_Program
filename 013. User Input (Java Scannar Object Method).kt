//// User Input (Java Scannar Object Method)

import java.util.*; // Highly Recommended for Java Scanner


fun main()
{

    // Declaration of Scanner Object pushing as variable shortly
    val s = Scanner(System.`in`)

    //// Inputting String
    print("Enter some text: ")
    var stringInput = s.next()
    println("You have written: $stringInput")

    ////Inputting Integer
    print("Enter an Integer number: ") //Warning: Only input integer number, otherwise system would be crashed 
    var intInput = s.nextInt()
    println("You have written this integer number: $intInput")

    /* readlnOrNull().toInt() can be written, but it is unsafe method. 
    for safety, please use readlnOrNull()?.toIntOrNull() */



    //// Inputting Byte
    print("Enter a Byte number: ") //Warning: Only byte integer number, otherwise system would be crashed 
    var byteInput = s.nextByte() 
    println("You have written this byte number: $byteInput")


    //// Inputting Short
    print("Enter a Short number: ") //Warning: Only input short number, otherwise system would be crashed 
    var shortInput = s.nextShort() 
    println("You have written this byte number: $shortInput")

    //// Inputting Long
    print("Enter a Long number: ") //Warning: Only input long number, otherwise system would be crashed 
    var longInput = s.nextLong() 
    println("You have written this byte number: $longInput")

    //// Inputting Float
    print("Enter a Float number: ") //Warning: Only input float number, otherwise system would be crashed 
    var floatInput = s.nextFloat()
    println("You have written this float number: $floatInput")

    //// Inputting Double
    print("Enter a Double number: ") //Warning: Only input double number, otherwise system would be crashed 
    var doubleInput = s.nextDouble()
    println("You have written this double number: $doubleInput")

    //// Inputting Boolean
    print("Write only True/False: ") //Warning: Only input true or false, otherwise system would be crashed 
    var boolInput = s.nextBoolean()
    println("You have written boolean: $boolInput")
    

}
