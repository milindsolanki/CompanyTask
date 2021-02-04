package com.example.wayToCode.recyclerViewTaskTwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.wayToCode.R
import kotlinx.android.synthetic.main.activity_rv_intent_task_two.*
import kotlinx.android.synthetic.main.apptoolbar.*

class RvIntentTaskTwoActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rv_intent_task_two)
        txtBack.setOnClickListener(this)
        btn_solution.setOnClickListener(this)
        intiView()

    }

    private fun intiView() {
        txtBack.text = "Back"
        if (intent != null) {

            if ("Fibonacci Series".contentEquals(intent.getStringExtra("TITLE").toString())) {
                txtTitle.text = "Fibonacci Series"
            } else if ("PrimeNumber".contentEquals(intent.getStringExtra("TITLE").toString())) {
                txtTitle.text = "PrimeNumber"

            } else if ("String Palindrome".contentEquals(
                    intent.getStringExtra("TITLE").toString()
                )
            ) {
                txtTitle.text = "String Palindrome"

            } else if ("Integer Palindrome".contentEquals(intent.getStringExtra("TITLE").toString())
            ) {
                txtTitle.text = "Integer Palindrome"

            } else if ("Armstrong number".contentEquals(
                    intent.getStringExtra("TITLE").toString()
                )
            ) {
                txtTitle.text = "Armstrong number"

            } else if ("Factorial".contentEquals(intent.getStringExtra("TITLE").toString())) {
                txtTitle.text = "Factorial"

            } else if ("Leap year".contentEquals(intent.getStringExtra("TITLE").toString())) {
                txtTitle.text = "Leap year"

            } else if ("Reverse Number".contentEquals(intent.getStringExtra("TITLE").toString())) {
                txtTitle.text = "Reverse Number"

            } else if ("Swap Two Number".contentEquals(intent.getStringExtra("TITLE").toString())) {
                txtTitle.text = "Swap Two Number"

            } else if ("Remove Same Number In Array".contentEquals(
                    intent.getStringExtra("TITLE").toString()
                )
            ) {
                txtTitle.text = "Remove Same Number In Array"

            } else {
                Toast.makeText(this, "No Title", Toast.LENGTH_SHORT).show()
            }

        }

        txtBack.setOnClickListener {
            finish()
        }
    }

    private fun feb(sum: Int) {
        var t1 = 0
        var t2 = 1
        for (i in 1..sum) {
            var sol = t1 + t2
            t1 = t2
            t2 = sol
            txtValue.text = sol.toString()
        }

    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btn_solution -> {


                if ("Fibonacci Series".contentEquals(intent.getStringExtra("TITLE").toString())) {
                    feb(Integer.parseInt(etdValue.text.toString()))
                } else if ("PrimeNumber".contentEquals(intent.getStringExtra("TITLE").toString())) {
                    primeNumber(Integer.parseInt(etdValue.text.toString()))

                } else if ("String Palindrome".contentEquals(
                        intent.getStringExtra("TITLE").toString()
                    )
                ) {
                    txtTitle.text = "String Palindrome"

                } else if ("Integer Palindrome".contentEquals(
                        intent.getStringExtra("TITLE").toString()
                    )
                ) {
                    integerPalindrome(Integer.parseInt(etdValue.text.toString()))

                } else if ("Armstrong number".contentEquals(
                        intent.getStringExtra("TITLE").toString()
                    )
                ) {
                    txtTitle.text = "Armstrong number"

                } else if ("Factorial".contentEquals(intent.getStringExtra("TITLE").toString())) {
                    txtTitle.text = "Factorial"

                } else if ("Leap year".contentEquals(intent.getStringExtra("TITLE").toString())) {
                    txtTitle.text = "Leap year"

                } else if ("Reverse Number".contentEquals(
                        intent.getStringExtra("TITLE").toString()
                    )
                ) {
                    txtTitle.text = "Reverse Number"

                } else if ("Swap Two Number".contentEquals(
                        intent.getStringExtra("TITLE").toString()
                    )
                ) {
                    txtTitle.text = "Swap Two Number"

                } else if ("Remove Same Number In Array".contentEquals(
                        intent.getStringExtra("TITLE").toString()
                    )
                ) {
                    txtTitle.text = "Remove Same Number In Array"

                } else {
                    Toast.makeText(this, "No Title", Toast.LENGTH_SHORT).show()
                }


            }
        }
    }

    private fun integerPalindrome(num: Int) {
        var reversedInteger = 0
        var remainder: Int
        val originalInteger: Int
        originalInteger = num
        while (num != 0) {
            remainder = num % 10
            reversedInteger = reversedInteger * 10 + remainder
            //num /= 10

            if (originalInteger == reversedInteger)
                txtValue.text = "$originalInteger is a palindrome."
            else
                txtValue.text = "$originalInteger is not a palindrome."
        }
    }

    private fun primeNumber(num: Int) {
        for (i in 2..num / 2) {
            if (num % i == 0) {
                txtValue.text = "Not Prime Number"
                break
            }
            txtValue.text = "Prime Number"
        }

    }
}


