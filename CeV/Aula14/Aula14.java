package Aula14;

public class Aula14 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Gangnam Style");

        Gafan g[] = new Gafan[2];
        g[0] = new Gafan("Sophia", 19, "F", "eu");
        g[1] = new Gafan("Paulo", 14, "M", "leoncio");

        Visualizacao vis = new Visualizacao(g[0], v[0]);

        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
        vis.avaliar();
        System.out.println(vis.toString());


    }
}
