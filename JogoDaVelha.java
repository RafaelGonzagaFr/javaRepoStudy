import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {

        String[][] tabuleiro = new String[3][3];
        int jogador = 1;
        int jogadaLinha = 0;
        int jogadaColuna = 0;
        boolean jogadaValida = true;
        boolean fimDeJogo = false;
        Scanner scan = new Scanner(System.in);

        int resp = 0;

        for(int i = 0; i < tabuleiro[0].length; i++){
            for(int j = 0; j < tabuleiro[0].length; j++){
                tabuleiro[i][j] = "";
            }
        }

        do {
            fimDeJogo = false;
            do{
                int i = 0;
                //Desenhar Tabuleiro
                for (int j = 0; j < 3; j++){
                    System.out.print(j + "\t");
                }

                for(String[] linhas:tabuleiro){
                    System.out.println();
                    for(String campo:linhas){

                        System.out.print(campo +"\t");

                    }
                    System.out.println(i);
                    i++;
                }

                //Jogador fazer sua jogada
                do{
                    jogadaValida = true;
                    System.out.println("Jogador " + jogador + " faça sua jogada");
                    System.out.print("Coluna: ");
                    jogadaColuna = (int) scan.nextInt();
                    System.out.print("Linha: ");
                    jogadaLinha = (int) scan.nextInt();

                    if(jogadaLinha < 0 || jogadaLinha > 2 || jogadaColuna < 0 || jogadaColuna > 2 ||
                            tabuleiro[jogadaLinha][jogadaColuna].equals("X") || tabuleiro[jogadaLinha][jogadaColuna].equals("O")){

                        jogadaValida = false;
                        System.out.println("Jogada inválida");
                    }
                }while(!jogadaValida);



                if(jogador == 1){
                    tabuleiro[jogadaLinha][jogadaColuna] = "X";
                    jogador = 2;
                } else {
                    tabuleiro[jogadaLinha][jogadaColuna] = "O";
                    jogador = 1;
                }

                if(tabuleiro[0][0].equals("X") && tabuleiro[0][1].equals("X") && tabuleiro[0][2].equals("X") ||
                        tabuleiro[1][0].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[1][2].equals("X") ||
                        tabuleiro[2][0].equals("X") && tabuleiro[2][1].equals("X") && tabuleiro[2][2].equals("X")){
                    //Desenhar Tabuleiro
                    i = 0;
                    for (int j = 0; j < 3; j++){
                        System.out.print(j + "\t");
                    }

                    for(String[] linhas:tabuleiro){
                        System.out.println();
                        for(String campo:linhas){

                            System.out.print(campo +"\t");

                        }
                        System.out.println(i);
                        i++;
                    }
                    System.out.println("O jogador 1 venceu por Linha");
                    fimDeJogo = true;
                } else if(tabuleiro[0][0].equals("X") && tabuleiro[1][0].equals("X") && tabuleiro[2][0].equals("X")||
                        tabuleiro[0][1].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][1].equals("X") ||
                        tabuleiro[0][2].equals("X") && tabuleiro[1][2].equals("X") && tabuleiro[2][2].equals("X")){
                    //Desenhar Tabuleiro
                    i = 0;
                    for (int j = 0; j < 3; j++){
                        System.out.print(j + "\t");
                    }

                    for(String[] linhas:tabuleiro){
                        System.out.println();
                        for(String campo:linhas){

                            System.out.print(campo +"\t");

                        }
                        System.out.println(i);
                        i++;
                    }
                    System.out.println("O jogador 1 venceu por coluna");
                    fimDeJogo = true;
                } else if(tabuleiro[0][0].equals("O") && tabuleiro[0][1].equals("O") && tabuleiro[0][2].equals("O") ||
                        tabuleiro[1][0].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[1][2].equals("O") ||
                        tabuleiro[2][0].equals("O") && tabuleiro[2][1].equals("O") && tabuleiro[2][2].equals("O")){
                    //Desenhar Tabuleiro
                    i = 0;
                    for (int j = 0; j < 3; j++){
                        System.out.print(j + "\t");
                    }

                    for(String[] linhas:tabuleiro){
                        System.out.println();
                        for(String campo:linhas){

                            System.out.print(campo +"\t");

                        }
                        System.out.println(i);
                        i++;
                    }
                    System.out.println("O jogador 2 venceu por linha");
                    fimDeJogo = true;
                } else if(tabuleiro[0][0].equals("O") && tabuleiro[1][0].equals("O") && tabuleiro[2][0].equals("O") ||
                        tabuleiro[0][1].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][1].equals("O") ||
                        tabuleiro[0][2].equals("O") && tabuleiro[1][2].equals("O") && tabuleiro[2][2].equals("O")){
                    //Desenhar Tabuleiro
                    i = 0;
                    for (int j = 0; j < 3; j++){
                        System.out.print(j + "\t");
                    }

                    for(String[] linhas:tabuleiro){
                        System.out.println();
                        for(String campo:linhas){

                            System.out.print(campo +"\t");

                        }
                        System.out.println(i);
                        i++;
                    }
                    System.out.println("O jogador 2 venceu por coluna");
                    fimDeJogo = true;
                } else if(tabuleiro[0][0].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][2].equals("X") ||
                        tabuleiro[0][2].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][0].equals("X")){
                    //Desenhar Tabuleiro
                    i = 0;
                    for (int j = 0; j < 3; j++){
                        System.out.print(j + "\t");
                    }

                    for(String[] linhas:tabuleiro){
                        System.out.println();
                        for(String campo:linhas){

                            System.out.print(campo +"\t");

                        }
                        System.out.println(i);
                        i++;
                    }
                    System.out.println("O jogador 1 venceu por diagonal");
                    fimDeJogo = true;
                } else if(tabuleiro[0][0].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][2].equals("O") ||
                        tabuleiro[0][2].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][0].equals("O")) {
                    //Desenhar Tabuleiro
                    i = 0;
                    for (int j = 0; j < 3; j++){
                        System.out.print(j + "\t");
                    }

                    for(String[] linhas:tabuleiro){
                        System.out.println();
                        for(String campo:linhas){

                            System.out.print(campo +"\t");

                        }
                        System.out.println(i);
                        i++;
                    }
                    System.out.println("O jogador 2 venceu por diagonal");
                    fimDeJogo = true;

                }
            } while(!fimDeJogo);

            System.out.println();
            System.out.println("Quer continuar jogando? Digite 1");
            resp = (int) scan.nextInt();
        } while(resp == 1);

    }
}