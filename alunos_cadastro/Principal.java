import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Principal {
    private static SortedSet<Aluno> cj_ordenado;
    public static void main(String[] args){
        cj_ordenado = new TreeSet<Aluno>(new ComparaPessoa());
        cj_ordenado.add(new Aluno ("Martins","45455445645", "M1"));
        cj_ordenado.add(new Aluno("Paula", "46843468424", "M2"));
        cj_ordenado.add(new Aluno("Carla", "46794321974", "M3"));
        cj_ordenado.add(new Aluno("Lucas", "49875168726", "M4"));
        System.out.println(cj_ordenado);
    }
}
