package com.example.demo.Player;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class PlayerTest {

    // Forma basica
    @Test
    void win_when_dice_number_is_too_big() {

        Dice dice = Mockito.mock(Dice.class);
        when(dice.roll()).thenReturn(4);

        Player player = new Player(dice,3);
        assertTrue(player.play());
    }

    // Forma abanzada
    @Mock
    Dice dice;

    @InjectMocks
    Player player;

    @Test
    void losses_when_dice_number_is_too_low() {

        when(dice.roll()).thenReturn(2);

        player = new Player(dice,3);
        assertFalse(player.play());
    }



}