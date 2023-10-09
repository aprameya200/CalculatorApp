package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.collections.mutableListOf
import kotlin.math.exp
import java.util.Stack


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val number: TextView = findViewById(R.id.number)
        val expression: TextView = findViewById(R.id.expression)

        val ac: Button = findViewById(R.id.ac)
        val delete: Button = findViewById(R.id.del)
        val divide: Button = findViewById(R.id.divide)
        val multiply: Button = findViewById(R.id.multiply)
        val add: Button = findViewById(R.id.plus)
        val subtract: Button = findViewById(R.id.minus)
        val decimal: Button = findViewById(R.id.decimal)
        val equals: Button = findViewById(R.id.equals)

        val seven: Button = findViewById(R.id.seven)
        val eight: Button = findViewById(R.id.eight)
        val nine: Button = findViewById(R.id.nine)
        val six: Button = findViewById(R.id.six)
        val five: Button = findViewById(R.id.five)
        val four: Button = findViewById(R.id.four)
        val three: Button = findViewById(R.id.three)
        val two: Button = findViewById(R.id.two)
        val one: Button = findViewById(R.id.one)
        val zero: Button = findViewById(R.id.zero)

        val buttonsPressed: MutableList<String> = mutableListOf<String>()

        var wholeExpression: String = ""

        var operation: Array<String> = arrayOf("+","-","*","/")

        var num1: Double = 0.0
        var num2: Double = 0.0
        var result: Double = 0.0
        var operand: String = ""

        var onAdd: Boolean = false
        var onSubtract: Boolean = false
        var onMultiply: Boolean = false
        var onDivided: Boolean = false

        var symbol: Boolean = false


        number.setText("")

        fun pressedButton(button: View){
            val pressedButton = when(button){
                ac -> "ac"
                delete -> "delete"

                else -> "wrong input"
            }

            expression.setText(expression.text.toString() + pressedButton)


        }





        seven.setOnClickListener{
            expression.setText(expression.text.toString() + "7")

            if (symbol){
                number.setText("7")
                symbol = false
            }else{
                number.setText(number.text.toString() + "7")
            }

            num1 = result
            num2 = number.text.toString().toDouble()


        }


        eight.setOnClickListener{
            expression.setText(expression.text.toString() + "8")

            if (symbol){
                number.setText("8")
                symbol = false
            }else{
                number.setText(number.text.toString() + "8")
            }

            num1 = result
            num2 = number.text.toString().toDouble()

        }
        nine.setOnClickListener{
            expression.setText(expression.text.toString() + "9")

            if (symbol){
                number.setText("9")
                symbol = false
            }else{
                number.setText(number.text.toString() + "9")
            }

            num1 = result
            num2 = number.text.toString().toDouble()


        }
        six.setOnClickListener{
            expression.setText(expression.text.toString() + "6")

            if (symbol){
                number.setText("6")
                symbol = false
            }else{
                number.setText(number.text.toString() + "6")
            }

            num1 = result
            num2 = number.text.toString().toDouble()

        }
        five.setOnClickListener{
            expression.setText(expression.text.toString() + "5")

            if (symbol){
                number.setText("5")
                symbol = false
            }else{
                number.setText(number.text.toString() + "5")
            }

            num1 = result
            num2 = number.text.toString().toDouble()


        }
        four.setOnClickListener{
            expression.setText(expression.text.toString() + "4")

            if (symbol){
                number.setText("4")
                symbol = false
            }else{
                number.setText(number.text.toString() + "4")
            }

            num1 = result
            num2 = number.text.toString().toDouble()

        }
        three.setOnClickListener{
            expression.setText(expression.text.toString() + "3")

            if (symbol){
                number.setText("3")
                symbol = false
            }else{
                number.setText(number.text.toString() + "3")
            }

            num1 = result
            num2 = number.text.toString().toDouble()


        }
        two.setOnClickListener{
            expression.setText(expression.text.toString() + "2")

            if (symbol){
                number.setText("2")
                symbol = false
            }else{
                number.setText(number.text.toString() + "2")
            }

            num1 = result
            num2 = number.text.toString().toDouble()


        }
        zero.setOnClickListener{
            expression.setText(expression.text.toString() + "0")

            if (symbol){
                number.setText("0")
                symbol = false
            }else{
                number.setText(number.text.toString() + "0")
            }

            num1 = result
            num2 = number.text.toString().toDouble()


        }

         ac.setOnClickListener{
             expression.setText("")
             number.setText("")
         }
         delete.setOnClickListener{
             if (expression.text != ""){
                 var subString: String = expression.text.substring(0,expression.text.length - 1)
                 expression.setText(subString)
             }

             if (expression.text == ""){
                 number.setText("")
             }

         }
//         percentage.setOnClickListener{pressedButton(it)}


         divide.setOnClickListener{
             expression.setText(expression.text.toString() + "/")
             symbol = true

//             result = add(num1, num2)
//             number.setText(result.toString())
//             Log.d("Num2",num2.toString())
         }

         multiply.setOnClickListener{
             expression.setText(expression.text.toString() + "*")
             symbol = true

             result = add(num1, num2)
//             number.setText(result.toString())
//             Log.d("Num2",num2.toString())
         }

        one.setOnClickListener{
            expression.setText(expression.text.toString() + "1")

            if (symbol){
                number.setText("1")
                symbol = false
            }else{
                number.setText(number.text.toString() + "1")
            }

            num1 = result
            num2 = number.text.toString().toDouble()


        }

         add.setOnClickListener{

             expression.setText(expression.text.toString() + "+")
             symbol = true

//             result = add(num1, num2)
//             number.setText(result.toString())
//             Log.d("Num2",num2.toString())

         }

         subtract.setOnClickListener{
             expression.setText(expression.text.toString() + "-")
             symbol = true

//             result = subtract(num2, num1)
//
//             if (num2 < num1 && result < 0){
//                 Log.d("Suub",result.toString())
//                 result = -result
//             }

//             number.setText(result.toString())
         }

         decimal.setOnClickListener{
             expression.setText(expression.text.toString() + ".")

             if (symbol){
                 number.setText(".")
                 symbol = false
             }else{
                 number.setText(number.text.toString() + ".")
             }

         }
         equals.setOnClickListener{

             var doubles = expression.text.toString().split(Regex("[+*/-]"))
             var operands = expression.text.toString().split(Regex("[1-9.]")).filter { it.isNotBlank() }

             var count: Int = 0
             var answer: Double= 0.0
             var number1: Double = 0.0
             var number2: Double = 0.0

             while (count < doubles.size - 1){

                 if (count == 0){
                     number1 = doubles[count].toDouble()
                 }else{
                     number1 = answer
                 }

                 number2 = doubles[count + 1].toDouble()

                if (operands[count] == "+"){
                    answer = number1 + number2
                }
                 if (operands[count] == "-"){
                     answer = number1 - number2
                 }
                 if (operands[count] == "/"){
                     answer = number1 / number2
                 }
                 if (operands[count] == "*"){
                     answer = number1 * number2
                 }

                 count++
             }


             number.setText(answer.toString())
             Log.d("REgex Operands",doubles.toString())

             Log.d("REgex Operands",operands.toString())


         }
//



    }

    fun add(a: Double, b: Double): Double{
        return  a + b
    }

    fun subtract(a: Double,b: Double): Double{

//        if ()

        return a - b
    }

}