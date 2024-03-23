package dev.ejerciciojavalist;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DayweekTest {

    private Dayweek dayweek;

    @BeforeEach
    public void setUp() {
        dayweek = new Dayweek();
    }

    @Test
    public void testDayweek() {

       
        List<String> diasEsperados = Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes",
                "Sábado", "Domingo");
        assertEquals(diasEsperados, dayweek.getDiasDeLaSemana()); 
    }

    @Test
    public void testObtenerLongitudLista() {
        assertEquals(7, dayweek.obtenerLongitudLista());
    }

    @Test
    public void testEliminarDiaSemana() {
       dayweek.eliminarDia("Lunes");
        assertFalse(dayweek.getDiasDeLaSemana().contains("Lunes"));
    }

    @Test
    public void testObtenerDia() {
        assertEquals("Lunes", dayweek.getDia(0));
        assertThrows(IllegalArgumentException.class, () -> {
            dayweek.getDia(-1);
        });
        
        assertThrows(IllegalArgumentException.class, () -> {
            dayweek.getDia(7);
        });
    }

    @Test
    public void testDiaExiste() {
        Dayweek dayweek = new Dayweek();
        assertTrue(dayweek.diaExiste("Lunes"));
        assertFalse(dayweek.diaExiste("No existe"));
    }


    @Test
    public void testOrdenarDiasAlfabeticamente() {
        List<String> diasOrdenados = Arrays.asList("Domingo", "Jueves", "Lunes", "Martes", "Miércoles", "Sábado",
                "Viernes");

       dayweek.ordenarDiasAlfabeticamente();

        List<String> diasOrdenadosObtenidos = dayweek.getDiasDeLaSemana();

        assertIterableEquals(diasOrdenados, diasOrdenadosObtenidos);
    }

    @Test
    public void testVaciarLista() {
        dayweek.vaciarLista();
        List<String> listaVacia = new ArrayList<>();
        assertEquals(listaVacia, dayweek.getDiasDeLaSemana());
        assertEquals(0, dayweek.obtenerLongitudLista());
    }

}