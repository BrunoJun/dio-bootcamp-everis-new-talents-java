package principaisImplementacoesDasEstruturasDeDadosDoJava.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    
    public static void main(String[] args) {
        
        Map<String, String> aluno1 = new HashMap<>();

        aluno1.put("Nome", "Bruno");
        aluno1.put("Idade", "22");
        aluno1.put("Faculdade", "Fatec Itapetininga");

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Ana");
        aluno2.put("Idade", "23");
        aluno2.put("Faculdade", "Anhembi Morumbi");
        
        System.out.println(aluno1);

        System.out.println(aluno1.keySet());
        System.out.println(aluno1.values());

        // É possível criar uma lista de maps

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        System.out.println(aluno1.containsKey("Nome"));
    }
}
