import java.util.Scanner;
import java.util.ArrayList;

public class Playlist {
    Scanner scan = new Scanner(System.in);

    private ArrayList<Musica> playlist = new ArrayList<Musica>();


    public void addMusica(){
        scan.nextLine();
        System.out.println("Informe o Título: ");
        String titulo = scan.nextLine();

        System.out.println("Informe o Artista: ");
        String artista = scan.nextLine();

        System.out.println("informe a duração: ");
        double duracao = scan.nextDouble();

        Musica musica = new Musica(titulo, artista, duracao);
        playlist.add(musica);

        System.out.println("-----");
        System.out.println("Música adicionada à playlist!");
        System.out.println("-----\n");
    }


    public void removerMusica(){

        System.out.println("Informe o título da música que deseja remover: ");
        String titulo = scan.next();

        boolean isRemoved = false;
        for (int i = 0; i < playlist.size(); i++) {
            if(playlist.get(i).getTitulo().toUpperCase().equals(titulo.toUpperCase())){
                playlist.remove(i);
                isRemoved = true;
            }
        }
        if(isRemoved == true){
            System.out.println("Música removida com sucesso da playlist! \n");
        } else{
            System.out.println("Musica não encontrada! \n");
        }
    }


    public void verPLaylist(){
        for (Musica i : playlist) {
            System.out.println(i);
            
        }
    }

    public void run(){
        while (true){
            System.out.println("O que deseja fazer? ");
            System.out.println("[1]: Ver playlist \n[2]: Adicionar música \n[3]: Remover música \n[0]: Sair ");
            System.out.println("-----\n");

            int option = scan.nextInt();
            switch (option) {
                case 1:
                    System.out.println("___PLAYLIST___");
                    verPLaylist();
                    break;
                case 2:
                    System.out.println("___ADICIONANDO MÚSICA___");
                    addMusica();
                    break;
                case 3:
                    System.out.println("___REMOVENDO MÚSICA___");
                    verPLaylist();
                    removerMusica();
                    break;
                case 0:
                    System.out.println("___SAINDO...___");
                    return;
                case 4:
                    System.out.println("AAAAAAAAAAAAAA");
                    System.out.println(playlist.get(0).getTitulo());
                    break;
                default:
                    System.out.println("___VALOR INVÁLIDO___ \nEscolha uma das Opções válidas! \n \n");
            }
        }
    }
}
