package ClassePessoa;

public class Principal {
    public static void main(String[] args) {

        Ator stallone = new Ator(10, "Sylvester Stallone", "Ny", 5000.0, 1);
        Ator schwazeneger = new Ator(10, "Arnold Schwazeneger", "Los Angeles", 45000.0, 2);

        // Criação do Objeto HERÓI
        Heroi heroiUm = new Heroi(1, "Superman", "Metrópolis", "Clark Kent", 5000.0, 1);
        Heroi heroidois = new Heroi(2, "Batman", "Gothancity", "Bruce Wayne", 2000.0, 1);
        Heroi heroitres = new Heroi(3, "Iron Man", "New York", "Tony Stark", 50000.0, 2);
        Heroi heroiquatro = new Heroi(4, "Spider Man", "New York", "Peter Parker", 100.0, 2);
        Heroi heroicinco = new Heroi(5, "Numero 5", "Ontario", "Number Five", 56000.0, 3);
        Heroi heroiseis = new Heroi(6, "Numero 3", "Ontario", "Klaus", 70000.0, 3);
        Heroi heroisete = new Heroi(7, "Capitão Pátria", "New York", "Max", 100000.0, 4);
        Heroi heroioito = new Heroi(8, "Star Light", "New York", "Annie", 20000.0, 4);
        Heroi heroinove = new Heroi(9, "Riu", "Japão", "Hadouken", 1000.0, 5);
        Heroi heroidez = new Heroi(10, "Ken", "Japão", "Shoriouken", 1000.0, 5);

        // Criação do Objeto FRANQUIA
        Franquia franquiaum = new Franquia(1, "DC Comics", "DC", "18/10/2019");
        Franquia franquiadois = new Franquia(2, "Marvel Comics", "Marvel", "27/09/2000");
        Franquia franquiatres = new Franquia(3, "Umbrella Corporate", "Umbrella Academy", "17/07/1996");
        Franquia franquiaquatro = new Franquia(4, "The Boys", "Vought", "01/10/2015");
        Franquia franquiacinco = new Franquia(5, "Capcoom Comics", "Capcoom", "12/01/1994");
        // Criação do Objeto FRANQUIA
        Filme filmeum = new Filme(1, "10/10/2010", 200000.0);
        Filme filmedois = new Filme(2, "15/11/2007", 500000.0);
        Filme filmetres = new Filme(3, "01/05/2020", 2000.0);
        Filme filmequatro = new Filme(4, "02/05/2019", 10000.0);
        Filme filmecinco = new Filme(5, "14/08/2018", 7000.0);
        
        // Impressão dos investimentos dos atores
        stallone.investimentoTotal();
        schwazeneger.investimentoTotal();
        
        // Impressão dos invenstimentos dos herois
        heroiUm.investimentoTotal();
        heroidois.investimentoTotal();

        // Impressão do ator
        System.out.println(stallone);
        System.out.println(schwazeneger);

        franquiaum.addHeroi(heroiUm); // Adicionando Herói na franquia
        franquiaum.addHeroi(heroidois); // Adicionando Herói na franquia
        franquiaum.imprimirHerois(); // Imprimindo Herói

        franquiadois.addHeroi(heroitres);
        franquiadois.addHeroi(heroiquatro);
        franquiadois.imprimirHerois();

        franquiatres.addHeroi(heroicinco);
        franquiatres.addHeroi(heroiseis);
        franquiatres.imprimirHerois();

        franquiaquatro.addHeroi(heroisete);
        franquiaquatro.addHeroi(heroioito);
        franquiaquatro.imprimirHerois();

        franquiacinco.addHeroi(heroinove);
        franquiacinco.addHeroi(heroidez);
        franquiacinco.imprimirHerois();

        filmeum.addHeroi(heroiUm); // Adicionando herói no filme
        filmeum.addHeroi(heroidois);
        filmeum.imprimirHerois();
        filmeum.valorinvestido(); // Impressão de valores previstos e investidos
        filmeum.valorPrevisto();

        filmedois.addHeroi(heroitres);
        filmedois.addHeroi(heroiseis);
        filmedois.addHeroi(heroiUm);
        filmedois.imprimirHerois();
        filmedois.valorinvestido();
        filmedois.valorPrevisto();

        filmetres.addHeroi(heroisete);
        filmetres.addHeroi(heroinove);
        filmetres.imprimirHerois();
        filmetres.valorinvestido();
        filmetres.valorPrevisto();

        filmequatro.addHeroi(heroidez);
        filmequatro.imprimirHerois();
        filmequatro.valorinvestido();
        filmequatro.valorPrevisto();

        filmecinco.addHeroi(heroiquatro);
        filmecinco.imprimirHerois();
        filmecinco.valorinvestido();
        filmecinco.valorPrevisto();

        heroiUm.participacaoFilmes(); // Impressão da participação do Herói no filme
        heroiUm.imprimirInvestimento(); // Impressão investimento com herói no filme

        heroidois.participacaoFilmes();
        heroidois.imprimirInvestimento();

        heroitres.participacaoFilmes();
        heroitres.imprimirInvestimento();

        heroiquatro.participacaoFilmes();
        heroiquatro.imprimirInvestimento();

        heroicinco.participacaoFilmes();
        heroicinco.imprimirInvestimento();

        heroiseis.participacaoFilmes();
        heroiseis.imprimirInvestimento();

        heroisete.participacaoFilmes();
        heroisete.imprimirInvestimento();

        heroioito.participacaoFilmes();
        heroioito.imprimirInvestimento();

        heroinove.participacaoFilmes();
        heroinove.imprimirInvestimento();

        heroidez.participacaoFilmes();
        heroidez.imprimirInvestimento();

    }
}
