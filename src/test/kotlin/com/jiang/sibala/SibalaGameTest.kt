package com.jiang.sibala

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class SibalaGameTest {
    @Test
    fun `both no point - four different dices`() {
        val game = SibalaGame()
        val result: String = game.getResult("Black: 1 2 3 4 White: 1 2 5 6")
        result shouldBe "Tie."
    }
}