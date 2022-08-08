package com.dailycoding.tictac


import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.dailycoding.tictac.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var winSound: MediaPlayer
    private lateinit var drawSound: MediaPlayer
    private var state = "player1"
    private var player1 = ""
    private var player2 = ""
    private var stepCount = 0
    private var winState = false


    override

    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)



        winSound = MediaPlayer.create(this, R.raw.effectwin)
        drawSound = MediaPlayer.create(this, R.raw.fail)



        binding.apply {

            statePlayer.text = getString(R.string.player1)

            box1.setOnClickListener {
                if (state == "player1") {
                    statePlayer.text = getString(R.string.player2)
                    box1.isClickable = false
                    player1 += "1"
                    stepCount += 1
                    checkResult()
                    state = "player2"
                    box1.text = "O"


                } else if (state == "player2") {
                    statePlayer.text = getString(R.string.player1)
                    box1.isClickable = false
                    state = "player1"
                    player2 += "1"
                    stepCount += 1

                    checkResultPlayer2()
                    box1.text = "X"

                }

            }
            box2.setOnClickListener {
                if (state == "player1") {
                    statePlayer.text = getString(R.string.player2)
                    box2.isClickable = false
                    player1 += "2"
                    stepCount += 1

                    checkResult()
                    state = "player2"


                    box2.text = "O"


                } else if (state == "player2") {
                    statePlayer.text = getString(R.string.player1)
                    box2.isClickable = false
                    state = "player1"
                    player2 += "2"
                    stepCount += 1

                    checkResultPlayer2()
                    box2.text = "X"


                }

            }
            box3.setOnClickListener {
                if (state == "player1") {
                    statePlayer.text = getString(R.string.player2)
                    box3.isClickable = false
                    player1 += "3"
                    stepCount += 1

                    checkResult()

                    state = "player2"
                    box3.text = "O"


                } else if (state == "player2") {
                    statePlayer.text = getString(R.string.player1)
                    box3.isClickable = false
                    state = "player1"
                    player2 += "3"
                    stepCount += 1

                    checkResultPlayer2()
                    box3.text = "X"


                }
            }
            box4.setOnClickListener {
                if (state == "player1") {
                    statePlayer.text = getString(R.string.player2)
                    box4.isClickable = false
                    player1 += "4"
                    stepCount += 1

                    checkResult()
                    state = "player2"
                    box4.text = "O"


                } else if (state == "player2") {
                    statePlayer.text = getString(R.string.player1)
                    box4.isClickable = false
                    state = "player1"
                    player2 += "4"

                    stepCount += 1

                    checkResultPlayer2()
                    box4.text = "X"


                }
            }
            box5.setOnClickListener {

                if (state == "player1") {
                    statePlayer.text = getString(R.string.player2)
                    box5.isClickable = false
                    player1 += "5"
                    stepCount += 1

                    checkResult()
                    state = "player2"
                    box5.text = "O"


                } else if (state == "player2") {
                    statePlayer.text = getString(R.string.player1)
                    box5.isClickable = false
                    state = "player1"
                    player2 += "5"
                    stepCount += 1

                    checkResultPlayer2()
                    box5.text = "X"


                }
            }
            box6.setOnClickListener {
                if (state == "player1") {
                    statePlayer.text = getString(R.string.player2)
                    box6.isClickable = false
                    player1 += "6"
                    stepCount += 1

                    checkResult()
                    state = "player2"
                    box6.text = "O"


                } else if (state == "player2") {
                    statePlayer.text = getString(R.string.player1)
                    box6.isClickable = false
                    state = "player1"
                    player2 += "6"
                    stepCount += 1

                    checkResultPlayer2()
                    box6.text = "X"


                }
            }
            box7.setOnClickListener {
                if (state == "player1") {
                    statePlayer.text = getString(R.string.player2)
                    box7.isClickable = false
                    player1 += "7"
                    stepCount += 1

                    checkResult()
                    state = "player2"
                    box7.text = "O"


                } else if (state == "player2") {
                    statePlayer.text = getString(R.string.player1)
                    box7.isClickable = false
                    state = "player1"
                    player2 += "7"
                    stepCount += 1

                    checkResultPlayer2()
                    box7.text = "X"


                }
            }
            box8.setOnClickListener {
                if (state == "player1") {
                    statePlayer.text = getString(R.string.player2)
                    box8.isClickable = false
                    player1 += "8"
                    stepCount += 1

                    checkResult()
                    state = "player2"
                    box8.text = "O"


                } else if (state == "player2") {
                    statePlayer.text = getString(R.string.player1)
                    box8.isClickable = false
                    state = "player1"
                    player2 += "8"

                    stepCount += 1

                    checkResultPlayer2()
                    box8.text = "X"


                }
            }
            box9.setOnClickListener {


                if (state == "player1") {
                    statePlayer.text = getString(R.string.player2)
                    box9.isClickable = false
                    player1 += "9"
                    stepCount += 1

                    checkResult()
                    state = "player2"
                    box9.text = "O"


                } else if (state == "player2") {
                    statePlayer.text = getString(R.string.player1)
                    box9.isClickable = false
                    state = "player1"
                    player2 += "9"
                    stepCount += 1

                    checkResultPlayer2()
                    box9.text = "X"


                }
            }



            reset.setOnClickListener {

                resetGame()


            }
        }

    }


    private fun checkResult() {


        if (player1.indexOf("1") != -1 && player1.indexOf("2") != -1 && player1.indexOf("3") != -1) {
            winState = true



            binding.apply {
                clickableBox()

                Toast.makeText(this@MainActivity, "Player 1 wins", Toast.LENGTH_SHORT).show()
                statePlayer.text = getString(R.string.win1)
                winSound.start()

                box1.setBackgroundColor(Color.rgb(0, 117, 0))
                box2.setBackgroundColor(Color.rgb(0, 117, 0))
                box3.setBackgroundColor(Color.rgb(0, 117, 0))


            }
        }

        if (player1.indexOf("3") != -1 && player1.indexOf("6") != -1 && player1.indexOf("9") != -1) {

            winState = true

            Toast.makeText(this@MainActivity, "Player 1 wins", Toast.LENGTH_SHORT).show()
            binding.apply {
                clickableBox()
                statePlayer.text = getString(R.string.win1)
                winSound.start()

                box3.setBackgroundColor(Color.rgb(0, 117, 0))
                box6.setBackgroundColor(Color.rgb(0, 117, 0))
                box9.setBackgroundColor(Color.rgb(0, 117, 0))


            }
        }
        if (player1.indexOf("7") != -1 && player1.indexOf("8") != -1 && player1.indexOf("9") != -1) {
            winState = true


            Toast.makeText(this@MainActivity, "Player 1 wins", Toast.LENGTH_SHORT).show()
            binding.apply {
                clickableBox()
                statePlayer.text = getString(R.string.win1)
                winSound.start()

                box7.setBackgroundColor(Color.rgb(0, 117, 0))
                box8.setBackgroundColor(Color.rgb(0, 117, 0))
                box9.setBackgroundColor(Color.rgb(0, 117, 0))


            }
        }
        if (player1.indexOf("1") != -1 && player1.indexOf("5") != -1 && player1.indexOf("9") != -1) {
            winState = true

            Toast.makeText(this@MainActivity, "Player 1 wins", Toast.LENGTH_SHORT).show()
            binding.apply {
                clickableBox()
                statePlayer.text = getString(R.string.win1)
                winSound.start()

                box1.setBackgroundColor(Color.rgb(0, 117, 0))
                box5.setBackgroundColor(Color.rgb(0, 117, 0))
                box9.setBackgroundColor(Color.rgb(0, 117, 0))


            }
        }
        if (player1.indexOf("3") != -1 && player1.indexOf("5") != -1 && player1.indexOf("7") != -1) {
            winState = true

            Toast.makeText(this@MainActivity, "Player 1 wins", Toast.LENGTH_SHORT).show()
            binding.apply {
                clickableBox()
                statePlayer.text = getString(R.string.win1)
                winSound.start()

                box3.setBackgroundColor(Color.rgb(0, 117, 0))
                box5.setBackgroundColor(Color.rgb(0, 117, 0))
                box7.setBackgroundColor(Color.rgb(0, 117, 0))


            }
        }
        if (player1.indexOf("4") != -1 && player1.indexOf("5") != -1 && player1.indexOf("6") != -1) {
            winState = true

            Toast.makeText(this@MainActivity, "Player 1 wins", Toast.LENGTH_SHORT).show()
            binding.apply {
                clickableBox()
                statePlayer.text = getString(R.string.win1)
                winSound.start()

                box4.setBackgroundColor(Color.rgb(0, 117, 0))
                box5.setBackgroundColor(Color.rgb(0, 117, 0))
                box6.setBackgroundColor(Color.rgb(0, 117, 0))


            }
        }

        if (player1.indexOf("2") != -1 && player1.indexOf("5") != -1 && player1.indexOf("8") != -1) {
            winState = true

            Toast.makeText(this@MainActivity, "Player 1 wins", Toast.LENGTH_SHORT).show()
            binding.apply {
                clickableBox()
                statePlayer.text = getString(R.string.win1)
                winSound.start()

                box2.setBackgroundColor(Color.rgb(0, 117, 0))
                box5.setBackgroundColor(Color.rgb(0, 117, 0))
                box8.setBackgroundColor(Color.rgb(0, 117, 0))


            }
        }
        if (player1.indexOf("1") != -1 && player1.indexOf("4") != -1 && player1.indexOf("7") != -1) {
            winState = true

            Toast.makeText(this@MainActivity, "Player 1 wins", Toast.LENGTH_SHORT).show()
            binding.apply {
                clickableBox()
                statePlayer.text = getString(R.string.win1)
                winSound.start()

                box1.setBackgroundColor(Color.rgb(0, 117, 0))
                box4.setBackgroundColor(Color.rgb(0, 117, 0))
                box7.setBackgroundColor(Color.rgb(0, 117, 0))


            }
        }
        if (stepCount == 9 && !winState) {
            drawSound.start()
            binding.statePlayer.text = getString(R.string.draw)
            Toast.makeText(this@MainActivity, "Draw", Toast.LENGTH_SHORT).show()

        }
    }

    private fun checkResultPlayer2() {


        if (player2.indexOf("1") != -1 && player2.indexOf("2") != -1 && player2.indexOf("3") != -1) {
            winState = true


            binding.apply {
                clickableBox()

                Toast.makeText(this@MainActivity, "Player 1 wins", Toast.LENGTH_SHORT).show()
                statePlayer.text = getString(R.string.win2)
                winSound.start()

                box1.setBackgroundColor(Color.rgb(0, 117, 0))
                box2.setBackgroundColor(Color.rgb(0, 117, 0))
                box3.setBackgroundColor(Color.rgb(0, 117, 0))


            }
        }

        if (player2.indexOf("3") != -1 && player2.indexOf("6") != -1 && player2.indexOf("9") != -1) {
            winState = true

            Toast.makeText(this@MainActivity, "Player 2 wins", Toast.LENGTH_SHORT).show()
            binding.apply {
                clickableBox()
                statePlayer.text = getString(R.string.win2)
                winSound.start()

                box3.setBackgroundColor(Color.rgb(0, 117, 0))
                box6.setBackgroundColor(Color.rgb(0, 117, 0))
                box9.setBackgroundColor(Color.rgb(0, 117, 0))


            }
        }
        if (player2.indexOf("7") != -1 && player2.indexOf("8") != -1 && player2.indexOf("9") != -1) {
            winState = true

            Toast.makeText(this@MainActivity, "Player 2 wins", Toast.LENGTH_SHORT).show()
            binding.apply {
                clickableBox()
                statePlayer.text = getString(R.string.win2)

                winSound.start()

                box7.setBackgroundColor(Color.rgb(0, 117, 0))
                box8.setBackgroundColor(Color.rgb(0, 117, 0))
                box9.setBackgroundColor(Color.rgb(0, 117, 0))


            }
        }
        if (player2.indexOf("1") != -1 && player2.indexOf("5") != -1 && player2.indexOf("9") != -1) {
            winState = true

            Toast.makeText(this@MainActivity, "Player 2 wins", Toast.LENGTH_SHORT).show()
            binding.apply {
                clickableBox()
                statePlayer.text = getString(R.string.win2)

                winSound.start()
                box1.setBackgroundColor(Color.rgb(0, 117, 0))
                box5.setBackgroundColor(Color.rgb(0, 117, 0))
                box9.setBackgroundColor(Color.rgb(0, 117, 0))


            }
        }
        if (player2.indexOf("3") != -1 && player2.indexOf("5") != -1 && player2.indexOf("7") != -1) {
            winState = true

            Toast.makeText(this@MainActivity, "Player 2 wins", Toast.LENGTH_SHORT).show()
            binding.apply {
                clickableBox()
                statePlayer.text = getString(R.string.win2)

                winSound.start()
                box3.setBackgroundColor(Color.rgb(0, 117, 0))
                box5.setBackgroundColor(Color.rgb(0, 117, 0))
                box7.setBackgroundColor(Color.rgb(0, 117, 0))


            }
        }
        if (player2.indexOf("4") != -1 && player2.indexOf("5") != -1 && player2.indexOf("6") != -1) {
            winState = true

            Toast.makeText(this@MainActivity, "Player 2 wins", Toast.LENGTH_SHORT).show()
            binding.apply {
                clickableBox()
                statePlayer.text = getString(R.string.win2)

                winSound.start()
                box4.setBackgroundColor(Color.rgb(0, 117, 0))
                box5.setBackgroundColor(Color.rgb(0, 117, 0))
                box6.setBackgroundColor(Color.rgb(0, 117, 0))


            }
        }

        if (player2.indexOf("2") != -1 && player2.indexOf("5") != -1 && player2.indexOf("8") != -1) {
            winState = true

            Toast.makeText(this@MainActivity, "Player 2 wins", Toast.LENGTH_SHORT).show()
            binding.apply {
                clickableBox()
                statePlayer.text = getString(R.string.win2)

                winSound.start()
                box2.setBackgroundColor(Color.rgb(0, 117, 0))
                box5.setBackgroundColor(Color.rgb(0, 117, 0))
                box8.setBackgroundColor(Color.rgb(0, 117, 0))


            }
        }
        if (player2.indexOf("1") != -1 && player2.indexOf("4") != -1 && player2.indexOf("7") != -1) {
            winState = true

            Toast.makeText(this@MainActivity, "Player 2 wins", Toast.LENGTH_SHORT).show()
            binding.apply {
                clickableBox()
                statePlayer.text = getString(R.string.win2)

                winSound.start()
                box1.setBackgroundColor(Color.rgb(0, 117, 0))
                box4.setBackgroundColor(Color.rgb(0, 117, 0))
                box7.setBackgroundColor(Color.rgb(0, 117, 0))


            }
        }

        if (stepCount == 9 && !winState) {
            drawSound.start()
            binding.statePlayer.text = getString(R.string.draw)
            Toast.makeText(this@MainActivity, "Draw", Toast.LENGTH_SHORT).show()

        }
    }

    private fun resetGame() {
        binding.apply {
            statePlayer.text = getString(R.string.player1)
            state = "player1"
            box1.text = ""
            box2.text = ""
            box3.text = ""
            box4.text = ""
            box5.text = ""
            box6.text = ""
            box7.text = ""
            box8.text = ""
            box9.text = ""
            box1.isClickable = true
            box2.isClickable = true
            box3.isClickable = true
            box4.isClickable = true
            box5.isClickable = true
            box6.isClickable = true
            box7.isClickable = true
            box8.isClickable = true
            box9.isClickable = true
            player1 = ""
            player2 = ""
            stepCount = 0
            winState = false

            box1.setBackgroundColor(Color.rgb(84, 52, 42))
            box2.setBackgroundColor(Color.rgb(84, 52, 42))
            box3.setBackgroundColor(Color.rgb(84, 52, 42))
            box4.setBackgroundColor(Color.rgb(84, 52, 42))
            box5.setBackgroundColor(Color.rgb(84, 52, 42))
            box6.setBackgroundColor(Color.rgb(84, 52, 42))
            box7.setBackgroundColor(Color.rgb(84, 52, 42))
            box8.setBackgroundColor(Color.rgb(84, 52, 42))
            box9.setBackgroundColor(Color.rgb(84, 52, 42))
        }

    }

    private fun clickableBox() {
        binding.apply {
            box1.isClickable = false
            box2.isClickable = false
            box3.isClickable = false
            box4.isClickable = false
            box5.isClickable = false
            box6.isClickable = false
            box7.isClickable = false
            box8.isClickable = false
            box9.isClickable = false
        }

    }

    override fun onBackPressed() {


        finishAffinity()
    }
}