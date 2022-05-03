package com.example.mazemaker

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle                     // hello
import android.view.View
import android.widget.FrameLayout //the

class MainActivity : AppCompatActivity() {
    private lateinit var tile1: FrameLayout
    private lateinit var tile0: FrameLayout
    private lateinit var tile2: FrameLayout
    private lateinit var tile3: FrameLayout
    private lateinit var tile4: FrameLayout
    private lateinit var tile5: FrameLayout
    private lateinit var tile6: FrameLayout
    private lateinit var tile7: FrameLayout
    private lateinit var tile8: FrameLayout
    private lateinit var tile9: FrameLayout
    private lateinit var tile10: FrameLayout
    private lateinit var tile11: FrameLayout
    private lateinit var tile12: FrameLayout
    private lateinit var tile13: FrameLayout
    private lateinit var tile14: FrameLayout
    private lateinit var tile15: FrameLayout
    private lateinit var tile16: FrameLayout
    private lateinit var tile17: FrameLayout
    private lateinit var tile18: FrameLayout
    private lateinit var tile19: FrameLayout
    private lateinit var tile20: FrameLayout
    private lateinit var tile21: FrameLayout
    private lateinit var tile22: FrameLayout
    private lateinit var tile23: FrameLayout
    private lateinit var tile24: FrameLayout
    private lateinit var tile25: FrameLayout
    private lateinit var tile26: FrameLayout
    private lateinit var tile27: FrameLayout
    private lateinit var tile28: FrameLayout
    private lateinit var tile29: FrameLayout
    private lateinit var tile30: FrameLayout
    private lateinit var tile31: FrameLayout
    private lateinit var tile32: FrameLayout
    private lateinit var tile33: FrameLayout
    private lateinit var tile34: FrameLayout
    private lateinit var tile35: FrameLayout
    private lateinit var tile36: FrameLayout
    private lateinit var tile37: FrameLayout
    private lateinit var tile38: FrameLayout
    private lateinit var tile39: FrameLayout
    private lateinit var tile40: FrameLayout
    private lateinit var tile41: FrameLayout
    private lateinit var tile42: FrameLayout
    private lateinit var tile43: FrameLayout
    private lateinit var tile44: FrameLayout
    private lateinit var tile45: FrameLayout
    private lateinit var tile46: FrameLayout
    private lateinit var tile47: FrameLayout
    private lateinit var tile48: FrameLayout
    private lateinit var tile49: FrameLayout
    private lateinit var tile50: FrameLayout
    private lateinit var tile51: FrameLayout
    private lateinit var tile52: FrameLayout
    private lateinit var tile53: FrameLayout
    private lateinit var tile54: FrameLayout
    private lateinit var tile55: FrameLayout
    private lateinit var tile56: FrameLayout
    private lateinit var tile57: FrameLayout
    private lateinit var tile58: FrameLayout
    private lateinit var tile59: FrameLayout
    private lateinit var tile60: FrameLayout
    private lateinit var tile61: FrameLayout
    private lateinit var tile62: FrameLayout
    private lateinit var tile63: FrameLayout
    private lateinit var tile64: FrameLayout
    private lateinit var tile65: FrameLayout
    private lateinit var tile66: FrameLayout
    private lateinit var tile67: FrameLayout
    private lateinit var tile68: FrameLayout
    private lateinit var tile69: FrameLayout
    private lateinit var tile70: FrameLayout
    private lateinit var tile71: FrameLayout
    private lateinit var tile72: FrameLayout
    private lateinit var tile73: FrameLayout
    private lateinit var tile74: FrameLayout
    private lateinit var tile75: FrameLayout
    private lateinit var tile76: FrameLayout
    private lateinit var tile77: FrameLayout
    private lateinit var tile78: FrameLayout
    private lateinit var tile79: FrameLayout
    private lateinit var tile80: FrameLayout
    private lateinit var tile81: FrameLayout
    private lateinit var tile82: FrameLayout
    private lateinit var tile83: FrameLayout
    private lateinit var tile84: FrameLayout
    private lateinit var tile85: FrameLayout
    private lateinit var tile86: FrameLayout
    private lateinit var tile87: FrameLayout
    private lateinit var tile88: FrameLayout
    private lateinit var tile89: FrameLayout
    private lateinit var tile90: FrameLayout
    private lateinit var allTiles: Array<FrameLayout>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tile0 = findViewById(R.id.tile0)
        tile1 = findViewById(R.id.tile1)
        tile2 = findViewById(R.id.tile2)
        tile3 = findViewById(R.id.tile3)
        tile4 = findViewById(R.id.tile4)
        tile5 = findViewById(R.id.tile5)
        tile6 = findViewById(R.id.tile6)
        tile7 = findViewById(R.id.tile7)
        tile8 = findViewById(R.id.tile8)
        tile9 = findViewById(R.id.tile9)
        tile10 = findViewById(R.id.tile10)
        tile11 = findViewById(R.id.tile11)
        tile12 = findViewById(R.id.tile12)
        tile13 = findViewById(R.id.tile13)
        tile14 = findViewById(R.id.tile14) // 123 4567891011121314151617181920212223242526272829303132333435363738394041424344454647484950
        tile15 = findViewById(R.id.tile15)
        tile16 = findViewById(R.id.tile16)
        tile17 = findViewById(R.id.tile17)
        tile18 = findViewById(R.id.tile18)
        tile19 = findViewById(R.id.tile19)
        tile20 = findViewById(R.id.tile20)
        tile21 = findViewById(R.id.tile21)
        tile22 = findViewById(R.id.tile22)
        tile23 = findViewById(R.id.tile23)
        tile24 = findViewById(R.id.tile24)
        tile25 = findViewById(R.id.tile25)
        tile26 = findViewById(R.id.tile26)
        tile27 = findViewById(R.id.tile27)
        tile28 = findViewById(R.id.tile28)
        tile29 = findViewById(R.id.tile29)
        tile30 = findViewById(R.id.tile30)
        tile31 = findViewById(R.id.tile31)
        tile32 = findViewById(R.id.tile32)
        tile33 = findViewById(R.id.tile33)
        tile34 = findViewById(R.id.tile34)
        tile35 = findViewById(R.id.tile35)
        tile36 = findViewById(R.id.tile36)
        tile37 = findViewById(R.id.tile37)
        tile38 = findViewById(R.id.tile38)
        tile39 = findViewById(R.id.tile39)
        tile40 = findViewById(R.id.tile40)
        tile41 = findViewById(R.id.tile41)
        tile42 = findViewById(R.id.tile42)
        tile43 = findViewById(R.id.tile43)
        tile44 = findViewById(R.id.tile44)
        tile45 = findViewById(R.id.tile45)
        tile46 = findViewById(R.id.tile46)
        tile47 = findViewById(R.id.tile47)
        tile48 = findViewById(R.id.tile48)
        tile49 = findViewById(R.id.tile49)
        tile50 = findViewById(R.id.tile50)
        tile51 = findViewById(R.id.tile51)
        tile52 = findViewById(R.id.tile52)
        tile53 = findViewById(R.id.tile53)
        tile54 = findViewById(R.id.tile54)
        tile55 = findViewById(R.id.tile55)
        tile56 = findViewById(R.id.tile56)
        tile57 = findViewById(R.id.tile57)
        tile58 = findViewById(R.id.tile58)
        tile59 = findViewById(R.id.tile59)
        tile60 = findViewById(R.id.tile60)
        tile61 = findViewById(R.id.tile61)
        tile62 = findViewById(R.id.tile62)
        tile63 = findViewById(R.id.tile63)
        tile64 = findViewById(R.id.tile64)
        tile65 = findViewById(R.id.tile65)
        tile66 = findViewById(R.id.tile66)
        tile67 = findViewById(R.id.tile67)
        tile68 = findViewById(R.id.tile68)
        tile69 = findViewById(R.id.tile69)
        tile70 = findViewById(R.id.tile70)
        tile71 = findViewById(R.id.tile71)
        tile72 = findViewById(R.id.tile72)
        tile73 = findViewById(R.id.tile73)
        tile74 = findViewById(R.id.tile74)
        tile75 = findViewById(R.id.tile75)
        tile76 = findViewById(R.id.tile76)
        tile77 = findViewById(R.id.tile77)
        tile78 = findViewById(R.id.tile78)
        tile79 = findViewById(R.id.tile79)
        tile80 = findViewById(R.id.tile80)
        tile81 = findViewById(R.id.tile81)
        tile82 = findViewById(R.id.tile82)
        tile83 = findViewById(R.id.tile83)
        tile84 = findViewById(R.id.tile84)
        tile85 = findViewById(R.id.tile85)
        tile86 = findViewById(R.id.tile86)
        tile87 = findViewById(R.id.tile87)
        tile88 = findViewById(R.id.tile88)
        tile89 = findViewById(R.id.tile89)
        tile90 = findViewById(R.id.tile90)
        allTiles = arrayOf(tile1, tile2, tile3, tile0, tile4, tile5, tile16, tile7, tile71, tile9, tile10, tile11, tile12, tile13, tile14, tile15, tile17, tile6, tile18, tile19, tile20, tile21, tile22, tile23, tile24, tile25, tile26, tile27, tile28, tile29, tile30, tile31, tile32, tile33, tile34, tile35, tile36, tile37, tile38, tile39, tile40, tile41, tile42, tile43, tile44, tile45, tile46, tile47, tile48, tile49, tile50, tile51, tile52, tile53, tile54, tile55, tile56, tile57, tile58, tile59, tile60, tile61, tile62, tile63, tile64, tile65, tile66, tile67, tile68, tile69, tile70, tile8, tile72, tile73, tile74, tile75, tile76, tile77, tile78, tile79, tile80, tile81, tile82, tile83, tile84, tile85, tile86, tile87, tile88, tile89, tile90)

        allTiles.onEach { frameLayout: FrameLayout -> frameLayout.setOnClickListener{ // this is the main functionality   yes
            if (getBackgroundColor(frameLayout) == getColor(R.color.warning_block)) {
                frameLayout.setBackgroundColor(getColor(R.color.safe_block))
            } else if (getBackgroundColor(frameLayout) == getColor(R.color.safe_block)) {
                frameLayout.setBackgroundColor(getColor(R.color.warning_block))
            }
        } }

    }

    private fun getBackgroundColor(selectedTile: FrameLayout): Int {
        val background = selectedTile.background
        return if (background is ColorDrawable) background.color
        else {
            println("could not find requested color, returning transparent")
            Color.TRANSPARENT
        }
    }

    fun reset(view: View) {
        allTiles.forEach { frameLayout: FrameLayout -> frameLayout.setBackgroundColor(getColor(R.color.warning_block)) }
    } // or you could just do recreate()
}