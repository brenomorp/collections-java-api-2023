package set.OperacoesBasicas.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoARemover = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoARemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoARemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("Breno", 1);
        convidados.adicionarConvidado("Maria", 2);
        convidados.adicionarConvidado("Julia", 3);
        convidados.adicionarConvidado("Italo", 4);
        convidados.adicionarConvidado("Camila", 4);


        System.out.println(convidados.contarConvidados());

        convidados.removerConvidadoPorCodigoConvite(2);

        System.out.println(convidados.contarConvidados());

        convidados.exibirConvidados();
    }
}
