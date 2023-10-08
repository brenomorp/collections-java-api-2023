package set.OperacoesBasicas.ConjuntoPalavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        for(String p : palavrasSet) {
            if(palavra.equalsIgnoreCase(p)) {
                palavrasSet.remove(p);
                break;
            }
        }
    }

    public boolean verificarPalavra(String palavra) {
        for(String p : palavrasSet) {
            if(p.equalsIgnoreCase(palavra)) {
                return true;
            }
        }
        return false;
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

        palavras.adicionarPalavra("cavalo");
        palavras.adicionarPalavra("leão");
        palavras.adicionarPalavra("bufalo");
        palavras.adicionarPalavra("bufalo");
        palavras.adicionarPalavra("iguana");
        palavras.adicionarPalavra("iguana");

        System.out.println(palavras.verificarPalavra("cavalo"));
        palavras.removerPalavra("cavalo");
        System.out.println(palavras.verificarPalavra("cavalo"));

        palavras.exibirPalavrasUnicas();
    }
}
