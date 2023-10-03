package list.Pesquisa.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int total = 0;
        for(int n : this.numeros) {
            total += n;
        }
        return total;
    }

    public int encontrarMaiorNumero() {
        int maior = this.numeros.get(0);
        for(int n : this.numeros) {
            if(n > maior) {
                maior = n;
            }
        }
        return maior;
    }

    public int encontrarMenorNumero() {
        int menor = this.numeros.get(0);
        for(int n : this.numeros) {
            if(n < menor) {
                menor = n;
            }
        }
        return menor;
    }

    public List<Integer> exibirNumeros() {
        return this.numeros;
    }

    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(25);
        numeros.adicionarNumero(99);
        numeros.adicionarNumero(76);
        numeros.adicionarNumero(11);

        System.out.println(numeros.calcularSoma());
        System.out.println(numeros.encontrarMaiorNumero());
        System.out.println(numeros.encontrarMenorNumero());
        System.out.println(numeros.exibirNumeros());
    }
}
