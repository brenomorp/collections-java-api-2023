package list.Pesquisa.CatalogoLivros;

import javax.xml.catalog.Catalog;
import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!livros.isEmpty()) {
            for (Livro l : livros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalo = new ArrayList<>();

        for(Livro l : livros) {
            if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                livrosPorIntervalo.add(l);
            }
        }

        return livrosPorIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPesquisado = null;

        for (Livro l : livros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                livroPesquisado = l;
                break;
            }
        }

        return livroPesquisado;
    }

    public static void main(String[] args) {
        CatalogoLivros livros = new CatalogoLivros();

        livros.adicionarLivro("Livro 1", "Maria", 2002);
        livros.adicionarLivro("Livro 2", "João", 2000);
        livros.adicionarLivro("Livro 3", "João", 2001);
        livros.adicionarLivro("Livro 4", "Jubileu", 2005);
        livros.adicionarLivro("Livro 4", "Jubileu", 2004);
        livros.adicionarLivro("Livro 6", "Jubileu", 2003);

        System.out.println(livros.pesquisarPorAutor("Jubileu"));
        System.out.println(livros.pesquisarPorTitulo("Livro 4"));
        System.out.println(livros.pesquisarPorIntervaloAnos(2003, 2005));
    }
}
