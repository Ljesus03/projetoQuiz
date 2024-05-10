
import java.util.Scanner;

public class prototipoQuiz {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int respC = 0, respE = 0;
        double porc;
        String resp,op;
        System.out.println("Bem vindo ao Quiz sobre o Reino Animal");
        System.out.println("escolha o Nivel de dificuldade");
        System.out.println("Digite: Facil");
        System.out.println("Digite: Medio");
        System.out.println("Digite: Dificil");
        op = scan.nextLine().toLowerCase();
        op = op.replaceAll("á", "a").replaceAll("é", "e").replaceAll("í", "i")
        .replaceAll("ó", "o").replaceAll("ú", "u");
        switch (op) {
            case "facil":
        for (int i = 0; i < 9; i++) {
            if (i == 0) {
                System.out.println("DIFICULDADE FACIL INICIADA");
                System.out.println("1.Qual é o nome do maior mamífero terrestre? ");
                System.out.println("a) Rinoceronte-branco\nb) Elefante-africano\nc) Hipopótamo\nd) Girafa\ne) Leão\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("b".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n");
            if (i == 1) {
                System.out.println(
                        "2.Qual animal é conhecido por ter a mordida mais forte em relação ao seu tamanho corporal?");
                System.out.println("a) Leão\r\n"
                        + "b) Tubarão-branco\r\n"
                        + "c) Crocodilo de água salgada\r\n"
                        + "d) Tucunaré\r\n"
                        + "e) Hiena\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("c".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 2) {
                System.out.println("3.Qual é o mamífero mais rápido do mundo em terra firme?");
                System.out.println("a) Guepardo\r\n"
                        + "b) Antílope\r\n"
                        + "c) Leopardo\r\n"
                        + "d) Coiote\r\n"
                        + "e) Lebre\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 3) {
                System.out.println(
                        "4.Qual animal é conhecido por ter o cérebro proporcionalmente maior em relação ao seu tamanho corporal?");
                System.out.println("a) Golfinho\r\n"
                        + "b) Elefante\r\n"
                        + "c) Chimpanzé\r\n"
                        + "d) Corvo\r\n"
                        + "e) Polvo\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("b".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 4) {
                System.out.println("5.Qual é o animal com o maior período de gestação?");
                System.out.println("a) Elefante africano\r\n"
                        + "b) Baleia-azul\r\n"
                        + "c) Tubarão-baleia\r\n"
                        + "d) Gorila\r\n"
                        + "e) Hipopótamo\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 5) {
                System.out.println("6.Qual é o único mamífero capaz de voar?");
                System.out.println("a) Morcego\r\n"
                        + "b) Pássaro\r\n"
                        + "c) Esquilo\r\n"
                        + "d) Ouriço\r\n"
                        + "e) Coala\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 6) {
                System.out.println("7.Qual é o animal que tem o maior número de dentes?");
                System.out.println("a) Golfinho\r\n"
                        + "b) Formiga\r\n"
                        + "c) Chimpanzé\r\n"
                        + "d) Elefante\r\n"
                        + "e) Lobo\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 7) {
                System.out.println("8.Qual é o animal mais venenoso do mundo?");
                System.out.println("a) Medusa\r\n"
                        + "b) Cobra-rei\r\n"
                        + "c) Vespa-de-mar\r\n"
                        + "d) Peixe-pedra\r\n"
                        + "e) Mosquito\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("b".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 8) {
                System.out.println("9.Qual animal possui o tempo de vida mais longo?");
                System.out.println("a) Tartaruga\r\n"
                        + "b) Elefante\r\n"
                        + "c) Baleia\r\n"
                        + "d) Morcego\r\n"
                        + "e) Coruja\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 9) {
                System.out.println("10.Qual é o animal com o sistema de comunicação mais complexo?");
                System.out.println("a) Golfinho\r\n"
                        + "b) Formiga\r\n"
                        + "c) Chimpanzé\r\n"
                        + "d) Elefante\r\n"
                        + "e) Lobo\r\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }

        }
        break;
        case "medio":
        for (int i = 0; i < 9; i++) {
            if (i == 0) {
                System.out.println("DIFICULDADE MEDIO INICIADA");
                System.out.println("1.Qual é o nome do maior mamífero terrestre?");
                System.out.println("a) Rinoceronte-branco\nb) Elefante-africano\nc) Hipopótamo\nd) Girafa\ne) Leão\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("b".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 1) {
                System.out.println(
                        "2.Qual animal é conhecido por ter a mordida mais forte em relação ao seu tamanho corporal?");
                System.out.println("a) Leão\r\n"
                        + "b) Tubarão-branco\r\n"
                        + "c) Crocodilo de água salgada\r\n"
                        + "d) Tucunaré\r\n"
                        + "e) Hiena\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("c".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 2) {
                System.out.println("3.Qual é o mamífero mais rápido do mundo em terra firme?");
                System.out.println("a) Guepardo\r\n"
                        + "b) Antílope\r\n"
                        + "c) Leopardo\r\n"
                        + "d) Coiote\r\n"
                        + "e) Lebre\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 3) {
                System.out.println(
                        "4.Qual animal é conhecido por ter o cérebro proporcionalmente maior em relação ao seu tamanho corporal?");
                System.out.println("a) Golfinho\r\n"
                        + "b) Elefante\r\n"
                        + "c) Chimpanzé\r\n"
                        + "d) Corvo\r\n"
                        + "e) Polvo\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("b".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 4) {
                System.out.println("5.Qual é o animal com o maior período de gestação?");
                System.out.println("a) Elefante africano\r\n"
                        + "b) Baleia-azul\r\n"
                        + "c) Tubarão-baleia\r\n"
                        + "d) Gorila\r\n"
                        + "e) Hipopótamo\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 5) {
                System.out.println("6.Qual é o único mamífero capaz de voar?");
                System.out.println("a) Morcego\r\n"
                        + "b) Pássaro\r\n"
                        + "c) Esquilo\r\n"
                        + "d) Ouriço\r\n"
                        + "e) Coala\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 6) {
                System.out.println("7.Qual é o animal que tem o maior número de dentes?");
                System.out.println("a) Golfinho\r\n"
                        + "b) Formiga\r\n"
                        + "c) Chimpanzé\r\n"
                        + "d) Elefante\r\n"
                        + "e) Lobo\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 7) {
                System.out.println("8.Qual é o animal mais venenoso do mundo?");
                System.out.println("a) Medusa\r\n"
                        + "b) Cobra-rei\r\n"
                        + "c) Vespa-de-mar\r\n"
                        + "d) Peixe-pedra\r\n"
                        + "e) Mosquito\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("b".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 8) {
                System.out.println("9.Qual animal possui o tempo de vida mais longo?");
                System.out.println("a) Tartaruga\r\n"
                        + "b) Elefante\r\n"
                        + "c) Baleia\r\n"
                        + "d) Morcego\r\n"
                        + "e) Coruja\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 9) {
                System.out.println("10.Qual é o animal com o sistema de comunicação mais complexo?");
                System.out.println("a) Golfinho\r\n"
                        + "b) Formiga\r\n"
                        + "c) Chimpanzé\r\n"
                        + "d) Elefante\r\n"
                        + "e) Lobo\r\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }

        }
        break;
        case "dificil":
        for (int i = 0; i < 9; i++) {
            if (i == 0) {
                System.out.println("DIFICULDADE DIFICIL INICIADA");
                System.out.println("1.Podemos dividir o Reino Animal em nove filos mais representativos. Qual o único no qual é possível encontrar organismos com exoesqueleto quitinoso?");
                System.out.println("a) Filo Porífera\nb) Filo Arthropoda\nc) Filo Molusca\nd) Filo Cnidária\ne) Filo Nematódea\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("b".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 1) {
                System.out.println(
                        "2.Qual a principal novidade evolutiva dos poríferos?");
                System.out.println("a) Esqueleto\r\n"
                        + "b) Condrócitos\r\n"
                        + "c) Coanócitos\r\n"
                        + "d) Cutícula\r\n"
                        + "e) Crânio\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("c".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 2) {
                System.out.println("3.. O polvo tem três corações e azul é sua cor primária devido ao pigmento hemocianina presente em seu sangue?");
                System.out.println("a) Verdadeiro\r\n"
                        + "b) Falso\r\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 3) {
                System.out.println(
                        "4.Quais foram os primeiros animais invertebrados a surgir?");
                System.out.println("a) Artrópodes\r\n"
                        + "b) Crustáceos\r\n"
                        + "c) Poríferos\r\n"
                        + "d) Sapos\r\n"
                        + "e) Peixes\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("c".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 4) {
                System.out.println("5.Qual é a característica distintiva dos Cnidários??");
                System.out.println("a) Corpo Segmentado\r\n"
                        + "b) Exoesqueleto Calcário\r\n"
                        + "c) Simetria Bilateral\r\n"
                        + "d) Células Urticantes (Cnidocitos)\r\n"
                        + "e) Nenhuma das alternativas está correta\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("d".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 5) {
                System.out.println("6.Qual dos seguintes não pertence ao filo dos Nematelmintos?");
                System.out.println("a) Minhoca\r\n"
                        + "b) Nematódeo\r\n"
                        + "c) Ancilostomose\r\n"
                        + "d) Sanguessuga\r\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("a".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 6) {
                System.out.println("7.Nem todos os animais são eucariontes, existem alguns que são autótrofos.");
                System.out.println("a) Verdadeiro\r\n"
                        + "b) Falso\r\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b"))) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("b".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 7) {
                System.out.println("8.Quais dos grupos abaixo possuem endo esqueleto?");
                System.out.println("a)Cordados e artrópodes\r\n"
                        + "b) Artrópodes e equinodermos\r\n"
                        + "c) Anelídeos e artrópodes\r\n"
                        + "d) Equinodermos e anelídeos\r\n"
                        + "e) Equinodermos e cordados\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("e".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 8) {
                System.out.println("9.Qual o hábito de vida da helicops infrataeniatus?");
                System.out.println("a) Terrestre e diurna\r\n"
                        + "b) Terrestre e noturna\r\n"
                        + "c) Aquática e diurna \r\n"
                        + "d) Aquática e noturna\r\n"
                        + "e) Nenhuma das alternativas está correta\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("c".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }
            System.out.println("\n\n\n\n\n\n");
            if (i == 9) {
                System.out.println("10.Qual o menor membro da ordem sirenia?");
                System.out.println("a) Peixe boi\r\n"
                        + "b) Baiacu\r\n"
                        + "c) Peixe-boi-mini\r\n"
                        + "d) Dugongo\r\n"
                        + "e) Peixe -boi-da-Amazonia\r\n");
                System.out.println("Qual é a alternativa certa?");
                resp = scan.nextLine().toLowerCase();
                while (!resp.equals("a") && !resp.equals("b") && !resp.equals("c") && !resp.equals("d")
                        && !resp.equals("e")) {
                    System.out.println("Digite alguma das alternativas!");
                    resp = scan.nextLine().toLowerCase();
                }

                if ("c".equals(resp)) {
                    System.out.println("Certa resposta");
                    respC++;
                } else {
                    System.out.println("Resposta errada");
                    respE++;
                }
            }

        }
        break;
        default:
        System.out.println("Insira uma das opções validas");
        return;
        
    }

        if (respC > 8) {
            System.out.println("Você foi muito bem");
        } else if (respC >= 5) {
            System.out.println("Você foi bem");
        } else {
            System.out.println("Procure melhorar");
        }

        System.out.println("RESPOSTAS CERTAS: " + respC + "\nRESPOSTAS ERRADAS:" + respE+"\nDIFICULDADE:"+op);
    }
}
