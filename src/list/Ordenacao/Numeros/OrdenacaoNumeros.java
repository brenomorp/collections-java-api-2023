package list.Ordenacao.Numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendentes = new ArrayList<>(this.numeros);

        if(!numeros.isEmpty()) {
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendentes = new ArrayList<>(this.numeros);

        if(!numeros.isEmpty()) {
            numerosDescendentes.sort(Collections.reverseOrder());

            return numerosDescendentes;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros() {
        if(!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(55);
        numeros.adicionarNumero(44);
        numeros.adicionarNumero(22);
        numeros.adicionarNumero(99);
        numeros.adicionarNumero(77);
        numeros.adicionarNumero(11);
        numeros.adicionarNumero(22);

        numeros.exibirNumeros();
        System.out.println(numeros.ordenarAscendente());
        System.out.println(numeros.ordenarDescendente());
    }
}


