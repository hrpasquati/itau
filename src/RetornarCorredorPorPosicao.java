import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class RetornarCorredorPorPosicao {
    public static void main(String[] args) {
        List<String> nomeCorredores = asList("Corredor5", "Corredor4", "Corredor3", "Corredor9", "Corredor2");
        List<Integer> tempoDeCorrida = asList(14,15,16,30,60);
        int posicao = 2;

        System.out.println(teste(nomeCorredores, tempoDeCorrida, posicao));

    }

    public static Map<String, Integer> teste(List<String> nomeCorredores, List<Integer> tempoDeCorrida, int posicao) {
        List<String> sortedNomeCorredores = nomeCorredores.stream().sorted().collect(Collectors.toList());
        List<Integer> sortedTempoDeCorrida = tempoDeCorrida.stream().sorted().collect(Collectors.toList());

        Map<String, Integer> corredorETempo = new HashMap<>();
        corredorETempo.put(sortedNomeCorredores.get(posicao), sortedTempoDeCorrida.get(posicao));

        return corredorETempo;
    }
}
