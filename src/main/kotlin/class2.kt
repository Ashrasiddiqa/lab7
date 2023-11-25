import java.security.KeyStore.TrustedCertificateEntry

fun main(args:Array<String>) {
    println("Im feel sleepy")
    //float
    var num1: Float = 12.5f
    var num2: Float = 11.1f
    println(num1 + num2)

    var num3: Float = 25.32f
    var num4: Float = 55.96f
    println(num3 - num4)

    //double
    var num5: Double = 45.55
    var num6: Double = 565.66
    println(num5 + num6)

    var num7: Double = 52878524.154
    var num8: Double = 574695469.46998
    println(num7 + num8)


    var isSingle: Boolean = true
    println(isSingle)
    var haveChild: Boolean = false
    println(haveChild)

    var ch = charArrayOf('a', 'b')
    val st = String(ch)
    println(ch)

    var name: String
    name = "Sonet"
    println(name)

    // arithmetic
    var num9 = 8
    var num10 = 4
    //1.add
    var add = num9 + num10
    println("Addition: ${add}")

    var sub = num9 - num10
    println("Substraction: ${sub}")

    var multi = num9 * num10
    println("Multiaplication: ${multi}")

    var div = num9 / num10
    println("Division: ${div}")

    var mod = num9 % num10
    println("Modulus: ${mod}")

    //1.a+=b -> a = a+b
    var a = 40
    var b = 20
    a += b
    println(a)

    //2.a-=b -> a = a-b
    a -= b
    println(a)
    //3.a*=b -> a = a*b
    a *= b
    println(a)

    //4.a/=b -> a = a/b
    a /= b
    println(a)

    //5.a%=b -> a = a%b
    a %= b
    println(a)

    var x = 6
    var y = 4
    //1. +a
    println(x + y)

    //or||
    var p = 10
    var q = 20

    println(p>q || p<q)

    //2.&&(AND)
    println(p>q && p<q)
}