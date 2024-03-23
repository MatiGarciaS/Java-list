package dev.ejerciciojavalist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dayweek {

    private List<String> diasDeLaSemana;
    
        public Dayweek () {
            crearDiasDeLaSemana();
        }
    
        private void crearDiasDeLaSemana() {
            diasDeLaSemana = new ArrayList<>();
            diasDeLaSemana.add("Lunes");
            diasDeLaSemana.add("Martes");
            diasDeLaSemana.add("Miércoles");
            diasDeLaSemana.add("Jueves");
            diasDeLaSemana.add("Viernes");
            diasDeLaSemana.add("Sábado");
            diasDeLaSemana.add("Domingo");
        }

    public List<String> getDiasDeLaSemana() {
        return diasDeLaSemana;
    }


    public int obtenerLongitudLista() {
        return diasDeLaSemana.size();
    }


    public void eliminarDia(String dia) {
        diasDeLaSemana.remove(dia);
    }

    public String getDia(int indice) {
        if (indice >= 0 && indice < diasDeLaSemana.size()) {
            return diasDeLaSemana.get(indice);
        } else {
            throw new IllegalArgumentException("Índice fuera de rango");
        }
    }

    public boolean diaExiste(String dia) {
        return diasDeLaSemana.contains(dia);
    }
    
    public void ordenarDiasAlfabeticamente() {
        Collections.sort(diasDeLaSemana);
    }

    public void vaciarLista() {
        diasDeLaSemana.clear();
    }
}

