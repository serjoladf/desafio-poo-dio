package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Set;

public class VerificadorDeConclusao {

    public static boolean devConcluiuNoPrazo(Dev dev, Bootcamp bootcamp) {
        LocalDate dataFinal = bootcamp.getDataFinal();
        LocalDate dataAtual = LocalDate.now();
        return dataAtual.isBefore(dataFinal) && dev.getConteudosInscritos().isEmpty();
    }
}
