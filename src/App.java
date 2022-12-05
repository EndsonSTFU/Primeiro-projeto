import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("                                                         A CAMINHADA DA MORTE\n");
        Thread.sleep(3000);
        System.out.println("Você acorda na parte de trás de uma viatura na estrada em alta velocidade, mas você não está algemado, flashbacks de notícias sobre um suposto ataque nuclear russo começam a passar em sua cabeça.\n");
        Thread.sleep(5000);
        System.out.println("-Finalmente você acordou- disse o motorista desconhecido.\n");
        Thread.sleep(3000);
        System.out.println("-Yae, meu nome é Nate, você deve tá bem confuso, vou te passar a visão. Aqueles porcos russos lançaram uma capsula no centro de Nova York. Todos no raio de uns 500 metros começaram a ter comportamnetos agressivos e estranhos, começaram a apodrecer vivos, e quem entrar em contato com fluidos dessas pessoas começa a ter os mesmos comportamentos estranhos, no fim geral virou zumbi.");
        Thread.sleep(15000);
        System.out.println("-Tamo indo para uma colônia de sobreviventes, la vão tratar de você.\n");
        Thread.sleep(3000);
        System.out.println("Uma misteriosa figura aparece na estrada e colide com o carro fazendo o mesmo perder o controle capotando três vezes e bater em uma árvore. Quando você da conta, um grupo de infectados estão prestes a cercar o carro, você consegue sair mas Nate está preso nas ferragens e os infectados estão perto demais.");
        Thread.sleep(3000);
        String acidente;
        Scanner nate = new Scanner(System.in);
        System.out.println(" Você vai ajudar ou abandonar Nate?\n");
        acidente = nate.nextLine();
        if (acidente.equals("ajudar")) {
            Thread.sleep(3000);
            System.out.println("Você ajuda Nate puxando a porta enquanto ele empurra do lado de dentro e em um piscar de olhos Nate tira uma glock G18 do coldre e dispara com maestria em alguns zumbis, que foram o suficiente para abrir caminho e vocês escaparem da pequena horda de zumbis.\n");
            Thread.sleep(3000);
            System.out.println("Nate tropeça em uma raíz de uma árvore e deixa a arma cair em seus pés, vocês já se distânciaram bastante da horda, mas você avista um cachorro se aproximando muito rápido.\n");
            Thread.sleep(3000);
            System.out.println("-Atira logo nesse filho da puta! Passamos por um perrenge de merda para acabar aqui!- disse Nate.\n");
            Thread.sleep(3000);
            String queda;
            Scanner dog = new Scanner(System.in);
            System.out.println("Oque vai fazer? atirar ou esperar?\n");
            queda = dog.nextLine();
            Thread.sleep(3000);
            if (queda.equals("atirar")) {
            System.out.println("O som dos tiros atraiu uma horda de zumbis que cercou vocês dois, desesperadamente você atira contra os zumbis, mas o pente de uma glock comporta 17 balas e acabam sendo atacados pela horda");
            System.out.println("                                               ///FIM BRUTAL///");
            }
            else if(queda.equals("esperar")){
            System.out.println("O cão passa direto ignorando vocês e sumindo na vegetação alta. Você entrega a arma de volta para Nate e percebe uma horda de zumbis que não notou a presença de vocês e se você tivesse atirado vocês estariam encurralados.\n");
            Thread.sleep(3000);
            System.out.println("Você e Nate seguem caminhando na direção da colônia.");
            Thread.sleep(3000);
            System.out.println("Você percebe que Nate está mancando, e após caminharem por longos 30 minutos avistam uma cabana abandonada, Nate ainda pode andar. Ele pergunta se você quer parar.");
            Thread.sleep(3000);
            
            
                 String cabana;
                 Scanner casa = new Scanner(System.in);
                 System.out.println("Quer parar ou continuar?");
                 cabana = casa.nextLine();
                 if (cabana.equals("parar")) {
                    System.out.println("Nate entra na cabana e é surpreendido por um infectado que avança em seu braço, mas rapidamente ele o chuta para longe.");
                    Thread.sleep(3000);
                    System.out.println("Com muita raiva pelo susto Nate pisa esmagando o crânio mole e deformado do infectado.\n");
                    Thread.sleep(3000);
                    System.out.println("Após devidirem uma lata de feijões e descansarem o suficiente você se levanta mas Nate permanece sentado");
                    Thread.sleep(3000);
                    System.out.println("Nate mostra que foi mordido pelo infecatado, fica de pé e te entrega uma bússola.\n");
                    Thread.sleep(3000);
                    System.out.println("-Mete o pé cara, eu vou me transformar num deles, so seguir para o sudeste que tu chega na colônia, toma aqui minha arma.");
                    Thread.sleep(3000);
                    System.out.println("-Fala pra garota de cabelo roxo que eu nunca deixei de amar ela!\n");
                    Thread.sleep(2000);
                    System.out.println("Você abandona Nate seguindo sozinho\n");
                    Thread.sleep(2000);
                    System.out.println("Depois de uma longa caminhada você se depara com um presídio");
                    Thread.sleep(2000);
                    System.out.println("Você ouve um grito.-Abram os portões!");
                    Thread.sleep(2000);
                    System.out.println("Apoós checarem se você foi infectado, você tira a arma de Nate do coldre e entrega para a garota de cabelo roxo.");
                    Thread.sleep(4000);
                    System.out.println("Todos em volta começam a chorar e por algum motivo você é contagiado pelo abalo de todos e acaba chorando junto de todos.\n");
                    Thread.sleep(3000);
                    System.out.println("                                                     ///FIM TRISTE///");

                    }
                    else if(cabana.equals("continuar")){
                        System.out.println("Mesmo sabendo que Nate está com dificuldades para andar vocês continuam andando até encontrar um presídio abandonado.");
                        Thread.sleep(3000);
                        System.out.println("Nate bate 7 vezes no portão em uma sequência específica");
                        Thread.sleep(3000);
                        System.out.println("Os portões se abrem -Tamo salvo brother- disse nate.\n");
                        Thread.sleep(3000);
                        System.out.println("                                                     ///FIM///");
                    
                }
            
            }
            
            }
            else if(acidente.equals("abandonar")){
                System.out.println("Você abandona Nate e consegue fugir sendo perseguido pela horda.");
                Thread.sleep(3000);
                System.out.println("Por estar tão desesperado para escapar você não nota que havia um buraco e acaba caindo.");
                Thread.sleep(3000);
                System.out.println("A horda inteira cai no buraco também e você é devorado pela horda de infectados.");
                Thread.sleep(3000);
                System.out.println("                                               ///FIM BRUTAL///");
                

        }
     }
}

    
