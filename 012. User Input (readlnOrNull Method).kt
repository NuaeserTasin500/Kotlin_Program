fun main()
{
    //// User Input (ReadlnOrNull Method)

    /* Normal Method is an unsafe method because system would crash if you write invalid input.
    That's why ReadlnOrNull Method is 100% safe method. No crash occurs if you write invalid input 
    in ReadlnOrNull method*/ 
    


    //// Inputting String
    print("Enter some text: ")
    var stringInput: String? = readlnOrNull()
    println("You have written: $stringInput")

    ////Inputting Integer
    print("Enter an Integer number: ") 
    var intInput: Int? = readlnOrNull()?.toIntOrNull() // converting as an integer by ?.toIntOrNull()
    println("You have written this integer number: $intInput")

    /* readlnOrNull().toInt() can be written, but it is unsafe method. 
    for safety, please use readlnOrNull()?.toIntOrNull() */



    //// Inputting Byte
    print("Enter a Byte number: ") 
    var byteInput = readlnOrNull()?.toByteOrNull() // converting as an byte by ?.toByteOrNull()
    println("You have written this byte number: $byteInput")


    //// Inputting Short
    print("Enter a Short number: ") 
    var shortInput = readlnOrNull()?.toShortOrNull() // converting as a short by ?.toShortOrNull()
    println("You have written this byte number: $shortInput")

    //// Inputting Long
    print("Enter a Long number: ") 
    var longInput = readlnOrNull()?.toLongOrNull() // converting as a long by ?.toLongOrNull()
    println("You have written this byte number: $longInput")

    //// Inputting Float
    print("Enter a Float number: ") 
    var floatInput = readlnOrNull()?.toFloatOrNull() // converting as a float by ?.toFloatOrNull()
    println("You have written this float number: $floatInput")

    //// Inputting Double
    print("Enter a Double number: ") 
    var doubleInput = readlnOrNull()?.toDoubleOrNull() // converting as a double by ?.toDoubleOrNull()
    println("You have written this double number: $doubleInput")

    //// Inputting Boolean
    print("Write only True/False: ") 
    var boolInput = readlnOrNull()?.toBooleanStrictOrNull() // converting as a boolean by ?.toBooleanStrictOrNull()
    println("You have written boolean: $boolInput")
    

}
