fun main()
{
    //// Basic Datatypes are shown here (P.S: Array datatype is not shown here)
    //// I have used "var" here as changable. If you want to make unchangable, you can use "val" also 
    var name = "Tasin" // String
    var age = 22 // integer (Int)
    var byteline: Byte = 99 // Byte (8-bit signed integer, range -128 to 127)
    var shortline: Short = 500 // Short (16-bit signed integer, range -32768 to 32767)
    var longvalue: Long = 100000000000 // Long integer
    var fraction_1 = 2.5 // Double (64-bit double-precision floating-point number)
    var fraction_2 = 2.5f // Float (32-bit single-precision floating-point number)
    var charVar = 'a' // Character (Char) 
    var boolVal = false // Boolean

    println("Your name is $name and age is $age")
    println("The byte value is $byteline Byte, and short value is $shortline")
    println("$longvalue is a huge number")
    println("These are fraction numbers $fraction_1 and $fraction_2")
    println("$charVar is a small letter")
    println("The opposite of $boolVal is true")

    
    //// Ranges of Int, Byte, Short, Long, Float, Double, Char
    val maxIntValue = Int.MAX_VALUE
    val minIntValue = Int.MIN_VALUE
    val maxByteValue: Byte = Byte.MAX_VALUE
    val minByteValue: Byte = Byte.MIN_VALUE
    val maxShortValue: Short = Short.MAX_VALUE
    val minShortValue: Short = Short.MIN_VALUE
    val maxLongValue: Long = Long.MAX_VALUE
    val minLongValue: Long = Long.MIN_VALUE
    val minFloatValue = Float.MIN_VALUE
    val maxFloatValue = Float.MAX_VALUE
    val minDoubleValue = Double.MIN_VALUE
    val maxDoubleValue = Double.MAX_VALUE
    val minCharValue = Char.MIN_VALUE
    val maxCharValue = Char.MAX_VALUE


    println("The range of integer datatype is $minIntValue to $maxIntValue")
    println("The range of byte datatype is $minByteValue to $maxByteValue")
    println("The range of short datatype is $minShortValue to $maxShortValue")
    println("The range of long datatype is $minLongValue to $maxLongValue")
    println("The range of float datatype is $minFloatValue to $maxFloatValue")
    println("The range of double datatype is $minDoubleValue to $maxDoubleValue")
    println("The range of character datatype is $minCharValue to $maxCharValue")


}
